package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class tyk0 extends w46 {
    public c4m0 A;
    public bby B;
    public boolean C;
    public final qoj0 D;
    public final qoj0 E;
    public final qoj0 F;
    public final qoj0 G;
    public final p7m0 H;
    public final qoj0 I;
    public final wkt0 b;
    public final i5m0 c;
    public final vcu d;
    public final ztt e;
    public final fq f;
    public final xcc g;
    public final fpi0 h;
    public final lg60 i;
    public final js j;
    public final yrc k;
    public final hot l;
    public final o1u m;
    public final ysu n;
    public final muu o;
    public final jx90 p;
    public final fhf0 q;
    public final kif0 r;
    public final poi0 s;
    public final spx t;
    public final gmt0 u;
    public final mne v;
    public final lzt w;
    public final itt x;
    public final t0u y;
    public final egu z;

    public tyk0(i1w0 i1w0Var, qa60 qa60Var, wkt0 wkt0Var, i5m0 i5m0Var, vcu vcuVar, ztt zttVar, fq fqVar, xcc xccVar, fpi0 fpi0Var, lg60 lg60Var, js jsVar, yrc yrcVar, hot hotVar, o1u o1uVar, ysu ysuVar, muu muuVar, jx90 jx90Var, fhf0 fhf0Var, kif0 kif0Var, poi0 poi0Var, spx spxVar, gmt0 gmt0Var, mne mneVar, lzt lztVar, itt ittVar, t0u t0uVar, egu eguVar) {
        i1w0Var.getClass();
        qa60Var.getClass();
        wkt0Var.getClass();
        i5m0Var.getClass();
        vcuVar.getClass();
        zttVar.getClass();
        fqVar.getClass();
        xccVar.getClass();
        fpi0Var.getClass();
        lg60Var.getClass();
        jsVar.getClass();
        yrcVar.getClass();
        hotVar.getClass();
        o1uVar.getClass();
        ysuVar.getClass();
        muuVar.getClass();
        jx90Var.getClass();
        fhf0Var.getClass();
        kif0Var.getClass();
        poi0Var.getClass();
        spxVar.getClass();
        gmt0Var.getClass();
        lztVar.getClass();
        ittVar.getClass();
        t0uVar.getClass();
        eguVar.getClass();
        this.b = wkt0Var;
        this.c = i5m0Var;
        this.d = vcuVar;
        this.e = zttVar;
        this.f = fqVar;
        this.g = xccVar;
        this.h = fpi0Var;
        this.i = lg60Var;
        this.j = jsVar;
        this.k = yrcVar;
        this.l = hotVar;
        this.m = o1uVar;
        this.n = ysuVar;
        this.o = muuVar;
        this.p = jx90Var;
        this.q = fhf0Var;
        this.r = kif0Var;
        this.s = poi0Var;
        this.t = spxVar;
        this.u = gmt0Var;
        this.v = mneVar;
        this.w = lztVar;
        this.x = ittVar;
        this.y = t0uVar;
        this.z = eguVar;
        this.D = ckb.F();
        this.E = roj0.b(0, 0, null, 7);
        this.F = roj0.b(0, 0, null, 7);
        this.G = roj0.b(0, 0, null, 7);
        this.H = q7m0.a(new hlu0(false, false));
        this.I = roj0.b(1, 0, i99.b, 2);
        int i = 2;
        Class<tyk0> cls = tyk0.class;
        String str = "handleCommand";
        String str2 = "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V";
        slb.U(new dnq(new fnq(qa60Var.a(), new jbh0(i, this, cls, str, str2, 4, (byte) 19), (byte) 4), new myk0(this, null, (byte) 0), (byte) 1), jiu0.a(this));
        z();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(List list, zje zjeVar) throws Exception {
        ryk0 ryk0Var;
        double d;
        tyk0 tyk0Var;
        boolean z;
        List list2;
        boolean z2;
        p7m0 p7m0Var;
        Object value;
        if (zjeVar instanceof ryk0) {
            ryk0Var = (ryk0) zjeVar;
            int i = ryk0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ryk0Var.p = i - Integer.MIN_VALUE;
            } else {
                ryk0Var = new ryk0(this, zjeVar);
            }
        } else {
            ryk0Var = new ryk0(this, zjeVar);
        }
        Object obj = ryk0Var.n;
        wne wneVar = wne.f39444a;
        int i2 = ryk0Var.p;
        if (i2 == 0) {
            z1x.P(obj);
            boolean zA = this.e.a().f4905a.f3145a.a();
            hot hotVar = this.l;
            if (!zA && !list.isEmpty()) {
                hotVar.getClass();
                this.i.a(hot.a(list));
            }
            hotVar.getClass();
            double dA = hot.a(list);
            ryk0Var.i = list;
            ryk0Var.j = this;
            ryk0Var.k = zA;
            ryk0Var.l = zA;
            ryk0Var.m = dA;
            ryk0Var.p = 1;
            Object objA = this.y.a(ryk0Var);
            if (objA == wneVar) {
                return wneVar;
            }
            d = dA;
            tyk0Var = this;
            z = zA;
            obj = objA;
            list2 = list;
            z2 = z;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d = ryk0Var.m;
            z2 = ryk0Var.l;
            z = ryk0Var.k;
            tyk0Var = ryk0Var.j;
            list2 = ryk0Var.i;
            z1x.P(obj);
        }
        tyk0Var.C(new nc7(d, (String) obj, z2));
        boolean z3 = (list2.isEmpty() || z || !(this.d.a() == vrs.f37917a)) ? false : true;
        do {
            p7m0Var = this.H;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, hlu0.a((hlu0) value, z3, false, 2)));
        if (z3) {
            G(this.z.a());
        }
        C(new pc7(list2));
        return Unit.f46060a;
    }

    public final void B() {
        p7m0 p7m0Var;
        Object value;
        uyk0 uyk0Var = this.k.f43115a.d;
        uyk0Var.f36493a.n(iun.f15405a);
        yxk0 yxk0Var = yxk0.g;
        uyk0Var.b = yxk0Var;
        uyk0Var.c = new vyk0();
        E(new jav0(false));
        D(new ccs(true));
        C(new oc7(true));
        D(new acs(yxk0Var));
        do {
            p7m0Var = this.H;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, hlu0.a((hlu0) value, false, false, 1)));
    }

    public final void C(qc7 qc7Var) {
        sac.V(jiu0.a(this), new ejk0((byte) 10), null, null, new kbh0(this, qc7Var, null, (byte) 27), 14);
    }

    public final void D(dcs dcsVar) {
        sac.V(jiu0.a(this), new ejk0((byte) 13), null, null, new kbh0(this, dcsVar, null, (byte) 26), 14);
    }

    public final void E(lav0 lav0Var) {
        sac.V(jiu0.a(this), new ejk0((byte) 11), null, null, new kbh0(this, lav0Var, null, (byte) 25), 14);
    }

    public final void F() {
        D(new ccs(false));
        C(new oc7(false));
        E(new jav0(true));
        sac.V(jiu0.a(this), new gvj0(1, this, tyk0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, null, new oyk0(this, null, (byte) 5), 14);
        c4m0 c4m0Var = this.A;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        z();
    }

    public final void G(boolean z) {
        p7m0 p7m0Var;
        Object value;
        if (this.e.a().f4905a.f3145a.a()) {
            return;
        }
        do {
            p7m0Var = this.H;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, hlu0.a((hlu0) value, false, z, 1)));
    }

    public final void w() {
        sac.V(jiu0.a(this), new gvj0(1, this, tyk0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, this.v.b, new oyk0(this, null, (byte) 0), 10);
    }

    public final void x(Throwable th) {
        sac.V(jiu0.a(this), pyk0.f27804a, null, this.v.f22085a, new kbh0(this, th, null, (byte) 21), 10);
    }

    public final void y(double d) {
        sac.V(jiu0.a(this), new gvj0(1, this, tyk0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, this.v.f22085a, new qyk0(this, d, null), 10);
    }

    public final void z() {
        c4m0 c4m0Var = this.A;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.A = slb.U(new dnq(new fnq(this.o.a(), new kbh0(this, yjeVar, (byte) 23), (byte) 4), new myk0(this, yjeVar, b), (byte) 1), jiu0.a(this));
        }
    }
}
