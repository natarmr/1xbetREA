package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class j6v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3v0 f16008a;
    public final scu b;
    public final ntu c;
    public final ipu d;

    public j6v(h3v0 h3v0Var, scu scuVar, ntu ntuVar, ipu ipuVar) {
        h3v0Var.getClass();
        this.f16008a = h3v0Var;
        this.b = scuVar;
        this.c = ntuVar;
        this.d = ipuVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009b A[LOOP:0: B:30:0x0095->B:32:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ql5 ql5Var, zje zjeVar) {
        i6v i6vVar;
        boolean z;
        int i;
        ArrayList arrayList;
        Iterator it;
        if (zjeVar instanceof i6v) {
            i6vVar = (i6v) zjeVar;
            int i2 = i6vVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i6vVar.n = i2 - Integer.MIN_VALUE;
            } else {
                i6vVar = new i6v(this, zjeVar);
            }
        } else {
            i6vVar = new i6v(this, zjeVar);
        }
        Object objA = i6vVar.l;
        wne wneVar = wne.f39444a;
        int i3 = i6vVar.n;
        boolean z2 = false;
        if (i3 == 0) {
            z1x.P(objA);
            long j = this.f16008a.b.f31523a;
            String strA = this.c.a();
            i6vVar.i = ql5Var;
            i6vVar.n = 1;
            objA = this.b.a(j, i6vVar, strA);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            ql5Var = i6vVar.i;
            z1x.P(objA);
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = i6vVar.k;
            i = i6vVar.j;
            z1x.P(objA);
        }
        Iterable iterable = (Iterable) objA;
        arrayList = new ArrayList(r3d.q(iterable, 10));
        it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((tq60) it.next()).b);
        }
        boolean zContains = arrayList.contains(d270.BONUS);
        if (i == 0 && !z && zContains) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
        int i4 = (((pbv) objA).h || ql5Var.i.d()) ? 0 : 1;
        boolean zA = ql5Var.i.a();
        i6vVar.i = null;
        i6vVar.j = i4;
        i6vVar.k = zA;
        i6vVar.n = 2;
        Object objA2 = this.d.a(i6vVar);
        if (objA2 != wneVar) {
            int i5 = i4;
            objA = objA2;
            z = zA;
            i = i5;
            Iterable iterable2 = (Iterable) objA;
            arrayList = new ArrayList(r3d.q(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList.add(((tq60) it.next()).b);
            }
            boolean zContains2 = arrayList.contains(d270.BONUS);
            if (i == 0) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
        return wneVar;
    }
}
