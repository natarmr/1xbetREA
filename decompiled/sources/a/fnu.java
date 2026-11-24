package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class fnu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dq00 f9854a;

    public /* synthetic */ fnu(dq00 dq00Var) {
        this.f9854a = dq00Var;
    }

    public nq90 a(int i) throws c44 {
        Object next;
        List list = (List) ((yp90) this.f9854a.b).f43021a.getValue();
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((nq90) next).getId() != i);
            nq90 nq90Var = (nq90) next;
            if (nq90Var != null) {
                return nq90Var;
            }
        }
        throw new c44((byte) 9);
    }

    public void b(String str) {
        ((imb) this.f9854a.c).f15016a.o(null, StringsKt.d0("+", str));
    }

    public void c(String str, List list) {
        str.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qkt qktVar = (qkt) it.next();
            qktVar.getClass();
            int i = qktVar.f28902a;
            boolean z = qktVar.g;
            String str2 = qktVar.b;
            String strK = kng0.k(str, qktVar.f);
            arrayList.add(new gq90(i, qktVar.e, qktVar.h, str2, strK, qktVar.c, qktVar.d, z));
        }
        this.f9854a.k(arrayList);
    }
}
