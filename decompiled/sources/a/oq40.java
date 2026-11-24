package a;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oq40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final htz f25670a = new htz();

    public static void a(gxu gxuVar) {
        hbb hbbVar;
        ArrayList arrayList = new ArrayList();
        mq40 mq40Var = mq40.b;
        Iterator it = ((ConcurrentMap) gxuVar.f12096a).values().iterator();
        while (it.hasNext()) {
            for (fwb0 fwb0Var : (List) it.next()) {
                int iOrdinal = fwb0Var.d.ordinal();
                if (iOrdinal == 1) {
                    hbbVar = hbb.f;
                } else if (iOrdinal == 2) {
                    hbbVar = hbb.g;
                } else {
                    if (iOrdinal != 3) {
                        jf4.n("Unknown key status");
                        return;
                    }
                    hbbVar = hbb.h;
                }
                int i = fwb0Var.f;
                String strSubstring = fwb0Var.g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new nq40(hbbVar, i, strSubstring, fwb0Var.e.name()));
            }
        }
        fwb0 fwb0Var2 = (fwb0) gxuVar.b;
        Integer numValueOf = fwb0Var2 != null ? Integer.valueOf(fwb0Var2.f) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((nq40) it2.next()).b == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                itt0.o(e);
                return;
            }
        }
        Collections.unmodifiableList(arrayList);
    }
}
