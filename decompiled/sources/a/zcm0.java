package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zcm0 {
    public static final void a(zdm0 zdm0Var, boolean z, fet fetVar, int i) {
        int i2;
        zdm0Var.getClass();
        fetVar.g0(-138108263);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(zdm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = zdm0Var.a().ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(421951860);
                ucx.z(null, zdm0Var, z, fetVar, (i2 << 3) & 1008);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(421962613);
                hfm0.h(null, zdm0Var, z, fetVar, (i2 << 3) & 1008);
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(421949382, fetVar, false);
                }
                fetVar.e0(421957206);
                yyw.j(null, zdm0Var, z, fetVar, (i2 << 3) & 1008);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ooh(zdm0Var, z, i, (byte) 7);
        }
    }

    public static final void b(tlp0 tlp0Var, fet fetVar, int i) {
        int i2;
        tlp0Var.getClass();
        ylp0 ylp0Var = tlp0Var.b;
        ylp0 ylp0Var2 = tlp0Var.f34158a;
        fetVar.g0(843814619);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(tlp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            boolean z = fetVar.k(bmd.n) == k6z.f17794a;
            if (z) {
                ylp0Var = ylp0Var2;
            }
            ylp0 ylp0Var3 = z ? ylp0Var : ylp0Var2;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            xcm0.c(ylp0Var, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), true, fetVar, 384, 0);
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, o7k0.s(jm40Var, 8.0f));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            xcm0.c(ylp0Var3, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), true, fetVar, 384, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(tlp0Var, i, (byte) 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0176  */
    /* JADX WARN: Code duplicated, block: B:62:0x0182  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void c(String str, zx7 zx7Var, boolean z, xdr xdrVar, fet fetVar, int i, int i2) {
        String str2;
        int i3;
        xdr xdrVar2;
        boolean z2;
        fet fetVar2;
        xdr xdrVar3;
        yfe0 yfe0VarU;
        xdr xdrVar4;
        jr8 jr8Var;
        float f;
        str.getClass();
        fetVar.g0(-385894554);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (fetVar.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(zx7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                xdrVar2 = xdrVar;
                i3 |= fetVar.i(xdrVar2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i3 & 1, z2)) {
                if (i4 != 0) {
                    xdrVar4 = null;
                } else {
                    xdrVar4 = xdrVar2;
                }
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(mm40VarD, 28.0f);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                jpm0.o(fetVar, tj30VarC, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                jr8Var = jr8.f16991a;
                if (xdrVar4 == null) {
                    fetVar.e0(604294153);
                } else {
                    fetVar.e0(296588024);
                    xdrVar4.F(jr8Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                }
                fetVar.r(false);
                if (z) {
                    f = 0.0f;
                } else {
                    f = 6.0f;
                }
                xdrVar3 = xdrVar4;
                v8q0.a(str2, jr8Var.b(o7k0.y(s5x0.N(jm40Var, f, 0.0f, 6.0f, 0.0f, 10), null, 3), zx7Var), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar), fetVar, i3 & 14, 24960, 109564);
                fetVar2 = fetVar;
                fetVar2.r(true);
            } else {
                fetVar2 = fetVar;
                fetVar2.X();
                xdrVar3 = xdrVar2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new kr8(str, zx7Var, z, xdrVar3, i, i2, (byte) 3);
            }
        }
        i3 |= 3072;
        xdrVar2 = xdrVar;
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar.U(i3 & 1, z2)) {
            if (i4 != 0) {
                xdrVar4 = null;
            } else {
                xdrVar4 = xdrVar2;
            }
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarE2 = o7k0.e(mm40VarD2, 28.0f);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
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
            jr8Var = jr8.f16991a;
            if (xdrVar4 == null) {
                fetVar.e0(604294153);
            } else {
                fetVar.e0(296588024);
                xdrVar4.F(jr8Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
            }
            fetVar.r(false);
            if (z) {
                f = 0.0f;
            } else {
                f = 6.0f;
            }
            xdrVar3 = xdrVar4;
            v8q0.a(str2, jr8Var.b(o7k0.y(s5x0.N(jm40Var2, f, 0.0f, 6.0f, 0.0f, 10), null, 3), zx7Var), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar), fetVar, i3 & 14, 24960, 109564);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            xdrVar3 = xdrVar2;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr8(str, zx7Var, z, xdrVar3, i, i2, (byte) 3);
        }
    }

    public static final void d(final mm40 mm40Var, final nyq0 nyq0Var, final long j, final vhv0 vhv0Var, final Function0 function0, final ugd ugdVar, final ugd ugdVar2, final ugd ugdVar3, final ugd ugdVar4, final ugd ugdVar5, fet fetVar, final int i) {
        nyq0Var.getClass();
        function0.getClass();
        fetVar.g0(1120077934);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(nyq0Var) ? 32 : 16) | (fetVar.f(j) ? 256 : 128) | (fetVar.g(vhv0Var) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (306783379 & i2) != 306783378)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            int i3 = (i2 & 7168) ^ 3072;
            boolean z = (i3 > 2048 && fetVar.g(vhv0Var)) || (i2 & 3072) == 2048;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new a050(vhv0Var);
                fetVar.o0(objP);
            }
            a050 a050Var = (a050) objP;
            boolean zG = fetVar.g(a050Var) | ((i3 > 2048 && fetVar.g(vhv0Var)) || (i2 & 3072) == 2048);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new b8q0((Object) a050Var, (Object) vhv0Var, (byte) 21);
                fetVar.o0(objP2);
            }
            mm40 mm40VarA0 = j120.a0(mm40Var, (Function1) objP2);
            StaticColors staticColors = StaticColors.INSTANCE;
            gmn0.a(mm40VarA0, null, staticColors.m121getTransparent0d7_KjU(), staticColors.m121getTransparent0d7_KjU(), 0.0f, 0.0f, null, u1c.M(-1350194551, new kur0(nyq0Var, a050Var, j, function0, ugdVar, ugdVar2, ugdVar3, ugdVar4, ugdVar5), fetVar), fetVar, 12582912, 114);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(nyq0Var, j, vhv0Var, function0, ugdVar, ugdVar2, ugdVar3, ugdVar4, ugdVar5, i) { // from class: a.lur0
                public final /* synthetic */ nyq0 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ vhv0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ ugd f;
                public final /* synthetic */ ugd g;
                public final /* synthetic */ ugd h;
                public final /* synthetic */ ugd i;
                public final /* synthetic */ ugd j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = x8x.L(920322049);
                    zcm0.d(this.f20687a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj2, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void e(nyq0 nyq0Var, vhv0 vhv0Var, long j, Function0 function0, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, ugd ugdVar5, fet fetVar, int i) {
        int i2;
        fetVar.g0(-646319677);
        int i3 = i | (fetVar.g(nyq0Var) ? 4 : 2) | (fetVar.g(vhv0Var) ? 32 : 16) | (fetVar.f(j) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(ugdVar) ? 16384 : 8192) | (fetVar.i(ugdVar2) ? 131072 : 65536) | (fetVar.i(ugdVar3) ? 1048576 : 524288) | (fetVar.i(ugdVar4) ? 8388608 : 4194304) | (fetVar.i(ugdVar5) ? 67108864 : 33554432);
        if (fetVar.U(i3 & 1, (i3 & 38347923) != 38347922)) {
            boolean z = ((i3 & 234881024) == 67108864) | ((3670016 & i3) == 1048576) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | ((i3 & 14) == 4) | ((29360128 & i3) == 8388608) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                i2 = 0;
                mur0 mur0Var = new mur0(ugdVar, ugdVar3, ugdVar2, function0, j, nyq0Var, ugdVar4, vhv0Var, ugdVar5);
                fetVar.o0(mur0Var);
                objP = mur0Var;
            } else {
                i2 = 0;
            }
            x4n0.a(null, (Function2) objP, fetVar, i2, 1);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mur0(nyq0Var, vhv0Var, j, function0, ugdVar, ugdVar2, ugdVar3, ugdVar4, ugdVar5, i);
        }
    }

    public static final String f(String str) {
        switch (str) {
            case "Icebox":
                StringBuilder sb = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/android/esports/valorant/maps/Icebox.png", ujn.h, false) || kotlin.text.c.x("static/img/android/esports/valorant/maps/Icebox.png", "https://", false)) {
                    sb.setLength(0);
                    sb.append("static/img/android/esports/valorant/maps/Icebox.png");
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0("static/img/android/esports/valorant/maps/Icebox.png", '/'));
                }
                return sb.toString();
            case "Fracture":
                StringBuilder sb2 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/android/esports/valorant/maps/Fracture.png", ujn.h, false) || kotlin.text.c.x("static/img/android/esports/valorant/maps/Fracture.png", "https://", false)) {
                    sb2.setLength(0);
                    sb2.append("static/img/android/esports/valorant/maps/Fracture.png");
                } else {
                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                        sb2.append('/');
                    }
                    sb2.append(StringsKt.y0("static/img/android/esports/valorant/maps/Fracture.png", '/'));
                }
                return sb2.toString();
            case "Bind":
                StringBuilder sb3 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/android/esports/valorant/maps/Bind.png", ujn.h, false) || kotlin.text.c.x("static/img/android/esports/valorant/maps/Bind.png", "https://", false)) {
                    sb3.setLength(0);
                    sb3.append("static/img/android/esports/valorant/maps/Bind.png");
                } else {
                    if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                        sb3.append('/');
                    }
                    sb3.append(StringsKt.y0("static/img/android/esports/valorant/maps/Bind.png", '/'));
                }
                return sb3.toString();
            case "Haven":
                StringBuilder sb4 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/android/esports/valorant/maps/Haven.png", ujn.h, false) || kotlin.text.c.x("static/img/android/esports/valorant/maps/Haven.png", "https://", false)) {
                    sb4.setLength(0);
                    sb4.append("static/img/android/esports/valorant/maps/Haven.png");
                } else {
                    if (sb4.length() > 0 && !StringsKt.S(sb4, Separators.SLASH)) {
                        sb4.append('/');
                    }
                    sb4.append(StringsKt.y0("static/img/android/esports/valorant/maps/Haven.png", '/'));
                }
                return sb4.toString();
            case "Lotus":
                StringBuilder sb5 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/android/esports/valorant/maps/Lotus.png", ujn.h, false) || kotlin.text.c.x("static/img/android/esports/valorant/maps/Lotus.png", "https://", false)) {
                    sb5.setLength(0);
                    sb5.append("static/img/android/esports/valorant/maps/Lotus.png");
                } else {
                    if (sb5.length() > 0 && !StringsKt.S(sb5, Separators.SLASH)) {
                        sb5.append('/');
                    }
                    sb5.append(StringsKt.y0("static/img/android/esports/valorant/maps/Lotus.png", '/'));
                }
                return sb5.toString();
            case "Pearl":
                StringBuilder sb6 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/android/esports/valorant/maps/Pearl.png", ujn.h, false) || kotlin.text.c.x("static/img/android/esports/valorant/maps/Pearl.png", "https://", false)) {
                    sb6.setLength(0);
                    sb6.append("static/img/android/esports/valorant/maps/Pearl.png");
                } else {
                    if (sb6.length() > 0 && !StringsKt.S(sb6, Separators.SLASH)) {
                        sb6.append('/');
                    }
                    sb6.append(StringsKt.y0("static/img/android/esports/valorant/maps/Pearl.png", '/'));
                }
                return sb6.toString();
            case "Range":
                StringBuilder sb7 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/android/esports/valorant/maps/Range.png", ujn.h, false) || kotlin.text.c.x("static/img/android/esports/valorant/maps/Range.png", "https://", false)) {
                    sb7.setLength(0);
                    sb7.append("static/img/android/esports/valorant/maps/Range.png");
                } else {
                    if (sb7.length() > 0 && !StringsKt.S(sb7, Separators.SLASH)) {
                        sb7.append('/');
                    }
                    sb7.append(StringsKt.y0("static/img/android/esports/valorant/maps/Range.png", '/'));
                }
                return sb7.toString();
            case "Split":
                StringBuilder sb8 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/android/esports/valorant/maps/Split.png", ujn.h, false) || kotlin.text.c.x("static/img/android/esports/valorant/maps/Split.png", "https://", false)) {
                    sb8.setLength(0);
                    sb8.append("static/img/android/esports/valorant/maps/Split.png");
                } else {
                    if (sb8.length() > 0 && !StringsKt.S(sb8, Separators.SLASH)) {
                        sb8.append('/');
                    }
                    sb8.append(StringsKt.y0("static/img/android/esports/valorant/maps/Split.png", '/'));
                }
                return sb8.toString();
            case "Ascent":
                StringBuilder sb9 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/android/esports/valorant/maps/Ascent.png", ujn.h, false) || kotlin.text.c.x("static/img/android/esports/valorant/maps/Ascent.png", "https://", false)) {
                    sb9.setLength(0);
                    sb9.append("static/img/android/esports/valorant/maps/Ascent.png");
                } else {
                    if (sb9.length() > 0 && !StringsKt.S(sb9, Separators.SLASH)) {
                        sb9.append('/');
                    }
                    sb9.append(StringsKt.y0("static/img/android/esports/valorant/maps/Ascent.png", '/'));
                }
                return sb9.toString();
            case "Breeze":
                StringBuilder sb10 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/android/esports/valorant/maps/Breeze.png", ujn.h, false) || kotlin.text.c.x("static/img/android/esports/valorant/maps/Breeze.png", "https://", false)) {
                    sb10.setLength(0);
                    sb10.append("static/img/android/esports/valorant/maps/Breeze.png");
                } else {
                    if (sb10.length() > 0 && !StringsKt.S(sb10, Separators.SLASH)) {
                        sb10.append('/');
                    }
                    sb10.append(StringsKt.y0("static/img/android/esports/valorant/maps/Breeze.png", '/'));
                }
                return sb10.toString();
            default:
                return "";
        }
    }

    public static final List g(ctf0 ctf0Var, List list) {
        list.getClass();
        ctf0Var.getClass();
        i4 i4VarL = idm0.l(ctf0Var, list);
        if (i4VarL.isEmpty()) {
            return iun.f15405a;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        lsm0 lsm0Var = ctf0Var.b;
        lc00VarB.add(new m9p0("HEADER_ACHIEVEMENTS", new hjm(lsm0Var.a(R.string.achievements, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166)));
        lc00VarB.addAll(CollectionsKt.D0(i4VarL, 3));
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final edy h(boolean z, int i, qmu0 qmu0Var) {
        qmu0Var.getClass();
        bzu bzuVar = new bzu((byte) 19);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        jdy jdyVarB = ncy.b(847L);
        jdyVarB.getClass();
        arrayList.add(jdyVarB);
        bzuVar.h(new edy(linkedHashMap), "categoriesFilter");
        cww.F(bzuVar, "skip", Integer.valueOf(i));
        if (z) {
            cww.E(bzuVar, "isTest", Boolean.TRUE);
        }
        if (qmu0Var instanceof omu0) {
            cww.F(bzuVar, "limit", Integer.valueOf(((omu0) qmu0Var).f25521a));
        }
        return bzuVar.a();
    }

    public static djv0 i(fet fetVar) {
        View view = (View) fetVar.k(dy2.f);
        djv0 djv0VarJ = j(view);
        boolean zI = fetVar.i(djv0VarJ) | fetVar.i(view);
        Object objP = fetVar.P();
        if (zI || objP == ukd.f35823a) {
            objP = new zfv0(djv0VarJ, view, (byte) 2);
            fetVar.o0(objP);
        }
        m0x0.o(djv0VarJ, (Function1) objP, fetVar);
        return djv0VarJ;
    }

    public static djv0 j(View view) {
        djv0 djv0Var;
        WeakHashMap weakHashMap = djv0.w;
        synchronized (weakHashMap) {
            try {
                Object djv0Var2 = weakHashMap.get(view);
                if (djv0Var2 == null) {
                    djv0Var2 = new djv0(view);
                    weakHashMap.put(view, djv0Var2);
                }
                djv0Var = (djv0) djv0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return djv0Var;
    }

    public static final a2m k(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        c2m c2mVar = c2m.f3631a;
        return z ? new z1m(c2mVar) : new y1m(c2mVar, new x1m(), str, str2, false, false);
    }

    public static final gbn l(Function1 function1) {
        return new gbn(new b4u0((byte) 13), new d8q0(3, (byte) 23), new sbt0(function1, (byte) 16), mnu0.b);
    }

    public static final gy30 m(nw30 nw30Var) {
        if (nw30Var instanceof pv30) {
            return ((pv30) nw30Var).b;
        }
        boolean z = nw30Var instanceof ew30;
        ey30 ey30Var = ey30.f8608a;
        miz kizVar = liz.f20129a;
        if (z) {
            ew30 ew30Var = (ew30) nw30Var;
            ux30 ux30Var = new ux30(10, 0L, ew30Var.e, ew30Var.f);
            int i = ew30Var.d;
            m0x m0xVar = new m0x(i, null, 6);
            if (ew30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var, new rx30(m0xVar, 0L, kizVar, i, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof mw30) {
            mw30 mw30Var = (mw30) nw30Var;
            ux30 ux30Var2 = new ux30(10, 0L, mw30Var.e, mw30Var.f);
            int i2 = mw30Var.d;
            m0x m0xVar2 = new m0x(i2, null, 6);
            if (mw30Var.f22484a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var2, new rx30(m0xVar2, 0L, kizVar, i2, 0L, null, 498), new by30(mw30Var.g), 0L, null, null, 248);
        }
        if (nw30Var instanceof fw30) {
            fw30 fw30Var = (fw30) nw30Var;
            ux30 ux30Var3 = new ux30(10, 0L, fw30Var.h, "");
            pz40 pz40Var = s6t0.f31722a;
            qc5 qc5Var = new qc5(null, new n0x(fw30Var.f), new y3d(s6t0.b().f33626a.getBackground()));
            n0x n0xVar = new n0x(fw30Var.e);
            if (fw30Var.f10240a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var3, new rx30(n0xVar, 0L, kizVar, R.drawable.sport_new, 0L, qc5Var, 434), new zx30(new n0x(fw30Var.i), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof iw30) {
            iw30 iw30Var = (iw30) nw30Var;
            ux30 ux30Var4 = new ux30(10, 0L, iw30Var.e, iw30Var.f);
            int i3 = iw30Var.d;
            m0x m0xVar3 = new m0x(i3, null, 6);
            if (iw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            rx30 rx30Var = new rx30(m0xVar3, 0L, kizVar, i3, 0L, null, 498);
            rpe rpeVar = new rpe(iw30Var.g);
            pz40 pz40Var2 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            return new gy30(ux30Var4, rx30Var, new dy30(rpeVar, new kpe(staticColors.m113getRed0d7_KjU(), staticColors.m123getWhite0d7_KjU())), 0L, null, null, 248);
        }
        if (nw30Var instanceof qv30) {
            qv30 qv30Var = (qv30) nw30Var;
            ux30 ux30Var5 = new ux30(10, 0L, qv30Var.e, qv30Var.f);
            int i4 = qv30Var.d;
            m0x m0xVar4 = new m0x(i4, null, 6);
            if (qv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var5, new rx30(m0xVar4, 0L, kizVar, i4, 0L, null, 498), new zx30(new n0x(qv30Var.g), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof jw30) {
            jw30 jw30Var = (jw30) nw30Var;
            ux30 ux30Var6 = new ux30(10, 0L, jw30Var.e, jw30Var.f);
            int i5 = jw30Var.d;
            m0x m0xVar5 = new m0x(i5, null, 6);
            if (jw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var6, new rx30(m0xVar5, 0L, kizVar, i5, 0L, null, 498), new zx30(new n0x(jw30Var.g), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof dw30) {
            dw30 dw30Var = (dw30) nw30Var;
            ux30 ux30Var7 = new ux30(10, 0L, dw30Var.e, dw30Var.f);
            int i6 = dw30Var.d;
            m0x m0xVar6 = new m0x(i6, null, 6);
            if (dw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var7, new rx30(m0xVar6, 0L, kizVar, i6, 0L, null, 498), new zx30(new n0x(dw30Var.g), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof uv30) {
            uv30 uv30Var = (uv30) nw30Var;
            ux30 ux30Var8 = new ux30(10, 0L, uv30Var.e, uv30Var.f);
            int i7 = uv30Var.d;
            m0x m0xVar7 = new m0x(i7, null, 6);
            if (uv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var8, new rx30(m0xVar7, 0L, kizVar, i7, 0L, null, 498), new zx30(new m0x(uv30Var.g, null, 6), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof ov30) {
            ov30 ov30Var = (ov30) nw30Var;
            ux30 ux30Var9 = new ux30(10, 0L, ov30Var.i, ov30Var.j);
            pc5 pc5Var = new pc5(new y3d(ov30Var.f));
            long j = ov30Var.e;
            long j2 = ov30Var.h;
            int i8 = ov30Var.g;
            n0x n0xVar2 = new n0x(ov30Var.d);
            if (ov30Var.f25907a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var9, new rx30(n0xVar2, j, kizVar, i8, j2, pc5Var, Response.UNSUPPORTED_URI_SCHEME), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof rv30) {
            rv30 rv30Var = (rv30) nw30Var;
            List list = rv30Var.k;
            String str = rv30Var.h;
            pz40 pz40Var3 = s6t0.f31722a;
            StaticColors staticColors2 = StaticColors.INSTANCE;
            ux30 ux30Var10 = new ux30(staticColors2.m123getWhite0d7_KjU(), staticColors2.m131getWhite800d7_KjU(), str, rv30Var.i);
            pc5 pc5Var2 = new pc5(new y3d(rv30Var.g));
            int i9 = rv30Var.e;
            long j3 = rv30Var.f;
            m0x m0xVar8 = new m0x(i9, null, 6);
            if (rv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var10, new rx30(m0xVar8, j3, kizVar, i9, 0L, pc5Var2, 432), new zx30(new m0x(rv30Var.j, rv30Var.l, 4), 3), 0L, list, null, 216);
        }
        if (nw30Var instanceof sv30) {
            sv30 sv30Var = (sv30) nw30Var;
            long j4 = sv30Var.j;
            String str2 = sv30Var.g;
            pz40 pz40Var4 = s6t0.f31722a;
            StaticColors staticColors3 = StaticColors.INSTANCE;
            ux30 ux30Var11 = new ux30(staticColors3.m123getWhite0d7_KjU(), staticColors3.m131getWhite800d7_KjU(), str2, sv30Var.h);
            int i10 = sv30Var.d;
            pc5 pc5Var3 = new pc5(new y3d(sv30Var.f));
            m0x m0xVar9 = new m0x(sv30Var.d, null, 6);
            if (sv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var11, new rx30(m0xVar9, 0L, kizVar, i10, 0L, pc5Var3, 434), new zx30(new m0x(sv30Var.i, null, 6), 3), j4, null, null, 240);
        }
        if (nw30Var instanceof nv30) {
            nv30 nv30Var = (nv30) nw30Var;
            boolean z2 = nv30Var.g;
            String str3 = nv30Var.e;
            wx30 vx30Var = z2 ? new vx30(str3, nv30Var.f, new m0x(R.drawable.ic_status_green_check_circle, null, 6)) : new ux30(10, 0L, str3, nv30Var.f);
            int i11 = nv30Var.d;
            m0x m0xVar10 = new m0x(i11, null, 6);
            if (nv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(vx30Var, new rx30(m0xVar10, 0L, kizVar, i11, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (!(nw30Var instanceof tv30)) {
            ux30 ux30Var12 = new ux30(10, 0L, "", "");
            zcl zclVar = qmk.f28987a;
            m0x m0xVar11 = new m0x(R.drawable.ic_glyph_language, null, 6);
            pz40 pz40Var5 = s6t0.f31722a;
            return new gy30(ux30Var12, new qx30(m0xVar11, s6t0.b().f33626a.getPrimary(), kizVar, R.drawable.ic_glyph_language, 40.0f, 16), ey30Var, 0L, null, null, 248);
        }
        tv30 tv30Var = (tv30) nw30Var;
        long j5 = tv30Var.i;
        String str4 = tv30Var.f;
        pz40 pz40Var6 = s6t0.f31722a;
        StaticColors staticColors4 = StaticColors.INSTANCE;
        ux30 ux30Var13 = new ux30(staticColors4.m123getWhite0d7_KjU(), staticColors4.m131getWhite800d7_KjU(), str4, tv30Var.g);
        int i12 = tv30Var.c;
        long j6 = tv30Var.d;
        m0x m0xVar12 = new m0x(i12, null, 6);
        pc5 pc5Var4 = new pc5(new y3d(tv30Var.e));
        if (tv30Var.f34580a) {
            kizVar = new kiz(new rf5(3, null));
        }
        return new gy30(ux30Var13, new rx30(m0xVar12, j6, kizVar, i12, 0L, pc5Var4, 432), new zx30(new m0x(tv30Var.h, null, 6), 3), j5, null, null, 240);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [a.bzw, a.y3d] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final xno0 n(d140 d140Var, ctf0 ctf0Var, qho qhoVar, String str) {
        c0m c0mVar;
        c0m c0mVar2;
        Object jy30Var;
        ctf0Var.getClass();
        str.getClass();
        Map map = d140Var.q;
        List<r040> listL0 = CollectionsKt.L0(map.keySet());
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(listL0, 10));
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            arrayList.add(hic.F((r040) it.next(), ctf0Var, qhoVar, d140Var.u));
        }
        a4x a4xVarO0 = dyb.o0(arrayList);
        ArrayList arrayList2 = new ArrayList(r3d.q(listL0, 10));
        for (r040 r040Var : listL0) {
            List list = (List) map.get(r040Var);
            List list2 = null;
            ?? r8 = 0;
            if (list != null) {
                ArrayList arrayList3 = new ArrayList(r3d.q(list, i));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ArrayList arrayList4 = arrayList3;
                    ?? r15 = r8;
                    nw30 nw30VarK0 = yyw.k0((yx10) it2.next(), ctf0Var, qhoVar, d140Var.x, r040Var, d140Var.w, d140Var.y, str);
                    boolean z = nw30VarK0 instanceof ew30;
                    if (z || (nw30VarK0 instanceof iw30) || (nw30VarK0 instanceof nv30) || (nw30VarK0 instanceof ov30) || (nw30VarK0 instanceof lw30) || (nw30VarK0 instanceof vv30) || (nw30VarK0 instanceof wv30) || (nw30VarK0 instanceof bw30) || (nw30VarK0 instanceof xv30) || (nw30VarK0 instanceof yv30) || (nw30VarK0 instanceof aw30) || (nw30VarK0 instanceof zv30) || (nw30VarK0 instanceof uv30) || (nw30VarK0 instanceof qv30) || (nw30VarK0 instanceof jw30) || (nw30VarK0 instanceof dw30)) {
                        iz30 iz30VarM = nw30VarK0.m();
                        r040 r040VarN = nw30VarK0.n();
                        i0m g0mVar = h0m.f12242a;
                        if (z) {
                            ew30 ew30Var = (ew30) nw30VarK0;
                            String str2 = ew30Var.e;
                            m0x m0xVar = new m0x(ew30Var.d, r15, 6);
                            pz40 pz40Var = s6t0.f31722a;
                            long primary = s6t0.b().f33626a.getPrimary();
                            int i2 = ew30Var.d;
                            if (ew30Var.b) {
                                g0mVar = new g0m(new rf5(3, r15));
                            }
                            c0mVar2 = new c0m(new j0m(str2, m0xVar, primary, i2, g0mVar, 2), new a0m(ew30Var.f, s6t0.b().f33626a.getSecondary()), null, false, null, 60);
                        } else {
                            map = map;
                            if (nw30VarK0 instanceof iw30) {
                                iw30 iw30Var = (iw30) nw30VarK0;
                                String str3 = iw30Var.e;
                                m0x m0xVar2 = new m0x(iw30Var.d, r15, 6);
                                pz40 pz40Var2 = s6t0.f31722a;
                                long primary2 = s6t0.b().f33626a.getPrimary();
                                int i3 = iw30Var.d;
                                if (iw30Var.b) {
                                    g0mVar = new g0m(new rf5(3, r15));
                                }
                                j0m j0mVar = new j0m(str3, m0xVar2, primary2, i3, g0mVar, 2);
                                a0m a0mVar = new a0m(iw30Var.f, s6t0.b().f33626a.getSecondary());
                                int i4 = iw30Var.g;
                                c0mVar2 = new c0m(j0mVar, a0mVar, i4 > 0 ? new d0m(new rpe(i4), new hpe(s6t0.b().f33626a.getBackground())) : e0m.f6994a, false, null, 56);
                            } else if (nw30VarK0 instanceof ov30) {
                                ov30 ov30Var = (ov30) nw30VarK0;
                                String str4 = ov30Var.i;
                                n0x n0xVar = new n0x(ov30Var.d);
                                pz40 pz40Var3 = s6t0.f31722a;
                                long primary3 = s6t0.b().f33626a.getPrimary();
                                int i5 = ov30Var.g;
                                if (ov30Var.f25907a) {
                                    g0mVar = new g0m(new rf5(3, r15));
                                }
                                c0mVar2 = new c0m(new j0m(str4, n0xVar, primary3, i5, g0mVar, 2), new a0m(ov30Var.j, s6t0.b().f33626a.getSecondary()), null, false, null, 60);
                            } else {
                                if (nw30VarK0 instanceof lw30) {
                                    lw30 lw30Var = (lw30) nw30VarK0;
                                    String str5 = lw30Var.g;
                                    n0x n0xVar2 = new n0x(lw30Var.f);
                                    pz40 pz40Var4 = s6t0.f31722a;
                                    long primary4 = s6t0.b().f33626a.getPrimary();
                                    if (lw30Var.f20744a) {
                                        g0mVar = new g0m(new rf5(3, r15));
                                    }
                                    c0mVar2 = new c0m(new j0m(str5, n0xVar2, primary4, R.drawable.ic_glyph_language, g0mVar, 2), null, null, false, null, 62);
                                } else {
                                    if (nw30VarK0 instanceof nv30) {
                                        nv30 nv30Var = (nv30) nw30VarK0;
                                        String str6 = nv30Var.f;
                                        String str7 = nv30Var.e;
                                        m0x m0xVar3 = new m0x(nv30Var.d, r15, 6);
                                        pz40 pz40Var5 = s6t0.f31722a;
                                        long primary5 = s6t0.b().f33626a.getPrimary();
                                        int i6 = nv30Var.d;
                                        if (nv30Var.b) {
                                            g0mVar = new g0m(new rf5(3, r15));
                                        }
                                        c0mVar2 = new c0m(new j0m(str7, m0xVar3, primary5, i6, g0mVar, 2), nv30Var.g ? new zzl(new tf5(R.drawable.ic_status_green_check_circle, r15, 6), str6, s6t0.b().f33626a.getSecondary()) : new a0m(str6, s6t0.b().f33626a.getSecondary()), null, false, null, 60);
                                    } else {
                                        a4xVarO0 = a4xVarO0;
                                        if (nw30VarK0 instanceof rv30) {
                                            rv30 rv30Var = (rv30) nw30VarK0;
                                            List list3 = rv30Var.k;
                                            String str8 = rv30Var.h;
                                            pz40 pz40Var6 = s6t0.f31722a;
                                            StaticColors staticColors = StaticColors.INSTANCE;
                                            long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                                            m0x m0xVar4 = new m0x(rv30Var.e, r15, 6);
                                            long jM123getWhite0d7_KjU2 = staticColors.m123getWhite0d7_KjU();
                                            int i7 = rv30Var.e;
                                            if (rv30Var.b) {
                                                g0mVar = new g0m(new rf5(3, r15));
                                            }
                                            j0m j0mVar2 = new j0m(str8, jM123getWhite0d7_KjU, m0xVar4, jM123getWhite0d7_KjU2, i7, g0mVar);
                                            a0m a0mVar2 = new a0m(rv30Var.i, staticColors.m131getWhite800d7_KjU());
                                            y3d y3dVar = (y3d) CollectionsKt.firstOrNull(list3);
                                            long primary6 = y3dVar != null ? y3dVar.f41946a : s6t0.b().f33626a.getPrimary();
                                            y3d y3dVar2 = (y3d) CollectionsKt.f0(list3);
                                            c0mVar2 = new c0m(j0mVar2, a0mVar2, null, false, new wzl(primary6, y3dVar2 != null ? y3dVar2.f41946a : s6t0.b().f33626a.getPrimary()), 44);
                                        } else if (nw30VarK0 instanceof sv30) {
                                            sv30 sv30Var = (sv30) nw30VarK0;
                                            String str9 = sv30Var.g;
                                            pz40 pz40Var7 = s6t0.f31722a;
                                            StaticColors staticColors2 = StaticColors.INSTANCE;
                                            long jM123getWhite0d7_KjU3 = staticColors2.m123getWhite0d7_KjU();
                                            m0x m0xVar5 = new m0x(sv30Var.d, r15, 6);
                                            long jM123getWhite0d7_KjU4 = staticColors2.m123getWhite0d7_KjU();
                                            int i8 = sv30Var.d;
                                            if (sv30Var.b) {
                                                g0mVar = new g0m(new rf5(3, r15));
                                            }
                                            c0mVar2 = new c0m(new j0m(str9, jM123getWhite0d7_KjU3, m0xVar5, jM123getWhite0d7_KjU4, i8, g0mVar), new a0m(sv30Var.h, staticColors2.m131getWhite800d7_KjU()), null, false, new vzl(sv30Var.j), 44);
                                        } else if (nw30VarK0 instanceof vv30) {
                                            vv30 vv30Var = (vv30) nw30VarK0;
                                            String str10 = vv30Var.f;
                                            String str11 = vv30Var.e;
                                            m0x m0xVar6 = new m0x(vv30Var.d, r15, 6);
                                            pz40 pz40Var8 = s6t0.f31722a;
                                            long primary7 = s6t0.b().f33626a.getPrimary();
                                            int i9 = vv30Var.d;
                                            if (vv30Var.b) {
                                                g0mVar = new g0m(new rf5(3, r15));
                                            }
                                            c0mVar2 = new c0m(new j0m(str11, m0xVar6, primary7, i9, g0mVar, 2), vv30Var.g ? new zzl(new tf5(R.drawable.ic_status_green_check_circle, r15, 6), str10, s6t0.b().f33626a.getSecondary()) : new a0m(str10, s6t0.b().f33626a.getSecondary()), null, false, null, 60);
                                        } else if (nw30VarK0 instanceof wv30) {
                                            wv30 wv30Var = (wv30) nw30VarK0;
                                            String str12 = wv30Var.f;
                                            n0x n0xVar3 = new n0x(wv30Var.d);
                                            pz40 pz40Var9 = s6t0.f31722a;
                                            long primary8 = s6t0.b().f33626a.getPrimary();
                                            int i10 = wv30Var.e;
                                            if (wv30Var.f39822a) {
                                                g0mVar = new g0m(new rf5(3, r15));
                                            }
                                            c0mVar2 = new c0m(new j0m(str12, n0xVar3, primary8, i10, g0mVar, 2), new a0m(wv30Var.g, s6t0.b().f33626a.getSecondary()), null, false, null, 60);
                                        } else if (nw30VarK0 instanceof xv30) {
                                            xv30 xv30Var = (xv30) nw30VarK0;
                                            List list4 = xv30Var.k;
                                            String str13 = xv30Var.h;
                                            pz40 pz40Var10 = s6t0.f31722a;
                                            StaticColors staticColors3 = StaticColors.INSTANCE;
                                            long jM123getWhite0d7_KjU5 = staticColors3.m123getWhite0d7_KjU();
                                            m0x m0xVar7 = new m0x(xv30Var.e, r15, 6);
                                            long jM123getWhite0d7_KjU6 = staticColors3.m123getWhite0d7_KjU();
                                            int i11 = xv30Var.e;
                                            if (xv30Var.b) {
                                                g0mVar = new g0m(new rf5(3, r15));
                                            }
                                            j0m j0mVar3 = new j0m(str13, jM123getWhite0d7_KjU5, m0xVar7, jM123getWhite0d7_KjU6, i11, g0mVar);
                                            a0m a0mVar3 = new a0m(xv30Var.i, staticColors3.m131getWhite800d7_KjU());
                                            y3d y3dVar3 = (y3d) CollectionsKt.firstOrNull(list4);
                                            long primary9 = y3dVar3 != null ? y3dVar3.f41946a : s6t0.b().f33626a.getPrimary();
                                            y3d y3dVar4 = (y3d) CollectionsKt.f0(list4);
                                            c0mVar2 = new c0m(j0mVar3, a0mVar3, null, false, new wzl(primary9, y3dVar4 != null ? y3dVar4.f41946a : s6t0.b().f33626a.getPrimary()), 44);
                                        } else if (nw30VarK0 instanceof yv30) {
                                            yv30 yv30Var = (yv30) nw30VarK0;
                                            String str14 = yv30Var.g;
                                            pz40 pz40Var11 = s6t0.f31722a;
                                            StaticColors staticColors4 = StaticColors.INSTANCE;
                                            long jM123getWhite0d7_KjU7 = staticColors4.m123getWhite0d7_KjU();
                                            m0x m0xVar8 = new m0x(yv30Var.d, r15, 6);
                                            long jM123getWhite0d7_KjU8 = staticColors4.m123getWhite0d7_KjU();
                                            int i12 = yv30Var.d;
                                            if (yv30Var.b) {
                                                g0mVar = new g0m(new rf5(3, r15));
                                            }
                                            c0mVar2 = new c0m(new j0m(str14, jM123getWhite0d7_KjU7, m0xVar8, jM123getWhite0d7_KjU8, i12, g0mVar), new a0m(yv30Var.h, staticColors4.m131getWhite800d7_KjU()), null, false, new vzl(yv30Var.j), 44);
                                        } else if (nw30VarK0 instanceof aw30) {
                                            aw30 aw30Var = (aw30) nw30VarK0;
                                            String str15 = aw30Var.e;
                                            m0x m0xVar9 = new m0x(aw30Var.d, r15, 6);
                                            pz40 pz40Var12 = s6t0.f31722a;
                                            long primary10 = s6t0.b().f33626a.getPrimary();
                                            int i13 = aw30Var.d;
                                            if (aw30Var.b) {
                                                g0mVar = new g0m(new rf5(3, r15));
                                            }
                                            c0mVar2 = new c0m(new j0m(str15, m0xVar9, primary10, i13, g0mVar, 2), new a0m(aw30Var.f, s6t0.b().f33626a.getSecondary()), null, false, null, 60);
                                        } else if (nw30VarK0 instanceof zv30) {
                                            zv30 zv30Var = (zv30) nw30VarK0;
                                            String str16 = zv30Var.e;
                                            m0x m0xVar10 = new m0x(zv30Var.d, r15, 6);
                                            pz40 pz40Var13 = s6t0.f31722a;
                                            long primary11 = s6t0.b().f33626a.getPrimary();
                                            int i14 = zv30Var.d;
                                            if (zv30Var.b) {
                                                g0mVar = new g0m(new rf5(3, r15));
                                            }
                                            c0mVar2 = new c0m(new j0m(str16, m0xVar10, primary11, i14, g0mVar, 2), new a0m(zv30Var.f, s6t0.b().f33626a.getSecondary()), null, false, null, 60);
                                        } else if (nw30VarK0 instanceof uv30) {
                                            uv30 uv30Var = (uv30) nw30VarK0;
                                            String str17 = uv30Var.e;
                                            m0x m0xVar11 = new m0x(uv30Var.d, r15, 6);
                                            pz40 pz40Var14 = s6t0.f31722a;
                                            long primary12 = s6t0.b().f33626a.getPrimary();
                                            int i15 = uv30Var.d;
                                            if (uv30Var.b) {
                                                g0mVar = new g0m(new rf5(3, r15));
                                            }
                                            c0mVar2 = new c0m(new j0m(str17, m0xVar11, primary12, i15, g0mVar, 2), new a0m(uv30Var.f, s6t0.b().f33626a.getSecondary()), null, false, null, 60);
                                        } else if (nw30VarK0 instanceof bw30) {
                                            bw30 bw30Var = (bw30) nw30VarK0;
                                            String str18 = bw30Var.g;
                                            n0x n0xVar4 = new n0x(bw30Var.f);
                                            pz40 pz40Var15 = s6t0.f31722a;
                                            long primary13 = s6t0.b().f33626a.getPrimary();
                                            if (bw30Var.f3307a) {
                                                g0mVar = new g0m(new rf5(3, r15));
                                            }
                                            c0mVar2 = new c0m(new j0m(str18, n0xVar4, primary13, R.drawable.ic_glyph_language, g0mVar, 2), null, null, false, null, 62);
                                        } else if (nw30VarK0 instanceof qv30) {
                                            qv30 qv30Var = (qv30) nw30VarK0;
                                            String str19 = qv30Var.e;
                                            m0x m0xVar12 = new m0x(qv30Var.d, r15, 6);
                                            pz40 pz40Var16 = s6t0.f31722a;
                                            long primary14 = s6t0.b().f33626a.getPrimary();
                                            int i16 = qv30Var.d;
                                            if (qv30Var.b) {
                                                g0mVar = new g0m(new rf5(3, r15));
                                            }
                                            c0mVar2 = new c0m(new j0m(str19, m0xVar12, primary14, i16, g0mVar, 2), new a0m(qv30Var.f, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackgroundContent()), 44);
                                        } else if (nw30VarK0 instanceof jw30) {
                                            jw30 jw30Var = (jw30) nw30VarK0;
                                            String str20 = jw30Var.e;
                                            m0x m0xVar13 = new m0x(jw30Var.d, r15, 6);
                                            pz40 pz40Var17 = s6t0.f31722a;
                                            long primary15 = s6t0.b().f33626a.getPrimary();
                                            int i17 = jw30Var.d;
                                            if (jw30Var.b) {
                                                g0mVar = new g0m(new rf5(3, r15));
                                            }
                                            c0mVar2 = new c0m(new j0m(str20, m0xVar13, primary15, i17, g0mVar, 2), new a0m(jw30Var.f, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackgroundContent()), 44);
                                        } else if (nw30VarK0 instanceof dw30) {
                                            dw30 dw30Var = (dw30) nw30VarK0;
                                            String str21 = dw30Var.e;
                                            m0x m0xVar14 = new m0x(dw30Var.d, r15, 6);
                                            pz40 pz40Var18 = s6t0.f31722a;
                                            long primary16 = s6t0.b().f33626a.getPrimary();
                                            int i18 = dw30Var.d;
                                            if (dw30Var.b) {
                                                g0mVar = new g0m(new rf5(3, r15));
                                            }
                                            c0mVar2 = new c0m(new j0m(str21, m0xVar14, primary16, i18, g0mVar, 2), new a0m(dw30Var.f, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackgroundContent()), 44);
                                        } else {
                                            m0x m0xVar15 = new m0x(R.drawable.ic_glyph_category_new, r15, 6);
                                            pz40 pz40Var19 = s6t0.f31722a;
                                            c0mVar = new c0m(new j0m("", m0xVar15, s6t0.b().f33626a.getPrimary(), R.drawable.ic_glyph_category_new, (i0m) null, 34), null, null, false, null, 62);
                                        }
                                    }
                                    c0mVar = c0mVar2;
                                }
                                jy30Var = new jy30(iz30VarM, r040VarN, false, yyw.g0(nw30VarK0), yyw.h0(nw30VarK0), c0mVar);
                            }
                        }
                        a4xVarO0 = a4xVarO0;
                        c0mVar = c0mVar2;
                        jy30Var = new jy30(iz30VarM, r040VarN, false, yyw.g0(nw30VarK0), yyw.h0(nw30VarK0), c0mVar);
                    } else {
                        map = map;
                        a4xVarO0 = a4xVarO0;
                        if (nw30VarK0 instanceof mw30) {
                            mw30 mw30Var = (mw30) nw30VarK0;
                            jy30Var = new ly30(mw30Var.b, mw30Var.c, false, yyw.g0(nw30VarK0), yyw.h0(nw30VarK0), m(nw30VarK0), kkb.T(mw30Var.h));
                        } else if (nw30VarK0 instanceof cw30) {
                            cw30 cw30Var = (cw30) nw30VarK0;
                            jy30Var = new ly30(cw30Var.b, cw30Var.c, false, yyw.g0(nw30VarK0), yyw.h0(nw30VarK0), m(nw30VarK0), kkb.T(cw30Var.h));
                        } else {
                            jy30Var = nw30VarK0 instanceof kw30 ? xww.V((kw30) nw30VarK0, false) : new ky30(nw30VarK0.m(), nw30VarK0.n(), m(nw30VarK0), false, yyw.g0(nw30VarK0), yyw.h0(nw30VarK0));
                        }
                    }
                    arrayList4.add(jy30Var);
                    ctf0Var = ctf0Var;
                    qhoVar = qhoVar;
                    r8 = r15;
                    arrayList3 = arrayList4;
                    map = map;
                    a4xVarO0 = a4xVarO0;
                }
                list2 = arrayList3;
            }
            Map map2 = map;
            a4x a4xVar = a4xVarO0;
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            arrayList2.add(dyb.o0(list2));
            map = map2;
            a4xVarO0 = a4xVar;
            i = 10;
        }
        a4x a4xVar2 = a4xVarO0;
        a4x a4xVarO1 = dyb.o0(arrayList2);
        int iIndexOf = listL0.indexOf(d140Var.s);
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        return new xno0(a4xVar2, iIndexOf, d140Var.l, d140Var.t, a4xVarO1, fem0.l(d140Var.v));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    public static final h3r0 o(r3r0 r3r0Var) {
        ?? arrayList;
        List<f3r0> list;
        List<x3r0> list2;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4 = 0;
        arrayList4 = 0;
        if (r3r0Var == null || (list2 = r3r0Var.f29802a) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list2, 10));
            for (x3r0 x3r0Var : list2) {
                x3r0Var.getClass();
                String str = x3r0Var.f40234a;
                if (str == null) {
                    str = "";
                }
                Integer num = x3r0Var.b;
                int iIntValue = num != null ? num.intValue() : 0;
                List<aba0> list3 = x3r0Var.c;
                if (list3 != null) {
                    arrayList2 = new ArrayList(r3d.q(list3, 10));
                    for (aba0 aba0Var : list3) {
                        aba0Var.getClass();
                        String str2 = aba0Var.f570a;
                        if (str2 == null) {
                            jf4.k(null);
                            return null;
                        }
                        List<wfm0> list4 = aba0Var.b;
                        if (list4 != null) {
                            arrayList3 = new ArrayList(r3d.q(list4, 10));
                            for (wfm0 wfm0Var : list4) {
                                wfm0Var.getClass();
                                String str3 = wfm0Var.f39079a;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                String str4 = wfm0Var.b;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                arrayList3.add(new efm0(str3, str4));
                            }
                        } else {
                            arrayList3 = 0;
                        }
                        if (arrayList3 == 0) {
                            arrayList3 = iun.f15405a;
                        }
                        arrayList2.add(new qaa0(str2, arrayList3));
                    }
                } else {
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                arrayList.add(new u3r0(str, arrayList2, iIntValue));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        if (r3r0Var != null && (list = r3r0Var.b) != null) {
            arrayList4 = new ArrayList(r3d.q(list, 10));
            for (f3r0 f3r0Var : list) {
                f3r0Var.getClass();
                Integer num2 = f3r0Var.f8879a;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                String str5 = f3r0Var.b;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = f3r0Var.c;
                if (str6 == null) {
                    str6 = "";
                }
                arrayList4.add(new c3r0(iIntValue2, str5, str6));
            }
        }
        if (arrayList4 == 0) {
            arrayList4 = iun.f15405a;
        }
        return new h3r0(arrayList, arrayList4);
    }

    public static final bcs0 p(acs0 acs0Var) {
        acs0Var.getClass();
        long j = acs0Var.f644a;
        long j2 = acs0Var.b;
        long j3 = acs0Var.c;
        boolean z = acs0Var.d;
        long j4 = acs0Var.e;
        String str = acs0Var.f;
        String str2 = acs0Var.g;
        String str3 = acs0Var.h;
        long j5 = acs0Var.i;
        String str4 = acs0Var.j;
        long j6 = acs0Var.k;
        String str5 = acs0Var.l;
        String str6 = acs0Var.m;
        String str7 = acs0Var.v;
        String str8 = str7 == null ? "" : str7;
        long j7 = acs0Var.n;
        String str9 = acs0Var.o;
        String str10 = acs0Var.p;
        String str11 = acs0Var.w;
        String str12 = str11 != null ? str11 : "";
        String str13 = acs0Var.q;
        String str14 = acs0Var.r;
        String str15 = acs0Var.s;
        boolean z2 = acs0Var.t;
        String str16 = acs0Var.u;
        Boolean bool = acs0Var.x;
        return new bcs0(j, j2, j3, z, j4, str, str2, str3, j5, str4, j6, str5, str6, str8, j7, str9, str10, str12, str13, str14, str15, z2, str16, bool != null ? bool.booleanValue() : false);
    }

    public static g3u0 q(int i, String str) {
        return new g3u0(new dgx(0, 0, 0, 0), str);
    }

    public static final File r(Uri uri) throws l52 {
        if (!uri.getScheme().equals("file")) {
            throw new l52("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new l52("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new l52("Did not expect uri to have authority");
    }

    public static String s(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static byte[] t(String str) {
        if (str.length() % 2 != 0) {
            jf4.o("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                jf4.o("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((iDigit << 4) + iDigit2);
        }
        return bArr;
    }
}
