package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class j9s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mne f16155a;
    public final btt0 b;
    public final zas0 c;
    public final r9s0 d;
    public final knf0 e;

    public j9s0(mne mneVar, btt0 btt0Var, zas0 zas0Var, r9s0 r9s0Var, knf0 knf0Var) {
        btt0Var.getClass();
        r9s0Var.getClass();
        knf0Var.getClass();
        this.f16155a = mneVar;
        this.b = btt0Var;
        this.c = zas0Var;
        this.d = r9s0Var;
        this.e = knf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Serializable a(long j, int i, int i2, boolean z, zje zjeVar) {
        f9s0 f9s0Var;
        if (zjeVar instanceof f9s0) {
            f9s0Var = (f9s0) zjeVar;
            int i3 = f9s0Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f9s0Var.k = i3 - Integer.MIN_VALUE;
            } else {
                f9s0Var = new f9s0(this, zjeVar);
            }
        } else {
            f9s0Var = new f9s0(this, zjeVar);
        }
        f9s0 f9s0Var2 = f9s0Var;
        Object objC = f9s0Var2.i;
        wne wneVar = wne.f39444a;
        int i4 = f9s0Var2.k;
        ArrayList arrayList = null;
        if (i4 == 0) {
            z1x.P(objC);
            String strC = this.e.c();
            String strA = this.b.a();
            f9s0Var2.k = 1;
            objC = ((b9s0) ((lkr0) this.c.b).invoke()).c(strA, j, strC, 22, 1, i, i2, z, new fk9(false), f9s0Var2);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        List list = ((r9g0) ((dx5) objC).a()).f30080a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(x0x.g0((r2g0) it.next()));
            }
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(long j, zje zjeVar) {
        g9s0 g9s0Var;
        if (zjeVar instanceof g9s0) {
            g9s0Var = (g9s0) zjeVar;
            int i = g9s0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                g9s0Var.k = i - Integer.MIN_VALUE;
            } else {
                g9s0Var = new g9s0(this, zjeVar);
            }
        } else {
            g9s0Var = new g9s0(this, zjeVar);
        }
        g9s0 g9s0Var2 = g9s0Var;
        Object objA = g9s0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = g9s0Var2.k;
        if (i2 == 0) {
            z1x.P(objA);
            knf0 knf0Var = this.e;
            knf0Var.getClass();
            String strC = knf0Var.c();
            String strA = this.b.a();
            g9s0Var2.k = 1;
            objA = ((b9s0) ((lkr0) this.c.b).invoke()).a(strA, String.valueOf(j), 22, strC, new fk9(false), g9s0Var2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List list = ((v9s0) ((dx5) objA).a()).f37050a;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(yum0.o((z2s0) it.next()));
        }
        return (w2s0) CollectionsKt.firstOrNull(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Serializable c(long j, int i, int i2, int i3, boolean z, zje zjeVar) {
        h9s0 h9s0Var;
        if (zjeVar instanceof h9s0) {
            h9s0Var = (h9s0) zjeVar;
            int i4 = h9s0Var.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                h9s0Var.k = i4 - Integer.MIN_VALUE;
            } else {
                h9s0Var = new h9s0(this, zjeVar);
            }
        } else {
            h9s0Var = new h9s0(this, zjeVar);
        }
        h9s0 h9s0Var2 = h9s0Var;
        Object objB = h9s0Var2.i;
        wne wneVar = wne.f39444a;
        int i5 = h9s0Var2.k;
        ArrayList arrayList = null;
        if (i5 == 0) {
            z1x.P(objB);
            String strC = this.e.c();
            h9s0Var2.k = 1;
            objB = ((b9s0) ((lkr0) this.c.b).invoke()).b(j, strC, 22, 1, i, i2, i3, z, new fk9(false), h9s0Var2);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i5 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        List list = ((r9g0) ((dx5) objB).a()).f30080a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(x0x.g0((r2g0) it.next()));
            }
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }
}
