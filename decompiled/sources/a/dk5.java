package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.feature.balance_management.impl.account_number.AccountNumberScreen;
import org.xplatform.feature.balance_management_old.impl.presentation.compose.history.FullHistoryScreen;
import org.xplatform.reward_system.impl.navigation.RewardSystemScreenFactoryImpl$getRewardSystemScreen$1;
import org.xplatform.wallet.impl.navigation.WalletsScreen$WalletsScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class dk5 extends w46 {
    public final l7k A;
    public final ctf0 B;
    public final phf0 C;
    public final ahu D;
    public final zlt0 E;
    public final jyg0 F;
    public final ot G;
    public final mnb H;
    public final bzt I;
    public String J;
    public final cmt K;
    public final hse0 L;
    public final btt0 M;
    public final sff0 N;
    public ffs0 O;
    public qes0 P;
    public ql5 Q;
    public boolean R;
    public long S;
    public boolean T;
    public final p7m0 U;
    public Boolean V;
    public bby W;
    public bby X;
    public final p7m0 Y;
    public final p7m0 Z;
    public final p7m0 a0;
    public final i1w0 b;
    public final ol60 b0;
    public final l4b c;
    public final p7m0 c0;
    public final boolean d;
    public final p7m0 d0;
    public final boolean e;
    public final p7m0 e0;
    public final mne f;
    public final p7m0 f0;
    public final xru g;
    public final qoj0 g0;
    public final zg h;
    public final p7m0 h0;
    public final qgd i;
    public final p7m0 i0;
    public final ih5 j;
    public final p7m0 j0;
    public final sp k;
    public final p7m0 k0;
    public final ih5 l;
    public final v88 m;
    public final duj n;
    public final vqc o;
    public final db9 p;
    public final rou q;
    public final lbu r;
    public final h7k s;
    public final g2v t;
    public final ocl u;
    public final m1e v;
    public final lme0 w;
    public final bzu x;
    public final ieu y;
    public final abu z;

    public dk5(vzg0 vzg0Var, i1w0 i1w0Var, l4b l4bVar, boolean z, boolean z2, mne mneVar, xru xruVar, zg zgVar, qgd qgdVar, ih5 ih5Var, sp spVar, ih5 ih5Var2, v88 v88Var, duj dujVar, vqc vqcVar, db9 db9Var, rou rouVar, lbu lbuVar, h7k h7kVar, g2v g2vVar, ocl oclVar, m1e m1eVar, lme0 lme0Var, bzu bzuVar, ieu ieuVar, abu abuVar, l7k l7kVar, ctf0 ctf0Var, phf0 phf0Var, ahu ahuVar, zlt0 zlt0Var, jyg0 jyg0Var, ot otVar, mnb mnbVar, bzt bztVar, String str, pru pruVar, cmt cmtVar, hse0 hse0Var, btt0 btt0Var) {
        Object obj;
        i1w0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        hse0Var.getClass();
        btt0Var.getClass();
        this.b = i1w0Var;
        this.c = l4bVar;
        this.d = z;
        this.e = z2;
        this.f = mneVar;
        this.g = xruVar;
        this.h = zgVar;
        this.i = qgdVar;
        this.j = ih5Var;
        this.k = spVar;
        this.l = ih5Var2;
        this.m = v88Var;
        this.n = dujVar;
        this.o = vqcVar;
        this.p = db9Var;
        this.q = rouVar;
        this.r = lbuVar;
        this.s = h7kVar;
        this.t = g2vVar;
        this.u = oclVar;
        this.v = m1eVar;
        this.w = lme0Var;
        this.x = bzuVar;
        this.y = ieuVar;
        this.z = abuVar;
        this.A = l7kVar;
        this.B = ctf0Var;
        this.C = phf0Var;
        this.D = ahuVar;
        this.E = zlt0Var;
        this.F = jyg0Var;
        this.G = otVar;
        this.H = mnbVar;
        this.I = bztVar;
        this.J = str;
        this.K = cmtVar;
        this.L = hse0Var;
        this.M = btt0Var;
        z();
        yje yjeVar = null;
        sac.V(jiu0.a(this), new j94(1, dujVar, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, mneVar.b, new oj5(this, yjeVar, (byte) 2), 10);
        qjj.W(jiu0.a(this), null, null, new oj5(this, yjeVar, (byte) 1), 3);
        sff0 sff0VarA = pruVar.a();
        this.N = sff0VarA;
        iun iunVar = iun.f15405a;
        this.U = q7m0.a(iunVar);
        this.Y = q7m0.a(Boolean.TRUE);
        this.Z = q7m0.a(Boolean.FALSE);
        this.a0 = q7m0.a(ni5.f23565a);
        this.b0 = new ol60(3);
        this.c0 = q7m0.a(kh5.f18273a);
        this.d0 = q7m0.a(new tk5(ctf0Var.f(R.string.balance_management_title, new Object[0]), ""));
        this.e0 = q7m0.a(new gk5(false, false));
        this.f0 = q7m0.a(qk5.f28868a);
        this.g0 = roj0.b(0, 0, null, 7);
        this.h0 = q7m0.a(ok5.f25389a);
        byte b = 12;
        this.i0 = q7m0.a(new fl80(new eu4(new vh80(iunVar), b), fl80.e, fl80.f, new i280(b)));
        this.j0 = q7m0.a(mh5.f21775a);
        int iOrdinal = sff0VarA.g.x.ordinal();
        if (iOrdinal == 0) {
            obj = axh0.f1625a;
        } else if (iOrdinal == 1) {
            obj = zwh0.f45106a;
        } else if (iOrdinal == 2) {
            obj = cxh0.f5122a;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                throw null;
            }
            obj = bxh0.f3376a;
        }
        this.k0 = q7m0.a(obj);
    }

    public final void A(ql5 ql5Var) {
        v3c.N(this.W);
        this.W = sac.V(jiu0.a(this), new j94(1, this.n, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, this.f.b, new me5((Object) ql5Var, (Object) this, (yje) null, (byte) 15), 10);
    }

    public final void B() {
        this.h.f44322a.c("manage_bill_call");
        this.A.f19563a.a(xun.f41520a, 3273L);
        i1w0 i1w0Var = this.b;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        this.i.getClass();
        k0w0VarI.h(new WalletsScreen$WalletsScreen(""));
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void C(boolean z) {
        twn.A(z, this.Y, null);
        p7m0 p7m0Var = this.d0;
        if (z) {
            tk5 tk5Var = new tk5(this.B.f(R.string.balance_management_title, new Object[0]), "");
            p7m0Var.getClass();
            p7m0Var.o(null, tk5Var);
            return;
        }
        if (z) {
            return;
        }
        p7m0 p7m0Var2 = this.c0;
        if (vtb.N(p7m0Var2).f40549a.getValue() instanceof jh5) {
            ql5 ql5Var = this.Q;
            String str = ql5Var != null ? ql5Var.m : null;
            String str2 = str != null ? str : "";
            pn40 pn40Var = pn40.f27267a;
            Object value = p7m0Var2.getValue();
            value.getClass();
            double d = ((jh5) value).c;
            Object value2 = p7m0Var2.getValue();
            value2.getClass();
            tk5 tk5Var2 = new tk5(pn40.d(d, ((jh5) value2).d, p3u0.c), str2);
            p7m0Var.getClass();
            p7m0Var.o(null, tk5Var2);
        }
    }

    public final void D() {
        sac.V(jiu0.a(this), new j94(1, this.n, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, this.f.b, new oj5(this, null, (byte) 3), 10);
    }

    public final void E(ql5 ql5Var) {
        if (ql5Var == null) {
            return;
        }
        byte b = 1;
        sac.V(jiu0.a(this), new yj5(b, this.n, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, this.f.b, new nj5(this, ql5Var, null, b), 10);
    }

    public final void F(List list) {
        list.getClass();
        v3c.N(this.X);
        this.X = sac.V(jiu0.a(this), new yj5(1, this.n, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, this.f.b, new xb2((Object) this, (Object) list, (yje) null, (byte) 2), 10);
    }

    public final void G() {
        p7m0 p7m0Var = this.a0;
        p7m0Var.getClass();
        p7m0Var.o(null, ni5.f23565a);
    }

    public final void H(Throwable th) {
        if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof zhi0)) {
            this.R = true;
        } else {
            this.n.a(th);
        }
    }

    public final void I(Throwable th) {
        this.n.b(th, new gj5(this, (byte) 0));
    }

    public final void J(Throwable th) {
        nk5 nk5Var = new nk5(g2v.d(this.t, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new pw4(0, this, dk5.class, "onRefresh", "onRefresh()V", 0, (byte) 2), 94));
        p7m0 p7m0Var = this.h0;
        p7m0Var.getClass();
        p7m0Var.o(null, nk5Var);
        H(th);
    }

    public final void K(boolean z) {
        i1w0 i1w0Var = this.b;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        FragmentScreen fullHistoryScreen = new FullHistoryScreen(z);
        if (fullHistoryScreen instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fullHistoryScreen)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fullHistoryScreen)));
        }
        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void L(tjz tjzVar) {
        boolean z = tjzVar instanceof sjz;
        qgd qgdVar = this.i;
        l7k l7kVar = this.A;
        ih5 ih5Var = this.j;
        i1w0 i1w0Var = this.b;
        if (z) {
            i8i.D("point", "verification", ih5Var.f14765a, "bill_management_click");
            l7kVar.f19563a.a(cui0.b(new j1p("verification", (byte) 0)), 12369L);
            i1w0Var.getClass();
            k0w0 k0w0Var = new k0w0(i1w0Var);
            k0w0Var.m(qgdVar.g0());
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else if (tjzVar instanceof rjz) {
            i1w0Var.getClass();
            k0w0 k0w0Var2 = new k0w0(i1w0Var);
            qgdVar.getClass();
            k0w0Var2.h(new RewardSystemScreenFactoryImpl$getRewardSystemScreen$1());
            ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0Var2.f17489a, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        } else if (tjzVar instanceof qjz) {
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            rz4.u(this.w, k0w0VarI);
            ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar3 = (paw) listIteratorO3;
                if (!pawVar3.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar3.next());
                }
            }
        } else {
            if (tjzVar instanceof ojz) {
                sac.V(jiu0.a(this), new yj5(1, this.n, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, this.f.b, new cm3(this, tjzVar, null, (byte) 16), 10);
                return;
            }
            if (tjzVar instanceof pjz) {
                P();
                return;
            }
            if (!(tjzVar instanceof njz)) {
                t9f.b();
                return;
            }
            i8i.D("point", "payment_account", ih5Var.f14765a, "bill_management_click");
            l7kVar.f19563a.a(cui0.b(new j1p("payment_account", (byte) 0)), 12369L);
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            FragmentScreen accountNumberScreen = new AccountNumberScreen();
            if (accountNumberScreen instanceof DialogScreen) {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) accountNumberScreen)));
            } else {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(accountNumberScreen)));
            }
            ListIterator listIteratorO4 = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar4 = (paw) listIteratorO4;
                if (!pawVar4.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar4.next());
                }
            }
        }
    }

    public final void M(boolean z) {
        long jA = xru.a(this.g);
        sac.V(jiu0.a(this), new fj5(this, (byte) 1), null, this.f.b, new bk5((byte) 0, jA, null, this, z), 10);
    }

    public final void N() {
        sac.V(jiu0.a(this), new yj5(1, this.n, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 2), null, this.f.f22085a, new ya(this, null, (byte) 6), 10);
    }

    public final void O() {
        sac.V(jiu0.a(this), new yj5(1, this.n, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, this.f.f22085a, new wa(this, null, (byte) 16), 10);
    }

    public final void P() {
        i8i.D("point", "payment_appeal", this.j.f14765a, "bill_management_click");
        this.A.f19563a.a(cui0.b(new j1p("payment_appeal", (byte) 0)), 12369L);
        sac.V(jiu0.a(this), new fj5(this, (byte) 2), null, this.f.b, new oj5(this, null, (byte) 4), 10);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d A[PHI: r2 r9
  0x008d: PHI (r2v5 a.qz40) = (r2v3 a.qz40), (r2v6 a.qz40) binds: [B:27:0x006c, B:35:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x008d: PHI (r9v11 int) = (r9v7 int), (r9v16 int) binds: [B:27:0x006c, B:35:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(ql5 ql5Var, zje zjeVar) {
        ck5 ck5Var;
        int i;
        qz40 qz40Var;
        int i2;
        int i3;
        int i4;
        qz40 qz40Var2;
        boolean z;
        if (zjeVar instanceof ck5) {
            ck5Var = (ck5) zjeVar;
            int i5 = ck5Var.n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ck5Var.n = i5 - Integer.MIN_VALUE;
            } else {
                ck5Var = new ck5(this, zjeVar);
            }
        } else {
            ck5Var = new ck5(this, zjeVar);
        }
        Object objW = ck5Var.l;
        wne wneVar = wne.f39444a;
        int i6 = ck5Var.n;
        if (i6 != 0) {
            if (i6 == 1) {
                i2 = ck5Var.j;
                qz40Var = ck5Var.i;
                z1x.P(objW);
            } else {
                if (i6 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i4 = ck5Var.k;
                qz40Var2 = ck5Var.i;
                z1x.P(objW);
            }
            if (((Boolean) objW).booleanValue()) {
                qz40Var = qz40Var2;
                i3 = i4;
                i4 = i3;
                qz40Var2 = qz40Var;
                z = false;
            } else {
                z = true;
            }
            gk5 gk5Var = new gk5(i4 != 0, z);
            p7m0 p7m0Var = (p7m0) qz40Var2;
            p7m0Var.getClass();
            p7m0Var.o(null, gk5Var);
            return Unit.f46060a;
        }
        z1x.P(objW);
        boolean zA = ql5Var.i.a();
        i = !zA ? 1 : 0;
        qz40Var = this.e0;
        if (zA) {
            i3 = 0;
            if (i != 0) {
                ck5Var.i = qz40Var;
                ck5Var.j = i;
                ck5Var.k = i3;
                ck5Var.n = 2;
                objW = this.z.w(ck5Var);
                if (objW != wneVar) {
                    i4 = i3;
                    qz40Var2 = qz40Var;
                    if (((Boolean) objW).booleanValue()) {
                        z = true;
                    } else {
                        qz40Var = qz40Var2;
                        i3 = i4;
                        i4 = i3;
                        qz40Var2 = qz40Var;
                        z = false;
                    }
                }
            } else {
                i4 = i3;
                qz40Var2 = qz40Var;
                z = false;
            }
            gk5 gk5Var2 = new gk5(i4 != 0, z);
            p7m0 p7m0Var2 = (p7m0) qz40Var2;
            p7m0Var2.getClass();
            p7m0Var2.o(null, gk5Var2);
            return Unit.f46060a;
        }
        ck5Var.i = qz40Var;
        ck5Var.j = i;
        ck5Var.n = 1;
        Object objK = this.y.k(ck5Var);
        if (objK != wneVar) {
            objW = objK;
            i2 = i;
        }
        return wneVar;
        if (((Boolean) objW).booleanValue()) {
            i = i2;
            i3 = 0;
        } else {
            i = i2;
            i3 = 1;
        }
        if (i != 0) {
            ck5Var.i = qz40Var;
            ck5Var.j = i;
            ck5Var.k = i3;
            ck5Var.n = 2;
            objW = this.z.w(ck5Var);
            if (objW != wneVar) {
                i4 = i3;
                qz40Var2 = qz40Var;
                if (((Boolean) objW).booleanValue()) {
                    z = true;
                } else {
                    qz40Var = qz40Var2;
                    i3 = i4;
                    i4 = i3;
                    qz40Var2 = qz40Var;
                    z = false;
                }
            }
            return wneVar;
        }
        i4 = i3;
        qz40Var2 = qz40Var;
        z = false;
        gk5 gk5Var3 = new gk5(i4 != 0, z);
        p7m0 p7m0Var3 = (p7m0) qz40Var2;
        p7m0Var3.getClass();
        p7m0Var3.o(null, gk5Var3);
        return Unit.f46060a;
    }

    public final vk5 R(w9h0 w9h0Var) {
        if (w9h0Var != null) {
            boolean z = w9h0Var instanceof mjz;
            ctf0 ctf0Var = this.B;
            if (z) {
                return j0x.M((mjz) w9h0Var, ctf0Var);
            }
            if (w9h0Var instanceof kfs0) {
                return new lfs0();
            }
            if (w9h0Var instanceof zds0) {
                long j = ((zds0) w9h0Var).f44223a;
                rdj rdjVar = rdj.f30294a;
                return new aes0(rdj.f(new znq0(j), sdj.UNIVERSAL, null, 60), j);
            }
            if (w9h0Var instanceof zfs0) {
                zfs0 zfs0Var = (zfs0) w9h0Var;
                String str = zfs0Var.f;
                ctf0Var.getClass();
                long j2 = zfs0Var.f44314a;
                String str2 = zfs0Var.g;
                long j3 = zfs0Var.b;
                s9m0 s9m0Var = ngs0.c;
                int i = zfs0Var.c;
                s9m0Var.getClass();
                int i2 = s9m0.h(i).f23500a;
                int iA = s9m0.h(i) == ngs0.DOWNWARD ? ctf0Var.a(R.color.static_green) : ctf0.b(R.attr.uikitSecondary, ctf0Var);
                String str3 = str2.length() == 0 ? str : str2;
                String str4 = s9m0.h(i).b;
                pn40 pn40Var = pn40.f27267a;
                return new ogs0(j2, j3, iA, i2, str4.concat(pn40.d(zfs0Var.d, str2, p3u0.c)), zfs0Var.e, str3, str, zfs0Var.c, zfs0Var.d, zfs0Var.h, ctf0Var.h());
            }
            if (w9h0Var instanceof tes0) {
                return ues0.f35545a;
            }
            if (w9h0Var instanceof fxn) {
                return gxn.f12084a;
            }
            if (w9h0Var instanceof sds0) {
                return tds0.f33785a;
            }
        }
        t9f.b();
        return null;
    }

    public final boolean S() {
        if (this.r.j()) {
            return false;
        }
        return this.N.K;
    }

    public final void a() {
        i1w0 i1w0Var = this.b;
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

    public final void w(ql5 ql5Var) {
        if (ql5Var == null) {
            return;
        }
        sac.V(jiu0.a(this), mj5.f21878a, null, null, new nj5(this, ql5Var, null, (byte) 0), 14);
    }

    public final void x() {
        sac.V(jiu0.a(this), new j94(1, this.n, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, this.f.b, new oj5(this, null, (byte) 0), 10);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable y(m2c0 m2c0Var, ql5 ql5Var, zje zjeVar) {
        tj5 tj5Var;
        m2c0 m2c0Var2;
        boolean z;
        boolean zBooleanValue;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        lc00 lc00VarB;
        if (zjeVar instanceof tj5) {
            tj5Var = (tj5) zjeVar;
            int i = tj5Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                tj5Var.m = i - Integer.MIN_VALUE;
            } else {
                tj5Var = new tj5(this, zjeVar);
            }
        } else {
            tj5Var = new tj5(this, zjeVar);
        }
        Object objD = tj5Var.k;
        wne wneVar = wne.f39444a;
        int i2 = tj5Var.m;
        sff0 sff0Var = this.N;
        if (i2 == 0) {
            z1x.P(objD);
            tj5Var.i = m2c0Var;
            tj5Var.m = 1;
            if (Q(ql5Var, tj5Var) != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            m2c0Var = tj5Var.i;
            z1x.P(objD);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = tj5Var.j;
            m2c0Var2 = tj5Var.i;
            z1x.P(objD);
        }
        Boolean bool = (Boolean) objD;
        bool.getClass();
        this.V = bool;
        zBooleanValue = bool.booleanValue();
        boolean z6 = sff0Var.L0;
        z2 = sff0Var.B;
        z3 = sff0Var.b0;
        z4 = sff0Var.Y0;
        z5 = !this.I.f3488a.a().O && sff0Var.d1;
        m2c0Var2.getClass();
        lc00VarB = kotlin.collections.a.b();
        if (!a8k0.B(m2c0Var2) && z) {
            lc00VarB.add(new ljz(zBooleanValue));
        }
        if (z3) {
            lc00VarB.add(jjz.f16641a);
        }
        if (!a8k0.B(m2c0Var2) && z6) {
            lc00VarB.add(hjz.f13183a);
        }
        if (z2) {
            lc00VarB.add(kjz.f18411a);
        }
        if (z4) {
            lc00VarB.add(ijz.f14902a);
        }
        if (z5) {
            lc00VarB.add(gjz.f11422a);
        }
        return kotlin.collections.a.a(lc00VarB);
        boolean z7 = sff0Var.r0;
        tj5Var.i = m2c0Var;
        tj5Var.j = z7;
        tj5Var.m = 2;
        objD = this.x.d(tj5Var);
        if (objD != wneVar) {
            m2c0Var2 = m2c0Var;
            z = z7;
            Boolean bool2 = (Boolean) objD;
            bool2.getClass();
            this.V = bool2;
            zBooleanValue = bool2.booleanValue();
            boolean z8 = sff0Var.L0;
            z2 = sff0Var.B;
            z3 = sff0Var.b0;
            z4 = sff0Var.Y0;
            if (this.I.f3488a.a().O) {
            }
            m2c0Var2.getClass();
            lc00VarB = kotlin.collections.a.b();
            if (!a8k0.B(m2c0Var2)) {
                lc00VarB.add(new ljz(zBooleanValue));
            }
            if (z3) {
                lc00VarB.add(jjz.f16641a);
            }
            if (!a8k0.B(m2c0Var2)) {
                lc00VarB.add(hjz.f13183a);
            }
            if (z2) {
                lc00VarB.add(kjz.f18411a);
            }
            if (z4) {
                lc00VarB.add(ijz.f14902a);
            }
            if (z5) {
                lc00VarB.add(gjz.f11422a);
            }
            return kotlin.collections.a.a(lc00VarB);
        }
        return wneVar;
    }

    public final void z() {
        sac.V(jiu0.a(this), new j94(1, this.n, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, this.f.b, new ex1((Object) this, (yje) null, (byte) 6), 10);
    }
}
