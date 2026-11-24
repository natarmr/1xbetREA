package android.javax.sip.header;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface Parameters {
    String getParameter(String str);

    Iterator getParameterNames();

    void removeParameter(String str);

    void setParameter(String str, String str2);
}
