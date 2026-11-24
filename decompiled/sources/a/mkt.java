package a;

import android.location.Geocoder;

/* JADX INFO: loaded from: classes3.dex */
public final class mkt extends w46 {
    public final xak b;
    public final a6u c;
    public final y3v d;
    public final evz e;
    public final i1w0 f;
    public final mne g;
    public final s64 h;
    public final wgu i;
    public final dpc j;
    public final ani0 k;
    public final duj l;
    public final p7m0 m;
    public bby n;

    public mkt(wyu wyuVar, xak xakVar, a6u a6uVar, y3v y3vVar, evz evzVar, i1w0 i1w0Var, mne mneVar, s64 s64Var, wgu wguVar, dpc dpcVar, ani0 ani0Var, duj dujVar) {
        wyuVar.getClass();
        wguVar.getClass();
        this.b = xakVar;
        this.c = a6uVar;
        this.d = y3vVar;
        this.e = evzVar;
        this.f = i1w0Var;
        this.g = mneVar;
        this.h = s64Var;
        this.i = wguVar;
        this.j = dpcVar;
        this.k = ani0Var;
        this.l = dujVar;
        this.m = q7m0.a(new t8h0(!h97.A(wyuVar, uaq0.f35345a)));
    }

    public final void w(double d, double d2, Geocoder geocoder) {
        sac.V(jiu0.a(this), new ikt(this, (byte) 0), null, this.g.b, new jkt(this, d, d2, geocoder, null), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(zje zjeVar) {
        kkt kktVar;
        if (zjeVar instanceof kkt) {
            kktVar = (kkt) zjeVar;
            int i = kktVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kktVar.k = i - Integer.MIN_VALUE;
            } else {
                kktVar = new kkt(this, zjeVar);
            }
        } else {
            kktVar = new kkt(this, zjeVar);
        }
        Object objE = kktVar.i;
        wne wneVar = wne.f39444a;
        int i2 = kktVar.k;
        if (i2 == 0) {
            z1x.P(objE);
            kktVar.k = 1;
            objE = this.c.E(true, kktVar);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
        }
        return nsm0.l((String) objE, this.i.a());
    }
}
