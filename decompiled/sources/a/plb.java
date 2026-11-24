package a;

import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xplatform.ufc.api.championship.UfcChampionshipParams;

/* JADX INFO: loaded from: classes4.dex */
public final class plb extends i3t0 {
    public static final /* synthetic */ int I = 0;
    public final gle0 A;
    public bby B;
    public bby C;
    public bby D;
    public bby E;
    public bby F;
    public bby G;
    public c4m0 H;
    public final i1w0 o;
    public final xzp p;
    public final xfu q;
    public final hnu r;
    public final x0u s;
    public final m1e t;
    public final hjd u;
    public final rus v;
    public final mne w;
    public final vjp x;
    public final kys0 y;
    public final uxs0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public plb(UfcChampionshipParams ufcChampionshipParams, i1w0 i1w0Var, xzp xzpVar, xfu xfuVar, hnu hnuVar, g2v g2vVar, ctf0 ctf0Var, x0u x0uVar, m1e m1eVar, hjd hjdVar, rus rusVar, mne mneVar, luu luuVar, y78 y78Var, svu svuVar, r9u r9uVar, lbu lbuVar, pru pruVar, wiu wiuVar, vjp vjpVar, kys0 kys0Var, uxs0 uxs0Var, gle0 gle0Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        super(new pg1((Parcelable) ufcChampionshipParams, luuVar, lbuVar, pruVar, svuVar, wiuVar, r9uVar, (byte) 6), g090VarP, new mlb(g2vVar, ctf0Var, y78Var, (byte) 0), (yzn0) null);
        this.o = i1w0Var;
        this.p = xzpVar;
        this.q = xfuVar;
        this.r = hnuVar;
        this.s = x0uVar;
        this.t = m1eVar;
        this.u = hjdVar;
        this.v = rusVar;
        this.w = mneVar;
        this.x = vjpVar;
        this.y = kys0Var;
        this.z = uxs0Var;
        this.A = gle0Var;
        i3t0.K(this, null, null, new pn(this, null, (byte) 16), 3);
    }

    public final void M(boolean z) {
        e3c.n(this.H);
        this.H = i3t0.L(this, new fnq(i120.W(this.t.b()), new u88((Object) this, z, (yje) null, (byte) 3), (byte) 4), null, null, 3);
    }

    public final Long N(jkb jkbVar) {
        d0t d0tVar;
        if (jkbVar != null && (d0tVar = (d0t) CollectionsKt.firstOrNull(kkb.G(jkbVar))) != null) {
            long j = d0tVar.L;
            Long lValueOf = Long.valueOf(j);
            if (j <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                return lValueOf;
            }
        }
        j0g0 j0g0Var = ((alb) D()).l;
        if (j0g0Var != null) {
            Object obj = j0g0Var.f15681a;
            if (obj instanceof g0g0) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    long jE = ((d2w) it.next()).e();
                    Long lValueOf2 = Long.valueOf(jE);
                    if (jE <= 0) {
                        lValueOf2 = null;
                    }
                    if (lValueOf2 != null) {
                        return lValueOf2;
                    }
                }
            }
        }
        return null;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        plb plbVar;
        ojb ojbVar = (ojb) obj;
        ojbVar.getClass();
        super.x(ojbVar);
        if (!(ojbVar instanceof ejb)) {
            if (!(ojbVar instanceof njb)) {
                t9f.b();
                return;
            }
            njb njbVar = (njb) ojbVar;
            long jCurrentTimeMillis = System.currentTimeMillis();
            ymx ymxVar = ymx.INTERVAL_100;
            if (jCurrentTimeMillis > 200) {
                bby bbyVar = this.B;
                yje yjeVar = null;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.B = i3t0.K(this, null, null, new r72(njbVar, this, yjeVar, (byte) 7), 3);
                return;
            }
            return;
        }
        ejb ejbVar = (ejb) ojbVar;
        if (ejbVar.equals(bjb.f2697a)) {
            E();
            return;
        }
        if (ejbVar.equals(cjb.f4452a)) {
            e3c.n(this.H);
            e3c.n(this.E);
            e3c.n(this.C);
            e3c.n(this.D);
            bby bbyVar2 = this.F;
            if (bbyVar2 != null) {
                e3c.n(bbyVar2);
            }
            bby bbyVar3 = this.G;
            if (bbyVar3 != null) {
                e3c.n(bbyVar3);
                return;
            }
            return;
        }
        if (!ejbVar.equals(djb.f6176a)) {
            t9f.b();
            return;
        }
        M(false);
        bby bbyVar4 = this.C;
        if (bbyVar4 == null || !bbyVar4.isActive()) {
            plbVar = this;
            plbVar.C = i3t0.F(plbVar, this.u, this.w.f22085a, null, new pua((byte) 22), 118);
        } else {
            plbVar = this;
        }
        bby bbyVar5 = plbVar.D;
        if (bbyVar5 == null || !bbyVar5.isActive()) {
            plbVar.D = i3t0.F(plbVar, plbVar.v, null, null, new pua((byte) 23), 119);
        }
    }
}
