// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._CatalogNode;
import ms.ws._CatalogNodeDependency;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _CatalogNode
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String fullPath;
    protected boolean _default;
    protected String resourceIdentifier;
    protected String parentPath;
    protected String childItem;
    protected boolean nodeDependenciesIncluded;
    protected int ctype;
    protected boolean matchedQuery;

    // Elements
    protected _CatalogNodeDependency[] nodeDependencies;

    public _CatalogNode()
    {
        super();
    }

    public _CatalogNode(
        final String fullPath,
        final boolean _default,
        final String resourceIdentifier,
        final String parentPath,
        final String childItem,
        final boolean nodeDependenciesIncluded,
        final int ctype,
        final boolean matchedQuery,
        final _CatalogNodeDependency[] nodeDependencies)
    {
        // TODO : Call super() instead of setting all fields directly?
        setFullPath(fullPath);
        set_default(_default);
        setResourceIdentifier(resourceIdentifier);
        setParentPath(parentPath);
        setChildItem(childItem);
        setNodeDependenciesIncluded(nodeDependenciesIncluded);
        setCtype(ctype);
        setMatchedQuery(matchedQuery);
        setNodeDependencies(nodeDependencies);
    }

    public String getFullPath()
    {
        return this.fullPath;
    }

    public void setFullPath(final String value)
    {
        this.fullPath = value;
    }

    public boolean is_default()
    {
        return this._default;
    }

    public void set_default(final boolean value)
    {
        this._default = value;
    }

    public String getResourceIdentifier()
    {
        return this.resourceIdentifier;
    }

    public void setResourceIdentifier(final String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException(
                    "'ResourceIdentifier' is a required attribute, its value cannot be null");
        }

        this.resourceIdentifier = value;
    }

    public String getParentPath()
    {
        return this.parentPath;
    }

    public void setParentPath(final String value)
    {
        this.parentPath = value;
    }

    public String getChildItem()
    {
        return this.childItem;
    }

    public void setChildItem(final String value)
    {
        this.childItem = value;
    }

    public boolean isNodeDependenciesIncluded()
    {
        return this.nodeDependenciesIncluded;
    }

    public void setNodeDependenciesIncluded(final boolean value)
    {
        this.nodeDependenciesIncluded = value;
    }

    public int getCtype()
    {
        return this.ctype;
    }

    public void setCtype(final int value)
    {
        this.ctype = value;
    }

    public boolean isMatchedQuery()
    {
        return this.matchedQuery;
    }

    public void setMatchedQuery(final boolean value)
    {
        this.matchedQuery = value;
    }

    public _CatalogNodeDependency[] getNodeDependencies()
    {
        return this.nodeDependencies;
    }

    public void setNodeDependencies(_CatalogNodeDependency[] value)
    {
        this.nodeDependencies = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "FullPath",
            this.fullPath);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "default",
            this._default);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ResourceIdentifier",
            this.resourceIdentifier);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ParentPath",
            this.parentPath);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ChildItem",
            this.childItem);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "NodeDependenciesIncluded",
            this.nodeDependenciesIncluded);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ctype",
            this.ctype);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "MatchedQuery",
            this.matchedQuery);

        // Elements
        if (this.nodeDependencies != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("NodeDependencies");

            for (int iterator0 = 0; iterator0 < this.nodeDependencies.length; iterator0++)
            {
                this.nodeDependencies[iterator0].writeAsElement(
                    writer,
                    "CatalogNodeDependency");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("FullPath"))
            {
                this.fullPath = attributeValue;
            }
            else if (localName.equalsIgnoreCase("default"))
            {
                this._default = XMLConvert.toBoolean(attributeValue);
            }
            else if (localName.equalsIgnoreCase("ResourceIdentifier"))
            {
                this.resourceIdentifier = attributeValue;
            }
            else if (localName.equalsIgnoreCase("ParentPath"))
            {
                this.parentPath = attributeValue;
            }
            else if (localName.equalsIgnoreCase("ChildItem"))
            {
                this.childItem = attributeValue;
            }
            else if (localName.equalsIgnoreCase("NodeDependenciesIncluded"))
            {
                this.nodeDependenciesIncluded = XMLConvert.toBoolean(attributeValue);
            }
            else if (localName.equalsIgnoreCase("ctype"))
            {
                this.ctype = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("MatchedQuery"))
            {
                this.matchedQuery = XMLConvert.toBoolean(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("NodeDependencies"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _CatalogNodeDependency complexObject0 = new _CatalogNodeDependency();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.nodeDependencies = (_CatalogNodeDependency[]) list0.toArray(
                                new _CatalogNodeDependency[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
