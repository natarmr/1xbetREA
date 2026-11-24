package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class u90 extends w46 {
    public final qoj0 A;
    public final qoj0 B;
    public final p80 b;
    public final fq c;
    public final i5m0 d;
    public final vcu e;
    public final ztt f;
    public final xcc g;
    public final fpi0 h;
    public final lg60 i;
    public final l1u j;
    public final wkt0 k;
    public final spx l;
    public final lzt m;
    public final mne n;
    public final itt o;
    public final egu p;
    public final t0u q;
    public c4m0 r;
    public bby s;
    public bby t;
    public bby u;
    public boolean v;
    public final p7m0 w;
    public final qoj0 x;
    public final qoj0 y;
    public final qoj0 z;

    public u90(i1w0 i1w0Var, p80 p80Var, fq fqVar, i5m0 i5m0Var, qa60 qa60Var, vcu vcuVar, ztt zttVar, xcc xccVar, fpi0 fpi0Var, lg60 lg60Var, l1u l1uVar, wkt0 wkt0Var, spx spxVar, lzt lztVar, mne mneVar, itt ittVar, egu eguVar, t0u t0uVar) {
        i1w0Var.getClass();
        p80Var.getClass();
        fqVar.getClass();
        i5m0Var.getClass();
        qa60Var.getClass();
        vcuVar.getClass();
        zttVar.getClass();
        xccVar.getClass();
        fpi0Var.getClass();
        lg60Var.getClass();
        l1uVar.getClass();
        wkt0Var.getClass();
        spxVar.getClass();
        lztVar.getClass();
        ittVar.getClass();
        eguVar.getClass();
        t0uVar.getClass();
        this.b = p80Var;
        this.c = fqVar;
        this.d = i5m0Var;
        this.e = vcuVar;
        this.f = zttVar;
        this.g = xccVar;
        this.h = fpi0Var;
        this.i = lg60Var;
        this.j = l1uVar;
        this.k = wkt0Var;
        this.l = spxVar;
        this.m = lztVar;
        this.n = mneVar;
        this.o = ittVar;
        this.p = eguVar;
        this.q = t0uVar;
        this.w = q7m0.a(new m90(false, false));
        this.x = roj0.b(3, 0, null, 6);
        this.y = roj0.b(3, 0, null, 6);
        this.z = roj0.b(0, 0, null, 7);
        this.A = ckb.F();
        this.B = roj0.b(1, 0, i99.b, 2);
        C();
        int i = 2;
        Class<u90> cls = u90.class;
        String str = "handleCommand";
        String str2 = "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V";
        slb.U(new dnq(new fnq(qa60Var.a(), new i8(i, this, cls, str, str2, 4, (byte) 7), (byte) 4), new y80(this, null, (byte) 0), (byte) 1), jiu0.a(this));
        z();
    }

    public final void A(z70 z70Var) {
        G(new e90(z70Var));
        this.b.d.c.b = z70Var;
        if (this.f.a().f4905a.f3145a.a()) {
            y(0.0d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(List list, zje zjeVar) throws Exception {
        s90 s90Var;
        double d;
        u90 u90Var;
        boolean z;
        List list2;
        boolean z2;
        p7m0 p7m0Var;
        Object value;
        if (zjeVar instanceof s90) {
            s90Var = (s90) zjeVar;
            int i = s90Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                s90Var.p = i - Integer.MIN_VALUE;
            } else {
                s90Var = new s90(this, zjeVar);
            }
        } else {
            s90Var = new s90(this, zjeVar);
        }
        Object obj = s90Var.n;
        wne wneVar = wne.f39444a;
        int i2 = s90Var.p;
        if (i2 == 0) {
            z1x.P(obj);
            E(list);
            boolean zA = this.f.a().f4905a.f3145a.a();
            p80 p80Var = this.b;
            if (!zA && !list.isEmpty()) {
                p80Var.getClass();
                this.i.a(p80.a(list));
            }
            p80Var.getClass();
            double dA = p80.a(list);
            s90Var.i = list;
            s90Var.j = this;
            s90Var.k = zA;
            s90Var.l = zA;
            s90Var.m = dA;
            s90Var.p = 1;
            Object objA = this.q.a(s90Var);
            if (objA == wneVar) {
                return wneVar;
            }
            d = dA;
            u90Var = this;
            z = zA;
            obj = objA;
            list2 = list;
            z2 = z;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d = s90Var.m;
            z2 = s90Var.l;
            z = s90Var.k;
            u90Var = s90Var.j;
            list2 = s90Var.i;
            z1x.P(obj);
        }
        u90Var.F(new z80(d, (String) obj, z2));
        G(d90.f5675a);
        boolean z3 = (list2.isEmpty() || z || this.e.a() != vrs.f37917a) ? false : true;
        do {
            p7m0Var = this.w;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, m90.a((m90) value, z3, false, 2)));
        if (z3) {
            J(this.p.a());
        }
        F(new b90(list2));
        return Unit.f46060a;
    }

    public final void C() {
        p7m0 p7m0Var;
        Object value;
        d80 d80Var = this.b.d.c;
        d80Var.c = esr.NOTHING;
        d80Var.f5619a.n(iun.f15405a);
        d80Var.b = z70.v;
        d80Var.d = new o80(0L, 0.0d, 0.0d, 0.0d, null, null, 127);
        d80Var.e = 0.0f;
        H(new j90(false));
        G(new g90(true));
        F(new a90(true));
        do {
            p7m0Var = this.w;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, m90.a((m90) value, false, false, 1)));
    }

    public final void D() {
        p7m0 p7m0Var;
        Object value;
        C();
        G(d90.f5675a);
        do {
            p7m0Var = this.w;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, m90.a((m90) value, false, false, 2)));
    }

    public final void E(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((t70) it.next()).b);
        }
        G(new f90(arrayList));
    }

    public final void F(c90 c90Var) {
        sac.V(jiu0.a(this), new b5((byte) 15), null, null, new l1(this, c90Var, null, (byte) 15), 14);
    }

    public final void G(h90 h90Var) {
        sac.V(jiu0.a(this), new b5((byte) 14), null, null, new l1(this, h90Var, null, (byte) 14), 14);
    }

    public final void H(l90 l90Var) {
        sac.V(jiu0.a(this), new b5((byte) 16), null, null, new l1(this, l90Var, null, (byte) 13), 14);
    }

    public final void I() {
        p80 p80Var = this.b;
        H(new k90(p80Var.d.c.d.e.a(), p80Var.d.c.e, false));
        H(new j90(true));
    }

    public final void J(boolean z) {
        p7m0 p7m0Var;
        Object value;
        if (this.f.a().f4905a.f3145a.a()) {
            return;
        }
        do {
            p7m0Var = this.w;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, m90.a((m90) value, false, z, 1)));
    }

    public final void w() {
        bby bbyVar = this.u;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.u = sac.V(jiu0.a(this), new t0(1, this, u90.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, this.n.f22085a, new p90(this, null, (byte) 0), 10);
        }
    }

    public final void x(Throwable th) {
        sac.V(jiu0.a(this), q90.f28323a, null, this.n.f22085a, new l1(this, th, null, (byte) 10), 10);
    }

    public final void y(double d) {
        bby bbyVar = this.s;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.s = sac.V(jiu0.a(this), new t0(1, this, u90.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, this.n.b, new r90(this, d, null), 10);
        }
    }

    public final void z() {
        c4m0 c4m0Var = this.r;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.r = slb.U(new dnq(new fnq(this.b.d.c.f5619a, new l1(this, yjeVar, (byte) 11), (byte) 4), new y80(this, yjeVar, b), (byte) 1), jiu0.a(this));
        }
    }
}
