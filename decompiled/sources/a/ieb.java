package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.game.GameStatistic;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ieb {
    public static final void A(String str, uxm uxmVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-995926638);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(uxmVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (uxmVar != null) {
                fetVar2.e0(-289906836);
                rcb.x(null, acb.W(uxmVar), h2m.f12341a, nsm0.y(fgm.b), true, null, fetVar2, 384);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-289599316);
                fetVar2.r(false);
            }
            x7z x7zVar = new x7z(1.0f, true);
            long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, x7zVar, secondary, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, i2 & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(str, uxmVar, i, (byte) 18);
        }
    }

    public static final void B(mm40 mm40Var, final atv atvVar, float f, fet fetVar, int i) {
        mm40 mm40Var2;
        ugd ugdVarM;
        atvVar.getClass();
        fetVar.g0(2003863827);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(atvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (atvVar.equals(wsv.f39710a)) {
                fetVar.e0(1356990765);
                fetVar.r(false);
            } else {
                if (!(atvVar instanceof xsv)) {
                    throw b1j.f(1567797361, fetVar, false);
                }
                fetVar.e0(1357182190);
                tsv tsvVar = ((xsv) atvVar).f41436a;
                if (tsvVar.d.isEmpty()) {
                    fetVar.e0(1359296483);
                    fetVar.r(false);
                    ugdVarM = null;
                } else {
                    fetVar.e0(1357249925);
                    ugdVarM = u1c.M(-1401006725, new Function2() { // from class: a.t2w
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = b;
                            atv atvVar2 = atvVar;
                            switch (b3) {
                                case 0:
                                    fet fetVar2 = (fet) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        zcl zclVar = qmk.f28987a;
                                        jwb.p(s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), new qw3(4.0f, true, new jf4((byte) 14)), new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, 0, 0, u1c.M(403489056, new elm(atvVar2, (byte) 18), fetVar2), fetVar2, 1575936, 48);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    fet fetVar3 = (fet) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (fetVar3.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        for (h3w h3wVar : ((xsv) atvVar2).f41436a.e) {
                                            if (h3wVar != null) {
                                                boolean z = h3wVar instanceof j3w;
                                                jm40 jm40Var = jm40.b;
                                                if (z) {
                                                    fetVar3.e0(1650195039);
                                                    zcl zclVar2 = qmk.f28987a;
                                                    hkb.p(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), (j3w) h3wVar, fetVar3, 0);
                                                    fetVar3.r(false);
                                                } else if (h3wVar instanceof i3w) {
                                                    fetVar3.e0(1650561459);
                                                    zcl zclVar3 = qmk.f28987a;
                                                    vfc.u(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), (i3w) h3wVar, fetVar3, 0);
                                                    fetVar3.r(false);
                                                } else if (h3wVar instanceof f3w) {
                                                    fetVar3.e0(1650909837);
                                                    zcl zclVar4 = qmk.f28987a;
                                                    hp4.c(o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), "AMOUNT_TEXT_HISTORY_CARD_TAG"), (f3w) h3wVar, fetVar3, 0);
                                                    fetVar3.r(false);
                                                } else if (h3wVar instanceof l3w) {
                                                    fetVar3.e0(1651292625);
                                                    zcl zclVar5 = qmk.f28987a;
                                                    h8x.f(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), (l3w) h3wVar, fetVar3, 0, 0);
                                                    fetVar3.r(false);
                                                } else if (h3wVar instanceof m3w) {
                                                    fetVar3.e0(1651640693);
                                                    zcl zclVar6 = qmk.f28987a;
                                                    xdx.c(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), (m3w) h3wVar, fetVar3, 0);
                                                    fetVar3.r(false);
                                                }
                                            }
                                            fetVar3.e0(1651939409);
                                            fetVar3.r(false);
                                        }
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar);
                    fetVar.r(false);
                }
                vdb.H(tsvVar, f, ugdVarM, u1c.M(655794557, new Function2() { // from class: a.t2w
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b2;
                        atv atvVar2 = atvVar;
                        switch (b3) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    zcl zclVar = qmk.f28987a;
                                    jwb.p(s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), new qw3(4.0f, true, new jf4((byte) 14)), new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, 0, 0, u1c.M(403489056, new elm(atvVar2, (byte) 18), fetVar2), fetVar2, 1575936, 48);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                    for (h3w h3wVar : ((xsv) atvVar2).f41436a.e) {
                                        if (h3wVar != null) {
                                            boolean z = h3wVar instanceof j3w;
                                            jm40 jm40Var = jm40.b;
                                            if (z) {
                                                fetVar3.e0(1650195039);
                                                zcl zclVar2 = qmk.f28987a;
                                                hkb.p(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), (j3w) h3wVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (h3wVar instanceof i3w) {
                                                fetVar3.e0(1650561459);
                                                zcl zclVar3 = qmk.f28987a;
                                                vfc.u(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), (i3w) h3wVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (h3wVar instanceof f3w) {
                                                fetVar3.e0(1650909837);
                                                zcl zclVar4 = qmk.f28987a;
                                                hp4.c(o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), "AMOUNT_TEXT_HISTORY_CARD_TAG"), (f3w) h3wVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (h3wVar instanceof l3w) {
                                                fetVar3.e0(1651292625);
                                                zcl zclVar5 = qmk.f28987a;
                                                h8x.f(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), (l3w) h3wVar, fetVar3, 0, 0);
                                                fetVar3.r(false);
                                            } else if (h3wVar instanceof m3w) {
                                                fetVar3.e0(1651640693);
                                                zcl zclVar6 = qmk.f28987a;
                                                xdx.c(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), (m3w) h3wVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            }
                                        }
                                        fetVar3.e0(1651939409);
                                        fetVar3.r(false);
                                    }
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar, (i2 & 14) | 24576 | (i2 & 896));
                fetVar.r(false);
            }
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new svm(mm40Var2, (Object) atvVar, f, i, (byte) 2);
        }
    }

    public static final void C(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        int i2;
        String str3;
        String str4;
        fet fetVar2 = fetVar;
        fetVar2.g0(1406020549);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= fetVar2.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= fetVar2.g(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarG = g1t0.g();
            zfn zfnVar2 = zaq0.b;
            v8q0.a(str4, null, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG, fetVar2, (i2 >> 6) & 14, 24960, 110586);
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str3, null, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar2, (i2 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nd8(mm40Var, str, str2, i, (byte) 1);
        }
    }

    public static final void D(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1434432603);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.g(mm40VarD, 54.0f, 0.0f, 2), 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarW = o7k0.w(o7k0.g(jm40Var, 28.0f, 0.0f, 2), gqw0.l, false, 2);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            zfn zfnVar2 = zaq0.b;
            v8q0.a(str, mm40VarW, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarM, fetVar2, (i2 >> 3) & 14, 24960, 110584);
            mm40 mm40VarE0 = o2e.e0(jm40Var, "EVENT_CARD_INFO_LABEL");
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str2, mm40VarE0, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, ((i2 >> 6) & 14) | 48, 24960, 110584);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var2, str, str2, i, (byte) 12);
        }
    }

    public static final void E(n0x n0xVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-107008157);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(n0xVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            fetVar.e0(244385770);
            fetVar.r(false);
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarS = i120.S(mm40VarE, 1.0f, staticColors.m125getWhite100d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = i2;
            mm40 mm40VarN2 = o7k0.n(jm40Var, 32.0f);
            mm40 mm40VarN3 = o7k0.n(jm40Var, 32.0f);
            fetVar.e0(1954786608);
            fetVar.r(false);
            rq8.b(mm40VarN2, mm40VarN3, n0xVar, R.drawable.ic_glyph_placeholder_player, new y3d(staticColors.m127getWhite300d7_KjU()), null, null, gqw0.A, dyb.g0(new aef()), fetVar, ((i3 << 3) & 896) | 113246208, 96);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(n0xVar, i, (byte) 11);
        }
    }

    public static final void F(n0x n0xVar, String str, String str2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1440587052);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(n0xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            E(n0xVar, fetVar, i2 & 126);
            G(str, str2, fetVar, (i2 & 7168) | ((i2 << 3) & 112) | 6 | (i2 & 896));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) n0xVar, (Object) str, (Object) str2, i, (byte) 7);
        }
    }

    public static final void G(String str, String str2, fet fetVar, int i) {
        int i2;
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-779338096);
        int i3 = i & 6;
        zhg0 zhg0Var = zhg0.f44392a;
        if (i3 == 0) {
            i2 = (fetVar2.g(zhg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str2) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40.b, true);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            brm0.x(fetVar2, mm40VarC0, gqw0.v, -1634583733, false);
            long j = y3d.c;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            int i4 = i2;
            v8q0.a(str, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.l(), fetVar, (i2 >> 6) & 14, 24960, 110586);
            fetVar2 = fetVar;
            if (str2 != null) {
                fetVar2.e0(867744982);
                fetVar2.e0(-1634573427);
                fetVar2.r(false);
                long jM130getWhite600d7_KjU = StaticColors.INSTANCE.m130getWhite600d7_KjU();
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                str3 = str2;
                v8q0.a(str3, null, jM130getWhite600d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i4 >> 9) & 14, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                str3 = str2;
                fetVar2.e0(868037436);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            str3 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e3m(i, str, str3);
        }
    }

    public static final void H(String str, ny1 ny1Var, String str2, fet fetVar, int i) {
        boolean z;
        int i2;
        jm40 jm40Var;
        fetVar.g0(-697672777);
        int i3 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(ny1Var) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(mm40VarD, 12.0f, 12.0f, 12.0f, 0.0f, 8), "HEADER_BLOCK_COLUMN");
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (str == null || StringsKt.W(str)) {
                z = false;
                i2 = i3;
                jm40Var = jm40Var2;
                fetVar.e0(-749359167);
                fetVar.r(false);
            } else {
                fetVar.e0(-749990854);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                int i4 = (i3 & 14) | 1794096;
                jm40Var = jm40Var2;
                i2 = i3;
                z = false;
                aad.e(str, o2e.e0(jm40Var2, "HEADER_TOURNAMENT_TITLE"), y9q0.a(g1t0.v(), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678), null, 2, true, 2, 0, null, new n05(qmk.s, qmk.t, qmk.n), fetVar, i4, 392);
                fetVar.r(false);
            }
            dtb.q(null, ny1Var, fetVar, i2 & 112);
            if (StringsKt.W(str2)) {
                fetVar.e0(-748589375);
                fetVar.r(z);
            } else {
                fetVar.e0(-749215296);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                aad.e(str2, o2e.e0(jm40Var, "DATE_TIME_LABEL"), y9q0.a(g1t0.n(), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678), null, 2, true, 2, 0, null, new n05(qmk.q, qmk.r, qmk.n), fetVar, ((i2 >> 6) & 14) | 1794096, 392);
                fetVar.r(z);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(str, ny1Var, str2, i, (byte) 21);
        }
    }

    public static final void I(mm40 mm40Var, float f, fet fetVar, int i) {
        float f2;
        fetVar.g0(547283240);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | 48;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = fetVar.k(bmd.n) == k6z.f17794a;
            zfn zfnVar = m8m0.f21378a;
            long jM75getBlack600d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m75getBlack600d7_KjU();
            long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU();
            zq8.a(0, fetVar, i120.P(mm40Var, yk5.h(new Pair[]{new Pair(Float.valueOf(0.0f), new y3d(jM75getBlack600d7_KjU)), new Pair(Float.valueOf(z ? 0.1f : 0.0f), new y3d(jM75getBlack600d7_KjU)), new Pair(Float.valueOf(z ? 1.0f : 0.9f), new y3d(jM121getTransparent0d7_KjU)), new Pair(Float.valueOf(1.0f), new y3d(jM121getTransparent0d7_KjU))}, 0.0f, 0.0f, 14), null, 6));
            f2 = 0.1f;
        } else {
            fetVar.X();
            f2 = f;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new esl(mm40Var, f2, i, b);
        }
    }

    public static final void J(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1978331967);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        byte b = 2;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), "ADDITIONAL_INFO_BLOCK_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC0, gqw0.v, -1256243244, a4xVar);
            int i3 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                iem iemVar = (iem) next;
                StringBuilder sb = new StringBuilder();
                sb.append(iemVar);
                sb.append(i3);
                fetVar2.b0(1422593079, sb.toString());
                mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
                String string = StringsKt.v0(iemVar.f14640a).toString();
                String string2 = StringsKt.v0(iemVar.b).toString();
                zfn zfnVar = zaq0.b;
                smk0 smk0Var = new smk0(((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), g1t0.m().f42262a.b, null, null, null, g1t0.m().f42262a.f, null, 0L, null, null, null, 0L, null, null, null, 65500);
                smk0 smk0Var2 = new smk0(((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), g1t0.n().f42262a.b, null, null, null, g1t0.n().f42262a.f, null, 0L, null, null, null, 0L, null, null, null, 65500);
                zcl zclVar2 = qmk.f28987a;
                fet fetVar3 = fetVar2;
                s5x0.a(o2e.e0(s5x0.L(mm40Var2, 0.0f, 8.0f, 1), "ADDITIONAL_INFO_ANNOTATED_TEXT"), string, string2, smk0Var, smk0Var2, fetVar3, 0);
                fetVar2 = fetVar3;
                fetVar2.r(false);
                i3 = i4;
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var2, a4xVar, i, b);
        }
    }

    public static final void K(String str, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-510482776);
        int i2 = i | (fetVar2.g(str) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM125getWhite100d7_KjU = staticColors.m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.M(i120.Q(mm40VarN, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 6.0f, 4.0f, 6.0f, 4.0f), "GUILTY_GEAR_TIMER_ROW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            j0x.b(a8k0.F(R.drawable.ic_status_gray_waiting_circle, 0, fetVar2), null, o2e.e0(o7k0.n(jm40Var, 8.0f), "GUILTY_GEAR_TIMER_IMAGE"), null, null, 0.0f, null, fetVar2, 56, 120);
            v8q0.a(str, o2e.e0(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), "GUILTY_GEAR_TIMER"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.o, null, j1t0.b, 0L, null, 0, 0, qmk.B, 16646109), fetVar, i2 & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 20, i, str);
        }
    }

    public static final void L(mm40 mm40Var, n0x n0xVar, String str, zia ziaVar, Function0 function0, fet fetVar, int i) {
        n0x n0xVar2;
        String str2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-89845137);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            n0xVar2 = n0xVar;
            i2 |= fetVar2.g(n0xVar2) ? 32 : 16;
        } else {
            n0xVar2 = n0xVar;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= fetVar2.g(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(ziaVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function0) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar2);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarN2 = o7k0.n(jm40Var, 16.0f);
            Object objA = n0xVar2.a();
            zfn zfnVar = zaq0.b;
            int i3 = i2;
            k7x.b(objA, null, mm40VarN2, pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 5), fetVar, 36912, 6, 27616);
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14).e(new x7z(1.0f, true)), "TRACKED_CARD_TITLE");
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str2, mm40VarE0, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, (i3 >> 6) & 14, 24960, 110584);
            fetVar2 = fetVar;
            if (ziaVar instanceof wia) {
                fetVar2.e0(-969678993);
                fetVar2.r(false);
            } else if (ziaVar instanceof via) {
                fetVar2.e0(4792444);
                j6n.h(((via) ziaVar).f37469a, xqo0.f41332a, s5x0.N(yyw.U(jm40Var, 0.3f), 4.0f, 0.0f, 0.0f, 0.0f, 14), 0, 0, fetVar2, 48, 24);
                fetVar2.r(false);
            } else if (ziaVar instanceof xia) {
                fetVar2.e0(5183881);
                j6n.h(((xia) ziaVar).f40935a, dqo0.f6527a, s5x0.N(yyw.U(jm40Var, 0.3f), 4.0f, 0.0f, 0.0f, 0.0f, 14), 0, 0, fetVar2, 48, 24);
                fetVar2.r(false);
            } else {
                if (!(ziaVar instanceof yia)) {
                    throw b1j.f(-969679819, fetVar2, false);
                }
                fetVar2.e0(5569924);
                j6n.h(((yia) ziaVar).f42678a, opo0.f25653a, s5x0.N(yyw.U(jm40Var, 0.3f), 4.0f, 0.0f, 0.0f, 0.0f, 14), 0, 0, fetVar2, 48, 24);
                fetVar2.r(false);
            }
            boolean z = (i3 & 57344) == 16384;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new pk9(function0, (byte) 8);
                fetVar2.o0(objP);
            }
            jd8.o(0, 1, fetVar2, null, (Function0) objP);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var2, (Object) n0xVar, (Object) str, (Object) ziaVar, function0, i, (byte) 7);
        }
    }

    public static final void M(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1744385856);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            y9q0 y9q0VarR = ibm0.r(g1t0.m(), fetVar2);
            long j = qmk.r;
            long j2 = qmk.o;
            long j3 = qmk.n;
            v8q0.a(str, null, 0L, new n05(j2, j, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarR, fetVar2, (i2 >> 3) & 14, 24960, 110582);
            v8q0.a(str2, null, 0L, new n05(j2, qmk.q, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(g1t0.g(), fetVar2), fetVar2, (i2 >> 6) & 14, 24960, 110582);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:39:0x0111  */
    /* JADX WARN: Code duplicated, block: B:41:0x0119 A[LOOP:0: B:20:0x0087->B:41:0x0119, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f5 -> B:27:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0111 -> B:40:0x0114). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object N(a.cb8 r16, a.zje r17) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ieb.N(a.cb8, a.zje):java.lang.Object");
    }

    public static final String O(String str, boolean z, i5h i5hVar) {
        String str2 = z ? "tablet" : "mob";
        StringBuilder sb = new StringBuilder(ujn.h);
        String strN = axq.n(b1j.n("/static/img/ImgDefault/Esports/CS/Maps_Stat/PickBans/", i5hVar.f14192a, Separators.SLASH, str2, Separators.SLASH), str, ".png");
        if (strN.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strN, ujn.h, false) || kotlin.text.c.x(strN, "https://", false)) {
            sb.setLength(0);
            sb.append(strN);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strN, '/'));
        }
        return sb.toString();
    }

    public static final String P(String str, boolean z) {
        String str2 = z ? "tablet" : "mob";
        StringBuilder sb = new StringBuilder(ujn.h);
        String strK = b1j.k("/static/img/ImgDefault/Esports/CS/Maps_Series/Live/", str2, Separators.SLASH, str, ".png");
        if (strK.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strK, ujn.h, false) || kotlin.text.c.x(strK, "https://", false)) {
            sb.setLength(0);
            sb.append(strK);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strK, '/'));
        }
        return sb.toString();
    }

    public static boolean Q(fq80 fq80Var, ajq ajqVar, int i, mtc mtcVar) {
        long jB = fq80Var.B();
        long j = jB >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jB >> 12) & 15);
        int i3 = (int) ((jB >> 8) & 15);
        int i4 = (int) ((jB >> 4) & 15);
        int i5 = (int) ((jB >> 1) & 7);
        boolean z2 = (jB & 1) == 1;
        if (i4 <= 7) {
            if (i4 != ajqVar.g - 1) {
                return false;
            }
        } else if (i4 > 10 || ajqVar.g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == ajqVar.i) || z2) {
            return false;
        }
        try {
            long jH = fq80Var.H();
            if (!z) {
                jH *= (long) ajqVar.b;
            }
            long j2 = ajqVar.j;
            if (j2 != 0 && jH > j2) {
                return false;
            }
            mtcVar.f22363a = jH;
            int iV = V(i2, fq80Var);
            long j3 = ajqVar.j;
            boolean z3 = j3 == 0 || jH + ((long) iV) >= j3;
            if (iV == -1) {
                return false;
            }
            if ((!z3 && iV < ajqVar.f989a) || iV > ajqVar.b) {
                return false;
            }
            int i6 = ajqVar.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != ajqVar.f) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iG = fq80Var.G();
                    if (i3 == 14) {
                        iG *= 10;
                    }
                    if (iG != i6) {
                        return false;
                    }
                } else if (fq80Var.z() * 1000 != i6) {
                    return false;
                }
            }
            int iZ = fq80Var.z();
            int i7 = fq80Var.b;
            byte[] bArr = fq80Var.f9961a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = fq80Var.b; i10 < i8; i10++) {
                i9 = vtt0.j[i9 ^ (bArr[i10] & 255)];
            }
            String str = vtt0.f38024a;
            if (iZ != i9) {
                return false;
            }
            if (fq80Var.a() != 0) {
                int iJ = fq80Var.j();
                if ((iJ & 128) != 0) {
                    return false;
                }
                int i11 = (iJ & 126) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    f1t0.a0("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static final String R(n97 n97Var, q4f q4fVar) {
        n97Var.getClass();
        Double d = n97Var.b;
        String str = n97Var.c;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        if (str != null && str.length() != 0) {
            return str;
        }
        if (dDoubleValue <= 0.0d) {
            return (q4fVar == q4f.g || q4fVar == q4f.k || q4fVar == q4f.j || q4fVar == q4f.e) ? "" : "SP";
        }
        pn40 pn40Var = pn40.f27267a;
        return pn40.c(dDoubleValue, p3u0.e);
    }

    public static String S(String str, String str2) {
        return ua80.i("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[PHI: r5 r10
  0x00a4: PHI (r5v3 long) = (r5v2 long), (r5v4 long) binds: [B:29:0x008a, B:34:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r10v3 a.cb8) = (r10v2 a.cb8), (r10v4 a.cb8) binds: [B:29:0x008a, B:34:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        if (a.qcc.O(1000, r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T(a.cb8 r10, a.zje r11) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ieb.T(a.cb8, a.zje):java.lang.Object");
    }

    public static final d3j U(boolean z, boolean z2, boolean z3, n85 n85Var, n85 n85Var2, z6w z6wVar) {
        if (!z3 && (z || z2)) {
            return c3j.f3677a;
        }
        b3j b3jVar = b3j.f1908a;
        if (!z) {
            return b3jVar;
        }
        if (n85Var2 != null) {
            return new y2j(n85Var2);
        }
        if (n85Var != null) {
            return new x2j(n85Var);
        }
        return z6wVar != null ? new z2j(z6wVar) : b3jVar;
    }

    public static int V(int i, fq80 fq80Var) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return fq80Var.z() + 1;
            case 7:
                return fq80Var.G() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static final otc W(dyl0 dyl0Var, long j, ctf0 ctf0Var) {
        ctf0Var.getClass();
        long j2 = dyl0Var.f6899a;
        String str = dyl0Var.b;
        lho lhoVar = dyl0Var.c;
        kbo kboVar = dyl0Var.e;
        return new otc(j2, str, lhoVar, kboVar.l, kboVar.i ? ctf0Var.b.a(R.string.statistic_last_game_adapter_vs, Arrays.copyOf(new Object[0], 0)) : d5c.O(kboVar.g, kboVar.h, false, false, new hpm(0L, 3)).b, f0(dyl0Var, true), f0(dyl0Var, false), "", j);
    }

    public static final long X(hgm hgmVar, fet fetVar) {
        int iOrdinal = hgmVar.ordinal();
        if (iOrdinal == 0) {
            fetVar.e0(-154844829);
            long jM98getGreen0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
            fetVar.r(false);
            return jM98getGreen0d7_KjU;
        }
        if (iOrdinal == 1) {
            fetVar.e0(-154842399);
            long jM113getRed0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU();
            fetVar.r(false);
            return jM113getRed0d7_KjU;
        }
        if (iOrdinal == 2) {
            fetVar.e0(-154840092);
            long jM132getYellow0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m132getYellow0d7_KjU();
            fetVar.r(false);
            return jM132getYellow0d7_KjU;
        }
        if (iOrdinal != 3) {
            throw b1j.f(-154847233, fetVar, false);
        }
        fetVar.e0(-154837687);
        long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
        fetVar.r(false);
        return jM121getTransparent0d7_KjU;
    }

    public static final orf Y(pqf pqfVar) {
        pqfVar.getClass();
        boolean z = pqfVar.i;
        return new orf(egm0.f(pqfVar.f27413a, z), egm0.e(pqfVar.g, z), egm0.f(String.valueOf(pqfVar.b), z), egm0.f(String.valueOf(pqfVar.c), z), egm0.f(String.valueOf(pqfVar.d), z), egm0.f(String.valueOf(pqfVar.e), z), egm0.f(String.valueOf(pqfVar.f), z));
    }

    public static final grh Z(y78 y78Var, d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, String str, String str2, String str3, ArrayList arrayList, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        d0tVar.getClass();
        ctf0Var.getClass();
        str.getClass();
        list.getClass();
        str3.getClass();
        return d0tVar.C ? a4n0.o(y78Var, d0tVar, ctf0Var, m5l0Var, str, str2, str3, arrayList, list, z, z3, z4, z2) : pym0.q(y78Var, d0tVar, ctf0Var, m5l0Var, str, str2, str3, arrayList, list, z, z3, z4, z2);
    }

    public static final void a(py1 py1Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        boolean z;
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(2053252864);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(py1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        int i4 = i2;
        if (fetVar2.U(i4 & 1, (i4 & 1171) != 1170)) {
            kdm kdmVar = py1Var.l;
            boolean zG = fetVar2.g(kdmVar.b);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                Date date = kdmVar.b;
                objP = Boolean.valueOf(!(date != null && date.getTime() == 0));
                fetVar2.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            boolean z2 = kdmVar.c - System.currentTimeMillis() <= 0;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zH = ((i4 & 7168) == 2048) | fetVar2.h(z2) | fetVar2.h(zBooleanValue);
            Object objP2 = fetVar2.P();
            if (zH || objP2 == cl5Var) {
                z = zBooleanValue;
                fsl fslVar = new fsl(z2, z, function2, null, (byte) 1);
                fetVar2.o0(fslVar);
                objP2 = fslVar;
            } else {
                z = zBooleanValue;
            }
            m0x0.t(fetVar2, boolValueOf, (Function2) objP2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            H(py1Var.g, py1Var.r, py1Var.j, fetVar2, 0);
            if (z) {
                fetVar2.e0(759420057);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.N(mm40VarD, 12.0f, 12.0f, 12.0f, 0.0f, 8), false, fetVar2, 6, 4);
                mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 12.0f, 12.0f, 12.0f, 0.0f, 8);
                long j = kdmVar.c;
                String str = kdmVar.f18113a;
                mnl mnlVar = kdmVar.d;
                fetVar2 = fetVar;
                i3 = i4;
                obb.r(mm40VarN, str, j, new qol(mnlVar.f22094a, mnlVar.b, mnlVar.c, mnlVar.d), null, tol.d, function2, fetVar2, 221184 | ((i4 << 9) & 3670016));
                fetVar2.r(false);
            } else {
                i3 = i4;
                fetVar2.e0(760679928);
                fetVar2.r(false);
            }
            o050.b(py1Var.q, function0, function1, fetVar2, i3 & 1008);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dsl(py1Var, function0, function1, function2, i, (byte) 2);
        }
    }

    public static final n0l a0(y0l y0lVar) {
        lnm0 lnm0Var;
        Integer num = y0lVar.f41811a;
        Integer num2 = y0lVar.e;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = y0lVar.b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Integer num3 = y0lVar.c;
        int iIntValue2 = num3 != null ? num3.intValue() : 0;
        List list = y0lVar.d;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = list;
        if (num2 != null) {
            y2m0 y2m0Var = lnm0.f20353a;
            int iIntValue3 = num2.intValue();
            y2m0Var.getClass();
            if (iIntValue3 == 1) {
                lnm0Var = lnm0.e;
            } else if (iIntValue3 != 2) {
                lnm0Var = iIntValue3 != 3 ? lnm0.b : lnm0.f;
            } else {
                lnm0Var = lnm0.d;
            }
        } else {
            lnm0Var = lnm0.b;
        }
        lnm0 lnm0Var2 = lnm0Var;
        Integer num4 = y0lVar.f;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        Double d = y0lVar.g;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Boolean bool = y0lVar.h;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Double d2 = y0lVar.i;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        List list3 = y0lVar.j;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        List list4 = y0lVar.k;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        List list5 = y0lVar.l;
        if (list5 == null) {
            list5 = iun.f15405a;
        }
        Integer num5 = y0lVar.m;
        int iIntValue5 = num5 != null ? num5.intValue() : 0;
        List list6 = list3;
        List list7 = y0lVar.n;
        if (list7 == null) {
            list7 = iun.f15405a;
        }
        List list8 = list7;
        rk10 rk10Var = y0lVar.o;
        csr csrVarA0 = rk10Var != null ? d5c.a0(rk10Var) : csr.e;
        Long l = y0lVar.p;
        long jLongValue = l != null ? l.longValue() : 0L;
        Double d3 = y0lVar.q;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
        Integer num6 = y0lVar.r;
        int iIntValue6 = num6 != null ? num6.intValue() : 0;
        Double d4 = y0lVar.s;
        return new n0l(iIntValue, str2, iIntValue2, list2, lnm0Var2, iIntValue4, dDoubleValue, zBooleanValue, dDoubleValue2, list6, list4, list5, iIntValue5, list8, csrVarA0, jLongValue, dDoubleValue3, iIntValue6, d4 != null ? d4.doubleValue() : 0.0d, num2 != null && num2.intValue() == 6);
    }

    public static final void b(py1 py1Var, fet fetVar, int i) {
        int i2;
        py1 py1Var2;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(1467250150);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(py1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            boolean z = fetVar2.k(bmd.n) == k6z.b;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 116.0f);
            zcl zclVar2 = qmk.i;
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar3, zclVar3, mm40VarE), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundGroup(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarA = jr8Var.a(jm40Var);
            boolean zH = fetVar2.h(z);
            Object objP = fetVar2.P();
            if (zH || objP == ukd.f35823a) {
                objP = new z((byte) 16, z);
                fetVar2.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(i4w0.T(mm40VarA, (Function1) objP), "TOURNAMENT_IMAGE");
            String str = py1Var.c;
            String str2 = py1Var.f;
            k7x.b(str, null, mm40VarE0, a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar2), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar2), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar2), null, null, null, null, gqw0.A, null, fetVar, 299056, 6, 31680);
            fetVar2 = fetVar;
            I(jr8Var.a(jm40Var), 0.0f, fetVar2, 0);
            mm40 mm40VarM = s5x0.M(jm40Var, 16.0f, 24.0f, 16.0f, 16.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarM);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            py1Var2 = py1Var;
            if (StringsKt.W(py1Var2.d)) {
                fetVar2.e0(-1525490816);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1526188936);
                String str3 = py1Var2.d;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                aad.e(str3, o2e.e0(jm40Var, "PRIZE_TITLE"), y9q0.a(g1t0.g(), ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678), null, 2, false, 1, 0, null, new n05(qmk.p, qmk.q, qmk.n), fetVar2, 1794096, 392);
                fetVar2.r(false);
            }
            if (StringsKt.W(str2)) {
                fetVar2.e0(-1524707136);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1525400451);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                aad.e(str2, o2e.e0(jm40Var, "PRIZE_AMOUNT"), y9q0.a(g1t0.p(), ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678), null, 2, false, 1, 0, null, new n05(qmk.u, qmk.w, qmk.n), fetVar2, 1794096, 392);
                fetVar2.r(false);
            }
            b = 1;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            py1Var2 = py1Var;
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new csl(py1Var2, i, b);
        }
    }

    public static final jmo b0(ctf0 ctf0Var, boolean z) {
        ctf0Var.getClass();
        return new jmo(z ? R.drawable.ic_arrow_collaps_8 : R.drawable.ic_arrow_expand_8, z ? ctf0Var.f(R.string.collapse, new Object[0]) : ctf0Var.f(R.string.expand, new Object[0]));
    }

    public static final void c(mm40 mm40Var, py1 py1Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        Function0 function3;
        Function0 function4;
        fetVar.g0(-682593723);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(py1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function3 = function1;
            i2 |= fetVar.i(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if ((i & 24576) == 0) {
            function4 = function2;
            i2 |= fetVar.i(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            a(py1Var, function0, function3, function4, fetVar, (i2 >> 3) & 8190);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bsl(mm40Var, py1Var, function0, function1, function2, i, (byte) 2);
        }
    }

    public static final uur c0(y78 y78Var, d0t d0tVar, String str, String str2, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        d0tVar.getClass();
        y78Var.getClass();
        str.getClass();
        z6m0 z6m0Var = z6m0.f43877a;
        GameStatistic gameStatisticU = qzb.U(d0tVar);
        long j = d0tVar.v;
        Integer intOrNull = StringsKt.toIntOrNull(gameStatisticU.b);
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        Integer intOrNull2 = StringsKt.toIntOrNull(qzb.U(d0tVar).c);
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
        long j2 = d0tVar.f5282a;
        dur durVarY = xbc.Y(d0tVar, str, str2, arrayList, z, z2, true, z4, z5);
        qtr qtrVarF0 = vbc.f0(d0tVar, false, z3, false);
        pur purVar = new pur(wzb.F0(d0tVar));
        f0t f0tVar = d0tVar.q;
        String str3 = (String) CollectionsKt.W(0, f0tVar.d);
        if (str3 == null) {
            str3 = "";
        }
        long j3 = f0tVar.f8731a;
        String strC0 = qzb.c0(d0tVar);
        boolean z6 = d0tVar.B;
        boolean z7 = iIntValue > 0;
        String strValueOf = String.valueOf(iIntValue);
        String strS = vsm0.s(f0tVar.f8731a, str3);
        long j4 = uvg.d.b;
        qur qurVar = new qur(j3, strC0, strS, z6, z7, strValueOf, j != j4);
        f0t f0tVar2 = d0tVar.r;
        String str4 = (String) CollectionsKt.W(0, f0tVar2.d);
        rur rurVar = new rur(f0tVar2.f8731a, qzb.r0(d0tVar), vsm0.s(f0tVar2.f8731a, str4 != null ? str4 : ""), d0tVar.B, iIntValue2 > 0, String.valueOf(iIntValue2), j != j4);
        boolean zH0 = qzb.H0(d0tVar);
        String string = y78.n(y78Var, d0tVar, !zH0, false, 4).toString();
        return new uur(j2, durVarY, qtrVarF0, purVar, qurVar, rurVar, new our(zH0 ? 1 : 2, d0tVar.s, string, zH0, (string.length() <= 0 || j == xrg.d.b || j == zvg.d.b || j == uxg.d.b || j == csg.d.b || j == pxg.d.b || j == fwg.d.b || j == ewg.d.b) ? false : true), new fus(d0tVar.C ? d0tVar.p.j : d0tVar.t, d0tVar.P.getTime(), qzb.H0(d0tVar), true));
    }

    public static final void d(mm40 mm40Var, b3m b3mVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-180922432);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(b3mVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            fetVar.e0(-2067756761);
            fetVar.r(false);
            long jM125getWhite100d7_KjU = StaticColors.INSTANCE.m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.S(mm40Var, 1.0f, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 10.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            h(b3mVar, fetVar, (i2 & 112) | 6 | (i2 & 896));
            g(b3mVar, fetVar, (i2 >> 6) & 14);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) b3mVar, i, (byte) 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v9, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    public static final oms d0(bqs bqsVar) {
        ?? arrayList;
        ?? arrayList2;
        dgs dgsVar;
        ?? arrayList3;
        ?? arrayList4;
        ?? arrayList5;
        ?? arrayList6;
        List list = bqsVar.f3048a;
        int i = 10;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(dnm0.q((gip0) it.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        List list2 = bqsVar.b;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(q0x.S((haa0) it2.next()));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        Integer num = bqsVar.c;
        int iIntValue = num != null ? num.intValue() : 0;
        hgs hgsVar = bqsVar.d;
        if (hgsVar != null) {
            String str = hgsVar.f13027a;
            String str2 = str == null ? "" : str;
            String str3 = hgsVar.b;
            String str4 = str3 == null ? "" : str3;
            Integer num2 = hgsVar.c;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            List list3 = hgsVar.d;
            if (list3 != null) {
                arrayList3 = new ArrayList(r3d.q(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    jss jssVar = (jss) it3.next();
                    jssVar.getClass();
                    String str5 = jssVar.f17069a;
                    if (str5 == null) {
                        str5 = "";
                    }
                    List<sf90> list4 = jssVar.b;
                    if (list4 != null) {
                        arrayList6 = new ArrayList(r3d.q(list4, i));
                        for (sf90 sf90Var : list4) {
                            String str6 = sf90Var.f32107a;
                            if (str6 == null) {
                                str6 = "";
                            }
                            Iterator it4 = it3;
                            String str7 = sf90Var.b;
                            if (str7 == null) {
                                str7 = "";
                            }
                            String str8 = sf90Var.c;
                            if (str8 == null) {
                                str8 = "";
                            }
                            arrayList6.add(new pf90(str6, str7, str8));
                            it3 = it4;
                        }
                    } else {
                        arrayList6 = 0;
                    }
                    Iterator it5 = it3;
                    if (arrayList6 == 0) {
                        arrayList6 = iun.f15405a;
                    }
                    arrayList3.add(new ess(str5, arrayList6));
                    it3 = it5;
                    i = 10;
                }
            } else {
                arrayList3 = 0;
            }
            if (arrayList3 == 0) {
                arrayList3 = iun.f15405a;
            }
            ?? r13 = arrayList3;
            List list5 = hgsVar.e;
            if (list5 != null) {
                arrayList4 = new ArrayList(r3d.q(list5, 10));
                Iterator it6 = list5.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(g7x.c0((qe90) it6.next()));
                }
            } else {
                arrayList4 = 0;
            }
            if (arrayList4 == 0) {
                arrayList4 = iun.f15405a;
            }
            ?? r14 = arrayList4;
            List list6 = hgsVar.f;
            if (list6 != null) {
                arrayList5 = new ArrayList(r3d.q(list6, 10));
                Iterator it7 = list6.iterator();
                while (it7.hasNext()) {
                    arrayList5.add(azw.X((h040) it7.next()));
                }
            } else {
                arrayList5 = 0;
            }
            if (arrayList5 == 0) {
                arrayList5 = iun.f15405a;
            }
            dgsVar = new dgs(iIntValue2, str2, str4, r13, r14, arrayList5);
        } else {
            iun iunVar = iun.f15405a;
            dgsVar = new dgs(0, "", "", iunVar, iunVar, iunVar);
        }
        return new oms(arrayList, arrayList2, iIntValue, dgsVar);
    }

    public static final void e(mm40 mm40Var, String str, chl0 chl0Var, boolean z, Function0 function0, fet fetVar, int i) {
        Function0 function1;
        mm40 mm40Var2;
        boolean z2;
        boolean z3;
        long textPrimary;
        fet fetVar2 = fetVar;
        fetVar2.g0(2074284981);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(chl0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function1 = function0;
            i2 |= fetVar2.i(function1) ? 16384 : 8192;
        } else {
            function1 = function0;
        }
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            float f = z ? 0.5f : 1.0f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(y860.W(jm40Var, null, null, !z, null, function1, 24), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.g(mm40VarD, 46.0f, 0.0f, 2), 12.0f, 0.0f, 2);
            boolean zD = fetVar2.d(f);
            Object objP = fetVar2.P();
            if (zD || objP == ukd.f35823a) {
                objP = new f54(f, b);
                fetVar2.o0(objP);
            }
            mm40 mm40VarT = i4w0.T(mm40VarL, (Function1) objP);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarT);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            C((i2 << 3) & 896, fetVar2, ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, true), chl0Var.f4366a, str);
            if (z) {
                fetVar2.e0(-1437192856);
                z2 = false;
                z3 = true;
                dww.c(a8k0.F(R.drawable.ic_glyph_lock, 0, fetVar2), null, o7k0.n(jm40Var, 16.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
                fetVar2.r(false);
            } else {
                z2 = false;
                z3 = true;
                fetVar2.e0(-1436928271);
                fetVar2.r(false);
            }
            mm40 mm40VarU = yyw.U(jm40Var, 0.6f);
            String str2 = chl0Var.b;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarJ = g1t0.j();
            int iOrdinal = chl0Var.c.ordinal();
            if (iOrdinal == 0 || iOrdinal == z3) {
                fetVar2.e0(1856757410);
                textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
                fetVar2.r(z2);
            } else if (iOrdinal == 2) {
                fetVar2.e0(1856759681);
                textPrimary = ((IndividualColors) fetVar2.k(j7x.f16059a)).getCoefHigher();
                fetVar2.r(z2);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(1856754636, fetVar2, z2);
                }
                fetVar2.e0(1856761888);
                textPrimary = ((IndividualColors) fetVar2.k(j7x.f16059a)).getCoefLower();
                fetVar2.r(z2);
            }
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str2, mm40VarU, textPrimary, new n05(j, g1t0.j().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarJ, fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            fetVar2.r(z3);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new heb(mm40Var2, str, chl0Var, z, function0, i, (byte) 0);
        }
    }

    public static final int e0(e4f e4fVar) {
        e4fVar.getClass();
        switch (e4fVar.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 1;
            case 10:
                return 3;
            case 11:
                return 2;
            default:
                t9f.b();
                return 0;
        }
    }

    public static final void f(a4x a4xVar, fet fetVar, int i) {
        byte b;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar.g0(-228776936);
        int i2 = (i & 6) == 0 ? (fetVar.h(true) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), shdVar2);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, shdVar);
            fetVar.e0(2044903630);
            for (List list : CollectionsKt.K(a4xVar, 2)) {
                zcl zclVar2 = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
                mkd.c0.getClass();
                fetVar.i0();
                int i3 = i2;
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                jpm0.o(fetVar, Integer.valueOf(iHashCode2), shdVar2);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                fetVar.e0(238100367);
                Iterator it = CollectionsKt.D0(list, 8).iterator();
                while (it.hasNext()) {
                    d(new x7z(1.0f, true), (b3m) it.next(), fetVar, (i3 << 3) & 112);
                }
                fetVar.r(false);
                fetVar.r(true);
                i2 = i3;
            }
            b = 0;
            fetVar.r(false);
            fetVar.r(true);
        } else {
            b = 0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d3m(a4xVar, i, b);
        }
    }

    public static final ufp0 f0(dyl0 dyl0Var, boolean z) {
        kbo kboVar = dyl0Var.e;
        return z ? new ufp0(0, "", kboVar.f18023a, kboVar.b, dyl0Var.f) : new ufp0(0, "", kboVar.c, kboVar.d, dyl0Var.g);
    }

    public static final void g(b3m b3mVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(762856603);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(b3mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            b3mVar.getClass();
            fetVar.e0(1589190396);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f3m(b3mVar, i, b);
        }
    }

    public static final void h(b3m b3mVar, fet fetVar, int i) {
        int i2;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(-459942014);
        int i3 = i & 6;
        zhg0 zhg0Var = zhg0.f44392a;
        if (i3 == 0) {
            i2 = (fetVar2.g(zhg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(b3mVar) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40.b, true);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str = b3mVar.f1914a;
            fetVar2.e0(-46724321);
            fetVar2.r(false);
            long jM130getWhite600d7_KjU = StaticColors.INSTANCE.m130getWhite600d7_KjU();
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, null, jM130getWhite600d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            String str2 = b3mVar.b;
            fetVar.e0(-46715747);
            fetVar.r(false);
            long j = y3d.c;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            b = 1;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f3m(b3mVar, i, b);
        }
    }

    public static final void i(mm40 mm40Var, o7p o7pVar, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-726977702);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(o7pVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(y860.W(mm40Var, null, null, false, null, function0, 28), 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), "FAVORITE_EVENT_CARD");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            L(null, o7pVar.b, o7pVar.f24797a, o7pVar.h, function2, fetVar, i3 & 57344);
            D(0, fetVar, null, o7pVar.c, o7pVar.d);
            e(null, o7pVar.e, o7pVar.f, o7pVar.g, function1, fetVar, (i3 << 3) & 57344);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new geb(mm40Var, o7pVar, function0, function1, function2, i, (byte) 0);
        }
    }

    public static final void j(mm40 mm40Var, qad qadVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-376943844);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(qadVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 28.0f);
            String str = qadVar.f28389a;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var, qadVar, i, (byte) 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(long j, shh shhVar, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        boolean z;
        jm40 jm40Var;
        jr8 jr8Var;
        int i2;
        int i3;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        Function0 function0;
        boolean z2;
        boolean z3;
        fet fetVar3 = fetVar;
        shd shdVar5 = gqw0.v;
        shd shdVar6 = gqw0.y;
        shd shdVar7 = gqw0.w;
        shd shdVar8 = gqw0.x;
        zx7 zx7Var = gqw0.e;
        fetVar3.g0(-1749156141);
        int i4 = i | (fetVar3.f(j) ? 4 : 2) | (fetVar3.g(shhVar) ? 32 : 16) | (fetVar3.i(function1) ? 256 : 128);
        if (fetVar3.U(i4 & 1, (i4 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var2, 64.0f, 108.0f);
            boolean z4 = ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((i4 & 14) == 4);
            Object objP = fetVar3.P();
            if (z4 || objP == ukd.f35823a) {
                z = true;
                Object pe1Var = new pe1((Object) function1, j, (Object) shhVar, (byte) 3);
                fetVar3.o0(pe1Var);
                objP = pe1Var;
            } else {
                z = true;
            }
            mm40 mm40VarF = phu0.F(mm40VarP, null, null, false, null, (Function0) objP, fetVar3, 0, 15);
            x5d x5dVarA = w5d.a(new qw3(4.0f, z, new jf4((byte) 14)), gqw0.n, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarF);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z5 = fetVar3.S;
            Function0 function2 = e7z.u1;
            if (z5) {
                fetVar3.l(function2);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar8);
            jpm0.o(fetVar3, bh90VarM, shdVar7);
            vqd.u(iHashCode, fetVar3, shdVar6, fetVar3);
            jpm0.o(fetVar3, mm40VarC0, shdVar5);
            mm40 mm40VarP2 = o7k0.p(jm40Var2, 64.0f, 80.0f);
            androidx.compose.runtime.d dVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarP2, ((ThemeColors) fetVar3.k(dVar)).getBackgroundContent(), vgg0.a(16.0f));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarQ);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(function2);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC, shdVar8);
            jpm0.o(fetVar3, bh90VarM2, shdVar7);
            vqd.u(iHashCode2, fetVar3, shdVar6, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar5);
            mm40 mm40VarN = o7k0.n(jm40Var2, 44.0f);
            jr8 jr8Var2 = jr8.f16991a;
            mm40 mm40VarB = jr8Var2.b(mm40VarN, zx7Var);
            String str = shhVar.c;
            int i5 = shhVar.e;
            a4x a4xVar = shhVar.f;
            k7x.b(str, null, mm40VarB, a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar3), a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar3), null, null, null, null, zx7Var, null, null, fetVar, 805343280, 0, 32224);
            if (i5 != 0) {
                fetVar.e0(242413727);
                jm40Var = jm40Var2;
                jr8Var = jr8Var2;
                i3 = 4;
                i2 = 0;
                thb.f(jr8Var.b(jm40Var, gqw0.c), new tf5(i5, new y3d(((ThemeColors) fetVar.k(dVar)).getBackground()), 4), fetVar, 0, 0);
                fetVar.r(false);
            } else {
                jm40Var = jm40Var2;
                jr8Var = jr8Var2;
                i2 = 0;
                i3 = 4;
                fetVar.e0(242732779);
                fetVar.r(false);
            }
            if (a4xVar.isEmpty()) {
                boolean z6 = i2;
                shdVar = shdVar5;
                shdVar2 = shdVar6;
                shdVar3 = shdVar7;
                shdVar4 = shdVar8;
                function0 = function2;
                z2 = true;
                fetVar.e0(243402379);
                fetVar.r(z6);
                z3 = z6;
            } else {
                fetVar.e0(242822896);
                mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.i);
                z2 = true;
                thg0 thg0VarA = shg0.a(new qw3(-10.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, i2);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarB2);
                fetVar.i0();
                if (fetVar.S) {
                    function0 = function2;
                    fetVar.l(function0);
                } else {
                    function0 = function2;
                    fetVar.r0();
                }
                shdVar4 = shdVar8;
                jpm0.o(fetVar, thg0VarA, shdVar4);
                shdVar3 = shdVar7;
                jpm0.o(fetVar, bh90VarM3, shdVar3);
                shdVar2 = shdVar6;
                vqd.u(iHashCode3, fetVar, shdVar2, fetVar);
                shdVar = shdVar5;
                Iterator itO = h97.o(fetVar, mm40VarC2, shdVar, -1331717954, a4xVar);
                while (itO.hasNext()) {
                    thb.f(null, new tf5(((Number) itO.next()).intValue(), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getBackground()), i3), fetVar, 0, 1);
                    i2 = 0;
                }
                boolean z7 = i2;
                ohs0.x(fetVar, z7, true, z7);
                z3 = z7;
            }
            fetVar.r(z2);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 24.0f), 1.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, z3);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar4);
            jpm0.o(fetVar, bh90VarM4, shdVar3);
            vqd.u(iHashCode4, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar);
            v8q0.a(shhVar.d, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109562);
            fet fetVar4 = fetVar;
            fetVar4.r(true);
            fetVar4.r(true);
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new my2(j, (Object) shhVar, function1, i, (byte) 2);
        }
    }

    public static final void l(mm40 mm40Var, thh thhVar, Function1 function1, fet fetVar, int i) {
        thhVar.getClass();
        function1.getClass();
        fetVar.g0(-1347019710);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(thhVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            byte b = 3;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(10.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ngh(thhVar, function1, b);
                fetVar.o0(objP);
            }
            b8k0.f(mm40Var, xczVarA, null, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, i2 & 14, 492);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var, thhVar, function1, i, (byte) 29);
        }
    }

    public static final void m(mm40 mm40Var, kjl kjlVar, Function0 function0, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1669148820);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar2.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        int i5 = i3 | (fetVar2.g(kjlVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i5 & 1, (i5 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 66.0f);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i5 & 896) == 256;
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new b1i(function0, (byte) 19);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarE, gy40Var, null, false, null, (Function0) objP2, 28);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarW, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 12.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            dww.c(a8k0.F(R.drawable.ic_glyph_plus_small, 0, fetVar2), null, o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 0);
            v8q0.a(kjlVar.f18391a, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.l(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dxe(mm40Var2, (Object) kjlVar, (Object) function0, i, i2, (byte) 1);
        }
    }

    public static final void n(mm40 mm40Var, py1 py1Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        Function0 function3;
        Function0 function4;
        Function0 function5;
        py1Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(580155170);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(py1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function3 = function0;
            i2 |= fetVar.i(function3) ? 256 : 128;
        } else {
            function3 = function0;
        }
        if ((i & 3072) == 0) {
            function4 = function1;
            i2 |= fetVar.i(function4) ? 2048 : 1024;
        } else {
            function4 = function1;
        }
        if ((i & 24576) == 0) {
            function5 = function2;
            i2 |= fetVar.i(function5) ? 16384 : 8192;
        } else {
            function5 = function2;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 320.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroup(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            b(py1Var, fetVar, (i2 >> 3) & 14);
            c(s5x0.N(jr8.f16991a.b(jm40.b, gqw0.b), 0.0f, 94.0f, 0.0f, 0.0f, 13), py1Var, function3, function4, function5, fetVar, i2 & 65520);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bsl(mm40Var, py1Var, function0, function1, function2, i, (byte) 1);
        }
    }

    public static final void o(final mm40 mm40Var, final g3m g3mVar, fet fetVar, final int i) {
        yfe0 yfe0VarU;
        Function2 function2;
        a4x a4xVar = g3mVar.d;
        fetVar.g0(-2065698452);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(g3mVar) ? 256 : 128);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (a4xVar.size() < 2) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    function2 = new Function2(mm40Var, g3mVar, i, b) { // from class: a.c3m

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f3683a;
                        public final /* synthetic */ mm40 b;
                        public final /* synthetic */ g3m c;

                        {
                            this.f3683a = b;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.f3683a;
                            g3m g3mVar2 = this.c;
                            mm40 mm40Var2 = this.b;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    ieb.o(mm40Var2, g3mVar2, fetVar2, x8x.L(49));
                                    break;
                                default:
                                    ieb.o(mm40Var2, g3mVar2, fetVar2, x8x.L(49));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
            } else {
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                fetVar.e0(-861311533);
                fetVar.r(false);
                long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                zcl zclVar = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f);
                x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                F(g3mVar.f10616a, g3mVar.b, g3mVar.c, fetVar, 6);
                f(a4xVar, fetVar, 6);
                fetVar.r(true);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            function2 = new Function2(mm40Var, g3mVar, i, b2) { // from class: a.c3m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f3683a;
                public final /* synthetic */ mm40 b;
                public final /* synthetic */ g3m c;

                {
                    this.f3683a = b2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.f3683a;
                    g3m g3mVar2 = this.c;
                    mm40 mm40Var2 = this.b;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            ieb.o(mm40Var2, g3mVar2, fetVar2, x8x.L(49));
                            break;
                        default:
                            ieb.o(mm40Var2, g3mVar2, fetVar2, x8x.L(49));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void p(mm40 mm40Var, xgm xgmVar, jgm jgmVar, fet fetVar, int i) {
        mm40 mm40Var2;
        mm40 mm40VarS;
        xgmVar.getClass();
        fetVar.g0(-933154345);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(xgmVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = jgmVar == jgm.f16488a;
            zcl zclVar = qmk.f28987a;
            if (ycl.b(xgmVar.a(), Float.NaN)) {
                mm40Var2 = mm40Var;
                mm40VarS = o7k0.s(o7k0.c(s5x0.N(mm40Var2, 0.0f, xgmVar.b(), 0.0f, 0.0f, 13), 1.0f), 4.0f);
            } else {
                mm40Var2 = mm40Var;
                mm40VarS = o7k0.s(o7k0.e(s5x0.N(mm40Var2, 0.0f, xgmVar.b(), 0.0f, 0.0f, 13), xgmVar.a()), 4.0f);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-919497065, new igm(xgmVar, mm40VarS, z, b), fetVar), fetVar, 56);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var2, xgmVar, jgmVar, i, (byte) 3);
        }
    }

    public static final void q(mm40 mm40Var, long j, String str, a4x a4xVar, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        str.getClass();
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(-721603490);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(a4xVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = i2 >> 3;
            z(null, j, str, z, function1, fetVar, (i2 & 1008) | (i3 & 7168) | (i3 & 57344));
            if (z) {
                fetVar.e0(-1414372594);
                J((i2 >> 6) & 112, fetVar, a4xVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(-1414268806);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j6m(mm40Var, j, str, a4xVar, z, function1, i);
        }
    }

    public static final void r(mm40 mm40Var, dym dymVar, fet fetVar, int i) {
        int i2;
        int i3;
        dym dymVar2 = dymVar;
        fet fetVar2 = fetVar;
        sem semVar = dymVar2.d;
        fetVar2.g0(-520204333);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(dymVar2) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(o7k0.e(mm40VarD, 58.0f), 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            String str = dymVar2.c;
            uxm uxmVar = dymVar2.b;
            boolean zEquals = semVar.equals(pem.f26861a);
            jm40 jm40Var = jm40.b;
            if (zEquals || semVar.equals(qem.f28591a)) {
                fetVar2.e0(-1645893393);
                i3 = 2;
                jeb.r(s5x0.L(jm40Var, 4.0f, 0.0f, 2), semVar instanceof pem ? bhm.f2615a : bhm.b, fetVar2, 0);
                fetVar2.r(false);
            } else {
                if (!semVar.equals(rem.f30342a)) {
                    throw b1j.f(-1854213868, fetVar2, false);
                }
                fetVar2.e0(-1854193325);
                fetVar2.r(false);
                i3 = 2;
            }
            mm40 mm40VarG = o7k0.g(o7k0.d(jm40Var, 1.0f), 50.0f, 0.0f, i3);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarG);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            if (uxmVar != null || str.length() > 0) {
                fetVar2.e0(454469935);
                A(str, uxmVar, fetVar2, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(454556425);
                fetVar2.r(false);
            }
            dymVar2 = dymVar;
            String str2 = dymVar2.f6900a;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            f1t0.a(null, str2, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, 0L, null, qmk.C, 2, false, 2, 0, g1t0.d(), 0L, fetVar, 0, 436217);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 16, i, mm40Var, dymVar2);
        }
    }

    public static final void s(mm40 mm40Var, ull0 ull0Var, fet fetVar, int i) {
        fetVar.g0(602974938);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(ull0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(o7k0.d(mm40Var, 1.0f), ull0Var.a()), vgg0.a(ull0Var.b())), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 11, i, mm40Var, ull0Var);
        }
    }

    public static final void t(vtn vtnVar, Function0 function0, fet fetVar, int i) {
        vtnVar.getClass();
        String str = vtnVar.c;
        fetVar.g0(1868749518);
        int i2 = (fetVar.g(vtnVar) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = fetVar.g(str);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                Object wulVar = new wul(iul.e, oe9.c, new ve9(str, R.drawable.ic_glyph_plus_small), true, false, false);
                fetVar.o0(wulVar);
                objP = wulVar;
            }
            wul wulVar2 = (wul) objP;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 1.0f), 54.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function1 = e7z.u1;
            if (z) {
                fetVar.l(function1);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarM = s5x0.M(o7k0.d(jm40Var, 1.0f), 12.0f, 10.0f, 8.0f, 10.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            M(0, fetVar, ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, true), vtnVar.f38016a, vtnVar.b);
            qzb.n(jm40Var, wulVar2, function0, fetVar, ((i2 << 3) & 896) | 6, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n(vtnVar, function0, i);
        }
    }

    public static final void u(m2o m2oVar, fet fetVar, int i) {
        int i2;
        byte b;
        boolean z;
        fetVar.g0(2002761220);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(m2oVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            th90 th90Var = m2oVar.f21071a;
            boolean z2 = m2oVar.i;
            boolean z3 = m2oVar.j;
            boolean z4 = m2oVar.k;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                objP = new cb8(lunVar);
                fetVar.o0(objP);
            }
            cb8 cb8Var = (cb8) objP;
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(z3);
            Boolean boolValueOf3 = Boolean.valueOf(z4);
            boolean zH = fetVar.h(z2) | fetVar.h(z3) | fetVar.h(z4) | fetVar.i(th90Var);
            Object objP2 = fetVar.P();
            if (zH || objP2 == obj) {
                Object mu3Var = new mu3(z2, cb8Var, z3, z4, th90Var, null);
                z = z4;
                fetVar.o0(mu3Var);
                objP2 = mu3Var;
            } else {
                z = z4;
            }
            m0x0.u(boolValueOf, boolValueOf2, boolValueOf3, (Function2) objP2, fetVar);
            Boolean boolValueOf4 = Boolean.valueOf(cb8Var.h.l() >= 9);
            Object value = cb8Var.i.getValue();
            boolean zH2 = fetVar.h(z);
            Object objP3 = fetVar.P();
            yje yjeVar = null;
            if (zH2 || objP3 == obj) {
                objP3 = new u88(z, (Object) cb8Var, yjeVar, (byte) 16);
                fetVar.o0(objP3);
            }
            m0x0.v(boolValueOf4, value, (Function2) objP3, fetVar);
            Boolean boolValueOf5 = Boolean.valueOf(cb8Var.a());
            boolean zH3 = fetVar.h(z);
            Object objP4 = fetVar.P();
            if (zH3 || objP4 == obj) {
                objP4 = new hij(cb8Var, z, yjeVar, (byte) 11);
                fetVar.o0(objP4);
            }
            m0x0.t(fetVar, boolValueOf5, (Function2) objP4);
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z5 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z5) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar));
            x5d x5dVarA2 = w5d.a(uc9.e, gqw0.n, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            ibc.y(m2oVar.g, m2oVar.h, m2oVar.f, m2oVar.e, m2oVar.c, m2oVar.d, fetVar, 0);
            b = 1;
            dj8.h(s5x0.L(jm40Var, 0.0f, 16.0f, 1), cb8Var, m2oVar, fetVar, (i2 << 6) & 896);
            fetVar.r(true);
            kkb.v(m2oVar.b, cb8Var.a(), fetVar, 0);
            fetVar.r(true);
        } else {
            b = 1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(m2oVar, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    public static final void v(mm40 mm40Var, s7p s7pVar, fet fetVar, int i) {
        int i2;
        float f;
        fetVar.g0(-1344521952);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(s7pVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            int iOrdinal = s7pVar.f31760a.ordinal();
            if (iOrdinal == 0) {
                zcl zclVar = qmk.f28987a;
                f = 128.0f;
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                zcl zclVar2 = qmk.f28987a;
                f = 140.0f;
            } else if (iOrdinal == 3) {
                zcl zclVar3 = qmk.f28987a;
                f = 128.0f;
            } else if (iOrdinal != 4) {
                t9f.b();
                return;
            } else {
                zcl zclVar4 = qmk.f28987a;
                f = 156.0f;
            }
            mm40 mm40VarE = o7k0.e(mm40VarD, f);
            zcl zclVar5 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar5, zclVar5, zclVar5, zclVar5, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qph(mm40Var, s7pVar, i, (byte) 6);
        }
    }

    public static final void w(int i, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-1859769064);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Object objValueOf = Integer.valueOf((i2 & 112) | 6);
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar.F(zhg0Var, fetVar, objValueOf);
            h97.p(((i2 >> 3) & 112) | 6, ugdVar2, zhg0Var, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf4(mm40Var, ugdVar, ugdVar2, i, (byte) 1);
        }
    }

    public static final void x(mm40 mm40Var, jxb0 jxb0Var, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-816647467);
        byte b = 16;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(jxb0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            w((i2 & 14) | 432, u1c.M(-997930657, new elm(jxb0Var, (byte) 10), fetVar), u1c.M(-1132513346, new rgh(jxb0Var, function1, b), fetVar), fetVar, mm40Var);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var, jxb0Var, function1, i, (byte) 26);
        }
    }

    public static final void y(mm40 mm40Var, djv djvVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1335413461);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(djvVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            v8q0.a(djvVar.d, o2e.e0(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), "GUILTY_GEAR_ROUND_TITLE"), StaticColors.INSTANCE.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            K(djvVar.f, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) mm40Var, (Object) djvVar, i, (byte) 22);
        }
    }

    public static final void z(mm40 mm40Var, long j, String str, boolean z, Function1 function1, fet fetVar, int i) {
        String str2;
        mm40 mm40Var2;
        long primary;
        fet fetVar2 = fetVar;
        fetVar2.g0(1668464207);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= fetVar2.g(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (z) {
                fetVar2.e0(1371310328);
                primary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
            } else {
                fetVar2.e0(1371311382);
                primary = ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary();
            }
            fetVar2.r(false);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            int i3 = 57344 & i2;
            int i4 = i2 & 112;
            boolean z2 = (i3 == 16384) | (i4 == 32);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new i11((byte) 9, j, function1);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarE, gy40Var, null, false, null, (Function0) objP2, 28), "ACCORDION_CONTAINER_ROW");
            int i5 = i2;
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int i6 = i5 >> 6;
            v8q0.a(str2, o2e.e0(s5x0.N(jm40Var, 12.0f, 0.0f, 8.0f, 0.0f, 10).e(new x7z(1.0f, true)), "ADDITIONAL_INFO_TEXT"), primary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, i6 & 14, 24960, 110584);
            fetVar2 = fetVar;
            zb zbVar = new zb(null, null, 7);
            boolean z3 = (i4 == 32) | (i3 == 16384);
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new i11((byte) 10, j, function1);
                fetVar2.o0(objP3);
            }
            acb.n(zbVar, z, (Function0) objP3, null, fetVar2, i6 & 112, 8);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qlb(mm40Var2, j, str, z, function1, i, (byte) 1);
        }
    }
}
