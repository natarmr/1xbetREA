package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ven0 extends i3t0 {
    public static final /* synthetic */ int K = 0;
    public final hnu A;
    public final svu B;
    public final hjd C;
    public final mne D;
    public final r9u E;
    public final a8z F;
    public c4m0 G;
    public bby H;
    public bby I;
    public bby J;
    public final i1w0 o;
    public final j3c p;
    public final luu q;
    public final dj9 r;
    public final lbu s;
    public final pru t;
    public final m1e u;
    public final yhi v;
    public final wdu w;
    public final duj x;
    public final b4j y;
    public final je z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ven0(vzg0 vzg0Var, i1w0 i1w0Var, ctf0 ctf0Var, y78 y78Var, j3c j3cVar, luu luuVar, dj9 dj9Var, lbu lbuVar, pru pruVar, m1e m1eVar, yhi yhiVar, wdu wduVar, duj dujVar, b4j b4jVar, je jeVar, hnu hnuVar, g2v g2vVar, svu svuVar, hjd hjdVar, mne mneVar, r9u r9uVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        byte b = 11;
        super(new a7n0((byte) 12), cvm0.p(mneVar.c, mneVar.f22085a), new mlb(ctf0Var, y78Var, g2vVar, b), (yzn0) null);
        this.o = i1w0Var;
        this.p = j3cVar;
        this.q = luuVar;
        this.r = dj9Var;
        this.s = lbuVar;
        this.t = pruVar;
        this.u = m1eVar;
        this.v = yhiVar;
        this.w = wduVar;
        this.x = dujVar;
        this.y = b4jVar;
        this.z = jeVar;
        this.A = hnuVar;
        this.B = svuVar;
        this.C = hjdVar;
        this.D = mneVar;
        this.E = r9uVar;
        this.F = maz.a(wez.b, new jfm0(this, b));
        i3t0.K(this, null, null, new bu(this, null, (byte) 20), 3);
    }

    public final void M(Throwable th) {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, tbn0.a((tbn0) value, null, false, null, zan0.b, null, null, false, false, false, null, false, false, false, 8055)));
        this.x.b(th, new o3m0(th, this, (byte) 15));
    }

    public final void N() {
        bby bbyVar = this.H;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.H = sac.V(jiu0.a(this), new ndn0(1, this, ven0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, this.D.b, new uen0(this, yjeVar, (byte) 0), 10);
    }

    public final boolean O() {
        return ((tbn0) D()).c == tan0.f33621a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        uid uidVarN0;
        san0 san0Var = (san0) obj;
        san0Var.getClass();
        byte b = 2;
        byte b2 = 1;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (san0Var instanceof jan0) {
            bby bbyVar = this.J;
            if (bbyVar == null || !bbyVar.isActive()) {
                jan0 jan0Var = (jan0) san0Var;
                if (jan0Var instanceof ian0) {
                    uidVarN0 = ebc.n0(((ian0) san0Var).f14446a);
                } else {
                    if (!(jan0Var instanceof han0)) {
                        t9f.b();
                        return;
                    }
                    uidVarN0 = ((han0) san0Var).f12732a;
                }
                this.J = i3t0.B(this, this.C, new vid[]{new did(((tbn0) D()).f33673a), uidVarN0});
                if (uidVarN0 instanceof pid) {
                    for (Object obj3 : ((tbn0) D()).f33673a) {
                        if (((d0t) obj3).f5282a == ((pid) uidVarN0).f27037a) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    d0t d0tVar = (d0t) obj2;
                    if (d0tVar != null) {
                        long j = d0tVar.v;
                        boolean z = d0tVar.C;
                        if (((tbn0) D()).c == tan0.c) {
                            this.y.q(j, zde0.NOTIFICATIONS, z);
                            this.z.o(j, z, y1p.NOTIFICATIONS);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z2 = san0Var instanceof ran0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z2) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, tbn0.a((tbn0) value2, null, false, null, null, null, null, false, true, false, null, false, false, false, 8063)));
            N();
            return;
        }
        if (san0Var instanceof oan0) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, tbn0.a((tbn0) value, null, false, null, null, null, null, false, true, false, null, false, false, false, 8063)));
            N();
            return;
        }
        if (san0Var instanceof pan0) {
            G(wbn0.f38888a);
            return;
        }
        boolean z3 = san0Var instanceof qan0;
        mne mneVar = this.D;
        if (z3) {
            sac.V(jiu0.a(this), new ndn0(1, this, ven0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, mneVar.f22085a, new uen0(this, objArr3 == true ? 1 : 0, b2), 10);
            return;
        }
        if (!(san0Var instanceof nan0)) {
            if (san0Var instanceof man0) {
                c4m0 c4m0Var = this.G;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                this.G = slb.U(new fnq(new dnq(this.u.b(), new jgb0((Object) this, (yje) (objArr2 == true ? 1 : 0), (byte) 22), (byte) 1), new uen0(this, objArr == true ? 1 : 0, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.b));
                this.I = i3t0.F(this, this.C, mneVar.f22085a, null, new acm0((byte) 5), 118);
                return;
            }
            if (san0Var instanceof kan0) {
                v3c.N(this.G);
                v3c.N(this.H);
                v3c.N(this.I);
                return;
            } else {
                if (san0Var instanceof lan0) {
                    E();
                    return;
                }
                return;
            }
        }
        i1w0 i1w0Var = this.o;
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
