package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class r2w extends eiu0 {
    public final p7m0 A;
    public c4m0 B;
    public bby C;
    public bby D;
    public final long c;
    public final n3w d;
    public final edu e;
    public final hsj f;
    public final vkr0 g;
    public final h3c h;
    public final m1e i;
    public final ywq0 j;
    public final b8u k;
    public final cmt l;
    public final sys0 m;
    public final duj n;
    public final ctf0 o;
    public final czt p;
    public final luu q;
    public final hpc r;
    public final mne s;
    public final rou t;
    public final wyu u;
    public final pru v;
    public final r9u w;
    public final boolean x;
    public final p7m0 y;
    public final n0o0 z;

    public r2w(long j, boolean z, n3w n3wVar, edu eduVar, hsj hsjVar, vkr0 vkr0Var, h3c h3cVar, m1e m1eVar, ywq0 ywq0Var, b8u b8uVar, cmt cmtVar, sys0 sys0Var, duj dujVar, ctf0 ctf0Var, czt cztVar, luu luuVar, hpc hpcVar, mne mneVar, rou rouVar, wyu wyuVar, pru pruVar, r9u r9uVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        this.c = j;
        this.d = n3wVar;
        this.e = eduVar;
        this.f = hsjVar;
        this.g = vkr0Var;
        this.h = h3cVar;
        this.i = m1eVar;
        this.j = ywq0Var;
        this.k = b8uVar;
        this.l = cmtVar;
        this.m = sys0Var;
        this.n = dujVar;
        this.o = ctf0Var;
        this.p = cztVar;
        this.q = luuVar;
        this.r = hpcVar;
        this.s = mneVar;
        this.t = rouVar;
        this.u = wyuVar;
        this.v = pruVar;
        this.w = r9uVar;
        ygp ygpVar = ygp.t;
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        this.x = j1q0Var.f15748a.d(ygpVar) && cy7.c();
        this.y = q7m0.a(new d3w(n3wVar, z, iun.f15405a, false, true, false, 0L, false));
        this.z = maz.b(new bdv(this, (byte) 14));
        this.A = q7m0.a(Boolean.FALSE);
        this.C = zvw.g();
    }

    public static boolean A(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            su6 su6Var = (su6) it.next();
            if (!su6Var.g && su6Var.l) {
                return true;
            }
        }
        return false;
    }

    public final void B(boolean z) {
        bby bbyVar = this.D;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.D = sac.V(jiu0.a(s()), new vft(1, this, r2w.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, this.s.b, new wz0(System.currentTimeMillis() - ((d3w) this.y.getValue()).g >= 30000, z, this, null), 10);
        }
    }

    public final void C(boolean z) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.y;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, d3w.a((d3w) value, null, null, true, false, 0L, false, 247)));
        B(z);
    }

    public final void D() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.y;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, d3w.a((d3w) value, null, null, false, true, 0L, false, 223)));
    }

    public final void E(n3w n3wVar) {
        d3w d3wVar;
        p7m0 p7m0Var;
        Object obj;
        n3w n3wVarD;
        do {
            p7m0 p7m0Var2 = this.y;
            Object value = p7m0Var2.getValue();
            d3wVar = (d3w) value;
            if (n3wVar.c == s77.JACKPOT) {
                obj = value;
                p7m0Var = p7m0Var2;
                n3wVarD = n3w.d(n3wVar, null, 0.0d, null, null, 0L, null, 0.0d, 0.0d, null, null, null, false, this.o.f(R.string.jackpot_word, new Object[0]), null, null, -1, -129);
            } else {
                p7m0Var = p7m0Var2;
                obj = value;
                n3wVarD = n3wVar;
            }
        } while (!p7m0Var.m(obj, d3w.a(d3wVar, n3wVarD, null, false, false, 0L, false, 254)));
        G(n3wVar);
        if (n3wVar.c != s77.AUTO) {
            v(n3wVar.J1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object F(zje zjeVar) {
        q2w q2wVar;
        Object value;
        n3w n3wVar = this.d;
        e4f e4fVar = n3wVar.l;
        if (zjeVar instanceof q2w) {
            q2wVar = (q2w) zjeVar;
            int i = q2wVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                q2wVar.k = i - Integer.MIN_VALUE;
            } else {
                q2wVar = new q2w(this, zjeVar);
            }
        } else {
            q2wVar = new q2w(this, zjeVar);
        }
        q2w q2wVar2 = q2wVar;
        Object objQ = q2wVar2.i;
        Object obj = wne.f39444a;
        int i2 = q2wVar2.k;
        p7m0 p7m0Var = this.y;
        if (i2 == 0) {
            z1x.P(objQ);
            if (w().f22868a.length() == 0) {
                D();
                return Unit.f46060a;
            }
            int iOrdinal = this.m.ordinal();
            boolean z = false;
            if (iOrdinal == 0 || iOrdinal == 1) {
                if (e4fVar == e4f.c || ((d3w) p7m0Var.getValue()).h) {
                    z = true;
                }
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                if (e4fVar == e4f.c || ((d3w) p7m0Var.getValue()).h || ((d3w) p7m0Var.getValue()).d) {
                    z = true;
                }
            }
            if (!((d3w) p7m0Var.getValue()).b && z) {
                String str = w().f22868a;
                s77 s77Var = w().c;
                String str2 = w().g;
                q2wVar2.k = 1;
                objQ = this.g.q(str, s77Var, str2, true, this.c, q2wVar2);
                if (objQ == obj) {
                    return obj;
                }
            }
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, d3w.a((d3w) value, null, null, false, false, 0L, false, 253)));
            G(n3wVar);
            v(n3wVar.J1);
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objQ);
        n3wVar = (n3w) objQ;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, d3w.a((d3w) value, null, null, false, false, 0L, false, 253)));
        G(n3wVar);
        v(n3wVar.J1);
        return Unit.f46060a;
    }

    public final void G(n3w n3wVar) {
        sac.V(jiu0.a(s()), new vft(1, this, r2w.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, this.s.f22085a, new dj3(this, n3wVar, null), 10);
    }

    @Override // a.eiu0
    public final void t() {
        ((m0w) this.r.f13434a.g).f20975a.i();
    }

    @Override // a.eiu0
    public final void u(diu0 diu0Var, vzg0 vzg0Var) {
        vzg0Var.getClass();
        this.f7878a = diu0Var;
        this.b = vzg0Var;
        yje yjeVar = null;
        byte b = 0;
        fnq fnqVar = new fnq(new dnq(this.i.b(), new o2w(this, yjeVar, b), (byte) 1), new p2w(this, yjeVar, b), (byte) 4);
        bvc bvcVarA = jiu0.a(diu0Var);
        mne mneVar = this.s;
        slb.U(fnqVar, d5c.S(bvcVarA, mneVar.f22085a));
        uzc uzcVar = (uzc) this.l.b;
        uzcVar.getClass();
        slb.U(new fnq(new dnq(nkb.z(new rzc(uzcVar, yjeVar, b)), new o2w(this, yjeVar, (byte) 1), (byte) 1), new cin(this, yjeVar, (byte) 17), (byte) 4), d5c.S(jiu0.a(diu0Var), mneVar.b));
    }

    public final void v(List list) {
        p7m0 p7m0Var;
        Object value;
        byte b;
        do {
            p7m0Var = this.y;
            value = p7m0Var.getValue();
            b = 1;
        } while (!p7m0Var.m(value, d3w.a((d3w) value, null, null, false, false, 0L, A(list) && !q3d.j(e4f.l, e4f.m, e4f.g, e4f.j).contains(w().l), 127)));
        yje yjeVar = null;
        if (!((d3w) p7m0Var.getValue()).h) {
            this.C.cancel(null);
            return;
        }
        if ((w().f22868a.length() == 0 || !w().t) && !w().J1.isEmpty()) {
            G(w());
        } else {
            this.C.cancel(null);
            this.C = sac.c0(jiu0.a(s()), ibc.w0(30000L, bfn.MILLISECONDS), this.s.b, new vft(1, this, r2w.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), new p2w(this, yjeVar, b));
        }
    }

    public final n3w w() {
        return ((d3w) this.y.getValue()).f5424a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object x(zje zjeVar) {
        m2w m2wVar;
        if (zjeVar instanceof m2w) {
            m2wVar = (m2w) zjeVar;
            int i = m2wVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                m2wVar.k = i - Integer.MIN_VALUE;
            } else {
                m2wVar = new m2w(this, zjeVar);
            }
        } else {
            m2wVar = new m2w(this, zjeVar);
        }
        Object objL = m2wVar.i;
        Object obj = wne.f39444a;
        int i2 = m2wVar.k;
        if (i2 == 0) {
            z1x.P(objL);
            String str = w().f22868a;
            String str2 = w().g;
            m2wVar.k = 1;
            objL = this.f.l(str, str2, m2wVar);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objL);
        }
        n3w n3wVar = (n3w) objL;
        G(n3w.d(n3wVar, null, 0.0d, null, null, 0L, null, 0.0d, 0.0d, null, null, null, false, this.o.f(R.string.jackpot_word, new Object[0]), null, null, -1, -129));
        v(n3wVar.J1);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(zje zjeVar) {
        n2w n2wVar;
        n3w n3wVarW;
        if (zjeVar instanceof n2w) {
            n2wVar = (n2w) zjeVar;
            int i = n2wVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                n2wVar.k = i - Integer.MIN_VALUE;
            } else {
                n2wVar = new n2w(this, zjeVar);
            }
        } else {
            n2wVar = new n2w(this, zjeVar);
        }
        Object objK = n2wVar.i;
        Object obj = wne.f39444a;
        int i2 = n2wVar.k;
        if (i2 == 0) {
            z1x.P(objK);
            if (((d3w) this.y.getValue()).b) {
                n3wVarW = w();
            } else {
                String str = w().f22868a;
                String str2 = w().g;
                n2wVar.k = 1;
                edu eduVar = this.e;
                jru jruVar = (jru) eduVar.c;
                objK = ((y3v) jruVar.b).k(((rpt) eduVar.b).a(), n2wVar, str, str2);
                if (objK == obj) {
                    return obj;
                }
            }
            G(n3wVarW);
            v(n3wVarW.J1);
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objK);
        n3wVarW = (n3w) objK;
        G(n3wVarW);
        v(n3wVarW.J1);
        return Unit.f46060a;
    }

    public final void z(Throwable th) {
        this.n.b(th, new xxv(this, (byte) 1));
    }
}
