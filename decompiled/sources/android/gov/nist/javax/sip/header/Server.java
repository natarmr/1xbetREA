package android.gov.nist.javax.sip.header;

import a.hny;
import android.javax.sip.header.ServerHeader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public class Server extends SIPHeader implements ServerHeader {
    private static final long serialVersionUID = -3587764149383342973L;
    protected List productTokens;

    public Server() {
        super("Server");
        this.productTokens = new LinkedList();
    }

    private StringBuilder encodeProduct(StringBuilder sb) {
        ListIterator listIterator = this.productTokens.listIterator();
        while (listIterator.hasNext()) {
            sb.append((String) listIterator.next());
            if (!listIterator.hasNext()) {
                break;
            }
            sb.append('/');
        }
        return sb;
    }

    public void addProductToken(String str) {
        this.productTokens.add(str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return encodeProduct(sb);
    }

    @Override // android.javax.sip.header.ServerHeader
    public ListIterator getProduct() {
        List list = this.productTokens;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.productTokens.listIterator();
    }

    @Override // android.javax.sip.header.ServerHeader
    public void setProduct(List list) {
        if (list != null) {
            this.productTokens = list;
        } else {
            hny.u("JAIN-SIP Exception, UserAgent, setProduct(), the  product parameter is null");
        }
    }
}
