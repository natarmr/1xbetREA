package android.javax.sip.header;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public interface ServerHeader extends Header {
    public static final String NAME = "Server";

    ListIterator getProduct();

    void setProduct(List list);
}
