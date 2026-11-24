package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gdu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mii0 f11119a;

    public /* synthetic */ gdu(mii0 mii0Var) {
        this.f11119a = mii0Var;
    }

    public List a(int i) {
        Object next;
        gs6 gs6Var = (gs6) this.f11119a.c;
        Iterator it = gs6Var.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((vil0) next).f37485a != i);
        vil0 vil0Var = (vil0) next;
        if (vil0Var == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = gs6Var.f11814a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((mms) obj).b == vil0Var.b) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
