package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class kp4 extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public bby A;
    public bby B;
    public bby C;
    public final mq4 o;
    public final fnk p;
    public final cu q;
    public final jnk r;
    public final rek0 s;
    public final dkj t;
    public final pmi0 u;
    public final i1w0 v;
    public final yo4 w;
    public final zr1 x;
    public final duj y;
    public final mne z;

    public kp4(mq4 mq4Var, fnk fnkVar, cu cuVar, jnk jnkVar, rek0 rek0Var, dkj dkjVar, ctf0 ctf0Var, pmi0 pmi0Var, i1w0 i1w0Var, yo4 yo4Var, zr1 zr1Var, duj dujVar, mne mneVar, g2v g2vVar) {
        ctf0Var.getClass();
        gj4 gj4Var = new gj4(ctf0Var, g2vVar, (byte) 1);
        ep4 ep4Var = new ep4(ctf0Var, (byte) 0);
        rwj rwjVar = mneVar.f22085a;
        super(null, gj4Var, ep4Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = mq4Var;
        this.p = fnkVar;
        this.q = cuVar;
        this.r = jnkVar;
        this.s = rek0Var;
        this.t = dkjVar;
        this.u = pmi0Var;
        this.v = i1w0Var;
        this.w = yo4Var;
        this.x = zr1Var;
        this.y = dujVar;
        this.z = mneVar;
        O();
    }

    public final void M() {
        int i = ip4.f15145a[this.o.ordinal()];
        i1w0 i1w0Var = this.v;
        if (i == 1) {
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            k0w0VarI.c(pmi0.b(this.u, false));
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }

    public final void N(Throwable th) {
        Object value;
        Object value2;
        boolean z = th instanceof zhi0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (!z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, zn4.a((zn4) value2, true, false, false, false, null, null, 158)));
            return;
        }
        int errorCode = ((zhi0) th).c.getErrorCode();
        if (errorCode == 11) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            G(new z84(message));
            M();
            return;
        }
        if (errorCode == 37) {
            M();
            this.v.d(new ys3(this, th, (byte) 19));
        } else {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, zn4.a((zn4) value, true, false, false, false, null, null, 158)));
        }
    }

    public final void O() {
        bby bbyVar = this.A;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.A = sac.W(jiu0.a(this), true, hp4.class.getName(), this.z.b, new fp4(this, (byte) 2), new jp4(this, null, b));
        }
    }

    public final void P(boolean z) {
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            boolean z2 = z;
            if (p7m0Var.m(value, zn4.a((zn4) value, false, false, z2, false, null, null, 247))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        k74 k74Var = (k74) obj;
        k74Var.getClass();
        super.x(k74Var);
        final byte b = 0;
        yje yjeVar = null;
        final byte b2 = 1;
        if (k74Var instanceof u64) {
            bby bbyVar = this.C;
            if (bbyVar == null || !bbyVar.isActive()) {
                P(true);
                this.C = sac.V(jiu0.a(this), new fp4(this, (byte) 0), new Function0(this) { // from class: a.gp4
                    public final /* synthetic */ kp4 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object value5;
                        Object value6;
                        byte b3 = b;
                        kp4 kp4Var = this.b;
                        switch (b3) {
                            case 0:
                                kp4Var.P(false);
                                p7m0 p7m0Var = kp4Var.i.f25029a;
                                do {
                                    value5 = p7m0Var.getValue();
                                    value5.getClass();
                                    kp4Var.f.getClass();
                                } while (!p7m0Var.m(value5, zn4.a((zn4) value5, false, false, false, false, null, null, 159)));
                                break;
                            default:
                                kp4Var.P(false);
                                p7m0 p7m0Var2 = kp4Var.i.f25029a;
                                do {
                                    value6 = p7m0Var2.getValue();
                                    value6.getClass();
                                    kp4Var.f.getClass();
                                } while (!p7m0Var2.m(value6, zn4.a((zn4) value6, false, false, false, false, null, null, 159)));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, null, new jp4(this, yjeVar, b), 12);
                return;
            }
            return;
        }
        if (!(k74Var instanceof x64)) {
            boolean z = k74Var instanceof a74;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value4 = p7m0Var.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value4, zn4.a((zn4) value4, false, false, false, false, null, null, 159)));
                return;
            }
            boolean z2 = k74Var instanceof b74;
            zr1 zr1Var = this.x;
            yo4 yo4Var = this.w;
            if (z2) {
                i8i.D("action", "cancel", yo4Var.f42966a, "authenticator_end_bottom_click");
                b1j.v("cancel", zr1Var.f44833a, 3347L);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var2.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value3, zn4.a((zn4) value3, false, false, false, false, null, null, 159)));
                return;
            }
            if (k74Var instanceof f74) {
                e3c.n(this.A);
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value2, zn4.a((zn4) value2, false, true, false, false, null, null, 250)));
                O();
                return;
            }
            if (k74Var instanceof e74) {
                P(true);
                O();
                return;
            }
            if (k74Var instanceof g74) {
                g74 g74Var = (g74) k74Var;
                boolean z3 = g74Var.f10796a;
                String str = g74Var.b;
                i8i.D("action", "end", yo4Var.f42966a, "authenticator_end_bottom_click");
                b1j.v("end", zr1Var.f44833a, 3347L);
                bby bbyVar2 = this.B;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    P(true);
                    this.B = sac.V(jiu0.a(this), new fp4(this, (byte) 1), new Function0(this) { // from class: a.gp4
                        public final /* synthetic */ kp4 b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Object value5;
                            Object value6;
                            byte b3 = b2;
                            kp4 kp4Var = this.b;
                            switch (b3) {
                                case 0:
                                    kp4Var.P(false);
                                    p7m0 p7m0Var4 = kp4Var.i.f25029a;
                                    do {
                                        value5 = p7m0Var4.getValue();
                                        value5.getClass();
                                        kp4Var.f.getClass();
                                    } while (!p7m0Var4.m(value5, zn4.a((zn4) value5, false, false, false, false, null, null, 159)));
                                    break;
                                default:
                                    kp4Var.P(false);
                                    p7m0 p7m0Var5 = kp4Var.i.f25029a;
                                    do {
                                        value6 = p7m0Var5.getValue();
                                        value6.getClass();
                                        kp4Var.f.getClass();
                                    } while (!p7m0Var5.m(value6, zn4.a((zn4) value6, false, false, false, false, null, null, 159)));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, null, new xj1(z3, (Object) this, (Object) str, yjeVar, (byte) 1), 12);
                    return;
                }
                return;
            }
            if (k74Var instanceof j74) {
                E();
                return;
            }
            if (k74Var instanceof h74) {
                H(new g0(((h74) k74Var).f12559a, (byte) 6));
                return;
            }
            if (!(k74Var instanceof v64)) {
                t9f.b();
                return;
            }
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value = p7m0Var4.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value, zn4.a((zn4) value, false, false, false, true, null, null, 223)));
            return;
        }
        i1w0 i1w0Var = this.v;
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
