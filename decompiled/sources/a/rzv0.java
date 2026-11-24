package a;

import java.util.List;
import org.xplatform.search.impl.presentation.xgames.models.XGamesSearchFragmentSettings;

/* JADX INFO: loaded from: classes5.dex */
public final class rzv0 extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public bby A;
    public bby B;
    public bby C;
    public final lbu o;
    public final ali p;
    public final iqt q;
    public final mne r;
    public final x4u s;
    public final nn60 t;
    public final m1e u;
    public final o3c v;
    public final pru w;
    public final yuu x;
    public bby y;
    public bby z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzv0(vzg0 vzg0Var, XGamesSearchFragmentSettings xGamesSearchFragmentSettings, lbu lbuVar, ali aliVar, iqt iqtVar, ctf0 ctf0Var, mne mneVar, x4u x4uVar, nn60 nn60Var, m1e m1eVar, bzt bztVar, o3c o3cVar, pru pruVar, yuu yuuVar) {
        super(new y9v0((byte) 13), cvm0.p(mneVar.c, mneVar.f22085a), new m8s0(ctf0Var, bztVar, pruVar, (byte) 14), (yzn0) null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = lbuVar;
        this.p = aliVar;
        this.q = iqtVar;
        this.r = mneVar;
        this.s = x4uVar;
        this.t = nn60Var;
        this.u = m1eVar;
        this.v = o3cVar;
        this.w = pruVar;
        this.x = yuuVar;
        i3t0.B(this, nn60Var, new en60[]{new wm60(zn60.OneXSearch)});
        O();
        i3t0.F(this, nn60Var, null, null, new i9v0((byte) 19), 119);
    }

    public final void M() {
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.B = sac.V(jiu0.a(this), new izv0(this, (byte) 1), null, this.r.f22085a, new mzv0(this, null, (byte) 0), 10);
        }
    }

    public final void N() {
        bby bbyVar = this.A;
        if ((bbyVar == null || !bbyVar.isActive()) && !(((bzv0) D()).c instanceof hdt)) {
            this.A = sac.V(jiu0.a(this), new izv0(this, (byte) 0), null, this.r.f22085a, new vmq0(this, null, (byte) 8), 10);
        }
    }

    public final void O() {
        bby bbyVar = this.C;
        byte b = 1;
        yje yjeVar = null;
        mne mneVar = this.r;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.C = sac.V(jiu0.a(this), qzv0.f29597a, null, mneVar.f22085a, new mzv0(this, yjeVar, (byte) 2), 10);
        }
        e3c.n(this.y);
        this.y = sac.V(jiu0.a(this), nzv0.f24391a, null, mneVar.f22085a, new mzv0(this, yjeVar, b), 10);
        M();
        N();
    }

    public final void P(String str) {
        e3c.n(this.z);
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            String str2 = str;
            if (p7m0Var.m(value, bzv0.a((bzv0) value, str2, null, null, true, null, false, 6))) {
                this.z = sac.V(jiu0.a(this), new zfv0(this, str2, (byte) 17), null, this.r.f22085a, new n7t0(this, str2, null, (byte) 24), 10);
                return;
            }
            str = str2;
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        List list;
        pyv0 pyv0Var = (pyv0) obj;
        pyv0Var.getClass();
        if (pyv0Var.equals(gyv0.f12151a)) {
            E();
            return;
        }
        if (pyv0Var.equals(nyv0.f24348a)) {
            N();
            M();
            String str = ((bzv0) D()).f3492a;
            if (!this.w.a().W1 || str.length() < 2) {
                return;
            }
            P(str);
            return;
        }
        boolean z = pyv0Var instanceof kyv0;
        nn60 nn60Var = this.t;
        if (z) {
            kyv0 kyv0Var = (kyv0) pyv0Var;
            Object obj2 = null;
            if (((bzv0) D()).d) {
                list = ((bzv0) D()).e;
            } else {
                qdt qdtVar = ((bzv0) D()).c;
                hdt hdtVar = qdtVar instanceof hdt ? (hdt) qdtVar : null;
                list = hdtVar != null ? hdtVar.f12886a : null;
            }
            if (list == null) {
                return;
            }
            for (Object obj3 : list) {
                if (((pbv) obj3).f26728a == kyv0Var.f19125a) {
                    obj2 = obj3;
                    break;
                }
            }
            pbv pbvVar = (pbv) obj2;
            if (pbvVar == null) {
                return;
            }
            i3t0.B(this, nn60Var, new en60[]{new bn60(pbvVar, kyv0Var.b, -1)});
            return;
        }
        if (pyv0Var instanceof oyv0) {
            i3t0.B(this, nn60Var, new en60[]{((oyv0) pyv0Var).f26077a});
            return;
        }
        if (pyv0Var instanceof iyv0) {
            if (!((iyv0) pyv0Var).f15607a.equals(on60.f25532a)) {
                t9f.b();
                return;
            }
            e3c.n(this.B);
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, bzv0.a((bzv0) value, null, d9p.f5712a, null, false, null, false, 61)));
            return;
        }
        if (pyv0Var.equals(lyv0.f20882a)) {
            G(xyv0.f41725a);
            return;
        }
        if (pyv0Var.equals(hyv0.f13879a)) {
            O();
            return;
        }
        if (!pyv0Var.equals(jyv0.f17378a)) {
            if (pyv0Var.equals(myv0.f22622a)) {
                G(zyv0.f45224a);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        e3c.n(this.y);
        e3c.n(this.z);
        e3c.n(this.B);
        e3c.n(this.A);
        e3c.n(this.C);
    }
}
