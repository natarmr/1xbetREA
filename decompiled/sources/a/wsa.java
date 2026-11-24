package a;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.search.impl.navigation.SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class wsa extends i3t0 {
    public static final /* synthetic */ int Q = 0;
    public final w5z A;
    public final wdu B;
    public final luu C;
    public final m1e D;
    public final duj E;
    public final oct F;
    public final y78 G;
    public final v88 H;
    public final gg5 I;
    public final s31 J;
    public final r9u K;
    public final s31 L;
    public final cyu M;
    public c4m0 N;
    public c4m0 O;
    public bby P;
    public final vzg0 o;
    public final i1w0 p;
    public final mne q;
    public final pru r;
    public final eke0 s;
    public final lbu t;
    public final hjd u;
    public final phf0 v;
    public final jqt w;
    public final j3c x;
    public final peg0 y;
    public final zpu z;

    /* JADX WARN: Illegal instructions before constructor call */
    public wsa(vzg0 vzg0Var, i1w0 i1w0Var, mne mneVar, pru pruVar, eke0 eke0Var, lbu lbuVar, hjd hjdVar, phf0 phf0Var, jqt jqtVar, h3c h3cVar, urt urtVar, ctf0 ctf0Var, cad cadVar, j3c j3cVar, peg0 peg0Var, zpu zpuVar, w5z w5zVar, wdu wduVar, luu luuVar, m1e m1eVar, duj dujVar, oct octVar, y78 y78Var, svu svuVar, v88 v88Var, gg5 gg5Var, s31 s31Var, r9u r9uVar, s31 s31Var2, cyu cyuVar, r8i r8iVar) {
        dta ysaVar;
        ih2 ih2Var;
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new yw9(svuVar, vzg0Var, (byte) 4), cvm0.p(rwjVar, rwjVar), new ep4(ctf0Var, (byte) 13), (yzn0) null);
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = mneVar;
        this.r = pruVar;
        this.s = eke0Var;
        this.t = lbuVar;
        this.u = hjdVar;
        this.v = phf0Var;
        this.w = jqtVar;
        this.x = j3cVar;
        this.y = peg0Var;
        this.z = zpuVar;
        this.A = w5zVar;
        this.B = wduVar;
        this.C = luuVar;
        this.D = m1eVar;
        this.E = dujVar;
        this.F = octVar;
        this.G = y78Var;
        this.H = v88Var;
        this.I = gg5Var;
        this.J = s31Var;
        this.K = r9uVar;
        this.L = s31Var2;
        this.M = cyuVar;
        sac.V(jiu0.a(this), psa.f27506a, null, mneVar.f22085a, new qsa(this, null), 10);
        sac.V(jiu0.a(this), vsa.f37941a, null, mneVar.b, new usa(this, null, (byte) 1), 10);
        tcp tcpVar = (tcp) vzg0Var.a("FAVORITE_SECTION_KEY");
        switch (tcpVar == null ? -1 : isa.f15294a[tcpVar.ordinal()]) {
            case 1:
                ysaVar = new ysa(new zpv(false, false));
                break;
            case 2:
                ysaVar = new ysa(new zpv(false, false));
                break;
            case 3:
                ysaVar = new bta(new zpv(false, false));
                break;
            case 4:
                ysaVar = new cta(new zpv(false, false));
                break;
            case 5:
                ysaVar = new zsa(new zpv(false, false));
                break;
            case 6:
                ysaVar = new ata(new zpv(false, false));
                break;
            default:
                ysaVar = null;
                break;
        }
        vzg0Var.d("FAVORITE_SECTION_KEY");
        if (ysaVar != null) {
            if (ysaVar instanceof ysa) {
                ih2Var = ih2.Events;
            } else if (ysaVar instanceof zsa) {
                ih2Var = ih2.Teams;
            } else if (ysaVar instanceof ata) {
                ih2Var = ih2.Tournaments;
            } else if (ysaVar instanceof bta) {
                ih2Var = ih2.Tracked;
            } else {
                if (!(ysaVar instanceof cta)) {
                    t9f.b();
                    throw null;
                }
                ih2Var = ih2.Viewed;
            }
            G(new dsa(ih2Var));
        }
        M(((gsa) D()).h);
        if (r8iVar.r(fk60.TEAM_BET)) {
            G(esa.f8319a);
        }
    }

    public final void M(dta dtaVar) {
        boolean z = dtaVar instanceof ysa;
        gg5 gg5Var = this.I;
        s31 s31Var = this.J;
        if (z) {
            vcp vcpVar = vcp.Classic;
            s31Var.J("cardsInHeader", qfp.EVENTS);
            gg5Var.u("categoryImageHeader", nfp.EVENTS);
            return;
        }
        if (dtaVar instanceof zsa) {
            vcp vcpVar2 = vcp.Classic;
            s31Var.J("cardsInHeader", qfp.TEAMS);
            gg5Var.u("categoryImageHeader", nfp.TEAMS);
        } else if (dtaVar instanceof ata) {
            vcp vcpVar3 = vcp.Classic;
            s31Var.J("cardsInHeader", qfp.CHAMPIONSHIP);
            gg5Var.u("categoryImageHeader", nfp.CHAMPIONSHIP);
        } else if (dtaVar instanceof bta) {
            vcp vcpVar4 = vcp.Classic;
            s31Var.J("cardsInHeader", qfp.WATCHED);
            gg5Var.u("categoryImageHeader", nfp.WATCHED);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        rra rraVar;
        Object value3;
        Object value4;
        Object value5;
        qra qraVar = (qra) obj;
        qraVar.getClass();
        if (qraVar instanceof dra) {
            E();
            return;
        }
        boolean z = qraVar instanceof ira;
        i1w0 i1w0Var = this.p;
        if (z) {
            v88.b(this.H, i1w0Var, 0L, 6);
            return;
        }
        final byte b = 0;
        if (!(qraVar instanceof jra)) {
            if (qraVar instanceof hra) {
                i3t0.A(this, this.u, ((hra) qraVar).f13520a, null, null, 6);
                return;
            }
            if (qraVar instanceof lra) {
                i3t0.A(this, this.u, new pid(((lra) qraVar).f20520a), null, null, 6);
                return;
            }
            if (qraVar instanceof pra) {
                i1w0Var.d(new Function1(this) { // from class: a.hsa
                    public final /* synthetic */ wsa b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b2 = b;
                        wsa wsaVar = this.b;
                        k0w0 k0w0Var = (k0w0) obj2;
                        switch (b2) {
                            case 0:
                                k0w0Var.getClass();
                                k0w0Var.h(oct.f(wsaVar.F, 0L, null, 0, t270.d, null, 23));
                                break;
                            default:
                                k0w0Var.getClass();
                                eke0 eke0Var = wsaVar.s;
                                bhh0 bhh0Var = bhh0.c;
                                eke0Var.getClass();
                                k0w0Var.h(new SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1(bhh0Var));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return;
            }
            yje yjeVar = null;
            final byte b2 = 1;
            if (qraVar instanceof era) {
                c4m0 c4m0Var = this.N;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.N = sac.T(new fnq(this.D.b(), new usa(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.q.f22085a), new c48(2, this, wsa.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 4, (byte) 10));
                    return;
                }
                return;
            }
            if (qraVar instanceof gra) {
                c4m0 c4m0Var2 = this.O;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                bby bbyVar = this.P;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                c4m0 c4m0Var3 = this.N;
                if (c4m0Var3 != null) {
                    c4m0Var3.cancel(null);
                    return;
                }
                return;
            }
            boolean z2 = qraVar instanceof fra;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z2) {
                dta dtaVar = ((fra) qraVar).f10009a;
                if (!dtaVar.equals(((gsa) D()).h)) {
                    M(dtaVar);
                }
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value5 = p7m0Var.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value5, gsa.a((gsa) value5, null, null, false, null, 0, 0, ((fra) qraVar).f10009a, false, false, null, 3967)));
                return;
            }
            boolean z3 = qraVar instanceof ora;
            vzg0 vzg0Var = this.o;
            if (z3) {
                if (((gsa) D()).k) {
                    String str = ((ora) qraVar).f25726a;
                    vzg0Var.e("SEARCH_QUERY_KEY", str);
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var2.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value4, gsa.a((gsa) value4, null, null, false, null, 0, 0, null, false, false, ((ora) qraVar).f25726a, 2047)));
                    G(new csa(str));
                    return;
                }
                return;
            }
            if (qraVar.equals(kra.f18754a)) {
                vzg0Var.e("SEARCH_QUERY_KEY", "");
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value3, gsa.a((gsa) value3, null, null, false, null, 0, 0, null, false, false, "", 1023)));
                G(new csa(""));
                return;
            }
            if (!(qraVar instanceof nra)) {
                if (!qraVar.equals(cra.f4835a)) {
                    if (qraVar.equals(mra.f22259a)) {
                        G(zra.f44843a);
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                vzg0Var.e("SEARCH_QUERY_KEY", "");
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value, gsa.a((gsa) value, null, null, false, null, 0, 0, null, false, false, "", 1023)));
                G(new csa(""));
                return;
            }
            int i = ((nra) qraVar).f23991a;
            if (i == 0) {
                if (((gsa) D()).h.a().b) {
                    G(new bsa(((gsa) D()).h));
                    return;
                }
                return;
            }
            if (i == 1 && ((gsa) D()).h.a().f44779a) {
                this.L.g(wgh0.FAVORITES);
                this.M.C("favor_aggregator");
                if ((((gsa) D()).h instanceof zsa) && (rraVar = ((gsa) D()).f11820a) != null && rraVar.j) {
                    i1w0Var.d(new Function1(this) { // from class: a.hsa
                        public final /* synthetic */ wsa b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b3 = b2;
                            wsa wsaVar = this.b;
                            k0w0 k0w0Var = (k0w0) obj2;
                            switch (b3) {
                                case 0:
                                    k0w0Var.getClass();
                                    k0w0Var.h(oct.f(wsaVar.F, 0L, null, 0, t270.d, null, 23));
                                    break;
                                default:
                                    k0w0Var.getClass();
                                    eke0 eke0Var = wsaVar.s;
                                    bhh0 bhh0Var = bhh0.c;
                                    eke0Var.getClass();
                                    k0w0Var.h(new SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1(bhh0Var));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    return;
                }
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var5.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value2, gsa.a((gsa) value2, null, null, false, null, 0, 0, null, false, true, null, 3071)));
                return;
            }
            return;
        }
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        k0w0VarI.h(this.y.q(new gr1()));
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
}
