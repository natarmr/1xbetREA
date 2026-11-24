package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bethistory.domain.model.GeneralBetInfoModel;
import org.xplatform.bethistory.history.domain.model.BetHistoryFilterItemModel;
import org.xplatform.ui_core.resources.UiText;

/* JADX INFO: loaded from: classes3.dex */
public final class naw extends w3k {
    public static final List d1 = q3d.j(s77.EVENTS, s77.TOTO, s77.JACKPOT, s77.AUTO, s77.AGGREGATOR);
    public final k9u A;
    public final String A0;
    public final edu B;
    public final String B0;
    public final fvt0 C;
    public ql5 C0;
    public final nsc D;
    public s77 D0;
    public final nsc E;
    public String E0;
    public final rrc F;
    public boolean F0;
    public final es G;
    public long G0;
    public final cmt H;
    public long H0;
    public final m1e I;
    public final ArrayList I0;
    public final td9 J;
    public boolean J0;
    public final v88 K;
    public Boolean K0;
    public final mne L;
    public bby L0;
    public final duj M;
    public c4m0 M0;
    public final peg0 N;
    public boolean N0;
    public final i1w0 O;
    public int O0;
    public final ouu P;
    public boolean P0;
    public final sa10 Q;
    public final sff0 Q0;
    public final z4w R;
    public final v8d R0;
    public final s2m0 S;
    public final boolean S0;
    public final org.xplatform.toto_bet.core.navigation.a T;
    public boolean T0;
    public final aau U;
    public GeneralBetInfoModel U0;
    public final wti V;
    public boolean V0;
    public final ctf0 W;
    public final p7m0 W0;
    public final r4v X;
    public final p7m0 X0;
    public final iqt Y;
    public final p7m0 Y0;
    public final r9u Z;
    public final ol60 Z0;
    public final tqt a0;
    public final ol60 a1;
    public final jpc b0;
    public final ax5 b1;
    public final vzg0 c;
    public final r7v c0;
    public final p7m0 c1;
    public final sys0 d;
    public final kpc d0;
    public final ort e;
    public final luu e0;
    public final a6u f;
    public final hpc f0;
    public final f7u g;
    public final kpc g0;
    public final b8u h;
    public final nrt h0;
    public final khf0 i;
    public final ocl i0;
    public final ywq0 j;
    public final hpc j0;
    public final wwv k;
    public final wgu k0;
    public final mmt l;
    public final q37 l0;
    public final nv20 m;
    public final ih5 m0;
    public final wwv n;
    public final gg5 n0;
    public final cnt o;
    public final jru o0;
    public final dv3 p;
    public final y3v p0;
    public final ehf0 q;
    public final rjo q0;
    public final dv3 r;
    public final jh70 r0;
    public final lef0 s;
    public final pzu s0;
    public final wwv t;
    public final nh70 t0;
    public final z220 u;
    public final e1u u0;
    public final pru v;
    public final eyg0 v0;
    public final z220 w;
    public final cmt w0;
    public final yyu x;
    public final long x0;
    public final vpt y;
    public final long y0;
    public final upt z;
    public final s77 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(vzg0 vzg0Var, sys0 sys0Var, ort ortVar, a6u a6uVar, f7u f7uVar, b8u b8uVar, khf0 khf0Var, ywq0 ywq0Var, wwv wwvVar, mmt mmtVar, nv20 nv20Var, wwv wwvVar2, cnt cntVar, dv3 dv3Var, ehf0 ehf0Var, dv3 dv3Var2, lef0 lef0Var, wwv wwvVar3, z220 z220Var, pru pruVar, czt cztVar, z220 z220Var2, dzt dztVar, yyu yyuVar, vpt vptVar, upt uptVar, k9u k9uVar, edu eduVar, fvt0 fvt0Var, nsc nscVar, nsc nscVar2, rrc rrcVar, es esVar, cmt cmtVar, m1e m1eVar, td9 td9Var, v88 v88Var, mne mneVar, duj dujVar, peg0 peg0Var, i1w0 i1w0Var, ouu ouuVar, sa10 sa10Var, z4w z4wVar, s2m0 s2m0Var, org.xplatform.toto_bet.core.navigation.a aVar, aau aauVar, wti wtiVar, ctf0 ctf0Var, r4v r4vVar, iqt iqtVar, r9u r9uVar, tqt tqtVar, jpc jpcVar, r7v r7vVar, kpc kpcVar, luu luuVar, hpc hpcVar, kpc kpcVar2, nrt nrtVar, ocl oclVar, hpc hpcVar2, wgu wguVar, q37 q37Var, ih5 ih5Var, gg5 gg5Var, jru jruVar, y3v y3vVar, rjo rjoVar, jh70 jh70Var, pzu pzuVar, nh70 nh70Var, e1u e1uVar, eyg0 eyg0Var, cmt cmtVar2, long j, long j2, s77 s77Var, String str, String str2) {
        super(vzg0Var, kotlin.collections.a.c(z4wVar));
        m1eVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        wguVar.getClass();
        this.c = vzg0Var;
        this.d = sys0Var;
        this.e = ortVar;
        this.f = a6uVar;
        this.g = f7uVar;
        this.h = b8uVar;
        this.i = khf0Var;
        this.j = ywq0Var;
        this.k = wwvVar;
        this.l = mmtVar;
        this.m = nv20Var;
        this.n = wwvVar2;
        this.o = cntVar;
        this.p = dv3Var;
        this.q = ehf0Var;
        this.r = dv3Var2;
        this.s = lef0Var;
        this.t = wwvVar3;
        this.u = z220Var;
        this.v = pruVar;
        this.w = z220Var2;
        this.x = yyuVar;
        this.y = vptVar;
        this.z = uptVar;
        this.A = k9uVar;
        this.B = eduVar;
        this.C = fvt0Var;
        this.D = nscVar;
        this.E = nscVar2;
        this.F = rrcVar;
        this.G = esVar;
        this.H = cmtVar;
        this.I = m1eVar;
        this.J = td9Var;
        this.K = v88Var;
        this.L = mneVar;
        this.M = dujVar;
        this.N = peg0Var;
        this.O = i1w0Var;
        this.P = ouuVar;
        this.Q = sa10Var;
        this.R = z4wVar;
        this.S = s2m0Var;
        this.T = aVar;
        this.U = aauVar;
        this.V = wtiVar;
        this.W = ctf0Var;
        this.X = r4vVar;
        this.Y = iqtVar;
        this.Z = r9uVar;
        this.a0 = tqtVar;
        this.b0 = jpcVar;
        this.c0 = r7vVar;
        this.d0 = kpcVar;
        this.e0 = luuVar;
        this.f0 = hpcVar;
        this.g0 = kpcVar2;
        this.h0 = nrtVar;
        this.i0 = oclVar;
        this.j0 = hpcVar2;
        this.k0 = wguVar;
        this.l0 = q37Var;
        this.m0 = ih5Var;
        this.n0 = gg5Var;
        this.o0 = jruVar;
        this.p0 = y3vVar;
        this.q0 = rjoVar;
        this.r0 = jh70Var;
        this.s0 = pzuVar;
        this.t0 = nh70Var;
        this.u0 = e1uVar;
        this.v0 = eyg0Var;
        this.w0 = cmtVar2;
        this.x0 = j;
        this.y0 = j2;
        this.z0 = s77Var;
        this.A0 = str;
        this.B0 = str2;
        this.D0 = s77Var;
        this.E0 = "";
        byte b = 1;
        this.F0 = j != 0;
        this.I0 = new ArrayList();
        this.J0 = true;
        sff0 sff0VarA = pruVar.a();
        gx7 gx7Var = sff0VarA.f32117a;
        this.Q0 = sff0VarA;
        this.R0 = cztVar.f5239a.a();
        boolean z = sys0Var != sys0.c ? gx7Var.b.f28136a : false;
        this.S0 = z;
        this.T0 = dztVar.f6956a.f36880a.a().getBoolean("COMPACT_HISTORY", true);
        this.U0 = GeneralBetInfoModel.h;
        this.W0 = q7m0.a(new l9h0(false, false, false, this.D0, false, false, false, false, false, gx7Var.f, new UiText.ByString(""), lwf.g, false, z, true));
        this.X0 = q7m0.a(0L);
        this.Y0 = q7m0.a(fn5.f9816a);
        this.Z0 = new ol60(3);
        this.a1 = new ol60(3);
        this.b1 = new ax5(this);
        this.c1 = q7m0.a(q9w.f28368a);
        qjj.W(jiu0.a(this), null, null, new r8w(this, null, b), 3);
    }

