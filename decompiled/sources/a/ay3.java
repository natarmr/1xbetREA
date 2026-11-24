package a;

import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ay3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f1652a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, Response.REQUEST_TERMINATED, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final ugd g = new ugd(-532215690, false, new wgd(0));
    public static final ugd h = new ugd(603790876, false, new chd(7));
    public static final ugd i = new ugd(1494865498, false, new chd(8));
    public static final ugd j;
    public static final ugd k;
    public static final ugd l;
    public static final Object m;
    public static final Type[] n;
    public static boolean o = true;

    static {
        byte b2 = 21;
        j = new ugd(-1467011690, false, new fhd(b2));
        new ugd(286677153, false, new chd(b2));
        k = new ugd(-1686590350, false, new mhd((byte) 17));
        l = new ugd(1214937651, false, new mhd((byte) 18));
        m = new Object();
        n = new Type[0];
    }

    public static final void A(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1004455082);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
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
            b8k0.m(((j9e0) l7m0Var.getValue()).f16134a, ((j9e0) l7m0Var.getValue()).b, function1, fetVar, (i3 << 3) & 896);
            B(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i2, b2);
        }
    }

    public static final void B(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(673720302);
        byte b2 = 2;
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 18;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new wda0(l7m0Var, (byte) 17));
                fetVar.o0(objP);
            }
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            d7e0 d7e0Var = ((e7e0) ((l7m0) objP).getValue()).f7324a;
            if (Intrinsics.d(d7e0Var, b7e0.f2105a)) {
                fetVar.e0(419670315);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = jgk0.b(new wda0(l7m0Var, b3));
                    fetVar.o0(objP2);
                }
                C(((i3 << 3) & 896) | 6, fetVar, xczVarA, (l7m0) objP2, function1);
                fetVar.r(false);
            } else {
                if (!(d7e0Var instanceof c7e0)) {
                    throw b1j.f(-1094843066, fetVar, false);
                }
                fetVar.e0(419976006);
                n0q n0qVar = o7k0.c;
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
                mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
                mdm mdmVar = ((c7e0) d7e0Var).f3858a;
                boolean z = (i3 & 112) == 32;
                Object objP3 = fetVar.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new evd0(function1, (byte) 13);
                    fetVar.o0(objP3);
                }
                jcb.l(mm40VarB, mdmVar, false, (Function0) objP3, fetVar, 0, 4);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i2, b2);
        }
    }

    public static final void C(int i2, fet fetVar, xcz xczVar, l7m0 l7m0Var, Function1 function1) {
        int i3;
        fetVar.g0(-93465258);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            float f2 = xfn.a(fetVar).c;
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var, new qw3(8.0f, true, new jf4((byte) 14)), h97.f(f2, 8.0f, f2, 28.0f, fetVar), false, null, u1c.M(144006360, new nc40(function1, (byte) 12), fetVar), fetVar, (i3 & 112) | 100663302 | ((i3 << 6) & 896), Response.OK);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kyy(l7m0Var, xczVar, function1, i2, (byte) 2);
        }
    }

    public static final void D(c5k0 c5k0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1071804780);
        int i3 = (fetVar.g(c5k0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-2143584734, new fzi0(c5k0Var, xczVarA, function1), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(c5k0Var, function1, i2, b2);
        }
    }

    public static final void E(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1166307017);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            f9m0 f9m0Var = new f9m0(R.string.statistic_team_title, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0Var = ((f5k0) l7m0Var.getValue()).b().f43774a;
            j9m0 j9m0Var = ((f5k0) l7m0Var.getValue()).b().b;
            boolean zA = ((f5k0) l7m0Var.getValue()).a();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nrj0(function1, (byte) 20);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, (Function0) objP, null, null, u1c.M(1097311319, new dqz(l7m0Var, function1, (byte) 14), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i2, (byte) 11);
        }
    }

    public static u7k0 F(t4s t4sVar, int i2) {
        boolean z = (i2 & 1) != 0;
        Function2 function2 = t4sVar;
        if ((i2 & 2) != 0) {
            function2 = y43.b;
        }
        return new u7k0(z, function2);
    }

    public static final void G(int i2, fet fetVar) {
        fetVar.g0(-1513082635);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40.b, 40.0f), 88.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new im8(i2, (byte) 11);
        }
    }

    public static final void H(mm40 mm40Var, wcp wcpVar, Function0 function0, Function0 function1, fet fetVar, int i2, int i3) {
        Function0 function2;
        int i4;
        Function0 function3;
        int i5;
        mm40 mm40Var2;
        Function0 function4;
        Function0 function5;
        Function0 function6;
        Function0 function7;
        pm80 pm80VarF;
        Function0 function8;
        pm80 pm80Var;
        int i6;
        StringBuilder sb;
        fet fetVar2;
        zfn zfnVar;
        pcy pcyVar;
        jm40 jm40Var;
        float f2;
        boolean z;
        mm40 mm40VarS;
        boolean z2;
        wcp wcpVar2 = wcpVar;
        fet fetVar3 = fetVar;
        fetVar3.g0(-278876675);
        int i7 = i2 | 6 | (fetVar3.g(wcpVar2) ? 32 : 16);
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 = i7 | 384;
            function2 = function0;
        } else {
            function2 = function0;
            i4 = i7 | (fetVar3.i(function2) ? 256 : 128);
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i5 = i4 | 3072;
            function3 = function1;
        } else {
            function3 = function1;
            i5 = i4 | (fetVar3.i(function3) ? 2048 : 1024);
        }
        if (fetVar3.U(i5 & 1, (i5 & 1171) != 1170)) {
            byte b2 = 12;
            cl5 cl5Var = ukd.f35823a;
            if (i8 != 0) {
                Object objP = fetVar3.P();
                if (objP == cl5Var) {
                    objP = new fno0(b2);
                    fetVar3.o0(objP);
                }
                function6 = (Function0) objP;
            } else {
                function6 = function2;
            }
            if (i9 != 0) {
                Object objP2 = fetVar3.P();
                if (objP2 == cl5Var) {
                    objP2 = new fno0((byte) 13);
                    fetVar3.o0(objP2);
                }
                function7 = (Function0) objP2;
            } else {
                function7 = function3;
            }
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var2, 122.0f, 132.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarP, s6t0.b().f33626a.getBackgroundContent(), vgg0.a(16.0f));
            boolean z3 = (i5 & 7168) == 2048;
            Object objP3 = fetVar3.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new xhl0(function7, (byte) 11);
                fetVar3.o0(objP3);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarQ, null, null, false, null, (Function0) objP3, 28), "TEAM_CARD_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE0);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z4 = fetVar3.S;
            pcy pcyVar2 = e7z.u1;
            if (z4) {
                fetVar3.l(pcyVar2);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            mm40 mm40VarE = o7k0.e(s5x0.N(o7k0.d(jm40Var2, 1.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14), 36.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarE);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar2);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, shdVar);
            jpm0.o(fetVar3, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar4);
            tnp0 tnp0Var = wcpVar2.f38935a;
            boolean z5 = wcpVar2.f;
            int i10 = wcpVar2.b;
            if (tnp0Var != null) {
                if (tnp0Var instanceof rnp0) {
                    fetVar3.e0(-373903290);
                    fetVar3.r(false);
                    pm80VarF = null;
                } else if (tnp0Var instanceof snp0) {
                    fetVar3.e0(-566249185);
                    pm80VarF = a8k0.F(R.drawable.s1, 0, fetVar3);
                    fetVar3.r(false);
                }
                mm40 mm40VarN = o7k0.n(jm40Var2, 18.0f);
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarE1 = o2e.e0(lgb.J(mm40VarN, ugg0Var), "TEAM_CARD_SPORT_ICON");
                int i11 = i5;
                StringBuilder sb2 = new StringBuilder(ujn.h);
                String str = wcpVar2.c;
                str.getClass();
                if (str.length() == 0) {
                    function8 = function7;
                    sb2.setLength(0);
                    pm80Var = pm80VarF;
                    sb = sb2;
                } else {
                    function8 = function7;
                    pm80Var = pm80VarF;
                    if (StringsKt.O(str, ujn.h, false)) {
                        i6 = 0;
                        sb = sb2;
                    } else {
                        sb = sb2;
                        if (kotlin.text.c.x(str, "https://", false)) {
                            i6 = 0;
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str, '/'));
                        }
                    }
                    sb.setLength(i6);
                    sb.append(str);
                }
                String string = sb.toString();
                zfn zfnVar2 = zaq0.b;
                pm80 pm80Var2 = pm80Var;
                k7x.b(string, null, mm40VarE1, pm80Var2, pm80Var2, null, null, null, null, null, null, new m78(((ThemeColors) fetVar3.k(zfnVar2)).getSecondary(), 5), fetVar, 36912, 0, 28640);
                if (i10 > 0) {
                    fetVar.e0(-373243733);
                    jm40Var = jm40Var2;
                    zfnVar = zfnVar2;
                    fetVar2 = fetVar;
                    pcyVar = pcyVar2;
                    f2 = 1.0f;
                    tdc.e(new rpe(i10), new kpe(), o2e.e0(s5x0.N(jm40Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14), "TEAM_CARD_COUNTER"), fetVar2, 0, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2 = fetVar;
                    zfnVar = zfnVar2;
                    pcyVar = pcyVar2;
                    jm40Var = jm40Var2;
                    f2 = 1.0f;
                    fetVar2.e0(-372983829);
                    fetVar2.r(false);
                }
                qxw.o(fetVar2, new x7z(f2, true));
                jm40 jm40Var3 = jm40Var;
                fet fetVar4 = fetVar2;
                zfn zfnVar3 = zfnVar;
                pcy pcyVar3 = pcyVar;
                Function0 function9 = function6;
                zvw.d(function9, o2e.e0(o7k0.n(jm40Var, 36.0f), "TEAM_CARD_FAVORITE_ICON"), false, null, null, oja0.d, fetVar4, ((i11 >> 6) & 14) | 1572864, 60);
                fetVar4.r(true);
                mm40 mm40VarE2 = o2e.e0(o7k0.n(jm40Var3, 60.0f), "TEAM_CARD_LOGO");
                tj30 tj30VarC = zq8.c(gqw0.b, false);
                int iHashCode3 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM3 = fetVar4.m();
                mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarE2);
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(pcyVar3);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, tj30VarC, shdVar);
                jpm0.o(fetVar4, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar4, shdVar3, fetVar4);
                jpm0.o(fetVar4, mm40VarC2, shdVar4);
                mm40 mm40VarQ2 = i120.Q(o7k0.n(jm40Var3, 52.0f), ((ThemeColors) fetVar4.k(zfnVar3)).getBackground(), ugg0Var);
                if (z5) {
                    fetVar4.e0(1155622058);
                    mm40VarS = i120.S(jm40Var3, 1.0f, ((StaticColors) fetVar4.k(m8m0.f21378a)).m113getRed0d7_KjU(), ugg0Var);
                    z = false;
                    fetVar4.r(false);
                } else {
                    z = false;
                    fetVar4.e0(1155752041);
                    fetVar4.r(false);
                    mm40VarS = jm40Var3;
                }
                mm40 mm40VarE3 = mm40VarQ2.e(mm40VarS);
                zx7 zx7Var = gqw0.e;
                tj30 tj30VarC2 = zq8.c(zx7Var, z);
                int iHashCode4 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM4 = fetVar4.m();
                mm40 mm40VarC3 = kbc.c0(fetVar4, mm40VarE3);
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(pcyVar3);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, tj30VarC2, shdVar);
                jpm0.o(fetVar4, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar4, shdVar3, fetVar4);
                jpm0.o(fetVar4, mm40VarC3, shdVar4);
                mm40 mm40VarN2 = o7k0.n(jm40Var3, 32.0f);
                boolean z6 = (i11 & 112) == 32;
                Object objP4 = fetVar4.P();
                if (z6 || objP4 == cl5Var) {
                    objP4 = new nxo0(wcpVar, (byte) 4);
                    fetVar4.o0(objP4);
                }
                kkb.p(0, fetVar4, mm40VarN2, (Function0) objP4);
                fetVar4.r(true);
                if (z5) {
                    fetVar4.e0(1156491980);
                    z2 = false;
                    j6n.h(rsm0.w(R.string.live_new, 0, fetVar4), kro0.f18776a, jr8.f16991a.b(jm40Var3, gqw0.h), 0, 0, fetVar4, 48, 24);
                    fetVar4.r(false);
                } else {
                    z2 = false;
                    fetVar4.e0(1156718249);
                    fetVar4.r(false);
                }
                fetVar4.r(true);
                mm40 mm40VarE4 = s5x0.L(jm40Var3, 8.0f, 0.0f, 2).e(o7k0.c);
                tj30 tj30VarC3 = zq8.c(zx7Var, z2);
                int iHashCode5 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM5 = fetVar4.m();
                mm40 mm40VarC4 = kbc.c0(fetVar4, mm40VarE4);
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(pcyVar3);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, tj30VarC3, shdVar);
                jpm0.o(fetVar4, bh90VarM5, shdVar2);
                vqd.u(iHashCode5, fetVar4, shdVar3, fetVar4);
                jpm0.o(fetVar4, mm40VarC4, shdVar4);
                wcpVar2 = wcpVar;
                v8q0.a(wcpVar2.e, o2e.e0(jm40Var3, "TEAM_CARD_NAME"), 0L, new n05(idm0.t(10), idm0.t(12), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar4), fetVar, 48, 24960, 109556);
                fetVar3 = fetVar;
                fetVar3.r(true);
                fetVar3.r(true);
                mm40Var2 = jm40Var3;
                function4 = function8;
                function5 = function9;
            }
            throw b1j.f(-566252860, fetVar3, false);
        }
        fetVar3.X();
        mm40Var2 = mm40Var;
        function4 = function3;
        function5 = function2;
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pr9((byte) 7, i2, i3, function4, mm40Var2, wcpVar2, function5);
        }
    }

    public static final void I(ugd ugdVar, fet fetVar, int i2) {
        fetVar.g0(-1482846157);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(jm40.b, 12.0f, 12.0f, 12.0f, 8.0f);
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            vqd.t(54, ugdVar, y5d.f42040a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w(ugdVar, i2, b2);
        }
    }

    public static final a3k0 J(ctf0 ctf0Var, boolean z) {
        ctf0Var.getClass();
        return new a3k0(new wul(nul.e, oe9.f25112a, new ue9(ctf0Var.b.a(R.string.load_archive, Arrays.copyOf(new Object[0], 0))), true, z, false));
    }

    public static void K(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            e9d0.o();
        }
    }

    public static final void L(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    ohs0.D(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    tjo.a(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    e9d0.o();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static x19 M(x19 x19Var, boolean z, boolean z2, List list, int i2) {
        boolean z3 = (i2 & 2) != 0 ? x19Var.b.b : true;
        List list2 = (i2 & 8) != 0 ? x19Var.b.d : list;
        hr10 hr10Var = x19Var.b.e;
        x19Var.getClass();
        hr10Var.getClass();
        return x19.a(x19Var, null, new u19(z, z3, z2, list2, hr10Var), null, false, null, null, 509);
    }

    public static x19 N(x19 x19Var, boolean z, String str, String str2, int i2) {
        if ((i2 & 1) != 0) {
            z = x19Var.f40110a.f38387a;
        }
        if ((i2 & 2) != 0) {
            str = x19Var.f40110a.b;
        }
        if ((i2 & 4) != 0) {
            str2 = x19Var.f40110a.c;
        }
        x19Var.getClass();
        str.getClass();
        str2.getClass();
        return x19.a(x19Var, new w19(z, str, str2), null, null, false, null, null, 510);
    }

    public static boolean O(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return O(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static int P(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = b[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + f[i4]) * 2;
        }
        int i6 = e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static Type Q(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return Q(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return Q(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type R(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 >= 0 && i2 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i2];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbM = b1j.m(i2, "Index ", " not in range [0,");
        sbM.append(actualTypeArguments.length);
        sbM.append(") for ");
        sbM.append(parameterizedType);
        throw new IllegalArgumentException(sbM.toString());
    }

    public static Class S(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            e9d0.o();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) S(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return S(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        String name = type.getClass().getName();
        sb.append("> is of type ");
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Type T(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return b0(type, cls, Q(type, cls, Map.class));
        }
        e9d0.o();
        return null;
    }

    public static boolean U(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return U(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            itt0.l("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (U(type2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean V(wrd wrdVar) {
        wrdVar.getClass();
        return Intrinsics.d(wrdVar.N2.c, Boolean.TRUE) && Intrinsics.d(wrdVar.O2.d, "aggregator");
    }

    public static final boolean W(wrd wrdVar) {
        wrdVar.getClass();
        return Intrinsics.d(wrdVar.N2.c, Boolean.TRUE) && Intrinsics.d(wrdVar.O2.d, "virtual");
    }

    public static boolean X(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException Y(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbT = brm0.t(String.format(str, objArr), "\n    for method ");
        sbT.append(method.getDeclaringClass().getSimpleName());
        sbT.append(Separators.DOT);
        sbT.append(method.getName());
        return new IllegalArgumentException(sbT.toString(), exc);
    }

    public static IllegalArgumentException Z(Method method, int i2, String str, Object... objArr) {
        return Y(method, null, ua80.i(str, " (", ov90.b.d(method, i2), Separators.RPAREN), objArr);
    }

    public static final void a(l0 l0Var, Function1 function1, fet fetVar, int i2) {
        l0Var.getClass();
        function1.getClass();
        fetVar.g0(-245642859);
        int i3 = (fetVar.g(l0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            l(u1c.M(-246155093, new u(l0Var, b2), fetVar), u1c.M(1465123274, new ri1(l0Var, function1, (byte) 14), fetVar), fetVar, 54);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(l0Var, function1, i2, (byte) 9);
        }
    }

    public static IllegalArgumentException a0(Method method, Exception exc, int i2, String str, Object... objArr) {
        return Y(method, exc, ua80.i(str, " (", ov90.b.d(method, i2), Separators.RPAREN), objArr);
    }

    public static final void b(boolean z, Function0 function0, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(-416588517);
        int i3 = (fetVar.h(z) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new y(function0, b2);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            boolean z2 = (i3 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new z(b2, z);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            dwi0.b(function1, null, (Function1) objP2, fetVar2, 6, 2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a0(z, function0, i2, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    public static Type b0(Type type, Class cls, Type type2) {
        Type type3;
        Type type4 = type2;
        while (true) {
            int i2 = 0;
            if (!(type4 instanceof TypeVariable)) {
                if (type4 instanceof Class) {
                    Class cls2 = (Class) type4;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeB0 = b0(type, cls, componentType);
                        return componentType == typeB0 ? cls2 : new ztt0(typeB0);
                    }
                }
                if (type4 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type4;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeB1 = b0(type, cls, genericComponentType);
                    return genericComponentType == typeB1 ? genericArrayType : new ztt0(typeB1);
                }
                if (type4 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type4;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeB2 = b0(type, cls, ownerType);
                    boolean z = typeB2 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i2 < length) {
                        Type typeB3 = b0(type, cls, actualTypeArguments[i2]);
                        if (typeB3 != actualTypeArguments[i2]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i2] = typeB3;
                        }
                        i2++;
                    }
                    return z ? new aut0(typeB2, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z2 = type4 instanceof WildcardType;
                Type type5 = type4;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type4;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeB4 = b0(type, cls, lowerBounds[0]);
                        type5 = wildcardType;
                        if (typeB4 != lowerBounds[0]) {
                            return new but0(new Type[]{Object.class}, new Type[]{typeB4});
                        }
                    } else {
                        type5 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type typeB5 = b0(type, cls, upperBounds[0]);
                            type5 = wildcardType;
                            if (typeB5 != upperBounds[0]) {
                                return new but0(new Type[]{typeB5}, n);
                            }
                        }
                    }
                }
                return type5;
            }
            TypeVariable typeVariable = (TypeVariable) type4;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type3 = typeVariable;
            } else {
                Type typeQ = Q(type, cls, cls3);
                if (typeQ instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i2 >= typeParameters.length) {
                            itt0.a();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i2])) {
                            type3 = ((ParameterizedType) typeQ).getActualTypeArguments()[i2];
                            break;
                        }
                        i2++;
                    }
                } else {
                    type3 = typeVariable;
                }
            }
            if (type3 == typeVariable) {
                return type3;
            }
            type4 = type3;
        }
    }

    public static final void c(List list, Function1 function1, fet fetVar, int i2) {
        mm40 mm40VarN;
        list.getClass();
        function1.getClass();
        fetVar.g0(977261559);
        int i3 = (fetVar.i(list) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itV = kng0.v(fetVar, mm40VarC0, gqw0.v, -1827362052, list);
            int i4 = 0;
            while (itV.hasNext()) {
                Object next = itV.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                rx rxVar = (rx) next;
                if (i4 == 0) {
                    mm40VarN = jm40Var;
                } else {
                    zcl zclVar = qmk.f28987a;
                    mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                }
                wb.d(rxVar, function1, mm40VarN, fetVar, (i3 & 112) | 8);
                i4 = i5;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yx(list, function1, i2, b2);
        }
    }

    public static void c0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final void d(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, String str, String str2) {
        String str3;
        fet fetVar2;
        mm40 mm40Var2;
        str.getClass();
        l7m0Var.getClass();
        fetVar.g0(2091368156);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            str3 = str;
            i3 |= fetVar.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 2048 : 1024;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = fetVar.k(bmd.n) == k6z.b;
            boolean zH = fetVar.h(z);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                objP = new kp2(b2, z);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40Var2 = jm40Var;
            v8q0.a(str3, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(g1t0.n(), fetVar), fetVar, (i3 >> 3) & 14, 24960, 110590);
            v8q0.a((String) l7m0Var.getValue(), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.l(g1t0.q(), fetVar), fetVar, 0, 24576, 114686);
            v8q0.a(str2, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.l(g1t0.q(), fetVar), fetVar, (i3 >> 6) & 14, 24576, 114686);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 2, i2, (Object) mm40Var2, (Object) str, (Object) str2, (Object) l7m0Var);
        }
    }

    public static final nas d0(rt10 rt10Var, sip sipVar, long j2) {
        ArrayList arrayList;
        String str;
        Long l2;
        rt10Var.getClass();
        Long l3 = rt10Var.f31057a;
        ua30 ua30Var = rt10Var.H;
        nkl0 nkl0Var = rt10Var.z;
        hmz hmzVar = rt10Var.B;
        lfu0 lfu0Var = rt10Var.J;
        bds bdsVar = l3 != null ? new bds(l3.longValue()) : null;
        Long l4 = rt10Var.c;
        if (bdsVar == null || l4 == null) {
            return null;
        }
        long j3 = bdsVar.f2414a;
        long jLongValue = l4.longValue();
        Long l5 = rt10Var.s;
        String str2 = rt10Var.j;
        String str3 = rt10Var.m;
        String str4 = rt10Var.h;
        String str5 = lfu0Var != null ? lfu0Var.b : null;
        Integer num = rt10Var.y;
        String str6 = rt10Var.l;
        Integer num2 = rt10Var.b;
        Boolean bool = rt10Var.w;
        String str7 = rt10Var.e;
        iun iunVar = iun.f15405a;
        List list = rt10Var.F;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                arrayList2.add(e3c.K((tdo) it.next(), sipVar));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Long l6 = hmzVar != null ? hmzVar.f13327a : null;
        String str8 = hmzVar != null ? hmzVar.b : null;
        h6h0 h6h0Var = rt10Var.K;
        tas tasVarK = h6h0Var != null ? tfx.K(h6h0Var) : null;
        oas oasVarL0 = ucx.l0(rt10Var.C);
        oas oasVarL1 = ucx.l0(rt10Var.D);
        Long l7 = rt10Var.f;
        Long lValueOf = l7 != null ? Long.valueOf(l7.longValue() - j2) : null;
        s3n0 s3n0Var = rt10Var.A;
        Long l8 = s3n0Var != null ? s3n0Var.f31567a : null;
        long jLongValue2 = (nkl0Var == null || (l2 = nkl0Var.f23686a) == null) ? 0L : l2.longValue();
        ufs ufsVarR = ua30Var != null ? qxw.R(ua30Var) : null;
        Boolean bool2 = rt10Var.x;
        Boolean bool3 = rt10Var.I;
        Long lValueOf2 = (ua30Var == null || (str = ua30Var.m) == null) ? null : Long.valueOf(Long.parseLong(str));
        Boolean bool4 = rt10Var.p;
        Integer num3 = rt10Var.q;
        pem0 pem0Var = rt10Var.G;
        String str9 = pem0Var != null ? pem0Var.b : null;
        boolean zD = Intrinsics.d(rt10Var.v, Boolean.TRUE);
        Boolean bool5 = lfu0Var != null ? lfu0Var.f19976a : null;
        qud qudVar = boh.b;
        Integer num4 = hmzVar != null ? hmzVar.d : null;
        Boolean bool6 = nkl0Var != null ? nkl0Var.d : null;
        qudVar.getClass();
        boh bohVarD = qud.d(num4, bool6);
        Long l9 = rt10Var.g;
        return new nas(j3, jLongValue, l5, str2, str3, str4, str5, bool5, num, str6, num2, bool, str7, null, iunVar, arrayList, l6, sipVar, str8, tasVarK, l7, lValueOf, l8, jLongValue2, oasVarL0, oasVarL1, zD, null, ufsVarR, bool2, bool3, lValueOf2, bool4, num3, str9, null, bohVarD, l9 != null ? Integer.valueOf((int) l9.longValue()) : null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0072  */
    /* JADX WARN: Code duplicated, block: B:49:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void e(oms0 oms0Var, mm40 mm40Var, Function1 function1, u12 u12Var, Function1 function2, ydr ydrVar, fet fetVar, int i2, int i3) {
        int i4;
        Function1 function3;
        ydr ydrVar2;
        boolean z;
        u12 u12Var2;
        yfe0 yfe0VarU;
        u12 u12Var3;
        cl5 cl5Var;
        Function1 function4;
        Object objP;
        Object objP2;
        int i5;
        fetVar.g0(511725103);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.g(oms0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.i(function1) ? 256 : 128;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= fetVar.g(u12Var) ? 2048 : 1024;
        }
        int i7 = i3 & 8;
        if (i7 == 0) {
            if ((i2 & 24576) == 0) {
                function3 = function2;
                i4 |= fetVar.i(function3) ? 16384 : 8192;
            }
            if ((i2 & 196608) == 0) {
                ydrVar2 = ydrVar;
                if (fetVar.i(ydrVar2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i4 |= i5;
            } else {
                ydrVar2 = ydrVar;
            }
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i6 != 0) {
                    u12Var3 = gqw0.f11754a;
                } else {
                    u12Var3 = u12Var;
                }
                cl5Var = ukd.f35823a;
                if (i7 != 0) {
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = m9.x;
                        fetVar.o0(objP2);
                    }
                    function4 = (Function1) objP2;
                } else {
                    function4 = function3;
                }
                objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = m9.y;
                    fetVar.o0(objP);
                }
                g(oms0Var, mm40Var, function1, u12Var3, function4, (Function1) objP, ydrVar2, fetVar, ((i4 << 3) & 3670016) | (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4));
                function3 = function4;
                u12Var2 = u12Var3;
            } else {
                fetVar.X();
                u12Var2 = u12Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new q43(oms0Var, mm40Var, function1, u12Var2, function3, ydrVar, i2, i3);
            }
        }
        i4 |= 24576;
        function3 = function2;
        if ((i2 & 196608) == 0) {
            ydrVar2 = ydrVar;
            if (fetVar.i(ydrVar2)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i4 |= i5;
        } else {
            ydrVar2 = ydrVar;
        }
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            if (i6 != 0) {
                u12Var3 = gqw0.f11754a;
            } else {
                u12Var3 = u12Var;
            }
            cl5Var = ukd.f35823a;
            if (i7 != 0) {
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = m9.x;
                    fetVar.o0(objP2);
                }
                function4 = (Function1) objP2;
            } else {
                function4 = function3;
            }
            objP = fetVar.P();
            if (objP == cl5Var) {
                objP = m9.y;
                fetVar.o0(objP);
            }
            g(oms0Var, mm40Var, function1, u12Var3, function4, (Function1) objP, ydrVar2, fetVar, ((i4 << 3) & 3670016) | (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4));
            function3 = function4;
            u12Var2 = u12Var3;
        } else {
            fetVar.X();
            u12Var2 = u12Var;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q43(oms0Var, mm40Var, function1, u12Var2, function3, ydrVar, i2, i3);
        }
    }

    public static final lie e0(pzn pznVar, alo aloVar) {
        return new lie(pznVar, aloVar, (u7k0) null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0112  */
    /* JADX WARN: Code duplicated, block: B:104:0x0139  */
    /* JADX WARN: Code duplicated, block: B:107:0x0147  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0083  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x009e  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:97:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:99:0x0104  */
    public static final void f(Object obj, mm40 mm40Var, Function1 function1, u12 u12Var, String str, Function1 function2, ydr ydrVar, fet fetVar, int i2, int i3) {
        int i4;
        mm40 mm40Var2;
        int i5;
        Function1 function3;
        int i6;
        int i7;
        u12 u12Var2;
        int i8;
        int i9;
        String str2;
        int i10;
        int i11;
        Function1 function4;
        int i12;
        ydr ydrVar2;
        boolean z;
        mm40 mm40Var3;
        Function1 function5;
        u12 u12Var3;
        Function1 function6;
        String str3;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        cl5 cl5Var;
        u12 u12Var4;
        Function1 function7;
        Object objP;
        Object objP2;
        int i13;
        fetVar.g0(1501828832);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? fetVar.g(obj) : fetVar.i(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 == 0) {
            if ((i2 & 48) == 0) {
                mm40Var2 = mm40Var;
                i4 |= fetVar.g(mm40Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    function3 = function1;
                    if (fetVar.i(function3)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        u12Var2 = u12Var;
                        if (fetVar.g(u12Var2)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            str2 = str;
                            if (fetVar.g(str2)) {
                                i10 = 16384;
                            } else {
                                i10 = 8192;
                            }
                            i4 |= i10;
                        }
                        i11 = i3 & 32;
                        if (i11 != 0) {
                            if ((196608 & i2) == 0) {
                                function4 = function2;
                                if (fetVar.i(function4)) {
                                    i12 = 131072;
                                } else {
                                    i12 = 65536;
                                }
                                i4 |= i12;
                            }
                            if ((1572864 & i2) == 0) {
                                ydrVar2 = ydrVar;
                                if (fetVar.i(ydrVar2)) {
                                    i13 = 1048576;
                                } else {
                                    i13 = 524288;
                                }
                                i4 |= i13;
                            } else {
                                ydrVar2 = ydrVar;
                            }
                            if ((599187 & i4) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (fetVar.U(i4 & 1, z)) {
                                if (i14 != 0) {
                                    mm40Var4 = jm40.b;
                                } else {
                                    mm40Var4 = mm40Var2;
                                }
                                cl5Var = ukd.f35823a;
                                if (i5 != 0) {
                                    objP2 = fetVar.P();
                                    if (objP2 == cl5Var) {
                                        objP2 = m9.v;
                                        fetVar.o0(objP2);
                                    }
                                    function3 = (Function1) objP2;
                                }
                                if (i7 != 0) {
                                    u12Var4 = gqw0.f11754a;
                                } else {
                                    u12Var4 = u12Var2;
                                }
                                if (i9 != 0) {
                                    str2 = "AnimatedContent";
                                }
                                if (i11 != 0) {
                                    objP = fetVar.P();
                                    if (objP == cl5Var) {
                                        objP = m9.w;
                                        fetVar.o0(objP);
                                    }
                                    Function1 function8 = function3;
                                    function6 = (Function1) objP;
                                    function7 = function8;
                                } else {
                                    function7 = function3;
                                    function6 = function4;
                                }
                                oms0 oms0VarZ = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                                int i15 = i4 & 8176;
                                int i16 = i4 >> 3;
                                mm40 mm40Var5 = mm40Var4;
                                e(oms0VarZ, mm40Var5, function7, u12Var4, function6, ydrVar2, fetVar, i15 | (57344 & i16) | (i16 & 458752), 0);
                                mm40Var3 = mm40Var5;
                                function5 = function7;
                                u12Var3 = u12Var4;
                            } else {
                                fetVar.X();
                                mm40Var3 = mm40Var2;
                                function5 = function3;
                                u12Var3 = u12Var2;
                                function6 = function4;
                            }
                            str3 = str2;
                            yfe0VarU = fetVar.u();
                            if (yfe0VarU != null) {
                                yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                            }
                        }
                        i4 |= 196608;
                        function4 = function2;
                        if ((1572864 & i2) == 0) {
                            ydrVar2 = ydrVar;
                            if (fetVar.i(ydrVar2)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i4 |= i13;
                        } else {
                            ydrVar2 = ydrVar;
                        }
                        if ((599187 & i4) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i4 & 1, z)) {
                            if (i14 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            cl5Var = ukd.f35823a;
                            if (i5 != 0) {
                                objP2 = fetVar.P();
                                if (objP2 == cl5Var) {
                                    objP2 = m9.v;
                                    fetVar.o0(objP2);
                                }
                                function3 = (Function1) objP2;
                            }
                            if (i7 != 0) {
                                u12Var4 = gqw0.f11754a;
                            } else {
                                u12Var4 = u12Var2;
                            }
                            if (i9 != 0) {
                                str2 = "AnimatedContent";
                            }
                            if (i11 != 0) {
                                objP = fetVar.P();
                                if (objP == cl5Var) {
                                    objP = m9.w;
                                    fetVar.o0(objP);
                                }
                                Function1 function9 = function3;
                                function6 = (Function1) objP;
                                function7 = function9;
                            } else {
                                function7 = function3;
                                function6 = function4;
                            }
                            oms0 oms0VarZ2 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                            int i17 = i4 & 8176;
                            int i18 = i4 >> 3;
                            mm40 mm40Var6 = mm40Var4;
                            e(oms0VarZ2, mm40Var6, function7, u12Var4, function6, ydrVar2, fetVar, i17 | (57344 & i18) | (i18 & 458752), 0);
                            mm40Var3 = mm40Var6;
                            function5 = function7;
                            u12Var3 = u12Var4;
                        } else {
                            fetVar.X();
                            mm40Var3 = mm40Var2;
                            function5 = function3;
                            u12Var3 = u12Var2;
                            function6 = function4;
                        }
                        str3 = str2;
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                        }
                    }
                    i4 |= 24576;
                    str2 = str;
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        if ((196608 & i2) == 0) {
                            function4 = function2;
                            if (fetVar.i(function4)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i4 |= i12;
                        }
                        if ((1572864 & i2) == 0) {
                            ydrVar2 = ydrVar;
                            if (fetVar.i(ydrVar2)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i4 |= i13;
                        } else {
                            ydrVar2 = ydrVar;
                        }
                        if ((599187 & i4) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i4 & 1, z)) {
                            if (i14 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            cl5Var = ukd.f35823a;
                            if (i5 != 0) {
                                objP2 = fetVar.P();
                                if (objP2 == cl5Var) {
                                    objP2 = m9.v;
                                    fetVar.o0(objP2);
                                }
                                function3 = (Function1) objP2;
                            }
                            if (i7 != 0) {
                                u12Var4 = gqw0.f11754a;
                            } else {
                                u12Var4 = u12Var2;
                            }
                            if (i9 != 0) {
                                str2 = "AnimatedContent";
                            }
                            if (i11 != 0) {
                                objP = fetVar.P();
                                if (objP == cl5Var) {
                                    objP = m9.w;
                                    fetVar.o0(objP);
                                }
                                Function1 function10 = function3;
                                function6 = (Function1) objP;
                                function7 = function10;
                            } else {
                                function7 = function3;
                                function6 = function4;
                            }
                            oms0 oms0VarZ3 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                            int i19 = i4 & 8176;
                            int i110 = i4 >> 3;
                            mm40 mm40Var7 = mm40Var4;
                            e(oms0VarZ3, mm40Var7, function7, u12Var4, function6, ydrVar2, fetVar, i19 | (57344 & i110) | (i110 & 458752), 0);
                            mm40Var3 = mm40Var7;
                            function5 = function7;
                            u12Var3 = u12Var4;
                        } else {
                            fetVar.X();
                            mm40Var3 = mm40Var2;
                            function5 = function3;
                            u12Var3 = u12Var2;
                            function6 = function4;
                        }
                        str3 = str2;
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                        }
                    }
                    i4 |= 196608;
                    function4 = function2;
                    if ((1572864 & i2) == 0) {
                        ydrVar2 = ydrVar;
                        if (fetVar.i(ydrVar2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    } else {
                        ydrVar2 = ydrVar;
                    }
                    if ((599187 & i4) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i4 & 1, z)) {
                        if (i14 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        cl5Var = ukd.f35823a;
                        if (i5 != 0) {
                            objP2 = fetVar.P();
                            if (objP2 == cl5Var) {
                                objP2 = m9.v;
                                fetVar.o0(objP2);
                            }
                            function3 = (Function1) objP2;
                        }
                        if (i7 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i11 != 0) {
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = m9.w;
                                fetVar.o0(objP);
                            }
                            Function1 function11 = function3;
                            function6 = (Function1) objP;
                            function7 = function11;
                        } else {
                            function7 = function3;
                            function6 = function4;
                        }
                        oms0 oms0VarZ4 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        int i111 = i4 & 8176;
                        int i112 = i4 >> 3;
                        mm40 mm40Var8 = mm40Var4;
                        e(oms0VarZ4, mm40Var8, function7, u12Var4, function6, ydrVar2, fetVar, i111 | (57344 & i112) | (i112 & 458752), 0);
                        mm40Var3 = mm40Var8;
                        function5 = function7;
                        u12Var3 = u12Var4;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        function5 = function3;
                        u12Var3 = u12Var2;
                        function6 = function4;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                    }
                }
                i4 |= 3072;
                u12Var2 = u12Var;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        str2 = str;
                        if (fetVar.g(str2)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        if ((196608 & i2) == 0) {
                            function4 = function2;
                            if (fetVar.i(function4)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i4 |= i12;
                        }
                        if ((1572864 & i2) == 0) {
                            ydrVar2 = ydrVar;
                            if (fetVar.i(ydrVar2)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i4 |= i13;
                        } else {
                            ydrVar2 = ydrVar;
                        }
                        if ((599187 & i4) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i4 & 1, z)) {
                            if (i14 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            cl5Var = ukd.f35823a;
                            if (i5 != 0) {
                                objP2 = fetVar.P();
                                if (objP2 == cl5Var) {
                                    objP2 = m9.v;
                                    fetVar.o0(objP2);
                                }
                                function3 = (Function1) objP2;
                            }
                            if (i7 != 0) {
                                u12Var4 = gqw0.f11754a;
                            } else {
                                u12Var4 = u12Var2;
                            }
                            if (i9 != 0) {
                                str2 = "AnimatedContent";
                            }
                            if (i11 != 0) {
                                objP = fetVar.P();
                                if (objP == cl5Var) {
                                    objP = m9.w;
                                    fetVar.o0(objP);
                                }
                                Function1 function12 = function3;
                                function6 = (Function1) objP;
                                function7 = function12;
                            } else {
                                function7 = function3;
                                function6 = function4;
                            }
                            oms0 oms0VarZ5 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                            int i113 = i4 & 8176;
                            int i114 = i4 >> 3;
                            mm40 mm40Var9 = mm40Var4;
                            e(oms0VarZ5, mm40Var9, function7, u12Var4, function6, ydrVar2, fetVar, i113 | (57344 & i114) | (i114 & 458752), 0);
                            mm40Var3 = mm40Var9;
                            function5 = function7;
                            u12Var3 = u12Var4;
                        } else {
                            fetVar.X();
                            mm40Var3 = mm40Var2;
                            function5 = function3;
                            u12Var3 = u12Var2;
                            function6 = function4;
                        }
                        str3 = str2;
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                        }
                    }
                    i4 |= 196608;
                    function4 = function2;
                    if ((1572864 & i2) == 0) {
                        ydrVar2 = ydrVar;
                        if (fetVar.i(ydrVar2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    } else {
                        ydrVar2 = ydrVar;
                    }
                    if ((599187 & i4) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i4 & 1, z)) {
                        if (i14 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        cl5Var = ukd.f35823a;
                        if (i5 != 0) {
                            objP2 = fetVar.P();
                            if (objP2 == cl5Var) {
                                objP2 = m9.v;
                                fetVar.o0(objP2);
                            }
                            function3 = (Function1) objP2;
                        }
                        if (i7 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i11 != 0) {
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = m9.w;
                                fetVar.o0(objP);
                            }
                            Function1 function13 = function3;
                            function6 = (Function1) objP;
                            function7 = function13;
                        } else {
                            function7 = function3;
                            function6 = function4;
                        }
                        oms0 oms0VarZ6 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        int i115 = i4 & 8176;
                        int i116 = i4 >> 3;
                        mm40 mm40Var10 = mm40Var4;
                        e(oms0VarZ6, mm40Var10, function7, u12Var4, function6, ydrVar2, fetVar, i115 | (57344 & i116) | (i116 & 458752), 0);
                        mm40Var3 = mm40Var10;
                        function5 = function7;
                        u12Var3 = u12Var4;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        function5 = function3;
                        u12Var3 = u12Var2;
                        function6 = function4;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                    }
                }
                i4 |= 24576;
                str2 = str;
                i11 = i3 & 32;
                if (i11 != 0) {
                    if ((196608 & i2) == 0) {
                        function4 = function2;
                        if (fetVar.i(function4)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((1572864 & i2) == 0) {
                        ydrVar2 = ydrVar;
                        if (fetVar.i(ydrVar2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    } else {
                        ydrVar2 = ydrVar;
                    }
                    if ((599187 & i4) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i4 & 1, z)) {
                        if (i14 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        cl5Var = ukd.f35823a;
                        if (i5 != 0) {
                            objP2 = fetVar.P();
                            if (objP2 == cl5Var) {
                                objP2 = m9.v;
                                fetVar.o0(objP2);
                            }
                            function3 = (Function1) objP2;
                        }
                        if (i7 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i11 != 0) {
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = m9.w;
                                fetVar.o0(objP);
                            }
                            Function1 function14 = function3;
                            function6 = (Function1) objP;
                            function7 = function14;
                        } else {
                            function7 = function3;
                            function6 = function4;
                        }
                        oms0 oms0VarZ7 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        int i117 = i4 & 8176;
                        int i118 = i4 >> 3;
                        mm40 mm40Var11 = mm40Var4;
                        e(oms0VarZ7, mm40Var11, function7, u12Var4, function6, ydrVar2, fetVar, i117 | (57344 & i118) | (i118 & 458752), 0);
                        mm40Var3 = mm40Var11;
                        function5 = function7;
                        u12Var3 = u12Var4;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        function5 = function3;
                        u12Var3 = u12Var2;
                        function6 = function4;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                    }
                }
                i4 |= 196608;
                function4 = function2;
                if ((1572864 & i2) == 0) {
                    ydrVar2 = ydrVar;
                    if (fetVar.i(ydrVar2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                } else {
                    ydrVar2 = ydrVar;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i14 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    cl5Var = ukd.f35823a;
                    if (i5 != 0) {
                        objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = m9.v;
                            fetVar.o0(objP2);
                        }
                        function3 = (Function1) objP2;
                    }
                    if (i7 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i11 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = m9.w;
                            fetVar.o0(objP);
                        }
                        Function1 function15 = function3;
                        function6 = (Function1) objP;
                        function7 = function15;
                    } else {
                        function7 = function3;
                        function6 = function4;
                    }
                    oms0 oms0VarZ8 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    int i119 = i4 & 8176;
                    int i1110 = i4 >> 3;
                    mm40 mm40Var12 = mm40Var4;
                    e(oms0VarZ8, mm40Var12, function7, u12Var4, function6, ydrVar2, fetVar, i119 | (57344 & i1110) | (i1110 & 458752), 0);
                    mm40Var3 = mm40Var12;
                    function5 = function7;
                    u12Var3 = u12Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    function5 = function3;
                    u12Var3 = u12Var2;
                    function6 = function4;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                }
            }
            i4 |= 384;
            function3 = function1;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    u12Var2 = u12Var;
                    if (fetVar.g(u12Var2)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        str2 = str;
                        if (fetVar.g(str2)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        if ((196608 & i2) == 0) {
                            function4 = function2;
                            if (fetVar.i(function4)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i4 |= i12;
                        }
                        if ((1572864 & i2) == 0) {
                            ydrVar2 = ydrVar;
                            if (fetVar.i(ydrVar2)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i4 |= i13;
                        } else {
                            ydrVar2 = ydrVar;
                        }
                        if ((599187 & i4) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i4 & 1, z)) {
                            if (i14 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            cl5Var = ukd.f35823a;
                            if (i5 != 0) {
                                objP2 = fetVar.P();
                                if (objP2 == cl5Var) {
                                    objP2 = m9.v;
                                    fetVar.o0(objP2);
                                }
                                function3 = (Function1) objP2;
                            }
                            if (i7 != 0) {
                                u12Var4 = gqw0.f11754a;
                            } else {
                                u12Var4 = u12Var2;
                            }
                            if (i9 != 0) {
                                str2 = "AnimatedContent";
                            }
                            if (i11 != 0) {
                                objP = fetVar.P();
                                if (objP == cl5Var) {
                                    objP = m9.w;
                                    fetVar.o0(objP);
                                }
                                Function1 function16 = function3;
                                function6 = (Function1) objP;
                                function7 = function16;
                            } else {
                                function7 = function3;
                                function6 = function4;
                            }
                            oms0 oms0VarZ9 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                            int i1111 = i4 & 8176;
                            int i1112 = i4 >> 3;
                            mm40 mm40Var13 = mm40Var4;
                            e(oms0VarZ9, mm40Var13, function7, u12Var4, function6, ydrVar2, fetVar, i1111 | (57344 & i1112) | (i1112 & 458752), 0);
                            mm40Var3 = mm40Var13;
                            function5 = function7;
                            u12Var3 = u12Var4;
                        } else {
                            fetVar.X();
                            mm40Var3 = mm40Var2;
                            function5 = function3;
                            u12Var3 = u12Var2;
                            function6 = function4;
                        }
                        str3 = str2;
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                        }
                    }
                    i4 |= 196608;
                    function4 = function2;
                    if ((1572864 & i2) == 0) {
                        ydrVar2 = ydrVar;
                        if (fetVar.i(ydrVar2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    } else {
                        ydrVar2 = ydrVar;
                    }
                    if ((599187 & i4) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i4 & 1, z)) {
                        if (i14 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        cl5Var = ukd.f35823a;
                        if (i5 != 0) {
                            objP2 = fetVar.P();
                            if (objP2 == cl5Var) {
                                objP2 = m9.v;
                                fetVar.o0(objP2);
                            }
                            function3 = (Function1) objP2;
                        }
                        if (i7 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i11 != 0) {
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = m9.w;
                                fetVar.o0(objP);
                            }
                            Function1 function17 = function3;
                            function6 = (Function1) objP;
                            function7 = function17;
                        } else {
                            function7 = function3;
                            function6 = function4;
                        }
                        oms0 oms0VarZ10 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        int i1113 = i4 & 8176;
                        int i1114 = i4 >> 3;
                        mm40 mm40Var14 = mm40Var4;
                        e(oms0VarZ10, mm40Var14, function7, u12Var4, function6, ydrVar2, fetVar, i1113 | (57344 & i1114) | (i1114 & 458752), 0);
                        mm40Var3 = mm40Var14;
                        function5 = function7;
                        u12Var3 = u12Var4;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        function5 = function3;
                        u12Var3 = u12Var2;
                        function6 = function4;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                    }
                }
                i4 |= 24576;
                str2 = str;
                i11 = i3 & 32;
                if (i11 != 0) {
                    if ((196608 & i2) == 0) {
                        function4 = function2;
                        if (fetVar.i(function4)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((1572864 & i2) == 0) {
                        ydrVar2 = ydrVar;
                        if (fetVar.i(ydrVar2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    } else {
                        ydrVar2 = ydrVar;
                    }
                    if ((599187 & i4) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i4 & 1, z)) {
                        if (i14 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        cl5Var = ukd.f35823a;
                        if (i5 != 0) {
                            objP2 = fetVar.P();
                            if (objP2 == cl5Var) {
                                objP2 = m9.v;
                                fetVar.o0(objP2);
                            }
                            function3 = (Function1) objP2;
                        }
                        if (i7 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i11 != 0) {
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = m9.w;
                                fetVar.o0(objP);
                            }
                            Function1 function18 = function3;
                            function6 = (Function1) objP;
                            function7 = function18;
                        } else {
                            function7 = function3;
                            function6 = function4;
                        }
                        oms0 oms0VarZ11 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        int i1115 = i4 & 8176;
                        int i1116 = i4 >> 3;
                        mm40 mm40Var15 = mm40Var4;
                        e(oms0VarZ11, mm40Var15, function7, u12Var4, function6, ydrVar2, fetVar, i1115 | (57344 & i1116) | (i1116 & 458752), 0);
                        mm40Var3 = mm40Var15;
                        function5 = function7;
                        u12Var3 = u12Var4;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        function5 = function3;
                        u12Var3 = u12Var2;
                        function6 = function4;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                    }
                }
                i4 |= 196608;
                function4 = function2;
                if ((1572864 & i2) == 0) {
                    ydrVar2 = ydrVar;
                    if (fetVar.i(ydrVar2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                } else {
                    ydrVar2 = ydrVar;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i14 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    cl5Var = ukd.f35823a;
                    if (i5 != 0) {
                        objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = m9.v;
                            fetVar.o0(objP2);
                        }
                        function3 = (Function1) objP2;
                    }
                    if (i7 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i11 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = m9.w;
                            fetVar.o0(objP);
                        }
                        Function1 function19 = function3;
                        function6 = (Function1) objP;
                        function7 = function19;
                    } else {
                        function7 = function3;
                        function6 = function4;
                    }
                    oms0 oms0VarZ12 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    int i1117 = i4 & 8176;
                    int i1118 = i4 >> 3;
                    mm40 mm40Var16 = mm40Var4;
                    e(oms0VarZ12, mm40Var16, function7, u12Var4, function6, ydrVar2, fetVar, i1117 | (57344 & i1118) | (i1118 & 458752), 0);
                    mm40Var3 = mm40Var16;
                    function5 = function7;
                    u12Var3 = u12Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    function5 = function3;
                    u12Var3 = u12Var2;
                    function6 = function4;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                }
            }
            i4 |= 3072;
            u12Var2 = u12Var;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    str2 = str;
                    if (fetVar.g(str2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    if ((196608 & i2) == 0) {
                        function4 = function2;
                        if (fetVar.i(function4)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((1572864 & i2) == 0) {
                        ydrVar2 = ydrVar;
                        if (fetVar.i(ydrVar2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    } else {
                        ydrVar2 = ydrVar;
                    }
                    if ((599187 & i4) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i4 & 1, z)) {
                        if (i14 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        cl5Var = ukd.f35823a;
                        if (i5 != 0) {
                            objP2 = fetVar.P();
                            if (objP2 == cl5Var) {
                                objP2 = m9.v;
                                fetVar.o0(objP2);
                            }
                            function3 = (Function1) objP2;
                        }
                        if (i7 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i11 != 0) {
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = m9.w;
                                fetVar.o0(objP);
                            }
                            Function1 function110 = function3;
                            function6 = (Function1) objP;
                            function7 = function110;
                        } else {
                            function7 = function3;
                            function6 = function4;
                        }
                        oms0 oms0VarZ13 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        int i1119 = i4 & 8176;
                        int i11110 = i4 >> 3;
                        mm40 mm40Var17 = mm40Var4;
                        e(oms0VarZ13, mm40Var17, function7, u12Var4, function6, ydrVar2, fetVar, i1119 | (57344 & i11110) | (i11110 & 458752), 0);
                        mm40Var3 = mm40Var17;
                        function5 = function7;
                        u12Var3 = u12Var4;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        function5 = function3;
                        u12Var3 = u12Var2;
                        function6 = function4;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                    }
                }
                i4 |= 196608;
                function4 = function2;
                if ((1572864 & i2) == 0) {
                    ydrVar2 = ydrVar;
                    if (fetVar.i(ydrVar2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                } else {
                    ydrVar2 = ydrVar;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i14 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    cl5Var = ukd.f35823a;
                    if (i5 != 0) {
                        objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = m9.v;
                            fetVar.o0(objP2);
                        }
                        function3 = (Function1) objP2;
                    }
                    if (i7 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i11 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = m9.w;
                            fetVar.o0(objP);
                        }
                        Function1 function111 = function3;
                        function6 = (Function1) objP;
                        function7 = function111;
                    } else {
                        function7 = function3;
                        function6 = function4;
                    }
                    oms0 oms0VarZ14 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    int i11111 = i4 & 8176;
                    int i11112 = i4 >> 3;
                    mm40 mm40Var18 = mm40Var4;
                    e(oms0VarZ14, mm40Var18, function7, u12Var4, function6, ydrVar2, fetVar, i11111 | (57344 & i11112) | (i11112 & 458752), 0);
                    mm40Var3 = mm40Var18;
                    function5 = function7;
                    u12Var3 = u12Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    function5 = function3;
                    u12Var3 = u12Var2;
                    function6 = function4;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                }
            }
            i4 |= 24576;
            str2 = str;
            i11 = i3 & 32;
            if (i11 != 0) {
                if ((196608 & i2) == 0) {
                    function4 = function2;
                    if (fetVar.i(function4)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((1572864 & i2) == 0) {
                    ydrVar2 = ydrVar;
                    if (fetVar.i(ydrVar2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                } else {
                    ydrVar2 = ydrVar;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i14 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    cl5Var = ukd.f35823a;
                    if (i5 != 0) {
                        objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = m9.v;
                            fetVar.o0(objP2);
                        }
                        function3 = (Function1) objP2;
                    }
                    if (i7 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i11 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = m9.w;
                            fetVar.o0(objP);
                        }
                        Function1 function112 = function3;
                        function6 = (Function1) objP;
                        function7 = function112;
                    } else {
                        function7 = function3;
                        function6 = function4;
                    }
                    oms0 oms0VarZ15 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    int i11113 = i4 & 8176;
                    int i11114 = i4 >> 3;
                    mm40 mm40Var19 = mm40Var4;
                    e(oms0VarZ15, mm40Var19, function7, u12Var4, function6, ydrVar2, fetVar, i11113 | (57344 & i11114) | (i11114 & 458752), 0);
                    mm40Var3 = mm40Var19;
                    function5 = function7;
                    u12Var3 = u12Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    function5 = function3;
                    u12Var3 = u12Var2;
                    function6 = function4;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                }
            }
            i4 |= 196608;
            function4 = function2;
            if ((1572864 & i2) == 0) {
                ydrVar2 = ydrVar;
                if (fetVar.i(ydrVar2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i4 |= i13;
            } else {
                ydrVar2 = ydrVar;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i14 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                cl5Var = ukd.f35823a;
                if (i5 != 0) {
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = m9.v;
                        fetVar.o0(objP2);
                    }
                    function3 = (Function1) objP2;
                }
                if (i7 != 0) {
                    u12Var4 = gqw0.f11754a;
                } else {
                    u12Var4 = u12Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedContent";
                }
                if (i11 != 0) {
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = m9.w;
                        fetVar.o0(objP);
                    }
                    Function1 function113 = function3;
                    function6 = (Function1) objP;
                    function7 = function113;
                } else {
                    function7 = function3;
                    function6 = function4;
                }
                oms0 oms0VarZ16 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                int i11115 = i4 & 8176;
                int i11116 = i4 >> 3;
                mm40 mm40Var110 = mm40Var4;
                e(oms0VarZ16, mm40Var110, function7, u12Var4, function6, ydrVar2, fetVar, i11115 | (57344 & i11116) | (i11116 & 458752), 0);
                mm40Var3 = mm40Var110;
                function5 = function7;
                u12Var3 = u12Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                function5 = function3;
                u12Var3 = u12Var2;
                function6 = function4;
            }
            str3 = str2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
            }
        }
        i4 |= 48;
        mm40Var2 = mm40Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                function3 = function1;
                if (fetVar.i(function3)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    u12Var2 = u12Var;
                    if (fetVar.g(u12Var2)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        str2 = str;
                        if (fetVar.g(str2)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        if ((196608 & i2) == 0) {
                            function4 = function2;
                            if (fetVar.i(function4)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i4 |= i12;
                        }
                        if ((1572864 & i2) == 0) {
                            ydrVar2 = ydrVar;
                            if (fetVar.i(ydrVar2)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i4 |= i13;
                        } else {
                            ydrVar2 = ydrVar;
                        }
                        if ((599187 & i4) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i4 & 1, z)) {
                            if (i14 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            cl5Var = ukd.f35823a;
                            if (i5 != 0) {
                                objP2 = fetVar.P();
                                if (objP2 == cl5Var) {
                                    objP2 = m9.v;
                                    fetVar.o0(objP2);
                                }
                                function3 = (Function1) objP2;
                            }
                            if (i7 != 0) {
                                u12Var4 = gqw0.f11754a;
                            } else {
                                u12Var4 = u12Var2;
                            }
                            if (i9 != 0) {
                                str2 = "AnimatedContent";
                            }
                            if (i11 != 0) {
                                objP = fetVar.P();
                                if (objP == cl5Var) {
                                    objP = m9.w;
                                    fetVar.o0(objP);
                                }
                                Function1 function114 = function3;
                                function6 = (Function1) objP;
                                function7 = function114;
                            } else {
                                function7 = function3;
                                function6 = function4;
                            }
                            oms0 oms0VarZ17 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                            int i11117 = i4 & 8176;
                            int i11118 = i4 >> 3;
                            mm40 mm40Var111 = mm40Var4;
                            e(oms0VarZ17, mm40Var111, function7, u12Var4, function6, ydrVar2, fetVar, i11117 | (57344 & i11118) | (i11118 & 458752), 0);
                            mm40Var3 = mm40Var111;
                            function5 = function7;
                            u12Var3 = u12Var4;
                        } else {
                            fetVar.X();
                            mm40Var3 = mm40Var2;
                            function5 = function3;
                            u12Var3 = u12Var2;
                            function6 = function4;
                        }
                        str3 = str2;
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                        }
                    }
                    i4 |= 196608;
                    function4 = function2;
                    if ((1572864 & i2) == 0) {
                        ydrVar2 = ydrVar;
                        if (fetVar.i(ydrVar2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    } else {
                        ydrVar2 = ydrVar;
                    }
                    if ((599187 & i4) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i4 & 1, z)) {
                        if (i14 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        cl5Var = ukd.f35823a;
                        if (i5 != 0) {
                            objP2 = fetVar.P();
                            if (objP2 == cl5Var) {
                                objP2 = m9.v;
                                fetVar.o0(objP2);
                            }
                            function3 = (Function1) objP2;
                        }
                        if (i7 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i11 != 0) {
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = m9.w;
                                fetVar.o0(objP);
                            }
                            Function1 function115 = function3;
                            function6 = (Function1) objP;
                            function7 = function115;
                        } else {
                            function7 = function3;
                            function6 = function4;
                        }
                        oms0 oms0VarZ18 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        int i11119 = i4 & 8176;
                        int i111110 = i4 >> 3;
                        mm40 mm40Var112 = mm40Var4;
                        e(oms0VarZ18, mm40Var112, function7, u12Var4, function6, ydrVar2, fetVar, i11119 | (57344 & i111110) | (i111110 & 458752), 0);
                        mm40Var3 = mm40Var112;
                        function5 = function7;
                        u12Var3 = u12Var4;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        function5 = function3;
                        u12Var3 = u12Var2;
                        function6 = function4;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                    }
                }
                i4 |= 24576;
                str2 = str;
                i11 = i3 & 32;
                if (i11 != 0) {
                    if ((196608 & i2) == 0) {
                        function4 = function2;
                        if (fetVar.i(function4)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((1572864 & i2) == 0) {
                        ydrVar2 = ydrVar;
                        if (fetVar.i(ydrVar2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    } else {
                        ydrVar2 = ydrVar;
                    }
                    if ((599187 & i4) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i4 & 1, z)) {
                        if (i14 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        cl5Var = ukd.f35823a;
                        if (i5 != 0) {
                            objP2 = fetVar.P();
                            if (objP2 == cl5Var) {
                                objP2 = m9.v;
                                fetVar.o0(objP2);
                            }
                            function3 = (Function1) objP2;
                        }
                        if (i7 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i11 != 0) {
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = m9.w;
                                fetVar.o0(objP);
                            }
                            Function1 function116 = function3;
                            function6 = (Function1) objP;
                            function7 = function116;
                        } else {
                            function7 = function3;
                            function6 = function4;
                        }
                        oms0 oms0VarZ19 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        int i111111 = i4 & 8176;
                        int i111112 = i4 >> 3;
                        mm40 mm40Var113 = mm40Var4;
                        e(oms0VarZ19, mm40Var113, function7, u12Var4, function6, ydrVar2, fetVar, i111111 | (57344 & i111112) | (i111112 & 458752), 0);
                        mm40Var3 = mm40Var113;
                        function5 = function7;
                        u12Var3 = u12Var4;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        function5 = function3;
                        u12Var3 = u12Var2;
                        function6 = function4;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                    }
                }
                i4 |= 196608;
                function4 = function2;
                if ((1572864 & i2) == 0) {
                    ydrVar2 = ydrVar;
                    if (fetVar.i(ydrVar2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                } else {
                    ydrVar2 = ydrVar;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i14 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    cl5Var = ukd.f35823a;
                    if (i5 != 0) {
                        objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = m9.v;
                            fetVar.o0(objP2);
                        }
                        function3 = (Function1) objP2;
                    }
                    if (i7 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i11 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = m9.w;
                            fetVar.o0(objP);
                        }
                        Function1 function117 = function3;
                        function6 = (Function1) objP;
                        function7 = function117;
                    } else {
                        function7 = function3;
                        function6 = function4;
                    }
                    oms0 oms0VarZ110 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    int i111113 = i4 & 8176;
                    int i111114 = i4 >> 3;
                    mm40 mm40Var114 = mm40Var4;
                    e(oms0VarZ110, mm40Var114, function7, u12Var4, function6, ydrVar2, fetVar, i111113 | (57344 & i111114) | (i111114 & 458752), 0);
                    mm40Var3 = mm40Var114;
                    function5 = function7;
                    u12Var3 = u12Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    function5 = function3;
                    u12Var3 = u12Var2;
                    function6 = function4;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                }
            }
            i4 |= 3072;
            u12Var2 = u12Var;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    str2 = str;
                    if (fetVar.g(str2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    if ((196608 & i2) == 0) {
                        function4 = function2;
                        if (fetVar.i(function4)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((1572864 & i2) == 0) {
                        ydrVar2 = ydrVar;
                        if (fetVar.i(ydrVar2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    } else {
                        ydrVar2 = ydrVar;
                    }
                    if ((599187 & i4) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i4 & 1, z)) {
                        if (i14 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        cl5Var = ukd.f35823a;
                        if (i5 != 0) {
                            objP2 = fetVar.P();
                            if (objP2 == cl5Var) {
                                objP2 = m9.v;
                                fetVar.o0(objP2);
                            }
                            function3 = (Function1) objP2;
                        }
                        if (i7 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i11 != 0) {
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = m9.w;
                                fetVar.o0(objP);
                            }
                            Function1 function118 = function3;
                            function6 = (Function1) objP;
                            function7 = function118;
                        } else {
                            function7 = function3;
                            function6 = function4;
                        }
                        oms0 oms0VarZ111 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        int i111115 = i4 & 8176;
                        int i111116 = i4 >> 3;
                        mm40 mm40Var115 = mm40Var4;
                        e(oms0VarZ111, mm40Var115, function7, u12Var4, function6, ydrVar2, fetVar, i111115 | (57344 & i111116) | (i111116 & 458752), 0);
                        mm40Var3 = mm40Var115;
                        function5 = function7;
                        u12Var3 = u12Var4;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        function5 = function3;
                        u12Var3 = u12Var2;
                        function6 = function4;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                    }
                }
                i4 |= 196608;
                function4 = function2;
                if ((1572864 & i2) == 0) {
                    ydrVar2 = ydrVar;
                    if (fetVar.i(ydrVar2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                } else {
                    ydrVar2 = ydrVar;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i14 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    cl5Var = ukd.f35823a;
                    if (i5 != 0) {
                        objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = m9.v;
                            fetVar.o0(objP2);
                        }
                        function3 = (Function1) objP2;
                    }
                    if (i7 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i11 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = m9.w;
                            fetVar.o0(objP);
                        }
                        Function1 function119 = function3;
                        function6 = (Function1) objP;
                        function7 = function119;
                    } else {
                        function7 = function3;
                        function6 = function4;
                    }
                    oms0 oms0VarZ112 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    int i111117 = i4 & 8176;
                    int i111118 = i4 >> 3;
                    mm40 mm40Var116 = mm40Var4;
                    e(oms0VarZ112, mm40Var116, function7, u12Var4, function6, ydrVar2, fetVar, i111117 | (57344 & i111118) | (i111118 & 458752), 0);
                    mm40Var3 = mm40Var116;
                    function5 = function7;
                    u12Var3 = u12Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    function5 = function3;
                    u12Var3 = u12Var2;
                    function6 = function4;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                }
            }
            i4 |= 24576;
            str2 = str;
            i11 = i3 & 32;
            if (i11 != 0) {
                if ((196608 & i2) == 0) {
                    function4 = function2;
                    if (fetVar.i(function4)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((1572864 & i2) == 0) {
                    ydrVar2 = ydrVar;
                    if (fetVar.i(ydrVar2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                } else {
                    ydrVar2 = ydrVar;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i14 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    cl5Var = ukd.f35823a;
                    if (i5 != 0) {
                        objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = m9.v;
                            fetVar.o0(objP2);
                        }
                        function3 = (Function1) objP2;
                    }
                    if (i7 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i11 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = m9.w;
                            fetVar.o0(objP);
                        }
                        Function1 function1110 = function3;
                        function6 = (Function1) objP;
                        function7 = function1110;
                    } else {
                        function7 = function3;
                        function6 = function4;
                    }
                    oms0 oms0VarZ113 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    int i111119 = i4 & 8176;
                    int i1111110 = i4 >> 3;
                    mm40 mm40Var117 = mm40Var4;
                    e(oms0VarZ113, mm40Var117, function7, u12Var4, function6, ydrVar2, fetVar, i111119 | (57344 & i1111110) | (i1111110 & 458752), 0);
                    mm40Var3 = mm40Var117;
                    function5 = function7;
                    u12Var3 = u12Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    function5 = function3;
                    u12Var3 = u12Var2;
                    function6 = function4;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                }
            }
            i4 |= 196608;
            function4 = function2;
            if ((1572864 & i2) == 0) {
                ydrVar2 = ydrVar;
                if (fetVar.i(ydrVar2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i4 |= i13;
            } else {
                ydrVar2 = ydrVar;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i14 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                cl5Var = ukd.f35823a;
                if (i5 != 0) {
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = m9.v;
                        fetVar.o0(objP2);
                    }
                    function3 = (Function1) objP2;
                }
                if (i7 != 0) {
                    u12Var4 = gqw0.f11754a;
                } else {
                    u12Var4 = u12Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedContent";
                }
                if (i11 != 0) {
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = m9.w;
                        fetVar.o0(objP);
                    }
                    Function1 function1111 = function3;
                    function6 = (Function1) objP;
                    function7 = function1111;
                } else {
                    function7 = function3;
                    function6 = function4;
                }
                oms0 oms0VarZ114 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                int i1111111 = i4 & 8176;
                int i1111112 = i4 >> 3;
                mm40 mm40Var118 = mm40Var4;
                e(oms0VarZ114, mm40Var118, function7, u12Var4, function6, ydrVar2, fetVar, i1111111 | (57344 & i1111112) | (i1111112 & 458752), 0);
                mm40Var3 = mm40Var118;
                function5 = function7;
                u12Var3 = u12Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                function5 = function3;
                u12Var3 = u12Var2;
                function6 = function4;
            }
            str3 = str2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
            }
        }
        i4 |= 384;
        function3 = function1;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                u12Var2 = u12Var;
                if (fetVar.g(u12Var2)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    str2 = str;
                    if (fetVar.g(str2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    if ((196608 & i2) == 0) {
                        function4 = function2;
                        if (fetVar.i(function4)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((1572864 & i2) == 0) {
                        ydrVar2 = ydrVar;
                        if (fetVar.i(ydrVar2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i4 |= i13;
                    } else {
                        ydrVar2 = ydrVar;
                    }
                    if ((599187 & i4) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i4 & 1, z)) {
                        if (i14 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        cl5Var = ukd.f35823a;
                        if (i5 != 0) {
                            objP2 = fetVar.P();
                            if (objP2 == cl5Var) {
                                objP2 = m9.v;
                                fetVar.o0(objP2);
                            }
                            function3 = (Function1) objP2;
                        }
                        if (i7 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i11 != 0) {
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = m9.w;
                                fetVar.o0(objP);
                            }
                            Function1 function1112 = function3;
                            function6 = (Function1) objP;
                            function7 = function1112;
                        } else {
                            function7 = function3;
                            function6 = function4;
                        }
                        oms0 oms0VarZ115 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        int i1111113 = i4 & 8176;
                        int i1111114 = i4 >> 3;
                        mm40 mm40Var119 = mm40Var4;
                        e(oms0VarZ115, mm40Var119, function7, u12Var4, function6, ydrVar2, fetVar, i1111113 | (57344 & i1111114) | (i1111114 & 458752), 0);
                        mm40Var3 = mm40Var119;
                        function5 = function7;
                        u12Var3 = u12Var4;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        function5 = function3;
                        u12Var3 = u12Var2;
                        function6 = function4;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                    }
                }
                i4 |= 196608;
                function4 = function2;
                if ((1572864 & i2) == 0) {
                    ydrVar2 = ydrVar;
                    if (fetVar.i(ydrVar2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                } else {
                    ydrVar2 = ydrVar;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i14 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    cl5Var = ukd.f35823a;
                    if (i5 != 0) {
                        objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = m9.v;
                            fetVar.o0(objP2);
                        }
                        function3 = (Function1) objP2;
                    }
                    if (i7 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i11 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = m9.w;
                            fetVar.o0(objP);
                        }
                        Function1 function1113 = function3;
                        function6 = (Function1) objP;
                        function7 = function1113;
                    } else {
                        function7 = function3;
                        function6 = function4;
                    }
                    oms0 oms0VarZ116 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    int i1111115 = i4 & 8176;
                    int i1111116 = i4 >> 3;
                    mm40 mm40Var1110 = mm40Var4;
                    e(oms0VarZ116, mm40Var1110, function7, u12Var4, function6, ydrVar2, fetVar, i1111115 | (57344 & i1111116) | (i1111116 & 458752), 0);
                    mm40Var3 = mm40Var1110;
                    function5 = function7;
                    u12Var3 = u12Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    function5 = function3;
                    u12Var3 = u12Var2;
                    function6 = function4;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                }
            }
            i4 |= 24576;
            str2 = str;
            i11 = i3 & 32;
            if (i11 != 0) {
                if ((196608 & i2) == 0) {
                    function4 = function2;
                    if (fetVar.i(function4)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((1572864 & i2) == 0) {
                    ydrVar2 = ydrVar;
                    if (fetVar.i(ydrVar2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                } else {
                    ydrVar2 = ydrVar;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i14 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    cl5Var = ukd.f35823a;
                    if (i5 != 0) {
                        objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = m9.v;
                            fetVar.o0(objP2);
                        }
                        function3 = (Function1) objP2;
                    }
                    if (i7 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i11 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = m9.w;
                            fetVar.o0(objP);
                        }
                        Function1 function1114 = function3;
                        function6 = (Function1) objP;
                        function7 = function1114;
                    } else {
                        function7 = function3;
                        function6 = function4;
                    }
                    oms0 oms0VarZ117 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    int i1111117 = i4 & 8176;
                    int i1111118 = i4 >> 3;
                    mm40 mm40Var1111 = mm40Var4;
                    e(oms0VarZ117, mm40Var1111, function7, u12Var4, function6, ydrVar2, fetVar, i1111117 | (57344 & i1111118) | (i1111118 & 458752), 0);
                    mm40Var3 = mm40Var1111;
                    function5 = function7;
                    u12Var3 = u12Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    function5 = function3;
                    u12Var3 = u12Var2;
                    function6 = function4;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                }
            }
            i4 |= 196608;
            function4 = function2;
            if ((1572864 & i2) == 0) {
                ydrVar2 = ydrVar;
                if (fetVar.i(ydrVar2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i4 |= i13;
            } else {
                ydrVar2 = ydrVar;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i14 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                cl5Var = ukd.f35823a;
                if (i5 != 0) {
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = m9.v;
                        fetVar.o0(objP2);
                    }
                    function3 = (Function1) objP2;
                }
                if (i7 != 0) {
                    u12Var4 = gqw0.f11754a;
                } else {
                    u12Var4 = u12Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedContent";
                }
                if (i11 != 0) {
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = m9.w;
                        fetVar.o0(objP);
                    }
                    Function1 function1115 = function3;
                    function6 = (Function1) objP;
                    function7 = function1115;
                } else {
                    function7 = function3;
                    function6 = function4;
                }
                oms0 oms0VarZ118 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                int i1111119 = i4 & 8176;
                int i11111110 = i4 >> 3;
                mm40 mm40Var1112 = mm40Var4;
                e(oms0VarZ118, mm40Var1112, function7, u12Var4, function6, ydrVar2, fetVar, i1111119 | (57344 & i11111110) | (i11111110 & 458752), 0);
                mm40Var3 = mm40Var1112;
                function5 = function7;
                u12Var3 = u12Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                function5 = function3;
                u12Var3 = u12Var2;
                function6 = function4;
            }
            str3 = str2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
            }
        }
        i4 |= 3072;
        u12Var2 = u12Var;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                str2 = str;
                if (fetVar.g(str2)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            }
            i11 = i3 & 32;
            if (i11 != 0) {
                if ((196608 & i2) == 0) {
                    function4 = function2;
                    if (fetVar.i(function4)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((1572864 & i2) == 0) {
                    ydrVar2 = ydrVar;
                    if (fetVar.i(ydrVar2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                } else {
                    ydrVar2 = ydrVar;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i14 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    cl5Var = ukd.f35823a;
                    if (i5 != 0) {
                        objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = m9.v;
                            fetVar.o0(objP2);
                        }
                        function3 = (Function1) objP2;
                    }
                    if (i7 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i11 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = m9.w;
                            fetVar.o0(objP);
                        }
                        Function1 function1116 = function3;
                        function6 = (Function1) objP;
                        function7 = function1116;
                    } else {
                        function7 = function3;
                        function6 = function4;
                    }
                    oms0 oms0VarZ119 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    int i11111111 = i4 & 8176;
                    int i11111112 = i4 >> 3;
                    mm40 mm40Var1113 = mm40Var4;
                    e(oms0VarZ119, mm40Var1113, function7, u12Var4, function6, ydrVar2, fetVar, i11111111 | (57344 & i11111112) | (i11111112 & 458752), 0);
                    mm40Var3 = mm40Var1113;
                    function5 = function7;
                    u12Var3 = u12Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    function5 = function3;
                    u12Var3 = u12Var2;
                    function6 = function4;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
                }
            }
            i4 |= 196608;
            function4 = function2;
            if ((1572864 & i2) == 0) {
                ydrVar2 = ydrVar;
                if (fetVar.i(ydrVar2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i4 |= i13;
            } else {
                ydrVar2 = ydrVar;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i14 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                cl5Var = ukd.f35823a;
                if (i5 != 0) {
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = m9.v;
                        fetVar.o0(objP2);
                    }
                    function3 = (Function1) objP2;
                }
                if (i7 != 0) {
                    u12Var4 = gqw0.f11754a;
                } else {
                    u12Var4 = u12Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedContent";
                }
                if (i11 != 0) {
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = m9.w;
                        fetVar.o0(objP);
                    }
                    Function1 function1117 = function3;
                    function6 = (Function1) objP;
                    function7 = function1117;
                } else {
                    function7 = function3;
                    function6 = function4;
                }
                oms0 oms0VarZ1110 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                int i11111113 = i4 & 8176;
                int i11111114 = i4 >> 3;
                mm40 mm40Var1114 = mm40Var4;
                e(oms0VarZ1110, mm40Var1114, function7, u12Var4, function6, ydrVar2, fetVar, i11111113 | (57344 & i11111114) | (i11111114 & 458752), 0);
                mm40Var3 = mm40Var1114;
                function5 = function7;
                u12Var3 = u12Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                function5 = function3;
                u12Var3 = u12Var2;
                function6 = function4;
            }
            str3 = str2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
            }
        }
        i4 |= 24576;
        str2 = str;
        i11 = i3 & 32;
        if (i11 != 0) {
            if ((196608 & i2) == 0) {
                function4 = function2;
                if (fetVar.i(function4)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            if ((1572864 & i2) == 0) {
                ydrVar2 = ydrVar;
                if (fetVar.i(ydrVar2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i4 |= i13;
            } else {
                ydrVar2 = ydrVar;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i14 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                cl5Var = ukd.f35823a;
                if (i5 != 0) {
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = m9.v;
                        fetVar.o0(objP2);
                    }
                    function3 = (Function1) objP2;
                }
                if (i7 != 0) {
                    u12Var4 = gqw0.f11754a;
                } else {
                    u12Var4 = u12Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedContent";
                }
                if (i11 != 0) {
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = m9.w;
                        fetVar.o0(objP);
                    }
                    Function1 function1118 = function3;
                    function6 = (Function1) objP;
                    function7 = function1118;
                } else {
                    function7 = function3;
                    function6 = function4;
                }
                oms0 oms0VarZ1111 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                int i11111115 = i4 & 8176;
                int i11111116 = i4 >> 3;
                mm40 mm40Var1115 = mm40Var4;
                e(oms0VarZ1111, mm40Var1115, function7, u12Var4, function6, ydrVar2, fetVar, i11111115 | (57344 & i11111116) | (i11111116 & 458752), 0);
                mm40Var3 = mm40Var1115;
                function5 = function7;
                u12Var3 = u12Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                function5 = function3;
                u12Var3 = u12Var2;
                function6 = function4;
            }
            str3 = str2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
            }
        }
        i4 |= 196608;
        function4 = function2;
        if ((1572864 & i2) == 0) {
            ydrVar2 = ydrVar;
            if (fetVar.i(ydrVar2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i4 |= i13;
        } else {
            ydrVar2 = ydrVar;
        }
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            if (i14 != 0) {
                mm40Var4 = jm40.b;
            } else {
                mm40Var4 = mm40Var2;
            }
            cl5Var = ukd.f35823a;
            if (i5 != 0) {
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = m9.v;
                    fetVar.o0(objP2);
                }
                function3 = (Function1) objP2;
            }
            if (i7 != 0) {
                u12Var4 = gqw0.f11754a;
            } else {
                u12Var4 = u12Var2;
            }
            if (i9 != 0) {
                str2 = "AnimatedContent";
            }
            if (i11 != 0) {
                objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = m9.w;
                    fetVar.o0(objP);
                }
                Function1 function1119 = function3;
                function6 = (Function1) objP;
                function7 = function1119;
            } else {
                function7 = function3;
                function6 = function4;
            }
            oms0 oms0VarZ1112 = phu0.Z(obj, str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
            int i11111117 = i4 & 8176;
            int i11111118 = i4 >> 3;
            mm40 mm40Var1116 = mm40Var4;
            e(oms0VarZ1112, mm40Var1116, function7, u12Var4, function6, ydrVar2, fetVar, i11111117 | (57344 & i11111118) | (i11111118 & 458752), 0);
            mm40Var3 = mm40Var1116;
            function5 = function7;
            u12Var3 = u12Var4;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
            function5 = function3;
            u12Var3 = u12Var2;
            function6 = function4;
        }
        str3 = str2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p43(obj, mm40Var3, function5, u12Var3, str3, function6, ydrVar, i2, i3);
        }
    }

    public static String f0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static final void g(oms0 oms0Var, mm40 mm40Var, Function1 function1, u12 u12Var, Function1 function2, Function1 function3, ydr ydrVar, fet fetVar, int i2) {
        fet fetVar2;
        hgk0 hgk0Var;
        vls0 vls0Var;
        Object obj;
        hz40 hz40Var;
        vls0 vls0Var2;
        SnapshotStateList snapshotStateList;
        SnapshotStateList snapshotStateList2;
        vls0 vls0VarD;
        fet fetVar3;
        boolean z;
        int i3;
        int i4;
        fetVar.g0(1935038908);
        int i5 = (i2 & 6) == 0 ? (fetVar.g(oms0Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= fetVar.g(u12Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= fetVar.i(function3) ? 131072 : 65536;
        }
        ydr ydrVar2 = ydrVar;
        if ((1572864 & i2) == 0) {
            i5 |= fetVar.i(ydrVar2) ? 1048576 : 524288;
        }
        if (fetVar.U(i5 & 1, (599187 & i5) != 599186)) {
            int i6 = i5 & 14;
            boolean z2 = i6 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new i53(oms0Var, u12Var);
                fetVar.o0(objP);
            }
            i53 i53Var = (i53) objP;
            boolean z3 = i6 == 4;
            Object objP2 = fetVar.P();
            Object obj2 = objP2;
            if (z3 || objP2 == cl5Var) {
                Object[] objArr = {oms0Var.f25519a.y0()};
                SnapshotStateList snapshotStateList3 = new SnapshotStateList();
                snapshotStateList3.addAll(tx3.g0(objArr));
                fetVar.o0(snapshotStateList3);
                obj2 = snapshotStateList3;
            }
            SnapshotStateList snapshotStateList4 = (SnapshotStateList) obj2;
            pz40 pz40Var = oms0Var.e;
            pz40 pz40Var2 = oms0Var.d;
            int i7 = i5;
            p4 p4Var = oms0Var.f25519a;
            boolean zG = fetVar.g(((hgk0) pz40Var).getValue()) | (i6 == 4);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                long[] jArr = u1h0.f34903a;
                objP3 = new hz40();
                fetVar.o0(objP3);
            }
            hz40 hz40Var2 = (hz40) objP3;
            if (!snapshotStateList4.contains(p4Var.y0())) {
                snapshotStateList4.clear();
                snapshotStateList4.add(p4Var.y0());
            }
            hgk0 hgk0Var2 = (hgk0) pz40Var2;
            if (Intrinsics.d(p4Var.y0(), hgk0Var2.getValue()) && ((hgk0) pz40Var).getValue() == null) {
                if (snapshotStateList4.size() != 1 || !Intrinsics.d(snapshotStateList4.get(0), p4Var.y0())) {
                    snapshotStateList4.clear();
                    snapshotStateList4.add(p4Var.y0());
                }
                if (hz40Var2.e != 1 || hz40Var2.c(p4Var.y0())) {
                    hz40Var2.a();
                }
                i53Var.b = u12Var;
            }
            hgk0 hgk0Var3 = (hgk0) pz40Var;
            Object value = hgk0Var3.getValue();
            if (value == null || value.equals(p4Var.y0())) {
                hgk0Var = hgk0Var2;
            } else {
                ListIterator listIterator = snapshotStateList4.listIterator();
                int i8 = 0;
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        hgk0Var = hgk0Var2;
                        i4 = -1;
                        break;
                    }
                    hgk0Var = hgk0Var2;
                    if (Intrinsics.d(function2.invoke(pawVar.next()), function2.invoke(value))) {
                        i4 = i8;
                        break;
                    } else {
                        i8++;
                        hgk0Var2 = hgk0Var;
                    }
                }
                if (i4 == -1) {
                    snapshotStateList4.add(value);
                } else if (!Intrinsics.d(snapshotStateList4.get(i4), value)) {
                    snapshotStateList4.set(i4, value);
                }
            }
            if (!Intrinsics.d(p4Var.y0(), hgk0Var.getValue())) {
                ListIterator listIterator2 = snapshotStateList4.listIterator();
                int i9 = 0;
                while (true) {
                    paw pawVar2 = (paw) listIterator2;
                    if (!pawVar2.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (Intrinsics.d(function2.invoke(pawVar2.next()), function2.invoke(hgk0Var.getValue()))) {
                            i3 = i9;
                            break;
                        }
                        i9++;
                    }
                }
                if (i3 == -1) {
                    snapshotStateList4.add(hgk0Var.getValue());
                } else if (!Intrinsics.d(snapshotStateList4.get(i3), hgk0Var.getValue()) || i3 != snapshotStateList4.size() - 1) {
                    Intrinsics.d(hgk0Var.getValue(), snapshotStateList4.get(i3));
                    snapshotStateList4.remove(i3);
                    snapshotStateList4.add(hgk0Var.getValue());
                }
            }
            Object value2 = hgk0Var3.getValue();
            boolean zG2 = fetVar.g(value2);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == cl5Var) {
                objP4 = value2 != null ? new ed90(i53Var, hgk0Var.getValue(), value2) : null;
                fetVar.o0(objP4);
            }
            ed90 ed90Var = (ed90) objP4;
            boolean zG3 = fetVar.g(ed90Var) | ((i7 & 458752) == 131072);
            Object objP5 = fetVar.P();
            if (!zG3 && objP5 != cl5Var) {
                obj = objP5;
                vls0Var = null;
            } else if (ed90Var != null && function3.invoke(ed90Var) != null) {
                hny.b();
                return;
            } else {
                vls0Var = null;
                fetVar.o0(null);
                obj = null;
            }
            if (obj != null) {
                hny.b();
                return;
            }
            if (hz40Var2.b(hgk0Var.getValue()) && hz40Var2.b(p4Var.y0()) && (value2 == null || hz40Var2.b(value2))) {
                fetVar.e0(-297322234);
                fetVar.r(false);
                hz40Var = hz40Var2;
                vls0Var2 = vls0Var;
                snapshotStateList = snapshotStateList4;
            } else {
                fetVar.e0(-302069574);
                hz40Var2.a();
                int size = snapshotStateList4.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = size;
                    Object obj3 = snapshotStateList4.get(i10);
                    hz40 hz40Var3 = hz40Var2;
                    hz40Var3.n(obj3, u1c.M(427839334, new x43(obj3, oms0Var, ed90Var, function1, i53Var, snapshotStateList4, ydrVar2), fetVar));
                    i10++;
                    snapshotStateList4 = snapshotStateList4;
                    hz40Var2 = hz40Var3;
                    size = i11;
                    vls0Var = vls0Var;
                    ydrVar2 = ydrVar;
                }
                hz40Var = hz40Var2;
                vls0Var2 = vls0Var;
                snapshotStateList = snapshotStateList4;
                fetVar.r(false);
            }
            boolean zG4 = fetVar.g(oms0Var.f()) | fetVar.g(i53Var) | fetVar.g(hgk0Var3.getValue());
            Object objP6 = fetVar.P();
            if (zG4 || objP6 == cl5Var) {
                objP6 = (lie) function1.invoke(i53Var);
                fetVar.o0(objP6);
            }
            lie lieVar = (lie) objP6;
            oms0 oms0Var2 = i53Var.f14174a;
            boolean zG5 = fetVar.g(i53Var);
            Object objP7 = fetVar.P();
            if (zG5 || objP7 == cl5Var) {
                objP7 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP7);
            }
            pz40 pz40Var3 = (pz40) objP7;
            pz40 pz40VarF = androidx.compose.runtime.e.f(lieVar.d, fetVar);
            if (Intrinsics.d(oms0Var2.f25519a.y0(), ((hgk0) oms0Var2.d).getValue())) {
                pz40Var3.setValue(Boolean.FALSE);
            } else if (pz40VarF.getValue() != null) {
                pz40Var3.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) pz40Var3.getValue()).booleanValue();
            mm40 mm40VarK = jm40.b;
            if (zBooleanValue) {
                fetVar.e0(1353077497);
                snapshotStateList2 = snapshotStateList;
                fet fetVar4 = fetVar;
                vls0VarD = phu0.D(i53Var.f14174a, hp4.q, null, fetVar4, 0, 2);
                boolean zG6 = fetVar4.g(vls0VarD);
                Object objP8 = fetVar4.P();
                if (zG6 || objP8 == cl5Var) {
                    u7k0 u7k0Var = (u7k0) pz40VarF.getValue();
                    if (u7k0Var == null || u7k0Var.f35188a) {
                        mm40VarK = lgb.K(mm40VarK);
                    }
                    mm40 mm40Var2 = mm40VarK;
                    fetVar4.o0(mm40Var2);
                    objP8 = mm40Var2;
                }
                mm40VarK = (mm40) objP8;
                fetVar4.r(false);
                fetVar3 = fetVar4;
            } else {
                fet fetVar5 = fetVar;
                snapshotStateList2 = snapshotStateList;
                fetVar5.e0(1353343539);
                fetVar5.r(false);
                vls0VarD = vls0Var2;
                fetVar3 = fetVar5;
            }
            mm40 mm40VarE = mm40Var.e(mm40VarK.e(new e53(vls0VarD, pz40VarF, i53Var)));
            Object objP9 = fetVar3.P();
            if (objP9 == cl5Var) {
                objP9 = new a53(i53Var);
                fetVar3.o0(objP9);
            }
            a53 a53Var = (a53) objP9;
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, a53Var, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.l(fetVar3, Integer.valueOf(iHashCode));
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            fetVar3.e0(758586195);
            int size2 = snapshotStateList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Object obj4 = snapshotStateList2.get(i12);
                fetVar3.b0(1420119555, function2.invoke(obj4));
                Function2 function4 = (Function2) hz40Var.g(obj4);
                if (function4 == null) {
                    fetVar3.e0(1074069702);
                    z = false;
                } else {
                    z = false;
                    fetVar3.e0(1420120731);
                    function4.invoke(fetVar3, 0);
                }
                fetVar3.r(z);
                fetVar3.r(z);
            }
            fetVar3.r(false);
            fetVar3.r(true);
            fetVar2 = fetVar3;
        } else {
            function1 = function1;
            fet fetVar6 = fetVar;
            fetVar6.X();
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r43(oms0Var, mm40Var, function1, u12Var, function2, function3, ydrVar, i2);
        }
    }

    public static Object g0(j0a j0aVar, sgy sgyVar) {
        j0aVar.getClass();
        sgyVar.getClass();
        if (j0aVar instanceof kft0) {
            return ((kft0) j0aVar).H(sgyVar);
        }
        if (!(j0aVar instanceof n0a)) {
            return null;
        }
        n0a n0aVar = (n0a) j0aVar;
        if (n0aVar.u() == j0aVar) {
            return null;
        }
        n0a n0aVarU = n0aVar.u();
        n0aVarU.getClass();
        return g0(n0aVarU, sgyVar);
    }

    public static final void h(mm40 mm40Var, z77 z77Var, boolean z, Function0 function0, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        z77Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-327321224);
        int i3 = i2 | 6 | (fetVar.g(z77Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            llm llmVar = z77Var.f().h;
            boolean zG = ((i3 & 896) == 256) | fetVar.g(z77Var.f().f38471a) | fetVar.g(z77Var.f().d);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = z ? new plm(z77Var.f().f38471a, secondary, z77Var.f().g) : new rlm(z77Var.f().f38471a, z77Var.f().d, secondary, secondary, z77Var.f().g);
                fetVar.o0(objP);
            } else {
                jm40Var = jm40Var;
            }
            imm immVar = new imm(llmVar, (tlm) objP, z77Var.f().i, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), false, null);
            int i4 = 57344 & i3;
            boolean z2 = i4 == 16384;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new to6(function1, (byte) 9);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z3 = i4 == 16384;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new to6(function1, (byte) 10);
                fetVar.o0(objP3);
            }
            Function0 function3 = (Function0) objP3;
            boolean z4 = (i4 == 16384) | ((i3 & 7168) == 2048);
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new ya4(function1, function0, (byte) 1);
                fetVar.o0(objP4);
            }
            hlm.c(mm40VarD, immVar, null, function2, function3, (Function1) objP4, null, null, null, null, null, null, fetVar, 0, 0, 4036);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0(mm40Var2, (Object) z77Var, z, function0, (wdr) function1, i2, (byte) 2);
        }
    }

    public static final void i(boolean z, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(-198074520);
        int i3 = (fetVar.h(z) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            j(function0, u1c.M(1048894006, new f0(z, function0), fetVar), fetVar, ((i3 >> 3) & 14) | 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a0(z, function0, i2, b2);
        }
    }

    public static final void j(Function0 function0, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        Function0 function1;
        fetVar.g0(-160695491);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.i(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            function1 = function0;
            mm40 mm40VarW = y860.W(jm40.b, null, null, false, null, function1, 28);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            h97.p((i3 & 112) | 6, ugdVar, zhg0.f44392a, fetVar, true);
        } else {
            function1 = function0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x(function1, ugdVar, i2, b2);
        }
    }

    public static final void k(mm40 mm40Var, qdz qdzVar, jf9 jf9Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        qdzVar.getClass();
        jf9Var.getClass();
        function1.getClass();
        fetVar2.g0(1637814675);
        int i3 = i2 | 6 | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.g(jf9Var) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        byte b2 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            xcz xczVarB = qdzVar.b(jf9Var.getKey(), new im8((byte) 10), fetVar2, (i3 << 3) & 896);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(knx.Q(o7k0.e(jm40Var, 40.0f), new k82(xfn.a(fetVar2).c, b2)), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            n0q n0qVar = o7k0.c;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            yx7 yx7Var = gqw0.k;
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).c + 8.0f, 0.0f, 2);
            boolean z = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new op7(jf9Var, function1, (byte) 20);
                fetVar2.o0(objP);
            }
            b8k0.f(n0qVar, xczVarB, lh80VarT, false, qw3Var, yx7Var, null, false, null, (Function1) objP, fetVar, 196614, 456);
            fetVar2 = fetVar;
            dwi0.q(xczVarB, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), ((StaticColors) fetVar2.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), 28.0f, fetVar2, 0);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 0, i2, (Object) mm40Var2, (Object) qdzVar, (Object) jf9Var, (Object) function1);
        }
    }

    public static final void l(ugd ugdVar, ugd ugdVar2, fet fetVar, int i2) {
        fetVar.g0(1774860442);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40.b, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
            y5d y5dVar = y5d.f42040a;
            ugdVar.F(y5dVar, fetVar, 54);
            ugdVar2.F(y5dVar, fetVar, 54);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0(ugdVar, ugdVar2, i2, b2);
        }
    }

    public static final void m(mm40 mm40Var, List list, fet fetVar) {
        list.getClass();
        kr00.a(u1c.M(684984869, new ika((byte) 0, mm40Var, list), fetVar), fetVar, 6);
    }

    public static final void n(fxf fxfVar, Function1 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-839892336);
        int i3 = i2 | (fetVar2.i(fxfVar) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.c, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(o7k0.e(jm40Var, 40.0f), 80.0f, 0.0f, 2);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarU);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            boolean z2 = ((i3 & 14) == 4 || fetVar2.i(fxfVar)) | ((i3 & 112) == 32);
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gj4(function1, fxfVar, (byte) 26);
                fetVar2.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40VarQ, null, null, false, null, (Function0) objP, fetVar, 0, 15);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarF);
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
            int i4 = fxfVar.f10306a;
            dtb dtbVar = fxfVar.c;
            dww.b(jpm0.t(i4, 6, fetVar), null, o7k0.n(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 24.0f), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 48, 0);
            v8q0.a(fxfVar.b, s5x0.N(jm40Var, 8.0f, 0.0f, 12.0f, 0.0f, 10), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24576, 114680);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (dtbVar instanceof cxf) {
                fetVar2.e0(-1272853884);
                thb.f(ffb0.Q(jm40Var, 4.0f, -4.0f), ((cxf) dtbVar).f5120a, fetVar2, 0, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1272640232);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(fxfVar, function1, i2, (byte) 25);
        }
    }

    public static final void o(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        xczVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(458403174);
        int i3 = i2 | (fetVar.g(xczVar) ? 2048 : 1024) | (fetVar.g(qdzVar) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536) | (fetVar.i(function2) ? 1048576 : 524288);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            float f2 = xfn.a(fetVar).c;
            mm40 mm40VarU = vtb.U(o7k0.c, ((Boolean) l7m0Var2.getValue()).booleanValue());
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(12.0f, true, new jf4((byte) 14));
            ch80 ch80VarF = h97.f(f2, 8.0f, f2, 28.0f, fetVar);
            boolean z = ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                tpk tpkVar = new tpk(l7m0Var, qdzVar, function1, function2, (byte) 1);
                fetVar.o0(tpkVar);
                objP = tpkVar;
            }
            b8k0.e(mm40VarU, xczVar, ch80VarF, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i3 >> 6) & 112, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new upk(l7m0Var, l7m0Var2, xczVar, qdzVar, function1, function2, i2, (byte) 1);
        }
    }

    public static final void p(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1782511543);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        byte b2 = 3;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i8v(function1, (byte) 25);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wo6(mdmVar, function1, i2, b2);
        }
    }

    public static final void q(d5k0 d5k0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1116884509);
        int i3 = (fetVar.g(d5k0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mdm mdmVar = d5k0Var.b;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nrj0(function1, (byte) 21);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(d5k0Var, function1, i2, b2);
        }
    }

    public static final void r(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        xczVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-781151319);
        int i3 = i2 | 6 | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.g(qdzVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var, null, knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 28.0f, 7), fetVar), false, null, u1c.M(1227602535, new u8o(function1, qdzVar, function2, b2), fetVar), fetVar, ((i3 >> 3) & 112) | 100663680, 216);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var2, l7m0Var, xczVar, qdzVar, function1, function2, i2);
        }
    }

    public static final void s(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1274127905);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            vow vowVar = (vow) l7m0Var.getValue();
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            int i4 = (i3 >> 3) & 112;
            x(function1, fetVar, i4 | 6);
            if (vowVar != null) {
                boolean z = vowVar instanceof row;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar.e0(720956612);
                    xbc.z(((row) vowVar).f30860a, fetVar, 6);
                    fetVar.r(false);
                } else if (vowVar instanceof sow) {
                    fetVar.e0(1270189619);
                    p(((sow) vowVar).f32563a, function1, fetVar, i4);
                    fetVar.r(false);
                } else if (vowVar instanceof tow) {
                    fetVar.e0(1270193280);
                    p(((tow) vowVar).f34304a, function1, fetVar, i4);
                    fetVar.r(false);
                } else if (vowVar instanceof uow) {
                    fetVar.e0(721415567);
                    m2x.h(6, fetVar, o7k0.d(jm40Var, 1.0f));
                    fetVar.r(false);
                }
                fetVar.r(true);
                mm40Var2 = jm40Var;
            }
            throw b1j.f(1270180915, fetVar, false);
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var, function1, i2, (byte) 19);
        }
    }

    public static final void t(int i2, int i3, fet fetVar, String str) {
        fetVar.g0(85083241);
        int i4 = (fetVar.e(i2) ? 4 : 2) | i3 | (fetVar.g(str) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            u(i2, u1c.M(1417228404, new h0(str, b2), fetVar), fetVar, (i4 & 14) | 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v(i2, i3, str);
        }
    }

    public static final void u(int i2, ugd ugdVar, fet fetVar, int i3) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1872902793);
        int i4 = i3 | (fetVar2.e(i2) ? 4 : 2);
        if (fetVar2.U(i4 & 1, (i4 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarD, background, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f, 12.0f);
            thg0 thg0VarA = shg0.a(new qw3(10.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            zhg0 zhg0Var = zhg0.f44392a;
            v8q0.a(xsm0.s(i2, fetVar2), zhg0Var.a(1.0f, jm40Var, true), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            h97.p(54, ugdVar, zhg0Var, fetVar2, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b0(i2, ugdVar, i3);
        }
    }

    public static final void v(int i2, fet fetVar) {
        fetVar.g0(-366287742);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 12.0f, 0.0f, 0.0f, 13);
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
            mm40 mm40VarD2 = o7k0.d(s5x0.L(jm40Var, xfn.a(fetVar).f, 0.0f, 2), 1.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(o7k0.e(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD2), 32.0f), vbc.d0(null, fetVar, 0, 1)));
            xvw.d(7, 48, fetVar, s5x0.N(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 0.0f, 8));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ogj0(i2, (byte) 28);
        }
    }

    public static final void w(mm40 mm40Var, vo30 vo30Var, Function1 function1, fet fetVar, int i2) {
        boolean z;
        mm40 mm40Var2 = mm40Var;
        Object obj = vo30Var;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(-361778252);
        int i3 = i2 | (fetVar2.g(mm40Var2) ? 4 : 2) | (fetVar2.g(obj) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (!fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar2.X();
        } else if (obj instanceof to30) {
            fetVar2.e0(-1662652797);
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 110.0f);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new mbz(obj, function1, (byte) 24);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarE, gy40Var, null, false, null, (Function0) objP2, 28);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            boolean z4 = fetVar2.k(bmd.n) == k6z.b;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = Float.valueOf(z4 ? -1.0f : 1.0f);
                fetVar2.o0(objP3);
            }
            float fFloatValue = ((Number) objP3).floatValue();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarX = r8x.X(jm40Var, fFloatValue, 1.0f);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE2 = mm40VarX.e(n0qVar);
            zcl zclVar2 = qmk.l;
            ugg0 ugg0Var = vgg0.f37379a;
            to30 to30Var = (to30) obj;
            k7x.a(to30Var.c.a(), "", h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE2), gqw0.A, null, fetVar, 1572912, 1976);
            zx7 zx7Var2 = gqw0.g;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarJ = s5x0.J(jr8Var.b(jm40Var, zx7Var2), 16.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            String str = to30Var.f34264a;
            long j2 = qmk.w;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            y9q0 y9q0VarP = g1t0.p();
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, jm40Var, staticColors.m123getWhite0d7_KjU(), null, j2, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarP, fetVar, 48, 24960, 110568);
            String str2 = to30Var.b;
            long j3 = qmk.r;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, jm40Var, staticColors.m123getWhite0d7_KjU(), null, j3, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 48, 24960, 110568);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (to30Var.d) {
                fetVar2.e0(-249310332);
                zfn zfnVar2 = zaq0.b;
                mm40 mm40VarQ = i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zfnVar2)).getBackgroundLight60(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar);
                jpm0.o(fetVar2, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar4);
                j0x.b(a8k0.F(R.drawable.ic_glyph_technical_works, 0, fetVar2), null, jr8Var.b(s5x0.J(i120.Q(o7k0.n(jm40Var, 40.0f), ((ThemeColors) fetVar2.k(zfnVar2)).getBackgroundContent(), vgg0.f37379a), 8.0f), gqw0.e), null, null, 0.0f, new m78(((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), 5), fetVar2, 56, 56);
                fetVar2.r(true);
                z = false;
                fetVar2.r(false);
            } else {
                z = false;
                fetVar2.e0(-248226324);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(z);
            mm40Var2 = mm40Var;
            obj = vo30Var;
        } else {
            obj = vo30Var;
            if (!obj.equals(uo30.f35993a)) {
                throw b1j.f(223459207, fetVar2, false);
            }
            fetVar2.e0(-1659426193);
            mm40Var2 = mm40Var;
            mm40 mm40VarD2 = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarE3 = o7k0.e(mm40VarD2, 110.0f);
            zcl zclVar4 = qmk.l;
            ugg0 ugg0Var2 = vgg0.f37379a;
            dw9.x(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarE3), vbc.d0(null, fetVar2, 0, 1), fetVar2, 0, false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var2, obj, function1, i2, (byte) 17);
        }
    }

    public static final void x(Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(2146543574);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 = i2 | (fetVar.g(jm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            androidx.compose.runtime.d dVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
            imm immVar = new imm(new ilm(secondary), new plm(rsm0.w(R.string.horse_races_result, 0, fetVar), ha50.TWO_LINES, secondary, fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(dVar)).getBackgroundContent(), true, null);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i8v(function1, (byte) 24);
                fetVar.o0(objP);
            }
            hlm.c(jm40Var, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, i3 & 14, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wt9(function1, i2);
        }
    }

    public static final void y(final mm40 mm40Var, final String str, final Map map, final long j2, final boolean z, final Function1 function1, final Function0 function0, final Function0 function2, final Function0 function3, final Function0 function4, final Function1 function5, fet fetVar, final int i2) {
        int i3;
        Object obj;
        Function1 function6;
        str.getClass();
        map.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        fetVar.g0(469943976);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            obj = str;
            i3 |= fetVar.g(obj) ? 32 : 16;
        } else {
            obj = str;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar.g(map) : fetVar.i(map) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.f(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function6 = function1;
            i3 |= fetVar.i(function6) ? 131072 : 65536;
        } else {
            function6 = function1;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= fetVar.i(function2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= fetVar.i(function3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= fetVar.i(function4) ? 536870912 : 268435456;
        }
        char c2 = fetVar.i(function5) ? (char) 4 : (char) 2;
        if (fetVar.U(i3 & 1, ((i3 & 306783379) == 306783378 && (c2 & 3) == 2) ? false : true)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            mm40 mm40VarN = epv0.N(o2e.e0(mm40Var.e(o7k0.c), "RULES_WEB_VIEW"), z ? 1.0f : 0.0f);
            boolean z2 = ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864) | ((1879048192 & i3) == 536870912) | ((c2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new bg0(function6, function0, function2, function3, function4, function5);
                fetVar.o0(objP2);
            }
            Function1 function7 = (Function1) objP2;
            boolean z3 = ((i3 & 112) == 32) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && fetVar.i(map))) | ((i3 & 7168) == 2048);
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new as0(obj, (Object) map, j2, (Object) pz40Var, (byte) 8);
                fetVar.o0(objP3);
            }
            dwi0.b(function7, mm40VarN, (Function1) objP3, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.u790
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = x8x.L(i2 | 1);
                    ay3.y(mm40Var, str, map, j2, z, function1, function0, function2, function3, function4, function5, (fet) obj2, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void z(String str, fet fetVar, int i2) {
        byte b2;
        String str2 = str;
        fet fetVar2 = fetVar;
        fetVar2.g0(1772620232);
        int i3 = i2 | (fetVar2.g(str2) ? 4 : 2);
        if (!fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            b2 = 0;
            fetVar2.X();
        } else if (str2.length() > 0) {
            fetVar2.e0(1506517435);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40.b);
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
            String strS = xsm0.s(R.string.tournaments_prize_fund, fetVar2);
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
            zfn zfnVar = zaq0.b;
            v8q0.a(strS, null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 131066);
            str2 = str;
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.x, null, j1t0.f15753a, 0L, null, 0, 1, qmk.K, 16580573), fetVar, i3 & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            b2 = 0;
            fetVar2.r(false);
        } else {
            b2 = 0;
            fetVar2.e0(1507254522);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0(b2, i2, str2);
        }
    }
}
