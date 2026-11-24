package a;

import java.net.UnknownHostException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class lyc0 extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public bby A;
    public bby B;
    public final bby C;
    public final ArrayList D;
    public final tac0 o;
    public final epu p;
    public final cpu q;
    public final wou r;
    public final fhj s;
    public final sou t;
    public final mne u;
    public final duj v;
    public final ctf0 w;
    public final ntu x;
    public final iqt y;
    public final wtt z;

    public lyc0(vzg0 vzg0Var, tac0 tac0Var, epu epuVar, cpu cpuVar, wou wouVar, fhj fhjVar, sou souVar, mne mneVar, duj dujVar, ctf0 ctf0Var, ntu ntuVar, yfu yfuVar, iqt iqtVar, pru pruVar, wtt wttVar, i1w0 i1w0Var, qho qhoVar) {
        dvj dvjVar;
        epuVar.getClass();
        cpuVar.getClass();
        wouVar.getClass();
        souVar.getClass();
        ctf0Var.getClass();
        i1w0Var.getClass();
        ck60 ck60Var = new ck60(pruVar, ctf0Var, qhoVar, (byte) 13);
        zlb0 zlb0Var = new zlb0(pruVar, ctf0Var, yfuVar, (byte) 6);
        rwj rwjVar = mneVar.f22085a;
        dvj dvjVar2 = mneVar.b;
        super(null, ck60Var, zlb0Var, cvm0.p(rwjVar, dvjVar2), null);
        this.o = tac0Var;
        this.p = epuVar;
        this.q = cpuVar;
        this.r = wouVar;
        this.s = fhjVar;
        this.t = souVar;
        this.u = mneVar;
        this.v = dujVar;
        this.w = ctf0Var;
        this.x = ntuVar;
        this.y = iqtVar;
        this.z = wttVar;
        this.D = new ArrayList();
        tac0Var.f7878a = this;
        tac0Var.b = vzg0Var;
        bby bbyVar = this.A;
        yje yjeVar = null;
        byte b = 1;
        if ((bbyVar == null || !bbyVar.isActive()) && ((mmc0) D()).b) {
            dvjVar = dvjVar2;
            this.A = sac.i0(jiu0.a(this), "PromoWithGamesViewModel.loadBannerData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new kyc0(this, yjeVar, (byte) 0), null, dvjVar2, new iyc0(this, (byte) 1), null, 592);
        } else {
            dvjVar = dvjVar2;
        }
        M();
        bby bbyVar2 = this.C;
        if (bbyVar2 == null || !bbyVar2.isActive()) {
            this.C = sac.i0(jiu0.a(this), "PromoWithGamesViewModel.loadMenuData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new kyc0(this, yjeVar, b), null, dvjVar, new iyc0(this, (byte) 2), null, 592);
        }
    }

    public final void M() {
        bby bbyVar = this.B;
        if ((bbyVar == null || !bbyVar.isActive()) && ((mmc0) D()).c) {
            this.B = sac.i0(jiu0.a(this), "PromoWithGamesViewModel.loadGamesData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new a220(this, null, (byte) 13), null, this.u.b, new iyc0(this, (byte) 0), null, 592);
        }
    }

    @Override // a.diu0
    public final void v() {
        this.o.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        dmc0 dmc0Var = (dmc0) obj;
        dmc0Var.getClass();
        super.x(dmc0Var);
        Object obj2 = null;
        Object[] objArr = 0;
        if (dmc0Var instanceof bmc0) {
            bby bbyVar = this.A;
            if ((bbyVar == null || !bbyVar.isActive()) && ((mmc0) D()).b) {
                this.A = sac.i0(jiu0.a(this), "PromoWithGamesViewModel.updateBannerData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new kyc0(this, objArr == true ? 1 : 0, (byte) 2), null, this.u.b, null, null, 848);
                return;
            }
            return;
        }
        if (dmc0Var instanceof cmc0) {
            v3c.N(this.A);
            v3c.N(this.B);
            v3c.N(this.C);
            return;
        }
        boolean z = dmc0Var instanceof vlc0;
        tac0 tac0Var = this.o;
        if (z) {
            tac0Var.x();
            return;
        }
        if (dmc0Var instanceof wlc0) {
            tac0Var.B();
            return;
        }
        if (dmc0Var instanceof xlc0) {
            wim wimVar = ((xlc0) dmc0Var).f41066a;
            for (Object obj3 : this.D) {
                if (((pe8) obj3).f26839a == wimVar.f39221a) {
                    obj2 = obj3;
                    break;
                }
            }
            pe8 pe8Var = (pe8) obj2;
            if (pe8Var == null) {
                return;
            }
            tac0Var.z(qjj.c0(pe8Var));
            return;
        }
        if (dmc0Var instanceof ylc0) {
            tac0Var.y();
            return;
        }
        if (!(dmc0Var instanceof amc0)) {
            if (dmc0Var instanceof zlc0) {
                M();
                return;
            } else if (dmc0Var instanceof ulc0) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        rnc0 rnc0Var = ((amc0) dmc0Var).f1101a;
        zuc0 zuc0Var = rnc0Var.b;
        gtc0 gtc0Var = rnc0Var.f30783a;
        rnc0Var.d.getClass();
        gtc0Var.c.getClass();
        gtc0Var.a(zuc0Var);
        tac0Var.getClass();
        tac0Var.v(gtc0Var);
    }
}
