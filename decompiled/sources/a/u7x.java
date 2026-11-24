package a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.os.LocaleList;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u7x {
    public static final String A(vby vbyVar, ugi0 ugi0Var) {
        ugi0Var.getClass();
        vbyVar.getClass();
        for (Annotation annotation : ugi0Var.getAnnotations()) {
            if (annotation instanceof ccy) {
                return ((ccy) annotation).discriminator();
            }
        }
        return vbyVar.f37162a.f;
    }

    public static final void B(fhl fhlVar, float f, float f2, long j, vtm0 vtm0Var) {
        float f3 = vtm0Var.f38015a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - (2.0f * f3);
        fhl.V(fhlVar, j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0.0f, vtm0Var, 832);
    }

    public static m2c0 C() {
        return new m2c0("", "", "", 0, "", "", 0, 0.0d, 0.0d, "", jqt0.b, false, false, false, false, "", "", "", 0, "", "", "", "", "", "", "", false, false, "", "", "", 0, "", "", false, y0b.NO_CASHBACK, 0L, 0, 0, false, "", false, 0, false, 0L, "", "", "", "", "", "", "", false, false, "", "", cau0.b, "", "", "", 0, false, 0.0d, 0, false, false, false, false, false, "", false, false);
    }

    public static final long D(long j, boolean z, int i, float f) {
        int i2 = ((z || i == 2 || i == 4 || i == 5) && p4e.e(j)) ? p4e.i(j) : Integer.MAX_VALUE;
        if (p4e.k(j) != i2) {
            i2 = l1e0.d(jtm0.j(f), p4e.k(j), i2);
        }
        return lgb.O(0, i2, 0, p4e.h(j));
    }

    public static void E(float f, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void F(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static final dzg0 G(fet fetVar) {
        czg0 czg0VarC = r7x.C(fetVar);
        boolean zG = fetVar.g(czg0VarC);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new dzg0(new gwg0((Object) czg0VarC, (byte) 2), new ugd(-1320822745, true, new rqc0(czg0VarC, (byte) 4)));
            fetVar.o0(objP);
        }
        return (dzg0) objP;
    }

    public static final void H(zdg0 zdg0Var) {
        if (((AtomicBoolean) zdg0Var.e.d).get()) {
            jf4.n("Database is closed");
        }
    }

    public static final String I(mv70 mv70Var) {
        String str = mv70Var.f22444a;
        return kng0.k("://open/games?", str != null ? "id=".concat(str) : null);
    }

    public static final y85 J(r95 r95Var) {
        Integer num = r95Var.f30061a;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        String str = r95Var.b;
        if (str == null) {
            jf4.k(null);
            return null;
        }
        String str2 = r95Var.c;
        if (str2 != null) {
            return new y85(iIntValue, str, str2);
        }
        jf4.k(null);
        return null;
    }

    public static final d6e0 K(k6e0 k6e0Var) {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        String strValueOf4;
        String strValueOf5;
        String strValueOf6;
        k6e0Var.getClass();
        Integer num = k6e0Var.f17765a;
        String str = k6e0Var.c;
        String str2 = "-";
        if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
            strValueOf = "-";
        }
        Integer num2 = k6e0Var.b;
        if (num2 == null || (strValueOf2 = String.valueOf(num2.intValue())) == null) {
            strValueOf2 = "-";
        }
        if (str == null || str.length() == 0) {
            str = "-";
        }
        Integer num3 = k6e0Var.d;
        if (num3 == null || (strValueOf3 = String.valueOf(num3.intValue())) == null) {
            strValueOf3 = "-";
        }
        Integer num4 = k6e0Var.e;
        if (num4 == null || (strValueOf4 = String.valueOf(num4.intValue())) == null) {
            strValueOf4 = "-";
        }
        Integer num5 = k6e0Var.f;
        if (num5 == null || (strValueOf5 = String.valueOf(num5.intValue())) == null) {
            strValueOf5 = "-";
        }
        Integer num6 = k6e0Var.g;
        if (num6 != null && (strValueOf6 = String.valueOf(num6.intValue())) != null) {
            str2 = strValueOf6;
        }
        Boolean bool = k6e0Var.h;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = k6e0Var.i;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = k6e0Var.j;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = k6e0Var.k;
        return new d6e0(strValueOf, strValueOf2, str, strValueOf3, strValueOf4, strValueOf5, str2, zBooleanValue, zBooleanValue2, zBooleanValue3, bool4 != null ? bool4.booleanValue() : false);
    }

    public static final void L(Map map, List list, Function2 function2, Function1 function1, Function2 function3) {
        boolean[] zArr = new boolean[list.size()];
        for (Map.Entry entry : map.entrySet()) {
            Object obj = (sgy) entry.getKey();
            for (sgy sgyVar : (List) entry.getValue()) {
                int size = list.size() - 1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                while (true) {
                    int i = size - 1;
                    if (sgyVar.r(list.get(size))) {
                        zArr[size] = true;
                        break;
                    } else {
                        if (i < 0) {
                            size = -1;
                            break;
                        }
                        size = i;
                    }
                }
                if (size < 0) {
                    c99.s(function2.invoke(sgyVar, obj));
                    return;
                }
                function3.invoke(sgyVar, list.get(size));
            }
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            if (!zArr[size2]) {
                jf4.o((String) function1.invoke(list.get(size2)));
                return;
            } else if (i2 < 0) {
                return;
            } else {
                size2 = i2;
            }
        }
    }

    public static final void a(final mm40 mm40Var, final a4x a4xVar, final ngv ngvVar, final p0s p0sVar, d9z d9zVar, final hh80 hh80Var, final ow3 ow3Var, final sw3 sw3Var, qkq qkqVar, final boolean z, vf80 vf80Var, final ugd ugdVar, fet fetVar, final int i, final int i2) {
        int i3;
        hh80 hh80Var2;
        int i4;
        final d9z d9zVar2;
        final qkq qkqVar2;
        final vf80 vf80Var2;
        d9z d9zVarA;
        int i5;
        int i6;
        vf80 vf80VarB;
        qkq qkqVar3;
        a4xVar.getClass();
        fetVar.g0(-251556683);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(ngvVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.g(p0sVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            hh80Var2 = hh80Var;
            i3 |= fetVar.g(hh80Var2) ? 131072 : 65536;
        } else {
            hh80Var2 = hh80Var;
        }
        int i7 = i3 | 1572864;
        if ((i & 12582912) == 0) {
            i7 |= fetVar.g(ow3Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i7 |= fetVar.g(sw3Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i7 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (fetVar.h(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        int i8 = i4;
        if (fetVar.U(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 147) == 146) ? false : true)) {
            fetVar.Z();
            int i9 = i & 1;
            Object obj = ukd.f35823a;
            if (i9 == 0 || fetVar.B()) {
                d9zVarA = f9z.a(fetVar);
                sjj sjjVarA = wzk0.a(fetVar);
                boolean zG = fetVar.g(sjjVarA);
                Object objP = fetVar.P();
                if (zG || objP == obj) {
                    objP = new iuj(sjjVarA);
                    fetVar.o0(objP);
                }
                i5 = i7 & (-1879105537);
                i6 = i8 & (-113);
                vf80VarB = xf80.b(fetVar);
                qkqVar3 = (iuj) objP;
            } else {
                fetVar.X();
                i5 = i7 & (-1879105537);
                vf80VarB = vf80Var;
                i6 = i8 & (-113);
                d9zVarA = d9zVar;
                qkqVar3 = qkqVar;
            }
            fetVar.s();
            boolean zE = fetVar.e(a4xVar.size()) | ((i5 & 7168) == 2048);
            Object objP2 = fetVar.P();
            if (zE || objP2 == obj) {
                objP2 = Integer.valueOf(kbc.f0(a4xVar.size(), p0sVar));
                fetVar.o0(objP2);
            }
            int iIntValue = ((Number) objP2).intValue();
            boolean zE2 = fetVar.e(iIntValue) | ((i5 & 112) == 32 || ((i5 & 64) != 0 && fetVar.i(a4xVar))) | ((i6 & 896) == 256);
            Object objP3 = fetVar.P();
            if (zE2 || objP3 == obj) {
                objP3 = new s7x((byte) 0, iIntValue, ugdVar, a4xVar);
                fetVar.o0(objP3);
            }
            int i10 = i5 >> 6;
            d9z d9zVar3 = d9zVarA;
            g8x.h(ngvVar, mm40Var, d9zVar3, hh80Var2, ow3Var, sw3Var, qkqVar3, z, vf80VarB, (Function1) objP3, fetVar, (i10 & 3670016) | (i10 & 14) | ((i5 << 3) & 112) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | ((i6 << 24) & 234881024), 0, 0);
            d9zVar2 = d9zVar3;
            qkqVar2 = qkqVar3;
            vf80Var2 = vf80VarB;
        } else {
            fetVar.X();
            d9zVar2 = d9zVar;
            qkqVar2 = qkqVar;
            vf80Var2 = vf80Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.t7x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = x8x.L(i | 1);
                    int iL2 = x8x.L(i2);
                    u7x.a(mm40Var, a4xVar, ngvVar, p0sVar, d9zVar2, hh80Var, ow3Var, sw3Var, qkqVar2, z, vf80Var2, ugdVar, (fet) obj2, iL, iL2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(int i, fet fetVar, boolean z) {
        fetVar.g0(-199046803);
        int i2 = (fetVar.h(z) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, z ? 36.0f : 24.0f, 7), 1.0f);
            nrq nrqVar = g1t0.m().f42262a.f;
            long j = g1t0.m().f42262a.b;
            String strW = rsm0.w(R.string.match_progress_tie_break_title, 0, fetVar);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(strW, mm40VarD, s6t0.b().f33626a.getPrimary(), null, j, null, null, nrqVar, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new obg((byte) 14, i, z);
        }
    }

    public static final long c(int i) {
        long j = ((long) i) << 32;
        int i2 = qjy.O;
        return j;
    }

    public static final void d(sy6 sy6Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, int i) {
        int i2;
        ugd ugdVarM;
        ugd ugdVarM2;
        sy6Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar.g0(-1004165945);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(sy6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function3) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            String str = sy6Var.b;
            kf9 kf9Var = sy6Var.c;
            fo8 fo8Var = sy6Var.d;
            ugd ugdVarM3 = null;
            if (str == null) {
                fetVar.e0(-659900665);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(-659869479);
                ugdVarM = u1c.M(1899693867, new ngz(str, function3, (byte) 11), fetVar);
                fetVar.r(false);
            }
            if (kf9Var == null) {
                fetVar.e0(-659585209);
                fetVar.r(false);
                ugdVarM2 = null;
            } else {
                fetVar.e0(-659551109);
                ugdVarM2 = u1c.M(1332213632, new eyn(kf9Var, function0, function1, (byte) 20), fetVar);
                fetVar.r(false);
            }
            if (fo8Var == null) {
                fetVar.e0(-659178489);
            } else {
                fetVar.e0(-659145753);
                ugdVarM3 = u1c.M(-1080569396, new ngz(fo8Var, function2, (byte) 12), fetVar);
            }
            fetVar.r(false);
            hew0.b((i2 & 14) | 48, u1c.M(-1566425959, new ngz(sy6Var, ugdVarM, (byte) 13), fetVar), ugdVarM2, ugdVarM3, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp(sy6Var, function0, function1, function2, function3, i);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        str.getClass();
        fetVar.g0(1376658885);
        int i2 = (fetVar.g(str) ? 32 : 16) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            v8q0.a(str2, mm40Var, 0L, new n05(idm0.t(10), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, null, 0L, 2, false, 5, 0, null, ibm0.s(new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), fetVar), fetVar, ((i2 >> 3) & 14) | 48, 24960, 110580);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i, (byte) 28);
        }
    }

    public static final void f(mm40 mm40Var, xcz xczVar, or90 or90Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        xczVar.getClass();
        or90Var.getClass();
        function1.getClass();
        fetVar.g0(954204290);
        int i2 = i | 6 | (fetVar.g(xczVar) ? 32 : 16) | (fetVar.g(or90Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = or90Var instanceof mr90;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-2132670545);
                n7x.d(xczVar, (mr90) or90Var, function1, fetVar, i2 & 8190);
                fetVar.r(false);
            } else {
                if (!(or90Var instanceof nr90)) {
                    throw b1j.f(-2132672561, fetVar, false);
                }
                fetVar.e0(-2132663267);
                zcl zclVar = qmk.f28987a;
                p7x.e(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), (nr90) or90Var, fetVar, (i2 >> 3) & 112);
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 29, i, (Object) mm40Var2, (Object) xczVar, (Object) or90Var, (Object) function1);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, boolean z, boolean z2) {
        mm40 mm40Var2;
        fetVar.g0(553406877);
        int i2 = i | 6 | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128);
        int iB = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            int i3 = z ? 4 : 6;
            zcl zclVar = qmk.f28987a;
            float f = z ? 156.0f : 116.0f;
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            mm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(mm40Var2, f2, 12.0f, f3, 0.0f, 8);
            x5d x5dVarA = w5d.a(new qw3(10.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            if (z2) {
                fetVar.e0(-1941387539);
                mm40 mm40VarE = o7k0.e(o7k0.d(mm40Var2, 1.0f), 48.0f);
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0, fetVar, 0, false);
            } else {
                fetVar.e0(-1941128069);
                fetVar.r(false);
            }
            fetVar.e0(1599951545);
            while (iB < i3) {
                mm40 mm40VarG = o7k0.g(o7k0.d(mm40Var2, 1.0f), f, 0.0f, 2);
                zcl zclVar3 = qmk.i;
                ugg0 ugg0Var2 = vgg0.f37379a;
                iB = h97.b(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarG), fqj0VarD0, fetVar, 0, iB, 1);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z360(mm40Var2, z, z2, i);
        }
    }

    public static final void h(mm40 mm40Var, wl90 wl90Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        wl90Var.getClass();
        function1.getClass();
        fetVar.g0(-785928515);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(wl90Var) ? 32 : 16) | (fetVar.g(cqqVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            obc.d(h36.f12370a.a(cqqVar), u1c.M(1932456445, new o090((byte) 6, mm40Var, (p6t0) wl90Var, function1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 20, i, (Object) mm40Var, (Object) wl90Var, (Object) cqqVar, (Object) function1);
        }
    }

    public static final void i(mm40 mm40Var, String str, y9q0 y9q0Var, fet fetVar, int i) {
        str.getClass();
        fetVar.g0(817245564);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(y9q0Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            v8q0.a(str, s5x0.N(mm40Var, 0.0f, 8.0f, 8.0f, 8.0f, 1), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, y9q0Var, fetVar, (i2 >> 3) & 14, ((i2 << 15) & 29360128) | 24960, 110584);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var, str, y9q0Var, i, (byte) 12);
        }
    }

    public static final void j(mm40 mm40Var, ArrayList arrayList, Function2 function2, fet fetVar, int i) {
        function2.getClass();
        fetVar.g0(-1642179929);
        int i2 = i | (fetVar.g(arrayList) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            boolean z = false;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            ch80 ch80VarF = h97.f(xfn.a(fetVar).d, 4.0f, xfn.a(fetVar).d, 32.0f, fetVar);
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 896) == 256) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new xho(arrayList, function2, b);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, ch80VarF, qw3Var, null, null, false, null, (Function1) objP, fetVar, 6, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new er50(mm40Var, arrayList, function2, i, (byte) 1);
        }
    }

    public static final void k(final mm40 mm40Var, final l7m0 l7m0Var, final vhv0 vhv0Var, final long j, final long j2, final ugd ugdVar, final ugd ugdVar2, final Function2 function2, fet fetVar, final int i) {
        int i2;
        Object obj;
        fetVar.g0(1122635906);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(vhv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(ugdVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            obj = function2;
            i2 |= fetVar.i(obj) ? 8388608 : 4194304;
        } else {
            obj = function2;
        }
        if (fetVar.U(i2 & 1, (i2 & 4793491) != 4793490)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            int i3 = (i2 & 896) ^ 384;
            boolean z = (i3 > 256 && fetVar.g(vhv0Var)) || (i2 & 384) == 256;
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (z || objP == obj2) {
                objP = androidx.compose.runtime.e.e(vhv0Var);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            boolean zG = fetVar.g(pz40Var) | ((i3 > 256 && fetVar.g(vhv0Var)) || (i2 & 384) == 256);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj2) {
                objP2 = new tv2(pz40Var, vhv0Var, (byte) 2);
                fetVar.o0(objP2);
            }
            int i4 = i2 >> 3;
            gmn0.a(j120.a0(mm40Var, (Function1) objP2), null, j, j2, 0.0f, 0.0f, null, u1c.M(-533884003, new ajw((Object) l7m0Var, (Object) pz40Var, (Object) ugdVar, (Object) ugdVar2, obj, (byte) 23), fetVar), fetVar, (i4 & 896) | 12582912 | (i4 & 7168), 114);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.kaf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    u7x.k(mm40Var, l7m0Var, vhv0Var, j, j2, ugdVar, ugdVar2, function2, (fet) obj3, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void l(l7m0 l7m0Var, l7m0 l7m0Var2, ugd ugdVar, ugd ugdVar2, Function2 function2, fet fetVar, int i) {
        fetVar.g0(-353908775);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(l7m0Var2) ? 32 : 16) | (fetVar.i(ugdVar) ? 256 : 128) | (fetVar.i(ugdVar2) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            WeakHashMap weakHashMap = djv0.w;
            int iF = h8x.F((tly) l7m0Var.getValue(), zcm0.i(fetVar).e.e().d);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new maf0();
                fetVar.o0(objP);
            }
            maf0 maf0Var = (maf0) objP;
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new ugd(1155600918, true, new w(ugdVar, (byte) 28));
                fetVar.o0(objP2);
            }
            Function2 function3 = (Function2) objP2;
            boolean z2 = (i2 & 7168) == 2048;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                objP3 = new ugd(-1592059943, true, new j5d0(ugdVar2, maf0Var));
                fetVar.o0(objP3);
            }
            Function2 function4 = (Function2) objP3;
            boolean z3 = (57344 & i2) == 16384;
            Object objP4 = fetVar.P();
            if (z3 || objP4 == obj) {
                objP4 = new ugd(968623182, true, new qyl(function2, (byte) 3));
                fetVar.o0(objP4);
            }
            Function2 function5 = (Function2) objP4;
            boolean zG = ((i2 & 112) == 32) | fetVar.g(function3) | fetVar.g(function5) | fetVar.e(iF) | fetVar.g(function4);
            Object objP5 = fetVar.P();
            if (zG || objP5 == obj) {
                Object wjpVar = new wjp(function3, function5, l7m0Var2, iF, maf0Var, function4);
                fetVar.o0(wjpVar);
                objP5 = wjpVar;
            }
            x4n0.a(null, (Function2) objP5, fetVar, 0, 1);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw((Object) l7m0Var, (Object) l7m0Var2, (Object) ugdVar, (Object) ugdVar2, (Object) function2, i, (byte) 24);
        }
    }

    public static final void m(final mm40 mm40Var, final bbn bbnVar, final float f, final ezj ezjVar, final gy40 gy40Var, final Function2 function2, final Function0 function0, final Function0 function1, final Function0 function3, fet fetVar, final int i) {
        int i2;
        ezjVar.getClass();
        gy40Var.getClass();
        fetVar.g0(-866497077);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bbnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? fetVar.g(ezjVar) : fetVar.i(ezjVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(gy40Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(function3) ? 67108864 : 33554432;
        }
        if (!fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            fetVar.X();
        } else if (bbnVar instanceof zan) {
            fetVar.e0(-1060397887);
            int i3 = i2;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zan zanVar = (zan) bbnVar;
            i4 i4Var = zanVar.f44078a;
            String str = zanVar.b;
            if (str == null) {
                str = "";
            }
            n(mm40VarD, i4Var, new hjm(str, null, null, null, null, null, false, zanVar.c, vro0.f37910a, false, zanVar.d, null, 2614), f, ezjVar, gy40Var, function2, function0, function1, function3, fetVar, 2147482624 & (i3 << 3));
            fetVar.r(false);
        } else {
            if (!bbnVar.equals(abn.f587a)) {
                throw b1j.f(519980661, fetVar, false);
            }
            fetVar.e0(-1059360844);
            p(0, fetVar, o7k0.d(mm40Var, 1.0f));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.fnh0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u7x.m(mm40Var, bbnVar, f, ezjVar, gy40Var, function2, function0, function1, function3, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void n(mm40 mm40Var, i4 i4Var, hjm hjmVar, float f, ezj ezjVar, gy40 gy40Var, Function2 function2, Function0 function0, Function0 function1, Function0 function3, fet fetVar, int i) {
        int i2;
        Function0 function4;
        Function0 function5;
        Function0 function6;
        fet fetVar2 = fetVar;
        fetVar2.g0(1494310134);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(i4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(hjmVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? fetVar2.g(ezjVar) : fetVar2.i(ezjVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.g(gy40Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.i(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            function4 = function0;
            i2 |= fetVar2.i(function4) ? 8388608 : 4194304;
        } else {
            function4 = function0;
        }
        if ((100663296 & i) == 0) {
            function5 = function1;
            i2 |= fetVar2.i(function5) ? 67108864 : 33554432;
        } else {
            function5 = function1;
        }
        if ((805306368 & i) == 0) {
            function6 = function3;
            i2 |= fetVar2.i(function6) ? 536870912 : 268435456;
        } else {
            function6 = function3;
        }
        if (fetVar2.U(i2 & 1, (306783379 & i2) != 306783378)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int i3 = i2;
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            fetVar2.e0(2136679440);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            int i4 = i3 >> 12;
            nkb.h(s5x0.L(jm40Var, 8.0f, 0.0f, 2), hjmVar, kjm.f18392a, function4, function5, function6, fetVar2, ((i3 >> 3) & 112) | 384 | (i4 & 7168) | (i4 & 57344) | (i4 & 458752), 0);
            fetVar2 = fetVar2;
            fetVar2.r(false);
            mm40 mm40VarQ = i120.Q(lgb.J(o7k0.d(jm40Var, 1.0f), enh0.b), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            int i5 = i3 >> 3;
            v3c.r(s5x0.L(jm40Var, 0.0f, 8.0f, 1), new cjm(i4Var, xim.b), f, gy40Var, ezjVar, function2, fetVar2, (i5 & 896) | ((i3 >> 6) & 7168) | (i3 & 57344) | (i5 & 458752), 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ymh0(mm40Var, i4Var, hjmVar, f, ezjVar, gy40Var, function2, function0, function1, function3, i, (byte) 1);
        }
    }

    public static final void o(Function1 function1, nzi0 nzi0Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        function1.getClass();
        nzi0Var.getClass();
        fetVar.g0(-1553664223);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(nzi0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            boolean z = (i3 == 4) | (i4 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new x6h0(function1, nzi0Var, (byte) 15);
                fetVar.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40Var, false, null, null, (Function0) objP, 15);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
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
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = mzi0.f22658a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new wvi0((byte) 8);
                fetVar.o0(objP3);
            }
            Function1 function2 = (Function1) objP3;
            boolean z2 = (i4 == 32) | (i3 == 4);
            Object objP4 = fetVar.P();
            if (z2 || objP4 == cl5Var) {
                objP4 = new lzi0(nzi0Var, function1, b);
                fetVar.o0(objP4);
            }
            y860.g(xdrVar, null, function2, null, (Function1) objP4, fetVar, 390, 10);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) function1, (Object) nzi0Var, mm40Var, i, (byte) 8);
        }
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-973357269);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
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
            nkb.h(s5x0.L(jm40Var, 8.0f, 0.0f, 2), new ijm(new qjm()), kjm.f18392a, null, null, null, fetVar, 384, 56);
            dw9.x(lgb.J(o7k0.d(o7k0.e(jm40Var, enh0.f8094a), 1.0f), enh0.b), vbc.d0(vqm.f37862a, fetVar, 6, 0), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, (byte) 26);
        }
    }

    public static final void q(mm40 mm40Var, n0x n0xVar, float f, y3d y3dVar, y3d y3dVar2, m0x m0xVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        n0xVar.getClass();
        Object obj = n0xVar.f22722a;
        fetVar.g0(1743559366);
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
            i3 |= fetVar.g(n0xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.g(y3dVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.g(y3dVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar.g(m0xVar) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            mm40 mm40Var4 = i4 != 0 ? jm40.b : mm40Var2;
            long secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
            long j = y3dVar2 != null ? y3dVar2.f41946a : secondary;
            pm80 pm80VarF = a8k0.F(m0xVar != null ? m0xVar.f20977a : R.drawable.ic_glyph_category_new, 0, fetVar);
            boolean zG = fetVar.g(pm80VarF) | fetVar.f(j);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            Object m78Var = null;
            if (zG || objP == obj2) {
                objP = ju70.T(pm80VarF, new m78(j, 5), null, 10);
                fetVar.o0(objP);
            }
            pm80 pm80Var = (pm80) objP;
            Context context = (Context) fetVar.k(dy2.b);
            int iRound = Math.round(pkd.b(f, fetVar));
            boolean zG2 = fetVar.g(obj) | fetVar.e(iRound);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj2) {
                k1x k1xVar = new k1x(context);
                k1xVar.c = obj;
                k1xVar.c(iRound);
                objP2 = k1xVar.a();
                fetVar.o0(objP2);
            }
            o1x o1xVar = (o1x) objP2;
            boolean z = (i3 & 7168) == 2048;
            Object objP3 = fetVar.P();
            if (z || objP3 == obj2) {
                if (!(y3dVar == null ? false : h2t0.a(y3dVar.f41946a, y3d.g))) {
                    m78Var = y3dVar == null ? new m78(secondary, 5) : new m78(y3dVar.f41946a, 5);
                }
                fetVar.o0(m78Var);
                objP3 = m78Var;
            }
            mm40Var3 = mm40Var4;
            k7x.b(o1xVar, null, o7k0.n(mm40Var4, f), pm80Var, pm80Var, null, null, null, null, null, null, (a4d) objP3, fetVar, 36912, 0, 28640);
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn2(mm40Var3, n0xVar, f, y3dVar, y3dVar2, m0xVar, i, i2);
        }
    }

    public static final void r(mm40 mm40Var, final long j, final float f, final long j2, fet fetVar, int i) {
        fet fetVar2;
        Float fValueOf = Float.valueOf(540.0f);
        fetVar.g0(-338686355);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.f(j) ? 32 : 16) | (fetVar.d(f) ? 256 : 128) | (fetVar.f(j2) ? 2048 : 1024) | (fetVar.e(2) ? 16384 : 8192) | (fetVar.d(4.0f) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            final vtm0 vtm0Var = new vtm0(((w6k) fetVar.k(bmd.h)).w0(f), 0.0f, 2, 0, null, 26);
            z7x z7xVarV = b8k0.V(null, fetVar, 1);
            imy imyVar = new imy();
            imyVar.f15048a = 2500;
            hmy hmyVarA = imyVar.a(Math.round(imyVar.f15048a * 0.5f), Float.valueOf(0.0f));
            z73 z73Var = ihn.d;
            hmyVarA.b = z73Var;
            imyVar.a(2500, fValueOf).b = z73Var;
            final x7x x7xVarR = b8k0.r(z7xVarV, 0.0f, 1080.0f, ro4.b0(new jmy(imyVar), null, 0L, 6), null, fetVar, 4536, 8);
            imy imyVar2 = new imy();
            imyVar2.f15048a = 2500;
            imyVar2.a(Math.round(2500 * 1.0f), fValueOf).b = z73Var;
            final x7x x7xVarR2 = b8k0.r(z7xVarV, 0.0f, 1080.0f, ro4.b0(new jmy(imyVar2), null, 0L, 6), null, fetVar, 4536, 8);
            imy imyVar3 = new imy();
            imyVar3.f15048a = 2500;
            imyVar3.a(1250, Float.valueOf(0.8f)).b = z73Var;
            imyVar3.a(2500, Float.valueOf(0.05f)).b = ihn.f14788a;
            final x7x x7xVarR3 = b8k0.r(z7xVarV, 0.05f, 0.8f, ro4.b0(new jmy(imyVar3), null, 0L, 6), null, fetVar, 4536, 8);
            fetVar2 = fetVar;
            mm40 mm40VarA = pai0.a(mm40Var, true, new wyb0((byte) 6));
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40VarA, 40.0f);
            boolean zG = fetVar2.g(x7xVarR3) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((i2 & 896) == 256) | fetVar2.g(x7xVarR) | fetVar2.g(x7xVarR2) | ((i2 & 7168) == 2048) | fetVar2.i(vtm0Var) | ((i2 & 112) == 32);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                objP = new Function1() { // from class: a.qzk0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j3 = j2;
                        vtm0 vtm0Var2 = vtm0Var;
                        long j4 = j;
                        fhl fhlVar = (fhl) obj;
                        fhlVar.getClass();
                        float fFloatValue = ((Number) x7xVarR3.getValue()).floatValue() * 360.0f;
                        float fS0 = ((Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) <= Float.intBitsToFloat((int) (fhlVar.d() >> 32)) ? 4.0f + f : 4.0f) / ((float) (((double) fhlVar.s0(Float.intBitsToFloat((int) (fhlVar.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) x7xVarR2.getValue()).floatValue() + ((Number) x7xVarR.getValue()).floatValue();
                        long jE0 = fhlVar.E0();
                        nr nrVarA0 = fhlVar.A0();
                        long jP = nrVarA0.p();
                        nrVarA0.i().l();
                        try {
                            ((fvt0) nrVarA0.b).y(fFloatValue2, jE0);
                            u7x.B(fhlVar, Math.min(fFloatValue, fS0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fS0) * 2.0f), j3, vtm0Var2);
                            u7x.B(fhlVar, 0.0f, fFloatValue, j4, vtm0Var2);
                            return Unit.f46060a;
                        } finally {
                            defpackage.c.g(nrVarA0, jP);
                        }
                    }
                };
                fetVar2.o0(objP);
            }
            p8a.k(mm40VarN, (Function1) objP, fetVar2, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hlw(mm40Var, j, f, j2, i);
        }
    }

    public static final void s(mm40 mm40Var, oer0 oer0Var, xcz xczVar, qw3 qw3Var, lh80 lh80Var, Function1 function1, fet fetVar, int i) {
        oer0Var.getClass();
        function1.getClass();
        fetVar.g0(1151236935);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(oer0Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.g(qw3Var) ? 2048 : 1024) | (fetVar.g(lh80Var) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            mm40 mm40VarS = o7k0.s(jm40.b, ((ycl) fetVar.k(wdr0.f38987a)).f42389a);
            mm40 mm40VarE0 = o2e.e0(mm40Var, "SPORTS_GAME_LIVE_LAZY_ROW");
            boolean z = !oer0Var.b;
            boolean zG = ((i2 & 112) == 32) | fetVar.g(mm40VarS) | ((458752 & i2) == 131072);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new nej0((Object) oer0Var, (Object) mm40VarS, (Object) function1, (byte) 9);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE0, xczVar, lh80Var, false, qw3Var, null, null, z, null, (Function1) objP, fetVar, ((i2 >> 3) & 112) | ((i2 >> 6) & 896) | ((i2 << 3) & 57344), 360);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vdl0(mm40Var, oer0Var, xczVar, qw3Var, lh80Var, function1, i, (byte) 1);
        }
    }

    public static final void t(j3m0 j3m0Var, fet fetVar, int i) {
        mm40 mm40VarE0;
        fetVar.g0(707084969);
        int i2 = (i & 6) == 0 ? (fetVar.g(j3m0Var) ? 4 : 2) | i : i;
        byte b = 14;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            context.getClass();
            boolean z = context.getResources().getBoolean(R.bool.isTablet);
            jm40 jm40Var = jm40.b;
            if (z) {
                mm40VarE0 = ny9.O(1.7647059f, jm40Var, false);
            } else {
                zcl zclVar = qmk.f28987a;
                mm40VarE0 = o2e.e0(o7k0.e(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 200.0f), "LOL_STAGE");
            }
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarO = ny9.O(1.0f, jm40Var, false);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarO, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f);
            b110 b110Var = j3m0Var.f15842a;
            List list = j3m0Var.b;
            r3m0.h(mm40VarJ, b110Var, fetVar, 0);
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4(b)), gqw0.n, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
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
            fetVar.e0(-627130685);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                r7x.p((hin0) list.get(i3), dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true), fetVar, 0);
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(j3m0Var, i, b);
        }
    }

    public static final void u(Context context, Locale locale) {
        locale.getClass();
        x(context, locale);
        Context applicationContext = context.getApplicationContext();
        if (Intrinsics.d(applicationContext, context)) {
            return;
        }
        applicationContext.getClass();
        x(applicationContext, locale);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:7:0x0015, please report this as an issue */
    public static final c78 v(Drawable drawable) {
        int intrinsicWidth;
        Integer numValueOf;
        int iIntValue;
        Bitmap bitmap;
        drawable.getClass();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                bitmap = bitmapDrawable.getBitmap();
            } else {
                intrinsicWidth = drawable.getIntrinsicWidth();
                numValueOf = Integer.valueOf(intrinsicWidth);
                if (intrinsicWidth <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 1;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Integer numValueOf2 = intrinsicHeight > 0 ? Integer.valueOf(intrinsicHeight) : null;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, numValueOf2 != null ? numValueOf2.intValue() : 1, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                bitmap = bitmapCreateBitmap;
            }
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
            numValueOf = Integer.valueOf(intrinsicWidth);
            if (intrinsicWidth <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 1;
            }
            int intrinsicHeight2 = drawable.getIntrinsicHeight();
            if (intrinsicHeight2 > 0) {
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iIntValue, numValueOf2 != null ? numValueOf2.intValue() : 1, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap2.getClass();
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
            drawable.draw(canvas2);
            bitmap = bitmapCreateBitmap2;
        }
        bitmap.getClass();
        return new c78(new vz2(bitmap));
    }

    public static final float w(String str) {
        String strR = kotlin.text.c.r(str, Separators.PERCENT, "", false);
        if (StringsKt.O(strR, Separators.COLON, false)) {
            Float fJ = kotlin.text.b.j((String) CollectionsKt.U(StringsKt__StringsKt.split$default(strR, new String[]{Separators.COLON}, false, 0, 6, null)));
            if (fJ != null) {
                return fJ.floatValue();
            }
            return 0.0f;
        }
        Float fJ2 = kotlin.text.b.j(strR);
        if (fJ2 != null) {
            return fJ2.floatValue();
        }
        return 0.0f;
    }

    public static final void x(Context context, Locale locale) {
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocales(new LocaleList(locale));
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public static final void y(vby vbyVar, jiy jiyVar, jiy jiyVar2, String str) {
        ugi0 descriptor = jiyVar2.getDescriptor();
        descriptor.getClass();
        vbyVar.getClass();
        ady.d(vbyVar, descriptor);
        if (j2e.J(descriptor).contains(str)) {
            String strH = jiyVar.getDescriptor().h();
            String strH2 = jiyVar2.getDescriptor().h();
            throw new tcy(axq.n(b1j.n("Class '", strH2, "' cannot be serialized ", (vbyVar.f37162a.h == olc.b && Intrinsics.d(strH, strH2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : hne.l('\'', "as base class '", strH), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }

    public static final void z(c3x c3xVar) {
        c3xVar.getClass();
        if (c3xVar instanceof zgi0) {
            jf4.n("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (c3xVar instanceof zvb0) {
            jf4.n("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (c3xVar instanceof tua0) {
            jf4.n("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }
}
