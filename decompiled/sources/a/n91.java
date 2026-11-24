package a;

import android.webkit.WebView;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class n91 extends i3t0 {
    public static final /* synthetic */ int f0 = 0;
    public final es A;
    public final kki B;
    public final trm0 C;
    public final wyb D;
    public final qoc E;
    public final yzn0 F;
    public final ubu G;
    public final tqx H;
    public final do20 I;
    public final nrt J;
    public final urt K;
    public final mii0 L;
    public final v88 M;
    public final mrt N;
    public final nou O;
    public final lrc P;
    public final ih5 Q;
    public final l7k R;
    public final s64 S;
    public final cmt T;
    public final zg U;
    public final au0 V;
    public final ytt W;
    public bby X;
    public bby Y;
    public bby Z;
    public c4m0 a0;
    public bby b0;
    public bby c0;
    public bby d0;
    public final zw0 e0;
    public final ctf0 o;
    public final duj p;
    public final mne q;
    public final i1w0 r;
    public final hcp0 s;
    public final khf0 t;
    public final xex u;
    public final zn00 v;
    public final fv70 w;
    public final gv70 x;
    public final ntu y;
    public final a6u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n91(us00 us00Var, n71 n71Var, ctf0 ctf0Var, duj dujVar, mne mneVar, i1w0 i1w0Var, j1q0 j1q0Var, hcp0 hcp0Var, iqt iqtVar, kc60 kc60Var, khf0 khf0Var, xex xexVar, zn00 zn00Var, fv70 fv70Var, gv70 gv70Var, ntu ntuVar, a6u a6uVar, es esVar, kki kkiVar, trm0 trm0Var, wyb wybVar, qoc qocVar, yzn0 yzn0Var, ubu ubuVar, tqx tqxVar, do20 do20Var, nrt nrtVar, urt urtVar, mii0 mii0Var, pru pruVar, v88 v88Var, mrt mrtVar, nou nouVar, lrc lrcVar, ih5 ih5Var, l7k l7kVar, s64 s64Var, cmt cmtVar, zg zgVar, au0 au0Var, bzt bztVar, ytt yttVar) {
        super(null, new ng0(pruVar, (Object) n71Var, (Object) j1q0Var, iqtVar, (Object) bztVar, (byte) 1), new uc(ctf0Var, (byte) 9), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        j1q0Var.getClass();
        this.o = ctf0Var;
        this.p = dujVar;
        this.q = mneVar;
        this.r = i1w0Var;
        this.s = hcp0Var;
        this.t = khf0Var;
        this.u = xexVar;
        this.v = zn00Var;
        this.w = fv70Var;
        this.x = gv70Var;
        this.y = ntuVar;
        this.z = a6uVar;
        this.A = esVar;
        this.B = kkiVar;
        this.C = trm0Var;
        this.D = wybVar;
        this.E = qocVar;
        this.F = yzn0Var;
        this.G = ubuVar;
        this.H = tqxVar;
        this.I = do20Var;
        this.J = nrtVar;
        this.K = urtVar;
        this.L = mii0Var;
        this.M = v88Var;
        this.N = mrtVar;
        this.O = nouVar;
        this.P = lrcVar;
        this.Q = ih5Var;
        this.R = l7kVar;
        this.S = s64Var;
        this.T = cmtVar;
        this.U = zgVar;
        this.V = au0Var;
        this.W = yttVar;
        this.e0 = new zw0(us00Var, mneVar);
        yje yjeVar = null;
        i3t0.K(this, null, new x81(this, (byte) 1), new y81(this, yjeVar, (byte) 5), 1);
        dvj dvjVar = mneVar.b;
        I(dvjVar, new c21(1, this, n91.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), new y81(this, yjeVar, (byte) 4));
        O();
        i3t0.L(this, new fnq(dtb.z(kc60Var.a(), 1), new i91(this, yjeVar, (byte) 0), (byte) 4), dvjVar, null, 2);
    }

    public final void M() {
        i3t0.K(this, null, new x81(this, (byte) 4), new za(this, null, (byte) 6), 1);
    }

    public final void N() {
        int i = (int) ((u81) D()).f35213a.f22006a;
        int i2 = (int) ((u81) D()).i;
        boolean z = ((u81) D()).d;
        zg zgVar = this.U;
        zgVar.getClass();
        zgVar.f44322a.a("aggregator_demo_call", xp20.f(new Pair("screen", "aggregator_game_screen"), new Pair("game_id", Integer.valueOf(i)), new Pair("currency_id", Integer.valueOf(i2)), new Pair("option", z ? "money" : "demo")));
        int i3 = (int) ((u81) D()).f35213a.f22006a;
        int i4 = (int) ((u81) D()).i;
        boolean z2 = ((u81) D()).d;
        au0 au0Var = this.V;
        au0Var.getClass();
        byte b = 1;
        au0Var.f1455a.a(tx3.l0(new k1p[]{new i1p(i3, (byte) 2), new i1p(i4, (byte) 0), new j1p(z2 ? "money" : "demo", (byte) 0)}), 11439L);
        if (!((u81) D()).d) {
            U();
            return;
        }
        boolean z3 = ((u81) D()).c;
        yje yjeVar = null;
        mne mneVar = this.q;
        if (z3) {
            I(mneVar.b, new c21(1, this, n91.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), new f91(this, null));
        } else {
            I(mneVar.b, new c21(1, this, n91.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 9), new z81(this, yjeVar, b));
        }
    }

    public final void O() {
        if (((u81) D()).l) {
            e3c.n(this.Y);
            this.Y = i3t0.K(this, this.q.b, null, new y81(this, null, (byte) 3), 2);
        }
    }

    public final void P() {
        Object value;
        bby bbyVar = this.Z;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, u81.a((u81) value, null, false, false, false, null, null, 0L, false, false, null, false, true, false, 0, null, 2047999)));
            byte b = 0;
            this.Z = sac.V(jiu0.a(this), a91.f454a, new w81(this, b), null, new b91(this, null, b), 12);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:12|13|70|22|(1:25)|60) */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        r6 = r10;
        r10 = r11;
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c5, code lost:
    
        if (a.qcc.O(3000, r0) == r1) goto L60;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00c5 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable Q(a.zje r11) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n91.Q(a.zje):java.io.Serializable");
    }

    public final void R(Throwable th) {
        this.p.b(th, new o00(this, (byte) 13));
    }

    public final void S() {
        I(this.q.b, new c21(1, this, n91.class, "handleGameLoadingException", "handleGameLoadingException(Ljava/lang/Throwable;)V", 0, (byte) 10), new g91(this, null));
    }

    public final void T() {
        e3c.n(this.a0);
        e3c.n(this.b0);
        if (!((u81) D()).l || ((u81) D()).d) {
            return;
        }
        e3c.n(this.b0);
        mne mneVar = this.q;
        yje yjeVar = null;
        this.b0 = i3t0.K(this, mneVar.b, null, new m91(this, yjeVar, (byte) 0), 2);
        this.a0 = i3t0.L(this, new fnq(i120.W(new t7h(((tg5) this.N.f22289a.b).d, ((u81) D()).i, (byte) 3)), new i91(this, yjeVar, (byte) 1), (byte) 4), mneVar.b, null, 2);
    }

    public final void U() {
        if (!((u81) D()).d) {
            S();
            return;
        }
        long j = ((u81) D()).i;
        yje yjeVar = null;
        mne mneVar = this.q;
        if (j == 0) {
            I(mneVar.b, new c21(1, this, n91.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 11), new hr(this, yjeVar, (byte) 2));
            return;
        }
        if (!((u81) D()).f35213a.m) {
            S();
            return;
        }
        I(mneVar.b, new c21(1, this, n91.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 5), new y81(this, yjeVar, (byte) 1));
    }

    public final void V() {
        sac.V(jiu0.a(this), new eo0((byte) 20), null, null, new j91(this, null, (byte) 0), 14);
    }

    public final void W() {
        Object value;
        u81 u81Var;
        bby bbyVar = this.c0;
        if (bbyVar != null && bbyVar.isActive() && ((u81) D()).d) {
            return;
        }
        boolean z = ((u81) D()).d;
        bby bbyVar2 = this.c0;
        if (z) {
            e3c.n(bbyVar2);
            this.c0 = i3t0.K(this, null, null, new y81(this, null, (byte) 6), 3);
            return;
        }
        e3c.n(bbyVar2);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            u81Var = (u81) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, u81.a(u81Var, null, false, false, false, null, null, 0L, false, false, null, false, false, false, u81Var.n.b.G, null, 1966079)));
    }

    @Override // a.diu0
    public final void v() {
        zw0 zw0Var = this.e0;
        zw0Var.b();
        zw0Var.h = null;
        zw0Var.f = null;
        zw0Var.i = null;
        zw0Var.j = null;
        zw0Var.k = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        u81 u81Var;
        Object value4;
        Object value5;
        WebView webView;
        Object value6;
        Object value7;
        u81 u81Var2;
        h71 h71Var = (h71) obj;
        h71Var.getClass();
        if (((u81) D()).p && !(h71Var instanceof r61)) {
            return;
        }
        boolean z = h71Var instanceof d71;
        zw0 zw0Var = this.e0;
        if (z) {
            zw0Var.c.setBaseContext(((d71) h71Var).f5573a);
            return;
        }
        if (h71Var.equals(e71.f7311a)) {
            zw0Var.c.setBaseContext(zw0Var.f45083a);
            return;
        }
        if (h71Var.equals(o61.f24710a)) {
            V();
            return;
        }
        if (h71Var.equals(f71.f9037a)) {
            P();
            return;
        }
        if (h71Var.equals(r61.f29913a)) {
            E();
            return;
        }
        boolean z2 = h71Var instanceof u61;
        byte b = 3;
        byte b2 = 0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        zg zgVar = this.U;
        mne mneVar = this.q;
        byte b3 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        if (z2) {
            int i = ((u61) h71Var).f35117a;
            oz30[] oz30VarArr = oz30.f26086a;
            if (i == 0) {
                N();
                return;
            }
            if (i == 1) {
                I(mneVar.b, new x81(this, b), new z81(this, objArr9 == true ? 1 : 0, b2));
                return;
            }
            if (i == 2) {
                int i2 = (int) ((u81) D()).f35213a.f22006a;
                boolean z3 = ((u81) D()).k;
                zgVar.getClass();
                zgVar.f44322a.a("aggregator_game_expand", xp20.f(new Pair("screen", "aggregator_game_screen"), new Pair("game_id", Integer.valueOf(i2)), new Pair("action", z3 ? "hide" : "expand")));
                int i3 = (int) ((u81) D()).f35213a.f22006a;
                boolean z4 = ((u81) D()).k;
                au0 au0Var = this.V;
                au0Var.getClass();
                au0Var.f1455a.a(tx3.l0(new k1p[]{new i1p(i3, (byte) 2), new j1p(z4 ? "hide" : "expand", (byte) 0)}), 11438L);
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value7 = p7m0Var.getValue();
                    value7.getClass();
                    u81Var2 = (u81) value7;
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value7, u81.a(u81Var2, null, false, false, false, null, null, 0L, !u81Var2.k, false, null, false, false, false, 0, null, 2096127)));
                G(new s71(((u81) D()).k));
                return;
            }
            return;
        }
        boolean zEquals = h71Var.equals(v61.f36850a);
        u71 u71Var = u71.f35161a;
        s64 s64Var = this.S;
        if (zEquals) {
            i8i.D("screen", "aggregator_game_screen", zgVar.f44322a, "login_page_call");
            y1p y1pVar = y1p.MAIN;
            s64Var.c("aggregator_game_screen");
            if (((u81) D()).n.N.q == kse0.SIMPLE_SCREEN) {
                G(u71Var);
            }
            sac.V(jiu0.a(this), d91.f5677a, null, null, new b91(this, objArr8 == true ? 1 : 0, b3), 14);
            return;
        }
        boolean zEquals2 = h71Var.equals(w61.f38605a);
        i1w0 i1w0Var = this.r;
        cmt cmtVar = this.T;
        if (zEquals2) {
            this.Q.e((int) ((u81) D()).f35213a.f22006a, k7k.AggregatorGame);
            int i4 = (int) ((u81) D()).f35213a.f22006a;
            y1p y1pVar2 = y1p.MAIN;
            this.R.a(i4, "aggregator_game_screen", cmtVar.g());
            this.M.a(i1w0Var, true, ((u81) D()).i);
            return;
        }
        if (h71Var.equals(x61.f40339a)) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value6 = p7m0Var2.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value6, u81.a((u81) value6, null, false, false, false, null, null, 0L, false, false, null, false, false, false, 0, null, 1835007)));
            return;
        }
        if (h71Var.equals(q61.f28178a)) {
            ax0 ax0Var = (ax0) CollectionsKt.f0(zw0Var.d);
            if (ax0Var != null && (webView = ax0Var.f1599a) != null && webView.canGoBack()) {
                webView.goBack();
                return;
            }
            if (!zw0Var.d.isEmpty()) {
                zw0Var.g();
                return;
            }
            Function0 function0 = zw0Var.h;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        byte b4 = 4;
        if (h71Var.equals(z61.f43842a)) {
            i8i.D("screen", "aggregator_game_screen", zgVar.f44322a, "reg_page_call");
            s64Var.d(y1p.AGGREGATOR_GAME_SCREEN, cmtVar.g());
            sac.V(jiu0.a(this), h91.f12655a, null, null, new b91(this, objArr7 == true ? 1 : 0, b4), 14);
            return;
        }
        if (h71Var instanceof i61) {
            ((u81) D()).u.remove(ju0.b);
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value5 = p7m0Var3.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value5, u81.a((u81) value5, null, false, false, false, null, null, ((i61) h71Var).f14219a.f28916a, false, false, null, false, false, false, 0, null, 2096895)));
            U();
            return;
        }
        if (h71Var instanceof j61) {
            ((u81) D()).u.remove(ju0.f17126a);
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value4 = p7m0Var4.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value4, u81.a((u81) value4, null, false, false, false, null, null, ((j61) h71Var).f15961a.f28916a, false, false, null, false, false, false, 0, null, 2096895)));
            I(mneVar.b, new c21(1, this, n91.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 6), new y81(this, objArr6 == true ? 1 : 0, (byte) 2));
            return;
        }
        if (h71Var.equals(k61.f17744a)) {
            ((u81) D()).u.add(ju0.b);
            G(z71.f43895a);
            return;
        }
        if (h71Var.equals(l61.f19484a)) {
            I(mneVar.b, new c21(1, this, n91.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 4), new y81(this, objArr5 == true ? 1 : 0, (byte) 0));
            return;
        }
        if (h71Var.equals(n61.f22972a)) {
            M();
            return;
        }
        if (!(h71Var instanceof p61)) {
            if (h71Var.equals(s61.f31680a)) {
                ((u81) D()).u.add(ju0.f);
                G(n81.f23066a);
                return;
            }
            if (h71Var instanceof g71) {
                ((u81) D()).u.remove(ju0.f);
                I(mneVar.b, new x81(this, (byte) 0), new za(this, ((g71) h71Var).f10790a, objArr4 == true ? 1 : 0, (byte) 7));
                return;
            }
            if (h71Var instanceof b71) {
                xw90 xw90Var = ((b71) h71Var).f2081a;
                ((u81) D()).u.remove(ju0.e);
                bby bbyVar = this.c0;
                if (bbyVar != null) {
                    e3c.n(bbyVar);
                }
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var5.getValue();
                    value3.getClass();
                    u81Var = (u81) value3;
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value3, u81.a(u81Var, null, false, false, false, null, null, 0L, false, false, null, false, false, false, u81Var.n.b.H, null, 1966079)));
                int iOrdinal = xw90Var.ordinal();
                if (iOrdinal == 0) {
                    sac.V(jiu0.a(this), h91.f12655a, null, null, new b91(this, objArr == true ? 1 : 0, b4), 14);
                    return;
                }
                if (iOrdinal == 1) {
                    if (((u81) D()).n.N.q == kse0.SIMPLE_SCREEN) {
                        G(u71Var);
                    }
                    sac.V(jiu0.a(this), e91.f7399a, null, null, new b91(this, objArr2 == true ? 1 : 0, (byte) 2), 14);
                    return;
                } else if (iOrdinal == 2) {
                    N();
                    W();
                    return;
                } else if (iOrdinal == 3) {
                    e3c.n(this.d0);
                    this.d0 = sac.V(jiu0.a(this), new x81(this, (byte) 2), new w81(this, (byte) 1), mneVar.b, new b91(this, objArr3 == true ? 1 : 0, (byte) 3), 8);
                    return;
                } else if (iOrdinal == 4) {
                    W();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            if (h71Var.equals(c71.f3839a)) {
                zw0Var.f();
                Set set = ((u81) D()).u;
                Set set2 = set.isEmpty() ? null : set;
                if (set2 != null) {
                    G(new w71(CollectionsKt.L0(set2)));
                }
                G(new s71(((u81) D()).k));
                if (((u81) D()).q) {
                    p7m0 p7m0Var6 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var6.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var6.m(value2, u81.a((u81) value2, null, false, false, false, null, null, 0L, false, false, null, false, false, false, 0, null, 2031615)));
                    N();
                }
                W();
                return;
            }
            if (h71Var.equals(a71.f343a)) {
                zw0Var.e();
                return;
            }
            if (!h71Var.equals(m61.f21244a)) {
                if (h71Var.equals(y61.f42073a)) {
                    G(v71.f36900a);
                    return;
                } else if (h71Var.equals(t61.f33393a)) {
                    G(s81.f31780a);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            if (((u81) D()).q) {
                p7m0 p7m0Var7 = ocjVar.f25029a;
                do {
                    value = p7m0Var7.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var7.m(value, u81.a((u81) value, null, false, false, false, null, null, 0L, false, false, null, false, false, false, 0, null, 2031615)));
                N();
            }
            W();
            return;
        }
        p61 p61Var = (p61) h71Var;
        boolean z5 = p61Var.f26430a;
        if (p61Var.b) {
            this.H.a(!z5);
            M();
            return;
        }
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
