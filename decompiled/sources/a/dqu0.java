package a;

import android.os.Parcelable;
import org.xplatform.cyber.section.api.virtualgamescategories.VirtualGameCategoryParams;

/* JADX INFO: loaded from: classes4.dex */
public final class dqu0 extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public bby A;
    public long B;
    public final n0o0 C;
    public final hzg o;
    public final mne p;
    public final hjd q;
    public final duj r;
    public final ugf0 s;
    public final luu t;
    public final oeg0 u;
    public final vqc v;
    public final ih5 w;
    public final zr1 x;
    public bby y;
    public bby z;

    /* JADX WARN: Illegal instructions before constructor call */
    public dqu0(vzg0 vzg0Var, b6v b6vVar, VirtualGameCategoryParams virtualGameCategoryParams, pru pruVar, hzg hzgVar, mne mneVar, g2v g2vVar, y78 y78Var, hjd hjdVar, ctf0 ctf0Var, duj dujVar, ugf0 ugf0Var, svu svuVar, lbu lbuVar, luu luuVar, r9u r9uVar, oeg0 oeg0Var, vqc vqcVar, ih5 ih5Var, zr1 zr1Var) {
        ctf0Var.getClass();
        r9uVar.getClass();
        oeg0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        yje yjeVar = null;
        super(new co0((Parcelable) virtualGameCategoryParams, pruVar, luuVar, svuVar, lbuVar, r9uVar, (byte) 11), g090VarP, new mlb(ctf0Var, g2vVar, y78Var, (byte) 14), (yzn0) null);
        this.o = hzgVar;
        this.p = mneVar;
        this.q = hjdVar;
        this.r = dujVar;
        this.s = ugf0Var;
        this.t = luuVar;
        this.u = oeg0Var;
        this.v = vqcVar;
        this.w = ih5Var;
        this.x = zr1Var;
        this.C = maz.b(new hot0(b6vVar, virtualGameCategoryParams, this, (byte) 3));
        qjj.W(jiu0.a(this), null, null, new aqu0(this, yjeVar, (byte) 0), 3);
        i3t0.K(this, null, null, new jtr0((Object) this, yjeVar, (byte) 8), 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        dpu0 dpu0Var = (dpu0) obj;
        dpu0Var.getClass();
        super.x(dpu0Var);
        boolean z = dpu0Var instanceof sou0;
        mne mneVar = this.p;
        yje yjeVar = null;
        if (!z) {
            if (!(dpu0Var instanceof cpu0)) {
                t9f.b();
                return;
            }
            cpu0 cpu0Var = (cpu0) dpu0Var;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.B;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.A;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.A = sac.V(jiu0.a(this), new zpu0(this, (byte) 0), null, mneVar.f22085a, new rtq0(cpu0Var, this, yjeVar, (byte) 21), 10);
                this.B = jCurrentTimeMillis;
                return;
            }
            return;
        }
        sou0 sou0Var = (sou0) dpu0Var;
        if (sou0Var.equals(pou0.f27345a)) {
            E();
            return;
        }
        if (sou0Var.equals(qou0.f29086a)) {
            bby bbyVar2 = this.y;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            bby bbyVar3 = this.z;
            if (bbyVar3 != null) {
                e3c.n(bbyVar3);
                return;
            }
            return;
        }
        if (!sou0Var.equals(rou0.f30858a)) {
            t9f.b();
            return;
        }
        bby bbyVar4 = this.y;
        if (bbyVar4 != null) {
            bbyVar4.cancel(null);
        }
        this.y = sac.V(jiu0.a(this), cqu0.f4813a, null, mneVar.f22085a, new bqu0(this, yjeVar, (byte) 1), 10);
        bby bbyVar5 = this.z;
        if (bbyVar5 == null || !bbyVar5.isActive()) {
            this.z = i3t0.F(this, this.q, mneVar.f22085a, null, new b4u0((byte) 17), 118);
        }
    }
}
