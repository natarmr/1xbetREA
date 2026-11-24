package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class but {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final scu f3250a;
    public final gmt b;
    public final ipu c;
    public final ntu d;

    public but(scu scuVar, gmt gmtVar, ipu ipuVar, ntu ntuVar) {
        scuVar.getClass();
        gmtVar.getClass();
        ipuVar.getClass();
        this.f3250a = scuVar;
        this.b = gmtVar;
        this.c = ipuVar;
        this.d = ntuVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a6 A[LOOP:0: B:31:0x00a0->B:33:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final Object a(long j, zje zjeVar) {
        aut autVar;
        ql5 ql5VarA;
        boolean z;
        ?? r9;
        ?? r8;
        ArrayList arrayList;
        Iterator it;
        if (zjeVar instanceof aut) {
            autVar = (aut) zjeVar;
            int i = autVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                autVar.p = i - Integer.MIN_VALUE;
            } else {
                autVar = new aut(this, zjeVar);
            }
        } else {
            autVar = new aut(this, zjeVar);
        }
        Object objA = autVar.n;
        wne wneVar = wne.f39444a;
        int i2 = autVar.p;
        boolean z2 = false;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.d.a();
            ql5VarA = this.b.a();
            autVar.j = ql5VarA;
            autVar.i = j;
            autVar.p = 1;
            objA = this.f3250a.a(j, autVar, strA);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            j = autVar.i;
            ql5VarA = autVar.j;
            z1x.P(objA);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = autVar.m;
            int i4 = autVar.l;
            z = autVar.k;
            z1x.P(objA);
            r8 = i3;
            r9 = i4;
        }
        Iterable iterable = (Iterable) objA;
        arrayList = new ArrayList(r3d.q(iterable, 10));
        it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((tq60) it.next()).b);
        }
        if (((!z && r8 == 0) || r9 != 0) && arrayList.contains(d270.BONUS)) {
        }
        return Boolean.valueOf(z2);
        boolean z3 = ((pbv) objA).h;
        ?? D = ql5VarA != null ? ql5VarA.i.d() : 0;
        ?? B = ql5VarA != null ? ql5VarA.i.b() : 0;
        autVar.j = null;
        autVar.i = j;
        autVar.k = z3;
        autVar.l = D;
        autVar.m = B;
        autVar.p = 2;
        Object objA2 = this.c.a(autVar);
        if (objA2 != wneVar) {
            z = z3;
            r9 = D;
            objA = objA2;
            r8 = B;
            Iterable iterable2 = (Iterable) objA;
            arrayList = new ArrayList(r3d.q(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList.add(((tq60) it.next()).b);
            }
            z2 = !z ? true : true;
            return Boolean.valueOf(z2);
        }
        return wneVar;
    }
}
