package a;

import android.content.Context;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.util.TypedValue;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.EventItem;
import org.xplatform.betting.core.zip.model.zip.EventParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ebc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f7512a = true;

    public static final void A(String str, fet fetVar, int i) {
        fetVar.g0(-420008194);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            pm80 pm80VarF = a8k0.F(R.drawable.dota_item_statistic_hero_placeholder, 0, fetVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(jm40.b, 60.0f, 36.0f);
            long j = kkg.j;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarP, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f);
            zcl zclVar3 = qmk.c;
            k7x.b(str, null, o2e.e0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarJ), "STATISTIC_PLAYER_IMAGE_TEST_TAG"), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar, (i2 & 14) | 36912, 6, 31712);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 21, i, str);
        }
    }

    public static final void B(final mm40 mm40Var, final tvv tvvVar, final x6f x6fVar, final qdz qdzVar, fet fetVar, final int i) {
        qdzVar.getClass();
        fetVar.g0(-1873676252);
        int i2 = fetVar.S ? -fetVar.I.v : fetVar.G.i;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(tvvVar) ? 32 : 16) | (fetVar.i(x6fVar) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var, 1.0f), "ITEM_STATISTIC_HERO_ROW_TEST_TAG");
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE0, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 8.0f, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            fetVar.e0(654259754);
            C(tvvVar, x6fVar, fetVar, (i3 >> 3) & 126);
            if (!tvvVar.e) {
                fetVar.w(i2);
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    final byte b = 0;
                    yfe0VarU.d = new Function2(mm40Var, tvvVar, x6fVar, qdzVar, i, b) { // from class: a.rvv

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f31188a;
                        public final /* synthetic */ mm40 b;
                        public final /* synthetic */ tvv c;
                        public final /* synthetic */ x6f d;
                        public final /* synthetic */ qdz e;

                        {
                            this.f31188a = b;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f31188a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iL = x8x.L(3073);
                                    ebc.B(this.b, this.c, this.d, this.e, (fet) obj, iL);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iL2 = x8x.L(3073);
                                    ebc.B(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            G(R.string.significant_items, tvvVar.g, wyx.f39995a, tvvVar.f34621a, qdzVar, fetVar, 24960);
            G(R.string.neutral_items, tvvVar.h, wyx.b, tvvVar.f34621a, qdzVar, fetVar, 24960);
            G(R.string.support_items, tvvVar.i, wyx.c, tvvVar.f34621a, qdzVar, fetVar, 24960);
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            final byte b2 = 1;
            yfe0VarU2.d = new Function2(mm40Var, tvvVar, x6fVar, qdzVar, i, b2) { // from class: a.rvv

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f31188a;
                public final /* synthetic */ mm40 b;
                public final /* synthetic */ tvv c;
                public final /* synthetic */ x6f d;
                public final /* synthetic */ qdz e;

                {
                    this.f31188a = b2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f31188a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iL = x8x.L(3073);
                            ebc.B(this.b, this.c, this.d, this.e, (fet) obj, iL);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iL2 = x8x.L(3073);
                            ebc.B(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void C(tvv tvvVar, x6f x6fVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(489576466);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(tvvVar) : fetVar.i(tvvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(x6fVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(tvvVar))) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new wqv(x6fVar, tvvVar, b);
                fetVar.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40VarL, null, null, false, null, (Function0) objP, fetVar, 0, 15);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarF);
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
            A(tvvVar.c, fetVar, 0);
            O(tvvVar.b, tvvVar.d, fetVar, 6);
            a(tvvVar.f, 0, fetVar);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) tvvVar, (Object) x6fVar, i, (byte) 26);
        }
    }

    public static final void D(mm40 mm40Var, tim timVar, v3n v3nVar, Function1 function1, fet fetVar, int i) {
        float f;
        fet fetVar2 = fetVar;
        timVar.getClass();
        function1.getClass();
        fetVar2.g0(-1123033928);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(timVar) ? 32 : 16) | (fetVar2.g(v3nVar) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = timVar.a() == y6n.f42107a;
            boolean z2 = timVar.a() == y6n.b;
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = r71.v;
                fetVar2.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int i3 = i2 << 3;
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
            jpm0.o(fetVar2, tj30Var, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar2.e0(-1896339058);
                if (timVar instanceof rim) {
                    fetVar2.e0(-1896284808);
                    mm40 mm40VarK0 = mrv.k0(jm40Var, "FIRST_PLAYER_EVENT_BLOCK_LAYOUT_ID");
                    zcl zclVar = qmk.f28987a;
                    f = 16.0f;
                    mbc.u(s5x0.N(mm40VarK0, 0.0f, 8.0f, 16.0f, 16.0f, 1), nfo.b, (rim) timVar, v3nVar, function1, fetVar2, (i3 & 57344) | (i3 & 7168) | (i3 & 896) | 48);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else {
                    f = 16.0f;
                    if (!(timVar instanceof sim)) {
                        throw b1j.f(-338266892, fetVar2, false);
                    }
                    fetVar2.e0(-1895440120);
                    mm40 mm40VarK1 = mrv.k0(jm40Var, "FIRST_PLAYER_EVENT_BLOCK_LAYOUT_ID");
                    zcl zclVar2 = qmk.f28987a;
                    qcc.o(s5x0.M(mm40VarK1, 22.0f, 8.0f, 16.0f, 16.0f), nfo.b, ((sim) timVar).b, v3nVar, fetVar2, (i3 & 7168) | 48);
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            } else {
                f = 16.0f;
                fetVar2.e0(-1894646303);
                fetVar2.r(false);
            }
            int i4 = i3 & 7168;
            w(mrv.k0(jm40Var, "TIME_BLOCK_LAYOUT_ID"), timVar.c(), timVar.b(), v3nVar, fetVar2, i4 | 6);
            if (z2) {
                fetVar2.e0(-1894234964);
                if (timVar instanceof rim) {
                    fetVar2.e0(-1894180745);
                    mm40 mm40VarK2 = mrv.k0(jm40Var, "SECOND_PLAYER_EVENT_BLOCK_LAYOUT_ID");
                    zcl zclVar3 = qmk.f28987a;
                    fet fetVar3 = fetVar2;
                    mbc.u(s5x0.N(mm40VarK2, 0.0f, 16.0f, 16.0f, 8.0f, 1), nfo.b, (rim) timVar, v3nVar, function1, fetVar3, (i3 & 896) | 48 | i4 | (i3 & 57344));
                    fetVar2 = fetVar3;
                    fetVar2.r(false);
                } else {
                    if (!(timVar instanceof sim)) {
                        throw b1j.f(-338199018, fetVar2, false);
                    }
                    fetVar2.e0(-1893335065);
                    mm40 mm40VarK3 = mrv.k0(jm40Var, "SECOND_PLAYER_EVENT_BLOCK_LAYOUT_ID");
                    zcl zclVar4 = qmk.f28987a;
                    qcc.o(s5x0.M(mm40VarK3, 22.0f, f, f, 8.0f), nfo.b, ((sim) timVar).b, v3nVar, fetVar2, i4 | 48);
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1892540287);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new blw(mm40Var, timVar, v3nVar, function1, i, (byte) 0);
        }
    }

    public static final void E(mm40 mm40Var, v3n v3nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-483226375);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(v3nVar) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, i120.Q(o7k0.e(mm40Var, 1.0f), v3nVar.b().f(fetVar), jd8.n));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, v3nVar, i, b);
        }
    }

    public static final void F(mm40 mm40Var, p0n p0nVar, String str, fet fetVar, int i) {
        mm40 mm40Var2;
        float f;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(963366854);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(p0nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var2, 14.0f), 1.0f);
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
            if (p0nVar != null) {
                fetVar2.e0(536457144);
                f = 1.0f;
                rcb.x(null, u1c.O(p0nVar), h2m.f12341a, nsm0.y(p0nVar.b), true, null, fetVar2, 384);
                fetVar2.r(false);
            } else {
                f = 1.0f;
                fetVar2.e0(536764664);
                fetVar2.r(false);
            }
            if (str.length() > 0) {
                fetVar2.e0(536824308);
                jm40Var = jm40Var2;
                f1t0.a(new x7z(f, true), str, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), 0L, fetVar, (i2 >> 3) & 112, 438264);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(537114840);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var2, (Object) p0nVar, (Object) str, i, (byte) 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f9  */
    public static final void G(final int i, final List list, final wyx wyxVar, final long j, final qdz qdzVar, fet fetVar, final int i2) {
        int i3;
        wyx wyxVar2;
        yfe0 yfe0VarU;
        Function2 function2;
        String str;
        Object obj;
        boolean z;
        boolean z2;
        Object objP;
        fet fetVar2 = fetVar;
        fetVar2.g0(1582907099);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(list) : fetVar2.i(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.e(wyxVar.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.f(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.g(qdzVar) ? 16384 : 8192;
        }
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            if (list.isEmpty()) {
                yfe0VarU = fetVar2.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                function2 = new Function2() { // from class: a.svv
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b2 = b;
                        int i4 = i2;
                        switch (b2) {
                            case 0:
                                ((Integer) obj3).getClass();
                                ebc.G(i, list, wyxVar, j, qdzVar, (fet) obj2, x8x.L(i4 | 1));
                                break;
                            default:
                                ((Integer) obj3).getClass();
                                ebc.G(i, list, wyxVar, j, qdzVar, (fet) obj2, x8x.L(i4 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                int iOrdinal = wyxVar.ordinal();
                if (iOrdinal == 0) {
                    str = "ITEM_STATISTIC_SIGNIFICANT_GROUP_TEST_TAG";
                } else if (iOrdinal == 1) {
                    str = "ITEM_STATISTIC_NEUTRAL_GROUP_TEST_TAG";
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return;
                    }
                    str = "ITEM_STATISTIC_SUPPORT_GROUP_TEST_TAG";
                }
                jm40 jm40Var = jm40.b;
                mm40 mm40VarE0 = o2e.e0(jm40Var, str);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarD = o7k0.d(s5x0.N(mm40VarE0, 8.0f, 12.0f, 8.0f, 0.0f, 8), 1.0f);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
                jpm0.o(fetVar2, x5dVarA, gqw0.x);
                jpm0.o(fetVar2, bh90VarM, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                int i4 = i3;
                boolean z3 = false;
                v8q0.a(rsm0.w(i, i3 & 14, fetVar2), s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 110584);
                fetVar2 = fetVar;
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                wyxVar2 = wyxVar;
                sb.append(wyxVar2);
                xcz xczVarB = qdzVar.b(sb.toString(), new s3t((byte) 26), fetVar2, (i4 >> 6) & 896);
                qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
                if ((i4 & 112) != 32) {
                    if ((i4 & 64) != 0) {
                        obj = list;
                        if (fetVar2.i(obj)) {
                        }
                        if ((i4 & 896) == 256) {
                            z3 = true;
                        }
                        z2 = z | z3;
                        objP = fetVar2.P();
                        if (z2 || objP == ukd.f35823a) {
                            objP = new f3s(obj, wyxVar2, (byte) 21);
                            fetVar2.o0(objP);
                        }
                        b8k0.f(mm40VarD2, xczVarB, null, false, qw3Var, null, null, false, null, (Function1) objP, fetVar2, 6, 492);
                        fetVar2.r(true);
                    } else {
                        obj = list;
                    }
                    z = false;
                    if ((i4 & 896) == 256) {
                        z3 = true;
                    }
                    z2 = z | z3;
                    objP = fetVar2.P();
                    if (z2) {
                        objP = new f3s(obj, wyxVar2, (byte) 21);
                        fetVar2.o0(objP);
                    } else {
                        objP = new f3s(obj, wyxVar2, (byte) 21);
                        fetVar2.o0(objP);
                    }
                    b8k0.f(mm40VarD2, xczVarB, null, false, qw3Var, null, null, false, null, (Function1) objP, fetVar2, 6, 492);
                    fetVar2.r(true);
                } else {
                    obj = list;
                }
                z = true;
                if ((i4 & 896) == 256) {
                    z3 = true;
                }
                z2 = z | z3;
                objP = fetVar2.P();
                if (z2) {
                    objP = new f3s(obj, wyxVar2, (byte) 21);
                    fetVar2.o0(objP);
                } else {
                    objP = new f3s(obj, wyxVar2, (byte) 21);
                    fetVar2.o0(objP);
                }
                b8k0.f(mm40VarD2, xczVarB, null, false, qw3Var, null, null, false, null, (Function1) objP, fetVar2, 6, 492);
                fetVar2.r(true);
            }
            yfe0VarU.d = function2;
        }
        wyxVar2 = wyxVar;
        fetVar2.X();
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            final wyx wyxVar3 = wyxVar2;
            function2 = new Function2() { // from class: a.svv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    byte b3 = b2;
                    int i5 = i2;
                    switch (b3) {
                        case 0:
                            ((Integer) obj3).getClass();
                            ebc.G(i, list, wyxVar3, j, qdzVar, (fet) obj2, x8x.L(i5 | 1));
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            ebc.G(i, list, wyxVar3, j, qdzVar, (fet) obj2, x8x.L(i5 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void H(mm40 mm40Var, xcz xczVar, float f, pz40 pz40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        xcz xczVar2;
        fetVar.g0(1902066171);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            xczVar2 = xczVar;
            i2 |= fetVar.g(xczVar2) ? 32 : 16;
        } else {
            xczVar2 = xczVar;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(pz40Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dpl((Object) pz40Var, (Object) ugdVar, (byte) 7);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, xczVar2, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, i2 & 112, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pt1(mm40Var, xczVar, f, pz40Var, ugdVar, i, (byte) 6);
        }
    }

    public static final void I(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-776283208);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 16.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            if (str.length() > 0) {
                fetVar2.e0(-1252575435);
                j6n.h(str, oro0.f25744a, null, 0, 0, fetVar2, ((i2 >> 3) & 14) | 48, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1252428402);
                fetVar2.r(false);
            }
            v8q0.a(str2, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i2 >> 6) & 14, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str2, i, (byte) 27);
        }
    }

    public static final void J(mm40 mm40Var, String str, dkk dkkVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(245463150);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(dkkVar) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            jm40 jm40Var = jm40.b;
            v8q0.a(str, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i2 >> 3) & 14, 24960, 110584);
            fetVar2 = fetVar;
            K(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), R.drawable.ic_glyph_cyber_kosti_one, dkkVar.f6234a, dkkVar.b, dkkVar.c, fetVar2, 0, 0);
            K(null, R.drawable.ic_glyph_cyber_kosti_two, dkkVar.d, dkkVar.e, dkkVar.f, fetVar2, 0, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kwm(mm40Var, str, dkkVar, i, (byte) 6);
        }
    }

    public static final void K(mm40 mm40Var, int i, String str, String str2, String str3, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        fet fetVar2 = fetVar;
        fetVar2.g0(1399832947);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar2.g(mm40Var2) ? 4 : 2);
        }
        int i6 = i4 | (fetVar2.e(i) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.g(str3) ? 16384 : 8192);
        if (fetVar2.U(i6 & 1, (i6 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            if (i5 != 0) {
                mm40Var2 = jm40Var;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var2, 24.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarN = o7k0.n(jm40Var, 16.0f);
            int i7 = i6 >> 3;
            pm80 pm80VarF = a8k0.F(i, i7 & 14, fetVar2);
            zfn zfnVar = zaq0.b;
            dww.c(pm80VarF, "", mm40VarN, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            S(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), str, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), false, fetVar, i7 & 112, 8);
            S(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), str2, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), false, fetVar, (i6 >> 6) & 112, 8);
            fetVar2 = fetVar;
            S(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), str3, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), true, fetVar2, ((i6 >> 9) & 112) | 3072, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lwm(mm40Var2, i, str, str2, str3, i2, i3, (byte) 7);
        }
    }

    public static final void L(mm40 mm40Var, a2m a2mVar, boolean z, fet fetVar, int i) {
        fetVar.g0(525912846);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(a2mVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 70.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            tj30 tj30VarC = zq8.c(gqw0.h, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            obb.q(null, a2mVar, z, fetVar, i2 & 1008, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wwm(mm40Var, a2mVar, z, i, (byte) 1);
        }
    }

    public static final void M(mm40 mm40Var, z0n z0nVar, fet fetVar, int i) {
        byte b;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-871093254);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(z0nVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 16.0f);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            String str = z0nVar.f43576a;
            int i3 = z0nVar.b;
            f1t0.a(new x7z(1.0f, false), str, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), 0L, fetVar, 0, 438264);
            fetVar2 = fetVar;
            if (i3 != 0) {
                fetVar2.e0(-2050613898);
                tdc.e(new rpe(i3), ipe.f15159a, null, fetVar2, 48, 4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2050446684);
                fetVar2.r(false);
            }
            b = 1;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            b = 1;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n(mm40Var2, z0nVar, i, b);
        }
    }

    public static final void N(mm40 mm40Var, z0n z0nVar, z0n z0nVar2, p0n p0nVar, String str, fet fetVar, int i) {
        int i2;
        fetVar.g0(2143784634);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(z0nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(z0nVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(p0nVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 50.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            F(null, p0nVar, str, fetVar, (i2 >> 6) & 1008);
            M(null, z0nVar, fetVar, i2 & 112);
            M(null, z0nVar2, fetVar, (i2 >> 3) & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var, (Object) z0nVar, (Object) z0nVar2, (Object) p0nVar, (Object) str, i, (byte) 23);
        }
    }

    public static final void O(String str, String str2, fet fetVar, int i) {
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1254276318);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(x7zVar, 6.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
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
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, (i2 >> 3) & 14, 24960, 110586);
            str3 = str2;
            v8q0.a(str3, s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.f(), fetVar, (i2 >> 6) & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str3 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 10, i, str, str3);
        }
    }

    public static final void P(mm40 mm40Var, String str, String str2, String str3, boolean z, boolean z2, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        pcy pcyVar;
        fetVar.g0(1740779820);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            long jD = z ? cs0.D(fetVar, 2147138929, fetVar, false) : cs0.e(fetVar, 2147139859, fetVar, false);
            long jD2 = z2 ? cs0.D(fetVar, 2147143025, fetVar, false) : cs0.e(fetVar, 2147143955, fetVar, false);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarT = o7k0.t(mm40VarC, 12.0f, 108.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarT);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z3) {
                fetVar.l(pcyVar2);
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
            mm40 mm40VarE = o7k0.e(jm40Var, 14.0f);
            zx7 zx7Var = gqw0.e;
            int i3 = i2;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            v8q0.a(str, null, afn0.m(fetVar).getSecondary80(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, (i3 >> 3) & 14, 24960, 110586);
            fetVar.r(true);
            mm40 mm40VarG = o7k0.g(jm40Var, 14.0f, 0.0f, 2);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarG);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            y9q0 y9q0VarA = g1t0.a();
            long j = qmk.o;
            v8q0.a(str2, null, jD, gfk0.b(j, g1t0.a().f42262a.b), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarA, fetVar, (i3 >> 6) & 14, 24960, 110578);
            fetVar.r(true);
            mm40 mm40VarG2 = o7k0.g(jm40Var, 14.0f, 0.0f, 2);
            tj30 tj30VarC3 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarG2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC3, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            v8q0.a(str3, null, jD2, gfk0.b(j, g1t0.a().f42262a.b), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.a(), fetVar, (i3 >> 9) & 14, 24960, 110578);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p1n(mm40Var2, str, str2, str3, z, z2, i, (byte) 0);
        }
    }

    public static final void Q(mm40 mm40Var, String str, dkk dkkVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(172493205);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(dkkVar) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.o, fetVar2, 48);
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
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            jm40 jm40Var = jm40.b;
            v8q0.a(str, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), textPrimary, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i2 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar;
            R(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), R.drawable.ic_glyph_cyber_kosti_one, dkkVar.f6234a, dkkVar.b, dkkVar.c, fetVar2, 0, 0);
            R(null, R.drawable.ic_glyph_cyber_kosti_two, dkkVar.d, dkkVar.e, dkkVar.f, fetVar2, 0, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kwm(mm40Var, str, dkkVar, i, (byte) 7);
        }
    }

    public static final void R(mm40 mm40Var, int i, String str, String str2, String str3, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        fet fetVar2 = fetVar;
        fetVar2.g0(191109548);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar2.g(mm40Var2) ? 4 : 2);
        }
        int i6 = i4 | (fetVar2.e(i) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.g(str3) ? 16384 : 8192);
        if (fetVar2.U(i6 & 1, (i6 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            if (i5 != 0) {
                mm40Var2 = jm40Var;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var2, 24.0f);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            zfn zfnVar = zaq0.b;
            S(mm40VarN, str3, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), true, fetVar2, ((i6 >> 9) & 112) | 3072, 0);
            S(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), str2, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), false, fetVar, (i6 >> 6) & 112, 8);
            int i7 = i6 >> 3;
            fetVar2 = fetVar;
            S(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), str, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), false, fetVar2, i7 & 112, 8);
            dww.c(a8k0.F(i, i7 & 14, fetVar2), "", o7k0.n(jm40Var, 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lwm(mm40Var2, i, str, str2, str3, i2, i3, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:65:0x0144  */
    /* JADX WARN: Code duplicated, block: B:69:0x014f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0154  */
    /* JADX WARN: Code duplicated, block: B:73:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x015b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0161  */
    /* JADX WARN: Code duplicated, block: B:77:0x0165  */
    /* JADX WARN: Code duplicated, block: B:80:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void S(mm40 mm40Var, String str, long j, boolean z, fet fetVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        fet fetVar2;
        boolean z4;
        yfe0 yfe0VarU;
        boolean z5;
        int i4;
        boolean z6;
        Object objP;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objP2;
        String strL;
        fetVar.g0(-1487835850);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.f(j) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= fetVar.h(z2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                if (i5 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarP = o7k0.p(mm40Var, 20.0f, 22.0f);
                dn8 dn8VarH = j120.h(0.5f, ((ThemeColors) fetVar.k(zaq0.b)).getSeparator());
                mm40 mm40VarT = i120.T(mm40VarP, dn8VarH.f6356a, dn8VarH.b, vgg0.a(6.0f));
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarT);
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
                i4 = i3 & 7168;
                if (i4 == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (z6 || objP == cl5Var) {
                    if (z5) {
                        objP = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                    } else {
                        objP = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
                    }
                    fetVar.o0(objP);
                }
                y9q0 y9q0Var = (y9q0) objP;
                if ((i3 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i4 == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z7 | z8;
                objP2 = fetVar.P();
                if (z9 || objP2 == cl5Var) {
                    strL = null;
                    if (z5) {
                        if (str != null) {
                            strL = ttm0.L(2, str);
                        }
                    } else if (str != null) {
                        strL = ttm0.L(1, str);
                    }
                    if (strL == null) {
                        objP2 = "";
                    } else {
                        objP2 = strL;
                    }
                    fetVar.o0(objP2);
                }
                v8q0.a((String) objP2, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, i3 & 896, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(true);
                z4 = z5;
            } else {
                fetVar2 = fetVar;
                fetVar2.X();
                z4 = z2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new vwm(mm40Var, str, j, z4, i, i2, (byte) 1);
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i3 & 1, z3)) {
            if (i5 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarP2 = o7k0.p(mm40Var, 20.0f, 22.0f);
            dn8 dn8VarH2 = j120.h(0.5f, ((ThemeColors) fetVar.k(zaq0.b)).getSeparator());
            mm40 mm40VarT2 = i120.T(mm40VarP2, dn8VarH2.f6356a, dn8VarH2.b, vgg0.a(6.0f));
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarT2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            i4 = i3 & 7168;
            if (i4 == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z6) {
                if (z5) {
                    objP = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                } else {
                    objP = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
                }
                fetVar.o0(objP);
            } else {
                if (z5) {
                    objP = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                } else {
                    objP = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
                }
                fetVar.o0(objP);
            }
            y9q0 y9q0Var2 = (y9q0) objP;
            if ((i3 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i4 == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = z7 | z8;
            objP2 = fetVar.P();
            if (z9) {
                strL = null;
                if (z5) {
                    if (str != null) {
                        strL = ttm0.L(2, str);
                    }
                } else if (str != null) {
                    strL = ttm0.L(1, str);
                }
                if (strL == null) {
                    objP2 = "";
                } else {
                    objP2 = strL;
                }
                fetVar.o0(objP2);
            } else {
                strL = null;
                if (z5) {
                    if (str != null) {
                        strL = ttm0.L(2, str);
                    }
                } else if (str != null) {
                    strL = ttm0.L(1, str);
                }
                if (strL == null) {
                    objP2 = "";
                } else {
                    objP2 = strL;
                }
                fetVar.o0(objP2);
            }
            v8q0.a((String) objP2, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var2, fetVar, i3 & 896, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            z4 = z5;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            z4 = z2;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vwm(mm40Var, str, j, z4, i, i2, (byte) 1);
        }
    }

    public static final void T(mm40 mm40Var, String str, String str2, String str3, boolean z, boolean z2, fet fetVar, int i) {
        String str4;
        mm40 mm40Var2;
        long secondary;
        long secondary2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1418882295);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str4 = str3;
            i2 |= fetVar2.g(str4) ? 2048 : 1024;
        } else {
            str4 = str3;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.h(z2) ? 131072 : 65536;
        }
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            if (z) {
                secondary = cs0.D(fetVar2, -2041242802, fetVar2, false);
            } else {
                fetVar2.e0(-2041241870);
                secondary = afn0.m(fetVar2).getSecondary();
                fetVar2.r(false);
            }
            long j = secondary;
            if (z2) {
                secondary2 = cs0.D(fetVar2, -2041238642, fetVar2, false);
            } else {
                fetVar2.e0(-2041237710);
                secondary2 = afn0.m(fetVar2).getSecondary();
                fetVar2.r(false);
            }
            long j2 = secondary2;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarT = o7k0.t(mm40VarC, 12.0f, 32.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarT);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarE = o7k0.e(jm40Var, 14.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int i3 = i2;
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40Var2 = jm40Var;
            v8q0.a(str, null, afn0.m(fetVar2).getSecondary80(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar2, (i3 >> 3) & 14, 24960, 110586);
            fetVar2.r(true);
            v8q0.a(str2, o7k0.e(mm40Var2, 14.0f), j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.d(), fetVar2, (i3 >> 6) & 14, 24576, 114680);
            v8q0.a(str4, o7k0.e(mm40Var2, 14.0f), j2, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.d(), fetVar, (i3 >> 9) & 14, 24576, 114680);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p1n(mm40Var2, str, str2, str3, z, z2, i, (byte) 1);
        }
    }

    public static final void U(mm40 mm40Var, String str, String str2, String str3, z0n z0nVar, z0n z0nVar2, fet fetVar, int i) {
        mm40 mm40Var2;
        jm40 jm40Var;
        boolean z;
        String str4 = z0nVar.c;
        String str5 = z0nVar2.c;
        fetVar.g0(-1298167476);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(z0nVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(z0nVar2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(o7k0.e(jm40Var2, 50.0f), 2.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            if (str4.length() <= 0 || str5.length() <= 0) {
                jm40Var = jm40Var2;
                z = true;
                fetVar.e0(227237874);
                fetVar.r(false);
            } else {
                fetVar.e0(226865006);
                jm40Var = jm40Var2;
                z = true;
                T(null, str, str4, str5, z0nVar.g, z0nVar2.g, fetVar, i2 & 112);
                fetVar.r(false);
            }
            if (z0nVar.d.length() <= 0 || z0nVar2.d.length() <= 0) {
                fetVar.e0(227717010);
                fetVar.r(false);
            } else {
                fetVar.e0(227348947);
                T(null, str2, z0nVar.d, z0nVar2.d, z0nVar.h, z0nVar2.h, fetVar, (i2 >> 3) & 112);
                fetVar.r(false);
            }
            if (z0nVar.e.length() <= 0 || z0nVar2.e.length() <= 0) {
                fetVar.e0(228221938);
                fetVar.r(false);
            } else {
                fetVar.e0(227834655);
                P(null, str3, z0nVar.e, z0nVar2.e, z0nVar.f, z0nVar2.f, fetVar, (i2 >> 6) & 112);
                fetVar.r(false);
            }
            fetVar.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var2, (Object) str, (Object) str2, (Object) str3, (Object) z0nVar, (Object) z0nVar2, i, (byte) 18);
        }
    }

    public static final void V(mm40 mm40Var, float f, fet fetVar, int i) {
        fetVar.g0(153912982);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Configuration configuration = (Configuration) fetVar.k(dy2.f6873a);
            zcl zclVar = qmk.f28987a;
            boolean zE = fetVar.e(configuration.screenWidthDp);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            Object obj2 = objP;
            if (zE || objP == obj) {
                int i3 = configuration.screenWidthDp / 64;
                ArrayList arrayList = new ArrayList(i3);
                for (int iC = 0; iC < i3; iC = w6x.c(iC, iC, 1, arrayList)) {
                }
                fetVar.o0(arrayList);
                obj2 = arrayList;
            }
            List list = (List) obj2;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
            zcl zclVar2 = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean zI = fetVar.i(list);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new gg4(list, (byte) 5);
                fetVar.o0(objP2);
            }
            b8k0.f(mm40VarD, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 12582912, 362);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dql(mm40Var, f, i, (byte) 2);
        }
    }

    public static final void W(String str, String str2, fet fetVar, int i) {
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-989785428);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, 60.0f, 32.0f);
            long j = kkg.j;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarP, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            pm80 pm80VarF = a8k0.F(R.drawable.dota_item_statistic_item_placeholder, 0, fetVar2);
            mm40 mm40VarP2 = o7k0.p(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 34.0f, 24.0f);
            zcl zclVar3 = qmk.c;
            k7x.b(str, null, o2e.e0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarP2), "ITEM_STATISTIC_ITEM_IMAGE_TEST_TAG"), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar2, (i2 & 14) | 36912, 0, 32736);
            str3 = str2;
            v8q0.a(str3, s5x0.J(o7k0.d(jm40Var, 1.0f), 2.0f), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, (i2 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str3 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 11, i, str, str3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:22:0x0066->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[EDGE_INSN: B:31:0x0050->B:18:0x0050 BREAK  A[LOOP:0: B:22:0x0066->B:26:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object X(a.inn0 r8, a.xoa0 r9, a.zw5 r10) {
        /*
            boolean r0 = r10 instanceof a.vtq
            if (r0 == 0) goto L13
            r0 = r10
            a.vtq r0 = (a.vtq) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.vtq r0 = new a.vtq
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            a.xoa0 r8 = r0.j
            a.inn0 r9 = r0.i
            a.z1x.P(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L5d
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L36:
            a.z1x.P(r10)
            a.jnn0 r10 = r8.f
            a.woa0 r10 = r10.s
            java.util.List r10 = r10.f39485a
            int r2 = r10.size()
            r5 = r3
        L44:
            if (r5 >= r2) goto L79
            java.lang.Object r6 = r10.get(r5)
            a.dpa0 r6 = (a.dpa0) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L76
        L50:
            r0.i = r8
            r0.j = r9
            r0.l = r4
            java.lang.Object r10 = r8.a(r9, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            a.woa0 r10 = (a.woa0) r10
            java.util.List r10 = r10.f39485a
            int r2 = r10.size()
            r5 = r3
        L66:
            if (r5 >= r2) goto L79
            java.lang.Object r6 = r10.get(r5)
            a.dpa0 r6 = (a.dpa0) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L73
            goto L50
        L73:
            int r5 = r5 + 1
            goto L66
        L76:
            int r5 = r5 + 1
            goto L44
        L79:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ebc.X(a.inn0, a.xoa0, a.zw5):java.lang.Object");
    }

    public static final Object Y(hpa0 hpa0Var, Function2 function2, yje yjeVar) {
        Object objZ0 = ((jnn0) hpa0Var).Z0(yjeVar, new wij(yjeVar.getContext(), function2, null, (byte) 1));
        return objZ0 == wne.f39444a ? objZ0 : Unit.f46060a;
    }

    public static final void Z(cp cpVar) {
        int iA;
        yfu0 yfu0Var = cpVar.u;
        ((hsx) yfu0Var).b.setSelected(((g6s) cpVar.u()).b);
        TextView textView = ((hsx) yfu0Var).b;
        Context context = cpVar.w;
        if (((g6s) cpVar.u()).b) {
            iA = context.getColor(R.color.static_white);
        } else {
            TypedValue typedValue = j5d.f15927a;
            iA = j5d.a(context, R.attr.uikitTextPrimary, false);
        }
        textView.setTextColor(iA);
    }

    public static final void a(int i, int i2, fet fetVar) {
        fetVar.g0(-1677228195);
        int i3 = (fetVar.e(i) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            int i4 = i3 & 14;
            pm80 pm80VarF = a8k0.F(i, i4, fetVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40.b, 36.0f);
            long j = kkg.j;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.J(i120.Q(mm40VarN, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 6.0f), "ITEM_STATISTIC_HERO_ROW_ARROW_TEST_TAG");
            boolean z = i4 == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dx2(i, (byte) 19);
                fetVar.o0(objP);
            }
            j0x.b(pm80VarF, null, pai0.a(mm40VarE0, false, (Function1) objP), null, null, 0.0f, null, fetVar, 56, 120);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i, i2, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x028d  */
    /* JADX WARN: Code duplicated, block: B:119:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:142:0x037b  */
    /* JADX WARN: Code duplicated, block: B:158:0x03db  */
    /* JADX WARN: Code duplicated, block: B:178:0x045b  */
    /* JADX WARN: Code duplicated, block: B:202:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:228:0x057a  */
    /* JADX WARN: Code duplicated, block: B:248:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:268:0x065a  */
    /* JADX WARN: Code duplicated, block: B:292:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:308:0x0764  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:83:0x020d  */
    public static final l6t0 a0(long j, ctf0 ctf0Var, List list) {
        Object next;
        jph jphVar;
        jph jphVar2;
        jph jphVar3;
        jph jphVar4;
        jph jphVar5;
        pqh pqhVar;
        jph jphVar6;
        jph jphVar7;
        jph jphVar8;
        jph jphVar9;
        jph jphVar10;
        jph jphVar11;
        jph jphVar12;
        jph jphVar13;
        list.getClass();
        ctf0Var.getClass();
        c0o c0oVar = pcs.d;
        ArrayList<pcs> arrayList = new ArrayList();
        c0oVar.getClass();
        int i = 0;
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            Object next2 = y2Var.next();
            pcs pcsVar = (pcs) next2;
            pcsVar.getClass();
            mxp mxpVar = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar2 = (mxp) CollectionsKt.W(1, list);
            int iOrdinal = pcsVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    if (mxpVar != null && mxpVar2 != null && tdc.S(mxpVar, mxpVar2)) {
                        arrayList.add(next2);
                    }
                } else if (mxpVar != null && mxpVar2 != null && tdc.a0(mxpVar, mxpVar2)) {
                    arrayList.add(next2);
                }
            } else if (mxpVar != null && mxpVar2 != null && tdc.h0(mxpVar, mxpVar2)) {
                arrayList.add(next2);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((pcs) next).f26774a != j);
        pcs pcsVar2 = (pcs) next;
        if (pcsVar2 == null && (pcsVar2 = (pcs) CollectionsKt.firstOrNull(arrayList)) == null) {
            return null;
        }
        lsm0 lsm0Var = ctf0Var.b;
        hjm hjmVar = new hjm(lsm0Var.a(R.string.general_statistic, Arrays.copyOf(new Object[0], 0)), new njm(127), new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()), null, null, null, false, null, null, false, null, null, 8184);
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (pcs pcsVar3 : arrayList) {
            arrayList2.add(new lxl(pcsVar3.f26774a, (dyl) new xxl(lsm0Var.a(pcsVar3.b, Arrays.copyOf(new Object[i], i))), false, ((long) pcsVar3.f26774a) == ((long) pcsVar2.f26774a) ? uxl.b : uxl.f36445a, (cwl) null, 108));
            i = 0;
        }
        a4x a4xVarO0 = dyb.o0(arrayList2);
        float f = xfn.b(ctf0Var.j()).c;
        zcl zclVar = qmk.f28987a;
        fyl fylVar = new fyl(a4xVarO0, null, null, s5x0.t(f + 8.0f, 0.0f, 2), null, 22);
        int iOrdinal2 = pcsVar2.ordinal();
        if (iOrdinal2 == 0) {
            lc00 lc00VarB = kotlin.collections.a.b();
            mxp mxpVar3 = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar4 = (mxp) CollectionsKt.W(1, list);
            if (mxpVar3 != null) {
                fyp fypVar = mxpVar3.M;
                if (mxpVar4 != null) {
                    fyp fypVar2 = mxpVar4.M;
                    byp bypVar = fypVar.f10370a;
                    int i2 = bypVar.f3429a;
                    float f2 = bypVar.b;
                    if (i2 != -1) {
                        byp bypVar2 = fypVar2.f10370a;
                        int i3 = bypVar2.f3429a;
                        float f3 = bypVar2.b;
                        if (i3 == -1 || tdc.Y(f2, f3)) {
                            jphVar = null;
                        } else {
                            jphVar = new jph(lsm0Var.a(R.string.ko_tko, Arrays.copyOf(new Object[0], 0)), new aqh(wzb.E0(Float.valueOf(f2)), (int) f2, f2 > f3), new aqh(wzb.E0(Float.valueOf(f3)), (int) f3, f3 > f2));
                        }
                    } else {
                        jphVar = null;
                    }
                } else {
                    jphVar = null;
                }
            } else {
                jphVar = null;
            }
            lc00VarB.add(jphVar);
            mxp mxpVar5 = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar6 = (mxp) CollectionsKt.W(1, list);
            if (mxpVar5 != null) {
                fyp fypVar3 = mxpVar5.M;
                if (mxpVar6 != null) {
                    fyp fypVar4 = mxpVar6.M;
                    byp bypVar3 = fypVar3.c;
                    int i4 = bypVar3.f3429a;
                    float f4 = bypVar3.b;
                    if (i4 != -1) {
                        byp bypVar4 = fypVar4.c;
                        int i5 = bypVar4.f3429a;
                        float f5 = bypVar4.b;
                        if (i5 == -1 || tdc.Y(f4, f5)) {
                            jphVar2 = null;
                        } else {
                            jphVar2 = new jph(lsm0Var.a(R.string.ufc_sub, Arrays.copyOf(new Object[0], 0)), new aqh(wzb.E0(Float.valueOf(f4)), (int) f4, f4 > fypVar4.f10370a.b), new aqh(wzb.E0(Float.valueOf(f5)), (int) f5, f5 > f4));
                        }
                    } else {
                        jphVar2 = null;
                    }
                } else {
                    jphVar2 = null;
                }
            } else {
                jphVar2 = null;
            }
            lc00VarB.add(jphVar2);
            mxp mxpVar7 = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar8 = (mxp) CollectionsKt.W(1, list);
            if (mxpVar7 != null) {
                fyp fypVar5 = mxpVar7.M;
                if (mxpVar8 != null) {
                    fyp fypVar6 = mxpVar8.M;
                    byp bypVar5 = fypVar5.b;
                    int i6 = bypVar5.f3429a;
                    float f6 = bypVar5.b;
                    if (i6 != -1) {
                        byp bypVar6 = fypVar6.b;
                        int i7 = bypVar6.f3429a;
                        float f7 = bypVar6.b;
                        if (i7 == -1 || tdc.Y(f6, f7)) {
                            jphVar3 = null;
                        } else {
                            jphVar3 = new jph(lsm0Var.a(R.string.dec, Arrays.copyOf(new Object[0], 0)), new aqh(wzb.E0(Float.valueOf(f6)), (int) f6, f6 > f7), new aqh(wzb.E0(Float.valueOf(f7)), (int) f7, f7 > f6));
                        }
                    } else {
                        jphVar3 = null;
                    }
                } else {
                    jphVar3 = null;
                }
            } else {
                jphVar3 = null;
            }
            lc00VarB.add(jphVar3);
            ArrayList arrayListS = CollectionsKt.S(kotlin.collections.a.a(lc00VarB));
            nqh nqhVar = arrayListS.isEmpty() ? null : new nqh(dyb.o0(arrayListS));
            lc00 lc00VarB2 = kotlin.collections.a.b();
            mxp mxpVar9 = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar10 = (mxp) CollectionsKt.W(1, list);
            if (mxpVar9 != null) {
                int i8 = mxpVar9.I;
                if (mxpVar10 != null) {
                    int i9 = mxpVar10.I;
                    if (i8 == -1 || i9 == -1 || (i8 == 0 && i9 == 0)) {
                        jphVar4 = null;
                    } else {
                        String strA = lsm0Var.a(R.string.avg_fight_time, Arrays.copyOf(new Object[0], 0));
                        long j2 = i8;
                        Locale locale = Locale.ENGLISH;
                        long j3 = i9;
                        jphVar4 = new jph(strA, new aqh(String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)}, 2)), i8, i8 > i9), new aqh(String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3 / 60), Long.valueOf(j3 % 60)}, 2)), i9, i9 > i8));
                    }
                } else {
                    jphVar4 = null;
                }
            } else {
                jphVar4 = null;
            }
            lc00VarB2.add(jphVar4);
            mxp mxpVar11 = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar12 = (mxp) CollectionsKt.W(1, list);
            if (mxpVar11 != null) {
                float f8 = mxpVar11.F;
                if (mxpVar12 != null) {
                    float f9 = mxpVar12.F;
                    if (tdc.Y(f8, f9)) {
                        jphVar5 = null;
                    } else {
                        jphVar5 = new jph(lsm0Var.a(R.string.avg_knockdown, Arrays.copyOf(new Object[0], 0)), new aqh(wzb.H0(Float.valueOf(f8)), vfc.H(f8, f9), f8 > f9), new aqh(wzb.H0(Float.valueOf(f9)), vfc.H(f9, f8), f9 > f8));
                    }
                } else {
                    jphVar5 = null;
                }
            } else {
                jphVar5 = null;
            }
            lc00VarB2.add(jphVar5);
            ArrayList arrayListS2 = CollectionsKt.S(kotlin.collections.a.a(lc00VarB2));
            pqhVar = new pqh(nqhVar, arrayListS2.isEmpty() ? null : new vph(dyb.o0(arrayListS2), null), 4);
        } else if (iOrdinal2 == 1) {
            lc00 lc00VarB3 = kotlin.collections.a.b();
            mxp mxpVar13 = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar14 = (mxp) CollectionsKt.W(1, list);
            if (mxpVar13 != null) {
                float f10 = mxpVar13.u;
                if (mxpVar14 != null) {
                    float f11 = mxpVar14.u;
                    if (tdc.Y(f10, f11)) {
                        jphVar6 = null;
                    } else {
                        jphVar6 = new jph(lsm0Var.a(R.string.hits_accuracy, Arrays.copyOf(new Object[0], 0)), new aqh(wzb.E0(Float.valueOf(f10)), (int) f10, f10 > f11), new aqh(wzb.E0(Float.valueOf(f11)), (int) f11, f11 > f10));
                    }
                } else {
                    jphVar6 = null;
                }
            } else {
                jphVar6 = null;
            }
            lc00VarB3.add(jphVar6);
            mxp mxpVar15 = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar16 = (mxp) CollectionsKt.W(1, list);
            if (mxpVar15 != null) {
                float f12 = mxpVar15.x;
                if (mxpVar16 != null) {
                    float f13 = mxpVar16.x;
                    if (tdc.Y(f12, f13)) {
                        jphVar7 = null;
                    } else {
                        jphVar7 = new jph(lsm0Var.a(R.string.hits_protection, Arrays.copyOf(new Object[0], 0)), new aqh(wzb.E0(Float.valueOf(f12)), (int) f12, f12 > f13), new aqh(wzb.E0(Float.valueOf(f13)), (int) f13, f13 > f12));
                    }
                } else {
                    jphVar7 = null;
                }
            } else {
                jphVar7 = null;
            }
            lc00VarB3.add(jphVar7);
            ArrayList arrayListS3 = CollectionsKt.S(kotlin.collections.a.a(lc00VarB3));
            nqh nqhVar2 = arrayListS3.isEmpty() ? null : new nqh(dyb.o0(arrayListS3));
            lc00 lc00VarB4 = kotlin.collections.a.b();
            mxp mxpVar17 = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar18 = (mxp) CollectionsKt.W(1, list);
            if (mxpVar17 != null) {
                float f14 = mxpVar17.v;
                if (mxpVar18 != null) {
                    float f15 = mxpVar18.v;
                    if (tdc.Y(f14, f15)) {
                        jphVar8 = null;
                    } else {
                        jphVar8 = new jph(lsm0Var.a(R.string.delivered, Arrays.copyOf(new Object[0], 0)), new aqh(wzb.H0(Float.valueOf(f14)), vfc.H(f14, f15), f14 > f15), new aqh(wzb.H0(Float.valueOf(f15)), vfc.H(f15, f14), f15 > f14));
                    }
                } else {
                    jphVar8 = null;
                }
            } else {
                jphVar8 = null;
            }
            lc00VarB4.add(jphVar8);
            mxp mxpVar19 = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar20 = (mxp) CollectionsKt.W(1, list);
            if (mxpVar19 != null) {
                float f16 = mxpVar19.w;
                if (mxpVar20 != null) {
                    float f17 = mxpVar20.w;
                    if (tdc.Y(f16, f17)) {
                        jphVar9 = null;
                    } else {
                        float f18 = f16 + f17;
                        jphVar9 = new jph(lsm0Var.a(R.string.received_stikes, Arrays.copyOf(new Object[0], 0)), new aqh(wzb.H0(Float.valueOf(f16)), f18 > 0 ? si30.b((f17 / f18) * 100.0f) : 0, f16 < f17), new aqh(wzb.H0(Float.valueOf(f17)), f18 > 0 ? si30.b((f16 / f18) * 100.0f) : 0, f17 < f16));
                    }
                } else {
                    jphVar9 = null;
                }
            } else {
                jphVar9 = null;
            }
            lc00VarB4.add(jphVar9);
            ArrayList arrayListS4 = CollectionsKt.S(kotlin.collections.a.a(lc00VarB4));
            pqhVar = new pqh(nqhVar2, arrayListS4.isEmpty() ? null : new vph(dyb.o0(arrayListS4), lsm0Var.a(R.string.per_one_minute, Arrays.copyOf(new Object[0], 0))), 4);
        } else {
            if (iOrdinal2 != 2) {
                t9f.b();
                return null;
            }
            lc00 lc00VarB5 = kotlin.collections.a.b();
            mxp mxpVar21 = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar22 = (mxp) CollectionsKt.W(1, list);
            if (mxpVar21 != null) {
                float f19 = mxpVar21.y;
                if (mxpVar22 != null) {
                    float f20 = mxpVar22.y;
                    if (tdc.Y(f19, f20)) {
                        jphVar10 = null;
                    } else {
                        jphVar10 = new jph(lsm0Var.a(R.string.takedown_accuracy, Arrays.copyOf(new Object[0], 0)), new aqh(wzb.E0(Float.valueOf(f19)), (int) f19, f19 > f20), new aqh(wzb.E0(Float.valueOf(f20)), (int) f20, f20 > f19));
                    }
                } else {
                    jphVar10 = null;
                }
            } else {
                jphVar10 = null;
            }
            lc00VarB5.add(jphVar10);
            mxp mxpVar23 = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar24 = (mxp) CollectionsKt.W(1, list);
            if (mxpVar23 != null) {
                float f21 = mxpVar23.A;
                if (mxpVar24 != null) {
                    float f22 = mxpVar24.A;
                    if (tdc.Y(f21, f22)) {
                        jphVar11 = null;
                    } else {
                        jphVar11 = new jph(lsm0Var.a(R.string.takedown_protection, Arrays.copyOf(new Object[0], 0)), new aqh(wzb.E0(Float.valueOf(f21)), (int) f21, f21 > f22), new aqh(wzb.E0(Float.valueOf(f22)), (int) f22, f22 > f21));
                    }
                } else {
                    jphVar11 = null;
                }
            } else {
                jphVar11 = null;
            }
            lc00VarB5.add(jphVar11);
            ArrayList arrayListS5 = CollectionsKt.S(kotlin.collections.a.a(lc00VarB5));
            nqh nqhVar3 = arrayListS5.isEmpty() ? null : new nqh(dyb.o0(arrayListS5));
            lc00 lc00VarB6 = kotlin.collections.a.b();
            mxp mxpVar25 = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar26 = (mxp) CollectionsKt.W(1, list);
            if (mxpVar25 != null) {
                float f23 = mxpVar25.z;
                if (mxpVar26 != null) {
                    float f24 = mxpVar26.z;
                    if (tdc.Y(f23, f24)) {
                        jphVar12 = null;
                    } else {
                        jphVar12 = new jph(lsm0Var.a(R.string.takedown_averaged, Arrays.copyOf(new Object[0], 0)), new aqh(wzb.H0(Float.valueOf(f23)), vfc.H(f23, f24), f23 > f24), new aqh(wzb.H0(Float.valueOf(f24)), vfc.H(f24, f23), f24 > f23));
                    }
                } else {
                    jphVar12 = null;
                }
            } else {
                jphVar12 = null;
            }
            lc00VarB6.add(jphVar12);
            mxp mxpVar27 = (mxp) CollectionsKt.W(0, list);
            mxp mxpVar28 = (mxp) CollectionsKt.W(1, list);
            if (mxpVar27 != null) {
                float f25 = mxpVar27.O;
                if (mxpVar28 != null) {
                    float f26 = mxpVar28.O;
                    if (tdc.Y(f25, f26)) {
                        jphVar13 = null;
                    } else {
                        jphVar13 = new jph(lsm0Var.a(R.string.free_defeat, Arrays.copyOf(new Object[0], 0)), new aqh(wzb.H0(Float.valueOf(f25)), vfc.H(f25, f26), f25 > f26), new aqh(wzb.H0(Float.valueOf(f26)), vfc.H(f26, f25), f26 > f25));
                    }
                } else {
                    jphVar13 = null;
                }
            } else {
                jphVar13 = null;
            }
            lc00VarB6.add(jphVar13);
            ArrayList arrayListS6 = CollectionsKt.S(kotlin.collections.a.a(lc00VarB6));
            pqhVar = new pqh(nqhVar3, arrayListS6.isEmpty() ? null : new vph(dyb.o0(arrayListS6), null), 4);
        }
        return new l6t0("GENERAL_STATISTIC", hjmVar, fylVar, pqhVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x0130  */
    /* JADX WARN: Code duplicated, block: B:105:0x0137  */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0145  */
    /* JADX WARN: Code duplicated, block: B:110:0x0148  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:117:0x015e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0162  */
    /* JADX WARN: Code duplicated, block: B:121:0x016c  */
    /* JADX WARN: Code duplicated, block: B:122:0x016f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:127:0x017f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0182  */
    /* JADX WARN: Code duplicated, block: B:130:0x0188  */
    /* JADX WARN: Code duplicated, block: B:132:0x0190  */
    /* JADX WARN: Code duplicated, block: B:133:0x0193  */
    /* JADX WARN: Code duplicated, block: B:136:0x019a  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:162:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:170:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:172:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:174:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:175:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:179:0x0205  */
    /* JADX WARN: Code duplicated, block: B:181:0x0209  */
    /* JADX WARN: Code duplicated, block: B:182:0x020b  */
    /* JADX WARN: Code duplicated, block: B:184:0x020f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0213  */
    /* JADX WARN: Code duplicated, block: B:187:0x0217  */
    /* JADX WARN: Code duplicated, block: B:188:0x021a  */
    /* JADX WARN: Code duplicated, block: B:190:0x021e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0221  */
    /* JADX WARN: Code duplicated, block: B:194:0x0227  */
    /* JADX WARN: Code duplicated, block: B:195:0x0229  */
    /* JADX WARN: Code duplicated, block: B:197:0x022d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0238  */
    /* JADX WARN: Code duplicated, block: B:201:0x024d  */
    /* JADX WARN: Code duplicated, block: B:202:0x0258  */
    /* JADX WARN: Code duplicated, block: B:205:0x026d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0278  */
    /* JADX WARN: Code duplicated, block: B:208:0x028b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x028d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0290  */
    /* JADX WARN: Code duplicated, block: B:211:0x0293  */
    /* JADX WARN: Code duplicated, block: B:213:0x0297  */
    /* JADX WARN: Code duplicated, block: B:219:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:255:0x0372  */
    /* JADX WARN: Code duplicated, block: B:258:0x038d  */
    /* JADX WARN: Code duplicated, block: B:261:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:262:0x03c1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    public static final void b(mm40 mm40Var, final long j, final float f, boolean z, o0x o0xVar, Integer num, o0x o0xVar2, Integer num2, o0x o0xVar3, Integer num3, Boolean bool, Boolean bool2, Boolean bool3, Function0 function0, fet fetVar, final int i, final int i2, final int i3) {
        mm40 mm40Var2;
        int i4;
        boolean z2;
        int i5;
        o0x o0xVar4;
        int i6;
        int i7;
        Integer num4;
        int i8;
        int i9;
        o0x o0xVar5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z3;
        fet fetVar2;
        final Integer num5;
        final Boolean bool4;
        final Boolean bool5;
        final mm40 mm40Var3;
        final boolean z4;
        final o0x o0xVar6;
        final Integer num6;
        final o0x o0xVar7;
        final o0x o0xVar8;
        final Integer num7;
        final Boolean bool6;
        final Function0 function1;
        yfe0 yfe0Var;
        Function2 function2;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        final o0x o0xVar9;
        pm80 pm80VarF;
        final mm40 mm40Var5;
        pm80 pm80VarF2;
        pm80 pm80VarF3;
        o0x o0xVar10;
        yfe0 yfe0VarU2;
        boolean zBooleanValue;
        mm40 mm40VarF;
        fetVar.g0(320183769);
        int i30 = i3 & 1;
        if (i30 != 0) {
            i4 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= fetVar.d(f) ? 256 : 128;
        }
        int i31 = i3 & 8;
        if (i31 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i4 |= fetVar.h(z2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    o0xVar4 = o0xVar;
                    if (fetVar.g(o0xVar4)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    num4 = num;
                } else {
                    num4 = num;
                    if ((i & 196608) == 0) {
                        if (fetVar.g(num4)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                    o0xVar5 = o0xVar2;
                } else {
                    o0xVar5 = o0xVar2;
                    if ((i & 1572864) == 0) {
                        if (fetVar.g(o0xVar5)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (fetVar.g(num2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 256;
                if (i13 != 0) {
                    if ((i & 100663296) == 0) {
                        if (fetVar.g(o0xVar3)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i4 |= i14;
                    }
                    i15 = i3 & 512;
                    if (i15 != 0) {
                        if ((i & 805306368) == 0) {
                            if (fetVar.g(num3)) {
                                i16 = 536870912;
                            } else {
                                i16 = 268435456;
                            }
                            i4 |= i16;
                        }
                        i17 = i3 & 1024;
                        if (i17 != 0) {
                            i18 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (fetVar.g(bool)) {
                                i19 = 4;
                            } else {
                                i19 = 2;
                            }
                            i18 = i2 | i19;
                        } else {
                            i18 = i2;
                        }
                        i20 = i3 & 2048;
                        if (i20 != 0) {
                            i18 |= 48;
                        } else if ((i2 & 48) != 0) {
                            if (fetVar.g(bool2)) {
                                i21 = 32;
                            } else {
                                i21 = 16;
                            }
                            i18 |= i21;
                        }
                        i22 = i18;
                        i23 = i3 & 4096;
                        if (i23 != 0) {
                            i25 = i22 | 384;
                        } else {
                            i24 = i22;
                            if ((i2 & 384) != 0) {
                                if (fetVar.g(bool3)) {
                                    i26 = 256;
                                } else {
                                    i26 = 128;
                                }
                                i24 |= i26;
                            }
                            i25 = i24;
                        }
                        i27 = i3 & 8192;
                        if (i27 != 0) {
                            i29 = i25 | 3072;
                        } else {
                            i28 = i25;
                            if ((i2 & 3072) == 0) {
                                i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                            } else {
                                i29 = i28;
                            }
                        }
                        if ((i4 & 306783379) == 306783378 || (i29 & 1171) != 1170) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (fetVar.U(i4 & 1, z3)) {
                            if (i30 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i31 != 0) {
                                z4 = false;
                            } else {
                                z4 = z2;
                            }
                            if (i5 != 0) {
                                o0xVar6 = null;
                            } else {
                                o0xVar6 = o0xVar4;
                            }
                            o0xVar8 = null;
                            num6 = i7 == 0 ? num4 : null;
                            if (i9 != 0) {
                                o0xVar5 = null;
                            }
                            if (i11 != 0) {
                                num5 = null;
                            } else {
                                num5 = num2;
                            }
                            if (i13 == 0) {
                                o0xVar8 = o0xVar3;
                            }
                            if (i15 != 0) {
                                num7 = null;
                            } else {
                                num7 = num3;
                            }
                            if (i17 != 0) {
                                bool4 = Boolean.TRUE;
                            } else {
                                bool4 = bool;
                            }
                            if (i20 != 0) {
                                bool5 = Boolean.TRUE;
                            } else {
                                bool5 = bool2;
                            }
                            if (i23 != 0) {
                                bool6 = Boolean.TRUE;
                            } else {
                                bool6 = bool3;
                            }
                            o0xVar9 = o0xVar5;
                            if (i27 != 0) {
                                function1 = null;
                            } else {
                                function1 = function0;
                            }
                            if (num6 == null) {
                                fetVar.e0(-527158334);
                                fetVar.r(false);
                                pm80VarF = null;
                            } else {
                                fetVar.e0(-527158333);
                                pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                                fetVar.r(false);
                            }
                            mm40Var5 = mm40Var4;
                            if (num5 == null) {
                                fetVar.e0(-527067070);
                                fetVar.r(false);
                                pm80VarF2 = null;
                            } else {
                                fetVar.e0(-527067069);
                                pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                                fetVar.r(false);
                            }
                            pm80 pm80Var = pm80VarF2;
                            if (num7 == null) {
                                fetVar.e0(-526973822);
                                fetVar.r(false);
                                pm80VarF3 = null;
                            } else {
                                fetVar.e0(-526973821);
                                pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                                fetVar.r(false);
                            }
                            if (o0xVar6 == null) {
                                o0xVar10 = o0xVar6;
                            } else if (o0xVar9 == null) {
                                o0xVar10 = o0xVar8;
                            } else {
                                o0xVar10 = o0xVar9;
                            }
                            if (o0xVar10 != null || o0xVar10.c()) {
                                yfe0VarU2 = fetVar.u();
                                if (yfe0VarU2 == null) {
                                    return;
                                }
                                final byte b = 0;
                                function2 = new Function2() { // from class: a.cbc
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (b) {
                                            case 0:
                                                ((Integer) obj2).getClass();
                                                int iL = x8x.L(i | 1);
                                                int iL2 = x8x.L(i2);
                                                ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                                break;
                                            default:
                                                ((Integer) obj2).getClass();
                                                int iL3 = x8x.L(i | 1);
                                                int iL4 = x8x.L(i2);
                                                ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                yfe0Var = yfe0VarU2;
                            } else {
                                if (o0xVar6 != null) {
                                    if (bool4 != null) {
                                        zBooleanValue = bool4.booleanValue();
                                    } else {
                                        zBooleanValue = true;
                                    }
                                } else if (o0xVar9 != null) {
                                    if (bool5 != null) {
                                        zBooleanValue = bool5.booleanValue();
                                    } else {
                                        zBooleanValue = true;
                                    }
                                } else if (o0xVar8 == null || bool6 == null) {
                                    zBooleanValue = true;
                                } else {
                                    zBooleanValue = bool6.booleanValue();
                                }
                                if (o0xVar6 != null && pm80VarF != null) {
                                    pm80VarF3 = pm80VarF;
                                } else if (o0xVar9 != null && pm80Var != null) {
                                    pm80VarF3 = pm80Var;
                                } else if (o0xVar8 == null || pm80VarF3 == null) {
                                    pm80VarF3 = null;
                                }
                                if (function1 != null) {
                                    fetVar.e0(-526249134);
                                    boolean z5 = ((i4 & 7168) == 2048) | ((i29 & 7168) == 2048);
                                    Object objP = fetVar.P();
                                    if (z5 || objP == ukd.f35823a) {
                                        objP = new jw7(z4, function1, (byte) 2);
                                        fetVar.o0(objP);
                                    }
                                    mm40VarF = phu0.F(mm40Var5, null, null, false, null, (Function0) objP, fetVar, i4 & 14, 15);
                                    mm40Var3 = mm40Var5;
                                    fetVar2 = fetVar;
                                    fetVar2.r(false);
                                } else {
                                    fetVar2 = fetVar;
                                    mm40Var3 = mm40Var5;
                                    fetVar2.e0(-526158831);
                                    fetVar2.r(false);
                                    mm40VarF = mm40Var3;
                                }
                                zfn zfnVar = rlx.c;
                                zcl zclVar = qmk.f28987a;
                                final mm40 mm40Var6 = mm40VarF;
                                final pm80 pm80Var2 = pm80VarF3;
                                final o0x o0xVar11 = o0xVar10;
                                final boolean z6 = zBooleanValue;
                                obc.d(zfnVar.a(new ycl(32.0f)), u1c.M(-1203396327, new Function2() { // from class: a.dbc
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        fet fetVar3 = (fet) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            boolean z7 = z6;
                                            long j2 = j;
                                            long j3 = z7 ? j2 : y3d.g;
                                            y3d y3dVar = new y3d(j2);
                                            if (!z7 || h2t0.a(j2, y3d.g)) {
                                                y3dVar = null;
                                            }
                                            m78 m78Var = y3dVar != null ? new m78(y3dVar.f41946a, 5) : null;
                                            zcl zclVar2 = qmk.f28987a;
                                            mm40 mm40VarN = o7k0.n(mm40Var6, 20.0f);
                                            ykw ykwVar = rlx.f30719a;
                                            mm40 mm40VarJ = lgb.J(mm40VarN.e(tg40.b), vgg0.a(f));
                                            o0x o0xVar12 = o0xVar11;
                                            if (o0xVar12 instanceof m0x) {
                                                fetVar3.e0(-287484635);
                                                dww.c(a8k0.F(((m0x) o0xVar12).f20977a, 0, fetVar3), null, mm40VarJ, j3, fetVar3, 56, 0);
                                                fetVar3.r(false);
                                            } else {
                                                long j4 = j3;
                                                if (o0xVar12 instanceof n0x) {
                                                    fetVar3.e0(-287252569);
                                                    String str = ((n0x) o0xVar12).f22722a;
                                                    pge pgeVar = gqw0.A;
                                                    pm80 pm80Var3 = pm80Var2;
                                                    k7x.b(str, null, mm40VarJ, pm80Var3, pm80Var3, null, null, null, null, null, pgeVar, m78Var, fetVar3, 36912, 24582, 11232);
                                                    fetVar3.r(false);
                                                } else {
                                                    if (!(o0xVar12 instanceof l0x)) {
                                                        throw b1j.f(-1117653114, fetVar3, false);
                                                    }
                                                    fetVar3.e0(-286847306);
                                                    Drawable drawable = ((l0x) o0xVar12).f19222a;
                                                    if (drawable == null) {
                                                        fetVar3.e0(-286847307);
                                                        fetVar3.r(false);
                                                    } else {
                                                        fetVar3.e0(-286847306);
                                                        dww.c(u7x.v(drawable), null, mm40VarJ, j4, fetVar3, 56, 0);
                                                        fetVar3.r(false);
                                                    }
                                                    fetVar3.r(false);
                                                }
                                            }
                                        } else {
                                            fetVar3.X();
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar2), fetVar2, 56);
                                o0xVar7 = o0xVar9;
                            }
                            yfe0Var.d = function2;
                        }
                        fetVar2 = fetVar;
                        fetVar2.X();
                        num5 = num2;
                        bool4 = bool;
                        bool5 = bool2;
                        mm40Var3 = mm40Var2;
                        z4 = z2;
                        o0xVar6 = o0xVar4;
                        num6 = num4;
                        o0xVar7 = o0xVar5;
                        o0xVar8 = o0xVar3;
                        num7 = num3;
                        bool6 = bool3;
                        function1 = function0;
                        yfe0VarU = fetVar2.u();
                        if (yfe0VarU != null) {
                            final byte b2 = 1;
                            function2 = new Function2() { // from class: a.cbc
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (b2) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iL = x8x.L(i | 1);
                                            int iL2 = x8x.L(i2);
                                            ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iL3 = x8x.L(i | 1);
                                            int iL4 = x8x.L(i2);
                                            ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            yfe0Var = yfe0VarU;
                            yfe0Var.d = function2;
                        }
                    }
                    i4 |= 805306368;
                    i17 = i3 & 1024;
                    if (i17 != 0) {
                        i18 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (fetVar.g(bool)) {
                            i19 = 4;
                        } else {
                            i19 = 2;
                        }
                        i18 = i2 | i19;
                    } else {
                        i18 = i2;
                    }
                    i20 = i3 & 2048;
                    if (i20 != 0) {
                        i18 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (fetVar.g(bool2)) {
                            i21 = 32;
                        } else {
                            i21 = 16;
                        }
                        i18 |= i21;
                    }
                    i22 = i18;
                    i23 = i3 & 4096;
                    if (i23 != 0) {
                        i25 = i22 | 384;
                    } else {
                        i24 = i22;
                        if ((i2 & 384) != 0) {
                            if (fetVar.g(bool3)) {
                                i26 = 256;
                            } else {
                                i26 = 128;
                            }
                            i24 |= i26;
                        }
                        i25 = i24;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (fetVar.U(i4 & 1, z3)) {
                        if (i30 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i31 != 0) {
                            z4 = false;
                        } else {
                            z4 = z2;
                        }
                        if (i5 != 0) {
                            o0xVar6 = null;
                        } else {
                            o0xVar6 = o0xVar4;
                        }
                        o0xVar8 = null;
                        if (i7 == 0) {
                        }
                        if (i9 != 0) {
                            o0xVar5 = null;
                        }
                        if (i11 != 0) {
                            num5 = null;
                        } else {
                            num5 = num2;
                        }
                        if (i13 == 0) {
                            o0xVar8 = o0xVar3;
                        }
                        if (i15 != 0) {
                            num7 = null;
                        } else {
                            num7 = num3;
                        }
                        if (i17 != 0) {
                            bool4 = Boolean.TRUE;
                        } else {
                            bool4 = bool;
                        }
                        if (i20 != 0) {
                            bool5 = Boolean.TRUE;
                        } else {
                            bool5 = bool2;
                        }
                        if (i23 != 0) {
                            bool6 = Boolean.TRUE;
                        } else {
                            bool6 = bool3;
                        }
                        o0xVar9 = o0xVar5;
                        if (i27 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (num6 == null) {
                            fetVar.e0(-527158334);
                            fetVar.r(false);
                            pm80VarF = null;
                        } else {
                            fetVar.e0(-527158333);
                            pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                            fetVar.r(false);
                        }
                        mm40Var5 = mm40Var4;
                        if (num5 == null) {
                            fetVar.e0(-527067070);
                            fetVar.r(false);
                            pm80VarF2 = null;
                        } else {
                            fetVar.e0(-527067069);
                            pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                            fetVar.r(false);
                        }
                        pm80 pm80Var3 = pm80VarF2;
                        if (num7 == null) {
                            fetVar.e0(-526973822);
                            fetVar.r(false);
                            pm80VarF3 = null;
                        } else {
                            fetVar.e0(-526973821);
                            pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                            fetVar.r(false);
                        }
                        if (o0xVar6 == null) {
                            o0xVar10 = o0xVar6;
                        } else if (o0xVar9 == null) {
                            o0xVar10 = o0xVar8;
                        } else {
                            o0xVar10 = o0xVar9;
                        }
                        if (o0xVar10 != null) {
                        }
                        yfe0VarU2 = fetVar.u();
                        if (yfe0VarU2 == null) {
                            final byte b3 = 0;
                            function2 = new Function2() { // from class: a.cbc
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (b3) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iL = x8x.L(i | 1);
                                            int iL2 = x8x.L(i2);
                                            ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iL3 = x8x.L(i | 1);
                                            int iL4 = x8x.L(i2);
                                            ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            yfe0Var = yfe0VarU2;
                            yfe0Var.d = function2;
                        }
                        return;
                    }
                    fetVar2 = fetVar;
                    fetVar2.X();
                    num5 = num2;
                    bool4 = bool;
                    bool5 = bool2;
                    mm40Var3 = mm40Var2;
                    z4 = z2;
                    o0xVar6 = o0xVar4;
                    num6 = num4;
                    o0xVar7 = o0xVar5;
                    o0xVar8 = o0xVar3;
                    num7 = num3;
                    bool6 = bool3;
                    function1 = function0;
                    yfe0VarU = fetVar2.u();
                    if (yfe0VarU != null) {
                        final byte b4 = 1;
                        function2 = new Function2() { // from class: a.cbc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b4) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iL = x8x.L(i | 1);
                                        int iL2 = x8x.L(i2);
                                        ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iL3 = x8x.L(i | 1);
                                        int iL4 = x8x.L(i2);
                                        ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        yfe0Var = yfe0VarU;
                        yfe0Var.d = function2;
                    }
                }
                i4 |= 100663296;
                i15 = i3 & 512;
                if (i15 != 0) {
                    if ((i & 805306368) == 0) {
                        if (fetVar.g(num3)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i4 |= i16;
                    }
                    i17 = i3 & 1024;
                    if (i17 != 0) {
                        i18 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (fetVar.g(bool)) {
                            i19 = 4;
                        } else {
                            i19 = 2;
                        }
                        i18 = i2 | i19;
                    } else {
                        i18 = i2;
                    }
                    i20 = i3 & 2048;
                    if (i20 != 0) {
                        i18 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (fetVar.g(bool2)) {
                            i21 = 32;
                        } else {
                            i21 = 16;
                        }
                        i18 |= i21;
                    }
                    i22 = i18;
                    i23 = i3 & 4096;
                    if (i23 != 0) {
                        i25 = i22 | 384;
                    } else {
                        i24 = i22;
                        if ((i2 & 384) != 0) {
                            if (fetVar.g(bool3)) {
                                i26 = 256;
                            } else {
                                i26 = 128;
                            }
                            i24 |= i26;
                        }
                        i25 = i24;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (fetVar.U(i4 & 1, z3)) {
                        if (i30 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i31 != 0) {
                            z4 = false;
                        } else {
                            z4 = z2;
                        }
                        if (i5 != 0) {
                            o0xVar6 = null;
                        } else {
                            o0xVar6 = o0xVar4;
                        }
                        o0xVar8 = null;
                        if (i7 == 0) {
                        }
                        if (i9 != 0) {
                            o0xVar5 = null;
                        }
                        if (i11 != 0) {
                            num5 = null;
                        } else {
                            num5 = num2;
                        }
                        if (i13 == 0) {
                            o0xVar8 = o0xVar3;
                        }
                        if (i15 != 0) {
                            num7 = null;
                        } else {
                            num7 = num3;
                        }
                        if (i17 != 0) {
                            bool4 = Boolean.TRUE;
                        } else {
                            bool4 = bool;
                        }
                        if (i20 != 0) {
                            bool5 = Boolean.TRUE;
                        } else {
                            bool5 = bool2;
                        }
                        if (i23 != 0) {
                            bool6 = Boolean.TRUE;
                        } else {
                            bool6 = bool3;
                        }
                        o0xVar9 = o0xVar5;
                        if (i27 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (num6 == null) {
                            fetVar.e0(-527158334);
                            fetVar.r(false);
                            pm80VarF = null;
                        } else {
                            fetVar.e0(-527158333);
                            pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                            fetVar.r(false);
                        }
                        mm40Var5 = mm40Var4;
                        if (num5 == null) {
                            fetVar.e0(-527067070);
                            fetVar.r(false);
                            pm80VarF2 = null;
                        } else {
                            fetVar.e0(-527067069);
                            pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                            fetVar.r(false);
                        }
                        pm80 pm80Var4 = pm80VarF2;
                        if (num7 == null) {
                            fetVar.e0(-526973822);
                            fetVar.r(false);
                            pm80VarF3 = null;
                        } else {
                            fetVar.e0(-526973821);
                            pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                            fetVar.r(false);
                        }
                        if (o0xVar6 == null) {
                            o0xVar10 = o0xVar6;
                        } else if (o0xVar9 == null) {
                            o0xVar10 = o0xVar8;
                        } else {
                            o0xVar10 = o0xVar9;
                        }
                        if (o0xVar10 != null) {
                        }
                        yfe0VarU2 = fetVar.u();
                        if (yfe0VarU2 == null) {
                            final byte b5 = 0;
                            function2 = new Function2() { // from class: a.cbc
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (b5) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iL = x8x.L(i | 1);
                                            int iL2 = x8x.L(i2);
                                            ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iL3 = x8x.L(i | 1);
                                            int iL4 = x8x.L(i2);
                                            ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            yfe0Var = yfe0VarU2;
                            yfe0Var.d = function2;
                        }
                        return;
                    }
                    fetVar2 = fetVar;
                    fetVar2.X();
                    num5 = num2;
                    bool4 = bool;
                    bool5 = bool2;
                    mm40Var3 = mm40Var2;
                    z4 = z2;
                    o0xVar6 = o0xVar4;
                    num6 = num4;
                    o0xVar7 = o0xVar5;
                    o0xVar8 = o0xVar3;
                    num7 = num3;
                    bool6 = bool3;
                    function1 = function0;
                    yfe0VarU = fetVar2.u();
                    if (yfe0VarU != null) {
                        final byte b6 = 1;
                        function2 = new Function2() { // from class: a.cbc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b6) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iL = x8x.L(i | 1);
                                        int iL2 = x8x.L(i2);
                                        ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iL3 = x8x.L(i | 1);
                                        int iL4 = x8x.L(i2);
                                        ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        yfe0Var = yfe0VarU;
                        yfe0Var.d = function2;
                    }
                }
                i4 |= 805306368;
                i17 = i3 & 1024;
                if (i17 != 0) {
                    i18 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (fetVar.g(bool)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i2 | i19;
                } else {
                    i18 = i2;
                }
                i20 = i3 & 2048;
                if (i20 != 0) {
                    i18 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (fetVar.g(bool2)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                i23 = i3 & 4096;
                if (i23 != 0) {
                    i25 = i22 | 384;
                } else {
                    i24 = i22;
                    if ((i2 & 384) != 0) {
                        if (fetVar.g(bool3)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i24 |= i26;
                    }
                    i25 = i24;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (fetVar.U(i4 & 1, z3)) {
                    if (i30 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i31 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i5 != 0) {
                        o0xVar6 = null;
                    } else {
                        o0xVar6 = o0xVar4;
                    }
                    o0xVar8 = null;
                    if (i7 == 0) {
                    }
                    if (i9 != 0) {
                        o0xVar5 = null;
                    }
                    if (i11 != 0) {
                        num5 = null;
                    } else {
                        num5 = num2;
                    }
                    if (i13 == 0) {
                        o0xVar8 = o0xVar3;
                    }
                    if (i15 != 0) {
                        num7 = null;
                    } else {
                        num7 = num3;
                    }
                    if (i17 != 0) {
                        bool4 = Boolean.TRUE;
                    } else {
                        bool4 = bool;
                    }
                    if (i20 != 0) {
                        bool5 = Boolean.TRUE;
                    } else {
                        bool5 = bool2;
                    }
                    if (i23 != 0) {
                        bool6 = Boolean.TRUE;
                    } else {
                        bool6 = bool3;
                    }
                    o0xVar9 = o0xVar5;
                    if (i27 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (num6 == null) {
                        fetVar.e0(-527158334);
                        fetVar.r(false);
                        pm80VarF = null;
                    } else {
                        fetVar.e0(-527158333);
                        pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    mm40Var5 = mm40Var4;
                    if (num5 == null) {
                        fetVar.e0(-527067070);
                        fetVar.r(false);
                        pm80VarF2 = null;
                    } else {
                        fetVar.e0(-527067069);
                        pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    pm80 pm80Var5 = pm80VarF2;
                    if (num7 == null) {
                        fetVar.e0(-526973822);
                        fetVar.r(false);
                        pm80VarF3 = null;
                    } else {
                        fetVar.e0(-526973821);
                        pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    if (o0xVar6 == null) {
                        o0xVar10 = o0xVar6;
                    } else if (o0xVar9 == null) {
                        o0xVar10 = o0xVar8;
                    } else {
                        o0xVar10 = o0xVar9;
                    }
                    if (o0xVar10 != null) {
                    }
                    yfe0VarU2 = fetVar.u();
                    if (yfe0VarU2 == null) {
                        final byte b7 = 0;
                        function2 = new Function2() { // from class: a.cbc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b7) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iL = x8x.L(i | 1);
                                        int iL2 = x8x.L(i2);
                                        ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iL3 = x8x.L(i | 1);
                                        int iL4 = x8x.L(i2);
                                        ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        yfe0Var = yfe0VarU2;
                        yfe0Var.d = function2;
                    }
                    return;
                }
                fetVar2 = fetVar;
                fetVar2.X();
                num5 = num2;
                bool4 = bool;
                bool5 = bool2;
                mm40Var3 = mm40Var2;
                z4 = z2;
                o0xVar6 = o0xVar4;
                num6 = num4;
                o0xVar7 = o0xVar5;
                o0xVar8 = o0xVar3;
                num7 = num3;
                bool6 = bool3;
                function1 = function0;
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    final byte b8 = 1;
                    function2 = new Function2() { // from class: a.cbc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iL = x8x.L(i | 1);
                                    int iL2 = x8x.L(i2);
                                    ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iL3 = x8x.L(i | 1);
                                    int iL4 = x8x.L(i2);
                                    ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    yfe0Var = yfe0VarU;
                    yfe0Var.d = function2;
                }
            }
            i4 |= 24576;
            o0xVar4 = o0xVar;
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                num4 = num;
            } else {
                num4 = num;
                if ((i & 196608) == 0) {
                    if (fetVar.g(num4)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                o0xVar5 = o0xVar2;
            } else {
                o0xVar5 = o0xVar2;
                if ((i & 1572864) == 0) {
                    if (fetVar.g(o0xVar5)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar.g(num2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            i13 = i3 & 256;
            if (i13 != 0) {
                if ((i & 100663296) == 0) {
                    if (fetVar.g(o0xVar3)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i4 |= i14;
                }
                i15 = i3 & 512;
                if (i15 != 0) {
                    if ((i & 805306368) == 0) {
                        if (fetVar.g(num3)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i4 |= i16;
                    }
                    i17 = i3 & 1024;
                    if (i17 != 0) {
                        i18 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (fetVar.g(bool)) {
                            i19 = 4;
                        } else {
                            i19 = 2;
                        }
                        i18 = i2 | i19;
                    } else {
                        i18 = i2;
                    }
                    i20 = i3 & 2048;
                    if (i20 != 0) {
                        i18 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (fetVar.g(bool2)) {
                            i21 = 32;
                        } else {
                            i21 = 16;
                        }
                        i18 |= i21;
                    }
                    i22 = i18;
                    i23 = i3 & 4096;
                    if (i23 != 0) {
                        i25 = i22 | 384;
                    } else {
                        i24 = i22;
                        if ((i2 & 384) != 0) {
                            if (fetVar.g(bool3)) {
                                i26 = 256;
                            } else {
                                i26 = 128;
                            }
                            i24 |= i26;
                        }
                        i25 = i24;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (fetVar.U(i4 & 1, z3)) {
                        if (i30 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i31 != 0) {
                            z4 = false;
                        } else {
                            z4 = z2;
                        }
                        if (i5 != 0) {
                            o0xVar6 = null;
                        } else {
                            o0xVar6 = o0xVar4;
                        }
                        o0xVar8 = null;
                        if (i7 == 0) {
                        }
                        if (i9 != 0) {
                            o0xVar5 = null;
                        }
                        if (i11 != 0) {
                            num5 = null;
                        } else {
                            num5 = num2;
                        }
                        if (i13 == 0) {
                            o0xVar8 = o0xVar3;
                        }
                        if (i15 != 0) {
                            num7 = null;
                        } else {
                            num7 = num3;
                        }
                        if (i17 != 0) {
                            bool4 = Boolean.TRUE;
                        } else {
                            bool4 = bool;
                        }
                        if (i20 != 0) {
                            bool5 = Boolean.TRUE;
                        } else {
                            bool5 = bool2;
                        }
                        if (i23 != 0) {
                            bool6 = Boolean.TRUE;
                        } else {
                            bool6 = bool3;
                        }
                        o0xVar9 = o0xVar5;
                        if (i27 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (num6 == null) {
                            fetVar.e0(-527158334);
                            fetVar.r(false);
                            pm80VarF = null;
                        } else {
                            fetVar.e0(-527158333);
                            pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                            fetVar.r(false);
                        }
                        mm40Var5 = mm40Var4;
                        if (num5 == null) {
                            fetVar.e0(-527067070);
                            fetVar.r(false);
                            pm80VarF2 = null;
                        } else {
                            fetVar.e0(-527067069);
                            pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                            fetVar.r(false);
                        }
                        pm80 pm80Var6 = pm80VarF2;
                        if (num7 == null) {
                            fetVar.e0(-526973822);
                            fetVar.r(false);
                            pm80VarF3 = null;
                        } else {
                            fetVar.e0(-526973821);
                            pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                            fetVar.r(false);
                        }
                        if (o0xVar6 == null) {
                            o0xVar10 = o0xVar6;
                        } else if (o0xVar9 == null) {
                            o0xVar10 = o0xVar8;
                        } else {
                            o0xVar10 = o0xVar9;
                        }
                        if (o0xVar10 != null) {
                        }
                        yfe0VarU2 = fetVar.u();
                        if (yfe0VarU2 == null) {
                            final byte b9 = 0;
                            function2 = new Function2() { // from class: a.cbc
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (b9) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iL = x8x.L(i | 1);
                                            int iL2 = x8x.L(i2);
                                            ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iL3 = x8x.L(i | 1);
                                            int iL4 = x8x.L(i2);
                                            ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            yfe0Var = yfe0VarU2;
                            yfe0Var.d = function2;
                        }
                        return;
                    }
                    fetVar2 = fetVar;
                    fetVar2.X();
                    num5 = num2;
                    bool4 = bool;
                    bool5 = bool2;
                    mm40Var3 = mm40Var2;
                    z4 = z2;
                    o0xVar6 = o0xVar4;
                    num6 = num4;
                    o0xVar7 = o0xVar5;
                    o0xVar8 = o0xVar3;
                    num7 = num3;
                    bool6 = bool3;
                    function1 = function0;
                    yfe0VarU = fetVar2.u();
                    if (yfe0VarU != null) {
                        final byte b10 = 1;
                        function2 = new Function2() { // from class: a.cbc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b10) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iL = x8x.L(i | 1);
                                        int iL2 = x8x.L(i2);
                                        ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iL3 = x8x.L(i | 1);
                                        int iL4 = x8x.L(i2);
                                        ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        yfe0Var = yfe0VarU;
                        yfe0Var.d = function2;
                    }
                }
                i4 |= 805306368;
                i17 = i3 & 1024;
                if (i17 != 0) {
                    i18 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (fetVar.g(bool)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i2 | i19;
                } else {
                    i18 = i2;
                }
                i20 = i3 & 2048;
                if (i20 != 0) {
                    i18 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (fetVar.g(bool2)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                i23 = i3 & 4096;
                if (i23 != 0) {
                    i25 = i22 | 384;
                } else {
                    i24 = i22;
                    if ((i2 & 384) != 0) {
                        if (fetVar.g(bool3)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i24 |= i26;
                    }
                    i25 = i24;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (fetVar.U(i4 & 1, z3)) {
                    if (i30 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i31 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i5 != 0) {
                        o0xVar6 = null;
                    } else {
                        o0xVar6 = o0xVar4;
                    }
                    o0xVar8 = null;
                    if (i7 == 0) {
                    }
                    if (i9 != 0) {
                        o0xVar5 = null;
                    }
                    if (i11 != 0) {
                        num5 = null;
                    } else {
                        num5 = num2;
                    }
                    if (i13 == 0) {
                        o0xVar8 = o0xVar3;
                    }
                    if (i15 != 0) {
                        num7 = null;
                    } else {
                        num7 = num3;
                    }
                    if (i17 != 0) {
                        bool4 = Boolean.TRUE;
                    } else {
                        bool4 = bool;
                    }
                    if (i20 != 0) {
                        bool5 = Boolean.TRUE;
                    } else {
                        bool5 = bool2;
                    }
                    if (i23 != 0) {
                        bool6 = Boolean.TRUE;
                    } else {
                        bool6 = bool3;
                    }
                    o0xVar9 = o0xVar5;
                    if (i27 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (num6 == null) {
                        fetVar.e0(-527158334);
                        fetVar.r(false);
                        pm80VarF = null;
                    } else {
                        fetVar.e0(-527158333);
                        pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    mm40Var5 = mm40Var4;
                    if (num5 == null) {
                        fetVar.e0(-527067070);
                        fetVar.r(false);
                        pm80VarF2 = null;
                    } else {
                        fetVar.e0(-527067069);
                        pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    pm80 pm80Var7 = pm80VarF2;
                    if (num7 == null) {
                        fetVar.e0(-526973822);
                        fetVar.r(false);
                        pm80VarF3 = null;
                    } else {
                        fetVar.e0(-526973821);
                        pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    if (o0xVar6 == null) {
                        o0xVar10 = o0xVar6;
                    } else if (o0xVar9 == null) {
                        o0xVar10 = o0xVar8;
                    } else {
                        o0xVar10 = o0xVar9;
                    }
                    if (o0xVar10 != null) {
                    }
                    yfe0VarU2 = fetVar.u();
                    if (yfe0VarU2 == null) {
                        final byte b11 = 0;
                        function2 = new Function2() { // from class: a.cbc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b11) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iL = x8x.L(i | 1);
                                        int iL2 = x8x.L(i2);
                                        ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iL3 = x8x.L(i | 1);
                                        int iL4 = x8x.L(i2);
                                        ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        yfe0Var = yfe0VarU2;
                        yfe0Var.d = function2;
                    }
                    return;
                }
                fetVar2 = fetVar;
                fetVar2.X();
                num5 = num2;
                bool4 = bool;
                bool5 = bool2;
                mm40Var3 = mm40Var2;
                z4 = z2;
                o0xVar6 = o0xVar4;
                num6 = num4;
                o0xVar7 = o0xVar5;
                o0xVar8 = o0xVar3;
                num7 = num3;
                bool6 = bool3;
                function1 = function0;
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    final byte b12 = 1;
                    function2 = new Function2() { // from class: a.cbc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b12) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iL = x8x.L(i | 1);
                                    int iL2 = x8x.L(i2);
                                    ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iL3 = x8x.L(i | 1);
                                    int iL4 = x8x.L(i2);
                                    ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    yfe0Var = yfe0VarU;
                    yfe0Var.d = function2;
                }
            }
            i4 |= 100663296;
            i15 = i3 & 512;
            if (i15 != 0) {
                if ((i & 805306368) == 0) {
                    if (fetVar.g(num3)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i4 |= i16;
                }
                i17 = i3 & 1024;
                if (i17 != 0) {
                    i18 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (fetVar.g(bool)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i2 | i19;
                } else {
                    i18 = i2;
                }
                i20 = i3 & 2048;
                if (i20 != 0) {
                    i18 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (fetVar.g(bool2)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                i23 = i3 & 4096;
                if (i23 != 0) {
                    i25 = i22 | 384;
                } else {
                    i24 = i22;
                    if ((i2 & 384) != 0) {
                        if (fetVar.g(bool3)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i24 |= i26;
                    }
                    i25 = i24;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (fetVar.U(i4 & 1, z3)) {
                    if (i30 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i31 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i5 != 0) {
                        o0xVar6 = null;
                    } else {
                        o0xVar6 = o0xVar4;
                    }
                    o0xVar8 = null;
                    if (i7 == 0) {
                    }
                    if (i9 != 0) {
                        o0xVar5 = null;
                    }
                    if (i11 != 0) {
                        num5 = null;
                    } else {
                        num5 = num2;
                    }
                    if (i13 == 0) {
                        o0xVar8 = o0xVar3;
                    }
                    if (i15 != 0) {
                        num7 = null;
                    } else {
                        num7 = num3;
                    }
                    if (i17 != 0) {
                        bool4 = Boolean.TRUE;
                    } else {
                        bool4 = bool;
                    }
                    if (i20 != 0) {
                        bool5 = Boolean.TRUE;
                    } else {
                        bool5 = bool2;
                    }
                    if (i23 != 0) {
                        bool6 = Boolean.TRUE;
                    } else {
                        bool6 = bool3;
                    }
                    o0xVar9 = o0xVar5;
                    if (i27 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (num6 == null) {
                        fetVar.e0(-527158334);
                        fetVar.r(false);
                        pm80VarF = null;
                    } else {
                        fetVar.e0(-527158333);
                        pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    mm40Var5 = mm40Var4;
                    if (num5 == null) {
                        fetVar.e0(-527067070);
                        fetVar.r(false);
                        pm80VarF2 = null;
                    } else {
                        fetVar.e0(-527067069);
                        pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    pm80 pm80Var8 = pm80VarF2;
                    if (num7 == null) {
                        fetVar.e0(-526973822);
                        fetVar.r(false);
                        pm80VarF3 = null;
                    } else {
                        fetVar.e0(-526973821);
                        pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    if (o0xVar6 == null) {
                        o0xVar10 = o0xVar6;
                    } else if (o0xVar9 == null) {
                        o0xVar10 = o0xVar8;
                    } else {
                        o0xVar10 = o0xVar9;
                    }
                    if (o0xVar10 != null) {
                    }
                    yfe0VarU2 = fetVar.u();
                    if (yfe0VarU2 == null) {
                        final byte b13 = 0;
                        function2 = new Function2() { // from class: a.cbc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b13) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iL = x8x.L(i | 1);
                                        int iL2 = x8x.L(i2);
                                        ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iL3 = x8x.L(i | 1);
                                        int iL4 = x8x.L(i2);
                                        ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        yfe0Var = yfe0VarU2;
                        yfe0Var.d = function2;
                    }
                    return;
                }
                fetVar2 = fetVar;
                fetVar2.X();
                num5 = num2;
                bool4 = bool;
                bool5 = bool2;
                mm40Var3 = mm40Var2;
                z4 = z2;
                o0xVar6 = o0xVar4;
                num6 = num4;
                o0xVar7 = o0xVar5;
                o0xVar8 = o0xVar3;
                num7 = num3;
                bool6 = bool3;
                function1 = function0;
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    final byte b14 = 1;
                    function2 = new Function2() { // from class: a.cbc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b14) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iL = x8x.L(i | 1);
                                    int iL2 = x8x.L(i2);
                                    ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iL3 = x8x.L(i | 1);
                                    int iL4 = x8x.L(i2);
                                    ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    yfe0Var = yfe0VarU;
                    yfe0Var.d = function2;
                }
            }
            i4 |= 805306368;
            i17 = i3 & 1024;
            if (i17 != 0) {
                i18 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (fetVar.g(bool)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i2 | i19;
            } else {
                i18 = i2;
            }
            i20 = i3 & 2048;
            if (i20 != 0) {
                i18 |= 48;
            } else if ((i2 & 48) != 0) {
                if (fetVar.g(bool2)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i18 |= i21;
            }
            i22 = i18;
            i23 = i3 & 4096;
            if (i23 != 0) {
                i25 = i22 | 384;
            } else {
                i24 = i22;
                if ((i2 & 384) != 0) {
                    if (fetVar.g(bool3)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i24 |= i26;
                }
                i25 = i24;
            }
            i27 = i3 & 8192;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                } else {
                    i29 = i28;
                }
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar.U(i4 & 1, z3)) {
                if (i30 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i31 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i5 != 0) {
                    o0xVar6 = null;
                } else {
                    o0xVar6 = o0xVar4;
                }
                o0xVar8 = null;
                if (i7 == 0) {
                }
                if (i9 != 0) {
                    o0xVar5 = null;
                }
                if (i11 != 0) {
                    num5 = null;
                } else {
                    num5 = num2;
                }
                if (i13 == 0) {
                    o0xVar8 = o0xVar3;
                }
                if (i15 != 0) {
                    num7 = null;
                } else {
                    num7 = num3;
                }
                if (i17 != 0) {
                    bool4 = Boolean.TRUE;
                } else {
                    bool4 = bool;
                }
                if (i20 != 0) {
                    bool5 = Boolean.TRUE;
                } else {
                    bool5 = bool2;
                }
                if (i23 != 0) {
                    bool6 = Boolean.TRUE;
                } else {
                    bool6 = bool3;
                }
                o0xVar9 = o0xVar5;
                if (i27 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if (num6 == null) {
                    fetVar.e0(-527158334);
                    fetVar.r(false);
                    pm80VarF = null;
                } else {
                    fetVar.e0(-527158333);
                    pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                    fetVar.r(false);
                }
                mm40Var5 = mm40Var4;
                if (num5 == null) {
                    fetVar.e0(-527067070);
                    fetVar.r(false);
                    pm80VarF2 = null;
                } else {
                    fetVar.e0(-527067069);
                    pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                    fetVar.r(false);
                }
                pm80 pm80Var9 = pm80VarF2;
                if (num7 == null) {
                    fetVar.e0(-526973822);
                    fetVar.r(false);
                    pm80VarF3 = null;
                } else {
                    fetVar.e0(-526973821);
                    pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                    fetVar.r(false);
                }
                if (o0xVar6 == null) {
                    o0xVar10 = o0xVar6;
                } else if (o0xVar9 == null) {
                    o0xVar10 = o0xVar8;
                } else {
                    o0xVar10 = o0xVar9;
                }
                if (o0xVar10 != null) {
                }
                yfe0VarU2 = fetVar.u();
                if (yfe0VarU2 == null) {
                    final byte b15 = 0;
                    function2 = new Function2() { // from class: a.cbc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b15) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iL = x8x.L(i | 1);
                                    int iL2 = x8x.L(i2);
                                    ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iL3 = x8x.L(i | 1);
                                    int iL4 = x8x.L(i2);
                                    ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    yfe0Var = yfe0VarU2;
                    yfe0Var.d = function2;
                }
                return;
            }
            fetVar2 = fetVar;
            fetVar2.X();
            num5 = num2;
            bool4 = bool;
            bool5 = bool2;
            mm40Var3 = mm40Var2;
            z4 = z2;
            o0xVar6 = o0xVar4;
            num6 = num4;
            o0xVar7 = o0xVar5;
            o0xVar8 = o0xVar3;
            num7 = num3;
            bool6 = bool3;
            function1 = function0;
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                final byte b16 = 1;
                function2 = new Function2() { // from class: a.cbc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b16) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iL = x8x.L(i | 1);
                                int iL2 = x8x.L(i2);
                                ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iL3 = x8x.L(i | 1);
                                int iL4 = x8x.L(i2);
                                ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                yfe0Var = yfe0VarU;
                yfe0Var.d = function2;
            }
        }
        i4 |= 3072;
        z2 = z;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                o0xVar4 = o0xVar;
                if (fetVar.g(o0xVar4)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                num4 = num;
            } else {
                num4 = num;
                if ((i & 196608) == 0) {
                    if (fetVar.g(num4)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                o0xVar5 = o0xVar2;
            } else {
                o0xVar5 = o0xVar2;
                if ((i & 1572864) == 0) {
                    if (fetVar.g(o0xVar5)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar.g(num2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            i13 = i3 & 256;
            if (i13 != 0) {
                if ((i & 100663296) == 0) {
                    if (fetVar.g(o0xVar3)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i4 |= i14;
                }
                i15 = i3 & 512;
                if (i15 != 0) {
                    if ((i & 805306368) == 0) {
                        if (fetVar.g(num3)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i4 |= i16;
                    }
                    i17 = i3 & 1024;
                    if (i17 != 0) {
                        i18 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (fetVar.g(bool)) {
                            i19 = 4;
                        } else {
                            i19 = 2;
                        }
                        i18 = i2 | i19;
                    } else {
                        i18 = i2;
                    }
                    i20 = i3 & 2048;
                    if (i20 != 0) {
                        i18 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (fetVar.g(bool2)) {
                            i21 = 32;
                        } else {
                            i21 = 16;
                        }
                        i18 |= i21;
                    }
                    i22 = i18;
                    i23 = i3 & 4096;
                    if (i23 != 0) {
                        i25 = i22 | 384;
                    } else {
                        i24 = i22;
                        if ((i2 & 384) != 0) {
                            if (fetVar.g(bool3)) {
                                i26 = 256;
                            } else {
                                i26 = 128;
                            }
                            i24 |= i26;
                        }
                        i25 = i24;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (fetVar.U(i4 & 1, z3)) {
                        if (i30 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i31 != 0) {
                            z4 = false;
                        } else {
                            z4 = z2;
                        }
                        if (i5 != 0) {
                            o0xVar6 = null;
                        } else {
                            o0xVar6 = o0xVar4;
                        }
                        o0xVar8 = null;
                        if (i7 == 0) {
                        }
                        if (i9 != 0) {
                            o0xVar5 = null;
                        }
                        if (i11 != 0) {
                            num5 = null;
                        } else {
                            num5 = num2;
                        }
                        if (i13 == 0) {
                            o0xVar8 = o0xVar3;
                        }
                        if (i15 != 0) {
                            num7 = null;
                        } else {
                            num7 = num3;
                        }
                        if (i17 != 0) {
                            bool4 = Boolean.TRUE;
                        } else {
                            bool4 = bool;
                        }
                        if (i20 != 0) {
                            bool5 = Boolean.TRUE;
                        } else {
                            bool5 = bool2;
                        }
                        if (i23 != 0) {
                            bool6 = Boolean.TRUE;
                        } else {
                            bool6 = bool3;
                        }
                        o0xVar9 = o0xVar5;
                        if (i27 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (num6 == null) {
                            fetVar.e0(-527158334);
                            fetVar.r(false);
                            pm80VarF = null;
                        } else {
                            fetVar.e0(-527158333);
                            pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                            fetVar.r(false);
                        }
                        mm40Var5 = mm40Var4;
                        if (num5 == null) {
                            fetVar.e0(-527067070);
                            fetVar.r(false);
                            pm80VarF2 = null;
                        } else {
                            fetVar.e0(-527067069);
                            pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                            fetVar.r(false);
                        }
                        pm80 pm80Var10 = pm80VarF2;
                        if (num7 == null) {
                            fetVar.e0(-526973822);
                            fetVar.r(false);
                            pm80VarF3 = null;
                        } else {
                            fetVar.e0(-526973821);
                            pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                            fetVar.r(false);
                        }
                        if (o0xVar6 == null) {
                            o0xVar10 = o0xVar6;
                        } else if (o0xVar9 == null) {
                            o0xVar10 = o0xVar8;
                        } else {
                            o0xVar10 = o0xVar9;
                        }
                        if (o0xVar10 != null) {
                        }
                        yfe0VarU2 = fetVar.u();
                        if (yfe0VarU2 == null) {
                            final byte b17 = 0;
                            function2 = new Function2() { // from class: a.cbc
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (b17) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iL = x8x.L(i | 1);
                                            int iL2 = x8x.L(i2);
                                            ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iL3 = x8x.L(i | 1);
                                            int iL4 = x8x.L(i2);
                                            ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            yfe0Var = yfe0VarU2;
                            yfe0Var.d = function2;
                        }
                        return;
                    }
                    fetVar2 = fetVar;
                    fetVar2.X();
                    num5 = num2;
                    bool4 = bool;
                    bool5 = bool2;
                    mm40Var3 = mm40Var2;
                    z4 = z2;
                    o0xVar6 = o0xVar4;
                    num6 = num4;
                    o0xVar7 = o0xVar5;
                    o0xVar8 = o0xVar3;
                    num7 = num3;
                    bool6 = bool3;
                    function1 = function0;
                    yfe0VarU = fetVar2.u();
                    if (yfe0VarU != null) {
                        final byte b18 = 1;
                        function2 = new Function2() { // from class: a.cbc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b18) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iL = x8x.L(i | 1);
                                        int iL2 = x8x.L(i2);
                                        ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iL3 = x8x.L(i | 1);
                                        int iL4 = x8x.L(i2);
                                        ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        yfe0Var = yfe0VarU;
                        yfe0Var.d = function2;
                    }
                }
                i4 |= 805306368;
                i17 = i3 & 1024;
                if (i17 != 0) {
                    i18 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (fetVar.g(bool)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i2 | i19;
                } else {
                    i18 = i2;
                }
                i20 = i3 & 2048;
                if (i20 != 0) {
                    i18 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (fetVar.g(bool2)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                i23 = i3 & 4096;
                if (i23 != 0) {
                    i25 = i22 | 384;
                } else {
                    i24 = i22;
                    if ((i2 & 384) != 0) {
                        if (fetVar.g(bool3)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i24 |= i26;
                    }
                    i25 = i24;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (fetVar.U(i4 & 1, z3)) {
                    if (i30 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i31 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i5 != 0) {
                        o0xVar6 = null;
                    } else {
                        o0xVar6 = o0xVar4;
                    }
                    o0xVar8 = null;
                    if (i7 == 0) {
                    }
                    if (i9 != 0) {
                        o0xVar5 = null;
                    }
                    if (i11 != 0) {
                        num5 = null;
                    } else {
                        num5 = num2;
                    }
                    if (i13 == 0) {
                        o0xVar8 = o0xVar3;
                    }
                    if (i15 != 0) {
                        num7 = null;
                    } else {
                        num7 = num3;
                    }
                    if (i17 != 0) {
                        bool4 = Boolean.TRUE;
                    } else {
                        bool4 = bool;
                    }
                    if (i20 != 0) {
                        bool5 = Boolean.TRUE;
                    } else {
                        bool5 = bool2;
                    }
                    if (i23 != 0) {
                        bool6 = Boolean.TRUE;
                    } else {
                        bool6 = bool3;
                    }
                    o0xVar9 = o0xVar5;
                    if (i27 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (num6 == null) {
                        fetVar.e0(-527158334);
                        fetVar.r(false);
                        pm80VarF = null;
                    } else {
                        fetVar.e0(-527158333);
                        pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    mm40Var5 = mm40Var4;
                    if (num5 == null) {
                        fetVar.e0(-527067070);
                        fetVar.r(false);
                        pm80VarF2 = null;
                    } else {
                        fetVar.e0(-527067069);
                        pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    pm80 pm80Var11 = pm80VarF2;
                    if (num7 == null) {
                        fetVar.e0(-526973822);
                        fetVar.r(false);
                        pm80VarF3 = null;
                    } else {
                        fetVar.e0(-526973821);
                        pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    if (o0xVar6 == null) {
                        o0xVar10 = o0xVar6;
                    } else if (o0xVar9 == null) {
                        o0xVar10 = o0xVar8;
                    } else {
                        o0xVar10 = o0xVar9;
                    }
                    if (o0xVar10 != null) {
                    }
                    yfe0VarU2 = fetVar.u();
                    if (yfe0VarU2 == null) {
                        final byte b19 = 0;
                        function2 = new Function2() { // from class: a.cbc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b19) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iL = x8x.L(i | 1);
                                        int iL2 = x8x.L(i2);
                                        ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iL3 = x8x.L(i | 1);
                                        int iL4 = x8x.L(i2);
                                        ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        yfe0Var = yfe0VarU2;
                        yfe0Var.d = function2;
                    }
                    return;
                }
                fetVar2 = fetVar;
                fetVar2.X();
                num5 = num2;
                bool4 = bool;
                bool5 = bool2;
                mm40Var3 = mm40Var2;
                z4 = z2;
                o0xVar6 = o0xVar4;
                num6 = num4;
                o0xVar7 = o0xVar5;
                o0xVar8 = o0xVar3;
                num7 = num3;
                bool6 = bool3;
                function1 = function0;
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    final byte b110 = 1;
                    function2 = new Function2() { // from class: a.cbc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b110) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iL = x8x.L(i | 1);
                                    int iL2 = x8x.L(i2);
                                    ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iL3 = x8x.L(i | 1);
                                    int iL4 = x8x.L(i2);
                                    ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    yfe0Var = yfe0VarU;
                    yfe0Var.d = function2;
                }
            }
            i4 |= 100663296;
            i15 = i3 & 512;
            if (i15 != 0) {
                if ((i & 805306368) == 0) {
                    if (fetVar.g(num3)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i4 |= i16;
                }
                i17 = i3 & 1024;
                if (i17 != 0) {
                    i18 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (fetVar.g(bool)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i2 | i19;
                } else {
                    i18 = i2;
                }
                i20 = i3 & 2048;
                if (i20 != 0) {
                    i18 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (fetVar.g(bool2)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                i23 = i3 & 4096;
                if (i23 != 0) {
                    i25 = i22 | 384;
                } else {
                    i24 = i22;
                    if ((i2 & 384) != 0) {
                        if (fetVar.g(bool3)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i24 |= i26;
                    }
                    i25 = i24;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (fetVar.U(i4 & 1, z3)) {
                    if (i30 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i31 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i5 != 0) {
                        o0xVar6 = null;
                    } else {
                        o0xVar6 = o0xVar4;
                    }
                    o0xVar8 = null;
                    if (i7 == 0) {
                    }
                    if (i9 != 0) {
                        o0xVar5 = null;
                    }
                    if (i11 != 0) {
                        num5 = null;
                    } else {
                        num5 = num2;
                    }
                    if (i13 == 0) {
                        o0xVar8 = o0xVar3;
                    }
                    if (i15 != 0) {
                        num7 = null;
                    } else {
                        num7 = num3;
                    }
                    if (i17 != 0) {
                        bool4 = Boolean.TRUE;
                    } else {
                        bool4 = bool;
                    }
                    if (i20 != 0) {
                        bool5 = Boolean.TRUE;
                    } else {
                        bool5 = bool2;
                    }
                    if (i23 != 0) {
                        bool6 = Boolean.TRUE;
                    } else {
                        bool6 = bool3;
                    }
                    o0xVar9 = o0xVar5;
                    if (i27 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (num6 == null) {
                        fetVar.e0(-527158334);
                        fetVar.r(false);
                        pm80VarF = null;
                    } else {
                        fetVar.e0(-527158333);
                        pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    mm40Var5 = mm40Var4;
                    if (num5 == null) {
                        fetVar.e0(-527067070);
                        fetVar.r(false);
                        pm80VarF2 = null;
                    } else {
                        fetVar.e0(-527067069);
                        pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    pm80 pm80Var12 = pm80VarF2;
                    if (num7 == null) {
                        fetVar.e0(-526973822);
                        fetVar.r(false);
                        pm80VarF3 = null;
                    } else {
                        fetVar.e0(-526973821);
                        pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    if (o0xVar6 == null) {
                        o0xVar10 = o0xVar6;
                    } else if (o0xVar9 == null) {
                        o0xVar10 = o0xVar8;
                    } else {
                        o0xVar10 = o0xVar9;
                    }
                    if (o0xVar10 != null) {
                    }
                    yfe0VarU2 = fetVar.u();
                    if (yfe0VarU2 == null) {
                        final byte b111 = 0;
                        function2 = new Function2() { // from class: a.cbc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b111) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iL = x8x.L(i | 1);
                                        int iL2 = x8x.L(i2);
                                        ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iL3 = x8x.L(i | 1);
                                        int iL4 = x8x.L(i2);
                                        ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        yfe0Var = yfe0VarU2;
                        yfe0Var.d = function2;
                    }
                    return;
                }
                fetVar2 = fetVar;
                fetVar2.X();
                num5 = num2;
                bool4 = bool;
                bool5 = bool2;
                mm40Var3 = mm40Var2;
                z4 = z2;
                o0xVar6 = o0xVar4;
                num6 = num4;
                o0xVar7 = o0xVar5;
                o0xVar8 = o0xVar3;
                num7 = num3;
                bool6 = bool3;
                function1 = function0;
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    final byte b112 = 1;
                    function2 = new Function2() { // from class: a.cbc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b112) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iL = x8x.L(i | 1);
                                    int iL2 = x8x.L(i2);
                                    ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iL3 = x8x.L(i | 1);
                                    int iL4 = x8x.L(i2);
                                    ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    yfe0Var = yfe0VarU;
                    yfe0Var.d = function2;
                }
            }
            i4 |= 805306368;
            i17 = i3 & 1024;
            if (i17 != 0) {
                i18 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (fetVar.g(bool)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i2 | i19;
            } else {
                i18 = i2;
            }
            i20 = i3 & 2048;
            if (i20 != 0) {
                i18 |= 48;
            } else if ((i2 & 48) != 0) {
                if (fetVar.g(bool2)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i18 |= i21;
            }
            i22 = i18;
            i23 = i3 & 4096;
            if (i23 != 0) {
                i25 = i22 | 384;
            } else {
                i24 = i22;
                if ((i2 & 384) != 0) {
                    if (fetVar.g(bool3)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i24 |= i26;
                }
                i25 = i24;
            }
            i27 = i3 & 8192;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                } else {
                    i29 = i28;
                }
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar.U(i4 & 1, z3)) {
                if (i30 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i31 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i5 != 0) {
                    o0xVar6 = null;
                } else {
                    o0xVar6 = o0xVar4;
                }
                o0xVar8 = null;
                if (i7 == 0) {
                }
                if (i9 != 0) {
                    o0xVar5 = null;
                }
                if (i11 != 0) {
                    num5 = null;
                } else {
                    num5 = num2;
                }
                if (i13 == 0) {
                    o0xVar8 = o0xVar3;
                }
                if (i15 != 0) {
                    num7 = null;
                } else {
                    num7 = num3;
                }
                if (i17 != 0) {
                    bool4 = Boolean.TRUE;
                } else {
                    bool4 = bool;
                }
                if (i20 != 0) {
                    bool5 = Boolean.TRUE;
                } else {
                    bool5 = bool2;
                }
                if (i23 != 0) {
                    bool6 = Boolean.TRUE;
                } else {
                    bool6 = bool3;
                }
                o0xVar9 = o0xVar5;
                if (i27 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if (num6 == null) {
                    fetVar.e0(-527158334);
                    fetVar.r(false);
                    pm80VarF = null;
                } else {
                    fetVar.e0(-527158333);
                    pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                    fetVar.r(false);
                }
                mm40Var5 = mm40Var4;
                if (num5 == null) {
                    fetVar.e0(-527067070);
                    fetVar.r(false);
                    pm80VarF2 = null;
                } else {
                    fetVar.e0(-527067069);
                    pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                    fetVar.r(false);
                }
                pm80 pm80Var13 = pm80VarF2;
                if (num7 == null) {
                    fetVar.e0(-526973822);
                    fetVar.r(false);
                    pm80VarF3 = null;
                } else {
                    fetVar.e0(-526973821);
                    pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                    fetVar.r(false);
                }
                if (o0xVar6 == null) {
                    o0xVar10 = o0xVar6;
                } else if (o0xVar9 == null) {
                    o0xVar10 = o0xVar8;
                } else {
                    o0xVar10 = o0xVar9;
                }
                if (o0xVar10 != null) {
                }
                yfe0VarU2 = fetVar.u();
                if (yfe0VarU2 == null) {
                    final byte b113 = 0;
                    function2 = new Function2() { // from class: a.cbc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b113) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iL = x8x.L(i | 1);
                                    int iL2 = x8x.L(i2);
                                    ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iL3 = x8x.L(i | 1);
                                    int iL4 = x8x.L(i2);
                                    ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    yfe0Var = yfe0VarU2;
                    yfe0Var.d = function2;
                }
                return;
            }
            fetVar2 = fetVar;
            fetVar2.X();
            num5 = num2;
            bool4 = bool;
            bool5 = bool2;
            mm40Var3 = mm40Var2;
            z4 = z2;
            o0xVar6 = o0xVar4;
            num6 = num4;
            o0xVar7 = o0xVar5;
            o0xVar8 = o0xVar3;
            num7 = num3;
            bool6 = bool3;
            function1 = function0;
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                final byte b114 = 1;
                function2 = new Function2() { // from class: a.cbc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b114) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iL = x8x.L(i | 1);
                                int iL2 = x8x.L(i2);
                                ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iL3 = x8x.L(i | 1);
                                int iL4 = x8x.L(i2);
                                ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                yfe0Var = yfe0VarU;
                yfe0Var.d = function2;
            }
        }
        i4 |= 24576;
        o0xVar4 = o0xVar;
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
            num4 = num;
        } else {
            num4 = num;
            if ((i & 196608) == 0) {
                if (fetVar.g(num4)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
            o0xVar5 = o0xVar2;
        } else {
            o0xVar5 = o0xVar2;
            if ((i & 1572864) == 0) {
                if (fetVar.g(o0xVar5)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
        }
        i11 = i3 & 128;
        if (i11 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (fetVar.g(num2)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        i13 = i3 & 256;
        if (i13 != 0) {
            if ((i & 100663296) == 0) {
                if (fetVar.g(o0xVar3)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i4 |= i14;
            }
            i15 = i3 & 512;
            if (i15 != 0) {
                if ((i & 805306368) == 0) {
                    if (fetVar.g(num3)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i4 |= i16;
                }
                i17 = i3 & 1024;
                if (i17 != 0) {
                    i18 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (fetVar.g(bool)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i2 | i19;
                } else {
                    i18 = i2;
                }
                i20 = i3 & 2048;
                if (i20 != 0) {
                    i18 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (fetVar.g(bool2)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                i23 = i3 & 4096;
                if (i23 != 0) {
                    i25 = i22 | 384;
                } else {
                    i24 = i22;
                    if ((i2 & 384) != 0) {
                        if (fetVar.g(bool3)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i24 |= i26;
                    }
                    i25 = i24;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (fetVar.U(i4 & 1, z3)) {
                    if (i30 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i31 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i5 != 0) {
                        o0xVar6 = null;
                    } else {
                        o0xVar6 = o0xVar4;
                    }
                    o0xVar8 = null;
                    if (i7 == 0) {
                    }
                    if (i9 != 0) {
                        o0xVar5 = null;
                    }
                    if (i11 != 0) {
                        num5 = null;
                    } else {
                        num5 = num2;
                    }
                    if (i13 == 0) {
                        o0xVar8 = o0xVar3;
                    }
                    if (i15 != 0) {
                        num7 = null;
                    } else {
                        num7 = num3;
                    }
                    if (i17 != 0) {
                        bool4 = Boolean.TRUE;
                    } else {
                        bool4 = bool;
                    }
                    if (i20 != 0) {
                        bool5 = Boolean.TRUE;
                    } else {
                        bool5 = bool2;
                    }
                    if (i23 != 0) {
                        bool6 = Boolean.TRUE;
                    } else {
                        bool6 = bool3;
                    }
                    o0xVar9 = o0xVar5;
                    if (i27 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (num6 == null) {
                        fetVar.e0(-527158334);
                        fetVar.r(false);
                        pm80VarF = null;
                    } else {
                        fetVar.e0(-527158333);
                        pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    mm40Var5 = mm40Var4;
                    if (num5 == null) {
                        fetVar.e0(-527067070);
                        fetVar.r(false);
                        pm80VarF2 = null;
                    } else {
                        fetVar.e0(-527067069);
                        pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    pm80 pm80Var14 = pm80VarF2;
                    if (num7 == null) {
                        fetVar.e0(-526973822);
                        fetVar.r(false);
                        pm80VarF3 = null;
                    } else {
                        fetVar.e0(-526973821);
                        pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                        fetVar.r(false);
                    }
                    if (o0xVar6 == null) {
                        o0xVar10 = o0xVar6;
                    } else if (o0xVar9 == null) {
                        o0xVar10 = o0xVar8;
                    } else {
                        o0xVar10 = o0xVar9;
                    }
                    if (o0xVar10 != null) {
                    }
                    yfe0VarU2 = fetVar.u();
                    if (yfe0VarU2 == null) {
                        final byte b115 = 0;
                        function2 = new Function2() { // from class: a.cbc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b115) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iL = x8x.L(i | 1);
                                        int iL2 = x8x.L(i2);
                                        ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iL3 = x8x.L(i | 1);
                                        int iL4 = x8x.L(i2);
                                        ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        yfe0Var = yfe0VarU2;
                        yfe0Var.d = function2;
                    }
                    return;
                }
                fetVar2 = fetVar;
                fetVar2.X();
                num5 = num2;
                bool4 = bool;
                bool5 = bool2;
                mm40Var3 = mm40Var2;
                z4 = z2;
                o0xVar6 = o0xVar4;
                num6 = num4;
                o0xVar7 = o0xVar5;
                o0xVar8 = o0xVar3;
                num7 = num3;
                bool6 = bool3;
                function1 = function0;
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    final byte b116 = 1;
                    function2 = new Function2() { // from class: a.cbc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b116) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iL = x8x.L(i | 1);
                                    int iL2 = x8x.L(i2);
                                    ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iL3 = x8x.L(i | 1);
                                    int iL4 = x8x.L(i2);
                                    ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    yfe0Var = yfe0VarU;
                    yfe0Var.d = function2;
                }
            }
            i4 |= 805306368;
            i17 = i3 & 1024;
            if (i17 != 0) {
                i18 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (fetVar.g(bool)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i2 | i19;
            } else {
                i18 = i2;
            }
            i20 = i3 & 2048;
            if (i20 != 0) {
                i18 |= 48;
            } else if ((i2 & 48) != 0) {
                if (fetVar.g(bool2)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i18 |= i21;
            }
            i22 = i18;
            i23 = i3 & 4096;
            if (i23 != 0) {
                i25 = i22 | 384;
            } else {
                i24 = i22;
                if ((i2 & 384) != 0) {
                    if (fetVar.g(bool3)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i24 |= i26;
                }
                i25 = i24;
            }
            i27 = i3 & 8192;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                } else {
                    i29 = i28;
                }
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar.U(i4 & 1, z3)) {
                if (i30 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i31 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i5 != 0) {
                    o0xVar6 = null;
                } else {
                    o0xVar6 = o0xVar4;
                }
                o0xVar8 = null;
                if (i7 == 0) {
                }
                if (i9 != 0) {
                    o0xVar5 = null;
                }
                if (i11 != 0) {
                    num5 = null;
                } else {
                    num5 = num2;
                }
                if (i13 == 0) {
                    o0xVar8 = o0xVar3;
                }
                if (i15 != 0) {
                    num7 = null;
                } else {
                    num7 = num3;
                }
                if (i17 != 0) {
                    bool4 = Boolean.TRUE;
                } else {
                    bool4 = bool;
                }
                if (i20 != 0) {
                    bool5 = Boolean.TRUE;
                } else {
                    bool5 = bool2;
                }
                if (i23 != 0) {
                    bool6 = Boolean.TRUE;
                } else {
                    bool6 = bool3;
                }
                o0xVar9 = o0xVar5;
                if (i27 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if (num6 == null) {
                    fetVar.e0(-527158334);
                    fetVar.r(false);
                    pm80VarF = null;
                } else {
                    fetVar.e0(-527158333);
                    pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                    fetVar.r(false);
                }
                mm40Var5 = mm40Var4;
                if (num5 == null) {
                    fetVar.e0(-527067070);
                    fetVar.r(false);
                    pm80VarF2 = null;
                } else {
                    fetVar.e0(-527067069);
                    pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                    fetVar.r(false);
                }
                pm80 pm80Var15 = pm80VarF2;
                if (num7 == null) {
                    fetVar.e0(-526973822);
                    fetVar.r(false);
                    pm80VarF3 = null;
                } else {
                    fetVar.e0(-526973821);
                    pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                    fetVar.r(false);
                }
                if (o0xVar6 == null) {
                    o0xVar10 = o0xVar6;
                } else if (o0xVar9 == null) {
                    o0xVar10 = o0xVar8;
                } else {
                    o0xVar10 = o0xVar9;
                }
                if (o0xVar10 != null) {
                }
                yfe0VarU2 = fetVar.u();
                if (yfe0VarU2 == null) {
                    final byte b117 = 0;
                    function2 = new Function2() { // from class: a.cbc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b117) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iL = x8x.L(i | 1);
                                    int iL2 = x8x.L(i2);
                                    ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iL3 = x8x.L(i | 1);
                                    int iL4 = x8x.L(i2);
                                    ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    yfe0Var = yfe0VarU2;
                    yfe0Var.d = function2;
                }
                return;
            }
            fetVar2 = fetVar;
            fetVar2.X();
            num5 = num2;
            bool4 = bool;
            bool5 = bool2;
            mm40Var3 = mm40Var2;
            z4 = z2;
            o0xVar6 = o0xVar4;
            num6 = num4;
            o0xVar7 = o0xVar5;
            o0xVar8 = o0xVar3;
            num7 = num3;
            bool6 = bool3;
            function1 = function0;
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                final byte b118 = 1;
                function2 = new Function2() { // from class: a.cbc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b118) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iL = x8x.L(i | 1);
                                int iL2 = x8x.L(i2);
                                ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iL3 = x8x.L(i | 1);
                                int iL4 = x8x.L(i2);
                                ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                yfe0Var = yfe0VarU;
                yfe0Var.d = function2;
            }
        }
        i4 |= 100663296;
        i15 = i3 & 512;
        if (i15 != 0) {
            if ((i & 805306368) == 0) {
                if (fetVar.g(num3)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i4 |= i16;
            }
            i17 = i3 & 1024;
            if (i17 != 0) {
                i18 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (fetVar.g(bool)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i2 | i19;
            } else {
                i18 = i2;
            }
            i20 = i3 & 2048;
            if (i20 != 0) {
                i18 |= 48;
            } else if ((i2 & 48) != 0) {
                if (fetVar.g(bool2)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i18 |= i21;
            }
            i22 = i18;
            i23 = i3 & 4096;
            if (i23 != 0) {
                i25 = i22 | 384;
            } else {
                i24 = i22;
                if ((i2 & 384) != 0) {
                    if (fetVar.g(bool3)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i24 |= i26;
                }
                i25 = i24;
            }
            i27 = i3 & 8192;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
                } else {
                    i29 = i28;
                }
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar.U(i4 & 1, z3)) {
                if (i30 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i31 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i5 != 0) {
                    o0xVar6 = null;
                } else {
                    o0xVar6 = o0xVar4;
                }
                o0xVar8 = null;
                if (i7 == 0) {
                }
                if (i9 != 0) {
                    o0xVar5 = null;
                }
                if (i11 != 0) {
                    num5 = null;
                } else {
                    num5 = num2;
                }
                if (i13 == 0) {
                    o0xVar8 = o0xVar3;
                }
                if (i15 != 0) {
                    num7 = null;
                } else {
                    num7 = num3;
                }
                if (i17 != 0) {
                    bool4 = Boolean.TRUE;
                } else {
                    bool4 = bool;
                }
                if (i20 != 0) {
                    bool5 = Boolean.TRUE;
                } else {
                    bool5 = bool2;
                }
                if (i23 != 0) {
                    bool6 = Boolean.TRUE;
                } else {
                    bool6 = bool3;
                }
                o0xVar9 = o0xVar5;
                if (i27 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if (num6 == null) {
                    fetVar.e0(-527158334);
                    fetVar.r(false);
                    pm80VarF = null;
                } else {
                    fetVar.e0(-527158333);
                    pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                    fetVar.r(false);
                }
                mm40Var5 = mm40Var4;
                if (num5 == null) {
                    fetVar.e0(-527067070);
                    fetVar.r(false);
                    pm80VarF2 = null;
                } else {
                    fetVar.e0(-527067069);
                    pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                    fetVar.r(false);
                }
                pm80 pm80Var16 = pm80VarF2;
                if (num7 == null) {
                    fetVar.e0(-526973822);
                    fetVar.r(false);
                    pm80VarF3 = null;
                } else {
                    fetVar.e0(-526973821);
                    pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                    fetVar.r(false);
                }
                if (o0xVar6 == null) {
                    o0xVar10 = o0xVar6;
                } else if (o0xVar9 == null) {
                    o0xVar10 = o0xVar8;
                } else {
                    o0xVar10 = o0xVar9;
                }
                if (o0xVar10 != null) {
                }
                yfe0VarU2 = fetVar.u();
                if (yfe0VarU2 == null) {
                    final byte b119 = 0;
                    function2 = new Function2() { // from class: a.cbc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b119) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iL = x8x.L(i | 1);
                                    int iL2 = x8x.L(i2);
                                    ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iL3 = x8x.L(i | 1);
                                    int iL4 = x8x.L(i2);
                                    ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    yfe0Var = yfe0VarU2;
                    yfe0Var.d = function2;
                }
                return;
            }
            fetVar2 = fetVar;
            fetVar2.X();
            num5 = num2;
            bool4 = bool;
            bool5 = bool2;
            mm40Var3 = mm40Var2;
            z4 = z2;
            o0xVar6 = o0xVar4;
            num6 = num4;
            o0xVar7 = o0xVar5;
            o0xVar8 = o0xVar3;
            num7 = num3;
            bool6 = bool3;
            function1 = function0;
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                final byte b1110 = 1;
                function2 = new Function2() { // from class: a.cbc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b1110) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iL = x8x.L(i | 1);
                                int iL2 = x8x.L(i2);
                                ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iL3 = x8x.L(i | 1);
                                int iL4 = x8x.L(i2);
                                ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                yfe0Var = yfe0VarU;
                yfe0Var.d = function2;
            }
        }
        i4 |= 805306368;
        i17 = i3 & 1024;
        if (i17 != 0) {
            i18 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (fetVar.g(bool)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i18 = i2 | i19;
        } else {
            i18 = i2;
        }
        i20 = i3 & 2048;
        if (i20 != 0) {
            i18 |= 48;
        } else if ((i2 & 48) != 0) {
            if (fetVar.g(bool2)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i18 |= i21;
        }
        i22 = i18;
        i23 = i3 & 4096;
        if (i23 != 0) {
            i25 = i22 | 384;
        } else {
            i24 = i22;
            if ((i2 & 384) != 0) {
                if (fetVar.g(bool3)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i24 |= i26;
            }
            i25 = i24;
        }
        i27 = i3 & 8192;
        if (i27 != 0) {
            i29 = i25 | 3072;
        } else {
            i28 = i25;
            if ((i2 & 3072) == 0) {
                i29 = i28 | (fetVar.i(function0) ? 2048 : 1024);
            } else {
                i29 = i28;
            }
        }
        if ((i4 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (fetVar.U(i4 & 1, z3)) {
            if (i30 != 0) {
                mm40Var4 = jm40.b;
            } else {
                mm40Var4 = mm40Var2;
            }
            if (i31 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            if (i5 != 0) {
                o0xVar6 = null;
            } else {
                o0xVar6 = o0xVar4;
            }
            o0xVar8 = null;
            if (i7 == 0) {
            }
            if (i9 != 0) {
                o0xVar5 = null;
            }
            if (i11 != 0) {
                num5 = null;
            } else {
                num5 = num2;
            }
            if (i13 == 0) {
                o0xVar8 = o0xVar3;
            }
            if (i15 != 0) {
                num7 = null;
            } else {
                num7 = num3;
            }
            if (i17 != 0) {
                bool4 = Boolean.TRUE;
            } else {
                bool4 = bool;
            }
            if (i20 != 0) {
                bool5 = Boolean.TRUE;
            } else {
                bool5 = bool2;
            }
            if (i23 != 0) {
                bool6 = Boolean.TRUE;
            } else {
                bool6 = bool3;
            }
            o0xVar9 = o0xVar5;
            if (i27 != 0) {
                function1 = null;
            } else {
                function1 = function0;
            }
            if (num6 == null) {
                fetVar.e0(-527158334);
                fetVar.r(false);
                pm80VarF = null;
            } else {
                fetVar.e0(-527158333);
                pm80VarF = a8k0.F(num6.intValue(), 0, fetVar);
                fetVar.r(false);
            }
            mm40Var5 = mm40Var4;
            if (num5 == null) {
                fetVar.e0(-527067070);
                fetVar.r(false);
                pm80VarF2 = null;
            } else {
                fetVar.e0(-527067069);
                pm80VarF2 = a8k0.F(num5.intValue(), 0, fetVar);
                fetVar.r(false);
            }
            pm80 pm80Var17 = pm80VarF2;
            if (num7 == null) {
                fetVar.e0(-526973822);
                fetVar.r(false);
                pm80VarF3 = null;
            } else {
                fetVar.e0(-526973821);
                pm80VarF3 = a8k0.F(num7.intValue(), 0, fetVar);
                fetVar.r(false);
            }
            if (o0xVar6 == null) {
                o0xVar10 = o0xVar6;
            } else if (o0xVar9 == null) {
                o0xVar10 = o0xVar8;
            } else {
                o0xVar10 = o0xVar9;
            }
            if (o0xVar10 != null) {
            }
            yfe0VarU2 = fetVar.u();
            if (yfe0VarU2 == null) {
                final byte b1111 = 0;
                function2 = new Function2() { // from class: a.cbc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b1111) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iL = x8x.L(i | 1);
                                int iL2 = x8x.L(i2);
                                ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iL3 = x8x.L(i | 1);
                                int iL4 = x8x.L(i2);
                                ebc.b(mm40Var5, j, f, z4, o0xVar6, num6, o0xVar9, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                yfe0Var = yfe0VarU2;
                yfe0Var.d = function2;
            }
            return;
        }
        fetVar2 = fetVar;
        fetVar2.X();
        num5 = num2;
        bool4 = bool;
        bool5 = bool2;
        mm40Var3 = mm40Var2;
        z4 = z2;
        o0xVar6 = o0xVar4;
        num6 = num4;
        o0xVar7 = o0xVar5;
        o0xVar8 = o0xVar3;
        num7 = num3;
        bool6 = bool3;
        function1 = function0;
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final byte b1112 = 1;
            function2 = new Function2() { // from class: a.cbc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (b1112) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iL = x8x.L(i | 1);
                            int iL2 = x8x.L(i2);
                            ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL, iL2, i3);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iL3 = x8x.L(i | 1);
                            int iL4 = x8x.L(i2);
                            ebc.b(mm40Var3, j, f, z4, o0xVar6, num6, o0xVar7, num5, o0xVar8, num7, bool4, bool5, bool6, function1, (fet) obj, iL3, iL4, i3);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0Var = yfe0VarU;
            yfe0Var.d = function2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0296 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x029d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x029f  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e8  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v35 */
    public static final th90 b0(dav davVar, i4 i4Var, List list, String str, String str2, int i, List list2, ctf0 ctf0Var) {
        String strValueOf;
        Iterator it;
        ArrayList arrayList;
        String string;
        char c;
        String str3;
        char c2;
        String string2;
        char c3;
        long jM123getWhite0d7_KjU;
        StringBuilder sb;
        int i2;
        int i3;
        u9v u9vVar;
        char c4;
        int i4;
        char c5;
        i4Var.getClass();
        list.getClass();
        list2.getClass();
        ctf0Var.getClass();
        th90 th90VarPut = uh90.g;
        th90VarPut.getClass();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        ListIterator listIterator = i4Var.listIterator(0);
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            s9v s9vVar = (s9v) next;
            if (hashSet.add(new Pair(Float.valueOf(s9vVar.b), Float.valueOf(s9vVar.c)))) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        int i6 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i7 = i6 + 1;
            if (i6 < 0) {
                q3d.p();
                throw null;
            }
            s9v s9vVar2 = (s9v) next2;
            float f = s9vVar2.c;
            int i8 = s9vVar2.f31866a;
            t9v t9vVar = new t9v(f, s9vVar2.b, i8);
            if (i8 == -1) {
                it = it2;
                arrayList = arrayList2;
                i3 = i5;
                u9vVar = new u9v(StaticColors.INSTANCE.m123getWhite0d7_KjU(), kkg.p, str2, ctf0Var.b.a(R.string.gold_rush_go, Arrays.copyOf(new Object[i5], i5)), "", str2, "static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png");
            } else if (i6 == arrayList2.size() - 1) {
                StringBuilder sb2 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/GoldRush/PlayingField/Default/Fill.png", ujn.h, i5) || kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/GoldRush/PlayingField/Default/Fill.png", "https://", i5)) {
                    sb2.setLength(i5);
                    sb2.append("static/img/ImgDefault/Esports/Virtual/GoldRush/PlayingField/Default/Fill.png");
                } else {
                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                        sb2.append('/');
                    }
                    char[] cArr = new char[1];
                    cArr[i5] = '/';
                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/GoldRush/PlayingField/Default/Fill.png", cArr));
                }
                u9vVar = new u9v(StaticColors.INSTANCE.m123getWhite0d7_KjU(), kkg.p, sb2.toString(), "", "", "", "");
                it = it2;
                arrayList = arrayList2;
                i3 = i5;
            } else {
                Integer num = (Integer) CollectionsKt.W(i8, list);
                int iIntValue = num != null ? num.intValue() : i5;
                boolean zContains = list2.contains(Integer.valueOf(i8));
                String str4 = i8 <= i ? str2 : str;
                if (iIntValue > 0) {
                    strValueOf = twn.m(iIntValue, "+");
                } else {
                    strValueOf = iIntValue < 0 ? String.valueOf(iIntValue) : String.valueOf(i8 + 1);
                }
                String str5 = strValueOf;
                if (iIntValue >= 0 || !zContains) {
                    it = it2;
                    if (iIntValue <= 0 || !zContains) {
                        if (iIntValue < 0) {
                            StringBuilder sb3 = new StringBuilder(ujn.h);
                            arrayList = arrayList2;
                            int i9 = 0;
                            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus1.png", ujn.h, false)) {
                                sb3.setLength(i9);
                                sb3.append("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus1.png");
                            } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus1.png", "https://", false)) {
                                i9 = 0;
                                sb3.setLength(i9);
                                sb3.append("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus1.png");
                            } else {
                                if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                    c2 = '/';
                                } else {
                                    sb3.append('/');
                                    c2 = '/';
                                }
                                sb3.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus1.png", c2));
                            }
                            string = sb3.toString();
                        } else {
                            arrayList = arrayList2;
                            int i10 = 0;
                            if (iIntValue > 0) {
                                StringBuilder sb4 = new StringBuilder(ujn.h);
                                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus.png", ujn.h, false)) {
                                    sb4.setLength(i10);
                                    sb4.append("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus.png");
                                } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus.png", "https://", false)) {
                                    i10 = 0;
                                    sb4.setLength(i10);
                                    sb4.append("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus.png");
                                } else {
                                    if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                                        c = '/';
                                    } else {
                                        sb4.append('/');
                                        c = '/';
                                    }
                                    sb4.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus.png", c));
                                }
                                string = sb4.toString();
                            } else {
                                string = "";
                            }
                        }
                        str3 = string;
                    } else {
                        StringBuilder sb5 = new StringBuilder(ujn.h);
                        int i11 = 0;
                        if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png", ujn.h, false)) {
                            sb5.setLength(i11);
                            sb5.append("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png");
                        } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png", "https://", false)) {
                            i11 = 0;
                            sb5.setLength(i11);
                            sb5.append("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png");
                        } else {
                            if (sb5.length() <= 0 || StringsKt.S(sb5, Separators.SLASH)) {
                                c3 = '/';
                            } else {
                                sb5.append('/');
                                c3 = '/';
                            }
                            sb5.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png", c3));
                        }
                        string2 = sb5.toString();
                    }
                    if (!zContains && iIntValue < 0) {
                        jM123getWhite0d7_KjU = kkg.p;
                    } else if (!zContains && iIntValue > 0) {
                        jM123getWhite0d7_KjU = kkg.p;
                    } else if (iIntValue < 0) {
                        jM123getWhite0d7_KjU = kkg.n;
                    } else if (iIntValue > 0) {
                        jM123getWhite0d7_KjU = kkg.o;
                    } else {
                        jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                    }
                    sb = new StringBuilder(ujn.h);
                    if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png", ujn.h, false)) {
                        i2 = 0;
                    } else {
                        if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png", "https://", false)) {
                            i2 = 0;
                        } else {
                            if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                c4 = '/';
                            } else {
                                c4 = '/';
                                sb.append('/');
                            }
                            i2 = 0;
                            sb.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png", c4));
                        }
                        i3 = i2;
                        u9vVar = new u9v(jM123getWhite0d7_KjU, kkg.p, str4, str5, str3, str2, sb.toString());
                    }
                    sb.setLength(i2);
                    sb.append("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png");
                    i3 = i2;
                    u9vVar = new u9v(jM123getWhite0d7_KjU, kkg.p, str4, str5, str3, str2, sb.toString());
                } else {
                    StringBuilder sb6 = new StringBuilder(ujn.h);
                    it = it2;
                    if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png", ujn.h, false)) {
                        i4 = 0;
                    } else {
                        if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png", "https://", false)) {
                            i4 = 0;
                        } else {
                            if (sb6.length() <= 0 || StringsKt.S(sb6, Separators.SLASH)) {
                                c5 = '/';
                            } else {
                                sb6.append('/');
                                c5 = '/';
                            }
                            sb6.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png", c5));
                        }
                        string2 = sb6.toString();
                    }
                    sb6.setLength(i4);
                    sb6.append("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png");
                    string2 = sb6.toString();
                }
                str3 = string2;
                arrayList = arrayList2;
                if (!zContains) {
                    if (!zContains) {
                        if (iIntValue < 0) {
                            jM123getWhite0d7_KjU = kkg.n;
                        } else if (iIntValue > 0) {
                            jM123getWhite0d7_KjU = kkg.o;
                        } else {
                            jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                        }
                    } else if (iIntValue < 0) {
                        jM123getWhite0d7_KjU = kkg.n;
                    } else if (iIntValue > 0) {
                        jM123getWhite0d7_KjU = kkg.o;
                    } else {
                        jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                    }
                } else if (!zContains) {
                    if (iIntValue < 0) {
                        jM123getWhite0d7_KjU = kkg.n;
                    } else if (iIntValue > 0) {
                        jM123getWhite0d7_KjU = kkg.o;
                    } else {
                        jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                    }
                } else if (iIntValue < 0) {
                    jM123getWhite0d7_KjU = kkg.n;
                } else if (iIntValue > 0) {
                    jM123getWhite0d7_KjU = kkg.o;
                } else {
                    jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                sb = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png", ujn.h, false)) {
                    if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png", "https://", false)) {
                        i2 = 0;
                    } else {
                        if (sb.length() > 0) {
                            c4 = '/';
                        } else {
                            c4 = '/';
                        }
                        i2 = 0;
                        sb.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png", c4));
                    }
                    i3 = i2;
                    u9vVar = new u9v(jM123getWhite0d7_KjU, kkg.p, str4, str5, str3, str2, sb.toString());
                } else {
                    i2 = 0;
                }
                sb.setLength(i2);
                sb.append("static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png");
                i3 = i2;
                u9vVar = new u9v(jM123getWhite0d7_KjU, kkg.p, str4, str5, str3, str2, sb.toString());
            }
            th90VarPut = th90VarPut.put((Object) t9vVar, (Object) u9vVar);
            i6 = i7;
            i5 = i3;
            it2 = it;
            arrayList2 = arrayList;
        }
        return th90VarPut;
    }

    public static final void c(i5d i5dVar, y9q0 y9q0Var, fet fetVar, int i) {
        Object obj = y9q0Var;
        fet fetVar2 = fetVar;
        i5dVar.getClass();
        fetVar2.g0(-317170648);
        int i2 = i | (fetVar2.g(i5dVar) ? 4 : 2) | (fetVar2.g(obj) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.j, fetVar2, 6);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarL2 = s5x0.L(jm40Var, 0.0f, 0.0f, 3);
            String str = i5dVar.b;
            long j = i5dVar.f14187a;
            int i3 = (i2 << 18) & 29360128;
            v8q0.a(str, mm40VarL2, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 48, i3, 131068);
            mm40 mm40VarL3 = s5x0.L(jm40Var, 0.0f, 0.0f, 3);
            int iU = fbc.U(j);
            boolean z2 = ((iU >> 24) & 255) != 255;
            String str2 = z2 ? "#%08X" : "#%06X";
            if (!z2) {
                iU &= 16777215;
            }
            v8q0.a(String.format(str2, Arrays.copyOf(new Object[]{Integer.valueOf(iU)}, 1)), mm40VarL3, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 48, i3, 131068);
            obj = y9q0Var;
            fetVar2 = fetVar;
            fetVar2.r(true);
            zcl zclVar2 = qmk.l;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar2, o7k0.e(o7k0.d(i120.Q(jm40Var, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 1.0f), 32.0f));
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(i5dVar, obj, i, (byte) 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e A[PHI: r4
  0x006e: PHI (r4v23 java.lang.String) = (r4v8 java.lang.String), (r4v24 java.lang.String) binds: [B:30:0x0072, B:26:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084 A[PHI: r4
  0x0084: PHI (r4v20 java.lang.String) = (r4v12 java.lang.String), (r4v13 java.lang.String), (r4v21 java.lang.String) binds: [B:47:0x0093, B:49:0x0097, B:38:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    public static final dag c0(List list) {
        String str;
        String str2;
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x3t0 x3t0Var = (x3t0) it.next();
            rdj rdjVar = rdj.f30294a;
            Long l = x3t0Var.e;
            long time = rdj.k(l != null ? l.longValue() : 0L).getTime();
            Long l2 = x3t0Var.e;
            long time2 = rdj.k((l2 != null ? l2.longValue() : 0L) + 600).getTime();
            Long l3 = x3t0Var.f40237a;
            long jLongValue = l3 != null ? l3.longValue() : 0L;
            Long l4 = x3t0Var.b;
            long jLongValue2 = l4 != null ? l4.longValue() : 0L;
            String str3 = x3t0Var.c;
            ?? arrayList2 = 0;
            if (str3 == null) {
                str3 = x3t0Var.d;
                if (str3 == null) {
                    str = "";
                } else {
                    str = str3;
                }
            } else {
                if (str3.length() <= 0) {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = x3t0Var.d;
                    if (str3 == null) {
                        str = "";
                    } else {
                        str = str3;
                    }
                } else {
                    str = str3;
                }
            }
            String str4 = x3t0Var.l;
            if (str4 == null) {
                str4 = x3t0Var.g;
                if (str4 != null || str4.length() <= 0) {
                    str4 = null;
                }
                if (str4 == null || (str4 = x3t0Var.i) != null) {
                    str2 = str4;
                } else {
                    str2 = "";
                }
            } else {
                if (str4.length() <= 0) {
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = x3t0Var.g;
                    if (str4 != null) {
                        str4 = null;
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str2 = str4;
                    } else {
                        str2 = str4;
                    }
                } else {
                    str2 = str4;
                }
            }
            List<q3t0> list2 = x3t0Var.m;
            if (list2 != null) {
                arrayList2 = new ArrayList(r3d.q(list2, i));
                for (q3t0 q3t0Var : list2) {
                    String str5 = q3t0Var.d;
                    if (str5 == null) {
                        str5 = "";
                    }
                    StringBuilder sb = new StringBuilder(ujn.h);
                    String strK = kng0.k("ufcStatistic/v1/image/", q3t0Var.g);
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
                    arrayList2.add(new hag(str5, sb.toString()));
                }
            }
            if (arrayList2 == 0) {
                arrayList2 = iun.f15405a;
            }
            arrayList.add(new uag(jLongValue, 189L, jLongValue2, str, "", str2, 0L, 0, arrayList2, "", time, time2, 0L, false));
            i = 10;
        }
        return new dag(arrayList);
    }

    public static final void d(String str, String str2, fet fetVar, int i) {
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1165404428);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, 42.0f, 48.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarP);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            pm80 pm80VarF = a8k0.F(R.drawable.dota_item_statistic_item_placeholder, 0, fetVar2);
            mm40 mm40VarP2 = o7k0.p(jm40Var, 42.0f, 32.0f);
            zx7 zx7Var = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarP2, zx7Var);
            long j = kkg.j;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarB, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f);
            zcl zclVar3 = qmk.c;
            k7x.b(str, null, o2e.e0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarJ), "ITEM_STATISTIC_ITEM_IMAGE_TEST_TAG"), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar2, (i2 & 14) | 36912, 0, 32736);
            str3 = str2;
            v8q0.a(str3, jr8Var.b(jm40Var, gqw0.h), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, (i2 >> 3) & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str3 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 9, i, str, str3);
        }
    }

    public static void d0(yzp yzpVar, y190 y190Var) {
        if (yzpVar.n(y190Var)) {
            return;
        }
        try {
            yzpVar.x(y190Var, false).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void e(lmf lmfVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-758014407);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(lmfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dmf.f6320a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new v4f(lmfVar, context, (byte) 6);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, null, (Function1) objP2, fetVar2, 6, 2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(lmfVar, i, (byte) 21);
        }
    }

    public static final void e0(yzp yzpVar, y190 y190Var) throws IOException {
        try {
            IOException iOException = null;
            for (y190 y190Var2 : yzpVar.q(y190Var)) {
                try {
                    if (yzpVar.r(y190Var2).c) {
                        e0(yzpVar, y190Var2);
                    }
                    yzpVar.k(y190Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void f(int i, int i2, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(1727421755);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.e(i) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(vic.w(o7k0.e(mm40Var, 74.0f)), 8.0f, 10.0f, 8.0f, 8.0f);
            yx7 yx7Var = gqw0.k;
            x5d x5dVarA = w5d.a(new qw3(10.0f, false, new gne(yx7Var, (byte) 11)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            long j = iph.f;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i3 >> 3) & 14, 24960, 110586);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            int i4 = i3 >> 6;
            vfc.i(i, i4 & 112, iph.k, fetVar, o7k0.n(jm40Var, 20.0f));
            long j2 = iph.g;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, null, j2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, i4 & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nd8(mm40Var, str, str2, i, i2);
        }
    }

    public static final String f0(String str) {
        return str.length() > 13 ? ttm0.L(13, str).concat("...") : str;
    }

    public static final void g(mm40 mm40Var, s3i s3iVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(2107289791);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(s3iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            l7m0 l7m0VarB = d43.b(s3iVar.f31559a == r8.f30001a ? 180.0f : 0.0f, ro4.m0(300, 0, null, 6), "Icon Rotation", null, fetVar2, 3120, 20);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(o7k0.s(o7k0.e(jm40Var, 32.0f), 40.0f), 4.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), vgg0.f37379a);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new p2i(function1, s3iVar, (byte) 1);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarK = s5x0.K(jm40Var, 8.0f, 4.0f);
            boolean zG = fetVar2.g(l7m0VarB);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new x1d(l7m0VarB, (byte) 10);
                fetVar2.o0(objP2);
            }
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, i4w0.T(mm40VarK, (Function1) objP2), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2i(mm40Var2, s3iVar, function1, i, (byte) 1);
        }
    }

    public static final a4x g0(List list) {
        List arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(jwb.P((vua) it.next()).f19696a));
        }
        if (arrayList.isEmpty()) {
            arrayList = kotlin.collections.a.c(Integer.valueOf(R.drawable.ic_card_shirt));
        }
        return dyb.o0(arrayList);
    }

    public static final void h(mm40 mm40Var, boolean z, v3i v3iVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        f2i f2iVar = v3iVar.f36733a;
        fetVar.g0(-375212324);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(v3iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            tj30 tj30VarC = zq8.c(gqw0.b, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            boolean zEquals = f2iVar.equals(c2i.f3624a);
            int i3 = R.drawable.ic_glyph_broadcast;
            if (!zEquals) {
                if (f2iVar.equals(e2i.f7087a)) {
                    i3 = R.drawable.ic_glyph_video_zone;
                } else if (!(f2iVar instanceof d2i)) {
                    t9f.b();
                    return;
                }
            }
            int i4 = i3;
            boolean z2 = !(f2iVar instanceof d2i);
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new drh(function1, v3iVar, (byte) 2);
                fetVar.o0(objP);
            }
            n(null, i4, z2, (Function0) objP, fetVar, 0, 1);
            if (z) {
                fetVar.e0(981336003);
                acb.p(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(981375404);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i2i(mm40Var2, z, v3iVar, function1, i, (byte) 1);
        }
    }

    public static final String h0(d0t d0tVar, dmr dmrVar) {
        Object next;
        Iterator it = d0tVar.p.n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmrVar);
        cmr cmrVar = (cmr) next;
        String str = cmrVar != null ? cmrVar.b : null;
        if (str == null) {
            str = "";
        }
        return StringsKt.f0(str);
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(1577356651);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            mm40Var2 = jm40.b;
            str2 = str;
            v8q0.a(str2, mm40Var2, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(g1t0.g(), fetVar), fetVar, ((i2 >> 3) & 14) | 48, 24960, 110588);
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var2, str2, i, (byte) 24);
        }
    }

    public static a1g i0(vsg0 vsg0Var, long j, Function1 function1, Function0 function0) {
        return new a1g(vsg0Var, new ooe(function1, function0, j, null), (byte) 20);
    }

    public static final void j(mm40 mm40Var, z3i z3iVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        fetVar.g0(-557851220);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= fetVar.g(z3iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int iOrdinal = z3iVar.f43719a.ordinal();
            if (iOrdinal == 0) {
                i2 = R.drawable.ic_glyph_notification_active;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                i2 = R.drawable.ic_glyph_notification_inactive;
            }
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new j2i(function1, z3iVar, (byte) 2);
                fetVar.o0(objP);
            }
            int i4 = i2;
            jm40 jm40Var = jm40.b;
            n(jm40Var, i4, true, (Function0) objP, fetVar, (i3 & 14) | 384, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k2i(mm40Var2, z3iVar, function1, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:86:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00e2 A[SYNTHETIC] */
    public static r68 j0(r68 r68Var, int i, int i2, zk90 zk90Var) throws o660 {
        int i3 = i2;
        if (i <= 0 || i3 <= 0) {
            throw o660.a();
        }
        r68 r68Var2 = new r68(i, i3);
        int i4 = i * 2;
        float[] fArr = new float[i4];
        int i5 = 0;
        while (i5 < i3) {
            float f = i5 + 0.5f;
            for (int i6 = 0; i6 < i4; i6 += 2) {
                fArr[i6] = (i6 / 2) + 0.5f;
                fArr[i6 + 1] = f;
            }
            float f2 = zk90Var.f44520a;
            float f3 = zk90Var.b;
            float f4 = zk90Var.c;
            float f5 = zk90Var.d;
            float f6 = zk90Var.e;
            float f7 = zk90Var.f;
            float f8 = zk90Var.g;
            float f9 = zk90Var.h;
            float f10 = zk90Var.i;
            int i7 = i4 - 1;
            for (int i8 = 0; i8 < i7; i8 += 2) {
                float f11 = fArr[i8];
                int i9 = i8 + 1;
                float f12 = fArr[i9];
                float f13 = (f7 * f12) + (f4 * f11) + f10;
                fArr[i8] = (((f5 * f12) + (f2 * f11)) + f8) / f13;
                fArr[i9] = (((f12 * f6) + (f11 * f3)) + f9) / f13;
            }
            int i10 = r68Var.f29923a;
            int i11 = r68Var.b;
            boolean z = true;
            for (int i12 = 0; i12 < i7 && z; i12 += 2) {
                int i13 = (int) fArr[i12];
                int i14 = i12 + 1;
                int i15 = (int) fArr[i14];
                if (i13 < -1 || i13 > i10 || i15 < -1 || i15 > i11) {
                    throw o660.a();
                }
                if (i13 == -1) {
                    fArr[i12] = 0.0f;
                } else {
                    if (i13 == i10) {
                        fArr[i12] = i10 - 1;
                    } else {
                        z = false;
                    }
                    if (i15 == -1) {
                        fArr[i14] = 0.0f;
                    } else {
                        if (i15 == i11) {
                            fArr[i14] = i11 - 1;
                        }
                    }
                    z = true;
                }
                z = true;
                if (i15 == -1) {
                    fArr[i14] = 0.0f;
                } else {
                    if (i15 == i11) {
                        fArr[i14] = i11 - 1;
                    }
                }
                z = true;
            }
            boolean z2 = true;
            for (int i16 = i4 - 2; i16 >= 0 && z2; i16 -= 2) {
                int i17 = (int) fArr[i16];
                int i18 = i16 + 1;
                int i19 = (int) fArr[i18];
                if (i17 < -1 || i17 > i10 || i19 < -1 || i19 > i11) {
                    throw o660.a();
                }
                if (i17 == -1) {
                    fArr[i16] = 0.0f;
                } else {
                    if (i17 == i10) {
                        fArr[i16] = i10 - 1;
                    } else {
                        z2 = false;
                    }
                    if (i19 == -1) {
                        fArr[i18] = 0.0f;
                    } else {
                        if (i19 == i11) {
                            fArr[i18] = i11 - 1;
                        }
                    }
                    z2 = true;
                }
                z2 = true;
                if (i19 == -1) {
                    fArr[i18] = 0.0f;
                } else {
                    if (i19 == i11) {
                        fArr[i18] = i11 - 1;
                    }
                }
                z2 = true;
            }
            for (int i20 = 0; i20 < i4; i20 += 2) {
                try {
                    if (r68Var.b((int) fArr[i20], (int) fArr[i20 + 1])) {
                        r68Var2.h(i20 / 2, i5);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw o660.a();
                }
            }
            i5++;
            i3 = i2;
        }
        return r68Var2;
    }

    public static final void k(l0x l0xVar, y3d y3dVar, fet fetVar, int i) {
        long secondary;
        fetVar.g0(-1045745671);
        int i2 = (fetVar.g(l0xVar) ? 4 : 2) | i | (fetVar.g(y3dVar) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Drawable drawable = l0xVar.f19222a;
            if (drawable == null) {
                fetVar.e0(1883641190);
                fetVar.r(false);
            } else {
                fetVar.e0(1883641191);
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = mym0.j(drawable);
                    fetVar.o0(objP);
                }
                pm80 pm80Var = (pm80) objP;
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = o7k0.n(jm40.b, 16.0f);
                if (y3dVar == null) {
                    fetVar.e0(1808683475);
                    secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                    fetVar.r(false);
                } else {
                    fetVar.e0(1808682390);
                    fetVar.r(false);
                    secondary = y3dVar.f41946a;
                }
                dww.c(pm80Var, null, mm40VarN, secondary, fetVar, 56, 0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2i(l0xVar, y3dVar, i, b);
        }
    }

    public static final hen k0(mz40 mz40Var) {
        hen henVar = (hen) CollectionsKt.f0(mz40Var.d());
        if (henVar != null) {
            return henVar;
        }
        iun iunVar = iun.f15405a;
        return new hen(iunVar, iunVar);
    }

    public static final void l(m0x m0xVar, y3d y3dVar, fet fetVar, int i) {
        long secondary;
        fetVar.g0(-1137769053);
        int i2 = (fetVar.g(m0xVar) ? 4 : 2) | i | (fetVar.g(y3dVar) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40.b, 16.0f);
            pm80 pm80VarF = a8k0.F(m0xVar.f20977a, 0, fetVar);
            if (y3dVar == null) {
                fetVar.e0(1820609388);
                secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            } else {
                fetVar.e0(1820608303);
                fetVar.r(false);
                secondary = y3dVar.f41946a;
            }
            dww.c(pm80VarF, null, mm40VarN, secondary, fetVar, 56, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r2i(m0xVar, y3dVar, i, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public static final y9l l0(phh phhVar) {
        i6l i6lVar;
        ?? arrayList;
        List listD0;
        phhVar.getClass();
        Integer num = phhVar.f26996a;
        if (num != null && num.intValue() == 1) {
            i6lVar = i6l.b;
        } else {
            i6lVar = (num != null && num.intValue() == 2) ? i6l.c : i6l.f14245a;
        }
        i6l i6lVar2 = i6lVar;
        List list = phhVar.b;
        if (list == null || (listD0 = CollectionsKt.D0(list, 5)) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(listD0, 10));
            Iterator it = listD0.iterator();
            while (it.hasNext()) {
                arrayList.add(ulb.e0((e1h) it.next(), num));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r4 = arrayList;
        List list2 = phhVar.c;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list3 = list2;
        Integer num2 = phhVar.d;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Integer num3 = phhVar.e;
        int iIntValue2 = num3 != null ? num3.intValue() : 0;
        Integer num4 = phhVar.f;
        int iIntValue3 = num4 != null ? num4.intValue() : 0;
        Integer num5 = phhVar.g;
        return new y9l(i6lVar2, r4, list3, iIntValue, iIntValue2, iIntValue3, num5 != null ? num5.intValue() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void m(mm40 mm40Var, c4i c4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, u3i u3iVar4, Function1 function1, fet fetVar, int i) {
        c4i c4iVar2;
        u3i u3iVar5;
        u3i u3iVar6;
        Function1 function2;
        fet fetVar2;
        ?? r0;
        fet fetVar3;
        fet fetVar4;
        y3d y3dVar = c4iVar.e;
        function1.getClass();
        fetVar.g0(-1411944511);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(c4iVar) ? 32 : 16) | (fetVar.g(u3iVar) ? 256 : 128) | (fetVar.g(u3iVar2) ? 2048 : 1024) | (fetVar.g(u3iVar3) ? 16384 : 8192) | (fetVar.g(u3iVar4) ? 131072 : 65536);
        if ((i & 1572864) == 0) {
            i2 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            zcl zclVar = qmk.f28987a;
            int iB = si30.b(pkd.b(12.0f, fetVar));
            int iB2 = si30.b(pkd.b(8.0f, fetVar));
            int iB3 = si30.b(pkd.b(4.0f, fetVar));
            int iB4 = si30.b(pkd.b(2.0f, fetVar));
            int iB5 = si30.b(pkd.b(40.0f, fetVar));
            int i3 = iB5 / 2;
            mm40 mm40VarE = o7k0.e(mm40Var, 40.0f);
            int i4 = i2 & 896;
            boolean zE = ((i2 & 112) == 32) | (i4 == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | fetVar.e(iB) | fetVar.e(iB4) | fetVar.e(iB3) | fetVar.e(iB2) | fetVar.e(iB5) | fetVar.e(i3);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                r0 = 0;
                objP = new w2i(c4iVar, u3iVar, u3iVar2, u3iVar3, u3iVar4, iB, iB4, iB3, iB2, iB5, i3);
                c4iVar2 = c4iVar;
                u3iVar5 = u3iVar;
                u3iVar6 = u3iVar2;
                fetVar.o0(objP);
            } else {
                c4iVar2 = c4iVar;
                u3iVar5 = u3iVar;
                u3iVar6 = u3iVar2;
                r0 = 0;
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            o0x o0xVar = c4iVar2.c;
            if (o0xVar == null || !c4iVar2.b) {
                fetVar.e0(-134110696);
                fetVar.r(r0);
            } else {
                fetVar.e0(-134177005);
                o(r0, fetVar);
                fetVar.r(r0);
            }
            if (o0xVar != null) {
                fetVar.e0(-134015774);
                if (o0xVar instanceof m0x) {
                    fetVar.e0(1658246381);
                    l((m0x) o0xVar, y3dVar, fetVar, r0);
                    fetVar.r(r0);
                } else {
                    if (o0xVar instanceof l0x) {
                        fetVar.e0(1658254226);
                        k((l0x) o0xVar, y3dVar, fetVar, r0);
                        fetVar.r(r0);
                    } else {
                        if (!(o0xVar instanceof n0x)) {
                            throw b1j.f(1658244896, fetVar, r0);
                        }
                        fetVar.e0(-133482016);
                        fet fetVar5 = fetVar;
                        u7x.q(null, (n0x) o0xVar, 16.0f, c4iVar2.e, c4iVar2.f, c4iVar2.d, fetVar5, 0, 1);
                        fetVar5.r(r0);
                        fetVar4 = fetVar5;
                    }
                    fetVar4.r(r0);
                    fetVar3 = fetVar4;
                }
                fetVar4 = fetVar;
                fetVar4.r(r0);
                fetVar3 = fetVar4;
            } else {
                u3iVar3 = u3iVar3;
                fet fetVar6 = fetVar;
                u3iVar4 = u3iVar4;
                fetVar6.e0(-133088936);
                fetVar6.r(r0);
                fetVar3 = fetVar6;
            }
            i(r0, fetVar3, null, c4iVar2.f3727a);
            if (u3iVar5 instanceof v3i) {
                fetVar3.e0(-132868278);
                v3i v3iVar = (v3i) u3iVar5;
                h(null, v3iVar.f36733a instanceof d2i, v3iVar, function1, fetVar3, i4 | ((i2 >> 9) & 7168));
                function2 = function1;
                fetVar3.r(r0);
            } else {
                function2 = function1;
                fetVar3.e0(-132516552);
                fetVar3.r(r0);
            }
            if (u3iVar6 instanceof z3i) {
                fetVar3.e0(-132415647);
                j(null, (z3i) u3iVar6, function2, fetVar3, ((i2 >> 6) & 112) | ((i2 >> 12) & 896));
                fetVar3.r(r0);
            } else {
                fetVar3.e0(-132209032);
                fetVar3.r(r0);
            }
            if (u3iVar3 instanceof x3i) {
                fetVar3.e0(-132117520);
                y(null, (x3i) u3iVar3, function2, fetVar3, ((i2 >> 9) & 112) | ((i2 >> 12) & 896));
                fetVar3.r(r0);
            } else {
                fetVar3.e0(-131956072);
                fetVar3.r(r0);
            }
            if (u3iVar4 instanceof s3i) {
                fetVar3.e0(-131861398);
                g(null, (s3i) u3iVar4, function2, fetVar3, (i2 >> 12) & 1008);
                fetVar3.r(r0);
            } else {
                fetVar3.e0(-131663432);
                fetVar3.r(r0);
            }
            fetVar3.r(true);
            fetVar2 = fetVar3;
        } else {
            c4iVar2 = c4iVar;
            u3iVar5 = u3iVar;
            u3iVar6 = u3iVar2;
            u3iVar3 = u3iVar3;
            fet fetVar7 = fetVar;
            u3iVar4 = u3iVar4;
            function2 = function1;
            fetVar7.X();
            fetVar2 = fetVar7;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) mm40Var, (Object) c4iVar2, (Object) u3iVar5, (Object) u3iVar6, (Object) u3iVar3, (Object) u3iVar4, (Object) function2, i, (byte) 5);
        }
    }

    public static final EventItem m0(su6 su6Var, String str, q4f q4fVar) {
        lvn lvnVar;
        su6Var.getClass();
        str.getClass();
        long j = su6Var.f32807a;
        String str2 = su6Var.b;
        double d = su6Var.d;
        String str3 = su6Var.e;
        long j2 = su6Var.f;
        boolean z = su6Var.g;
        long j3 = su6Var.h;
        long j4 = su6Var.i;
        String str4 = su6Var.j;
        switch (su6Var.k.ordinal()) {
            case 0:
                lvnVar = lvn.NONE;
                break;
            case 1:
                lvnVar = lvn.LOST;
                break;
            case 2:
                lvnVar = lvn.WIN;
                break;
            case 3:
                lvnVar = lvn.RETURN_FULL;
                break;
            case 4:
                lvnVar = lvn.RETURN;
                break;
            case 5:
                lvnVar = lvn.WIN_RETURN_HALF;
                break;
            case 6:
                lvnVar = lvn.RETURN_HALF;
                break;
            case 7:
                lvnVar = lvn.RESULT;
                break;
            default:
                t9f.b();
                return null;
        }
        return new EventItem(j, str2, d, str3, j2, z, j3, j4, str4, lvnVar, su6Var.l, su6Var.m, su6Var.n, su6Var.o, su6Var.p, su6Var.q, su6Var.r, su6Var.s, su6Var.t, su6Var.u, su6Var.v, su6Var.x, su6Var.y, su6Var.k1, su6Var.m1, str, su6Var.z, q4fVar, su6Var.A, su6Var.B, su6Var.Y, su6Var.f1, su6Var.g1, su6Var.h1, su6Var.i1, su6Var.j1, 0.0d, new EventParams(su6Var.t1, su6Var.u1));
    }

    public static final void n(mm40 mm40Var, final int i, final boolean z, final Function0 function0, fet fetVar, final int i2, final int i3) {
        mm40 mm40Var2;
        int i4;
        mm40 mm40Var3;
        long secondary20;
        fetVar.g0(-1487742800);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar.i(function0) ? 2048 : 1024;
        }
        int i6 = i4;
        if (fetVar.U(i6 & 1, (i6 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40Var3 = i5 != 0 ? jm40Var : mm40Var2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(o7k0.s(o7k0.e(mm40Var3, 32.0f), 40.0f), 4.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarW = y860.W(i120.Q(mm40VarJ, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), vgg0.f37379a), null, null, z, null, function0, 24);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            mm40 mm40VarK = s5x0.K(jm40Var, 8.0f, 4.0f);
            pm80 pm80VarF = a8k0.F(i, (i6 >> 3) & 14, fetVar);
            if (z) {
                fetVar.e0(-282635823);
                secondary20 = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
            } else {
                fetVar.e0(-282634827);
                secondary20 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary20();
            }
            fetVar.r(false);
            dww.c(pm80VarF, null, mm40VarK, secondary20, fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final mm40 mm40Var4 = mm40Var3;
            yfe0VarU.d = new Function2() { // from class: a.u2i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ebc.n(mm40Var4, i, z, function0, (fet) obj, x8x.L(i2 | 1), i3 ? 1 : 0);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final uid n0(bem bemVar) {
        bemVar.getClass();
        if (bemVar instanceof tdm) {
            tdm tdmVar = (tdm) bemVar;
            return new lid(tdmVar.f33775a, tdmVar.b, tdmVar.c, tdmVar.d);
        }
        if (bemVar instanceof vdm) {
            vdm vdmVar = (vdm) bemVar;
            return new mid(vdmVar.f37239a, vdmVar.b, vdmVar.c, vdmVar.d);
        }
        if (bemVar instanceof sdm) {
            return new kid(((sdm) bemVar).f32040a);
        }
        if (bemVar instanceof wdm) {
            return new pid(((wdm) bemVar).f38979a);
        }
        if (bemVar instanceof zdm) {
            return new oid(((zdm) bemVar).f44219a);
        }
        if (!(bemVar instanceof ydm)) {
            if (bemVar instanceof aem) {
                return new rid(((aem) bemVar).f736a);
            }
            if (bemVar instanceof rdm) {
                return jid.f16569a;
            }
            if (bemVar instanceof udm) {
                return new qid(((udm) bemVar).f35486a);
            }
            if (bemVar instanceof xdm) {
                return iid.f14824a;
            }
            t9f.b();
            return null;
        }
        ydm ydmVar = (ydm) bemVar;
        long j = ydmVar.f42445a;
        f2i f2iVar = ydmVar.c.f36733a;
        if (f2iVar.equals(c2i.f3624a)) {
            return new sid(j);
        }
        if (f2iVar instanceof d2i) {
            return new nid(j);
        }
        if (f2iVar.equals(e2i.f7087a)) {
            return new tid(j);
        }
        t9f.b();
        return null;
    }

    public static final void o(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-1638946077);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_popular, 0, fetVar), null, o7k0.n(jm40.b, 16.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), fetVar2, 56, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuh(i, (byte) 6);
        }
    }

    public static final void p(mm40 mm40Var, rrk rrkVar, qdz qdzVar, Function0 function0, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        rrkVar.getClass();
        String str = rrkVar.f30988a;
        qdzVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(1386933387);
        int i2 = i | 6 | (fetVar2.g(rrkVar) ? 32 : 16) | (fetVar2.g(qdzVar) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar2.b0(1403132579, str);
            xcz xczVarB = qdzVar.b(str, new svj((byte) 19), fetVar2, i2 & 896);
            fetVar2.r(false);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.l;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(h97.e(zclVar, zclVar, zclVar, zclVar, i120.Q(jm40Var, backgroundContent, ugg0Var2)), 0.0f, 8.0f, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            mm40 mm40VarE = o7k0.e(jm40Var, 40.0f);
            b8m b8mVar = rrkVar.c;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            r7m r7mVar = new r7m(textPrimary, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary());
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new b1i(function0, (byte) 15);
                fetVar2.o0(objP);
            }
            wwb.j(mm40VarE, b8mVar, 16.0f, r7mVar, (Function0) objP, fetVar2, 0, 16);
            fetVar2 = fetVar2;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            enh enhVar = rrkVar.d;
            boolean z2 = (i2 & 57344) == 16384;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ynk(function1, (byte) 4);
                fetVar2.o0(objP2);
            }
            nkb.e(mm40VarN, xczVarB, enhVar, (Function1) objP2, fetVar2, 0);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var2, (p6t0) rrkVar, qdzVar, function0, (wdr) function1, i, (byte) 3);
        }
    }

    public static final void q(mm40 mm40Var, fw1 fw1Var, fet fetVar, int i) {
        int i2;
        fw1 fw1Var2;
        byte b;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-258117977);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(fw1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(null) ? 256 : 128;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            fw1Var2 = fw1Var;
            b = 0;
            mm40Var2 = mm40Var;
            fetVar2.X();
        } else if (fw1Var instanceof dw1) {
            fetVar2.e0(-1600784137);
            ((hi0) fetVar2.k(ii0.f14805a)).getClass();
            long j = hi0.r;
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40Var, j, new ugg0(zclVar, zclVar, zclVar, zclVar));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new knl(fw1Var, (byte) 6);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28), "DS_AGGREGATOR_TOURNAMENT_PRIZE_POOL_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            dw1 dw1Var = (dw1) fw1Var;
            n0x n0xVar = dw1Var.j;
            fetVar2.e0(-1687335786);
            jm40 jm40Var = jm40.b;
            k7x.a(n0xVar.a(), null, o2e.e0(jr8.f16991a.a(dw9.i(zclVar, zclVar, zclVar, zclVar, jm40Var)), "DS_AGGREGATOR_TOURNAMENT_PRIZE_BANNER_IMAGE"), gqw0.A, null, fetVar2, 1572912, 1976);
            fetVar2.r(false);
            mm40 mm40VarK = s5x0.K(jm40Var, 16.0f, 8.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            String str = dw1Var.b;
            zfn zfnVar = m8m0.f21378a;
            v8q0.a(str, mm40VarN, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, true, 1, 0, null, g1t0.g(), fetVar, 0, 28032, 102392);
            v8q0.a(dw1Var.c, o7k0.g(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), 20.0f, 0.0f, 2), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), new n05(qmk.q, qmk.y, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, true, 1, 0, null, y9q0.a(g1t0.s(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 28032, 102384);
            v8q0.a(dw1Var.f6773a == bw1.b ? dw1Var.i : w6x.q(dw1Var.e, " - ", dw1Var.g), o2e.e0(o7k0.d(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 1.0f), "DS_AGGREGATOR_TOURNAMENT_PRIZE_DATE_TEXT"), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, true, 2, 0, null, g1t0.a(), fetVar, 0, 28032, 101368);
            fetVar2 = fetVar;
            b = 0;
            ohs0.x(fetVar2, true, true, false);
            mm40Var2 = mm40Var;
            fw1Var2 = fw1Var;
        } else {
            b = 0;
            fw1Var2 = fw1Var;
            if (!fw1Var2.equals(ew1.f8498a)) {
                throw b1j.f(1056738409, fetVar2, false);
            }
            fetVar2.e0(-1597302744);
            mm40Var2 = mm40Var;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var2 = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar2, 0, 1), fetVar2, 0, false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jql(mm40Var2, fw1Var2, i, b);
        }
    }

    public static final void r(mm40 mm40Var, hyl hylVar, vxl vxlVar, Function1 function1, Function1 function2, fet fetVar, int i, int i2) {
        Function1 function3;
        Function1 function4;
        hylVar.getClass();
        mm40 mm40Var2 = (i2 & 1) != 0 ? jm40.b : mm40Var;
        vxl vxlVar2 = (i2 & 4) != 0 ? vxl.f38204a : vxlVar;
        boolean z = (i2 & 8) != 0;
        int i3 = i2 & 16;
        cl5 cl5Var = ukd.f35823a;
        if (i3 != 0) {
            Object objP = fetVar.P();
            if (objP == cl5Var) {
                objP = new xjl((byte) 13);
                fetVar.o0(objP);
            }
            function3 = (Function1) objP;
        } else {
            function3 = function1;
        }
        if ((i2 & 32) != 0) {
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new xjl((byte) 14);
                fetVar.o0(objP2);
            }
            function4 = (Function1) objP2;
        } else {
            function4 = function2;
        }
        if (!(hylVar instanceof fyl)) {
            if (!(hylVar instanceof gyl)) {
                throw b1j.f(-1297803374, fetVar, false);
            }
            fetVar.e0(-1576588879);
            gyl gylVar = (gyl) hylVar;
            mm40 mm40Var3 = mm40Var2;
            syl sylVar = gylVar.f12135a;
            hh80 hh80VarT = gylVar.b;
            if (hh80VarT == null) {
                fetVar.e0(-1297779091);
                hh80VarT = s5x0.t(xfn.a(fetVar).d, 0.0f, 2);
            } else {
                fetVar.e0(-1297779897);
            }
            fetVar.r(false);
            vcc.a(mm40Var3, hh80VarT, sylVar, vxlVar2, fetVar, (i & 14) | ((i << 3) & 7168));
            fetVar.r(false);
            return;
        }
        fetVar.e0(-1577159403);
        fyl fylVar = (fyl) hylVar;
        a4x a4xVar = fylVar.f10362a;
        hh80 hh80VarT2 = fylVar.d;
        if (hh80VarT2 == null) {
            fetVar.e0(-1297797299);
            hh80VarT2 = s5x0.t(xfn.a(fetVar).d, 0.0f, 2);
        } else {
            fetVar.e0(-1297798105);
        }
        fetVar.r(false);
        mm40 mm40Var4 = mm40Var2;
        vxl vxlVar3 = vxlVar2;
        hh80 hh80Var = hh80VarT2;
        tyl tylVar = fylVar.b;
        syl sylVar2 = fylVar.c;
        jyl jylVar = fylVar.e;
        if (jylVar == null) {
            fetVar.e0(-1297789771);
            jylVar = new jyl(null, null, null);
        } else {
            fetVar.e0(-1297791135);
        }
        fetVar.r(false);
        int i4 = i << 12;
        lcc.b(mm40Var4, a4xVar, vxlVar3, tylVar, sylVar2, jylVar, hh80Var, z, function3, function4, fetVar, (i4 & 1879048192) | (i & 910) | (29360128 & i4) | (234881024 & i4), 0);
        fetVar.r(false);
    }

    public static final void s(mm40 mm40Var, eqm eqmVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        boolean z;
        long secondary;
        fet fetVar2 = fetVar;
        fetVar2.g0(576744488);
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
        int i5 = i3 | (fetVar2.g(eqmVar) ? 32 : 16);
        if (fetVar2.U(i5 & 1, (i5 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var2, 24.0f), 28.0f);
            zfn zfnVar = zaq0.b;
            long backgroundLight60 = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundLight60();
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarS, backgroundLight60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (eqmVar instanceof cqm) {
                fetVar2.e0(-1859693311);
                cqm cqmVar = (cqm) eqmVar;
                pm80 pm80VarF = a8k0.F(cqmVar.f4801a, 0, fetVar2);
                y3d y3dVar = cqmVar.b;
                fetVar2.e0(-198531332);
                fetVar2.r(false);
                dww.c(pm80VarF, null, o7k0.n(jm40Var, 24.0f), y3dVar.f41946a, fetVar2, 56, 0);
                fetVar2.r(false);
                z = true;
            } else if (eqmVar instanceof dqm) {
                fetVar2.e0(-1859299022);
                dqm dqmVar = (dqm) eqmVar;
                String str = dqmVar.f6523a;
                y3d y3dVar2 = dqmVar.b;
                if (y3dVar2 == null) {
                    fetVar2.e0(-198521705);
                    secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-198522852);
                    fetVar2.r(false);
                    secondary = y3dVar2.f41946a;
                }
                z = true;
                v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                if (!eqmVar.equals(bqm.f3038a)) {
                    throw b1j.f(-198539383, fetVar2, false);
                }
                fetVar2.e0(-1859001422);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            mm40Var2 = mm40Var2;
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aqm(mm40Var2, eqmVar, i, i2, (byte) 1);
        }
    }

    public static final void t(mm40 mm40Var, qwm qwmVar, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        String str = qwmVar.d;
        String str2 = qwmVar.f29441a;
        fetVar.g0(755668407);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(qwmVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (qwmVar.h) {
                fetVar.e0(347872190);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(347873114);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40Var, 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            if (str2.length() <= 0 && str.length() <= 0) {
                fetVar.e0(-38575007);
                fetVar.r(false);
            } else {
                fetVar.e0(-38769129);
                I(0, fetVar, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 4.0f, 7), str2, str);
                fetVar.r(false);
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-289279935, new i3l(qwmVar, (byte) 29), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 9, i, mm40Var, qwmVar);
        }
    }

    public static final void u(mm40 mm40Var, z0n z0nVar, z0n z0nVar2, p0n p0nVar, sem semVar, String str, String str2, String str3, String str4, xem xemVar, fet fetVar, int i) {
        int i2;
        z0n z0nVar3;
        p0n p0nVar2;
        String str5;
        boolean z;
        fet fetVar2 = fetVar;
        brm0.B(str, str3, str4);
        fetVar2.g0(-1251290285);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(z0nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z0nVar3 = z0nVar2;
            i2 |= fetVar2.g(z0nVar3) ? 256 : 128;
        } else {
            z0nVar3 = z0nVar2;
        }
        if ((i & 3072) == 0) {
            p0nVar2 = p0nVar;
            i2 |= fetVar2.g(p0nVar2) ? 2048 : 1024;
        } else {
            p0nVar2 = p0nVar;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(semVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.g(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            str5 = str2;
            i2 |= fetVar2.g(str5) ? 1048576 : 524288;
        } else {
            str5 = str2;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar2.g(str3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar2.g(str4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= fetVar2.g(xemVar) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (306783379 & i3) != 306783378)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 58.0f), 12.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (semVar.equals(pem.f26861a) || semVar.equals(qem.f28591a)) {
                fetVar2.e0(1405348372);
                z = false;
                jeb.r(s5x0.N(s5x0.L(jm40.b, 4.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), semVar instanceof pem ? bhm.f2615a : bhm.b, fetVar2, 0);
                fetVar2.r(false);
            } else {
                if (!semVar.equals(rem.f30342a)) {
                    throw b1j.f(-370313207, fetVar2, false);
                }
                fetVar2.e0(-370291269);
                z = false;
                fetVar2.r(false);
            }
            boolean z2 = z;
            N(new x7z(1.0f, true), z0nVar, z0nVar3, p0nVar2, str, fetVar2, (i3 & 8176) | ((i3 >> 3) & 57344));
            if (xemVar.equals(uem.f35536a)) {
                fetVar2.e0(1406272203);
                fetVar2.r(z2);
            } else {
                fetVar2.e0(1406198206);
                z(null, xemVar, fetVar2, (i3 >> 24) & 112);
                fetVar2.r(z2);
            }
            int i4 = i3 << 9;
            U(null, str5, str3, str4, z0nVar, z0nVar2, fetVar2, ((i3 >> 15) & 8176) | (i4 & 57344) | (i4 & 458752));
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ej4(mm40Var, z0nVar, z0nVar2, p0nVar, semVar, str, str2, str3, str4, xemVar, i, (byte) 3);
        }
    }

    public static final void v(m8o0 m8o0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-162318978);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(m8o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = twn.s(fetVar);
            }
            List list = (List) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = m5o.f21230a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4) | fetVar.i(list);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new f8m((Object) context, (Object) m8o0Var, (Object) list, (byte) 9);
                fetVar.o0(objP3);
            }
            y860.f(xdrVar, null, (Function1) objP3, fetVar, 6, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(m8o0Var, i, (byte) 6);
        }
    }

    public static final void w(mm40 mm40Var, String str, ggm ggmVar, v3n v3nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1991724819);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(ggmVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(v3nVar) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            int i3 = (i2 >> 6) & 112;
            xbc.t(((i2 << 3) & 896) | i3, v3nVar, fetVar, null, str);
            if (ggmVar == ggm.f11256a || ggmVar == ggm.d) {
                fetVar.e0(-1756367575);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                E(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), v3nVar, fetVar, i3);
                fetVar.r(false);
            } else {
                fetVar.e0(-1756190565);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                qxw.o(fetVar, new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new clw(mm40Var, str, ggmVar, v3nVar, i, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void x(mm40 mm40Var, final cuo cuoVar, final Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(-2036853230);
        int i2 = i | 6 | (fetVar2.g(cuoVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        final byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean zF = fetVar2.f(backgroundContent);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = new nme((byte) 24, backgroundContent);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarD, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarK, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP2;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z2 = (i3 == 256) | (i4 == 32);
            Object objP3 = fetVar2.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new Function0() { // from class: a.buo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = b;
                        cuo cuoVar2 = cuoVar;
                        Function1 function2 = function1;
                        switch (b2) {
                            case 0:
                                String str = cuoVar2.b;
                                str.getClass();
                                function2.invoke(new e27(str));
                                break;
                            default:
                                String str2 = cuoVar2.b;
                                str2.getClass();
                                function2.invoke(new g27(str2));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP3);
            }
            mm40 mm40VarW = y860.W(mm40VarN, gy40Var, null, false, null, (Function0) objP3, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            mm40 mm40VarN2 = s5x0.N(jm40Var, 12.0f, 0.0f, 8.0f, 4.0f, 2);
            String str = cuoVar.c;
            wm7 wm7Var = cuoVar.d;
            a4x a4xVar = cuoVar.e;
            yto ytoVar = cuoVar.f;
            yto ytoVar2 = cuoVar.g;
            boolean z3 = (i3 == 256) | (i4 == 32);
            Object objP4 = fetVar2.P();
            if (z3 || objP4 == cl5Var) {
                objP4 = new qzn(function1, cuoVar, (byte) 26);
                fetVar2.o0(objP4);
            }
            kbc.r(mm40VarN2, str, wm7Var, a4xVar, ytoVar, ytoVar2, (Function1) objP4, fetVar2, 0);
            fetVar2 = fetVar;
            ibc.t(s5x0.N(jm40Var, 12.0f, 0.0f, 12.0f, 0.0f, 10), cuoVar.i, cuoVar.j, cuoVar.k, cuoVar.l, cuoVar.m, cuoVar.n, fetVar2, 0);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 8.0f, 8.0f, 8.0f, 0.0f, 8);
            l3w l3wVar = cuoVar.o;
            wul wulVar = cuoVar.h;
            boolean z4 = (i3 == 256) | (i4 == 32);
            Object objP5 = fetVar2.P();
            if (z4 || objP5 == cl5Var) {
                z = true;
                final char c = 1 == true ? 1 : 0;
                objP5 = new Function0() { // from class: a.buo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = c;
                        cuo cuoVar2 = cuoVar;
                        Function1 function2 = function1;
                        switch (b2) {
                            case 0:
                                String str2 = cuoVar2.b;
                                str2.getClass();
                                function2.invoke(new e27(str2));
                                break;
                            default:
                                String str3 = cuoVar2.b;
                                str3.getClass();
                                function2.invoke(new g27(str3));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP5);
            } else {
                z = true;
            }
            sac.u(mm40VarN3, l3wVar, wulVar, (Function0) objP5, fetVar2, 0);
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var2, cuoVar, function1, i, (byte) 12);
        }
    }

    public static final void y(mm40 mm40Var, x3i x3iVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        fetVar.g0(-1355047530);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= fetVar.g(x3iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int iOrdinal = x3iVar.f40219a.ordinal();
            if (iOrdinal == 0) {
                i2 = R.drawable.ic_glyph_favourite_active;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                i2 = R.drawable.ic_glyph_favourite_inactive;
            }
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new l2i(function1, x3iVar, (byte) 2);
                fetVar.o0(objP);
            }
            int i4 = i2;
            jm40 jm40Var = jm40.b;
            n(jm40Var, i4, true, (Function0) objP, fetVar, (i3 & 14) | 384, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g2i(mm40Var2, x3iVar, function1, i, (byte) 2);
        }
    }

    public static final void z(mm40 mm40Var, xem xemVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1109664765);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xemVar) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(s5x0.N(o7k0.e(jm40Var, 50.0f), 2.0f, 0.0f, 0.0f, 0.0f, 14), 6.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
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
            mm40 mm40VarE = o7k0.e(jm40Var, 14.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            if (xemVar instanceof vem) {
                fetVar.e0(1211456777);
                ozb.t(0, 1, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(1211510593);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
            mm40 mm40VarE2 = o7k0.e(mm40Var2, 14.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            if (xemVar instanceof wem) {
                fetVar.e0(751455232);
                ozb.t(0, 1, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(751509048);
                fetVar.r(false);
            }
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1n(mm40Var2, xemVar, i, b);
        }
    }
}
