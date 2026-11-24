package a;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.ExpandBtnView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.GameScreenToolbarView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wvb {
    public static final void A(mm40 mm40Var, long j, long j2, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1123468174);
        int i2 = i | 48 | (fetVar.d(16.0f) ? 256 : 128) | (fetVar.f(j) ? 2048 : 1024) | (fetVar.f(j2) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, jr8.f16991a.b(i120.P(o7k0.e(mm40VarD, 128.0f), yk5.n(q3d.j(new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU()), new y3d(j), new y3d(j2)), 0.0f, Float.POSITIVE_INFINITY, 8), vgg0.a(16.0f), 4), gqw0.h));
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hzh(mm40Var2, j, j2, i, (byte) 0);
        }
    }

    public static final void B(final bew bewVar, final Function1 function1, fet fetVar, final int i) {
        final byte b;
        yfe0 yfe0VarU;
        Function2 function2;
        fet fetVar2 = fetVar;
        bewVar.getClass();
        a4x a4xVar = bewVar.b;
        function1.getClass();
        fetVar2.g0(115109313);
        int i2 = (fetVar2.g(bewVar) ? 4 : 2) | i | (fetVar2.i(function1) ? 32 : 16);
        final byte b2 = 0;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar2.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    function2 = new Function2(bewVar, function1, i, b2) { // from class: a.aew

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f749a;
                        public final /* synthetic */ bew b;
                        public final /* synthetic */ Function1 c;

                        {
                            this.f749a = b2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.f749a;
                            fet fetVar3 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    wvb.B(this.b, this.c, fetVar3, x8x.L(1));
                                    break;
                                default:
                                    wvb.B(this.b, this.c, fetVar3, x8x.L(1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
            } else {
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
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
                nkb.h(s5x0.N(jm40Var, xfn.a(fetVar2).e, 8.0f, xfn.a(fetVar2).e, 0.0f, 8), bewVar.f2471a, kjm.f18392a, null, null, null, fetVar, 384, 56);
                fetVar2 = fetVar;
                fetVar2.e0(-1179377505);
                int i3 = 0;
                for (Object obj : a4xVar) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        q3d.p();
                        throw null;
                    }
                    jfw jfwVar = (jfw) obj;
                    int i5 = jfwVar.f16449a.f19148a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i5);
                    sb.append(i3);
                    fetVar2.b0(-1028780790, sb.toString());
                    mm40 mm40VarD2 = o7k0.d(s5x0.L(jm40Var, xfn.a(fetVar2).c, 0.0f, 2), 1.0f);
                    kzc0 kzc0Var = jfwVar.f16449a;
                    ma80 ma80Var = ma80.f21447a;
                    gzc0 gzc0Var = new gzc0();
                    boolean zG = ((i2 & 112) == 32) | fetVar2.g(jfwVar);
                    Object objP = fetVar2.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new sjs(function1, jfwVar, (byte) 15);
                        fetVar2.o0(objP);
                    }
                    uzb.t(mm40VarD2, kzc0Var, gzc0Var, null, (Function2) objP, fetVar2, 3456);
                    fetVar2.r(false);
                    i3 = i4;
                }
                fetVar2.r(false);
                b = 1;
                fetVar2.r(true);
            }
            yfe0VarU.d = function2;
        }
        b = 1;
        fetVar2.X();
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            function2 = new Function2(bewVar, function1, i, b) { // from class: a.aew

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f749a;
                public final /* synthetic */ bew b;
                public final /* synthetic */ Function1 c;

                {
                    this.f749a = b;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    byte b3 = this.f749a;
                    fet fetVar3 = (fet) obj2;
                    ((Integer) obj3).getClass();
                    switch (b3) {
                        case 0:
                            wvb.B(this.b, this.c, fetVar3, x8x.L(1));
                            break;
                        default:
                            wvb.B(this.b, this.c, fetVar3, x8x.L(1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void C(int i, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-209015740);
        int i2 = i | 6;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(mm40Var2, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(mm40Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f), 152.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            g1x.l(o7k0.d(mm40Var2, 1.0f), qjj.b, fetVar, 54, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var2, z, i, (byte) 28);
        }
    }

    public static final void D(mm40 mm40Var, jvm jvmVar, boolean z, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        String str = jvmVar.d;
        fetVar2.g0(-1377936880);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(jvmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            xx7 xx7Var = z ? gqw0.m : gqw0.o;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 0);
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
            String str2 = jvmVar.f17209a;
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar = zaq0.b;
            v8q0.a(str2, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar2, 0, 24960, 110586);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(158330950, new i3l(jvmVar, (byte) 25), fetVar2), fetVar2, 56);
            if (str.length() > 0) {
                fetVar2.e0(-1138135970);
                v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, 0, 24960, 110586);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                fetVar2.e0(-1137881956);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 16, i, mm40Var, (Object) jvmVar, z);
        }
    }

    public static final void E(mm40 mm40Var, jvm jvmVar, jvm jvmVar2, a2m a2mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(88016077);
        int i2 = i | 6 | (fetVar.g(jvmVar) ? 32 : 16) | (fetVar.g(jvmVar2) ? 256 : 128) | (fetVar.g(a2mVar) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = q8a.k0(o7k0.d(jm40Var, 1.0f), enx.b);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            D(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), jvmVar, true, fetVar, (i2 & 112) | 384);
            c(null, a2mVar, z, fetVar, (i2 >> 6) & 1008);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            D(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), jvmVar2, false, fetVar, ((i2 >> 3) & 112) | 384);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 12, i, mm40Var2, (Object) jvmVar, (Object) jvmVar2, (Object) a2mVar, z);
        }
    }

    public static final void F(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-607459519);
        boolean z = false;
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 32.0f, 0.0f, 0.0f, 13), 152.0f), 12.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 1.0f), 110.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 29);
        }
    }

    public static final void G(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, boolean z) {
        k6z k6zVar;
        fetVar.g0(2080639451);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                fetVar.e0(-1960240446);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1960239522);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-1107784037, new eup(a4xVar), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fup(mm40Var, a4xVar, z, i);
        }
    }

    public static final void H(mm40 mm40Var, ynh ynhVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1386957542);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ynhVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 32.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = lgb.J(mm40VarN, ugg0Var);
            zfn zfnVar = zaq0.b;
            uc9.c(i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), ugg0Var), s5x0.J(i120.Q(lgb.J(o7k0.n(jm40Var, 32.0f), ugg0Var), ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), ugg0Var), 4.0f), ynhVar.b, Integer.valueOf(R.drawable.ic_glyph_placeholder_player), new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary60()), null, null, gqw0.B, null, fetVar2, 12582912, 352);
            v8q0.a(ynhVar.f42940a, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, ynhVar, i, (byte) 6);
        }
    }

    public static final void I(mm40 mm40Var, aoh aohVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_circle_globe);
        fetVar2.g0(-323870810);
        int i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i | (fetVar2.g(aohVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            o0x o0xVarY = Y(aohVar.f1200a, fetVar2);
            o0x o0xVarY2 = Y(aohVar.b, fetVar2);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar2, 54);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
            mm40 mm40VarN2 = o7k0.n(jm40Var, 24.0f);
            zfn zfnVar = zaq0.b;
            y3d y3dVar = new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary60());
            pge pgeVar = gqw0.B;
            uc9.c(mm40VarN, mm40VarN2, o0xVarY, numValueOf, y3dVar, null, null, pgeVar, null, fetVar2, 12582912, 352);
            dww.c(a8k0.F(R.drawable.ic_glyph_arrow_right, 0, fetVar2), null, s5x0.N(jm40Var, 8.0f, 0.0f, 8.0f, 0.0f, 10), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            fetVar2 = fetVar;
            uc9.c(o7k0.n(jm40Var, 24.0f), o7k0.n(jm40Var, 24.0f), o0xVarY2, numValueOf, new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary60()), null, null, pgeVar, null, fetVar2, 12582912, 352);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, aohVar, i, (byte) 5);
        }
    }

    public static final void J(mm40 mm40Var, int i, hh80 hh80Var, ow3 ow3Var, sw3 sw3Var, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        sw3 sw3Var2;
        fetVar.g0(837417134);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(hh80Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(ow3Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            sw3Var2 = sw3Var;
            i3 |= fetVar.g(sw3Var2) ? 16384 : 8192;
        } else {
            sw3Var2 = sw3Var;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(ugdVar) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            k6z k6zVar = (k6z) fetVar.k(bmd.n);
            boolean zE = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((i3 & 896) == 256) | fetVar.e(k6zVar.ordinal());
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                aol aolVar = new aol(ow3Var, sw3Var2, i, hh80Var, k6zVar);
                fetVar.o0(aolVar);
                objP = aolVar;
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            int i4 = (((((i3 << 3) & 112) | ((i3 >> 15) & 14)) << 6) & 896) | 6;
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
            twn.v((i4 >> 6) & 14, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xnl(mm40Var, i, hh80Var, ow3Var, sw3Var, ugdVar, i2);
        }
    }

    public static final BigDecimal L(String str) {
        str.getClass();
        BigDecimal bigDecimalH = kotlin.text.b.h(str);
        if (bigDecimalH != null) {
            return bigDecimalH;
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        return bigDecimal;
    }

    public static final double N(float f) {
        return new BigDecimal(String.valueOf(f)).doubleValue();
    }

    public static final double O(String str) {
        str.getClass();
        Double dI = kotlin.text.b.i(str);
        if (dI != null) {
            return dI.doubleValue();
        }
        return 0.0d;
    }

    public static final int P(b0i b0iVar, fet fetVar) {
        float fE = pkd.e((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32), fetVar);
        int iOrdinal = b0iVar.b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    t9f.b();
                    return 0;
                }
                if (b0iVar.f1765a == sh1.c) {
                    if (fE >= 360.0f) {
                        if (fE >= 560.0f) {
                            return 4;
                        }
                    }
                } else if (fE >= 560.0f) {
                    return 4;
                }
                return 2;
            }
            if (fE < 560.0f) {
                return 2;
            }
        } else if (fE >= 560.0f) {
            return 4;
        }
        return 3;
    }

    public static final gbn Q(Function1 function1) {
        return new gbn(new p1h((byte) 0), new pue(3, (byte) 14), new omf(function1, (byte) 24), fpd.A);
    }

    public static Drawable R(int i, Context context) {
        context.getClass();
        Drawable drawable = context.getDrawable(i);
        if (drawable == null) {
            return null;
        }
        drawable.mutate();
        drawable.setTint(m5d.b(R.attr.uikitSecondary, context));
        return drawable;
    }

    public static final String S(vw4 vw4Var, BetHistoryScreenModel betHistoryScreenModel) {
        z0w z0wVar = (z0w) CollectionsKt.firstOrNull(vw4Var.T);
        String str = z0wVar != null ? z0wVar.C : null;
        if (str == null) {
            str = "";
        }
        String str2 = z0wVar != null ? z0wVar.w : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = z0wVar != null ? z0wVar.B : null;
        if (str3 == null) {
            str3 = "";
        }
        StringBuilder sb = new StringBuilder();
        if (str.length() > 0) {
            sb.append(str);
        }
        if (str3.length() > 0 && !(betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory)) {
            String str4 = sb.length() > 0 ? ". " : null;
            if (str4 == null) {
                str4 = "";
            }
            sb.append(str4.concat(str3));
        }
        if (str2.length() > 0) {
            String str5 = sb.length() > 0 ? ". " : null;
            sb.append((str5 != null ? str5 : "").concat(str2));
        }
        return sb.toString();
    }

    public static final String T(kzv kzvVar, BetHistoryScreenModel betHistoryScreenModel) {
        kzvVar.getClass();
        betHistoryScreenModel.getClass();
        z0w z0wVar = (z0w) CollectionsKt.firstOrNull(kzvVar.Y);
        String str = z0wVar != null ? z0wVar.C : null;
        if (str == null) {
            str = "";
        }
        String str2 = z0wVar != null ? z0wVar.w : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = z0wVar != null ? z0wVar.B : null;
        if (str3 == null) {
            str3 = "";
        }
        StringBuilder sb = new StringBuilder();
        if (str.length() > 0) {
            sb.append(str);
        }
        if (str3.length() > 0 && !(betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory)) {
            String str4 = sb.length() > 0 ? ". " : null;
            if (str4 == null) {
                str4 = "";
            }
            sb.append(str4.concat(str3));
        }
        if (str2.length() > 0) {
            String str5 = sb.length() > 0 ? ". " : null;
            sb.append((str5 != null ? str5 : "").concat(str2));
        }
        return sb.toString();
    }

    public static final Integer U(zf90 zf90Var, int i) {
        zf90 zf90Var2;
        zf90 zf90Var3 = zf90.f44292a;
        if ((zf90Var == zf90Var3 && i == 1) || (zf90Var == (zf90Var2 = zf90.b) && i == 2)) {
            return Integer.valueOf(R.string.previous_maps_win);
        }
        if ((zf90Var == zf90Var3 && i == 2) || (zf90Var == zf90Var2 && i == 1)) {
            return Integer.valueOf(R.string.previous_maps_lose);
        }
        if (zf90Var == zf90.c) {
            return Integer.valueOf(R.string.draw);
        }
        return null;
    }

    public static final cys0 V(long j, List list) {
        boolean z;
        list.getClass();
        if (!list.isEmpty()) {
            z = true;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((ufp0) it.next()).e.size() <= 1) {
                        z = false;
                        break;
                    }
                }
            }
        } else {
            z = false;
            break;
        }
        return W(z, j);
    }

    public static final cys0 W(boolean z, long j) {
        boolean z2 = j == 66;
        boolean z3 = j == 4;
        if (z) {
            return cys0.c;
        }
        if (z3) {
            return cys0.e;
        }
        return z2 ? cys0.d : cys0.f5194a;
    }

    public static final int X(String str) {
        str.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    public static final o0x Y(unh unhVar, fet fetVar) {
        boolean zG = fetVar.g(unhVar);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            if (unhVar instanceof snh) {
                objP = ((snh) unhVar).f32494a;
            } else {
                if (!(unhVar instanceof tnh)) {
                    t9f.b();
                    return null;
                }
                objP = new m0x(((tnh) unhVar).f34233a.f30787a, null, 6);
            }
            fetVar.o0(objP);
        }
        return (o0x) objP;
    }

    public static final void Z(RecyclerView recyclerView, Function2 function2) {
        Object obj;
        Object next;
        Iterator it = new ihu0(recyclerView).iterator();
        while (true) {
            jhu0 jhu0Var = (jhu0) it;
            obj = null;
            if (!jhu0Var.hasNext()) {
                next = null;
                break;
            }
            next = jhu0Var.next();
            View view = (View) next;
            if ((view instanceof RecyclerView) && (((RecyclerView) view).getAdapter() instanceof vqa)) {
                break;
            }
        }
        RecyclerView recyclerView2 = next instanceof RecyclerView ? (RecyclerView) next : null;
        View view2 = recyclerView2 != null ? (View) pgi0.j(new ihu0(recyclerView2)) : null;
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup != null) {
            Iterator it2 = new ihu0(viewGroup).iterator();
            while (true) {
                jhu0 jhu0Var2 = (jhu0) it2;
                if (!jhu0Var2.hasNext()) {
                    break;
                }
                Object next2 = jhu0Var2.next();
                if (((View) next2) instanceof ExpandBtnView) {
                    obj = next2;
                    break;
                }
            }
            obj = (View) obj;
        }
        if (obj != null) {
            function2.invoke(viewGroup, obj);
        }
    }

    public static final void a(yqv yqvVar, qdz qdzVar, Function1 function1, Function1 function2, Function1 function3, Function1 function4, fet fetVar, int i) {
        vqv vqvVar;
        int i2;
        float f;
        fet fetVar2 = fetVar;
        yqvVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        fetVar2.g0(1183218250);
        Function1 function5 = function1;
        int i3 = (fetVar2.g(yqvVar) ? 4 : 2) | i | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.i(function5) ? 256 : 128) | (fetVar2.i(function2) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i3 |= fetVar2.i(function3) ? 16384 : 8192;
        }
        int i4 = 131072;
        if ((196608 & i) == 0) {
            i3 |= fetVar2.i(function4) ? 131072 : 65536;
        }
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.l;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(h97.e(zclVar, zclVar, zclVar, zclVar, i120.Q(jm40Var, backgroundContent, ugg0Var2)), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int i5 = i3 << 3;
            byte b = 0;
            qzb.x(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 4.0f, 5), yqvVar.b, 0.0f, function3, function2, fetVar2, ((i3 >> 3) & 7168) | (57344 & i5));
            fetVar2.e0(-389421842);
            for (vqv vqvVar2 : yqvVar.c) {
                Object obj = vqvVar2.f37871a;
                brv brvVar = vqvVar2.b;
                fetVar2.b0(1851593815, obj);
                xcz xczVarB = qdzVar.b(vqvVar2.f37871a, new s3t((byte) 15), fetVar2, i5 & 896);
                fetVar2.r(false);
                boolean z = brvVar instanceof zqv;
                if (z) {
                    fetVar2.e0(1565055844);
                    b8m b8mVar = ((zqv) brvVar).f44826a;
                    androidx.compose.runtime.d dVar = zaq0.b;
                    long textPrimary = ((ThemeColors) fetVar2.k(dVar)).getTextPrimary();
                    ((ThemeColors) fetVar2.k(dVar)).getBackgroundContent();
                    r7m r7mVar = new r7m(textPrimary, ((ThemeColors) fetVar2.k(dVar)).getBackground(), ((ThemeColors) fetVar2.k(dVar)).getPrimary());
                    zcl zclVar2 = qmk.f28987a;
                    boolean zG = ((i3 & 458752) == i4) | fetVar2.g(vqvVar2);
                    Object objP = fetVar2.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new wqv(function4, vqvVar2, b);
                        fetVar2.o0(objP);
                    }
                    i2 = i5;
                    vqvVar = vqvVar2;
                    wwb.j(null, b8mVar, 16.0f, r7mVar, (Function0) objP, fetVar2, 0, 17);
                    fetVar2.r(false);
                } else {
                    vqvVar = vqvVar2;
                    i2 = i5;
                    fetVar2.e0(1565447405);
                    fetVar2.r(false);
                }
                if (z) {
                    zcl zclVar3 = qmk.f28987a;
                    f = 0.0f;
                } else {
                    zcl zclVar4 = qmk.f28987a;
                    f = 8.0f;
                }
                fet fetVar3 = fetVar2;
                zvw.k(s5x0.N(jm40Var, 0.0f, f, 0.0f, 0.0f, 13), vqvVar.c, true, xczVarB, s5x0.t(8.0f, 0.0f, 2), function5, fetVar3, ((i3 << 9) & 458752) | 384, 0);
                function5 = function1;
                fetVar2 = fetVar3;
                i5 = i2;
                i4 = 131072;
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) yqvVar, (Object) qdzVar, function1, function2, (wdr) function3, (wdr) function4, i, (byte) 23);
        }
    }

    public static void a0(TextView textView, Drawable drawable) {
        textView.setVisibility(drawable != null ? 8 : 0);
        textView.setText("");
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setPadding(drawable == null ? 0 : textView.getResources().getDimensionPixelSize(R.dimen.space_2), 0, 0, 0);
    }

    public static final void b(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1484697265);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
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
            if (a4xVar.isEmpty()) {
                fetVar2.e0(1552008105);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1551284472);
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1049674978, new eup(a4xVar, (byte) 12), fetVar2), fetVar2, 56);
                fetVar2.r(false);
            }
            if (str.length() > 0) {
                fetVar2.e0(1552066075);
                jm40Var = jm40Var2;
                v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, (i2 >> 6) & 14, 24960, 110586);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(1552304713);
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
            yfe0VarU.d = new pea(mm40Var2, a4xVar, str, i, (byte) 3);
        }
    }

    public static final void b0(yfu0 yfu0Var, Context context) {
        View view;
        yfu0Var.getClass();
        context.getClass();
        ViewParent parent = yfu0Var.getRoot().getParent().getParent().getParent().getParent().getParent();
        parent.getClass();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_32);
        TypedValue typedValue = ysf0.f43165a;
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue2 = ysf0.f43165a;
        theme.resolveAttribute(R.attr.actionBarSize, typedValue2, true);
        int iComplexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue2.data, context.getResources().getDisplayMetrics());
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.bottom_navigation_view_height) / 2;
        Iterator it = new ihu0(coordinatorLayout).iterator();
        do {
            jhu0 jhu0Var = (jhu0) it;
            if (!jhu0Var.hasNext()) {
                v4i0.o("Sequence contains no element matching the predicate.");
                return;
            }
            view = (View) jhu0Var.next();
        } while (!(view instanceof GameScreenToolbarView));
        View root = yfu0Var.getRoot();
        root.getClass();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        int height = coordinatorLayout.getHeight() - iComplexToDimensionPixelSize;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        layoutParams.height = ((height - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0)) - dimensionPixelSize2) - dimensionPixelSize;
        root.setLayoutParams(layoutParams);
    }

    public static final void c(mm40 mm40Var, a2m a2mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(218530677);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a2mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarC = o7k0.c(mm40Var2, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            obb.q(jr8.f16991a.b(mm40Var2, gqw0.e), a2mVar, z, fetVar, i2 & 1008, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rvm(mm40Var2, a2mVar, z, i, (byte) 0);
        }
    }

    public static void c0(TextView textView, CharSequence charSequence, f5h0 f5h0Var) {
        int i;
        f5h0Var.getClass();
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        textView.setText(charSequence);
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setPadding(0, 0, 0, 0);
        int iOrdinal = f5h0Var.ordinal();
        if (iOrdinal == 0) {
            i = R.style.TextStyle_Caption_Medium_L_TextPrimary;
        } else if (iOrdinal == 1) {
            i = R.style.TextStyle_Caption_Regular_L_Secondary;
        } else if (iOrdinal == 2) {
            i = R.style.TextStyle_Caption_Medium_L_StaticGreen;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return;
            }
            i = R.style.TextStyle_Caption_Regular_L_StaticGreen;
        }
        cem0.n(i, textView);
    }

    public static final void d(mm40 mm40Var, l7m0 l7m0Var, f3d f3dVar, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var2;
        fet fetVar2;
        l7m0Var.getClass();
        fetVar.g0(-773000855);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(f3dVar) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            pm80 pm80VarF = a8k0.F(((z82) l7m0Var2.getValue()).f43946a, 0, fetVar);
            mm40 mm40VarA = jr8.f16991a.a(jm40.b);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new y1d(f3dVar, b);
                fetVar.o0(objP);
            }
            mm40 mm40VarT = i4w0.T(mm40VarA, (Function1) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new e6c((byte) 25);
                fetVar.o0(objP2);
            }
            k7x.b(((z82) l7m0Var2.getValue()).b, null, rq8.M(mm40VarT, (Function1) objP2), pm80VarF, pm80VarF, pm80VarF, null, null, null, null, gqw0.A, null, fetVar, 299056, 6, 31680);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var, l7m0Var, f3dVar, i, (byte) 5);
        }
    }

    public static final vvb d0(gwb gwbVar) {
        hwb hwbVar;
        dwb awbVar;
        gwbVar.getClass();
        Integer num = gwbVar.d;
        String str = gwbVar.b;
        if (num != null && num.intValue() == 1) {
            hwbVar = hwb.f13762a;
        } else {
            hwbVar = (num != null && num.intValue() == 2) ? hwb.b : hwb.c;
        }
        String str2 = gwbVar.c;
        if (str2 == null) {
            jf4.k(null);
            return null;
        }
        Integer num2 = gwbVar.f12018a;
        if (num2 != null && num2.intValue() == 1) {
            if (str == null) {
                str = "";
            }
            awbVar = new bwb(str);
        } else if (num2 != null && num2.intValue() == 2) {
            if (str == null) {
                str = "";
            }
            awbVar = new cwb(str);
        } else if (num2 != null && num2.intValue() == 3) {
            if (str == null) {
                str = "";
            }
            awbVar = new yvb(str);
        } else if (num2 != null && num2.intValue() == 4) {
            if (str == null) {
                str = "";
            }
            awbVar = new xvb(str);
        } else if (num2 != null && num2.intValue() == 5) {
            if (str == null) {
                str = "";
            }
            awbVar = new awb(str);
        } else {
            awbVar = zvb.b;
        }
        return new vvb(hwbVar, str2, awbVar);
    }

    public static final void e(bdd bddVar, fet fetVar, int i) {
        int i2;
        bddVar.getClass();
        fetVar.g0(1754975765);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(bddVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1461592405, new cnc(bddVar, (byte) 5), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(bddVar, i, (byte) 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:193:0x0272  */
    /* JADX WARN: Code duplicated, block: B:198:0x027f  */
    /* JADX WARN: Code duplicated, block: B:203:0x028e  */
    /* JADX WARN: Code duplicated, block: B:210:0x029f  */
    /* JADX WARN: Code duplicated, block: B:215:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:217:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:220:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:223:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:224:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:227:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:228:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:231:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:232:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:238:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:240:0x02df  */
    /* JADX WARN: Code duplicated, block: B:245:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:247:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:255:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static final chj e0(ohj ohjVar, boolean z, List list, List list2, boolean z2, boolean z3, boolean z4) {
        ?? arrayList;
        Iterator it;
        List list3;
        ?? arrayList2;
        String str;
        Object next;
        double d;
        Object next2;
        String strQ;
        long j;
        long jLongValue;
        long jLongValue2;
        double dDoubleValue;
        long jLongValue3;
        long jLongValue4;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        List list4;
        List list5;
        tbo tboVar;
        tbo tboVar2;
        thj thjVar;
        thj thjVar2;
        Long l;
        Long l2;
        Double d2;
        Long l3;
        tbo tboVar3;
        tbo tboVar4;
        Double d3;
        Long l4;
        Long l5;
        thj thjVar3;
        cij cijVar;
        Long l6;
        Integer num;
        Integer num2;
        Long l7;
        Double d4;
        List list6;
        List list7;
        ohj ohjVar2 = ohjVar;
        ohjVar2.getClass();
        list.getClass();
        list2.getClass();
        Long l8 = ohjVar2.f25267a;
        long jLongValue5 = l8 != null ? l8.longValue() : 0L;
        String str10 = ohjVar2.d;
        String str11 = str10 == null ? "" : str10;
        List list8 = ohjVar2.e;
        if (list8 != null) {
            arrayList = new ArrayList(r3d.q(list8, 10));
            Iterator it2 = list8.iterator();
            while (it2.hasNext()) {
                ahj ahjVar = (ahj) it2.next();
                Long l9 = ohjVar2.b;
                long jLongValue6 = l9 != null ? l9.longValue() : 0L;
                ahjVar.getClass();
                e380 e380Var = ahjVar.c;
                Long l10 = ahjVar.g;
                e380 e380Var2 = ahjVar.d;
                skl0 skl0Var = ahjVar.b;
                fij fijVar = ahjVar.f;
                ubo uboVar = ahjVar.e;
                if (e380Var == null || (list7 = e380Var.c) == null) {
                    it = it2;
                    list3 = iun.f15405a;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = list7.iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = it2;
                        String str12 = ((x180) it3.next()).c;
                        String strI0 = str12 != null ? sj3.i0(StringsKt.p0(str12, Separators.SLASH, str12)) : null;
                        if (strI0 != null) {
                            arrayList3.add(strI0);
                        }
                        it2 = it4;
                    }
                    it = it2;
                    list3 = arrayList3;
                }
                List list9 = list3;
                if (e380Var2 == null || (list6 = e380Var2.c) == null) {
                    arrayList2 = iun.f15405a;
                } else {
                    arrayList2 = new ArrayList();
                    Iterator it5 = list6.iterator();
                    while (it5.hasNext()) {
                        String str13 = ((x180) it5.next()).c;
                        String strI1 = str13 != null ? sj3.i0(StringsKt.p0(str13, Separators.SLASH, str13)) : null;
                        if (strI1 != null) {
                            arrayList2.add(strI1);
                        }
                    }
                }
                ?? r23 = arrayList2;
                double dDoubleValue2 = (uboVar == null || (d4 = uboVar.d) == null) ? 0.0d : d4.doubleValue();
                String str14 = uboVar != null ? uboVar.e : null;
                if (str14 == null) {
                    str14 = "";
                }
                long jLongValue7 = (uboVar == null || (l7 = uboVar.b) == null) ? 0L : l7.longValue();
                String str15 = e380Var != null ? e380Var.f7122a : null;
                if (str15 == null) {
                    str15 = "";
                }
                String str16 = e380Var2 != null ? e380Var2.f7122a : null;
                if (str16 == null) {
                    str16 = "";
                }
                int iIntValue = (fijVar == null || (num2 = fijVar.c) == null) ? 0 : num2.intValue();
                String str17 = str14;
                int iIntValue2 = (fijVar == null || (num = fijVar.d) == null) ? 0 : num.intValue();
                Long l11 = ahjVar.k;
                long jLongValue8 = l11 != null ? l11.longValue() : 0L;
                long jLongValue9 = (fijVar == null || (cijVar = fijVar.e) == null || (l6 = cijVar.f4417a) == null) ? 0L : l6.longValue();
                fmz fmzVar = ahjVar.f877a;
                String str18 = fmzVar != null ? fmzVar.b : null;
                if (str18 == null) {
                    str18 = "";
                }
                String str19 = str18;
                String str20 = (uboVar == null || (thjVar3 = uboVar.f) == null) ? null : thjVar3.b;
                String str21 = str20 == null ? "" : str20;
                long jLongValue10 = (uboVar == null || (l5 = uboVar.f35391a) == null) ? 0L : l5.longValue();
                long jLongValue11 = (uboVar == null || (l4 = uboVar.b) == null) ? 0L : l4.longValue();
                double dDoubleValue3 = (uboVar == null || (d3 = uboVar.c) == null) ? 0.0d : d3.doubleValue();
                Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        str = str15;
                        next = null;
                        break;
                    }
                    next = it6.next();
                    Iterator it7 = it6;
                    str = str15;
                    if (((xco) next).f40655a == jLongValue10) {
                        break;
                    }
                    it6 = it7;
                    str15 = str;
                }
                xco xcoVar = (xco) next;
                Iterator it8 = list2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        d = dDoubleValue2;
                        next2 = null;
                        break;
                    }
                    next2 = it8.next();
                    Iterator it9 = it8;
                    d = dDoubleValue2;
                    if (((ueo) next2).f35538a == jLongValue11) {
                        break;
                    }
                    it8 = it9;
                    dDoubleValue2 = d;
                }
                ueo ueoVar = (ueo) next2;
                if (xcoVar == null || ueoVar == null) {
                    strQ = "";
                } else {
                    String str22 = xcoVar.b;
                    String str23 = ueoVar.b;
                    List list10 = (uboVar == null || (tboVar4 = uboVar.h) == null) ? null : tboVar4.f33674a;
                    if (list10 == null) {
                        list10 = iun.f15405a;
                    }
                    List list11 = list10;
                    List list12 = (uboVar == null || (tboVar3 = uboVar.h) == null) ? null : tboVar3.b;
                    if (list12 == null) {
                        list12 = iun.f15405a;
                    }
                    strQ = w6x.q(str22, ": ", dii0.a(str23, list11, list12, Integer.valueOf(ueoVar.c), z2, kotlin.text.b.h(String.valueOf(dDoubleValue3)), str21, skl0Var != null ? skl0Var.f32356a : null, ueoVar.f35538a, nt20.g, z3, z4));
                }
                String str24 = ahjVar.n;
                String str25 = str24 == null ? "" : str24;
                String str26 = fijVar != null ? fijVar.b : null;
                String str27 = str26 == null ? "" : str26;
                long jLongValue12 = l10 != null ? l10.longValue() : 0L;
                Long l12 = ahjVar.i;
                if (l12 != null) {
                    jLongValue = l12.longValue();
                } else {
                    if (l10 != null) {
                        jLongValue = l10.longValue();
                    } else {
                        j = 0;
                    }
                    if (skl0Var != null || (l3 = skl0Var.f32356a) == null) {
                        jLongValue2 = 0;
                    } else {
                        jLongValue2 = l3.longValue();
                    }
                    if (uboVar != null || (d2 = uboVar.c) == null) {
                        dDoubleValue = 0.0d;
                    } else {
                        dDoubleValue = d2.doubleValue();
                    }
                    if (uboVar != null || (l2 = uboVar.f35391a) == null) {
                        jLongValue3 = 0;
                    } else {
                        jLongValue3 = l2.longValue();
                    }
                    if (uboVar != null || (thjVar2 = uboVar.f) == null || (l = thjVar2.f33964a) == null) {
                        jLongValue4 = 0;
                    } else {
                        jLongValue4 = l.longValue();
                    }
                    if (uboVar != null || (thjVar = uboVar.f) == null) {
                        str2 = null;
                    } else {
                        str2 = thjVar.b;
                    }
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (skl0Var != null) {
                        str4 = skl0Var.b;
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                    str6 = ahjVar.s;
                    if (str6 == null) {
                        str7 = "";
                    } else {
                        str7 = str6;
                    }
                    str8 = ahjVar.t;
                    if (str8 == null) {
                        str9 = "";
                    } else {
                        str9 = str8;
                    }
                    if (uboVar != null || (tboVar2 = uboVar.h) == null) {
                        list4 = null;
                    } else {
                        list4 = tboVar2.f33674a;
                    }
                    if (list4 == null) {
                        list4 = iun.f15405a;
                    }
                    if (uboVar != null || (tboVar = uboVar.h) == null) {
                        list5 = null;
                    } else {
                        list5 = tboVar.b;
                    }
                    if (list5 == null) {
                        list5 = iun.f15405a;
                    }
                    double d5 = d;
                    arrayList.add(new jij(d5, str17, jLongValue7, str, str16, iIntValue, iIntValue2, list9, r23, jLongValue8, jLongValue9, str19, strQ, str25, str27, jLongValue12, j, jLongValue2, jLongValue6, dDoubleValue, jLongValue3, jLongValue4, str3, str5, z, str7, str9, new zeo(list4, list5)));
                    ohjVar2 = ohjVar;
                    it2 = it;
                }
                j = jLongValue;
                if (skl0Var != null) {
                    jLongValue2 = 0;
                } else {
                    jLongValue2 = 0;
                }
                if (uboVar != null) {
                    dDoubleValue = 0.0d;
                } else {
                    dDoubleValue = 0.0d;
                }
                if (uboVar != null) {
                    jLongValue3 = 0;
                } else {
                    jLongValue3 = 0;
                }
                if (uboVar != null) {
                    jLongValue4 = 0;
                } else {
                    jLongValue4 = 0;
                }
                if (uboVar != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (skl0Var != null) {
                    str4 = skl0Var.b;
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                str6 = ahjVar.s;
                if (str6 == null) {
                    str7 = "";
                } else {
                    str7 = str6;
                }
                str8 = ahjVar.t;
                if (str8 == null) {
                    str9 = "";
                } else {
                    str9 = str8;
                }
                if (uboVar != null) {
                    list4 = null;
                } else {
                    list4 = null;
                }
                if (list4 == null) {
                    list4 = iun.f15405a;
                }
                if (uboVar != null) {
                    list5 = null;
                } else {
                    list5 = null;
                }
                if (list5 == null) {
                    list5 = iun.f15405a;
                }
                double d6 = d;
                arrayList.add(new jij(d6, str17, jLongValue7, str, str16, iIntValue, iIntValue2, list9, r23, jLongValue8, jLongValue9, str19, strQ, str25, str27, jLongValue12, j, jLongValue2, jLongValue6, dDoubleValue, jLongValue3, jLongValue4, str3, str5, z, str7, str9, new zeo(list4, list5)));
                ohjVar2 = ohjVar;
                it2 = it;
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new chj(jLongValue5, str11, arrayList, z);
    }

    public static final void f(String str, long j, fet fetVar, int i) {
        fetVar.g0(-593321077);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.f(j) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(jm40.b, 36.0f, 28.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            v8q0.a(str, o2e.e0(o7k0.w(s5x0.M(i120.Q(mm40VarP, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 2.0f, 2.0f, 2.0f, 2.0f), gqw0.k, false, 2), "COMPARE_TEAMS_ITEM_VALUE_TEST_TAG"), j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, (i2 & 14) | ((i2 << 3) & 896), 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bs0(str, j, i, (byte) 1);
        }
    }

    public static final void g(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        fetVar.g0(2029093840);
        byte b = 2;
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            float fH0 = lgb.h0(fetVar);
            zcl zclVar = qmk.f28987a;
            float f = 224.0f + fH0;
            float f2 = 56.0f + fH0;
            qsk qskVar = (qsk) ((tsk) l7m0Var.getValue()).b.getValue();
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = jgk0.b(new plh(l7m0Var, b));
                fetVar.o0(objP);
            }
            m0x0.d(null, f, ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), false, 12.0f, null, 0L, 0.0f, null, null, u1c.M(86462525, new qpk(qskVar, f, f2, fH0, function1, (byte) 0), fetVar), u1c.M(576583619, new rpk(ddz.a(0, 0, fetVar, 0, 3), qdzVar, function1, function2, (l7m0) objP, l7m0Var, (byte) 0), fetVar), fetVar, 24576, 432, 1985);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new keg(l7m0Var, qdzVar, function1, function2, i, (byte) 2);
        }
    }

    public static final void h(int i, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var, boolean z) {
        ugd ugdVar3;
        ugd ugdVar4;
        mm40 mm40Var2;
        fetVar.g0(-1044536252);
        int i2 = i | (fetVar.h(z) ? 4 : 2) | (fetVar.g(mm40Var) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40Var2 = mm40Var;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 60.0f), 12.0f, 0.0f, 8.0f, 0.0f, 10);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 28.0f, 0.0f, 11);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
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
            ugdVar3 = ugdVar;
            ugdVar3.invoke(fetVar, 6);
            ugdVar4 = ugdVar2;
            ugdVar4.F(twn.l(gqw0.k, s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14)), fetVar, 48);
            fetVar.r(true);
            if (z) {
                fetVar.e0(1690190710);
                dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar), "", o2e.e0(o7k0.n(jr8.f16991a.b(jm40Var, gqw0.f), 20.0f), "IconChevronRightSmallTestTag"), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar, 56, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(1690571576);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            ugdVar3 = ugdVar;
            ugdVar4 = ugdVar2;
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gka(z, ugdVar3, ugdVar4, mm40Var2, i);
        }
    }

    public static final void i(mm40 mm40Var, qnh qnhVar, fet fetVar, int i) {
        fetVar.g0(-225999161);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(qnhVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 52.0f);
            long separator60 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.S(mm40VarE, 1.0f, separator60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 12.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            if (2.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            H(mm40VarC.e(new x7z(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true)), qnhVar.f29028a, fetVar, 0);
            mm40 mm40VarC2 = o7k0.c(jm40Var, 1.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            I(mm40VarC2.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), qnhVar.b, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, qnhVar, i, b);
        }
    }

    public static final void j(mm40 mm40Var, gol golVar, b0i b0iVar, Function1 function1, Function2 function2, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        fetVar.g0(1530111555);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        int i5 = i3 | (fetVar.g(golVar) ? 32 : 16) | (fetVar.g(b0iVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i5 & 1, (i5 & 9363) != 9362)) {
            mm40 mm40Var4 = i4 != 0 ? jm40.b : mm40Var2;
            int i6 = i5 & 112;
            boolean z = (i6 == 32) | ((i5 & 7168) == 2048);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new lrk(golVar, function1, (byte) 10);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = (i6 == 32) | ((57344 & i5) == 16384);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ngh(golVar, function2, (byte) 26);
                fetVar.o0(objP2);
            }
            Function1 function3 = (Function1) objP2;
            rh1 rh1Var = b0iVar.b;
            sh1 sh1Var = b0iVar.f1765a;
            int iOrdinal = rh1Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(1066183671);
                dub.q(mm40Var4, golVar, sh1Var, function0, function3, fetVar, i5 & 126);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(1066510287);
                vtb.m(mm40Var4, golVar, sh1Var, function0, function3, fetVar, i5 & 126);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(1066836407);
                ntb.g(mm40Var4, golVar, sh1Var, function0, function3, fetVar, i5 & 126);
                fetVar.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(1558412134, fetVar, false);
                }
                fetVar.e0(1067163023);
                dtb.f(mm40Var4, golVar, sh1Var, function0, function3, fetVar, i5 & 126);
                fetVar.r(false);
            }
            mm40Var3 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vs1(mm40Var3, golVar, b0iVar, function1, function2, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012f A[LOOP:0: B:101:0x012d->B:102:0x012f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0148  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0152  */
    /* JADX WARN: Code duplicated, block: B:113:0x016d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0175  */
    /* JADX WARN: Code duplicated, block: B:117:0x017a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0195  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0 A[PHI: r6 r10
  0x00c0: PHI (r6v26 a.d9z) = (r6v5 a.d9z), (r6v2 a.d9z) binds: [B:76:0x00ca, B:69:0x00bd] A[DONT_GENERATE, DONT_INLINE]
  0x00c0: PHI (r10v14 kotlin.jvm.functions.Function1) = (r10v4 kotlin.jvm.functions.Function1), (r10v2 kotlin.jvm.functions.Function1) binds: [B:76:0x00ca, B:69:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0111  */
    /* JADX WARN: Code duplicated, block: B:91:0x0113  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:94:0x011c  */
    public static final void k(mm40 mm40Var, dol dolVar, d9z d9zVar, hh80 hh80Var, Function1 function1, Function2 function2, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        d9z d9zVar2;
        hh80 hh80Var2;
        int i4;
        Function1 function3;
        int i5;
        int i6;
        Function2 function4;
        int i7;
        boolean z;
        d9z d9zVar3;
        Function1 function5;
        Function2 function6;
        yfe0 yfe0VarU;
        d9z d9zVar4;
        Function1 function7;
        b0i b0iVar;
        int iP;
        Integer num;
        sh1 sh1Var;
        sh1 sh1Var2;
        rh1 rh1Var;
        int iIntValue;
        ArrayList arrayList;
        int i8;
        List list;
        int iOrdinal;
        d9z d9zVar5;
        Function1 function8;
        Function2 function9;
        int i9;
        fet fetVar2 = fetVar;
        dolVar.getClass();
        fetVar2.g0(183719767);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(dolVar) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                d9zVar2 = d9zVar;
                i3 |= fetVar2.g(d9zVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                hh80Var2 = hh80Var;
                if (fetVar2.g(hh80Var2)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i3 |= i9;
            } else {
                hh80Var2 = hh80Var;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function3 = function1;
                    if (fetVar2.i(function3)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        function4 = function2;
                        if (fetVar2.i(function4)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar2.U(i3 & 1, z)) {
                        fetVar2.Z();
                        if ((i & 1) != 0 || fetVar2.B()) {
                            if (i10 != 0) {
                                d9zVar2 = null;
                            }
                            if (i4 != 0) {
                                function3 = null;
                            }
                            if (i6 != 0) {
                                d9zVar4 = d9zVar2;
                                function7 = function3;
                                function4 = null;
                            }
                            fetVar2.s();
                            if (dolVar instanceof bol) {
                                fetVar2.e0(1407753638);
                                fetVar2.r(false);
                                list = ((bol) dolVar).f2938a;
                            } else {
                                if (!(dolVar instanceof col)) {
                                    throw b1j.f(461051252, fetVar2, false);
                                }
                                fetVar2.e0(1407862603);
                                col colVar = (col) dolVar;
                                b0iVar = colVar.f4706a;
                                iP = P(b0iVar, fetVar2);
                                num = colVar.b;
                                sh1Var = b0iVar.f1765a;
                                sh1Var2 = sh1.b;
                                if (sh1Var != sh1Var2 && num != null) {
                                    iIntValue = num.intValue();
                                } else if (num != null) {
                                    iIntValue = num.intValue() * iP;
                                } else if (sh1Var == sh1Var2) {
                                    iIntValue = 6;
                                } else {
                                    rh1Var = b0iVar.b;
                                    if (rh1Var == rh1.d && !(rh1Var == rh1.e && sh1Var == sh1.f32187a)) {
                                        iIntValue = iP * 7;
                                    } else {
                                        iIntValue = iP * 5;
                                    }
                                }
                                arrayList = new ArrayList(iIntValue);
                                for (i8 = 0; i8 < iIntValue; i8++) {
                                    arrayList.add(fol.f9886a);
                                }
                                fetVar2.r(false);
                                list = arrayList;
                            }
                            iOrdinal = dolVar.a().f1765a.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    function8 = function7;
                                    function9 = function4;
                                    fetVar2.e0(1408759340);
                                    l(mm40Var, list, dolVar.a(), hh80Var, function8, function9, fetVar2, i3 & 523278);
                                    fetVar2.r(false);
                                } else if (iOrdinal != 2) {
                                    if (iOrdinal != 3) {
                                        throw b1j.f(461067588, fetVar2, false);
                                    }
                                    fetVar2.e0(1409176259);
                                    hh80 hh80Var3 = hh80Var2;
                                    function8 = function7;
                                    function9 = function4;
                                    n(mm40Var2, list, dolVar.a(), hh80Var3, function8, function9, fetVar2, i3 & 523278);
                                    fetVar2.r(false);
                                }
                                d9zVar5 = d9zVar4;
                                d9zVar3 = d9zVar5;
                                function5 = function8;
                                function6 = function9;
                            }
                            Function2 function10 = function4;
                            fetVar2.e0(1408308383);
                            int i11 = i3 << 3;
                            d9zVar5 = d9zVar4;
                            Function1 function11 = function7;
                            m(mm40Var, list, dolVar.a(), d9zVar5, hh80Var, function11, function10, fetVar2, (i3 & 14) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (i11 & 3670016));
                            function8 = function11;
                            function9 = function10;
                            fetVar2 = fetVar2;
                            fetVar2.r(false);
                            d9zVar3 = d9zVar5;
                            function5 = function8;
                            function6 = function9;
                        } else {
                            fetVar2.X();
                        }
                        d9zVar4 = d9zVar2;
                        function7 = function3;
                        fetVar2.s();
                        if (dolVar instanceof bol) {
                            fetVar2.e0(1407753638);
                            fetVar2.r(false);
                            list = ((bol) dolVar).f2938a;
                        } else {
                            if (!(dolVar instanceof col)) {
                                throw b1j.f(461051252, fetVar2, false);
                            }
                            fetVar2.e0(1407862603);
                            col colVar2 = (col) dolVar;
                            b0iVar = colVar2.f4706a;
                            iP = P(b0iVar, fetVar2);
                            num = colVar2.b;
                            sh1Var = b0iVar.f1765a;
                            sh1Var2 = sh1.b;
                            if (sh1Var != sh1Var2) {
                                if (num != null) {
                                    iIntValue = num.intValue() * iP;
                                } else if (sh1Var == sh1Var2) {
                                    iIntValue = 6;
                                } else {
                                    rh1Var = b0iVar.b;
                                    if (rh1Var == rh1.d) {
                                        iIntValue = iP * 5;
                                    } else {
                                        iIntValue = iP * 7;
                                    }
                                }
                            } else if (num != null) {
                                iIntValue = num.intValue() * iP;
                            } else if (sh1Var == sh1Var2) {
                                iIntValue = 6;
                            } else {
                                rh1Var = b0iVar.b;
                                if (rh1Var == rh1.d) {
                                    iIntValue = iP * 5;
                                } else {
                                    iIntValue = iP * 7;
                                }
                            }
                            arrayList = new ArrayList(iIntValue);
                            while (i8 < iIntValue) {
                                arrayList.add(fol.f9886a);
                            }
                            fetVar2.r(false);
                            list = arrayList;
                        }
                        iOrdinal = dolVar.a().f1765a.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                function8 = function7;
                                function9 = function4;
                                fetVar2.e0(1408759340);
                                l(mm40Var, list, dolVar.a(), hh80Var, function8, function9, fetVar2, i3 & 523278);
                                fetVar2.r(false);
                            } else if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    throw b1j.f(461067588, fetVar2, false);
                                }
                                fetVar2.e0(1409176259);
                                hh80 hh80Var4 = hh80Var2;
                                function8 = function7;
                                function9 = function4;
                                n(mm40Var2, list, dolVar.a(), hh80Var4, function8, function9, fetVar2, i3 & 523278);
                                fetVar2.r(false);
                            }
                            d9zVar5 = d9zVar4;
                            d9zVar3 = d9zVar5;
                            function5 = function8;
                            function6 = function9;
                        }
                        Function2 function12 = function4;
                        fetVar2.e0(1408308383);
                        int i12 = i3 << 3;
                        d9zVar5 = d9zVar4;
                        Function1 function13 = function7;
                        m(mm40Var, list, dolVar.a(), d9zVar5, hh80Var, function13, function12, fetVar2, (i3 & 14) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016));
                        function8 = function13;
                        function9 = function12;
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                        d9zVar3 = d9zVar5;
                        function5 = function8;
                        function6 = function9;
                    } else {
                        fetVar2.X();
                        d9zVar3 = d9zVar2;
                        function5 = function3;
                        function6 = function4;
                    }
                    yfe0VarU = fetVar2.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new hjl(mm40Var, dolVar, d9zVar3, hh80Var, function5, function6, i, i2, (byte) 1);
                    }
                }
                i3 |= 196608;
                function4 = function2;
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar2.U(i3 & 1, z)) {
                    fetVar2.Z();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            d9zVar2 = null;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            d9zVar4 = d9zVar2;
                            function7 = function3;
                            function4 = null;
                        } else {
                            d9zVar4 = d9zVar2;
                            function7 = function3;
                        }
                    } else {
                        if (i10 != 0) {
                            d9zVar2 = null;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            d9zVar4 = d9zVar2;
                            function7 = function3;
                            function4 = null;
                        } else {
                            d9zVar4 = d9zVar2;
                            function7 = function3;
                        }
                    }
                    fetVar2.s();
                    if (dolVar instanceof bol) {
                        fetVar2.e0(1407753638);
                        fetVar2.r(false);
                        list = ((bol) dolVar).f2938a;
                    } else {
                        if (!(dolVar instanceof col)) {
                            throw b1j.f(461051252, fetVar2, false);
                        }
                        fetVar2.e0(1407862603);
                        col colVar3 = (col) dolVar;
                        b0iVar = colVar3.f4706a;
                        iP = P(b0iVar, fetVar2);
                        num = colVar3.b;
                        sh1Var = b0iVar.f1765a;
                        sh1Var2 = sh1.b;
                        if (sh1Var != sh1Var2) {
                            if (num != null) {
                                iIntValue = num.intValue() * iP;
                            } else if (sh1Var == sh1Var2) {
                                iIntValue = 6;
                            } else {
                                rh1Var = b0iVar.b;
                                if (rh1Var == rh1.d) {
                                    iIntValue = iP * 5;
                                } else {
                                    iIntValue = iP * 7;
                                }
                            }
                        } else if (num != null) {
                            iIntValue = num.intValue() * iP;
                        } else if (sh1Var == sh1Var2) {
                            iIntValue = 6;
                        } else {
                            rh1Var = b0iVar.b;
                            if (rh1Var == rh1.d) {
                                iIntValue = iP * 5;
                            } else {
                                iIntValue = iP * 7;
                            }
                        }
                        arrayList = new ArrayList(iIntValue);
                        while (i8 < iIntValue) {
                            arrayList.add(fol.f9886a);
                        }
                        fetVar2.r(false);
                        list = arrayList;
                    }
                    iOrdinal = dolVar.a().f1765a.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            function8 = function7;
                            function9 = function4;
                            fetVar2.e0(1408759340);
                            l(mm40Var, list, dolVar.a(), hh80Var, function8, function9, fetVar2, i3 & 523278);
                            fetVar2.r(false);
                        } else if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw b1j.f(461067588, fetVar2, false);
                            }
                            fetVar2.e0(1409176259);
                            hh80 hh80Var5 = hh80Var2;
                            function8 = function7;
                            function9 = function4;
                            n(mm40Var2, list, dolVar.a(), hh80Var5, function8, function9, fetVar2, i3 & 523278);
                            fetVar2.r(false);
                        }
                        d9zVar5 = d9zVar4;
                        d9zVar3 = d9zVar5;
                        function5 = function8;
                        function6 = function9;
                    }
                    Function2 function14 = function4;
                    fetVar2.e0(1408308383);
                    int i13 = i3 << 3;
                    d9zVar5 = d9zVar4;
                    Function1 function15 = function7;
                    m(mm40Var, list, dolVar.a(), d9zVar5, hh80Var, function15, function14, fetVar2, (i3 & 14) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (i13 & 3670016));
                    function8 = function15;
                    function9 = function14;
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                    d9zVar3 = d9zVar5;
                    function5 = function8;
                    function6 = function9;
                } else {
                    fetVar2.X();
                    d9zVar3 = d9zVar2;
                    function5 = function3;
                    function6 = function4;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new hjl(mm40Var, dolVar, d9zVar3, hh80Var, function5, function6, i, i2, (byte) 1);
                }
            }
            i3 |= 24576;
            function3 = function1;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    function4 = function2;
                    if (fetVar2.i(function4)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar2.U(i3 & 1, z)) {
                    fetVar2.Z();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            d9zVar2 = null;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            d9zVar4 = d9zVar2;
                            function7 = function3;
                            function4 = null;
                        } else {
                            d9zVar4 = d9zVar2;
                            function7 = function3;
                        }
                    } else {
                        if (i10 != 0) {
                            d9zVar2 = null;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            d9zVar4 = d9zVar2;
                            function7 = function3;
                            function4 = null;
                        } else {
                            d9zVar4 = d9zVar2;
                            function7 = function3;
                        }
                    }
                    fetVar2.s();
                    if (dolVar instanceof bol) {
                        fetVar2.e0(1407753638);
                        fetVar2.r(false);
                        list = ((bol) dolVar).f2938a;
                    } else {
                        if (!(dolVar instanceof col)) {
                            throw b1j.f(461051252, fetVar2, false);
                        }
                        fetVar2.e0(1407862603);
                        col colVar4 = (col) dolVar;
                        b0iVar = colVar4.f4706a;
                        iP = P(b0iVar, fetVar2);
                        num = colVar4.b;
                        sh1Var = b0iVar.f1765a;
                        sh1Var2 = sh1.b;
                        if (sh1Var != sh1Var2) {
                            if (num != null) {
                                iIntValue = num.intValue() * iP;
                            } else if (sh1Var == sh1Var2) {
                                iIntValue = 6;
                            } else {
                                rh1Var = b0iVar.b;
                                if (rh1Var == rh1.d) {
                                    iIntValue = iP * 5;
                                } else {
                                    iIntValue = iP * 7;
                                }
                            }
                        } else if (num != null) {
                            iIntValue = num.intValue() * iP;
                        } else if (sh1Var == sh1Var2) {
                            iIntValue = 6;
                        } else {
                            rh1Var = b0iVar.b;
                            if (rh1Var == rh1.d) {
                                iIntValue = iP * 5;
                            } else {
                                iIntValue = iP * 7;
                            }
                        }
                        arrayList = new ArrayList(iIntValue);
                        while (i8 < iIntValue) {
                            arrayList.add(fol.f9886a);
                        }
                        fetVar2.r(false);
                        list = arrayList;
                    }
                    iOrdinal = dolVar.a().f1765a.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            function8 = function7;
                            function9 = function4;
                            fetVar2.e0(1408759340);
                            l(mm40Var, list, dolVar.a(), hh80Var, function8, function9, fetVar2, i3 & 523278);
                            fetVar2.r(false);
                        } else if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw b1j.f(461067588, fetVar2, false);
                            }
                            fetVar2.e0(1409176259);
                            hh80 hh80Var6 = hh80Var2;
                            function8 = function7;
                            function9 = function4;
                            n(mm40Var2, list, dolVar.a(), hh80Var6, function8, function9, fetVar2, i3 & 523278);
                            fetVar2.r(false);
                        }
                        d9zVar5 = d9zVar4;
                        d9zVar3 = d9zVar5;
                        function5 = function8;
                        function6 = function9;
                    }
                    Function2 function16 = function4;
                    fetVar2.e0(1408308383);
                    int i14 = i3 << 3;
                    d9zVar5 = d9zVar4;
                    Function1 function17 = function7;
                    m(mm40Var, list, dolVar.a(), d9zVar5, hh80Var, function17, function16, fetVar2, (i3 & 14) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016));
                    function8 = function17;
                    function9 = function16;
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                    d9zVar3 = d9zVar5;
                    function5 = function8;
                    function6 = function9;
                } else {
                    fetVar2.X();
                    d9zVar3 = d9zVar2;
                    function5 = function3;
                    function6 = function4;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new hjl(mm40Var, dolVar, d9zVar3, hh80Var, function5, function6, i, i2, (byte) 1);
                }
            }
            i3 |= 196608;
            function4 = function2;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                fetVar2.Z();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        d9zVar2 = null;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        d9zVar4 = d9zVar2;
                        function7 = function3;
                        function4 = null;
                    } else {
                        d9zVar4 = d9zVar2;
                        function7 = function3;
                    }
                } else {
                    if (i10 != 0) {
                        d9zVar2 = null;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        d9zVar4 = d9zVar2;
                        function7 = function3;
                        function4 = null;
                    } else {
                        d9zVar4 = d9zVar2;
                        function7 = function3;
                    }
                }
                fetVar2.s();
                if (dolVar instanceof bol) {
                    fetVar2.e0(1407753638);
                    fetVar2.r(false);
                    list = ((bol) dolVar).f2938a;
                } else {
                    if (!(dolVar instanceof col)) {
                        throw b1j.f(461051252, fetVar2, false);
                    }
                    fetVar2.e0(1407862603);
                    col colVar5 = (col) dolVar;
                    b0iVar = colVar5.f4706a;
                    iP = P(b0iVar, fetVar2);
                    num = colVar5.b;
                    sh1Var = b0iVar.f1765a;
                    sh1Var2 = sh1.b;
                    if (sh1Var != sh1Var2) {
                        if (num != null) {
                            iIntValue = num.intValue() * iP;
                        } else if (sh1Var == sh1Var2) {
                            iIntValue = 6;
                        } else {
                            rh1Var = b0iVar.b;
                            if (rh1Var == rh1.d) {
                                iIntValue = iP * 5;
                            } else {
                                iIntValue = iP * 7;
                            }
                        }
                    } else if (num != null) {
                        iIntValue = num.intValue() * iP;
                    } else if (sh1Var == sh1Var2) {
                        iIntValue = 6;
                    } else {
                        rh1Var = b0iVar.b;
                        if (rh1Var == rh1.d) {
                            iIntValue = iP * 5;
                        } else {
                            iIntValue = iP * 7;
                        }
                    }
                    arrayList = new ArrayList(iIntValue);
                    while (i8 < iIntValue) {
                        arrayList.add(fol.f9886a);
                    }
                    fetVar2.r(false);
                    list = arrayList;
                }
                iOrdinal = dolVar.a().f1765a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        function8 = function7;
                        function9 = function4;
                        fetVar2.e0(1408759340);
                        l(mm40Var, list, dolVar.a(), hh80Var, function8, function9, fetVar2, i3 & 523278);
                        fetVar2.r(false);
                    } else if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw b1j.f(461067588, fetVar2, false);
                        }
                        fetVar2.e0(1409176259);
                        hh80 hh80Var7 = hh80Var2;
                        function8 = function7;
                        function9 = function4;
                        n(mm40Var2, list, dolVar.a(), hh80Var7, function8, function9, fetVar2, i3 & 523278);
                        fetVar2.r(false);
                    }
                    d9zVar5 = d9zVar4;
                    d9zVar3 = d9zVar5;
                    function5 = function8;
                    function6 = function9;
                }
                Function2 function18 = function4;
                fetVar2.e0(1408308383);
                int i15 = i3 << 3;
                d9zVar5 = d9zVar4;
                Function1 function19 = function7;
                m(mm40Var, list, dolVar.a(), d9zVar5, hh80Var, function19, function18, fetVar2, (i3 & 14) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (i15 & 3670016));
                function8 = function19;
                function9 = function18;
                fetVar2 = fetVar2;
                fetVar2.r(false);
                d9zVar3 = d9zVar5;
                function5 = function8;
                function6 = function9;
            } else {
                fetVar2.X();
                d9zVar3 = d9zVar2;
                function5 = function3;
                function6 = function4;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new hjl(mm40Var, dolVar, d9zVar3, hh80Var, function5, function6, i, i2, (byte) 1);
            }
        }
        i3 |= 384;
        d9zVar2 = d9zVar;
        if ((i & 3072) == 0) {
            hh80Var2 = hh80Var;
            if (fetVar2.g(hh80Var2)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        } else {
            hh80Var2 = hh80Var;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                function3 = function1;
                if (fetVar2.i(function3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    function4 = function2;
                    if (fetVar2.i(function4)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar2.U(i3 & 1, z)) {
                    fetVar2.Z();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            d9zVar2 = null;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            d9zVar4 = d9zVar2;
                            function7 = function3;
                            function4 = null;
                        } else {
                            d9zVar4 = d9zVar2;
                            function7 = function3;
                        }
                    } else {
                        if (i10 != 0) {
                            d9zVar2 = null;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            d9zVar4 = d9zVar2;
                            function7 = function3;
                            function4 = null;
                        } else {
                            d9zVar4 = d9zVar2;
                            function7 = function3;
                        }
                    }
                    fetVar2.s();
                    if (dolVar instanceof bol) {
                        fetVar2.e0(1407753638);
                        fetVar2.r(false);
                        list = ((bol) dolVar).f2938a;
                    } else {
                        if (!(dolVar instanceof col)) {
                            throw b1j.f(461051252, fetVar2, false);
                        }
                        fetVar2.e0(1407862603);
                        col colVar6 = (col) dolVar;
                        b0iVar = colVar6.f4706a;
                        iP = P(b0iVar, fetVar2);
                        num = colVar6.b;
                        sh1Var = b0iVar.f1765a;
                        sh1Var2 = sh1.b;
                        if (sh1Var != sh1Var2) {
                            if (num != null) {
                                iIntValue = num.intValue() * iP;
                            } else if (sh1Var == sh1Var2) {
                                iIntValue = 6;
                            } else {
                                rh1Var = b0iVar.b;
                                if (rh1Var == rh1.d) {
                                    iIntValue = iP * 5;
                                } else {
                                    iIntValue = iP * 7;
                                }
                            }
                        } else if (num != null) {
                            iIntValue = num.intValue() * iP;
                        } else if (sh1Var == sh1Var2) {
                            iIntValue = 6;
                        } else {
                            rh1Var = b0iVar.b;
                            if (rh1Var == rh1.d) {
                                iIntValue = iP * 5;
                            } else {
                                iIntValue = iP * 7;
                            }
                        }
                        arrayList = new ArrayList(iIntValue);
                        while (i8 < iIntValue) {
                            arrayList.add(fol.f9886a);
                        }
                        fetVar2.r(false);
                        list = arrayList;
                    }
                    iOrdinal = dolVar.a().f1765a.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            function8 = function7;
                            function9 = function4;
                            fetVar2.e0(1408759340);
                            l(mm40Var, list, dolVar.a(), hh80Var, function8, function9, fetVar2, i3 & 523278);
                            fetVar2.r(false);
                        } else if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw b1j.f(461067588, fetVar2, false);
                            }
                            fetVar2.e0(1409176259);
                            hh80 hh80Var8 = hh80Var2;
                            function8 = function7;
                            function9 = function4;
                            n(mm40Var2, list, dolVar.a(), hh80Var8, function8, function9, fetVar2, i3 & 523278);
                            fetVar2.r(false);
                        }
                        d9zVar5 = d9zVar4;
                        d9zVar3 = d9zVar5;
                        function5 = function8;
                        function6 = function9;
                    }
                    Function2 function110 = function4;
                    fetVar2.e0(1408308383);
                    int i16 = i3 << 3;
                    d9zVar5 = d9zVar4;
                    Function1 function111 = function7;
                    m(mm40Var, list, dolVar.a(), d9zVar5, hh80Var, function111, function110, fetVar2, (i3 & 14) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (i16 & 3670016));
                    function8 = function111;
                    function9 = function110;
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                    d9zVar3 = d9zVar5;
                    function5 = function8;
                    function6 = function9;
                } else {
                    fetVar2.X();
                    d9zVar3 = d9zVar2;
                    function5 = function3;
                    function6 = function4;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new hjl(mm40Var, dolVar, d9zVar3, hh80Var, function5, function6, i, i2, (byte) 1);
                }
            }
            i3 |= 196608;
            function4 = function2;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                fetVar2.Z();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        d9zVar2 = null;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        d9zVar4 = d9zVar2;
                        function7 = function3;
                        function4 = null;
                    } else {
                        d9zVar4 = d9zVar2;
                        function7 = function3;
                    }
                } else {
                    if (i10 != 0) {
                        d9zVar2 = null;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        d9zVar4 = d9zVar2;
                        function7 = function3;
                        function4 = null;
                    } else {
                        d9zVar4 = d9zVar2;
                        function7 = function3;
                    }
                }
                fetVar2.s();
                if (dolVar instanceof bol) {
                    fetVar2.e0(1407753638);
                    fetVar2.r(false);
                    list = ((bol) dolVar).f2938a;
                } else {
                    if (!(dolVar instanceof col)) {
                        throw b1j.f(461051252, fetVar2, false);
                    }
                    fetVar2.e0(1407862603);
                    col colVar7 = (col) dolVar;
                    b0iVar = colVar7.f4706a;
                    iP = P(b0iVar, fetVar2);
                    num = colVar7.b;
                    sh1Var = b0iVar.f1765a;
                    sh1Var2 = sh1.b;
                    if (sh1Var != sh1Var2) {
                        if (num != null) {
                            iIntValue = num.intValue() * iP;
                        } else if (sh1Var == sh1Var2) {
                            iIntValue = 6;
                        } else {
                            rh1Var = b0iVar.b;
                            if (rh1Var == rh1.d) {
                                iIntValue = iP * 5;
                            } else {
                                iIntValue = iP * 7;
                            }
                        }
                    } else if (num != null) {
                        iIntValue = num.intValue() * iP;
                    } else if (sh1Var == sh1Var2) {
                        iIntValue = 6;
                    } else {
                        rh1Var = b0iVar.b;
                        if (rh1Var == rh1.d) {
                            iIntValue = iP * 5;
                        } else {
                            iIntValue = iP * 7;
                        }
                    }
                    arrayList = new ArrayList(iIntValue);
                    while (i8 < iIntValue) {
                        arrayList.add(fol.f9886a);
                    }
                    fetVar2.r(false);
                    list = arrayList;
                }
                iOrdinal = dolVar.a().f1765a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        function8 = function7;
                        function9 = function4;
                        fetVar2.e0(1408759340);
                        l(mm40Var, list, dolVar.a(), hh80Var, function8, function9, fetVar2, i3 & 523278);
                        fetVar2.r(false);
                    } else if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw b1j.f(461067588, fetVar2, false);
                        }
                        fetVar2.e0(1409176259);
                        hh80 hh80Var9 = hh80Var2;
                        function8 = function7;
                        function9 = function4;
                        n(mm40Var2, list, dolVar.a(), hh80Var9, function8, function9, fetVar2, i3 & 523278);
                        fetVar2.r(false);
                    }
                    d9zVar5 = d9zVar4;
                    d9zVar3 = d9zVar5;
                    function5 = function8;
                    function6 = function9;
                }
                Function2 function112 = function4;
                fetVar2.e0(1408308383);
                int i17 = i3 << 3;
                d9zVar5 = d9zVar4;
                Function1 function113 = function7;
                m(mm40Var, list, dolVar.a(), d9zVar5, hh80Var, function113, function112, fetVar2, (i3 & 14) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (i17 & 3670016));
                function8 = function113;
                function9 = function112;
                fetVar2 = fetVar2;
                fetVar2.r(false);
                d9zVar3 = d9zVar5;
                function5 = function8;
                function6 = function9;
            } else {
                fetVar2.X();
                d9zVar3 = d9zVar2;
                function5 = function3;
                function6 = function4;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new hjl(mm40Var, dolVar, d9zVar3, hh80Var, function5, function6, i, i2, (byte) 1);
            }
        }
        i3 |= 24576;
        function3 = function1;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                function4 = function2;
                if (fetVar2.i(function4)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                fetVar2.Z();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        d9zVar2 = null;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        d9zVar4 = d9zVar2;
                        function7 = function3;
                        function4 = null;
                    } else {
                        d9zVar4 = d9zVar2;
                        function7 = function3;
                    }
                } else {
                    if (i10 != 0) {
                        d9zVar2 = null;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        d9zVar4 = d9zVar2;
                        function7 = function3;
                        function4 = null;
                    } else {
                        d9zVar4 = d9zVar2;
                        function7 = function3;
                    }
                }
                fetVar2.s();
                if (dolVar instanceof bol) {
                    fetVar2.e0(1407753638);
                    fetVar2.r(false);
                    list = ((bol) dolVar).f2938a;
                } else {
                    if (!(dolVar instanceof col)) {
                        throw b1j.f(461051252, fetVar2, false);
                    }
                    fetVar2.e0(1407862603);
                    col colVar8 = (col) dolVar;
                    b0iVar = colVar8.f4706a;
                    iP = P(b0iVar, fetVar2);
                    num = colVar8.b;
                    sh1Var = b0iVar.f1765a;
                    sh1Var2 = sh1.b;
                    if (sh1Var != sh1Var2) {
                        if (num != null) {
                            iIntValue = num.intValue() * iP;
                        } else if (sh1Var == sh1Var2) {
                            iIntValue = 6;
                        } else {
                            rh1Var = b0iVar.b;
                            if (rh1Var == rh1.d) {
                                iIntValue = iP * 5;
                            } else {
                                iIntValue = iP * 7;
                            }
                        }
                    } else if (num != null) {
                        iIntValue = num.intValue() * iP;
                    } else if (sh1Var == sh1Var2) {
                        iIntValue = 6;
                    } else {
                        rh1Var = b0iVar.b;
                        if (rh1Var == rh1.d) {
                            iIntValue = iP * 5;
                        } else {
                            iIntValue = iP * 7;
                        }
                    }
                    arrayList = new ArrayList(iIntValue);
                    while (i8 < iIntValue) {
                        arrayList.add(fol.f9886a);
                    }
                    fetVar2.r(false);
                    list = arrayList;
                }
                iOrdinal = dolVar.a().f1765a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        function8 = function7;
                        function9 = function4;
                        fetVar2.e0(1408759340);
                        l(mm40Var, list, dolVar.a(), hh80Var, function8, function9, fetVar2, i3 & 523278);
                        fetVar2.r(false);
                    } else if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw b1j.f(461067588, fetVar2, false);
                        }
                        fetVar2.e0(1409176259);
                        hh80 hh80Var10 = hh80Var2;
                        function8 = function7;
                        function9 = function4;
                        n(mm40Var2, list, dolVar.a(), hh80Var10, function8, function9, fetVar2, i3 & 523278);
                        fetVar2.r(false);
                    }
                    d9zVar5 = d9zVar4;
                    d9zVar3 = d9zVar5;
                    function5 = function8;
                    function6 = function9;
                }
                Function2 function114 = function4;
                fetVar2.e0(1408308383);
                int i18 = i3 << 3;
                d9zVar5 = d9zVar4;
                Function1 function115 = function7;
                m(mm40Var, list, dolVar.a(), d9zVar5, hh80Var, function115, function114, fetVar2, (i3 & 14) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (i18 & 3670016));
                function8 = function115;
                function9 = function114;
                fetVar2 = fetVar2;
                fetVar2.r(false);
                d9zVar3 = d9zVar5;
                function5 = function8;
                function6 = function9;
            } else {
                fetVar2.X();
                d9zVar3 = d9zVar2;
                function5 = function3;
                function6 = function4;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new hjl(mm40Var, dolVar, d9zVar3, hh80Var, function5, function6, i, i2, (byte) 1);
            }
        }
        i3 |= 196608;
        function4 = function2;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar2.U(i3 & 1, z)) {
            fetVar2.Z();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    d9zVar2 = null;
                }
                if (i4 != 0) {
                    function3 = null;
                }
                if (i6 != 0) {
                    d9zVar4 = d9zVar2;
                    function7 = function3;
                    function4 = null;
                } else {
                    d9zVar4 = d9zVar2;
                    function7 = function3;
                }
            } else {
                if (i10 != 0) {
                    d9zVar2 = null;
                }
                if (i4 != 0) {
                    function3 = null;
                }
                if (i6 != 0) {
                    d9zVar4 = d9zVar2;
                    function7 = function3;
                    function4 = null;
                } else {
                    d9zVar4 = d9zVar2;
                    function7 = function3;
                }
            }
            fetVar2.s();
            if (dolVar instanceof bol) {
                fetVar2.e0(1407753638);
                fetVar2.r(false);
                list = ((bol) dolVar).f2938a;
            } else {
                if (!(dolVar instanceof col)) {
                    throw b1j.f(461051252, fetVar2, false);
                }
                fetVar2.e0(1407862603);
                col colVar9 = (col) dolVar;
                b0iVar = colVar9.f4706a;
                iP = P(b0iVar, fetVar2);
                num = colVar9.b;
                sh1Var = b0iVar.f1765a;
                sh1Var2 = sh1.b;
                if (sh1Var != sh1Var2) {
                    if (num != null) {
                        iIntValue = num.intValue() * iP;
                    } else if (sh1Var == sh1Var2) {
                        iIntValue = 6;
                    } else {
                        rh1Var = b0iVar.b;
                        if (rh1Var == rh1.d) {
                            iIntValue = iP * 5;
                        } else {
                            iIntValue = iP * 7;
                        }
                    }
                } else if (num != null) {
                    iIntValue = num.intValue() * iP;
                } else if (sh1Var == sh1Var2) {
                    iIntValue = 6;
                } else {
                    rh1Var = b0iVar.b;
                    if (rh1Var == rh1.d) {
                        iIntValue = iP * 5;
                    } else {
                        iIntValue = iP * 7;
                    }
                }
                arrayList = new ArrayList(iIntValue);
                while (i8 < iIntValue) {
                    arrayList.add(fol.f9886a);
                }
                fetVar2.r(false);
                list = arrayList;
            }
            iOrdinal = dolVar.a().f1765a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    function8 = function7;
                    function9 = function4;
                    fetVar2.e0(1408759340);
                    l(mm40Var, list, dolVar.a(), hh80Var, function8, function9, fetVar2, i3 & 523278);
                    fetVar2.r(false);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw b1j.f(461067588, fetVar2, false);
                    }
                    fetVar2.e0(1409176259);
                    hh80 hh80Var11 = hh80Var2;
                    function8 = function7;
                    function9 = function4;
                    n(mm40Var2, list, dolVar.a(), hh80Var11, function8, function9, fetVar2, i3 & 523278);
                    fetVar2.r(false);
                }
                d9zVar5 = d9zVar4;
                d9zVar3 = d9zVar5;
                function5 = function8;
                function6 = function9;
            }
            Function2 function116 = function4;
            fetVar2.e0(1408308383);
            int i19 = i3 << 3;
            d9zVar5 = d9zVar4;
            Function1 function117 = function7;
            m(mm40Var, list, dolVar.a(), d9zVar5, hh80Var, function117, function116, fetVar2, (i3 & 14) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016));
            function8 = function117;
            function9 = function116;
            fetVar2 = fetVar2;
            fetVar2.r(false);
            d9zVar3 = d9zVar5;
            function5 = function8;
            function6 = function9;
        } else {
            fetVar2.X();
            d9zVar3 = d9zVar2;
            function5 = function3;
            function6 = function4;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hjl(mm40Var, dolVar, d9zVar3, hh80Var, function5, function6, i, i2, (byte) 1);
        }
    }

    public static final void l(mm40 mm40Var, List list, b0i b0iVar, hh80 hh80Var, Function1 function1, Function2 function2, fet fetVar, int i) {
        int i2;
        b0i b0iVar2;
        Function2 function3;
        fetVar.g0(-1211136554);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            b0iVar2 = b0iVar;
            i2 |= fetVar.g(b0iVar2) ? 256 : 128;
        } else {
            b0iVar2 = b0iVar;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(hh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function3 = function2;
            i2 |= fetVar.i(function3) ? 131072 : 65536;
        } else {
            function3 = function2;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(list))) | ((i3 & 896) == 256) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                vnl vnlVar = new vnl(list, b0iVar2, function1, function3, (byte) 0);
                fetVar.o0(vnlVar);
                objP = vnlVar;
            }
            b8k0.f(mm40Var, null, hh80Var, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i3 & 14) | ((i3 >> 3) & 896), 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wnl(mm40Var, list, b0iVar, hh80Var, function1, function2, i, (byte) 0);
        }
    }

    public static final void m(mm40 mm40Var, List list, b0i b0iVar, d9z d9zVar, hh80 hh80Var, Function1 function1, Function2 function2, fet fetVar, int i) {
        int i2;
        Function1 function3;
        Function2 function4;
        float f;
        d9z d9zVar2;
        Object vnlVar;
        rh1 rh1Var;
        fetVar.g0(35102643);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(b0iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(d9zVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(hh80Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function3 = function1;
            i2 |= fetVar.i(function3) ? 131072 : 65536;
        } else {
            function3 = function1;
        }
        if ((1572864 & i) == 0) {
            function4 = function2;
            i2 |= fetVar.i(function4) ? 1048576 : 524288;
        } else {
            function4 = function2;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            if (b0iVar.f1765a == sh1.f32187a && ((rh1Var = b0iVar.b) == rh1.d || rh1Var == rh1.e)) {
                zcl zclVar = qmk.f28987a;
                f = 4.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 8.0f;
            }
            mm40 mm40VarE0 = o2e.e0(mm40Var, "AVAILABLE_PROVIDERS_LAZY_GRID");
            if (d9zVar == null) {
                fetVar.e0(-626076534);
                d9z d9zVarA = f9z.a(fetVar);
                fetVar.r(false);
                d9zVar2 = d9zVarA;
            } else {
                fetVar.e0(-626077061);
                fetVar.r(false);
                d9zVar2 = d9zVar;
            }
            ngv ngvVar = new ngv(P(b0iVar, fetVar));
            byte b = 14;
            qw3 qw3Var = new qw3(f, true, new jf4(b));
            qw3 qw3Var2 = new qw3(f, true, new jf4(b));
            boolean z = ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(list))) | ((i3 & 896) == 256) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                vnlVar = new vnl(list, b0iVar, function3, function4, (byte) 1);
                fetVar.o0(vnlVar);
            } else {
                vnlVar = objP;
            }
            g8x.i(ngvVar, mm40VarE0, d9zVar2, hh80Var, qw3Var2, qw3Var, null, false, null, (Function1) vnlVar, fetVar, (i3 >> 3) & 7168, 912);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) mm40Var, (Object) list, (Object) b0iVar, (Object) d9zVar, (Object) hh80Var, (Object) function1, (Object) function2, i, (byte) 6);
        }
    }

    public static final void n(mm40 mm40Var, List list, b0i b0iVar, hh80 hh80Var, Function1 function1, Function2 function2, fet fetVar, int i) {
        int i2;
        Function1 function3;
        Object obj;
        float f;
        rh1 rh1Var;
        fetVar.g0(-1523396920);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(b0iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(hh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function3 = function1;
            i2 |= fetVar.i(function3) ? 16384 : 8192;
        } else {
            function3 = function1;
        }
        if ((i & 196608) == 0) {
            obj = function2;
            i2 |= fetVar.i(obj) ? 131072 : 65536;
        } else {
            obj = function2;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            if (b0iVar.f1765a == sh1.f32187a && ((rh1Var = b0iVar.b) == rh1.d || rh1Var == rh1.e)) {
                zcl zclVar = qmk.f28987a;
                f = 4.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 8.0f;
            }
            byte b = 14;
            J(o7k0.d(mm40Var, 1.0f), P(b0iVar, fetVar), hh80Var, new qw3(f, true, new jf4(b)), new qw3(f, true, new jf4(b)), u1c.M(973759734, new eqk((Object) list, (Object) b0iVar, function3, obj, (byte) 4), fetVar), fetVar, ((i3 >> 3) & 896) | 196608);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wnl(mm40Var, list, b0iVar, hh80Var, function1, function2, i, (byte) 1);
        }
    }

    public static final void o(mm40 mm40Var, final float f, long j, fet fetVar, final int i, final int i2) {
        int i3;
        int i4;
        fetVar.g0(-436995422);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | (fetVar.d(f) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
        } else {
            i4 = i6 | (fetVar.f(j) ? 256 : 128);
        }
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                mm40Var = jm40.b;
            }
            if (i7 != 0) {
                j = y3d.f;
            }
            qxw.o(fetVar, o7k0.e(o7k0.d(i120.Q(mm40Var, j, jd8.n), 1.0f), f));
        } else {
            fetVar.X();
        }
        final mm40 mm40Var2 = mm40Var;
        final long j2 = j;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.cul
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wvb.o(mm40Var2, f, j2, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void p(mm40 mm40Var, m7m m7mVar, boolean z, long j, Function2 function2, Function2 function3, fet fetVar, int i) {
        mm40 mm40Var2;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        cbm cbmVar = m7mVar.b;
        jbm jbmVar = m7mVar.c;
        jbm jbmVar2 = m7mVar.f21326a;
        xx7 xx7Var = gqw0.m;
        function2.getClass();
        function3.getClass();
        fetVar.g0(1763878038);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(m7mVar) ? 32 : 16) | (fetVar.f(j) ? 2048 : 1024) | (fetVar.i(function3) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            boolean zD = pkd.d(fetVar);
            jm40 jm40Var = jm40.b;
            pcy pcyVar = e7z.u1;
            if (zD) {
                fetVar.e0(-1233844474);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = androidx.compose.runtime.e.b(0);
                    fetVar.o0(objP);
                }
                cgk0 cgk0Var = (cgk0) objP;
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar4);
                jpm0.o(fetVar, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                x7z x7zVarI = ohs0.i(fetVar, mm40VarC0, shdVar, 1.0f, true);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new nw6(cgk0Var, (byte) 11);
                    fetVar.o0(objP2);
                }
                mm40 mm40VarY = fre0.Y(x7zVarI, (Function1) objP2);
                x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarY);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                int i3 = (i2 & 7168) | 24966 | (i2 & 458752);
                obc.p(jbmVar2, z, j, function2, function3, fetVar, i3);
                obc.p(jbmVar, z, j, function2, function3, fetVar, i3);
                fetVar.r(true);
                ro4.z(o7k0.e(jm40Var, ((w6k) fetVar.k(bmd.h)).r0(cgk0Var.l())), true, cbmVar, fetVar, 48);
                fetVar.r(true);
                fetVar.r(false);
                mm40Var2 = mm40Var;
            } else {
                fetVar.e0(-1232387877);
                zcl zclVar2 = qmk.f28987a;
                x5d x5dVarA2 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 0);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40Var2 = mm40Var;
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40Var2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar4);
                jpm0.o(fetVar, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar);
                int i4 = (i2 & 7168) | 24966 | (i2 & 458752);
                obc.p(jbmVar2, z, j, function2, function3, fetVar, i4);
                ro4.z(jm40Var, false, cbmVar, fetVar, 54);
                obc.p(jbmVar, z, j, function2, function3, fetVar, i4);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m2d(mm40Var2, m7mVar, z, j, function2, function3, i);
        }
    }

    public static final void q(mm40 mm40Var, hnm hnmVar, int i, kly klyVar, Function0 function0, Function1 function1, Function1 function2, fet fetVar, int i2) {
        Function0 function3;
        String strB;
        fet fetVar2 = fetVar;
        hnmVar.getClass();
        klyVar.getClass();
        fetVar2.g0(-868342200);
        int i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2 | (fetVar2.g(hnmVar) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.e(i) ? 256 : 128;
        }
        int i4 = i3 | (fetVar2.g(klyVar) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192) | (fetVar2.i(function1) ? 131072 : 65536) | (fetVar2.i(function2) ? 1048576 : 524288);
        if (fetVar2.U(i4 & 1, (599187 & i4) != 599186)) {
            thg0 thg0VarA = shg0.a(rq8.f30919a, gqw0.j, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            long secondary60 = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary60();
            zmm zmmVar = hnmVar.f13358a;
            anm anmVar = hnmVar.c;
            knm knmVar = hnmVar.b;
            yu90 yu90Var = knmVar.e;
            bm90 bm90Var = knmVar.c;
            boolean zG = fetVar2.g(zmmVar);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                if (zmmVar instanceof xmm) {
                    objP = new d6q0(new y3d(secondary60), new m0x(R.drawable.ic_glyph_language, null, 6), Integer.valueOf(R.drawable.ic_glyph_language));
                } else {
                    if (!(zmmVar instanceof ymm)) {
                        t9f.b();
                        return;
                    }
                    ymm ymmVar = (ymm) zmmVar;
                    o0x o0xVar = ymmVar.b;
                    Integer num = ymmVar.e;
                    objP = new d6q0(ymmVar.f, o0xVar, Integer.valueOf(num != null ? num.intValue() : R.drawable.ic_glyph_language));
                }
                fetVar2.o0(objP);
            } else {
                yu90Var = yu90Var;
                bm90Var = bm90Var;
            }
            d6q0 d6q0Var = (d6q0) objP;
            boolean z2 = fetVar2.k(bmd.n) == k6z.b;
            boolean zG2 = fetVar2.g(zmmVar);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                if (zmmVar instanceof xmm) {
                    objP2 = "";
                } else {
                    if (!(zmmVar instanceof ymm)) {
                        t9f.b();
                        return;
                    }
                    objP2 = wwb.F(((ymm) zmmVar).f42897a, z2);
                }
                fetVar2.o0(objP2);
            }
            String str = (String) objP2;
            boolean zH = fetVar2.h(zmmVar.b());
            Object objP3 = fetVar2.P();
            o6q0 o6q0Var = o6q0.f24750a;
            if (zH || objP3 == cl5Var) {
                objP3 = zmmVar.b() ? g6q0.f10780a : o6q0Var;
                fetVar2.o0(objP3);
            }
            p6q0 p6q0Var = (p6q0) objP3;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
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
            mm40 mm40VarY0 = q8a.y0(jm40Var, enx.f8115a);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarZ = s5x0.z(mm40VarY0);
            c6q0 c6q0Var = new c6q0(str, d6q0Var, p6q0Var, r7q0.f29989a, true, false, null, zmmVar.a(), null, false, 0, null, 195968);
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = new aim((byte) 7);
                fetVar2.o0(objP4);
            }
            t(mm40VarZ, c6q0Var, 0, null, (Function1) objP4, fetVar2, 24576, 12);
            mm40 mm40VarR = ffb0.R(jr8.f16991a.a(jm40Var), 0.0f, 2.0f, 1);
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP5;
            int i5 = i4 & 112;
            boolean z3 = (i5 == 32) | ((57344 & i4) == 16384);
            Object objP6 = fetVar2.P();
            if (z3 || objP6 == cl5Var) {
                function3 = function0;
                objP6 = new lrk(hnmVar, function3, (byte) 29);
                fetVar2.o0(objP6);
            } else {
                function3 = function0;
            }
            zq8.a(0, fetVar2, y860.W(mm40VarR, gy40Var, null, false, null, (Function0) objP6, 28));
            fetVar2.r(true);
            bm90 bm90Var2 = bm90Var;
            boolean zG3 = fetVar2.g(bm90Var2);
            Object objP7 = fetVar2.P();
            if (zG3 || objP7 == cl5Var) {
                objP7 = new lm90(g8x.P(bm90Var2), TokenNames.X);
                fetVar2.o0(objP7);
            }
            lm90 lm90Var = (lm90) objP7;
            yu90 yu90Var2 = yu90Var;
            boolean zG4 = fetVar2.g(yu90Var2) | fetVar2.g(bm90Var2);
            Object objP8 = fetVar2.P();
            if (zG4 || objP8 == cl5Var) {
                if (yu90Var2.equals(xu90.f41499a)) {
                    int iQ = g8x.Q(bm90Var2);
                    int i6 = 0;
                    String string = "";
                    while (i6 < iQ) {
                        i6++;
                        StringBuilder sb = new StringBuilder();
                        sb.append((Object) string);
                        sb.append(i6);
                        string = sb.toString();
                    }
                    strB = lm90Var.b(string);
                } else {
                    strB = yu90Var2.f43258a;
                }
                objP8 = strB;
                fetVar2.o0(objP8);
            }
            String str2 = (String) objP8;
            boolean zG5 = fetVar2.g(anmVar);
            Object objP9 = fetVar2.P();
            if (zG5 || objP9 == cl5Var) {
                objP9 = anmVar != null ? new s7q0(anmVar.f1162a) : new s7q0("");
                fetVar2.o0(objP9);
            }
            s7q0 s7q0Var = (s7q0) objP9;
            String str3 = knmVar.f18593a;
            String strP = g8x.P(bm90Var2);
            oie.f25306a.getClass();
            c6q0 c6q0Var2 = new c6q0(str3, e6q0.f7299a, o6q0Var, s7q0Var, !(zmmVar instanceof xmm), anmVar != null, new z5q0(strP, mie.m), knmVar.b, str2, true, 0, null, 192768);
            boolean zG6 = (i5 == 32) | ((458752 & i4) == 131072) | ((3670016 & i4) == 1048576) | fetVar2.g(lm90Var);
            Object objP10 = fetVar2.P();
            if (zG6 || objP10 == cl5Var) {
                enm enmVar = new enm((Object) hnmVar, (Object) function1, (Object) function2, (Object) lm90Var, (byte) 0);
                fetVar2.o0(enmVar);
                objP10 = enmVar;
            }
            fetVar2 = fetVar2;
            t(null, c6q0Var2, i, klyVar, (Function1) objP10, fetVar2, i4 & 8064, 1);
            fetVar2.r(true);
        } else {
            function3 = function0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fnm(mm40Var, hnmVar, i, klyVar, function3, function1, function2, i2, (byte) 0);
        }
    }

    public static final void r(mm40 mm40Var, jvm jvmVar, jvm jvmVar2, a2m a2mVar, String str, a4x a4xVar, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        a4xVar.getClass();
        fetVar.g0(163489805);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(jvmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(jvmVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(a2mVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(a4xVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.h(z) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            if (z) {
                fetVar.e0(-1800074540);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1800073616);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-1846899507, new ecc((Object) mm40Var, (Object) jvmVar, (Object) jvmVar2, (Object) a2mVar, z, (Object) a4xVar, (Object) str, (byte) 5), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var, (Object) jvmVar, (Object) jvmVar2, (Object) a2mVar, str, (Object) a4xVar, z, i, (byte) 8);
        }
    }

    public static final void s(mm40 mm40Var, tzm tzmVar, fet fetVar, int i) {
        if (tzmVar instanceof ozm) {
            fetVar.e0(900601506);
            ozm ozmVar = (ozm) tzmVar;
            uzm uzmVar = ozmVar.f26107a;
            uzm uzmVar2 = ozmVar.b;
            mpm mpmVar = ozmVar.c;
            jwm jwmVar = ozmVar.d;
            jwm jwmVar2 = ozmVar.e;
            jwm jwmVar3 = ozmVar.f;
            uso0 uso0Var = uso0.f36223a;
            jiq0.z(mm40Var, uzmVar, uzmVar2, mpmVar, jwmVar, jwmVar2, jwmVar3, ozmVar.g, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (tzmVar instanceof pzm) {
            fetVar.e0(901207866);
            pzm pzmVar = (pzm) tzmVar;
            vzm vzmVar = pzmVar.f27853a;
            vzm vzmVar2 = pzmVar.b;
            jwm jwmVar4 = pzmVar.c;
            jwm jwmVar5 = pzmVar.d;
            jwm jwmVar6 = pzmVar.e;
            uso0 uso0Var2 = uso0.f36223a;
            jwb.n(mm40Var, vzmVar, vzmVar2, jwmVar4, jwmVar5, jwmVar6, pzmVar.f, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (tzmVar instanceof qzm) {
            fetVar.e0(901782699);
            qzm qzmVar = (qzm) tzmVar;
            wzm wzmVar = qzmVar.f29585a;
            wzm wzmVar2 = qzmVar.b;
            String str = qzmVar.c;
            jwm jwmVar7 = qzmVar.d;
            jwm jwmVar8 = qzmVar.e;
            jwm jwmVar9 = qzmVar.f;
            uso0 uso0Var3 = uso0.f36223a;
            wwb.m(mm40Var, wzmVar, wzmVar2, str, jwmVar7, jwmVar8, jwmVar9, qzmVar.g, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (tzmVar instanceof rzm) {
            fetVar.e0(902416246);
            rzm rzmVar = (rzm) tzmVar;
            xzm xzmVar = rzmVar.f31368a;
            xzm xzmVar2 = rzmVar.b;
            a2m a2mVar = rzmVar.c;
            jwm jwmVar10 = rzmVar.d;
            jwm jwmVar11 = rzmVar.e;
            jwm jwmVar12 = rzmVar.f;
            uso0 uso0Var4 = uso0.f36223a;
            fxb.o(mm40Var, xzmVar, xzmVar2, a2mVar, jwmVar10, jwmVar11, jwmVar12, rzmVar.g, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (!(tzmVar instanceof szm)) {
            throw b1j.f(-1494969535, fetVar, false);
        }
        fetVar.e0(903049142);
        szm szmVar = (szm) tzmVar;
        yzm yzmVar = szmVar.f33076a;
        yzm yzmVar2 = szmVar.b;
        a2m a2mVar2 = szmVar.c;
        String str2 = szmVar.d;
        jwm jwmVar13 = szmVar.e;
        jwm jwmVar14 = szmVar.f;
        uso0 uso0Var5 = uso0.f36223a;
        dyb.t(mm40Var, yzmVar, yzmVar2, a2mVar2, str2, jwmVar13, jwmVar14, szmVar.g, fetVar, i & 14);
        fetVar.r(false);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x014f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0168  */
    /* JADX WARN: Code duplicated, block: B:110:0x019b A[LOOP:0: B:109:0x0199->B:110:0x019b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:119:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:126:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:137:0x0201  */
    /* JADX WARN: Code duplicated, block: B:139:0x0205  */
    /* JADX WARN: Code duplicated, block: B:140:0x020a  */
    /* JADX WARN: Code duplicated, block: B:142:0x020e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0214  */
    /* JADX WARN: Code duplicated, block: B:145:0x021c  */
    /* JADX WARN: Code duplicated, block: B:148:0x025a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0309  */
    /* JADX WARN: Code duplicated, block: B:152:0x030d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0311  */
    /* JADX WARN: Code duplicated, block: B:156:0x0315  */
    /* JADX WARN: Code duplicated, block: B:159:0x0321  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:85:0x0102  */
    /* JADX WARN: Code duplicated, block: B:86:0x0108  */
    /* JADX WARN: Code duplicated, block: B:88:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x0129  */
    /* JADX WARN: Code duplicated, block: B:96:0x0142 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0144  */
    /* JADX WARN: Code duplicated, block: B:99:0x0148  */
    public static final void t(mm40 mm40Var, c6q0 c6q0Var, int i, kly klyVar, Function1 function1, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        int i5;
        int i6;
        kly klyVar2;
        int i7;
        boolean z;
        mm40 mm40Var3;
        int i8;
        kly klyVar3;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        int i9;
        kly klyVar4;
        p6q0 p6q0Var;
        b6q0 b6q0Var;
        boolean zH;
        Object objP;
        cl5 cl5Var;
        float f;
        boolean zG;
        Object objP2;
        int i10;
        boolean zG2;
        Object objP3;
        boolean zBooleanValue;
        boolean zG3;
        Object objP4;
        boolean z2;
        Object objP5;
        pz40 pz40Var;
        Object[] objArrCopyOf;
        int length;
        boolean zG4;
        int i11;
        Object objP6;
        oie oieVar;
        Object objP7;
        int i12;
        uuu0 uuu0Var = gfk0.f;
        c6q0Var.getClass();
        boolean z3 = c6q0Var.e;
        function1.getClass();
        fetVar.g0(-2027314648);
        int i13 = i3 & 1;
        if (i13 != 0) {
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
            i4 |= fetVar.g(c6q0Var) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 == 0) {
            if ((i2 & 384) == 0) {
                i5 = i;
                i4 |= fetVar.e(i5) ? 256 : 128;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 3072) == 0) {
                    klyVar2 = klyVar;
                    if (fetVar.g(klyVar2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i4 |= i7;
                }
                if ((i2 & 24576) != 0) {
                    if (fetVar.i(function1)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i4 |= i12;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i13 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i14 != 0) {
                        i9 = -1;
                    } else {
                        i9 = i5;
                    }
                    if (i6 != 0) {
                        klyVar4 = kly.d;
                    } else {
                        klyVar4 = klyVar2;
                    }
                    p6q0Var = c6q0Var.c;
                    b6q0Var = c6q0Var.g;
                    zH = fetVar.h(z3);
                    objP = fetVar.P();
                    cl5Var = ukd.f35823a;
                    if (zH || objP == cl5Var) {
                        if (z3) {
                            f = 1.0f;
                        } else {
                            f = 0.5f;
                        }
                        objP = Float.valueOf(f);
                        fetVar.o0(objP);
                    }
                    float fFloatValue = ((Number) objP).floatValue();
                    zG = fetVar.g(b6q0Var);
                    objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        if (b6q0Var == null) {
                            i10 = 0;
                        } else if (b6q0Var instanceof a6q0) {
                            if (((a6q0) b6q0Var).f329a) {
                                i10 = 8;
                            } else {
                                i10 = 7;
                            }
                        } else if (b6q0Var instanceof y5q0) {
                            i10 = ((y5q0) b6q0Var).f42061a;
                        } else if (!(b6q0Var instanceof z5q0)) {
                            t9f.b();
                            return;
                        } else {
                            i10 = 9;
                        }
                        objP2 = new bmy(i10);
                        fetVar.o0(objP2);
                    }
                    int i15 = ((bmy) objP2).f2857a;
                    zG2 = fetVar.g(b6q0Var);
                    objP3 = fetVar.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = Boolean.valueOf(b6q0Var instanceof a6q0);
                        fetVar.o0(objP3);
                    }
                    zBooleanValue = ((Boolean) objP3).booleanValue();
                    zG3 = fetVar.g(p6q0Var);
                    objP4 = fetVar.P();
                    if (zG3 || objP4 == cl5Var) {
                        if (!(p6q0Var instanceof i6q0) || (p6q0Var instanceof l6q0)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP4 = Boolean.valueOf(z2);
                        fetVar.o0(objP4);
                    }
                    Boolean bool = (Boolean) objP4;
                    boolean zBooleanValue2 = bool.booleanValue();
                    Object[] objArr = new Object[0];
                    objP5 = fetVar.P();
                    if (objP5 == cl5Var) {
                        objP5 = new ndm((byte) 23);
                        fetVar.o0(objP5);
                    }
                    pz40Var = (pz40) e9x.Q(objArr, (Function0) objP5, fetVar, 48);
                    Boolean bool2 = (Boolean) pz40Var.getValue();
                    bool2.booleanValue();
                    objArrCopyOf = Arrays.copyOf(new Object[]{b6q0Var, bool, bool2}, 3);
                    boolean zE = fetVar.e(objArrCopyOf.length);
                    length = objArrCopyOf.length;
                    zG4 = zE;
                    i11 = 0;
                    while (i11 < length) {
                        zG4 |= fetVar.g(objArrCopyOf[i11]);
                        i11++;
                        pz40Var = pz40Var;
                    }
                    pz40 pz40Var2 = pz40Var;
                    objP6 = fetVar.P();
                    if (zG4 || objP6 == cl5Var) {
                        if (b6q0Var == null) {
                            objP6 = uuu0Var;
                        } else if (b6q0Var instanceof a6q0) {
                            if (zBooleanValue || (!((Boolean) pz40Var2.getValue()).booleanValue() && zBooleanValue2)) {
                                objP6 = uuu0Var;
                            } else {
                                objP6 = new v190();
                            }
                        } else if (b6q0Var instanceof y5q0) {
                            objP6 = ((y5q0) b6q0Var).b;
                        } else if (!(b6q0Var instanceof z5q0)) {
                            t9f.b();
                            return;
                        } else {
                            z5q0 z5q0Var = (z5q0) b6q0Var;
                            objP6 = new lm90(z5q0Var.f43831a, z5q0Var.b);
                        }
                        fetVar.o0(objP6);
                    }
                    vuu0 vuu0Var = (vuu0) objP6;
                    if (b6q0Var == null) {
                        oieVar = null;
                    } else if (b6q0Var instanceof y5q0) {
                        oieVar = ((y5q0) b6q0Var).c;
                    } else if (b6q0Var instanceof z5q0) {
                        oieVar = ((z5q0) b6q0Var).c;
                    } else if (b6q0Var instanceof a6q0) {
                        t9f.b();
                        return;
                    } else if (((a6q0) b6q0Var).b) {
                        oie.f25306a.getClass();
                        oieVar = mie.e;
                    } else {
                        oie.f25306a.getClass();
                        oieVar = mie.c;
                    }
                    oie oieVar2 = oieVar;
                    String str = c6q0Var.f3831a;
                    String str2 = c6q0Var.i;
                    String str3 = c6q0Var.j;
                    boolean z4 = c6q0Var.e;
                    boolean z5 = p6q0Var instanceof g6q0;
                    q7q0 q7q0Var = c6q0Var.h;
                    boolean z6 = c6q0Var.f;
                    boolean z7 = c6q0Var.l;
                    String str4 = c6q0Var.n;
                    Integer num = c6q0Var.o;
                    zcl zclVar = qmk.f28987a;
                    boolean z8 = c6q0Var.p;
                    boolean z9 = c6q0Var.k;
                    a7n a7nVar = c6q0Var.q;
                    int i16 = c6q0Var.m;
                    objP7 = fetVar.P();
                    if (objP7 == cl5Var) {
                        objP7 = new aim((byte) 15);
                        fetVar.o0(objP7);
                    }
                    h36.a(epv0.N(pai0.a(mm40Var4, true, (Function1) objP7), fFloatValue), str, q7q0Var, str2, str3, z4, true, z5, z6, true, oieVar2, z9, z7, str4, num, false, vuu0Var, false, 0L, null, null, i15, i9, klyVar4, 4.0f, 0.0f, 0.0f, null, null, z8, 0.0f, i16, a7nVar, null, function1, u1c.M(1777050, new elm(c6q0Var, (byte) 2), fetVar), u1c.M(118255197, new p2n((Object) c6q0Var, zBooleanValue2, pz40Var2, function1, (byte) 3), fetVar), u1c.M(361792060, new mxm(c6q0Var, (byte) 18), fetVar), fetVar, 806879232, 0, i4 & 8064, (458752 & (i4 << 3)) | 114819072, 1579057152, 9);
                    i8 = i9;
                    klyVar3 = klyVar4;
                    mm40Var3 = mm40Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    i8 = i5;
                    klyVar3 = klyVar2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new e7n(mm40Var3, c6q0Var, i8, klyVar3, function1, i2, i3, (byte) 0);
                }
            }
            i4 |= 3072;
            klyVar2 = klyVar;
            if ((i2 & 24576) != 0) {
                if (fetVar.i(function1)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i4 |= i12;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i13 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i14 != 0) {
                    i9 = -1;
                } else {
                    i9 = i5;
                }
                if (i6 != 0) {
                    klyVar4 = kly.d;
                } else {
                    klyVar4 = klyVar2;
                }
                p6q0Var = c6q0Var.c;
                b6q0Var = c6q0Var.g;
                zH = fetVar.h(z3);
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (zH) {
                    if (z3) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP = Float.valueOf(f);
                    fetVar.o0(objP);
                } else {
                    if (z3) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP = Float.valueOf(f);
                    fetVar.o0(objP);
                }
                float fFloatValue2 = ((Number) objP).floatValue();
                zG = fetVar.g(b6q0Var);
                objP2 = fetVar.P();
                if (zG) {
                    if (b6q0Var == null) {
                        i10 = 0;
                    } else if (b6q0Var instanceof a6q0) {
                        if (((a6q0) b6q0Var).f329a) {
                            i10 = 8;
                        } else {
                            i10 = 7;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        i10 = ((y5q0) b6q0Var).f42061a;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        i10 = 9;
                    }
                    objP2 = new bmy(i10);
                    fetVar.o0(objP2);
                } else {
                    if (b6q0Var == null) {
                        i10 = 0;
                    } else if (b6q0Var instanceof a6q0) {
                        if (((a6q0) b6q0Var).f329a) {
                            i10 = 8;
                        } else {
                            i10 = 7;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        i10 = ((y5q0) b6q0Var).f42061a;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        i10 = 9;
                    }
                    objP2 = new bmy(i10);
                    fetVar.o0(objP2);
                }
                int i17 = ((bmy) objP2).f2857a;
                zG2 = fetVar.g(b6q0Var);
                objP3 = fetVar.P();
                if (zG2) {
                    objP3 = Boolean.valueOf(b6q0Var instanceof a6q0);
                    fetVar.o0(objP3);
                } else {
                    objP3 = Boolean.valueOf(b6q0Var instanceof a6q0);
                    fetVar.o0(objP3);
                }
                zBooleanValue = ((Boolean) objP3).booleanValue();
                zG3 = fetVar.g(p6q0Var);
                objP4 = fetVar.P();
                if (zG3) {
                    if (p6q0Var instanceof i6q0) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objP4 = Boolean.valueOf(z2);
                    fetVar.o0(objP4);
                } else {
                    if (p6q0Var instanceof i6q0) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objP4 = Boolean.valueOf(z2);
                    fetVar.o0(objP4);
                }
                Boolean bool3 = (Boolean) objP4;
                boolean zBooleanValue3 = bool3.booleanValue();
                Object[] objArr2 = new Object[0];
                objP5 = fetVar.P();
                if (objP5 == cl5Var) {
                    objP5 = new ndm((byte) 23);
                    fetVar.o0(objP5);
                }
                pz40Var = (pz40) e9x.Q(objArr2, (Function0) objP5, fetVar, 48);
                Boolean bool4 = (Boolean) pz40Var.getValue();
                bool4.booleanValue();
                objArrCopyOf = Arrays.copyOf(new Object[]{b6q0Var, bool3, bool4}, 3);
                boolean zE2 = fetVar.e(objArrCopyOf.length);
                length = objArrCopyOf.length;
                zG4 = zE2;
                i11 = 0;
                while (i11 < length) {
                    zG4 |= fetVar.g(objArrCopyOf[i11]);
                    i11++;
                    pz40Var = pz40Var;
                }
                pz40 pz40Var3 = pz40Var;
                objP6 = fetVar.P();
                if (zG4) {
                    if (b6q0Var == null) {
                        objP6 = uuu0Var;
                    } else if (b6q0Var instanceof a6q0) {
                        if (zBooleanValue) {
                            objP6 = uuu0Var;
                        } else {
                            objP6 = uuu0Var;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        objP6 = ((y5q0) b6q0Var).b;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        z5q0 z5q0Var2 = (z5q0) b6q0Var;
                        objP6 = new lm90(z5q0Var2.f43831a, z5q0Var2.b);
                    }
                    fetVar.o0(objP6);
                } else {
                    if (b6q0Var == null) {
                        objP6 = uuu0Var;
                    } else if (b6q0Var instanceof a6q0) {
                        if (zBooleanValue) {
                            objP6 = uuu0Var;
                        } else {
                            objP6 = uuu0Var;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        objP6 = ((y5q0) b6q0Var).b;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        z5q0 z5q0Var3 = (z5q0) b6q0Var;
                        objP6 = new lm90(z5q0Var3.f43831a, z5q0Var3.b);
                    }
                    fetVar.o0(objP6);
                }
                vuu0 vuu0Var2 = (vuu0) objP6;
                if (b6q0Var == null) {
                    oieVar = null;
                } else if (b6q0Var instanceof y5q0) {
                    oieVar = ((y5q0) b6q0Var).c;
                } else if (b6q0Var instanceof z5q0) {
                    oieVar = ((z5q0) b6q0Var).c;
                } else if (b6q0Var instanceof a6q0) {
                    t9f.b();
                    return;
                } else if (((a6q0) b6q0Var).b) {
                    oie.f25306a.getClass();
                    oieVar = mie.e;
                } else {
                    oie.f25306a.getClass();
                    oieVar = mie.c;
                }
                oie oieVar3 = oieVar;
                String str5 = c6q0Var.f3831a;
                String str6 = c6q0Var.i;
                String str7 = c6q0Var.j;
                boolean z10 = c6q0Var.e;
                boolean z11 = p6q0Var instanceof g6q0;
                q7q0 q7q0Var2 = c6q0Var.h;
                boolean z12 = c6q0Var.f;
                boolean z13 = c6q0Var.l;
                String str8 = c6q0Var.n;
                Integer num2 = c6q0Var.o;
                zcl zclVar2 = qmk.f28987a;
                boolean z14 = c6q0Var.p;
                boolean z15 = c6q0Var.k;
                a7n a7nVar2 = c6q0Var.q;
                int i18 = c6q0Var.m;
                objP7 = fetVar.P();
                if (objP7 == cl5Var) {
                    objP7 = new aim((byte) 15);
                    fetVar.o0(objP7);
                }
                h36.a(epv0.N(pai0.a(mm40Var4, true, (Function1) objP7), fFloatValue2), str5, q7q0Var2, str6, str7, z10, true, z11, z12, true, oieVar3, z15, z13, str8, num2, false, vuu0Var2, false, 0L, null, null, i17, i9, klyVar4, 4.0f, 0.0f, 0.0f, null, null, z14, 0.0f, i18, a7nVar2, null, function1, u1c.M(1777050, new elm(c6q0Var, (byte) 2), fetVar), u1c.M(118255197, new p2n((Object) c6q0Var, zBooleanValue3, pz40Var3, function1, (byte) 3), fetVar), u1c.M(361792060, new mxm(c6q0Var, (byte) 18), fetVar), fetVar, 806879232, 0, i4 & 8064, (458752 & (i4 << 3)) | 114819072, 1579057152, 9);
                i8 = i9;
                klyVar3 = klyVar4;
                mm40Var3 = mm40Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                i8 = i5;
                klyVar3 = klyVar2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new e7n(mm40Var3, c6q0Var, i8, klyVar3, function1, i2, i3, (byte) 0);
            }
        }
        i4 |= 384;
        i5 = i;
        i6 = i3 & 8;
        if (i6 != 0) {
            if ((i2 & 3072) == 0) {
                klyVar2 = klyVar;
                if (fetVar.g(klyVar2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i4 |= i7;
            }
            if ((i2 & 24576) != 0) {
                if (fetVar.i(function1)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i4 |= i12;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i13 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i14 != 0) {
                    i9 = -1;
                } else {
                    i9 = i5;
                }
                if (i6 != 0) {
                    klyVar4 = kly.d;
                } else {
                    klyVar4 = klyVar2;
                }
                p6q0Var = c6q0Var.c;
                b6q0Var = c6q0Var.g;
                zH = fetVar.h(z3);
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (zH) {
                    if (z3) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP = Float.valueOf(f);
                    fetVar.o0(objP);
                } else {
                    if (z3) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP = Float.valueOf(f);
                    fetVar.o0(objP);
                }
                float fFloatValue3 = ((Number) objP).floatValue();
                zG = fetVar.g(b6q0Var);
                objP2 = fetVar.P();
                if (zG) {
                    if (b6q0Var == null) {
                        i10 = 0;
                    } else if (b6q0Var instanceof a6q0) {
                        if (((a6q0) b6q0Var).f329a) {
                            i10 = 8;
                        } else {
                            i10 = 7;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        i10 = ((y5q0) b6q0Var).f42061a;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        i10 = 9;
                    }
                    objP2 = new bmy(i10);
                    fetVar.o0(objP2);
                } else {
                    if (b6q0Var == null) {
                        i10 = 0;
                    } else if (b6q0Var instanceof a6q0) {
                        if (((a6q0) b6q0Var).f329a) {
                            i10 = 8;
                        } else {
                            i10 = 7;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        i10 = ((y5q0) b6q0Var).f42061a;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        i10 = 9;
                    }
                    objP2 = new bmy(i10);
                    fetVar.o0(objP2);
                }
                int i19 = ((bmy) objP2).f2857a;
                zG2 = fetVar.g(b6q0Var);
                objP3 = fetVar.P();
                if (zG2) {
                    objP3 = Boolean.valueOf(b6q0Var instanceof a6q0);
                    fetVar.o0(objP3);
                } else {
                    objP3 = Boolean.valueOf(b6q0Var instanceof a6q0);
                    fetVar.o0(objP3);
                }
                zBooleanValue = ((Boolean) objP3).booleanValue();
                zG3 = fetVar.g(p6q0Var);
                objP4 = fetVar.P();
                if (zG3) {
                    if (p6q0Var instanceof i6q0) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objP4 = Boolean.valueOf(z2);
                    fetVar.o0(objP4);
                } else {
                    if (p6q0Var instanceof i6q0) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objP4 = Boolean.valueOf(z2);
                    fetVar.o0(objP4);
                }
                Boolean bool5 = (Boolean) objP4;
                boolean zBooleanValue4 = bool5.booleanValue();
                Object[] objArr3 = new Object[0];
                objP5 = fetVar.P();
                if (objP5 == cl5Var) {
                    objP5 = new ndm((byte) 23);
                    fetVar.o0(objP5);
                }
                pz40Var = (pz40) e9x.Q(objArr3, (Function0) objP5, fetVar, 48);
                Boolean bool6 = (Boolean) pz40Var.getValue();
                bool6.booleanValue();
                objArrCopyOf = Arrays.copyOf(new Object[]{b6q0Var, bool5, bool6}, 3);
                boolean zE3 = fetVar.e(objArrCopyOf.length);
                length = objArrCopyOf.length;
                zG4 = zE3;
                i11 = 0;
                while (i11 < length) {
                    zG4 |= fetVar.g(objArrCopyOf[i11]);
                    i11++;
                    pz40Var = pz40Var;
                }
                pz40 pz40Var4 = pz40Var;
                objP6 = fetVar.P();
                if (zG4) {
                    if (b6q0Var == null) {
                        objP6 = uuu0Var;
                    } else if (b6q0Var instanceof a6q0) {
                        if (zBooleanValue) {
                            objP6 = uuu0Var;
                        } else {
                            objP6 = uuu0Var;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        objP6 = ((y5q0) b6q0Var).b;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        z5q0 z5q0Var4 = (z5q0) b6q0Var;
                        objP6 = new lm90(z5q0Var4.f43831a, z5q0Var4.b);
                    }
                    fetVar.o0(objP6);
                } else {
                    if (b6q0Var == null) {
                        objP6 = uuu0Var;
                    } else if (b6q0Var instanceof a6q0) {
                        if (zBooleanValue) {
                            objP6 = uuu0Var;
                        } else {
                            objP6 = uuu0Var;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        objP6 = ((y5q0) b6q0Var).b;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        z5q0 z5q0Var5 = (z5q0) b6q0Var;
                        objP6 = new lm90(z5q0Var5.f43831a, z5q0Var5.b);
                    }
                    fetVar.o0(objP6);
                }
                vuu0 vuu0Var3 = (vuu0) objP6;
                if (b6q0Var == null) {
                    oieVar = null;
                } else if (b6q0Var instanceof y5q0) {
                    oieVar = ((y5q0) b6q0Var).c;
                } else if (b6q0Var instanceof z5q0) {
                    oieVar = ((z5q0) b6q0Var).c;
                } else if (b6q0Var instanceof a6q0) {
                    t9f.b();
                    return;
                } else if (((a6q0) b6q0Var).b) {
                    oie.f25306a.getClass();
                    oieVar = mie.e;
                } else {
                    oie.f25306a.getClass();
                    oieVar = mie.c;
                }
                oie oieVar4 = oieVar;
                String str9 = c6q0Var.f3831a;
                String str10 = c6q0Var.i;
                String str11 = c6q0Var.j;
                boolean z16 = c6q0Var.e;
                boolean z17 = p6q0Var instanceof g6q0;
                q7q0 q7q0Var3 = c6q0Var.h;
                boolean z18 = c6q0Var.f;
                boolean z19 = c6q0Var.l;
                String str12 = c6q0Var.n;
                Integer num3 = c6q0Var.o;
                zcl zclVar3 = qmk.f28987a;
                boolean z110 = c6q0Var.p;
                boolean z111 = c6q0Var.k;
                a7n a7nVar3 = c6q0Var.q;
                int i110 = c6q0Var.m;
                objP7 = fetVar.P();
                if (objP7 == cl5Var) {
                    objP7 = new aim((byte) 15);
                    fetVar.o0(objP7);
                }
                h36.a(epv0.N(pai0.a(mm40Var4, true, (Function1) objP7), fFloatValue3), str9, q7q0Var3, str10, str11, z16, true, z17, z18, true, oieVar4, z111, z19, str12, num3, false, vuu0Var3, false, 0L, null, null, i19, i9, klyVar4, 4.0f, 0.0f, 0.0f, null, null, z110, 0.0f, i110, a7nVar3, null, function1, u1c.M(1777050, new elm(c6q0Var, (byte) 2), fetVar), u1c.M(118255197, new p2n((Object) c6q0Var, zBooleanValue4, pz40Var4, function1, (byte) 3), fetVar), u1c.M(361792060, new mxm(c6q0Var, (byte) 18), fetVar), fetVar, 806879232, 0, i4 & 8064, (458752 & (i4 << 3)) | 114819072, 1579057152, 9);
                i8 = i9;
                klyVar3 = klyVar4;
                mm40Var3 = mm40Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                i8 = i5;
                klyVar3 = klyVar2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new e7n(mm40Var3, c6q0Var, i8, klyVar3, function1, i2, i3, (byte) 0);
            }
        }
        i4 |= 3072;
        klyVar2 = klyVar;
        if ((i2 & 24576) != 0) {
            if (fetVar.i(function1)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i4 |= i12;
        }
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            if (i13 != 0) {
                mm40Var4 = jm40.b;
            } else {
                mm40Var4 = mm40Var2;
            }
            if (i14 != 0) {
                i9 = -1;
            } else {
                i9 = i5;
            }
            if (i6 != 0) {
                klyVar4 = kly.d;
            } else {
                klyVar4 = klyVar2;
            }
            p6q0Var = c6q0Var.c;
            b6q0Var = c6q0Var.g;
            zH = fetVar.h(z3);
            objP = fetVar.P();
            cl5Var = ukd.f35823a;
            if (zH) {
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                objP = Float.valueOf(f);
                fetVar.o0(objP);
            } else {
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                objP = Float.valueOf(f);
                fetVar.o0(objP);
            }
            float fFloatValue4 = ((Number) objP).floatValue();
            zG = fetVar.g(b6q0Var);
            objP2 = fetVar.P();
            if (zG) {
                if (b6q0Var == null) {
                    i10 = 0;
                } else if (b6q0Var instanceof a6q0) {
                    if (((a6q0) b6q0Var).f329a) {
                        i10 = 8;
                    } else {
                        i10 = 7;
                    }
                } else if (b6q0Var instanceof y5q0) {
                    i10 = ((y5q0) b6q0Var).f42061a;
                } else if (!(b6q0Var instanceof z5q0)) {
                    t9f.b();
                    return;
                } else {
                    i10 = 9;
                }
                objP2 = new bmy(i10);
                fetVar.o0(objP2);
            } else {
                if (b6q0Var == null) {
                    i10 = 0;
                } else if (b6q0Var instanceof a6q0) {
                    if (((a6q0) b6q0Var).f329a) {
                        i10 = 8;
                    } else {
                        i10 = 7;
                    }
                } else if (b6q0Var instanceof y5q0) {
                    i10 = ((y5q0) b6q0Var).f42061a;
                } else if (!(b6q0Var instanceof z5q0)) {
                    t9f.b();
                    return;
                } else {
                    i10 = 9;
                }
                objP2 = new bmy(i10);
                fetVar.o0(objP2);
            }
            int i111 = ((bmy) objP2).f2857a;
            zG2 = fetVar.g(b6q0Var);
            objP3 = fetVar.P();
            if (zG2) {
                objP3 = Boolean.valueOf(b6q0Var instanceof a6q0);
                fetVar.o0(objP3);
            } else {
                objP3 = Boolean.valueOf(b6q0Var instanceof a6q0);
                fetVar.o0(objP3);
            }
            zBooleanValue = ((Boolean) objP3).booleanValue();
            zG3 = fetVar.g(p6q0Var);
            objP4 = fetVar.P();
            if (zG3) {
                if (p6q0Var instanceof i6q0) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                objP4 = Boolean.valueOf(z2);
                fetVar.o0(objP4);
            } else {
                if (p6q0Var instanceof i6q0) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                objP4 = Boolean.valueOf(z2);
                fetVar.o0(objP4);
            }
            Boolean bool7 = (Boolean) objP4;
            boolean zBooleanValue5 = bool7.booleanValue();
            Object[] objArr4 = new Object[0];
            objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new ndm((byte) 23);
                fetVar.o0(objP5);
            }
            pz40Var = (pz40) e9x.Q(objArr4, (Function0) objP5, fetVar, 48);
            Boolean bool8 = (Boolean) pz40Var.getValue();
            bool8.booleanValue();
            objArrCopyOf = Arrays.copyOf(new Object[]{b6q0Var, bool7, bool8}, 3);
            boolean zE4 = fetVar.e(objArrCopyOf.length);
            length = objArrCopyOf.length;
            zG4 = zE4;
            i11 = 0;
            while (i11 < length) {
                zG4 |= fetVar.g(objArrCopyOf[i11]);
                i11++;
                pz40Var = pz40Var;
            }
            pz40 pz40Var5 = pz40Var;
            objP6 = fetVar.P();
            if (zG4) {
                if (b6q0Var == null) {
                    objP6 = uuu0Var;
                } else if (b6q0Var instanceof a6q0) {
                    if (zBooleanValue) {
                        objP6 = uuu0Var;
                    } else {
                        objP6 = uuu0Var;
                    }
                } else if (b6q0Var instanceof y5q0) {
                    objP6 = ((y5q0) b6q0Var).b;
                } else if (!(b6q0Var instanceof z5q0)) {
                    t9f.b();
                    return;
                } else {
                    z5q0 z5q0Var6 = (z5q0) b6q0Var;
                    objP6 = new lm90(z5q0Var6.f43831a, z5q0Var6.b);
                }
                fetVar.o0(objP6);
            } else {
                if (b6q0Var == null) {
                    objP6 = uuu0Var;
                } else if (b6q0Var instanceof a6q0) {
                    if (zBooleanValue) {
                        objP6 = uuu0Var;
                    } else {
                        objP6 = uuu0Var;
                    }
                } else if (b6q0Var instanceof y5q0) {
                    objP6 = ((y5q0) b6q0Var).b;
                } else if (!(b6q0Var instanceof z5q0)) {
                    t9f.b();
                    return;
                } else {
                    z5q0 z5q0Var7 = (z5q0) b6q0Var;
                    objP6 = new lm90(z5q0Var7.f43831a, z5q0Var7.b);
                }
                fetVar.o0(objP6);
            }
            vuu0 vuu0Var4 = (vuu0) objP6;
            if (b6q0Var == null) {
                oieVar = null;
            } else if (b6q0Var instanceof y5q0) {
                oieVar = ((y5q0) b6q0Var).c;
            } else if (b6q0Var instanceof z5q0) {
                oieVar = ((z5q0) b6q0Var).c;
            } else if (b6q0Var instanceof a6q0) {
                t9f.b();
                return;
            } else if (((a6q0) b6q0Var).b) {
                oie.f25306a.getClass();
                oieVar = mie.e;
            } else {
                oie.f25306a.getClass();
                oieVar = mie.c;
            }
            oie oieVar5 = oieVar;
            String str13 = c6q0Var.f3831a;
            String str14 = c6q0Var.i;
            String str15 = c6q0Var.j;
            boolean z112 = c6q0Var.e;
            boolean z113 = p6q0Var instanceof g6q0;
            q7q0 q7q0Var4 = c6q0Var.h;
            boolean z114 = c6q0Var.f;
            boolean z115 = c6q0Var.l;
            String str16 = c6q0Var.n;
            Integer num4 = c6q0Var.o;
            zcl zclVar4 = qmk.f28987a;
            boolean z116 = c6q0Var.p;
            boolean z117 = c6q0Var.k;
            a7n a7nVar4 = c6q0Var.q;
            int i112 = c6q0Var.m;
            objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = new aim((byte) 15);
                fetVar.o0(objP7);
            }
            h36.a(epv0.N(pai0.a(mm40Var4, true, (Function1) objP7), fFloatValue4), str13, q7q0Var4, str14, str15, z112, true, z113, z114, true, oieVar5, z117, z115, str16, num4, false, vuu0Var4, false, 0L, null, null, i111, i9, klyVar4, 4.0f, 0.0f, 0.0f, null, null, z116, 0.0f, i112, a7nVar4, null, function1, u1c.M(1777050, new elm(c6q0Var, (byte) 2), fetVar), u1c.M(118255197, new p2n((Object) c6q0Var, zBooleanValue5, pz40Var5, function1, (byte) 3), fetVar), u1c.M(361792060, new mxm(c6q0Var, (byte) 18), fetVar), fetVar, 806879232, 0, i4 & 8064, (458752 & (i4 << 3)) | 114819072, 1579057152, 9);
            i8 = i9;
            klyVar3 = klyVar4;
            mm40Var3 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
            i8 = i5;
            klyVar3 = klyVar2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e7n(mm40Var3, c6q0Var, i8, klyVar3, function1, i2, i3, (byte) 0);
        }
    }

    public static final void u(mm40 mm40Var, xce xceVar, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        function1.getClass();
        fetVar.g0(1291185597);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(xceVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40Var4 = i4 != 0 ? jm40.b : mm40Var2;
            mm40 mm40VarN = s5x0.N(mm40Var4, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
            mdm mdmVar = xceVar.f40643a;
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ylm(function1, (byte) 15);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            mm40Var3 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var3, (Object) xceVar, (Object) function1, i, i2, (byte) 23);
        }
    }

    public static final void v(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(56254818);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, ibm0.l(g1t0.m(), fetVar), fetVar, (i2 << 3) & 112, 0, 130044);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i, (byte) 2);
        }
    }

    public static final void w(mm40 mm40Var, ytp ytpVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1295785711);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ytpVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String str = ytpVar.b;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, x7zVar, 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, ibm0.n(g1t0.g(), fetVar2), fetVar, 0, 0, 130044);
            mm40 mm40VarA = o7k0.A(jm40.b, null, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarA, 8.0f, 0.0f, 2);
            String str2 = ytpVar.f43231a;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, mm40VarL, 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.t(g1t0.d(), fetVar), fetVar, 0, 0, 130044);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String str3 = ytpVar.c;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str3, x7zVar2, 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 0, false, 0, 0, null, ibm0.n(g1t0.g(), fetVar), fetVar, 0, 0, 130044);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(mm40Var, ytpVar, i, (byte) 0);
        }
    }

    public static final void x(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-599210984);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            hup hupVar = (hup) l7m0Var.getValue();
            f9m0 f9m0Var = new f9m0(R.string.statistic_info_vs, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0Var = hupVar.f13692a;
            j9m0 j9m0Var = hupVar.b;
            boolean z = hupVar.d;
            boolean z2 = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new mfp(function1, (byte) 19);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, z, (Function0) objP, null, null, u1c.M(-1626850650, new rgh(hupVar, function1, (byte) 13), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qph(l7m0Var, function1, i, (byte) 7);
        }
    }

    public static final void y(mm40 mm40Var, j83 j83Var, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        fet fetVar2 = fetVar;
        j83Var.getClass();
        fetVar2.g0(-563595532);
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
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(j83Var) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40Var4 = i4 != 0 ? jm40.b : mm40Var2;
            if (j83Var.b.length() > 0) {
                fetVar2.e0(-1047188573);
                mm40 mm40VarD = o7k0.d(mm40Var4, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                pz40 pz40Var = s6t0.f31722a;
                mm40Var3 = mm40Var4;
                v8q0.b(j83Var, mm40VarN, s6t0.b().f33626a.getSecondary(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, (i3 >> 3) & 14, 24960, 240632);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                mm40Var3 = mm40Var4;
                fetVar2.e0(-1046864530);
                fetVar2.r(false);
            }
            mm40Var2 = mm40Var3;
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02(mm40Var2, (Object) j83Var, i, i2, (byte) 27);
        }
    }

    public static final void z(mm40 mm40Var, pz40 pz40Var, Function0 function0, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        pz40 pz40Var2;
        function0.getClass();
        fetVar.g0(158038002);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            pz40Var2 = pz40Var;
            i2 |= fetVar.g(pz40Var2) ? 32 : 16;
        } else {
            pz40Var2 = pz40Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            String str = (String) pz40Var2.getValue();
            pz40 pz40Var3 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            hlm.c(mm40VarD, new imm(klm.f18497a, new plm(str, staticColors.m123getWhite0d7_KjU(), fa50.f9191a), fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), false, null), null, null, null, null, null, null, null, u1c.M(-716408586, new wr4(function0, b), fetVar), null, u1c.M(-1776855995, new d0(ugdVar2, ugdVar, (byte) 1), fetVar), fetVar, 805306368, 48, 1532);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a3s(mm40Var, pz40Var, function0, ugdVar, ugdVar2, i, (byte) 0);
        }
    }

    public abstract int K(int i, int i2, k6z k6zVar, pu90 pu90Var, int i3);

    public Integer M(pu90 pu90Var) {
        return null;
    }
}
