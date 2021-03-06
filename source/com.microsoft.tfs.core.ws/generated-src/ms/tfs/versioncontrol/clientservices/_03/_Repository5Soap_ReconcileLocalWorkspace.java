// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._LocalPendingChange;
import ms.tfs.versioncontrol.clientservices._03._Repository5Soap_ReconcileLocalWorkspace;
import ms.tfs.versioncontrol.clientservices._03._ServerItemLocalVersionUpdate;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _Repository5Soap_ReconcileLocalWorkspace
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String workspaceName;
    protected String ownerName;
    protected String pendingChangeSignature;
    protected _LocalPendingChange[] pendingChanges;
    protected _ServerItemLocalVersionUpdate[] localVersionUpdates;
    protected boolean clearLocalVersionTable;
    protected boolean throwOnProjectRenamed;
    protected int maxClientPathLength;

    public _Repository5Soap_ReconcileLocalWorkspace()
    {
        super();
    }

    public _Repository5Soap_ReconcileLocalWorkspace(
        final String workspaceName,
        final String ownerName,
        final String pendingChangeSignature,
        final _LocalPendingChange[] pendingChanges,
        final _ServerItemLocalVersionUpdate[] localVersionUpdates,
        final boolean clearLocalVersionTable,
        final boolean throwOnProjectRenamed,
        final int maxClientPathLength)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkspaceName(workspaceName);
        setOwnerName(ownerName);
        setPendingChangeSignature(pendingChangeSignature);
        setPendingChanges(pendingChanges);
        setLocalVersionUpdates(localVersionUpdates);
        setClearLocalVersionTable(clearLocalVersionTable);
        setThrowOnProjectRenamed(throwOnProjectRenamed);
        setMaxClientPathLength(maxClientPathLength);
    }

    public String getWorkspaceName()
    {
        return this.workspaceName;
    }

    public void setWorkspaceName(String value)
    {
        this.workspaceName = value;
    }

    public String getOwnerName()
    {
        return this.ownerName;
    }

    public void setOwnerName(String value)
    {
        this.ownerName = value;
    }

    public String getPendingChangeSignature()
    {
        return this.pendingChangeSignature;
    }

    public void setPendingChangeSignature(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException(
                    "'pendingChangeSignature' is a required element, its value cannot be null");
        }

        this.pendingChangeSignature = value;
    }

    public _LocalPendingChange[] getPendingChanges()
    {
        return this.pendingChanges;
    }

    public void setPendingChanges(_LocalPendingChange[] value)
    {
        this.pendingChanges = value;
    }

    public _ServerItemLocalVersionUpdate[] getLocalVersionUpdates()
    {
        return this.localVersionUpdates;
    }

    public void setLocalVersionUpdates(_ServerItemLocalVersionUpdate[] value)
    {
        this.localVersionUpdates = value;
    }

    public boolean isClearLocalVersionTable()
    {
        return this.clearLocalVersionTable;
    }

    public void setClearLocalVersionTable(boolean value)
    {
        this.clearLocalVersionTable = value;
    }

    public boolean isThrowOnProjectRenamed()
    {
        return this.throwOnProjectRenamed;
    }

    public void setThrowOnProjectRenamed(boolean value)
    {
        this.throwOnProjectRenamed = value;
    }

    public int getMaxClientPathLength()
    {
        return this.maxClientPathLength;
    }

    public void setMaxClientPathLength(int value)
    {
        this.maxClientPathLength = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "workspaceName",
            this.workspaceName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "ownerName",
            this.ownerName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "pendingChangeSignature",
            this.pendingChangeSignature);

        if (this.pendingChanges != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("pendingChanges");

            for (int iterator0 = 0; iterator0 < this.pendingChanges.length; iterator0++)
            {
                this.pendingChanges[iterator0].writeAsElement(
                    writer,
                    "LocalPendingChange");
            }

            writer.writeEndElement();
        }

        if (this.localVersionUpdates != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("localVersionUpdates");

            for (int iterator0 = 0; iterator0 < this.localVersionUpdates.length; iterator0++)
            {
                this.localVersionUpdates[iterator0].writeAsElement(
                    writer,
                    "ServerItemLocalVersionUpdate");
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "clearLocalVersionTable",
            this.clearLocalVersionTable);
        XMLStreamWriterHelper.writeElement(
            writer,
            "throwOnProjectRenamed",
            this.throwOnProjectRenamed);
        XMLStreamWriterHelper.writeElement(
            writer,
            "maxClientPathLength",
            this.maxClientPathLength);

        writer.writeEndElement();
    }
}
