package a;

import android.javax.sip.message.Response;
import android.os.Build;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class j790 extends i3t0 {
    public static final List F = kotlin.collections.a.c(Integer.valueOf(Response.UNAUTHORIZED));
    public final wgu A;
    public bby B;
    public bby C;
    public final c4m0 D;
    public c4m0 E;
    public final String o;
    public final hse0 p;
    public final hru q;
    public final ort r;
    public final pmi s;
    public final i1w0 t;
    public final mne u;
    public final duj v;
    public final vqc w;
    public final j1q0 x;
    public final ntu y;
    public final n4u z;

    /* JADX WARN: Illegal instructions before constructor call */
    public j790(hse0 hse0Var, hru hruVar, ort ortVar, pmi pmiVar, i1w0 i1w0Var, g2v g2vVar, m1e m1eVar, mne mneVar, duj dujVar, vqc vqcVar, j1q0 j1q0Var, ntu ntuVar, n4u n4uVar, wgu wguVar, pru pruVar) {
        hse0Var.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        j1q0Var.getClass();
        wguVar.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(vs10Var, mneVar.b);
        byte b = 25;
        yje yjeVar = null;
        super(new i280((byte) 25), g090VarP, new rib(g2vVar, (byte) 2), (yzn0) null);
        this.o = "/PaymentConsultant/office/payment/requests?set-base-url=v3-api&skip-lang-redirect=1";
        this.p = hse0Var;
        this.q = hruVar;
        this.r = ortVar;
        this.s = pmiVar;
        this.t = i1w0Var;
        this.u = mneVar;
        this.v = dujVar;
        this.w = vqcVar;
        this.x = j1q0Var;
        this.y = ntuVar;
        this.z = n4uVar;
        this.A = wguVar;
        long j = ((sff0) maz.b(new b6u(pruVar, (byte) 28)).getValue()).u1;
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            long j2 = j;
            if (p7m0Var.m(value, y690.a((y690) value, null, j2, false, 5))) {
                break;
            } else {
                j = j2;
            }
        }
        c4m0 c4m0Var = this.D;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.D = sac.T(new fnq(m1eVar.b(), new h790(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), rwjVar), i790.h);
        }
        sac.V(jiu0.a(this), new e790(this, (byte) 1), null, rwjVar, new z210(this, yjeVar, b), 10);
        N();
    }

    public final void M(String str) {
        Object value;
        bby bbyVar = this.C;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, y690.a((y690) value, x690.f40352a, 0L, false, 6)));
            String strN = ohs0.n(this.y.a(), str);
            String strA = this.A.a();
            this.C = sac.V(jiu0.a(this), new e790(this, (byte) 0), null, this.u.b, new wmq((Object) this, (Object) strN, false, (Object) strA, (yje) null, (byte) 16), 10);
        }
    }

    public final void N() {
        Object value;
        c4m0 c4m0Var = this.E;
        if (c4m0Var != null) {
            e3c.n(c4m0Var);
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, y690.a((y690) value, null, 0L, false, 3)));
        this.E = sac.T(new dnq(sac.L(6, ((y690) D()).b * 1000, 0L), new qos((Object) this, (yje) null, (byte) 28), (byte) 0), jiu0.a(this), g790.h);
    }

    @Override // a.diu0
    public final void v() {
        c4m0 c4m0Var = this.D;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        bby bbyVar = this.B;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.C;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        c4m0 c4m0Var2 = this.E;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        String[] strArrH;
        Object value;
        Object value2;
        c590 c590Var = (c590) obj;
        c590Var.getClass();
        if (!(c590Var instanceof b590)) {
            if (c590Var instanceof u490) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        b590 b590Var = (b590) c590Var;
        if (!(b590Var instanceof v490)) {
            if (b590Var instanceof z490) {
                if (((y690) D()).c) {
                    N();
                    M(this.o);
                    return;
                }
                return;
            }
            boolean z = b590Var instanceof y490;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z) {
                if (((y690) D()).f42086a != x690.f40352a) {
                    return;
                }
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value2, y690.a((y690) value2, x690.b, 0L, false, 6)));
                return;
            }
            if (b590Var instanceof x490) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, y690.a((y690) value, x690.c, 0L, false, 6)));
                return;
            }
            if (b590Var instanceof a590) {
                String strH = this.w.h();
                if (Build.VERSION.SDK_INT >= 26) {
                    d590.c.getClass();
                    strArrH = jh70.h();
                } else {
                    d590.c.getClass();
                    strArrH = new String[]{"image/png", "image/jpeg", "video/mp4", "video/avi", "application/pdf"};
                }
                G(new v690(strH, strArrH));
                return;
            }
            if (!(b590Var instanceof w490)) {
                t9f.b();
                return;
            }
            if (F.contains(Integer.valueOf(Response.UNAUTHORIZED))) {
                bby bbyVar = this.B;
                byte b = 1;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.B = sac.V(jiu0.a(this), new e790(this, (byte) 2), null, this.u.b, new h790(this, null, b), 10);
                    return;
                }
                return;
            }
            return;
        }
        i1w0 i1w0Var = this.t;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
