package a;

import android.content.Context;
import android.content.ContextWrapper;
import android.gov.nist.core.Separators;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.javax.sip.message.Response;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import android.widget.ImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hxm0 {
    public static final cqr A(bqr bqrVar, boolean z) {
        bqrVar.getClass();
        StringBuilder sb = new StringBuilder(ujn.h);
        String str = bqrVar.c;
        str.getClass();
        if (str.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
            sb.setLength(0);
            sb.append(str);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str, '/'));
        }
        return new cqr(sb.toString(), R.color.uikit_cyber_gray_ton_6, z);
    }

    public static final void B(ImageView imageView) {
        imageView.getClass();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public static final lev0 C(nev0 nev0Var, String str, ctf0 ctf0Var, boolean z, boolean z2) {
        nev0Var.getClass();
        ctf0Var.getClass();
        nev0.b.getClass();
        return new lev0(nev0Var.f23406a, s(nev0Var), t(nev0Var, ctf0Var, str), z2, z);
    }

    public static final oww0 D(tww0 tww0Var) throws aww0 {
        try {
            qbu0 qbu0VarE = tww0Var.e();
            if (qbu0VarE == null) {
                throw new aww0("Parser being asked to parse an empty input stream");
            }
            try {
                byte b = qbu0VarE.b;
                byte b2 = qbu0VarE.f28456a;
                int i = 0;
                if (b2 == -128) {
                    long jA = tww0Var.a();
                    if (jA > 1000) {
                        throw new aww0("Parser being asked to read a large CBOR array");
                    }
                    E(b, jA);
                    oww0[] oww0VarArr = new oww0[(int) jA];
                    while (i < jA) {
                        oww0VarArr[i] = D(tww0Var);
                        i++;
                    }
                    return new uvw0(cow0.r(oww0VarArr));
                }
                try {
                    if (b2 != -96) {
                        if (b2 == -64) {
                            throw new aww0("Tags are currently unsupported");
                        }
                        if (b2 == -32) {
                            return new xvw0(tww0Var.k());
                        }
                        if (b2 == 0 || b2 == 32) {
                            long jC = tww0Var.c();
                            E(b, jC > 0 ? jC : ~jC);
                            return new dww0(jC);
                        }
                        if (b2 == 64) {
                            tww0Var.q((byte) 64);
                            byte[] bArrV = tww0Var.v();
                            int length = bArrV.length;
                            E(b, length);
                            return new yvw0(vuw0.k(bArrV, length));
                        }
                        if (b2 != 96) {
                            throw new aww0("Unidentifiable major type: " + ((b2 >> 5) & 7));
                        }
                        tww0Var.q((byte) 96);
                        String str = new String(tww0Var.v(), StandardCharsets.UTF_8);
                        E(b, str.length());
                        return new iww0(str);
                    }
                    long jD = tww0Var.d();
                    if (jD > 1000) {
                        throw new aww0("Parser being asked to read a large CBOR map");
                    }
                    E(b, jD);
                    int i2 = (int) jD;
                    afm0[] afm0VarArr = new afm0[i2];
                    oww0 oww0Var = null;
                    int i3 = 0;
                    while (i3 < jD) {
                        oww0 oww0VarD = D(tww0Var);
                        if (oww0Var != null && oww0VarD.compareTo(oww0Var) <= 0) {
                            throw new l52("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + oww0Var.toString() + "\nCurrent key: " + oww0VarD.toString());
                        }
                        afm0VarArr[i3] = new afm0((Object) oww0VarD, (Object) D(tww0Var), (byte) 24);
                        i3++;
                        oww0Var = oww0VarD;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i < i2) {
                        afm0 afm0Var = afm0VarArr[i];
                        if (treeMap.containsKey((oww0) afm0Var.b)) {
                            throw new l52("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((oww0) afm0Var.b, (oww0) afm0Var.c);
                        i++;
                    }
                    return new hww0(mow0.b(treeMap));
                } catch (RuntimeException e) {
                    e = e;
                    throw new aww0(e);
                }
            } catch (IOException | RuntimeException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            throw new aww0(e3);
        }
    }

    public static final void E(byte b, long j) throws l52 {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new l52(axq.h(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (j < 256) {
                    throw new l52(axq.h(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (j < 65536) {
                    throw new l52(axq.h(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (j < 4294967296L) {
                    throw new l52(axq.h(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    public static final void a(mm40 mm40Var, wts0 wts0Var, fet fetVar, int i) {
        fetVar.g0(449454099);
        int i2 = (fetVar.g(wts0Var) ? 32 : 16) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1756048557, new vts0(mm40Var, wts0Var), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vts0(mm40Var, wts0Var, i);
        }
    }

    public static final void b(float f, float f2, int i, int i2, long j, long j2, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, mm40 mm40Var, rah0 rah0Var) {
        int i3;
        int i4;
        mm40 mm40Var2;
        rah0 rah0Var2;
        rah0 rah0VarT;
        int i5;
        mm40 mm40Var3;
        fetVar.g0(450849184);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = (fetVar.e(i3) ? 4 : 2) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        int i6 = i4 | 48;
        if ((i2 & 384) == 0) {
            i6 = i4 | 176;
        }
        if ((i2 & 3072) == 0) {
            i6 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= fetVar.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i6 |= fetVar.d(f) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i6 |= fetVar.i(ugdVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i6 |= fetVar.i(ugdVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i6 |= fetVar.d(f2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i6 |= fetVar.i(ugdVar3) ? 536870912 : 268435456;
        }
        if (fetVar.U(i6 & 1, (306783379 & i6) != 306783378)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                rah0VarT = wha0.T(fetVar);
                i5 = i6 & (-897);
                mm40Var3 = jm40.b;
            } else {
                fetVar.X();
                i5 = i6 & (-897);
                mm40Var3 = mm40Var;
                rah0VarT = rah0Var;
            }
            fetVar.s();
            int i7 = i5 >> 3;
            int i8 = (i5 & 126) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | ((i5 >> 9) & 458752);
            int i9 = i5 << 3;
            d(f, f2, i3, i8 | (29360128 & i9) | (i9 & 234881024) | (i5 & 1879048192), j, j2, ugdVar, ugdVar2, ugdVar3, fetVar, mm40Var3, rah0VarT);
            mm40Var2 = mm40Var3;
            rah0Var2 = rah0VarT;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            rah0Var2 = rah0Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jdo0(i, mm40Var2, rah0Var2, j, j2, f, ugdVar, ugdVar2, f2, ugdVar3, i2);
        }
    }

    public static final void c(int i, mm40 mm40Var, long j, long j2, float f, ugd ugdVar, Function2 function2, ugd ugdVar2, fet fetVar, int i2) {
        long j3;
        Function2 function3;
        int i3;
        long jD;
        Function2 function4;
        fetVar.g0(847049916);
        int i4 = i2 | (fetVar.e(i) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16) | 1024 | (fetVar.d(f) ? 16384 : 8192) | 1572864;
        if (fetVar.U(i4 & 1, (4793491 & i4) != 4793490)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                i3 = i4 & (-7169);
                jD = v4d.d(ovb0.d, fetVar);
                function4 = rhd.f30485a;
            } else {
                fetVar.X();
                i3 = i4 & (-7169);
                jD = j2;
                function4 = function2;
            }
            fetVar.s();
            int i5 = (i3 & 14) | 48;
            int i6 = i3 << 3;
            e(i, ugdVar, mm40Var, j, jD, f, function4, ugdVar2, wha0.T(fetVar), fetVar, (i6 & 458752) | i5 | (i6 & 896) | 3072 | 14155776);
            j3 = jD;
            function3 = function4;
        } else {
            fetVar.X();
            j3 = j2;
            function3 = function2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kdo0(i, mm40Var, j, j3, f, ugdVar, function3, ugdVar2, i2);
        }
    }

    public static final void d(float f, float f2, int i, int i2, long j, long j2, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, mm40 mm40Var, rah0 rah0Var) {
        int i3;
        fetVar.g0(414860860);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.f(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.d(f) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.d(f2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.g(rah0Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= fetVar.i(ugdVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= fetVar.i(ugdVar3) ? 536870912 : 268435456;
        }
        if (fetVar.U(i3 & 1, (306783379 & i3) != 306783378)) {
            gmn0.a(mm40Var, null, j, j2, 0.0f, 0.0f, null, u1c.M(1878374785, new pdo0(rah0Var, ugdVar2, ugdVar3, f, f2, i, ugdVar), fetVar), fetVar, (i3 & 7168) | ((i3 >> 3) & 14) | 12582912 | (i3 & 896), 114);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jdo0(i, mm40Var, j, j2, f, f2, rah0Var, ugdVar, ugdVar2, ugdVar3, i2);
        }
    }

    public static final void e(final int i, final ugd ugdVar, final mm40 mm40Var, final long j, final long j2, final float f, final Function2 function2, final ugd ugdVar2, final rah0 rah0Var, fet fetVar, final int i2) {
        int i3;
        fetVar.g0(901781420);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.d(f) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.g(rah0Var) ? 67108864 : 33554432;
        }
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            int i4 = ((i3 >> 6) & 14) | 12582912;
            int i5 = i3 >> 3;
            gmn0.a(mm40Var, null, j, j2, 0.0f, 0.0f, null, u1c.M(2077251399, new qdo0(rah0Var, f, ugdVar2, function2, ugdVar, i), fetVar), fetVar, (i5 & 7168) | i4 | (i5 & 896), 114);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ldo0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hxm0.e(i, ugdVar, mm40Var, j, j2, f, function2, ugdVar2, rah0Var, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void f(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(883718615);
        int i2 = (fetVar2.g(l7m0Var) ? 4 : 2) | i | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            pxm0 pxm0Var = ((vxm0) l7m0Var.getValue()).f38207a;
            boolean zEquals = pxm0Var.equals(nxm0.f24290a);
            jm40 jm40Var = jm40.b;
            if (zEquals) {
                fetVar2.e0(-1287994383);
                xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
                mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA, fetVar2), null);
                zcl zclVar = qmk.f28987a;
                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 16.0f, 7);
                boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objP = fetVar2.P();
                if (z || objP == ukd.f35823a) {
                    objP = new ys4(l7m0Var, function1, (byte) 24);
                    fetVar2.o0(objP);
                }
                b8k0.e(mm40VarV, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                if (!(pxm0Var instanceof oxm0)) {
                    throw b1j.f(-1149929621, fetVar2, false);
                }
                fetVar2.e0(-1286595322);
                xkb.n(null, ((oxm0) pxm0Var).f26020a, 0L, null, fetVar2, 0);
                zcl zclVar2 = qmk.f28987a;
                rz4.t(jm40Var, 16.0f, fetVar2, false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i, (byte) 17);
        }
    }

    public static final void g(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0) {
        mm40 mm40Var2;
        jm40 jm40Var;
        jr8 jr8Var;
        boolean z;
        fet fetVar2 = fetVar;
        pge pgeVar = gqw0.A;
        fetVar2.g0(1210295780);
        int i3 = i2 | 6 | (fetVar2.e(i) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            long jO = obc.O(R.color.uikit_teambet_gradient_start, fetVar2);
            long jO2 = obc.O(R.color.uikit_teambet_gradient_end, fetVar2);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarW = y860.W(i120.P(lgb.J(o7k0.p(jm40Var2, 122.0f, 132.0f), vgg0.a(16.0f)), yk5.n(q3d.j(new y3d(jO), new y3d(jO2)), 0.0f, 0.0f, 14), null, 6), null, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            int i4 = Build.VERSION.SDK_INT;
            byte b = 10;
            cl5 cl5Var = ukd.f35823a;
            jr8 jr8Var2 = jr8.f16991a;
            if (i4 >= 29) {
                fetVar2.e0(-805691397);
                mm40 mm40VarA = jr8Var2.a(jm40Var2);
                Object objP = fetVar2.P();
                if (objP == cl5Var) {
                    objP = new meo0(b);
                    fetVar2.o0(objP);
                }
                z = true;
                jr8Var = jr8Var2;
                jm40Var = jm40Var2;
                j0x.b(a8k0.F(R.drawable.teambet_card, 0, fetVar2), null, i4w0.T(mm40VarA, (Function1) objP), null, pgeVar, 0.0f, null, fetVar2, 24632, 104);
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(-805345034);
                boolean zF = fetVar2.f(jO);
                Object objP2 = fetVar2.P();
                if (zF || objP2 == cl5Var) {
                    float fE = (y3d.e(jO) * 0.11f) + (y3d.g(jO) * 0.59f) + (y3d.h(jO) * 0.3f);
                    float[] fArr = {0.3f, 0.59f, 0.11f, 0.0f, (y3d.h(jO) - fE) * 255.0f, 0.3f, 0.59f, 0.11f, 0.0f, (y3d.g(jO) - fE) * 255.0f, 0.3f, 0.59f, 0.11f, 0.0f, (y3d.e(jO) - fE) * 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
                    h4d h4dVar = new h4d(new ColorMatrixColorFilter(fArr));
                    h4dVar.b = fArr;
                    fetVar2.o0(h4dVar);
                    objP2 = h4dVar;
                }
                jr8Var = jr8Var2;
                z = true;
                j0x.b(a8k0.F(R.drawable.teambet_card, 0, fetVar2), null, jr8Var2.a(jm40Var), null, pgeVar, 0.0f, (a4d) objP2, fetVar2, 24632, 40);
                fetVar2.r(false);
            }
            v8q0.a(String.valueOf(i), s5x0.N(jr8Var.b(jm40Var, gqw0.g), 12.0f, 0.0f, 12.0f, 12.0f, 2), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.s(new y9q0(0L, qmk.w, null, j1t0.b, 0L, null, 0, 0, qmk.I, 16646109), fetVar2), fetVar, 0, 24576, 114684);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wb5(mm40Var2, i, function0, i2, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    public static final void h(final mm40 mm40Var, final String str, final zx7 zx7Var, int i, fet fetVar, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z;
        final int i6;
        yfe0 yfe0VarU;
        int i7;
        str.getClass();
        fetVar.g0(-1004980493);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.g(zx7Var) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 == 0) {
            if ((i2 & 3072) == 0) {
                i5 = i;
                i4 |= fetVar.e(i5) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i8 != 0) {
                    i7 = 3;
                } else {
                    i7 = i5;
                }
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                int i9 = i4 << 3;
                kc5.N(str, mm40Var, 0L, null, null, 0L, qmk.q, qmk.r, null, null, 0L, zx7Var, 2, false, i7, 0, false, null, y9q0.a(g1t0.m(), StaticColors.INSTANCE.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), 0.0f, fetVar, ((i4 >> 3) & 14) | (i9 & 112), (i9 & 7168) | 24576 | ((i4 << 9) & 3670016), 0, 3055420);
                i6 = i7;
            } else {
                fetVar.X();
                i6 = i5;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.bgp0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        hxm0.h(mm40Var, str, zx7Var, i6, (fet) obj, x8x.L(i2 | 1), i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 3072;
        i5 = i;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            if (i8 != 0) {
                i7 = 3;
            } else {
                i7 = i5;
            }
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            int i10 = i4 << 3;
            kc5.N(str, mm40Var, 0L, null, null, 0L, qmk.q, qmk.r, null, null, 0L, zx7Var, 2, false, i7, 0, false, null, y9q0.a(g1t0.m(), StaticColors.INSTANCE.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), 0.0f, fetVar, ((i4 >> 3) & 14) | (i10 & 112), (i10 & 7168) | 24576 | ((i4 << 9) & 3670016), 0, 3055420);
            i6 = i7;
        } else {
            fetVar.X();
            i6 = i5;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.bgp0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hxm0.h(mm40Var, str, zx7Var, i6, (fet) obj, x8x.L(i2 | 1), i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        shd shdVar;
        jm40 jm40Var;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        boolean z;
        fetVar.g0(803489430);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar7);
            jpm0.n(fetVar);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar8);
            jm40 jm40Var2 = jm40.b;
            Unit unit = null;
            if (str == null) {
                fetVar.e0(1508611758);
                fetVar.r(false);
                shdVar2 = shdVar8;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                jm40Var = jm40Var2;
                shdVar = shdVar6;
            } else {
                fetVar.e0(1508611759);
                n05 n05Var = new n05(idm0.t(12), idm0.t(16), idm0.t(1));
                y9q0 y9q0VarA = y9q0.a(new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447);
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = m6m.f;
                    fetVar.o0(objP);
                }
                int i3 = 1597488 | ((i2 >> 3) & 14);
                shdVar = shdVar6;
                jm40Var = jm40Var2;
                shdVar2 = shdVar8;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                aad.e(str, jm40Var, y9q0VarA, null, 2, false, 2, 0, (n4d) objP, n05Var, fetVar, i3, 168);
                fetVar.r(false);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar.e0(-366959298);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar2);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 14.0f), 120.0f);
                zcl zclVar2 = qmk.e;
                ugg0 ugg0Var = vgg0.f37379a;
                zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
                z = true;
                dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 14.0f), 172.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
                fetVar.r(false);
            } else {
                z = true;
                fetVar.e0(-366976596);
                fetVar.r(false);
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str, i, (byte) 22);
        }
    }

    public static final void j(ecb ecbVar, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        ecbVar.getClass();
        fetVar.g0(2128136912);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ecbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var, 4.0f, 4.0f, 4.0f, 0.0f, 8);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            nkb.h(jm40.b, new hjm(ecbVar.b, null, null, new n0x(ecbVar.c), null, new m0x(R.drawable.no_photo_placeholder_toto_header, null, 6), false, null, null, false, null, null, 7638), kjm.b, null, null, null, fetVar, 390, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((byte) 28, i, mm40Var, (Object) ecbVar);
        }
    }

    public static final void k(mm40 mm40Var, ugg0 ugg0Var, long j, ugd ugdVar, fet fetVar, int i) {
        ugd ugdVar2;
        mm40Var.getClass();
        fetVar.g0(757300588);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ugg0Var) ? 32 : 16) | (fetVar.f(j) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            ugdVar2 = ugdVar;
            gmn0.a(lgb.J(mm40Var, ugg0Var), ugg0Var, j, 0L, 0.0f, 0.0f, null, u1c.M(-53142009, new kqj0(ugdVar2, (byte) 8), fetVar), fetVar, (i2 & 112) | 12582912 | (i2 & 896), 120);
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ds8(mm40Var, (Object) ugg0Var, j, (wdr) ugdVar2, i, (byte) 7);
        }
    }

    public static final c4m0 l(View view, long j, Function0 function0) {
        view.getClass();
        clz clzVarL = s7n0.l(view);
        if (clzVarL == null) {
            return null;
        }
        tkz tkzVarQ = x0x.Q(clzVarL.x());
        rwj rwjVar = tvk.f34603a;
        return qjj.W(tkzVarQ, ys10.f43147a, null, new rjq(j, function0, (yje) null), 2);
    }

    public static final void m(View view) {
        view.getClass();
        if (Build.VERSION.SDK_INT < 30) {
            p(view).getWindow().setSoftInputMode(32);
        }
    }

    public static final void n(View view) {
        view.getClass();
        if (Build.VERSION.SDK_INT < 30) {
            p(view).getWindow().setSoftInputMode(16);
        }
    }

    public static String o(mg9 mg9Var) {
        StringBuilder sb = new StringBuilder(mg9Var.size());
        for (int i = 0; i < mg9Var.size(); i++) {
            byte b = mg9Var.b(i);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final yc3 p(View view) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        while (context instanceof ContextWrapper) {
            if (context instanceof yc3) {
                return (yc3) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        jf4.n("View hasn't been bind to activity!");
        return null;
    }

    public static final ArrayList q(ViewGroup viewGroup) {
        viewGroup.getClass();
        IntRange intRangeO = l1e0.o(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList(r3d.q(intRangeO, 10));
        Iterator it = intRangeO.iterator();
        while (((kkx) it).c) {
            arrayList.add(viewGroup.getChildAt(((bkx) it).nextInt()));
        }
        return arrayList;
    }

    public static final l5i r(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1950496919) {
            if (iHashCode != 65203182) {
                if (iHashCode == 881679329 && str.equals("ProgressLine")) {
                    return l5i.d;
                }
            } else if (str.equals("Clock")) {
                return l5i.b;
            }
        } else if (str.equals("Number")) {
            return l5i.c;
        }
        return l5i.f19457a;
    }

    public static final int s(nev0 nev0Var) {
        nev0Var.getClass();
        int iOrdinal = nev0Var.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.ic_glyph_live;
        }
        if (iOrdinal == 1) {
            return R.drawable.ic_glyph_results;
        }
        if (iOrdinal == 2) {
            return R.drawable.ic_glyph_cyber_gamepad;
        }
        if (iOrdinal == 3) {
            return R.drawable.ic_glyph_search;
        }
        if (iOrdinal == 4) {
            return R.drawable.ic_glyph_cards;
        }
        if (iOrdinal == 5) {
            return R.drawable.ic_glyph_games;
        }
        t9f.b();
        return 0;
    }

    public static final String t(nev0 nev0Var, ctf0 ctf0Var, String str) {
        nev0Var.getClass();
        ctf0Var.getClass();
        int iOrdinal = nev0Var.ordinal();
        if (iOrdinal == 0) {
            return ctf0Var.f(R.string.live_game, new Object[0]);
        }
        if (iOrdinal == 1) {
            return ctf0Var.f(R.string.results, new Object[0]);
        }
        if (iOrdinal == 2) {
            return ctf0Var.f(R.string.cyber_sport, new Object[0]);
        }
        if (iOrdinal == 3) {
            return ctf0Var.f(R.string.search, new Object[0]);
        }
        if (iOrdinal == 4) {
            return ctf0Var.f(R.string.cases_casino, new Object[0]);
        }
        if (iOrdinal == 5) {
            return str;
        }
        t9f.b();
        return null;
    }

    public static void u(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    public static final void v(View view) {
        view.getClass();
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    public static final void w(ImageView imageView) {
        Context context = imageView.getContext();
        context.getClass();
        imageView.setScaleX(context.getResources().getConfiguration().getLayoutDirection() == 1 ? -1.0f : 1.0f);
    }

    public static final void x(View view, int i) {
        view.getClass();
        view.setClipToOutline(true);
        view.setOutlineProvider(new pyl0(i, (byte) 1));
    }

    public static final void y(EditText editText, Function0 function0) {
        editText.getClass();
        editText.setOnEditorActionListener(new dfd0(function0, (byte) 4));
    }

    public static void z(View view, boolean z) {
        uen uenVar = wen.b;
        bfn bfnVar = bfn.MILLISECONDS;
        long jV0 = ibc.v0(150, bfnVar);
        Object tag = view.getTag(R.id.view_target_visibility_state);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool == null || !bool.equals(Boolean.valueOf(z))) {
            view.setTag(R.id.view_target_visibility_state, Boolean.valueOf(z));
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            viewPropertyAnimatorAnimate.cancel();
            viewPropertyAnimatorAnimate.setDuration(wen.l(jV0, bfnVar));
            if (z) {
                view.setAlpha(0.0f);
                viewPropertyAnimatorAnimate.alpha(1.0f);
                viewPropertyAnimatorAnimate.withStartAction(new xv5(view, (byte) 2));
            } else {
                viewPropertyAnimatorAnimate.alpha(0.0f);
                viewPropertyAnimatorAnimate.withEndAction(new xv5(view, (byte) 3));
            }
            viewPropertyAnimatorAnimate.start();
        }
    }
}
