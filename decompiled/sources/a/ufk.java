package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ufk extends w2 {
    public final g45 l;
    public final f4d0 m;
    public final vek n;

    /* JADX WARN: Illegal instructions before constructor call */
    public ufk(g45 g45Var, f4d0 f4d0Var, int i) {
        t3u0 t3u0Var;
        f6i f6iVar = (f6i) g45Var.f10647a;
        eu00 eu00Var = (eu00) f6iVar.e;
        vjj vjjVar = (vjj) g45Var.c;
        f93 f93Var = ujn.c;
        g950 g950VarL = ydx.L((h950) g45Var.b, f4d0Var.e);
        e4d0 e4d0Var = f4d0Var.g;
        e4d0Var.getClass();
        int iOrdinal = e4d0Var.ordinal();
        if (iOrdinal == 0) {
            t3u0Var = t3u0.d;
        } else if (iOrdinal == 1) {
            t3u0Var = t3u0.e;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                throw null;
            }
            t3u0Var = t3u0.c;
        }
        t3u0 t3u0Var2 = t3u0Var;
        boolean z = f4d0Var.f;
        if (eu00Var == null) {
            w2.k0(0);
            throw null;
        }
        if (vjjVar == null) {
            w2.k0(1);
            throw null;
        }
        super(i, f93Var, vjjVar, eu00Var, g950VarL, t3u0Var2, z);
        this.l = g45Var;
        this.m = f4d0Var;
        this.n = new vek((eu00) f6iVar.e, new v9k(this, (byte) 14));
    }

    @Override // a.p4, a.e83
    public final g93 getAnnotations() {
        return this.n;
    }

    @Override // a.t5
    public final List q1() {
        g45 g45Var = this.l;
        List listC0 = m8x.C0(this.m, (roi0) g45Var.d);
        if (listC0.isEmpty()) {
            int i = rek.f30339a;
            ym40 ym40VarC = oek.c(this);
            ym40VarC.getClass();
            return kotlin.collections.a.c(ym40VarC.c().n());
        }
        qgd qgdVar = (qgd) g45Var.h;
        ArrayList arrayList = new ArrayList(r3d.q(listC0, 10));
        Iterator it = listC0.iterator();
        while (it.hasNext()) {
            arrayList.add(qgdVar.d0((a4d0) it.next()));
        }
        return arrayList;
    }
}