    public final void A() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.W0;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, false, false, this.D0, this.Q0.f32117a.f12063a.m, this.T0, false, false, false, null, null, false, false, 32711)));
    }

    public final void B(String str) {
        long j = ((ev7) this.E.f24044a.d).b;
        if (j != -1) {
            if (!this.y.a()) {
                qjj.W(jiu0.a(this), null, null, new r8w(this, null, (byte) 5), 3);
            } else {
                n3w n3wVarC = this.J.c(String.valueOf(j));
                if (n3wVarC != null) {
                    L(n3wVarC, str);
                }
            }
        }
    }

    public final void C(ql5 ql5Var) {
        ql5Var.getClass();
        ql5 ql5Var2 = this.C0;
        if (ql5Var2 == null || ql5Var2.f28916a != ql5Var.f28916a) {
            bvc bvcVarA = jiu0.a(this);
            dvj dvjVar = this.L.b;
            ax5 ax5Var = this.b1;
            ax5Var.getClass();
            qjj.W(bvcVarA, kotlin.coroutines.e.c(ax5Var, dvjVar), null, new fhq(this, ql5Var, null, (byte) 14), 2);
        }
    }

    public final void D(pdj pdjVar) {
        String str;
        pdj pdjVar2 = pdj.f26809a;
        jru jruVar = this.o0;
        if (pdjVar == pdjVar2 && ((odj) ((psc) jruVar.b).b).f25078a == pdjVar) {
            return;
        }
        pdj pdjVar3 = ((odj) ((psc) jruVar.b).b).f25078a;
        byte b = 2;
        if (pdjVar3 != pdjVar) {
            q37 q37Var = this.l0;
            q37Var.getClass();
            int iOrdinal = pdjVar.ordinal();
            if (iOrdinal == 0) {
                str = "month";
            } else if (iOrdinal == 1) {
                str = "set";
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return;
                }
                str = "email";
            }
            i8i.D("option", str, q37Var.b.f1961a, "bet_history_period_click");
            b1j.v(str, q37Var.c.f1455a, 11097L);
        }
        int iOrdinal2 = pdjVar.ordinal();
        if (iOrdinal2 == 1) {
            this.Z0.f(new e9w(0L, this.Q0.f32117a.b.d));
            return;
        }
        yje yjeVar = null;
        if (iOrdinal2 != 2) {
            qjj.W(jiu0.a(this), null, null, new u5u(this, pdjVar, yjeVar, (byte) 15), 3);
        } else {
            sac.V(jiu0.a(this), jaw.f16211a, null, null, new v9w(this, yjeVar, b), 14);
        }
    }

    public final void E(s77 s77Var) {
        s77Var.getClass();
        if (this.D0 == s77Var) {
            return;
        }
        int iOrdinal = s77Var.ordinal();
        q37 q37Var = this.l0;
        if (iOrdinal == 0) {
            q37Var.b(f4w.b);
        } else if (iOrdinal == 1) {
            q37Var.b(f4w.c);
        } else if (iOrdinal == 2) {
            q37Var.b(f4w.e);
        } else if (iOrdinal == 3) {
            q37Var.b(f4w.g);
        } else if (iOrdinal == 5) {
            q37Var.b(f4w.f);
        } else if (iOrdinal == 6) {
            q37Var.b(f4w.d);
        }
        I(s77Var);
    }

    public final void F(String str) {
        str.getClass();
        n3w n3wVarC = this.J.c(str);
        if (n3wVarC == null) {
            n3wVarC = n3w.d(n3w.Q1, str, 0.0d, null, null, 0L, null, 0.0d, 0.0d, null, null, null, false, null, null, null, -2, -1);
        }
        if (this.d != sys0.c) {
            ozv ozvVarR = vfc.R(n3wVarC.g1);
            z5w z5wVarN0 = bfb.n0(n3wVarC.l);
            r6w r6wVarW0 = b34.w0(this.D0);
            q37 q37Var = this.l0;
            q37Var.getClass();
            if (r6wVarW0 != r6w.f) {
                b4j b4jVar = q37Var.b;
                a1w a1wVar = a1w.f93a;
                b4jVar.j(ozvVarR, z5wVarN0, r6wVarW0, null, null);
                q37Var.c.i((float) ozvVarR.f26117a, z5wVarN0.a(), r6wVarW0.a(), null, null);
            }
        }
        if (n3wVarC.c != s77.AGGREGATOR) {
            this.O.d(new f3s(n3wVarC, this, (byte) 29));
        }
    }

    public final void G(boolean z) {
        w();
        O();
        if (System.currentTimeMillis() - this.G0 >= 30000 || z) {
            this.G0 = System.currentTimeMillis();
            M(z);
        } else {
            qjj.W(jiu0.a(this), this.b1, null, new v9w(this, null, (byte) 3), 2);
        }
    }

    public final void H(String str) {
        if (str.length() == 0) {
            this.E0 = str;
            return;
        }
        if (str.equals(this.E0)) {
            return;
        }
        q37 q37Var = this.l0;
        q37Var.getClass();
        b1j.v(str, q37Var.c.f1455a, 10631L);
        i8i.D("option", str, q37Var.b.f1961a, "bet_history_winback_banner_shown");
        this.E0 = str;
    }

    public final void I(s77 s77Var) {
        naw nawVar = this;
        s77 s77Var2 = s77Var;
        nawVar.O0 = 0;
        nawVar.D0 = s77Var2;
        nawVar.c.e("TYPE_FILTER_KEY", s77Var2);
        while (true) {
            p7m0 p7m0Var = nawVar.W0;
            Object value = p7m0Var.getValue();
            if (p7m0Var.m(value, l9h0.a((l9h0) value, false, false, false, s77Var2, false, false, false, false, false, null, null, false, false, 32759))) {
                break;
            }
            nawVar = this;
            s77Var2 = s77Var;
        }
        z();
        ql5 ql5Var = this.C0;
        Long lValueOf = Long.valueOf(ql5Var != null ? ql5Var.f28916a : 0L);
        p7m0 p7m0Var2 = this.X0;
        p7m0Var2.getClass();
        p7m0Var2.o(null, lValueOf);
        M(true);
    }

    public final void J(azw azwVar) {
        naw nawVar;
        ra10 ra10VarB;
        p7m0 p7m0Var;
        Object value;
        qb10 qb10Var = qb10.b;
        int i = this.D0 == s77.AGGREGATOR ? R.string.history_bets_casino_empty : R.string.bet_market_empty_bets_do_more_bets;
        boolean zEquals = azwVar.equals(qb10Var);
        sys0 sys0Var = this.d;
        if (zEquals) {
            nawVar = this;
            ra10VarB = sa10.b(nawVar.Q, pb10.f, i, R.string.make_bet, new o0t(0, this, naw.class, "onActionButtonClicked", "onActionButtonClicked()V", 0, (byte) 6), 16);
        } else {
            nawVar = this;
            sys0 sys0Var2 = sys0.c;
            sa10 sa10Var = nawVar.Q;
            if (sys0Var == sys0Var2) {
                pb10 pb10Var = pb10.g;
                o0t o0tVar = new o0t(0, nawVar, naw.class, "onUpdate", "onUpdate()V", 0, (byte) 7);
                nawVar = nawVar;
                ra10VarB = sa10Var.a(pb10Var, R.string.data_retrieval_error, R.string.try_again_text, o0tVar, 10000L);
            } else {
                ra10VarB = sa10.b(sa10Var, pb10.g, R.string.data_retrieval_error, 0, null, 28);
            }
        }
        do {
            p7m0Var = nawVar.W0;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, false, true, null, false, false, false, false, false, null, new osd(ra10VarB), false, azwVar.equals(qb10Var) || sys0Var == sys0.f33037a, 14329)));
        nawVar.Z0.f(new s8w(true));
    }

    public final void K() {
        c4m0 c4m0Var = this.M0;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.M0 = slb.U(new fnq(new dnq(this.h.a(bm5.c), new baw(this, yjeVar, (byte) 2), (byte) 1), new caw(this, yjeVar, (byte) 5), (byte) 4), jiu0.a(this));
    }

    public final void L(n3w n3wVar, String str) {
        a1w a1wVar = a1w.h;
        String str2 = n3wVar.f22868a;
        q37 q37Var = this.l0;
        q37Var.getClass();
        str2.getClass();
        q37Var.b.i(a1wVar, str2);
        sac.V(jiu0.a(this), new p8w(this, (byte) 4), null, this.L.b, new o3s(this, n3wVar, str, null, (byte) 12), 10);
    }

    public final void M(boolean z) {
        Object value;
        l9h0 l9h0Var;
        boolean z2;
        List list;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.H0 >= 750 || z) {
            this.H0 = jCurrentTimeMillis;
            this.c.e("STATUS_FILTERS_KEY", this.V.q(this.d, this.D0));
            p7m0 p7m0Var = this.W0;
            do {
                value = p7m0Var.getValue();
                l9h0Var = (l9h0) value;
                f7u f7uVar = this.g;
                s77 s77Var = this.D0;
                sys0 sys0Var = this.d;
                f7uVar.getClass();
                s77Var.getClass();
                sys0Var.getClass();
                z2 = false;
                if (rau.f30153a[s77Var.ordinal()] == 1) {
                    u21 u21Var = ((tnm0) ((jpc) f7uVar.d).f16892a.f35622a).d;
                    if (u21Var.b == v21.ALL && u21Var.c == r21.ALL) {
                        if (sys0Var == sys0.c && ((list = u21Var.f34924a) == null || !list.isEmpty())) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((BetHistoryFilterItemModel) it.next()).b) {
                                    }
                                }
                            }
                        }
                    }
                    z2 = true;
                } else {
                    gm7 gm7Var = ((pru) f7uVar.e).a().f32117a.f12063a;
                    boolean z3 = gm7Var.m;
                    boolean z4 = gm7Var.n;
                    boolean z5 = gm7Var.q;
                    if (((tnm0) ((cnt) f7uVar.b).f4672a.f35622a).b(sys0Var, s77Var, z3, z4, z5).size() != ((tnm0) ((mmt) f7uVar.c).f22059a.f35622a).a(sys0Var, s77Var, z3, z4, z5).size()) {
                        z2 = true;
                    }
                }
            } while (!p7m0Var.m(value, l9h0.a(l9h0Var, false, true, false, null, false, false, false, false, z2, null, null, false, false, 32509)));
            td9 td9Var = this.J;
            s5w s5wVar = (s5w) td9Var.c;
            synchronized (s5wVar.d) {
                s5wVar.f31675a.clear();
                s5wVar.b = GeneralBetInfoModel.h;
                s5wVar.c = false;
                s5wVar.a();
            }
            td9Var.f33756a = true;
            td9Var.e = ap00.b;
            td9Var.h(new umu((byte) 27));
            p7m0 p7m0Var2 = this.c1;
            r9w r9wVar = new r9w(0);
            p7m0Var2.getClass();
            p7m0Var2.o(null, r9wVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object N(zje zjeVar) {
        maw mawVar;
        naw nawVar;
        p7m0 p7m0Var;
        Object value;
        if (zjeVar instanceof maw) {
            mawVar = (maw) zjeVar;
            int i = mawVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                mawVar.l = i - Integer.MIN_VALUE;
            } else {
                mawVar = new maw(this, zjeVar);
            }
        } else {
            mawVar = new maw(this, zjeVar);
        }
        Object objA = mawVar.j;
        Object obj = wne.f39444a;
        int i2 = mawVar.l;
        if (i2 == 0) {
            z1x.P(objA);
            bj5 bj5Var = s77.b;
            ((m0w) this.f0.f13434a.g).getClass();
            bj5Var.getClass();
            this.D0 = bj5.b(0);
            long jD = this.i0.d();
            mawVar.i = this;
            mawVar.l = 1;
            objA = nrt.a(this.h0, jD, mawVar);
            if (objA == obj) {
                return obj;
            }
            nawVar = this;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nawVar = mawVar.i;
            z1x.P(objA);
        }
        nawVar.C((ql5) objA);
        do {
            p7m0Var = this.W0;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, false, false, this.D0, false, false, false, false, false, null, null, false, false, 32759)));
        ((m0w) this.g0.f18667a.g).getClass();
        return Unit.f46060a;
    }

    public final void O() {
        p7m0 p7m0Var;
        Object value;
        bby bbyVar = this.L0;
        byte b = 1;
        if ((bbyVar == null || !bbyVar.isActive()) && this.i0.d() == 0) {
            do {
                p7m0Var = this.W0;
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, l9h0.a((l9h0) value, true, false, false, null, false, false, false, false, false, null, null, false, false, 32766)));
            bvc bvcVarA = jiu0.a(this);
            dvj dvjVar = this.L.b;
            this.L0 = sac.i0(bvcVarA, "HistoryViewModel#updateBalance", 0, 0L, kotlin.collections.a.c(oqt0.class), null, new u9w(this, null, b), null, dvjVar, new n5w(1, this.M, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, 598);
        }
    }

    public final void P() {
        Object m4uVar;
        UiText.ByRes byRes;
        UiText.ByRes byRes2;
        UiText.ByRes byRes3;
        p7m0 p7m0Var;
        Object value;
        s77 s77Var = this.D0;
        String strA = this.k0.a();
        dv3 dv3Var = this.p;
        dv3Var.getClass();
        s77Var.getClass();
        l77 l77Var = dv3Var.f6725a;
        pdj pdjVar = l77Var.b.f25078a;
        if (pdjVar == pdj.b || !this.S0) {
            Locale localeForLanguageTag = Locale.getDefault();
            if (Intrinsics.d(localeForLanguageTag, Locale.ROOT)) {
                String strReplace = strA.replace('_', '-');
                strReplace.getClass();
                localeForLanguageTag = Locale.forLanguageTag(strReplace);
                localeForLanguageTag.getClass();
            } else {
                localeForLanguageTag.getClass();
            }
            rdj rdjVar = rdj.f30294a;
            ynq0 ynq0Var = new ynq0(l77Var.a(s77Var));
            sdj sdjVar = sdj.UNIQUE_2;
            m4uVar = new m4u(rdj.f(ynq0Var, sdjVar, localeForLanguageTag, 28), rdj.f(new ynq0(l77Var.b(s77Var, false)), sdjVar, localeForLanguageTag, 28));
        } else {
            m4uVar = new l4u(pdjVar);
        }
        if (this.d != sys0.c) {
            if (m4uVar instanceof m4u) {
                m4u m4uVar2 = (m4u) m4uVar;
                byRes2 = new UiText.ByRes(R.string.history_event_name, m4uVar2.f21191a, m4uVar2.b);
            } else if (m4uVar instanceof l4u) {
                byRes2 = new UiText.ByRes(ulb.O(((l4u) m4uVar).f19426a), new CharSequence[0]);
            } else {
                byRes = new UiText.ByRes(ulb.O(pdj.f26809a), new CharSequence[0]);
            }
            byRes3 = byRes2;
            do {
                p7m0Var = this.W0;
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, false, false, null, false, false, false, false, false, byRes3, null, false, false, 31743)));
        }
        byRes = new UiText.ByRes(ulb.O(pdj.f26809a), new CharSequence[0]);
        byRes3 = byRes;
        do {
            p7m0Var = this.W0;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, false, false, null, false, false, false, false, false, byRes3, null, false, false, 31743)));
    }

    @Override // a.w3k, a.diu0
    public final void v() {
        super.v();
        s77 s77Var = this.D0;
        List<s77> list = d1;
        if (list.contains(s77Var)) {
            gm7 gm7Var = this.v.a().f32117a.f12063a;
            boolean z = gm7Var.m;
            boolean z2 = gm7Var.n;
            boolean z3 = gm7Var.q;
            cnt cntVar = this.o;
            cntVar.getClass();
            sys0 sys0Var = this.d;
            sys0Var.getClass();
            tnm0 tnm0Var = (tnm0) cntVar.f4672a.f35622a;
            tnm0Var.getClass();
            for (s77 s77Var2 : list) {
                LinkedHashMap linkedHashMapC = tnm0Var.c(sys0Var);
                List listD = tnm0.d(s77Var2, z, z2, z3);
                ArrayList arrayList = new ArrayList(r3d.q(listD, 10));
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BetHistoryFilterItemModel((e4f) it.next(), true, true));
                }
                linkedHashMapC.put(s77Var2, arrayList);
            }
        }
    }

    public final void w() {
        if (this.i0.d() != 0) {
            sac.V(jiu0.a(this), new n5w(1, this, naw.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, null, new v9w(this, null, (byte) 0), 14);
        }
    }

    public final void x(ql5 ql5Var) {
        p7m0 p7m0Var;
        Object value;
        if (this.z0 == s77.SALE && ql5Var.i.a()) {
            i1w0 i1w0Var = this.O;
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    break;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        }
        if (Intrinsics.d(this.C0, ql5Var)) {
            return;
        }
        ql5 ql5Var2 = this.C0;
        boolean z = ql5Var2 != null && ql5Var2.f28916a == ql5Var.f28916a;
        this.C0 = ql5Var;
        en5 en5Var = new en5(ql5Var);
        txs0 txs0Var = ql5Var.i;
        p7m0 p7m0Var2 = this.Y0;
        p7m0Var2.getClass();
        p7m0Var2.o(null, en5Var);
        if (this.D0 != s77.SALE) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(s77.EVENTS);
            boolean zE = txs0Var.e();
            sff0 sff0Var = this.Q0;
            gx7 gx7Var = sff0Var.f32117a;
            q57 q57Var = gx7Var.b;
            if (gx7Var.e && zE) {
                arrayList.add(s77.TOTO);
            }
            if (sff0Var.Y != 0) {
                arrayList.add(s77.JACKPOT);
            }
            if (txs0Var.e() && gx7Var.f12063a.i) {
                arrayList.add(s77.AUTO);
            }
            if (q57Var.e) {
                arrayList.add(s77.AGGREGATOR);
            }
            if (q57Var.c) {
                arrayList.add(s77.UNSETTLED);
            }
            ArrayList arrayList2 = this.I0;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            do {
                p7m0Var = this.W0;
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, false, false, null, false, false, arrayList2.size() > 1, false, false, null, null, false, false, 32703)));
        }
        if (z) {
            return;
        }
        this.O0 = 0;
        p7m0 p7m0Var3 = this.X0;
        if (((Number) p7m0Var3.getValue()).longValue() == 0) {
            Long lValueOf = Long.valueOf(ql5Var.f28916a);
            p7m0Var3.getClass();
            p7m0Var3.o(null, lValueOf);
            return;
        }
        s77 s77Var = this.D0;
        this.a0.getClass();
        s77Var.getClass();
        s77 s77Var2 = s77.EVENTS;
        if (txs0Var.a() ? q3d.j(s77Var2, s77.UNSETTLED).contains(s77Var) : true) {
            M(false);
        } else {
            I(s77Var2);
        }
    }

    public final void y(Throwable th) {
        boolean z = th instanceof zhi0;
        duj dujVar = this.M;
        if (z) {
            dujVar.b(th, new xxv(this, (byte) 2));
        } else {
            dujVar.b(th, new x2w((byte) 6));
        }
    }

    public final void z() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.W0;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, false, false, null, false, false, false, false, false, null, lwf.g, false, true, 14335)));
        this.Z0.f(new s8w(false));
    }
}
