package android.gov.nist.javax.sip.header;

import a.hny;
import android.javax.sip.header.UserAgentHeader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public class UserAgent extends SIPHeader implements UserAgentHeader {
    private static final long serialVersionUID = 4561239179796364295L;
    protected List productTokens;

    public UserAgent() {
        super("User-Agent");
        this.productTokens = new LinkedList();
    }

    private StringBuilder encodeProduct(StringBuilder sb) {
        ListIterator listIterator = this.productTokens.listIterator();
        while (listIterator.hasNext()) {
            sb.append((String) listIterator.next());
        }
        return sb;
    }

    public void addProductToken(String str) {
        this.productTokens.add(str);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        UserAgent userAgent = (UserAgent) super.clone();
        if (this.productTokens != null) {
            userAgent.productTokens = new LinkedList(this.productTokens);
        }
        return userAgent;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return encodeProduct(sb);
    }

    @Override // android.javax.sip.header.UserAgentHeader
    public ListIterator getProduct() {
        List list = this.productTokens;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.productTokens.listIterator();
    }

    @Override // android.javax.sip.header.UserAgentHeader
    public void setProduct(List list) {
        if (list != null) {
            this.productTokens = list;
        } else {
            hny.u("JAIN-SIP Exception, UserAgent, setProduct(), the  product parameter is null");
        }
    }
}
