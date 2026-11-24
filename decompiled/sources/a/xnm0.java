package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;
import org.xplatform.uikit.components.timer.DsTimer;

/* JADX INFO: loaded from: classes.dex */
public abstract class xnm0 {
    public static final void a(rwr0 rwr0Var, float f, Function2 function2, Function1 function1, fet fetVar, int i) {
        Function2 function3;
        boolean z;
        rwr0Var.getClass();
        function2.getClass();
        function1.getClass();
        fetVar.g0(1472605489);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? fetVar.g(rwr0Var) : fetVar.i(rwr0Var) ? 4 : 2) | i : i;
        float f2 = f;
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function3 = function2;
            i2 |= fetVar.i(function3) ? 256 : 128;
        } else {
            function3 = function2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            float f3 = rwr0Var.f31230a.f27452a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.s(jm40Var, f3), "BRACKET_COLUMN");
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
            fetVar.e0(-979697076);
            for (p6t0 p6t0Var : rwr0Var.b) {
                if (p6t0Var == null) {
                    z = false;
                } else {
                    if (p6t0Var instanceof rxr0) {
                        fetVar.e0(-1860454206);
                        rxr0 rxr0Var = (rxr0) p6t0Var;
                        cyr0 cyr0Var = rxr0Var.b;
                        mm40 mm40VarE = o7k0.e(jm40Var, rxr0Var.c);
                        boolean z2 = (i2 & 7168) == 2048;
                        Object objP = fetVar.P();
                        if (z2 || objP == ukd.f35823a) {
                            objP = new xar0(function1, (byte) 6);
                            fetVar.o0(objP);
                        }
                        rsm0.l(mm40VarE, cyr0Var, (Function1) objP, fetVar, 0);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof exr0) {
                        fetVar.e0(-1860119654);
                        exr0 exr0Var = (exr0) p6t0Var;
                        zcl zclVar = qmk.f28987a;
                        dnm0.e(s5x0.L(jm40Var, 0.0f, 8.0f, 1), exr0Var, f2, function3, fetVar, (i2 << 3) & 8064);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof xwr0) {
                        fetVar.e0(-1859748801);
                        xwr0 xwr0Var = (xwr0) p6t0Var;
                        int i3 = xwr0Var.b;
                        zcl zclVar2 = qmk.f28987a;
                        wpm0.e(o7k0.d(o7k0.e(jm40Var, i3 * 47.0f), 1.0f), xwr0Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        z = false;
                        if (p6t0Var instanceof oxr0) {
                            fetVar.e0(-198529124);
                            osm0.d(((oxr0) p6t0Var).f26027a, 0, fetVar, null);
                            fetVar.r(false);
                        } else if (p6t0Var instanceof fxr0) {
                            fetVar.e0(-198525903);
                            rz4.t(jm40Var, ((fxr0) p6t0Var).f10324a, fetVar, false);
                        }
                    }
                    f2 = f;
                    function3 = function2;
                }
                fetVar.e0(-1859287211);
                fetVar.r(z);
                f2 = f;
                function3 = function2;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zm2((Object) rwr0Var, f, (Object) function2, (wdr) function1, i, (byte) 9);
        }
    }

    public static final void b(final String str, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final List list, ugd ugdVar, fet fetVar, final int i) {
        ugd ugdVar2;
        fetVar.g0(-1851426205);
        byte b = 2;
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.d(f) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128) | (fetVar.d(f3) ? 2048 : 1024) | (fetVar.d(f4) ? 16384 : 8192) | (fetVar.d(f5) ? 131072 : 65536) | (fetVar.d(f6) ? 1048576 : 524288) | (fetVar.d(f7) ? 8388608 : 4194304) | (fetVar.i(list) ? 67108864 : 33554432);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i2 & 1, (306783379 & i2) != 306783378)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new o1u0((byte) 8);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            if (!(fetVar.f9421a instanceof w3u0)) {
                e3c.E();
                throw null;
            }
            fetVar.Y(null, 125, 1, null);
            fetVar.r = true;
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, str, new i9t0((byte) 27));
            jpm0.o(fetVar, Float.valueOf(f), new i9t0((byte) 28));
            jpm0.o(fetVar, Float.valueOf(f2), new i9t0((byte) 29));
            jpm0.o(fetVar, Float.valueOf(f3), new b4u0(b2));
            jpm0.o(fetVar, Float.valueOf(f4), new b4u0(b3));
            jpm0.o(fetVar, Float.valueOf(f5), new b4u0(b));
            jpm0.o(fetVar, Float.valueOf(f6), new b4u0((byte) 3));
            jpm0.o(fetVar, Float.valueOf(f7), new b4u0((byte) 4));
            jpm0.o(fetVar, list, new i9t0((byte) 12));
            ugdVar2 = ugdVar;
            ugdVar2.invoke(fetVar, 6);
            fetVar.r(true);
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final ugd ugdVar3 = ugdVar2;
            yfe0VarU.d = new Function2(str, f, f2, f3, f4, f5, f6, f7, list, ugdVar3, i) { // from class: a.a4u0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f240a;
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ float g;
                public final /* synthetic */ float h;
                public final /* synthetic */ List i;
                public final /* synthetic */ ugd j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(805306369);
                    xnm0.b(this.f240a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void c(final List list, final int i, final String str, final t89 t89Var, final float f, final t89 t89Var2, final float f2, final float f3, final int i2, final int i3, final float f4, final float f5, final float f6, final float f7, fet fetVar, final int i4) {
        fetVar.g0(-1478270750);
        int i5 = i4 | (fetVar.i(list) ? 4 : 2) | (fetVar.e(i) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.g(t89Var) ? 2048 : 1024) | (fetVar.d(f) ? 16384 : 8192) | (fetVar.g(t89Var2) ? 131072 : 65536) | (fetVar.d(f2) ? 1048576 : 524288) | (fetVar.d(f3) ? 8388608 : 4194304) | (fetVar.e(i2) ? 67108864 : 33554432) | (fetVar.e(i3) ? 536870912 : 268435456);
        if (fetVar.U(i5 & 1, ((i5 & 306783379) == 306783378 && (((((fetVar.d(f4) ? (char) 4 : (char) 2) | (fetVar.d(f5) ? ' ' : (char) 16)) | (fetVar.d(f6) ? 256 : 128)) | (fetVar.d(f7) ? (char) 2048 : (char) 1024)) & 1171) == 1170) ? false : true)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new o1u0((byte) 9);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            if (!(fetVar.f9421a instanceof w3u0)) {
                e3c.E();
                throw null;
            }
            fetVar.Y(null, 125, 1, null);
            fetVar.r = true;
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, str, new i9t0((byte) 18));
            jpm0.o(fetVar, list, new i9t0((byte) 19));
            jpm0.o(fetVar, new c290(i), new i9t0((byte) 20));
            jpm0.o(fetVar, t89Var, new i9t0((byte) 21));
            jpm0.o(fetVar, Float.valueOf(f), new i9t0((byte) 22));
            jpm0.o(fetVar, t89Var2, new i9t0((byte) 23));
            jpm0.o(fetVar, Float.valueOf(f2), new i9t0((byte) 24));
            jpm0.o(fetVar, Float.valueOf(f3), new i9t0((byte) 25));
            jpm0.o(fetVar, new ytm0(i3), new i9t0((byte) 26));
            jpm0.o(fetVar, new wtm0(i2), new i9t0((byte) 13));
            jpm0.o(fetVar, Float.valueOf(f4), new i9t0((byte) 14));
            jpm0.o(fetVar, Float.valueOf(f5), new i9t0((byte) 15));
            jpm0.o(fetVar, Float.valueOf(f6), new i9t0((byte) 16));
            jpm0.o(fetVar, Float.valueOf(f7), new i9t0((byte) 17));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(list, i, str, t89Var, f, t89Var2, f2, f3, i2, i3, f4, f5, f6, f7, i4) { // from class: a.z3u0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f43738a;
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ t89 d;
                public final /* synthetic */ float e;
                public final /* synthetic */ t89 f;
                public final /* synthetic */ float g;
                public final /* synthetic */ float h;
                public final /* synthetic */ int i;
                public final /* synthetic */ int j;
                public final /* synthetic */ float k;
                public final /* synthetic */ float l;
                public final /* synthetic */ float m;
                public final /* synthetic */ float n;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    xnm0.c(this.f43738a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void d(mm40 mm40Var, wxl wxlVar, chq0 chq0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        chq0Var.getClass();
        function1.getClass();
        fetVar.g0(-608107196);
        int i2 = i | 6 | (fetVar.e(wxlVar.ordinal()) ? 32 : 16) | (fetVar.g(chq0Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new b8q0((Object) chq0Var, (Object) function1, (byte) 7);
                fetVar.o0(objP);
            }
            int i3 = i2 & 126;
            jm40 jm40Var = jm40.b;
            v3c.n(jm40Var, wxlVar, (Function1) objP, fetVar, i3, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 14, i, mm40Var2, wxlVar, chq0Var, function1);
        }
    }

    public static final void e(mm40 mm40Var, bdr0 bdr0Var, Function1 function1, fet fetVar, int i) {
        bdr0Var.getClass();
        function1.getClass();
        fetVar.g0(-782981321);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(bdr0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            mdm mdmVar = bdr0Var.b;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new o0q0(function1, (byte) 27);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i3, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, bdr0Var, function1, i, (byte) 26);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        str.getClass();
        fetVar.g0(-69695025);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
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
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 24.0f, 0L, fetVar, 0, 5);
            wwb.i(null, str, 0L, 0, 0L, fetVar, i2 & 112, 29);
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(mm40Var2, str, i, (byte) 13);
        }
    }

    public static final void g(cp cpVar, ewn0 ewn0Var) {
        DsTimer dsTimer = ((zvn0) cpVar.u).u;
        dsTimer.setTimerType(ewn0Var.b);
        dsTimer.setVisibility(ewn0Var.d ? 0 : 8);
        dsTimer.setTime(ewn0Var.f8536a);
        dsTimer.setTimeDirection(ewn0Var.c);
        if (ewn0Var.e) {
            dsTimer.d();
        }
    }

    public static final qbp0 h(o9p0 o9p0Var, Map map, TeamDetailsParams teamDetailsParams, boolean z, v8d v8dVar, boolean z2) {
        String string;
        String str;
        char c;
        int i;
        int i2;
        int i3;
        char c2;
        char c3;
        String str2;
        int i4;
        int i5;
        int i6;
        char c4;
        long j = teamDetailsParams.f46569a;
        String str3 = teamDetailsParams.c;
        v8dVar.getClass();
        ccm ccmVar = ccm.f4118a;
        pbm nbmVar = obm.f24988a;
        if (o9p0Var == null) {
            return new qbp0(str3, (StringsKt.W(str3) || z2) ? gcm.f11070a : new fcm(0L, new ecm(str3), nbmVar, ccmVar), "", "", z ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder);
        }
        String str4 = o9p0Var.f;
        String str5 = o9p0Var.d;
        if (v8dVar.W) {
            StringBuilder sb = new StringBuilder(ujn.h);
            String strI = ua80.i("/static/img/ImgDefault/Esports/teamScreen/", kotlin.text.c.r(str5, Separators.SP, BundleUtil.UNDERLINE_TAG, false), z ? "Tablet" : "", ".png");
            if (strI.length() == 0) {
                sb.setLength(0);
            } else {
                if (StringsKt.O(strI, ujn.h, false)) {
                    i5 = 0;
                } else if (kotlin.text.c.x(strI, "https://", false)) {
                    i5 = 0;
                } else {
                    if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                        i6 = 1;
                        c4 = '/';
                    } else {
                        sb.append('/');
                        c4 = '/';
                        i6 = 1;
                    }
                    char[] cArr = new char[i6];
                    cArr[0] = c4;
                    sb.append(StringsKt.y0(strI, cArr));
                }
                sb.setLength(i5);
                sb.append(strI);
            }
            string = sb.toString();
        } else {
            string = "";
        }
        StringBuilder sb2 = new StringBuilder(ujn.h);
        if (j == 1) {
            str = "Dota";
        } else if (j == 46) {
            str = "CS";
        } else if (j == 27) {
            str = "Valorant";
        } else {
            str = j == 2 ? "LoL" : "";
        }
        String strK = b1j.k("/static/img/ImgDefault/Esports/teamScreen/", str, "DefaultTeamImg", z ? "Tablet" : "", ".png");
        if (strK.length() == 0) {
            sb2.setLength(0);
        } else {
            int i7 = 0;
            if (StringsKt.O(strK, ujn.h, false)) {
                sb2.setLength(i7);
                sb2.append(strK);
            } else if (kotlin.text.c.x(strK, "https://", false)) {
                i7 = 0;
                sb2.setLength(i7);
                sb2.append(strK);
            } else {
                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                    c = '/';
                } else {
                    c = '/';
                    sb2.append('/');
                }
                sb2.append(StringsKt.y0(strK, c));
            }
        }
        String string2 = sb2.toString();
        String str6 = str5.length() == 0 ? str3 : str5;
        long j2 = o9p0Var.f24891a;
        if (str5.length() != 0) {
            str3 = str5;
        }
        ecm ecmVar = new ecm(str3);
        lc00 lc00VarB = kotlin.collections.a.b();
        ypl0 ypl0Var = (ypl0) map.get(Long.valueOf(j));
        lel0 lel0Var = ypl0Var != null ? ypl0Var.c : null;
        List list = o9p0Var.k;
        List list2 = o9p0Var.i;
        List listJ = q3d.j(ttg.d, trg.d, oxg.d, pug.d, yvg.d);
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        for (Iterator it = listJ.iterator(); it.hasNext(); it = it) {
            arrayList.add(Long.valueOf(((yxg) it.next()).f43419a));
        }
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (arrayList.contains(Long.valueOf(((Number) it2.next()).longValue())) && (i = i + 1) < 0) {
                    q3d.o();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        boolean z3 = i > 1;
        StringBuilder sb3 = new StringBuilder(ujn.h);
        String str7 = lel0Var != null ? lel0Var.f19909a : null;
        String str8 = str7 != null ? str7 : "";
        if (str8.length() == 0) {
            sb3.setLength(0);
        } else {
            if (StringsKt.O(str8, ujn.h, false)) {
                i2 = 0;
            } else if (kotlin.text.c.x(str8, "https://", false)) {
                i2 = 0;
            } else {
                if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                    i3 = 1;
                    c2 = '/';
                } else {
                    sb3.append('/');
                    c2 = '/';
                    i3 = 1;
                }
                char[] cArr2 = new char[i3];
                cArr2[0] = c2;
                sb3.append(StringsKt.y0(str8, cArr2));
            }
            sb3.setLength(i2);
            sb3.append(str8);
        }
        n0x n0xVar = new n0x(sb3.toString());
        ubm ubmVar = ubm.f35388a;
        lc00VarB.add(new vbm(n0xVar, z3 ? qbm.f28449a : rbm.f30195a));
        if (!list2.isEmpty()) {
            if (list2.isEmpty()) {
                i4 = 0;
            } else {
                Iterator it3 = list2.iterator();
                i4 = 0;
                while (it3.hasNext()) {
                    if (((eh) it3.next()).e.equals("1") && (i4 = i4 + 1) < 0) {
                        q3d.o();
                        throw null;
                    }
                }
            }
            lc00VarB.add(new xbm(2L, String.valueOf(i4), new m0x(R.drawable.ic_glyph_tournaments, null, 6), ubm.f35388a, R.drawable.ic_glyph_tournaments));
        }
        Iterator it4 = list2.iterator();
        int i8 = 0;
        while (it4.hasNext()) {
            i8 += ((eh) it4.next()).f;
        }
        if (i8 > 0) {
            Iterator it5 = list2.iterator();
            int i9 = 0;
            while (it5.hasNext()) {
                i9 += ((eh) it5.next()).f;
            }
            long j3 = i9;
            if (list2.isEmpty()) {
                str2 = "%,d$";
                break;
            }
            Iterator it6 = list2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    str2 = "%,d$";
                    break;
                }
                if (((eh) it6.next()).g) {
                    str2 = "$%,d";
                    break;
                }
            }
            lc00VarB.add(new wbm(3L, zvw.a0(j3, str2)));
        }
        if (str4.length() > 0) {
            StringBuilder sb4 = new StringBuilder(ujn.h);
            String strConcat = "cyberstatistic/v1/image/".concat(o9p0Var.g);
            if (strConcat.length() == 0) {
                sb4.setLength(0);
            } else {
                int i10 = 0;
                if (StringsKt.O(strConcat, ujn.h, false)) {
                    sb4.setLength(i10);
                    sb4.append(strConcat);
                } else if (kotlin.text.c.x(strConcat, "https://", false)) {
                    i10 = 0;
                    sb4.setLength(i10);
                    sb4.append(strConcat);
                } else {
                    if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                        c3 = '/';
                    } else {
                        c3 = '/';
                        sb4.append('/');
                    }
                    sb4.append(StringsKt.y0(strConcat, c3));
                }
            }
            lc00VarB.add(new xbm(4L, str4, new n0x(sb4.toString()), ubm.b, R.drawable.ic_glyph_circle_globe));
        }
        a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
        if (a4xVarO0.size() > 1) {
            nbmVar = new nbm(a4xVarO0);
        }
        return new qbp0(str6, new fcm(j2, ecmVar, nbmVar, ccmVar), string, string2, z ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder);
    }

    public static final Object i(jva0 jva0Var, String str, zje zjeVar) {
        Object objB = jva0Var.b(str, new g4s0((byte) 23), zjeVar);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }

    public static boolean j(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final int k(h0w h0wVar) {
        h0wVar.getClass();
        jvw jvwVar = h0wVar.f12253a;
        if (jvwVar == rc10.f30217a) {
            return 0;
        }
        if (jvwVar == rc10.b) {
            return 1;
        }
        if (jvwVar == rc10.c) {
            return 2;
        }
        if (jvwVar == zw4.f45089a || jvwVar == i0w.b) {
            return 1;
        }
        if (jvwVar == zw4.b || jvwVar == i0w.c) {
            return 2;
        }
        if (jvwVar == zw4.c || jvwVar == i0w.d) {
            return 3;
        }
        if (jvwVar == i0w.f13966a) {
            return 0;
        }
        if (jvwVar == i0w.e) {
            return 4;
        }
        if (jvwVar == i0w.f) {
            return 5;
        }
        if (jvwVar == i0w.g) {
            return 6;
        }
        if (jvwVar == i0w.h) {
            return 7;
        }
        if (jvwVar == i0w.i) {
            return 8;
        }
        if (jvwVar == w21.f38428a) {
            return 1;
        }
        if (jvwVar == w21.b) {
            return 37;
        }
        if (jvwVar == j31.f15808a) {
            return 1;
        }
        return jvwVar == j31.b ? 2 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    public static final List l(rlp0 rlp0Var) {
        gip0 gip0Var;
        Object next;
        ?? arrayList;
        dsp0 dsp0Var;
        Integer num;
        Object next2;
        List<olp0> list = rlp0Var.c;
        ArrayList arrayList2 = null;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
            for (olp0 olp0Var : list) {
                List list2 = rlp0Var.f30710a;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!Intrinsics.d(((gip0) next2).f11360a, olp0Var.f25468a));
                    gip0Var = (gip0) next2;
                } else {
                    gip0Var = null;
                }
                String str = olp0Var.f25468a;
                String str2 = str == null ? "" : str;
                String str3 = gip0Var != null ? gip0Var.b : null;
                String str4 = str3 == null ? "" : str3;
                String str5 = gip0Var != null ? gip0Var.f11360a : null;
                String str6 = str5 == null ? "" : str5;
                String str7 = gip0Var != null ? gip0Var.d : null;
                String str8 = str7 == null ? "" : str7;
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.d(gip0Var != null ? gip0Var.f11360a : null, ((olp0) next).f25468a));
                olp0 olp0Var2 = (olp0) next;
                String strValueOf = (olp0Var2 == null || (num = olp0Var2.b) == null) ? null : String.valueOf(num.intValue());
                String str9 = strValueOf == null ? "" : strValueOf;
                List list3 = olp0Var.c;
                if (list3 != null) {
                    ArrayList<mz30> arrayList4 = new ArrayList();
                    for (Object obj : list3) {
                        if (!Intrinsics.d(((mz30) obj).c, Boolean.TRUE)) {
                            arrayList4.add(obj);
                        }
                    }
                    arrayList = new ArrayList();
                    for (mz30 mz30Var : arrayList4) {
                        Integer num2 = mz30Var.f22634a;
                        if (num2 != null) {
                            int iIntValue = num2.intValue();
                            String str10 = mz30Var.b;
                            if (str10 == null) {
                                str10 = "";
                            }
                            dsp0Var = new dsp0(iIntValue, str10);
                        } else {
                            dsp0Var = null;
                        }
                        if (dsp0Var != null) {
                            arrayList.add(dsp0Var);
                        }
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                arrayList3.add(new esp0(str2, str4, str6, str8, str9, arrayList));
            }
            arrayList2 = arrayList3;
        }
        return arrayList2 == null ? iun.f15405a : arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r41v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r60v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public static final cit0 m(oit0 oit0Var, boolean z, q4f q4fVar) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        oit0Var.getClass();
        q4fVar.getClass();
        Integer num = oit0Var.f25328a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = oit0Var.b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = oit0Var.c;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        Integer num4 = oit0Var.d;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        List list = oit0Var.e;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(p8a.f0((oq7) it.next(), z));
            }
        } else {
            arrayList = iun.f15405a;
        }
        Integer num5 = oit0Var.f;
        int iIntValue5 = num5 != null ? num5.intValue() : 0;
        Integer num6 = oit0Var.g;
        int iIntValue6 = num6 != null ? num6.intValue() : 0;
        List list2 = oit0Var.h;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list3 = list2;
        String str = oit0Var.i;
        if (str == null) {
            str = "";
        }
        Boolean bool = oit0Var.j;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Integer num7 = oit0Var.k;
        int iIntValue7 = num7 != null ? num7.intValue() : 0;
        Integer num8 = oit0Var.l;
        int iIntValue8 = num8 != null ? num8.intValue() : 0;
        Double d = oit0Var.m;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        String str2 = oit0Var.n;
        if (str2 == null) {
            str2 = "";
        }
        Integer num9 = oit0Var.o;
        int iIntValue9 = num9 != null ? num9.intValue() : 0;
        String str3 = str;
        Integer num10 = oit0Var.p;
        int iIntValue10 = num10 != null ? num10.intValue() : 0;
        Integer num11 = oit0Var.q;
        int iIntValue11 = num11 != null ? num11.intValue() : 0;
        Integer num12 = oit0Var.r;
        int iIntValue12 = num12 != null ? num12.intValue() : 0;
        Boolean bool2 = oit0Var.s;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = oit0Var.t;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        String str4 = oit0Var.u;
        String str5 = str4 == null ? "" : str4;
        Boolean bool4 = oit0Var.v;
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        Integer num13 = oit0Var.w;
        int iIntValue13 = num13 != null ? num13.intValue() : 0;
        Boolean bool5 = oit0Var.x;
        boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : false;
        Integer num14 = oit0Var.y;
        int iIntValue14 = num14 != null ? num14.intValue() : 0;
        String str6 = oit0Var.z;
        String str7 = str6 == null ? "" : str6;
        Double d2 = oit0Var.A;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Double d3 = oit0Var.B;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
        List list4 = oit0Var.C;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        List list5 = list4;
        Double d4 = oit0Var.D;
        double dDoubleValue4 = d4 != null ? d4.doubleValue() : 0.0d;
        Double d5 = oit0Var.E;
        double dDoubleValue5 = d5 != null ? d5.doubleValue() : 0.0d;
        List list6 = oit0Var.F;
        if (list6 != null) {
            arrayList2 = new ArrayList(r3d.q(list6, 10));
            Iterator it2 = list6.iterator();
            while (it2.hasNext()) {
                arrayList2.add(knx.S((nn7) it2.next()));
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        Boolean bool6 = oit0Var.G;
        boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : false;
        Boolean bool7 = oit0Var.H;
        boolean zBooleanValue7 = bool7 != null ? bool7.booleanValue() : false;
        Double d6 = oit0Var.I;
        double dDoubleValue6 = d6 != null ? d6.doubleValue() : 0.0d;
        String str8 = oit0Var.J;
        boolean z2 = zBooleanValue6;
        Double d7 = oit0Var.K;
        double dDoubleValue7 = d7 != null ? d7.doubleValue() : 0.0d;
        Boolean bool8 = oit0Var.L;
        boolean zBooleanValue8 = bool8 != null ? bool8.booleanValue() : false;
        Double d8 = oit0Var.O;
        double dDoubleValue8 = d8 != null ? d8.doubleValue() : 0.0d;
        List list7 = oit0Var.P;
        if (list7 != null) {
            arrayList3 = new ArrayList(r3d.q(list7, 10));
            Iterator it3 = list7.iterator();
            while (it3.hasNext()) {
                arrayList3.add(efx.P((hfc0) it3.next()));
            }
        } else {
            arrayList3 = iun.f15405a;
        }
        Integer num15 = oit0Var.Q;
        int iIntValue15 = num15 != null ? num15.intValue() : 0;
        Double d9 = oit0Var.S;
        double dDoubleValue9 = d9 != null ? d9.doubleValue() : 0.0d;
        Double d10 = oit0Var.R;
        double dDoubleValue10 = d10 != null ? d10.doubleValue() : 0.0d;
        String str9 = oit0Var.T;
        if (str9 == null) {
            str9 = "";
        }
        int i = iIntValue15;
        Boolean bool9 = oit0Var.U;
        boolean zBooleanValue9 = bool9 != null ? bool9.booleanValue() : false;
        ?? r60 = arrayList3;
        ozc ozcVarR = kkb.R(oit0Var.V, q4fVar);
        String str10 = oit0Var.M;
        String str11 = str10 == null ? "" : str10;
        List list8 = oit0Var.N;
        if (list8 == null) {
            list8 = iun.f15405a;
        }
        List list9 = list8;
        Integer num16 = oit0Var.W;
        int iIntValue16 = num16 != null ? num16.intValue() : 0;
        String str12 = oit0Var.X;
        String str13 = str12 == null ? "" : str12;
        Boolean bool10 = oit0Var.Y;
        boolean zBooleanValue10 = bool10 != null ? bool10.booleanValue() : false;
        Integer num17 = oit0Var.Z;
        int iIntValue17 = num17 != null ? num17.intValue() : 0;
        oxk0 oxk0VarL = p7x.L(oit0Var.b0);
        Double d11 = oit0Var.c0;
        double dDoubleValue11 = d11 != null ? d11.doubleValue() : 0.0d;
        String str14 = oit0Var.d0;
        String str15 = str14 == null ? "" : str14;
        Double d12 = oit0Var.e0;
        double dDoubleValue12 = d12 != null ? d12.doubleValue() : 0.0d;
        Boolean bool11 = oit0Var.f0;
        return new cit0(iIntValue, iIntValue2, iIntValue3, iIntValue4, arrayList, iIntValue5, iIntValue6, list3, str3, zBooleanValue, iIntValue7, iIntValue8, dDoubleValue, str2, iIntValue9, iIntValue10, iIntValue11, iIntValue12, zBooleanValue2, zBooleanValue3, str5, zBooleanValue4, iIntValue13, zBooleanValue5, false, iIntValue14, str7, dDoubleValue2, dDoubleValue3, list5, dDoubleValue4, dDoubleValue5, arrayList2, z2, zBooleanValue7, dDoubleValue6, str8, dDoubleValue7, zBooleanValue8, dDoubleValue8, r60, i, dDoubleValue10, dDoubleValue9, str9, zBooleanValue9, ozcVarR, str11, list9, iIntValue16, str13, zBooleanValue10, iIntValue17, oxk0VarL, dDoubleValue11, str15, dDoubleValue12, bool11 != null ? bool11.booleanValue() : false, null);
    }

    public static int o(int i, byte[] bArr, int i2, int i3, klw0 klw0Var, mdw0 mdw0Var) throws qkw0 {
        if ((i >>> 3) == 0) {
            throw qkw0.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iW = w(bArr, i2, mdw0Var);
            klw0Var.c(i, Long.valueOf(mdw0Var.b));
            return iW;
        }
        if (i4 == 1) {
            klw0Var.c(i, Long.valueOf(x(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iV = v(bArr, i2, mdw0Var);
            int i5 = mdw0Var.f21617a;
            if (i5 < 0) {
                throw qkw0.f();
            }
            if (i5 > bArr.length - iV) {
                throw qkw0.h();
            }
            if (i5 == 0) {
                klw0Var.c(i, sjw0.b);
            } else {
                klw0Var.c(i, sjw0.h(bArr, iV, i5));
            }
            return iV + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw qkw0.b();
            }
            klw0Var.c(i, Integer.valueOf(u(bArr, i2)));
            return i2 + 4;
        }
        klw0 klw0VarE = klw0.e();
        int i6 = (i & (-8)) | 4;
        int i7 = mdw0Var.d + 1;
        mdw0Var.d = i7;
        if (i7 >= 100) {
            throw new qkw0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iV2 = v(bArr, i2, mdw0Var);
            i8 = mdw0Var.f21617a;
            if (i8 == i6) {
                i2 = iV2;
                break;
            }
            i2 = o(i8, bArr, iV2, i3, klw0VarE, mdw0Var);
        }
        mdw0Var.d--;
        if (i2 > i3 || i8 != i6) {
            throw qkw0.g();
        }
        klw0Var.c(i, klw0VarE);
        return i2;
    }

    public static int p(int i, byte[] bArr, int i2, mdw0 mdw0Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            mdw0Var.f21617a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            mdw0Var.f21617a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            mdw0Var.f21617a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            mdw0Var.f21617a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                mdw0Var.f21617a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int q(Object obj, dlw0 dlw0Var, byte[] bArr, int i, int i2, int i3, mdw0 mdw0Var) throws qkw0 {
        vkw0 vkw0Var = (vkw0) dlw0Var;
        int i4 = mdw0Var.d + 1;
        mdw0Var.d = i4;
        if (i4 >= 100) {
            throw new qkw0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iL = vkw0Var.l(obj, bArr, i, i2, i3, mdw0Var);
        mdw0Var.d--;
        mdw0Var.c = obj;
        return iL;
    }

    public static int r(Object obj, dlw0 dlw0Var, byte[] bArr, int i, int i2, mdw0 mdw0Var) throws qkw0 {
        int iP = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iP = p(i3, bArr, iP, mdw0Var);
            i3 = mdw0Var.f21617a;
        }
        int i4 = iP;
        if (i3 < 0 || i3 > i2 - i4) {
            throw qkw0.h();
        }
        int i5 = mdw0Var.d + 1;
        mdw0Var.d = i5;
        if (i5 >= 100) {
            throw new qkw0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        dlw0Var.h(obj, bArr, i4, i6, mdw0Var);
        mdw0Var.d--;
        mdw0Var.c = obj;
        return i6;
    }

    public static int s(byte[] bArr, int i, mdw0 mdw0Var) throws qkw0 {
        int iV = v(bArr, i, mdw0Var);
        int i2 = mdw0Var.f21617a;
        if (i2 < 0) {
            throw qkw0.f();
        }
        if (i2 > bArr.length - iV) {
            throw qkw0.h();
        }
        if (i2 == 0) {
            mdw0Var.c = sjw0.b;
            return iV;
        }
        mdw0Var.c = sjw0.h(bArr, iV, i2);
        return iV + i2;
    }

    public static int t(dlw0 dlw0Var, int i, byte[] bArr, int i2, int i3, mkw0 mkw0Var, mdw0 mdw0Var) throws qkw0 {
        jkw0 jkw0VarZza = dlw0Var.zza();
        dlw0 dlw0Var2 = dlw0Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        mdw0 mdw0Var2 = mdw0Var;
        int iR = r(jkw0VarZza, dlw0Var2, bArr2, i2, i4, mdw0Var2);
        dlw0Var2.b(jkw0VarZza);
        mdw0Var2.c = jkw0VarZza;
        blw0 blw0Var = (blw0) mkw0Var;
        blw0Var.add(jkw0VarZza);
        while (iR < i4) {
            mdw0 mdw0Var3 = mdw0Var2;
            int i5 = i4;
            int iV = v(bArr2, iR, mdw0Var3);
            if (i != mdw0Var3.f21617a) {
                break;
            }
            byte[] bArr3 = bArr2;
            dlw0 dlw0Var3 = dlw0Var2;
            jkw0 jkw0VarZza2 = dlw0Var3.zza();
            iR = r(jkw0VarZza2, dlw0Var3, bArr3, iV, i5, mdw0Var3);
            dlw0Var2 = dlw0Var3;
            bArr2 = bArr3;
            i4 = i5;
            mdw0Var2 = mdw0Var3;
            dlw0Var2.b(jkw0VarZza2);
            mdw0Var2.c = jkw0VarZza2;
            blw0Var.add(jkw0VarZza2);
        }
        return iR;
    }

    public static int u(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int v(byte[] bArr, int i, mdw0 mdw0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return p(b, bArr, i2, mdw0Var);
        }
        mdw0Var.f21617a = b;
        return i2;
    }

    public static int w(byte[] bArr, int i, mdw0 mdw0Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            mdw0Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        mdw0Var.b = j2;
        return i3;
    }

    public static long x(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public abstract dcg0 n(gys0 gys0Var, aty atyVar);
}
