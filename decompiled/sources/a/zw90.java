package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zw90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9t f45095a;
    public final pbt b;
    public final gst0 c;

    public zw90(w9t w9tVar, pbt pbtVar, eqs eqsVar, gst0 gst0Var) {
        this.f45095a = w9tVar;
        this.b = pbtVar;
        this.c = gst0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(String str, zje zjeVar) {
        yw90 yw90Var;
        String str2;
        double d;
        String str3;
        s9t s9tVar;
        if (zjeVar instanceof yw90) {
            yw90Var = (yw90) zjeVar;
            int i = yw90Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                yw90Var.n = i - Integer.MIN_VALUE;
            } else {
                yw90Var = new yw90(this, zjeVar);
            }
        } else {
            yw90Var = new yw90(this, zjeVar);
        }
        yw90 yw90Var2 = yw90Var;
        Object obj = yw90Var2.l;
        wne wneVar = wne.f39444a;
        int i2 = yw90Var2.n;
        pbt pbtVar = this.b;
        if (i2 != 0) {
            if (i2 == 1) {
                d = yw90Var2.k;
                String str4 = yw90Var2.i;
                z1x.P(obj);
                str2 = str4;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s9tVar = yw90Var2.j;
                z1x.P(obj);
            }
            str3 = ((pbv) obj).c;
            return new d8t(str3, s9tVar);
        }
        z1x.P(obj);
        j5t j5tVar = pbtVar.f26724a;
        ql5 ql5Var = j5tVar.q;
        if (ql5Var == null) {
            throw new ss3();
        }
        csr csrVar = j5tVar.p;
        double d2 = j5tVar.o;
        long j = ql5Var.f28916a;
        yw90Var2.i = str;
        yw90Var2.k = d2;
        yw90Var2.n = 1;
        Object objB = this.f45095a.b(d2, j, yw90Var2, csrVar);
        yw90Var2 = yw90Var2;
        if (objB != wneVar) {
            str2 = str;
            obj = objB;
            d = d2;
        }
        return wneVar;
        s9t s9tVar2 = (s9t) obj;
        int i3 = ((n9t) CollectionsKt.d0(s9tVar2.e)).f23156a;
        List list = ((n9t) CollectionsKt.d0(s9tVar2.e)).h.b;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Integer(((r9b) it.next()).c));
        }
        long jIntValue = ((Number) arrayList.get(i3 - 1)).intValue();
        a570.Companion.getClass();
        if (jIntValue > 0) {
            boolean zA = this.c.a();
            yw90Var2.i = null;
            yw90Var2.j = s9tVar2;
            yw90Var2.k = d;
            yw90Var2.n = 2;
            Object objH = pbtVar.h(jIntValue, yw90Var2, str2, zA);
            if (objH != wneVar) {
                obj = objH;
                s9tVar = s9tVar2;
                str3 = ((pbv) obj).c;
            }
            return wneVar;
        }
        str3 = "";
        s9tVar = s9tVar2;
        return new d8t(str3, s9tVar);
    }
}
