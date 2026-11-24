package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class g9b0 extends w3k {
    public final nhf0 A;
    public final hs60 B;
    public final gw60 C;
    public final uxs0 D;
    public final ouu E;
    public final p7m0 F;
    public final ol60 G;
    public final ol60 H;
    public Long I;
    public boolean J;
    public c4m0 K;
    public bby L;
    public bby M;
    public bby N;
    public bby O;
    public j0g0 P;
    public final k050 Q;
    public final p7m0 R;
    public final p7m0 S;
    public final p7m0 T;
    public final p7m0 U;
    public final xae0 V;
    public final xcc c;
    public final oif0 d;
    public final m1e e;
    public final ntu f;
    public final scu g;
    public final mne h;
    public final ls i;
    public final uf3 j;
    public final p4u k;
    public final jru l;
    public final m0u m;
    public final z4u n;
    public final iqt o;
    public final g2v p;
    public final jw20 q;
    public final cdu r;
    public final khf0 s;
    public final dcu t;
    public final c8b0 u;
    public final lbu v;
    public final o3c w;
    public final l570 x;
    public final i1w0 y;
    public final jdu z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9b0(xcc xccVar, oif0 oif0Var, m1e m1eVar, ntu ntuVar, scu scuVar, mne mneVar, ls lsVar, uf3 uf3Var, uzc0 uzc0Var, p4u p4uVar, jru jruVar, m0u m0uVar, z4u z4uVar, iqt iqtVar, yoc yocVar, g2v g2vVar, ort ortVar, jw20 jw20Var, cdu cduVar, khf0 khf0Var, dcu dcuVar, c8b0 c8b0Var, jlx jlxVar, grj grjVar, lbu lbuVar, o3c o3cVar, l570 l570Var, i1w0 i1w0Var, jdu jduVar, kc60 kc60Var, nhf0 nhf0Var, hs60 hs60Var, gw60 gw60Var, uxs0 uxs0Var, vzg0 vzg0Var, ouu ouuVar) {
        super(vzg0Var, q3d.j(c8b0Var, l570Var));
        m0uVar.getClass();
        i1w0Var.getClass();
        this.c = xccVar;
        this.d = oif0Var;
        this.e = m1eVar;
        this.f = ntuVar;
        this.g = scuVar;
        this.h = mneVar;
        this.i = lsVar;
        this.j = uf3Var;
        this.k = p4uVar;
        this.l = jruVar;
        this.m = m0uVar;
        this.n = z4uVar;
        this.o = iqtVar;
        this.p = g2vVar;
        this.q = jw20Var;
        this.r = cduVar;
        this.s = khf0Var;
        this.t = dcuVar;
        this.u = c8b0Var;
        this.v = lbuVar;
        this.w = o3cVar;
        this.x = l570Var;
        this.y = i1w0Var;
        this.z = jduVar;
        this.A = nhf0Var;
        this.B = hs60Var;
        this.C = gw60Var;
        this.D = uxs0Var;
        this.E = ouuVar;
        this.F = q7m0.a(w8b0.f38715a);
        this.G = new ol60(3);
        this.H = new ol60(3);
        iun iunVar = iun.f15405a;
        this.Q = new k050();
        l8b0 l8b0Var = l8b0.f19596a;
        p7m0 p7m0VarA = q7m0.a(l8b0Var);
        this.R = p7m0VarA;
        p7m0 p7m0VarA2 = q7m0.a(l8b0Var);
        this.S = p7m0VarA2;
        p7m0 p7m0VarA3 = q7m0.a(l8b0Var);
        this.T = p7m0VarA3;
        p7m0 p7m0VarA4 = q7m0.a(l8b0Var);
        this.U = p7m0VarA4;
        yje yjeVar = null;
        dnq dnqVar = new dnq(dub.e0(p7m0VarA, p7m0VarA2, p7m0VarA3, p7m0VarA4, new lxt(this, yjeVar, (byte) 4)), new ib60(this, yjeVar, (byte) 6), (byte) 1);
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = mneVar.b;
        this.V = vtb.h0(dnqVar, d5c.S(bvcVarA, dvjVar), new o6m0(Long.MAX_VALUE), iunVar);
        sac.T(new fnq(kc60Var.a(), new a9b0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), dvjVar), d9b0.h);
    }

    public static boolean y(q8b0 q8b0Var) {
        return (q8b0Var instanceof n8b0) && !hic.C(((n8b0) q8b0Var).f23081a);
    }

    public final void A(s8b0 s8b0Var) {
        Object value;
        q8b0 q8b0Var;
        p7m0 p7m0Var;
        Object value2;
        Object obj;
        bby bbyVar;
        Object value3;
        q8b0 q8b0Var2;
        yje yjeVar = null;
        this.P = null;
        byte b = 0;
        boolean z = s8b0Var != s8b0.f31793a;
        p7m0 p7m0Var2 = this.R;
        q8b0 q8b0Var3 = (q8b0) p7m0Var2.getValue();
        boolean z2 = (q8b0Var3 instanceof n8b0) && agc.L(((n8b0) q8b0Var3).f23081a) && y(q8b0Var3);
        bby bbyVar2 = this.L;
        m8b0 m8b0Var = m8b0.f21362a;
        mne mneVar = this.h;
        if ((bbyVar2 == null || !bbyVar2.isActive()) && (!z || !z2)) {
            do {
                value = p7m0Var2.getValue();
                q8b0Var = (q8b0) value;
                if (!(q8b0Var instanceof p8b0) && !(q8b0Var instanceof n8b0)) {
                    q8b0Var = m8b0Var;
                }
            } while (!p7m0Var2.m(value, q8b0Var));
            hie0 hie0Var = new hie0();
            hie0Var.f13108a = s8b0Var == s8b0.f31793a;
            this.L = sac.V(jiu0.a(this), new j8b0(this, (byte) 5), null, mneVar.b, new qe5((Object) this, (Object) hie0Var, yjeVar, (byte) 10), 10);
        }
        sac.V(jiu0.a(this), new j8b0(this, b), null, mneVar.b, new er60((Object) this, yjeVar, (byte) 16), 10);
        p7m0 p7m0Var3 = this.T;
        if (!(p7m0Var3.getValue() instanceof p8b0) && (((bbyVar = this.N) == null || !bbyVar.isActive()) && (s8b0Var != s8b0.b || !z()))) {
            do {
                value3 = p7m0Var3.getValue();
                q8b0Var2 = (q8b0) value3;
                if (!(q8b0Var2 instanceof p8b0)) {
                    q8b0Var2 = m8b0Var;
                }
            } while (!p7m0Var3.m(value3, q8b0Var2));
            this.N = sac.W(jiu0.a(this), s8b0Var == s8b0.f31793a, "PopularClassicOneXGamesViewModel.getLuckyWheel", mneVar.b, new j8b0(this, (byte) 4), new z8b0(this, yjeVar, b));
        }
        bby bbyVar3 = this.M;
        if (bbyVar3 == null || !bbyVar3.isActive()) {
            if (s8b0Var == s8b0.b && z()) {
                return;
            }
            do {
                p7m0Var = this.S;
                value2 = p7m0Var.getValue();
                obj = (q8b0) value2;
                if (!(obj instanceof p8b0)) {
                    obj = l8b0.f19596a;
                }
            } while (!p7m0Var.m(value2, obj));
            this.M = sac.W(jiu0.a(this), s8b0Var == s8b0.f31793a, "PopularClassicOneXGamesViewModel.getGames", mneVar.b, new j8b0(this, (byte) 6), new er60((Object) this, yjeVar, (byte) 17));
        }
    }

    public final void B(Throwable th) {
        sac.V(jiu0.a(this), b9b0.f2201a, null, this.h.f22085a, new o690((Object) this, (Object) th, (yje) null, (byte) 13), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(zje zjeVar) {
        c9b0 c9b0Var;
        if (zjeVar instanceof c9b0) {
            c9b0Var = (c9b0) zjeVar;
            int i = c9b0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c9b0Var.k = i - Integer.MIN_VALUE;
            } else {
                c9b0Var = new c9b0(this, zjeVar);
            }
        } else {
            c9b0Var = new c9b0(this, zjeVar);
        }
        Object objA = c9b0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = c9b0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.f.a();
            long jA = s470.LUCKY_WHEEL.a();
            c9b0Var.k = 1;
            objA = this.g.a(jA, c9b0Var, strA);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return Boolean.valueOf(((pbv) objA).q);
    }

    public final void D(String str, mo60 mo60Var, String str2, String str3) {
        mo60Var.getClass();
        str2.getClass();
        bby bbyVar = this.O;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.O = sac.V(jiu0.a(this), new wma0(1, this, g9b0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, this.h.b, new se5(mo60Var, this, str3, null), 10);
        }
    }

    public final void E(String str, String str2) {
        str2.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str2);
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        i1w0 i1w0Var = this.y;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        k0w0VarI.h(this.j.e(iIntValue));
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F(mo60 mo60Var, zje zjeVar) {
        f9b0 f9b0Var;
        long j;
        if (zjeVar instanceof f9b0) {
            f9b0Var = (f9b0) zjeVar;
            int i = f9b0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                f9b0Var.l = i - Integer.MIN_VALUE;
            } else {
                f9b0Var = new f9b0(this, zjeVar);
            }
        } else {
            f9b0Var = new f9b0(this, zjeVar);
        }
        Object obj = f9b0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = f9b0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            long jD = x1x.D(mo60Var.b);
            f9b0Var.i = jD;
            f9b0Var.l = 1;
            Object objA = this.n.a(jD, f9b0Var);
            if (objA == wneVar) {
                return wneVar;
            }
            obj = objA;
            j = jD;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = f9b0Var.i;
            z1x.P(obj);
        }
        boolean z = !((Boolean) obj).booleanValue();
        FragmentScreen fragmentScreenM0 = jtv.M0(6, j, null);
        if (fragmentScreenM0 != null) {
            i1w0 i1w0Var = this.y;
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            c8d c8dVar = (c8d) k0w0VarI.h(fragmentScreenM0).f14945a;
            bjk bjkVar = cfx0.o;
            c8dVar.f3908a = new v7d(z, bjkVar, bjkVar);
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        }
        return Unit.f46060a;
    }

    public final void G(boolean z) {
        t8b0 t8b0Var = new t8b0(g2v.d(this.p, pb10.g, null, null, z ? R.string.data_empty_games_error : R.string.data_retrieval_error, z ? R.string.empty_str : R.string.try_again_text, new rd7((Object) this, z, (byte) 14), 94), z, false);
        p7m0 p7m0Var = this.F;
        p7m0Var.getClass();
        p7m0Var.o(null, t8b0Var);
    }

    public final void H() {
        t8b0 t8b0Var = new t8b0(g2v.d(this.p, pb10.r1, okm.b, null, R.string.games_section_technical_works_descr, R.string.continue_action, new k8b0(this, (byte) 0), 84), false, true);
        p7m0 p7m0Var = this.F;
        p7m0Var.getClass();
        p7m0Var.o(null, t8b0Var);
    }

    public final void w(long j) {
        sac.V(jiu0.a(this), new wma0(1, this, g9b0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, this.h.b, new wn10(this, j, null, (byte) 9), 10);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:41:0x008a, B:43:0x0090, B:45:0x0094, B:48:0x009b, B:49:0x009e, B:51:0x00a9, B:40:0x0082), top: B:58:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:41:0x008a, B:43:0x0090, B:45:0x0094, B:48:0x009b, B:49:0x009e, B:51:0x00a9, B:40:0x0082), top: B:58:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x009b A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:41:0x008a, B:43:0x0090, B:45:0x0094, B:48:0x009b, B:49:0x009e, B:51:0x00a9, B:40:0x0082), top: B:58:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #1 {all -> 0x0098, blocks: (B:41:0x008a, B:43:0x0090, B:45:0x0094, B:48:0x009b, B:49:0x009e, B:51:0x00a9, B:40:0x0082), top: B:58:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(zje zjeVar) throws Throwable {
        y8b0 y8b0Var;
        i050 i050Var;
        i050 i050Var2;
        Throwable th;
        g9b0 g9b0Var;
        Object g0g0Var;
        Throwable thA;
        j0g0 j0g0Var;
        if (zjeVar instanceof y8b0) {
            y8b0Var = (y8b0) zjeVar;
            int i = y8b0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                y8b0Var.m = i - Integer.MIN_VALUE;
            } else {
                y8b0Var = new y8b0(this, zjeVar);
            }
        } else {
            y8b0Var = new y8b0(this, zjeVar);
        }
        Object obj = y8b0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = y8b0Var.m;
        try {
            try {
                if (i2 == 0) {
                    z1x.P(obj);
                    j0g0 j0g0Var2 = this.P;
                    if (j0g0Var2 != null) {
                        z1x.P(j0g0Var2.f15681a);
                    }
                    i050Var = this.Q;
                    y8b0Var.i = i050Var;
                    y8b0Var.m = 1;
                    if (i050Var.d(y8b0Var) != wneVar) {
                    }
                    return wneVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g9b0Var = y8b0Var.j;
                    i050Var2 = y8b0Var.i;
                    try {
                        z1x.P(obj);
                        g0g0Var = Unit.f46060a;
                        e0g0 e0g0Var = j0g0.b;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = new g0g0(th);
                        } catch (Throwable th3) {
                            th = th3;
                            i050Var = i050Var2;
                            i050Var.c(null);
                            throw th;
                        }
                    }
                    thA = j0g0.a(g0g0Var);
                    if (thA != null) {
                        if (thA instanceof sq60) {
                            H();
                        } else {
                            thA.printStackTrace();
                        }
                    }
                    g9b0Var.P = new j0g0(g0g0Var);
                    j0g0Var = this.P;
                    if (j0g0Var != null) {
                        z1x.P(j0g0Var.f15681a);
                    }
                    i050Var2.c(null);
                    return Unit.f46060a;
                }
                i050 i050Var3 = y8b0Var.i;
                z1x.P(obj);
                i050Var = i050Var3;
                e0g0 e0g0Var3 = j0g0.b;
                o3c o3cVar = this.w;
                y8b0Var.i = i050Var;
                y8b0Var.j = this;
                y8b0Var.m = 2;
                if (o3c.p(o3cVar, false, y8b0Var, 3) != wneVar) {
                    g9b0Var = this;
                    i050Var2 = i050Var;
                    g0g0Var = Unit.f46060a;
                    e0g0 e0g0Var4 = j0g0.b;
                    thA = j0g0.a(g0g0Var);
                    if (thA != null) {
                        if (thA instanceof sq60) {
                            H();
                        } else {
                            thA.printStackTrace();
                        }
                    }
                    g9b0Var.P = new j0g0(g0g0Var);
                    j0g0Var = this.P;
                    if (j0g0Var != null) {
                        z1x.P(j0g0Var.f15681a);
                    }
                    i050Var2.c(null);
                    return Unit.f46060a;
                }
                return wneVar;
            } catch (Throwable th4) {
                i050Var2 = i050Var;
                th = th4;
                g9b0Var = this;
                e0g0 e0g0Var5 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            j0g0 j0g0Var3 = this.P;
            if (j0g0Var3 != null) {
                z1x.P(j0g0Var3.f15681a);
            }
        } catch (Throwable th5) {
            th = th5;
            i050Var.c(null);
            throw th;
        }
    }

    public final boolean z() {
        return y((q8b0) this.R.getValue()) && y((q8b0) this.S.getValue()) && y((q8b0) this.T.getValue());
    }
}
