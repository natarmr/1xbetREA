package android.gov.nist.javax.sip.header;

import android.gov.nist.core.HostPort;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.javax.sip.header.ReplyToHeader;

/* JADX INFO: loaded from: classes.dex */
public final class ReplyTo extends AddressParametersHeader implements ReplyToHeader {
    private static final long serialVersionUID = -9103698729465531373L;

    public ReplyTo(AddressImpl addressImpl) {
        super("Reply-To");
        this.address = addressImpl;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return this.headerName + ": " + encodeBody(new StringBuilder()).toString() + Separators.NEWLINE;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        if (this.address.getAddressType() == 2) {
            sb.append(Separators.LESS_THAN);
        }
        this.address.encode(sb);
        if (this.address.getAddressType() == 2) {
            sb.append(Separators.GREATER_THAN);
        }
        if (!this.parameters.isEmpty()) {
            sb.append(Separators.SEMICOLON);
            this.parameters.encode(sb);
        }
        return sb;
    }

    public String getDisplayName() {
        return this.address.getDisplayName();
    }

    public HostPort getHostPort() {
        return this.address.getHostPort();
    }

    public ReplyTo() {
        super("Reply-To");
    }
}
