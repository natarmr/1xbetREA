package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Typeface;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n4c {
    public static final void A(mm40 mm40Var, String str, dkk dkkVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1621536506);
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
            v8q0.a(str, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), textPrimary, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i2 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar;
            B(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), R.drawable.ic_glyph_cyber_kosti_one, dkkVar.f6234a, dkkVar.b, dkkVar.c, fetVar2, 0, 0);
            B(null, R.drawable.ic_glyph_cyber_kosti_two, dkkVar.d, dkkVar.e, dkkVar.f, fetVar2, 0, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kwm(mm40Var, str, dkkVar, i, (byte) 0);
        }
    }

    public static final void B(mm40 mm40Var, int i, String str, String str2, String str3, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        fet fetVar2 = fetVar;
        fetVar2.g0(634656067);
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
            mm40 mm40VarE = o7k0.e(mm40Var2, 20.0f);
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
            C(((i6 >> 9) & 112) | 3072, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), fetVar2, mm40VarN, str3, true);
            qxw.o(fetVar2, i120.Q(o7k0.c(o7k0.s(s5x0.N(jm40Var, 0.0f, 2.0f, 4.0f, 2.0f, 1), 1.0f), 1.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSeparator(), jd8.n));
            C(((i6 >> 6) & 112) | 3072, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), str2, false);
            int i7 = i6 >> 3;
            C((i7 & 112) | 3072, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), str, false);
            dww.c(a8k0.F(i, i7 & 14, fetVar2), "", o7k0.n(jm40Var, 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lwm(mm40Var2, i, str, str2, str3, i2, i3, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    public static final void C(int i, long j, fet fetVar, mm40 mm40Var, String str, boolean z) {
        int i2;
        boolean z2;
        fetVar.g0(-2084608007);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 20.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                String strL = null;
                if (!z) {
                    if (str != null) {
                        z2 = true;
                        strL = ttm0.L(1, str);
                    }
                    if (strL == null) {
                        strL = "-";
                    }
                    objP = strL;
                    fetVar.o0(objP);
                } else if (str != null) {
                    strL = ttm0.L(2, str);
                }
                z2 = true;
                if (strL == null) {
                    strL = "-";
                }
                objP = strL;
                fetVar.o0(objP);
            } else {
                z2 = true;
            }
            v8q0.a((String) objP, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, i2 & 896, 24960, 110586);
            fetVar.r(z2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l2m(mm40Var, str, j, z, i, (byte) 3);
        }
    }

    public static final void D(mm40 mm40Var, boolean z, h1n h1nVar, fet fetVar, int i) {
        int i2;
        int i3;
        boolean z2;
        fetVar.g0(-1873104141);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(h1nVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.m, (byte) 12)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z3) {
                fetVar.l(function0);
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
            c280 c280Var = h1nVar.b;
            fetVar.e0(1374815133);
            boolean zG = fetVar.g(c280Var);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new u6n(d4d.SECONDARY60, w6n.h, c280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            tj30 tj30VarC = zq8.c(gqw0.g, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            boolean zG2 = fetVar.g(u6nVar);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                i3 = 1;
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar.o0(objP2);
            } else {
                i3 = 1;
            }
            kkb.p(i3, fetVar, null, (Function0) objP2);
            if (z) {
                fetVar.e0(-1774403342);
                y0m y0mVar = y0m.f41813a;
                mm40 mm40VarQ = ffb0.Q(jm40Var, -4.0f, 4.0f);
                z2 = false;
                vic.e(mm40VarQ, y0mVar, fetVar, 48, 0);
                fetVar.r(false);
            } else {
                z2 = false;
                fetVar.e0(-1774106796);
                fetVar.r(false);
            }
            fetVar.r(true);
            fetVar.r(z2);
            v8q0.a(h1nVar.f12292a, new x7z(1.0f, true), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), new n05(qmk.q, g1t0.d().f42262a.b, qmk.n), 0L, null, null, g1t0.d().f42262a.f, 0L, new f2q0(5), 0L, 2, false, 3, 0, null, g1t0.d(), fetVar, 0, 24960, 109424);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l1n(mm40Var, z, h1nVar, i, (byte) 1);
        }
    }

    public static final void E(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-12610012);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 36.0f);
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
            mm40 mm40VarE2 = o7k0.e(o7k0.s(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 80.0f), 16.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE2), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 5);
        }
    }

    public static final void F(float f, fet fetVar, int i) {
        int i2;
        fetVar.g0(-987468114);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), f, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarL, 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new njw(f, i, b);
        }
    }

    public static void G(int i, int i2) {
        GLES20.glBindTexture(i, i2);
        H();
        GLES20.glTexParameteri(i, 10240, 9729);
        H();
        GLES20.glTexParameteri(i, 10241, 9729);
        H();
        GLES20.glTexParameteri(i, 10242, 33071);
        H();
        GLES20.glTexParameteri(i, 10243, 33071);
        H();
    }

    public static void H() {
        StringBuilder sb = new StringBuilder();
        e3c.s(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z = false;
        int i = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i2 = i + 1;
            int iE = r3x.e(objArrCopyOf.length, i2);
            if (iE > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iE);
            }
            objArrCopyOf[i] = numValueOf;
            z = true;
            i = i2;
        }
        if (z) {
            throw new p7v(sb.toString(), b4x.k(i, objArrCopyOf));
        }
    }

    public static void I(String str, boolean z) {
        if (z) {
            return;
        }
        v3x v3xVar = b4x.b;
        throw new p7v(str, rcf0.e);
    }

    public static final ArrayList J(Activity activity, List list) {
        xg90 tg90Var;
        activity.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            if (jiq0.j0(activity, str) == 0) {
                tg90Var = new vg90(str);
            } else {
                tg90Var = jiq0.v0(activity, str) ? new tg90(str) : new wg90(str);
            }
            arrayList.add(tg90Var);
        }
        return arrayList;
    }

    public static FloatBuffer K(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static final String L(String str, boolean z) {
        if (!z) {
            return "";
        }
        StringBuilder sb = new StringBuilder(ujn.h);
        String strL = kng0.l("/sfiles/sppic1/cyber/cs/", str, ".png");
        if (strL.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strL, ujn.h, false) || kotlin.text.c.x(strL, "https://", false)) {
            sb.setLength(0);
            sb.append(strL);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strL, '/'));
        }
        return sb.toString();
    }

    public static boolean M(String str) throws p7v {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        I("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        I("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
            return strEglQueryString != null && strEglQueryString.contains(str);
        }
        throw new p7v("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(iEglGetError), b4x.t(Integer.valueOf(iEglGetError)));
    }

    public static boolean N() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.f45309a;
        String str3 = Build.MODEL;
        str3.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = str3.toUpperCase(locale);
        upperCase.getClass();
        if (!linkedHashMap.containsKey(upperCase)) {
            return false;
        }
        String upperCase2 = str3.toUpperCase(locale);
        upperCase2.getClass();
        Range range = (Range) linkedHashMap.get(upperCase2);
        if (range != null) {
            return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
        }
        return true;
    }

    public static List O(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    public static a1g P(vsg0 vsg0Var, Function1 function1, Function0 function0) {
        return new a1g(vsg0Var, new qne(function1, function0, null), (byte) 20);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object Q(int i, Object obj, atf0 atf0Var, psq psqVar, int i2) {
        Object[] objArr;
        Object[] objArr2;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z = false;
        int i3 = 0;
        z = false;
        if ((i & 1) == 0 || Intrinsics.d(atf0Var.b, psqVar)) {
            objArr = false;
        } else {
            psq psqVar2 = psq.d;
            if (psqVar.compareTo(psqVar2) < 0 || Intrinsics.e(atf0Var.b.f27526a, psqVar2.f27526a) >= 0) {
                objArr = false;
            } else {
                objArr = true;
            }
        }
        if ((i & 2) != 0) {
            atf0Var.getClass();
            if (i2 == 0) {
                objArr2 = false;
            } else {
                objArr2 = true;
            }
        } else {
            objArr2 = false;
        }
        if (objArr2 != true && objArr != true) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int i4 = objArr != false ? psqVar.f27526a : atf0Var.b.f27526a;
            if (objArr2 != true) {
                atf0Var.getClass();
            } else if (i2 == 1) {
                z = true;
            }
            return Typeface.create((Typeface) obj, i4, z);
        }
        Object[] objArr3 = objArr2 == true && i2 == 1;
        if (objArr3 == true && objArr == true) {
            i3 = 3;
        } else if (objArr == true) {
            i3 = 1;
        } else if (objArr3 != false) {
            i3 = 2;
        }
        return Typeface.create((Typeface) obj, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    public static final d4g R(g4g g4gVar) {
        ?? arrayList;
        Object obj;
        ?? arrayList2;
        ?? arrayList3;
        Integer num = g4gVar.f10664a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = g4gVar.b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        s8h s8hVarI = e3c.I(g4gVar.c);
        s8h s8hVarI2 = e3c.I(g4gVar.d);
        List list = g4gVar.e;
        if (list != null) {
            int i = 10;
            ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
            int i2 = 0;
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    q3d.p();
                    throw null;
                }
                q3g q3gVar = (q3g) obj2;
                q3gVar.getClass();
                String str = q3gVar.f28051a;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                v3g v3gVarC0 = v3c.c0(q3gVar.b);
                v3g v3gVarC1 = v3c.c0(q3gVar.c);
                List<u3g> list2 = q3gVar.d;
                if (list2 != null) {
                    obj = null;
                    arrayList2 = new ArrayList(r3d.q(list2, i));
                    for (u3g u3gVar : list2) {
                        u3gVar.getClass();
                        Integer num3 = u3gVar.f34995a;
                        int iIntValue3 = num3 != null ? num3.intValue() : 0;
                        Integer num4 = u3gVar.b;
                        arrayList2.add(new r3g(iIntValue3, num4 != null ? num4.intValue() : 0));
                    }
                } else {
                    obj = null;
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                ?? r16 = arrayList2;
                List<u3g> list3 = q3gVar.e;
                if (list3 != null) {
                    i = 10;
                    arrayList3 = new ArrayList(r3d.q(list3, 10));
                    for (u3g u3gVar2 : list3) {
                        u3gVar2.getClass();
                        Integer num5 = u3gVar2.f34995a;
                        int iIntValue4 = num5 != null ? num5.intValue() : 0;
                        Integer num6 = u3gVar2.b;
                        arrayList3.add(new r3g(iIntValue4, num6 != null ? num6.intValue() : 0));
                    }
                } else {
                    i = 10;
                    arrayList3 = obj;
                }
                if (arrayList3 == 0) {
                    arrayList3 = iun.f15405a;
                }
                arrayList4.add(new n3g(str2, i3, v3gVarC0, v3gVarC1, r16, arrayList3));
                i2 = i3;
            }
            arrayList = new ArrayList();
            for (Object obj3 : arrayList4) {
                n3g n3gVar = (n3g) obj3;
                if (!n3gVar.e.isEmpty() || !n3gVar.c.c.isEmpty() || !n3gVar.d.c.isEmpty()) {
                    arrayList.add(obj3);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new d4g(iIntValue, iIntValue2, s8hVarI, s8hVarI2, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    public static final t9l S(q1h q1hVar, String str, String str2, int i, int i2) {
        q1hVar.getClass();
        long j = q1hVar.f;
        str.getClass();
        str2.getClass();
        long j2 = i2;
        if (!kotlin.text.c.x(str2, ujn.h, false)) {
            if (str2.length() == 0) {
                str2 = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str2)) {
                    str2 = "";
                } else {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
        }
        q9l q9lVar = new q9l(str, str2);
        rdj rdjVar = rdj.f30294a;
        String strF = rdj.f(new znq0(j), sdj.UNIVERSAL, null, 60);
        strF.getClass();
        return new t9l(j2, q9lVar, strF, q1hVar.g, rdj.h(new znq0(j), ykq0.UNIVERSAL, Boolean.TRUE, null, 248), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b2o0 T(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        b2o0 w1o0Var;
        boolean z5;
        d0tVar.getClass();
        Date date = d0tVar.P;
        String str3 = d0tVar.c;
        long j = d0tVar.v;
        ctf0Var.getClass();
        str.getClass();
        list.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        Object d2iVar = null;
        if (iOrdinal == 0) {
            w1o0Var = new w1o0(d0tVar.f5282a, ibm0.u(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new c4o0(new pws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new pws0(qzb.r0(d0tVar), kbc.V(d0tVar)), new lpm(opm.f25648a, new hpm(0L, 3)), v3c.S(d0tVar) ? new p0n(kpb.r0(d0tVar), fgm.b, date.getTime(), false, 24) : null, j == 40 ? str3 : kpb.X(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 1) {
            w1o0Var = new a2o0(d0tVar.f5282a, ibm0.y(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new i5o0(new qws0(qzb.c0(d0tVar)), new qws0(qzb.r0(d0tVar)), v3c.S(d0tVar) ? new p0n(kpb.r0(d0tVar), fgm.b, date.getTime(), false, 24) : null, j == 40 ? str3 : kpb.X(d0tVar), pem.f26861a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal != 2) {
            c2m c2mVar = c2m.f3631a;
            if (iOrdinal == 3) {
                String strX = str3;
                z5 = j == 40;
                long j2 = d0tVar.f5282a;
                n0x n0xVar = new n0x(dtb.F(str));
                if (!z5) {
                    strX = kpb.X(d0tVar);
                }
                w1o0Var = new y1o0(j2, ibm0.w(d0tVar, str, strX, list, z2, z3, v3c.S(d0tVar), str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new s4o0(new sws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new sws0(qzb.r0(d0tVar), kbc.V(d0tVar)), new z1m(c2mVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                w1o0Var = new x1o0(d0tVar.f5282a, ibm0.v(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new k4o0(new z1m(c2mVar), v3c.S(d0tVar) ? new p0n(kpb.r0(d0tVar), fgm.b, date.getTime(), false, 24) : null, new tws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new tws0(qzb.r0(d0tVar), kbc.V(d0tVar)), j == 40 ? str3 : kpb.X(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            long j3 = d0tVar.f5282a;
            k4i k4iVarX = ibm0.x(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            z5 = j == 40;
            rws0 rws0Var = new rws0(qzb.c0(d0tVar), kbc.U(d0tVar));
            rws0 rws0Var2 = new rws0(qzb.r0(d0tVar), kbc.V(d0tVar));
            p0n p0nVar = v3c.S(d0tVar) ? new p0n(kpb.r0(d0tVar), fgm.b, date.getTime(), false, 24) : null;
            String strX2 = z5 ? str3 : kpb.X(d0tVar);
            if (d0tVar.S && z4) {
                d2iVar = new d2i();
            }
            w1o0Var = new z1o0(j3, k4iVarX, new a5o0(d2iVar, p0nVar, rws0Var, rws0Var2, strX2), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return w1o0Var;
    }

    public static final List U(d4t d4tVar, sip sipVar) {
        d4tVar.getClass();
        sipVar.getClass();
        List<ck00> list = d4tVar.c;
        if (list == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (ck00 ck00Var : list) {
            hmz hmzVar = d4tVar.f5472a;
            Integer num = null;
            String str = hmzVar != null ? hmzVar.b : null;
            if (str == null) {
                str = "";
            }
            Long l = hmzVar != null ? hmzVar.f13327a : null;
            if (hmzVar != null) {
                num = hmzVar.d;
            }
            arrayList.add(b5x.c0(ck00Var, sipVar, str, l, num));
        }
        return arrayList;
    }

    public static final jo20 V(kbs kbsVar) {
        jo20 jo20Var = new jo20();
        jo20Var.put("cfView", Integer.valueOf(kbsVar.f18029a));
        int i = kbsVar.i;
        if (i > 0) {
            jo20Var.put("country", Integer.valueOf(i));
        }
        jo20Var.put("fcountry", Integer.valueOf(kbsVar.h));
        jo20Var.put("gameId", Integer.valueOf(kbsVar.b));
        jo20Var.put("groupId", Integer.valueOf(kbsVar.c));
        if (kbsVar.f) {
            jo20Var.put("lng", kbsVar.e);
        }
        if (kbsVar.g) {
            jo20Var.put("userId", Integer.valueOf(kbsVar.d));
        }
        return w6x.j(22, jo20Var, "whence");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [a.iun] */
    public static final ArrayList W(kuv kuvVar) {
        Object next;
        ?? arrayList;
        Object next2;
        List list;
        List list2 = kuvVar.f18932a;
        if (list2 == null) {
            jf4.k(null);
            return null;
        }
        List list3 = kuvVar.b;
        if (list3 == null) {
            jf4.k(null);
            return null;
        }
        List<agp0> list4 = kuvVar.d;
        if (list4 == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
        for (agp0 agp0Var : list4) {
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((gip0) next).f11360a, agp0Var.f836a));
            gip0 gip0Var = (gip0) next;
            if (gip0Var == null) {
                jf4.k(null);
                return null;
            }
            List list5 = agp0Var.b;
            if (list5 == null) {
                jf4.k(null);
                return null;
            }
            ArrayList arrayList3 = new ArrayList(r3d.q(list5, 10));
            Iterator it2 = list5.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zu40 zu40Var = (zu40) it2.next();
                    Iterator it3 = list3.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!Intrinsics.d(((haa0) next2).f12715a, zu40Var.f44993a));
                    haa0 haa0Var = (haa0) next2;
                    if (haa0Var == null) {
                        jf4.k(null);
                        return null;
                    }
                    String str = haa0Var.f12715a;
                    String str2 = str == null ? "" : str;
                    String str3 = haa0Var.b;
                    String str4 = str3 == null ? "" : str3;
                    Integer num = haa0Var.c;
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = zu40Var.b;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    String str5 = haa0Var.d;
                    String str6 = str5 == null ? "" : str5;
                    lre lreVar = haa0Var.e;
                    String str7 = lreVar != null ? lreVar.f20527a : null;
                    if (str7 == null) {
                        str7 = "";
                    }
                    String str8 = lreVar != null ? lreVar.b : null;
                    if (str8 == null) {
                        str8 = "";
                    }
                    bre breVar = new bre(str7, str8);
                    String str9 = haa0Var.f;
                    String str10 = str9 == null ? "" : str9;
                    List<toa0> list6 = zu40Var.c;
                    if (list6 != null) {
                        ArrayList arrayList4 = new ArrayList(r3d.q(list6, 10));
                        for (toa0 toa0Var : list6) {
                            Double d = toa0Var.f34274a;
                            double dDoubleValue = 0.0d;
                            double dDoubleValue2 = d != null ? d.doubleValue() : 0.0d;
                            Double d2 = toa0Var.b;
                            if (d2 != null) {
                                dDoubleValue = d2.doubleValue();
                            }
                            arrayList4.add(new noa0(dDoubleValue2, dDoubleValue));
                            list3 = list3;
                        }
                        list = arrayList4;
                    } else {
                        list = null;
                    }
                    List list7 = list3;
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    arrayList3.add(new y3a0(str2, str4, iIntValue, iIntValue2, str6, breVar, str10, list));
                    list3 = list7;
                }
            }
            List list8 = list3;
            String str11 = gip0Var.f11360a;
            if (str11 == null) {
                str11 = "";
            }
            String str12 = gip0Var.b;
            String str13 = str12 == null ? "" : str12;
            Integer num3 = gip0Var.c;
            int iIntValue3 = num3 != null ? num3.intValue() : 0;
            String str14 = gip0Var.d;
            String str15 = str14 == null ? "" : str14;
            List<o4n0> list9 = gip0Var.e;
            if (list9 != null) {
                arrayList = new ArrayList(r3d.q(list9, 10));
                for (o4n0 o4n0Var : list9) {
                    String str16 = o4n0Var.f24647a;
                    if (str16 == null) {
                        str16 = "";
                    }
                    String str17 = o4n0Var.b;
                    if (str17 == null) {
                        str17 = "";
                    }
                    arrayList.add(new y3n0(str16, str17));
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
            arrayList2.add(new mep0(str11, str13, iIntValue3, str15, arrayList, arrayList3));
            list3 = list8;
        }
        if (arrayList2.size() == 2) {
            return arrayList2;
        }
        jf4.k(null);
        return null;
    }

    public static final k3t0 X(sgy sgyVar, String str, q0h0 q0h0Var, fet fetVar, int i) {
        diu0 diu0VarT;
        sgyVar.getClass();
        if ((i & 2) != 0) {
            str = null;
        }
        riu0 riu0VarA = ms00.a(fetVar);
        if (riu0VarA == null) {
            jf4.n("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        wbf wbfVarO = riu0VarA instanceof wmv ? ((wmv) riu0VarA).o() : vbf.b;
        piu0 piu0VarG = riu0VarA.g();
        piu0VarG.getClass();
        wbfVarO.getClass();
        h0q0 h0q0Var = new h0q0(piu0VarG, q0h0Var, wbfVarO);
        if (str != null) {
            diu0VarT = h0q0Var.t(sgyVar, str);
        } else {
            String strT = ny9.T(sgyVar);
            if (strT == null) {
                jf4.o("Local and anonymous classes can not be ViewModels");
                return null;
            }
            diu0VarT = h0q0Var.t(sgyVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strT));
        }
        return (k3t0) diu0VarT;
    }

    public static final k3t0 Y(sgy sgyVar, String str, fiu0 fiu0Var, fet fetVar, int i) {
        diu0 diu0VarT;
        sgyVar.getClass();
        fiu0Var.getClass();
        if ((i & 2) != 0) {
            str = null;
        }
        riu0 riu0VarA = ms00.a(fetVar);
        if (riu0VarA == null) {
            jf4.n("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        wbf wbfVarO = riu0VarA instanceof wmv ? ((wmv) riu0VarA).o() : vbf.b;
        piu0 piu0VarG = riu0VarA.g();
        piu0VarG.getClass();
        wbfVarO.getClass();
        h0q0 h0q0Var = new h0q0(piu0VarG, fiu0Var, wbfVarO);
        if (str != null) {
            diu0VarT = h0q0Var.t(sgyVar, str);
        } else {
            String strT = ny9.T(sgyVar);
            if (strT == null) {
                jf4.o("Local and anonymous classes can not be ViewModels");
                return null;
            }
            diu0VarT = h0q0Var.t(sgyVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strT));
        }
        return (k3t0) diu0VarT;
    }

    public static final void a(mm40 mm40Var, long j, o0x o0xVar, pm80 pm80Var, Boolean bool, Boolean bool2, fet fetVar, int i) {
        int i2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5 = Boolean.TRUE;
        fetVar.g0(-7324392);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(o0xVar) ? 256 : 128;
        }
        int i3 = i2 | 27648;
        if ((196608 & i) == 0) {
            i3 |= (262144 & i) == 0 ? fetVar.g(pm80Var) : fetVar.i(pm80Var) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i) == 0) {
            i4 |= fetVar.g(bool5) ? 8388608 : 4194304;
        }
        int i5 = i4 | 905969664;
        if (fetVar.U(i5 & 1, (306783379 & i5) != 306783378)) {
            o0x o0xVar2 = o0xVar == null ? null : o0xVar;
            if (o0xVar2 == null || o0xVar2.c()) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new cg(mm40Var, j, (Object) o0xVar, (Object) pm80Var, i, (byte) 2);
                    return;
                }
                return;
            }
            boolean zBooleanValue = o0xVar != null ? bool5.booleanValue() : true;
            fetVar.e0(843233810);
            fetVar.r(false);
            zfn zfnVar = rlx.c;
            zcl zclVar = qmk.f28987a;
            obc.d(zfnVar.a(new ycl(32.0f)), u1c.M(1271988696, new u13(o0xVar2, mm40Var, zBooleanValue, j, pm80Var), fetVar), fetVar, 56);
            bool3 = bool5;
            bool4 = bool3;
        } else {
            fetVar.X();
            bool3 = bool;
            bool4 = bool2;
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new jp(mm40Var, j, o0xVar, pm80Var, bool3, bool4, i);
        }
    }

    public static final void b(Function0 function0, fet fetVar) {
        function0.getClass();
        zfn zfnVar = m8m0.f21378a;
        hlm.c(jm40.b, new imm(new ilm(((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU()), mlm.f21997a, fmm.f9790a, ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4084);
    }

    public static final void c(final mm40 mm40Var, final cph cphVar, fet fetVar, final int i) {
        yfe0 yfe0VarU;
        Function2 function2;
        cphVar.getClass();
        a4x a4xVar = cphVar.f4746a;
        fetVar.g0(-1988508135);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cphVar) ? 32 : 16;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: a.bph
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = b;
                            int i3 = i;
                            cph cphVar2 = cphVar;
                            mm40 mm40Var2 = mm40Var;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    n4c.c(mm40Var2, cphVar2, fetVar2, x8x.L(i3 | 1));
                                    break;
                                default:
                                    n4c.c(mm40Var2, cphVar2, fetVar2, x8x.L(i3 | 1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
            } else {
                mm40 mm40VarV = vic.v(mm40Var);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarJ = s5x0.J(mm40VarV, 8.0f);
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
                jpm0.o(fetVar, thg0VarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                fetVar.e0(-1200114456);
                for (mph mphVar : CollectionsKt.D0(a4xVar, 2)) {
                    sac.b(new x7z(1.0f, true), mphVar.f22180a, mphVar.b, mphVar.c, fetVar, 0);
                }
                fetVar.r(false);
                fetVar.r(true);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            function2 = new Function2() { // from class: a.bph
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    int i3 = i;
                    cph cphVar2 = cphVar;
                    mm40 mm40Var2 = mm40Var;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            n4c.c(mm40Var2, cphVar2, fetVar2, x8x.L(i3 | 1));
                            break;
                        default:
                            n4c.c(mm40Var2, cphVar2, fetVar2, x8x.L(i3 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void d(mm40 mm40Var, f2i f2iVar, fet fetVar, int i) {
        mm40 mm40Var2;
        long secondary;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        f2iVar.getClass();
        fetVar2.g0(-1314061492);
        int i2 = i | 6 | (fetVar2.g(f2iVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var2);
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
            zx7 zx7Var = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(jm40Var2, zx7Var);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40VarB, 14.0f);
            pm80 pm80VarF = a8k0.F(f2iVar instanceof e2i ? R.drawable.ic_glyph_video_zone : R.drawable.ic_glyph_broadcast, 0, fetVar2);
            boolean z = f2iVar instanceof d2i;
            if (z) {
                fetVar2.e0(424838167);
                secondary = afn0.m(fetVar2).getSecondary40();
                fetVar2.r(false);
            } else {
                fetVar2.e0(424912505);
                secondary = afn0.m(fetVar2).getSecondary();
                fetVar2.r(false);
            }
            dww.c(pm80VarF, null, mm40VarN, secondary, fetVar2, 56, 0);
            if (z) {
                fetVar2.e0(425155421);
                mm40 mm40VarB2 = jr8Var.b(s5x0.N(o7k0.u(jm40Var2, 0.0f, 54.0f, 1), 10.0f, 0.0f, 0.0f, 0.0f, 14), zx7Var);
                long backgroundContent = afn0.m(fetVar2).getBackgroundContent();
                zcl zclVar2 = qmk.c;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarL = s5x0.L(i120.Q(mm40VarB2, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 2.0f, 0.0f, 2);
                fetVar2.e0(425749845);
                fetVar2.r(false);
                afn0.v(fetVar2).getClass();
                jm40Var = jm40Var2;
                v8q0.a("Soon", mm40VarL, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.p(g1t0.c(), fetVar2), fetVar, 0, 24960, 110588);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(425906396);
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
            yfe0VarU.d = new chh(mm40Var2, f2iVar, i, (byte) 22);
        }
    }

    public static final void e(mtj mtjVar, qdz qdzVar, Function1 function1, fet fetVar, int i) {
        int i2;
        Function1 function2;
        fet fetVar2;
        mtjVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(-902329243);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mtjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(qdzVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            function2 = function1;
            fetVar2 = fetVar;
            d5c.k(jm40Var, mtjVar.b, qdzVar.b(mtjVar.f22373a, new zuh((byte) 20), fetVar, i2 & 896), 0L, function2, fetVar2, (i2 & 14) | ((i2 << 6) & 458752), 24);
        } else {
            function2 = function1;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mtjVar, qdzVar, function2, i);
        }
    }

    public static final void f(osk oskVar, l7m0 l7m0Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var2;
        oskVar.getClass();
        l7m0Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-81157845);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(oskVar) ? 4 : 2) | i;
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
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40.b, 1.0f), "DISCIPLINE_DETAILS_HEADER_FOCUS_TOOLBAR");
            boolean zH = fetVar.h(((Boolean) l7m0Var2.getValue()).booleanValue());
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                imm immVar = new imm(klm.f18497a, mlm.f21997a, fmm.f9790a, background, ((Boolean) l7m0Var2.getValue()).booleanValue(), null);
                fetVar.o0(immVar);
                objP = immVar;
            }
            imm immVar2 = (imm) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new vkm(1);
                fetVar.o0(objP2);
            }
            hlm.c(mm40VarE0, immVar2, (vkm) objP2, null, null, null, null, null, null, u1c.M(740461359, new wr4(function0, b), fetVar), u1c.M(-1323921155, new yfg(oskVar, (byte) 28), fetVar), u1c.M(839381054, new cxj(oskVar, function1, (byte) 11), fetVar), fetVar, 805309830, 54, 496);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 3, i, (Object) oskVar, (Object) l7m0Var, (Object) function0, (Object) function1);
        }
    }

    public static final void g(mm40 mm40Var, spl splVar, float f, float f2, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1038877403);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(splVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (!fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.X();
        } else if (splVar instanceof qpl) {
            fetVar.e0(338002947);
            qpl qplVar = (qpl) splVar;
            String str = qplVar.c;
            int i3 = i2 & 126;
            int i4 = i2 << 3;
            h(mm40Var, qplVar, !(str == null || str.length() == 0), f, f2, function1, fetVar, i3 | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            fetVar.r(false);
        } else {
            if (!(splVar instanceof rpl)) {
                throw b1j.f(-1928761867, fetVar, false);
            }
            fetVar.e0(-1928744885);
            int i5 = i2 & 14;
            int i6 = i2 >> 3;
            i(mm40Var, f, f2, fetVar, (i6 & 896) | i5 | (i6 & 112));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n04(mm40Var, (tpl) splVar, f, f2, function1, i, (byte) 6);
        }
    }

    public static final void h(mm40 mm40Var, qpl qplVar, boolean z, float f, float f2, Function1 function1, fet fetVar, int i) {
        int i2;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(1689973056);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(qplVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function2) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 74899) != 74898)) {
            mm40 mm40VarK = s5x0.K(o7k0.d(mm40Var, 1.0f), f, f2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarK, vgg0.a(16.0f));
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            xx7 xx7Var = gqw0.n;
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarG = o7k0.g(s5x0.L(o7k0.d(jm40Var, 1.0f), 12.0f, 0.0f, 2), 40.0f, 0.0f, 2);
            String str = qplVar.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            y9q0 y9q0VarQ = g1t0.q();
            kc5.N(str, mm40VarG, textPrimary, null, null, 0L, qmk.p, qmk.u, null, null, 0L, gqw0.e, 2, false, 1, 0, false, null, y9q0VarQ, 0.0f, fetVar2, 0, 1600512, 0, 3055416);
            if (z) {
                fetVar2.e0(-1443078815);
                mm40 mm40VarL = s5x0.L(o7k0.g(o7k0.d(jm40Var, 1.0f), 14.0f, 0.0f, 2), 12.0f, 0.0f, 2);
                String str2 = qplVar.c;
                if (str2 == null) {
                    str2 = "";
                }
                long textPrimary2 = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
                ((g1t0) fetVar2.k(zfnVar2)).getClass();
                v8q0.a(str2, mm40VarL, textPrimary2, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, g1t0.g(), fetVar2, 0, 384, 125944);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                fetVar2.e0(-1442583466);
                fetVar2.r(false);
            }
            mm40 mm40VarE = s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 16.0f, 5).e(new wkw(xx7Var));
            lh80 lh80VarT = s5x0.t(12.0f, 0.0f, 2);
            qw3 qw3Var = new qw3(12.0f, true, new jf4((byte) 14));
            boolean z3 = ((i3 & 458752) == 131072) | ((i3 & 112) == 32);
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                function2 = function1;
                objP = new dpl((Object) qplVar, (Object) function2, (byte) 0);
                fetVar2.o0(objP);
            } else {
                function2 = function1;
            }
            b8k0.f(mm40VarE, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar2, 0, 490);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zol(mm40Var, qplVar, z, f, f2, function2, i, (byte) 3);
        }
    }

    public static final void i(mm40 mm40Var, float f, float f2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1391932679);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(o7k0.e(mm40VarD, 144.0f), f, f2);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarK), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wol(mm40Var, f, f2, i, (byte) 4);
        }
    }

    public static final void j(mm40 mm40Var, xcz xczVar, a4x a4xVar, lh80 lh80Var, boolean z, boolean z2, Function1 function1, fet fetVar, int i) {
        int i2;
        xcz xczVar2;
        boolean z3;
        boolean z4;
        xczVar.getClass();
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(1203477134);
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
            i2 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(lh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z;
            i2 |= fetVar.h(z3) ? 16384 : 8192;
        } else {
            z3 = z;
        }
        if ((i & 196608) == 0) {
            z4 = z2;
            i2 |= fetVar.h(z4) ? 131072 : 65536;
        } else {
            z4 = z2;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            int i4 = i3 >> 3;
            int i5 = i3 & 896;
            hp4.d(xczVar2, (vne) objP, a4xVar, z3, z4, fetVar, (i4 & 14) | i5 | (i4 & 7168) | (i4 & 57344));
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z5 = (i5 == 256) | ((3670016 & i3) == 1048576);
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new or0(a4xVar, function1, (byte) 12);
                fetVar.o0(objP2);
            }
            b8k0.f(mm40Var, xczVar, lh80Var, false, qw3Var, yx7Var, null, false, null, (Function1) objP2, fetVar, (i3 & 14) | 196608 | (i3 & 112) | (i4 & 896), 456);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vwl(mm40Var, xczVar, a4xVar, lh80Var, z, z2, function1, i, (byte) 0);
        }
    }

    public static final void k(d4d d4dVar, fet fetVar, int i) {
        fetVar.g0(1734432942);
        int i2 = (fetVar.e(d4dVar.ordinal()) ? 32 : 16) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            s4u0 s4u0VarR = iom0.r(jpm0.t(R.drawable.ic_glyph_cyber_new, 6, fetVar), fetVar);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = jr8.f16991a.b(o7k0.n(jm40Var, 20.0f), gqw0.c);
            long jY = ibc.Y(d4dVar, fetVar);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(s5x0.J(i120.S(mm40VarB, 2.0f, jY, ugg0Var), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), ugg0Var);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            j0x.b(s4u0VarR, null, o7k0.n(jm40Var, 10.0f), null, null, 0.0f, null, fetVar, 56, 120);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i3l(d4dVar, i, (byte) 10);
        }
    }

    public static final void l(mm40 mm40Var, mpm mpmVar, boolean z, fet fetVar, int i) {
        jpm jpmVar;
        k6z k6zVar;
        mpmVar.getClass();
        int i2 = i & 1;
        jm40 jm40Var = jm40.b;
        mm40 mm40Var2 = i2 != 0 ? jm40Var : mm40Var;
        boolean z2 = (i & 4) != 0 ? false : z;
        rpm rpmVarA = mpmVar.a();
        ipm ipmVarB = mpmVar.b();
        rpmVarA.getClass();
        ipmVarB.getClass();
        boolean zG = fetVar.g(rpmVarA) | fetVar.g(ipmVarB);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zG || objP == cl5Var) {
            if (rpmVarA instanceof opm) {
                zcl zclVar = qmk.f28987a;
                jpmVar = new jpm(o7k0.s(o7k0.e(jm40Var, 24.0f), 64.0f), qmk.p, new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), v3c.Q(ipmVarB));
            } else if (rpmVarA instanceof npm) {
                zcl zclVar2 = qmk.f28987a;
                jpmVar = new jpm(o7k0.s(o7k0.e(jm40Var, 40.0f), 108.0f), qmk.s, new y9q0(0L, qmk.y, null, j1t0.f15753a, 0L, null, 0, 0, qmk.K, 16646109), v3c.Q(ipmVarB));
            } else if (rpmVarA instanceof qpm) {
                zcl zclVar3 = qmk.f28987a;
                jpmVar = new jpm(o7k0.s(o7k0.e(jm40Var, 32.0f), 80.0f), qmk.p, new y9q0(0L, qmk.t, null, j1t0.f15753a, 0L, null, 0, 0, idm0.t(22), 16646109), v3c.Q(ipmVarB));
            } else if (!(rpmVarA instanceof ppm)) {
                t9f.b();
                return;
            } else {
                zcl zclVar4 = qmk.f28987a;
                jpmVar = new jpm(o7k0.s(o7k0.e(jm40Var, 40.0f), 96.0f), qmk.q, new y9q0(0L, qmk.w, null, j1t0.f15753a, 0L, null, 0, 0, qmk.I, 16646109), v3c.Q(ipmVarB));
            }
            objP = jpmVar;
            fetVar.o0(objP);
        }
        jpm jpmVar2 = (jpm) objP;
        if (!(mpmVar instanceof lpm)) {
            if (!(mpmVar instanceof kpm)) {
                throw b1j.f(387223508, fetVar, false);
            }
            fetVar.e0(387226788);
            kpm kpmVar = (kpm) mpmVar;
            jpmVar2.getClass();
            if (z2) {
                fetVar.e0(-1683532312);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1683531388);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-1439279711, new dpm(mm40Var2, jpmVar2, kpmVar), fetVar), fetVar, 56);
            fetVar.r(false);
            return;
        }
        fetVar.e0(387224715);
        jpmVar2.getClass();
        y9q0 y9q0Var = jpmVar2.c;
        mm40 mm40VarE = mm40Var2.e(jpmVar2.f16909a);
        tj30 tj30VarC = zq8.c(gqw0.e, false);
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
        long j = jpmVar2.d;
        mm40 mm40VarE0 = o2e.e0(jm40Var, "DS_VS_SCORE_TEXT");
        boolean zF = fetVar.f(j);
        Object objP2 = fetVar.P();
        if (zF || objP2 == cl5Var) {
            objP2 = new f15((byte) 9, j);
            fetVar.o0(objP2);
        }
        aad.e("VS", mm40VarE0, y9q0.a(y9q0Var, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), null, 0, false, 1, 0, (n4d) objP2, new n05(jpmVar2.b, y9q0Var.f42262a.b, idm0.t(2)), fetVar, 1572918, 184);
        fetVar.r(true);
        fetVar.r(false);
    }

    public static final void m(mm40 mm40Var, mwm mwmVar, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(694186478);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mwmVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (mwmVar.g) {
                fetVar.e0(1393280885);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1393281809);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(933930670, new wvm(mm40Var, mwmVar, (byte) 5), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm(b, i, mm40Var, mwmVar);
        }
    }

    public static final void n(mm40 mm40Var, h1n h1nVar, h1n h1nVar2, mpm mpmVar, String str, String str2, String str3, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        fetVar2.g0(700001117);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(h1nVar) ? 32 : 16) | (fetVar2.g(h1nVar2) ? 256 : 128) | (fetVar2.g(mpmVar) ? 2048 : 1024) | (fetVar2.g(str) ? 16384 : 8192) | (fetVar2.g(str2) ? 131072 : 65536) | (fetVar2.g(str3) ? 1048576 : 524288) | (fetVar2.e(0) ? 8388608 : 4194304);
        if (fetVar2.U(i2 & 1, (4793491 & i2) != 4793490)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
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
            int i3 = i2 & 8176;
            int i4 = i2 >> 9;
            z(null, h1nVar, h1nVar2, mpmVar, fetVar2, (57344 & i4) | i3);
            fetVar2 = fetVar2;
            if (str.length() <= 0 && str2.length() <= 0 && str3.length() <= 0) {
                fetVar2.e0(599015279);
                fetVar2.r(false);
            } else {
                fetVar2.e0(598840377);
                sj3.p(i4 & 8176, 1, fetVar2, null, str, str2, str3);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0(mm40Var, h1nVar, h1nVar2, mpmVar, str, str2, str3, i);
        }
    }

    public static final void o(mm40 mm40Var, f3v0 f3v0Var, bbn bbnVar, ezj ezjVar, gy40 gy40Var, Function2 function2, Function0 function0, Function0 function1, Function0 function3, fet fetVar, int i) {
        ezj ezjVar2;
        gy40 gy40Var2;
        Function0 function4;
        int i2;
        Function0 function5;
        gy40 gy40Var3;
        ezj ezjVar3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-226251004);
        int i3 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(f3v0Var) ? 32 : 16) | (fetVar2.g(bbnVar) ? 256 : 128) | 25600 | (fetVar2.i(function2) ? 131072 : 65536) | 1572864 | (fetVar2.i(function1) ? 8388608 : 4194304) | (fetVar2.i(function3) ? 67108864 : 33554432);
        if (fetVar2.U(i3 & 1, (38347923 & i3) != 38347922)) {
            fetVar2.Z();
            if ((i & 1) == 0 || fetVar2.B()) {
                ezj ezjVarX = v3c.X(fetVar2);
                int i4 = i3 & (-7169);
                Object objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = dw9.j(fetVar2);
                }
                gy40 gy40Var4 = (gy40) objP;
                Object objP2 = fetVar2.P();
                if (objP2 == cl5Var) {
                    objP2 = new ndm((byte) 29);
                    fetVar2.o0(objP2);
                }
                i2 = i4;
                function5 = (Function0) objP2;
                gy40Var3 = gy40Var4;
                ezjVar3 = ezjVarX;
            } else {
                fetVar2.X();
                ezjVar3 = ezjVar;
                gy40Var3 = gy40Var;
                i2 = i3 & (-7169);
                function5 = function0;
            }
            fetVar2.s();
            float f = xfn.a(fetVar2).c;
            if (f3v0Var.equals(c3v0.f3697a) || f3v0Var.equals(d3v0.f5423a) || f3v0Var.equals(e3v0.f7155a)) {
                zcl zclVar = qmk.f28987a;
                f = 8.0f;
            } else if (!f3v0Var.equals(b3v0.f1928a)) {
                t9f.b();
                return;
            }
            if (f3v0Var instanceof c3v0) {
                fetVar2.e0(-1439151641);
                r7x.k(mm40Var, bbnVar, f, ezjVar3, gy40Var3, function2, fetVar2, (i2 & 14) | ((i2 >> 3) & 112) | 24576 | (i2 & 458752));
                fetVar2.r(false);
            } else {
                int i5 = i2;
                float f2 = f;
                if (f3v0Var instanceof b3v0) {
                    fetVar2.e0(-1438738566);
                    q7x.n(mm40Var, bbnVar, f2, ezjVar3, gy40Var3, function2, function5, function1, function3, fetVar2, 1572864 | (i5 & 14) | ((i5 >> 3) & 112) | 24576 | (i5 & 458752) | (i5 & 29360128) | (i5 & 234881024), 0);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else if (f3v0Var instanceof d3v0) {
                    fetVar2.e0(-1438163330);
                    u7x.m(mm40Var, bbnVar, f2, ezjVar3, gy40Var3, function2, function5, function1, function3, fetVar2, 1572864 | (i5 & 14) | ((i5 >> 3) & 112) | 24576 | (i5 & 458752) | (i5 & 29360128) | (i5 & 234881024));
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else {
                    if (!(f3v0Var instanceof e3v0)) {
                        throw b1j.f(1616142940, fetVar2, false);
                    }
                    fetVar2.e0(-1437589024);
                    a8k0.j(mm40Var, bbnVar, f2, ezjVar3, gy40Var3, function2, fetVar2, (i5 & 14) | ((i5 >> 3) & 112) | 24576 | (i5 & 458752));
                    fetVar2.r(false);
                }
            }
            ezjVar2 = ezjVar3;
            gy40Var2 = gy40Var3;
            function4 = function5;
        } else {
            fetVar2.X();
            ezjVar2 = ezjVar;
            gy40Var2 = gy40Var;
            function4 = function0;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j0a0(mm40Var, f3v0Var, bbnVar, ezjVar2, gy40Var2, function2, function4, function1, function3, i, (byte) 2);
        }
    }

    public static final void p(v5o0 v5o0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-2029147560);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(v5o0Var) ? 4 : 2) | i;
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
                objP2 = d5o.f5517a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4) | fetVar.i(list);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new f8m((Object) context, (Object) v5o0Var, (Object) list, (byte) 7);
                fetVar.o0(objP3);
            }
            y860.f(xdrVar, null, (Function1) objP3, fetVar, 6, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(v5o0Var, i, (byte) 3);
        }
    }

    public static final void q(mm40 mm40Var, wdo wdoVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1765014683);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(wdoVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new mmn((byte) 17);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarD, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarK, 8.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(wdoVar.b, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 4.0f, 7), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(g1t0.d(), fetVar2), fetVar, 0, 0, 131068);
            v8q0.a(wdoVar.c, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(g1t0.d(), fetVar), fetVar, 0, 0, 131070);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(mm40Var, wdoVar, i, (byte) 16);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final void r(mm40 mm40Var, boolean z, h1n h1nVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        ?? r0;
        fetVar.g0(-1831417069);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(h1nVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.o, (byte) 12)), gqw0.k, fetVar, 48);
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
            String str = h1nVar.f12292a;
            c280 c280Var = h1nVar.b;
            v8q0.a(str, new x7z(1.0f, true), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), new n05(qmk.q, g1t0.d().f42262a.b, qmk.n), 0L, null, null, g1t0.d().f42262a.f, 0L, new f2q0(6), 0L, 2, false, 3, 0, null, g1t0.d(), fetVar, 0, 24960, 109424);
            fetVar2 = fetVar;
            fetVar2.e0(1670122200);
            boolean zG = fetVar2.g(c280Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.h, c280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            tj30 tj30VarC = zq8.c(gqw0.i, false);
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
            boolean zG2 = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                r0 = 1;
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            } else {
                r0 = 1;
            }
            kkb.p(r0, fetVar2, null, (Function0) objP2);
            if (z) {
                fetVar2.e0(1290885385);
                vic.e(ffb0.Q(jm40Var, 4.0f, 4.0f), y0m.f41813a, fetVar2, 48, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1291180970);
                fetVar2.r(false);
            }
            ohs0.x(fetVar2, r0, false, r0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l1n(mm40Var, z, h1nVar, i, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static final void s(mm40 mm40Var, pw3 pw3Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i, int i2) {
        pw3 qw3Var;
        Object obj;
        ?? r3;
        int i3;
        Unit unit;
        Unit unit2;
        byte b = 14;
        if ((i2 & 2) != 0) {
            zcl zclVar = qmk.f28987a;
            qw3Var = new qw3(2.0f, true, new jf4(b));
        } else {
            qw3Var = pw3Var;
        }
        ugd ugdVar4 = (i2 & 4) != 0 ? null : ugdVar;
        ugd ugdVar5 = (i2 & 16) != 0 ? null : ugdVar3;
        long jM76getBlack700d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m76getBlack700d7_KjU();
        boolean zF = fetVar.f(jM76getBlack700d7_KjU);
        Object objP = fetVar.P();
        if (zF || objP == ukd.f35823a) {
            objP = new nme((byte) 28, jM76getBlack700d7_KjU);
            fetVar.o0(objP);
        }
        mm40 mm40VarK = rq8.K(mm40Var, (Function1) objP);
        x5d x5dVarA = w5d.a(qw3Var, gqw0.m, fetVar, 14 & ((i & 112) >> 3));
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
        jpm0.o(fetVar, x5dVarA, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
        Object obj2 = y5d.f42040a;
        if (ugdVar4 == null) {
            fetVar.e0(-1357443709);
            fetVar.r(false);
            r3 = 0;
            obj = obj2;
            i3 = 6;
            unit = null;
        } else {
            fetVar.e0(787495486);
            zcl zclVar2 = qmk.f28987a;
            obj = obj2;
            r3 = 0;
            i3 = 6;
            ugdVar4.j(obj, s5x0.L(s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13), 8.0f, 0.0f, 2), fetVar, Integer.valueOf(6 | (i & 896)));
            fetVar.r(false);
            unit = Unit.f46060a;
        }
        if (unit == null) {
            fetVar.e0(-1357288088);
            zcl zclVar3 = qmk.f28987a;
            zq8.a(r3, fetVar, o7k0.e(s5x0.L(s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7), 8.0f, 0.0f, 2), 28.0f));
            fetVar.r(r3);
        } else {
            fetVar.e0(787495360);
            fetVar.r(r3);
        }
        ugdVar2.j(obj, mm40VarD, fetVar, Integer.valueOf(((i >> 3) & 896) | 54));
        if (ugdVar5 == null) {
            fetVar.e0(-1356975392);
            fetVar.r(r3);
            unit2 = null;
        } else {
            fetVar.e0(787510593);
            zcl zclVar4 = qmk.f28987a;
            ugdVar5.j(obj, s5x0.L(s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7), 8.0f, 0.0f, 2), fetVar, Integer.valueOf(i3 | ((i >> 6) & 896)));
            fetVar.r(r3);
            unit2 = Unit.f46060a;
        }
        if (unit2 == null) {
            fetVar.e0(-1356816888);
            zcl zclVar5 = qmk.f28987a;
            zq8.a(r3, fetVar, o7k0.e(s5x0.L(s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7), 8.0f, 0.0f, 2), 12.0f));
            fetVar.r(r3);
        } else {
            fetVar.e0(787510374);
            fetVar.r(r3);
        }
        fetVar.r(true);
    }

    public static final void t(float f, fet fetVar, int i) {
        int i2;
        fetVar.g0(1638498510);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(o7k0.u(jm40Var, 0.0f, 434.0f, 1), 0.92f), 198.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            h97.s(lgb.J(o7k0.e(o7k0.d(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 198.0f), new ayf()), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new njw(f, i, b);
        }
    }

    public static final void u(ojw ojwVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-684922961);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ojwVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = ojwVar.b.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-1080964034);
                E(0, fetVar, s5x0.N(jm40Var, xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 0.0f, 10));
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(-1080956400);
                t(xfn.a(fetVar).c, fetVar, i2 & 14);
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(-1080965767, fetVar, false);
                }
                fetVar.e0(850256843);
                F(xfn.a(fetVar).c, fetVar, i2 & 14);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(ojwVar, i);
        }
    }

    public static final void v(String str, o0x o0xVar, boolean z, Function0 function0, fet fetVar, int i) {
        long backgroundContent;
        long background;
        long secondary;
        long jC;
        fet fetVar2 = fetVar;
        str.getClass();
        o0xVar.getClass();
        function0.getClass();
        fetVar2.g0(-22507504);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(o0xVar) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 48.0f);
            d6x d6xVar = (d6x) fetVar2.k(a6x.f338a);
            boolean z2 = (i2 & 7168) == 2048;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new unl(function0, (byte) 11);
                fetVar2.o0(objP);
            }
            mm40 mm40VarL = s5x0.L(phu0.F(mm40VarE, null, d6xVar, false, null, (Function0) objP, fetVar2, 0, 13), 0.0f, 4.0f, 1);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            mm40 mm40VarE2 = o7k0.e(jm40Var, 40.0f);
            if (z) {
                backgroundContent = cs0.e(fetVar2, 2104902609, fetVar2, false);
            } else {
                fetVar2.e0(2104903611);
                backgroundContent = afn0.m(fetVar2).getBackgroundContent();
                fetVar2.r(false);
            }
            mm40 mm40VarQ = i120.Q(mm40VarE2, backgroundContent, vgg0.a(360.0f));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            mm40 mm40VarN = o7k0.n(s5x0.J(jm40Var, 4.0f), 32.0f);
            if (z) {
                fetVar2.e0(1831351147);
                background = afn0.p(fetVar2).m123getWhite0d7_KjU();
            } else {
                fetVar2.e0(1831352080);
                background = afn0.m(fetVar2).getBackground();
            }
            fetVar2.r(false);
            mm40 mm40VarQ2 = i120.Q(mm40VarN, background, vgg0.a(360.0f));
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ2);
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
            mm40 mm40VarJ = s5x0.J(jm40Var, 4.0f);
            if (z) {
                secondary = cs0.e(fetVar2, -1259912281, fetVar2, false);
            } else {
                fetVar2.e0(-1259911287);
                secondary = afn0.m(fetVar2).getSecondary();
                fetVar2.r(false);
            }
            a(mm40VarJ, secondary, o0xVar, a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar2), null, null, fetVar, ((i2 << 3) & 896) | 12845056);
            fetVar.r(true);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 4.0f, 0.0f, 16.0f, 0.0f, 10);
            if (z) {
                fetVar.e0(1831378379);
                jC = afn0.p(fetVar).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else {
                jC = rz4.c(fetVar, 1831379313, fetVar, false);
            }
            v8q0.a(str, mm40VarN2, jC, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, h97.g(fetVar), fetVar, i2 & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0(str, o0xVar, z, function0, i);
        }
    }

    public static final void w(mm40 mm40Var, String str, dkk dkkVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1397596097);
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
            v8q0.a(str, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i2 >> 3) & 14, 24960, 110584);
            fetVar2 = fetVar;
            x(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), R.drawable.ic_glyph_cyber_kosti_one, dkkVar.f6234a, dkkVar.b, dkkVar.c, fetVar2, 0, 0);
            x(null, R.drawable.ic_glyph_cyber_kosti_two, dkkVar.d, dkkVar.e, dkkVar.f, fetVar2, 0, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kwm(mm40Var, str, dkkVar, i, (byte) 1);
        }
    }

    public static final void x(mm40 mm40Var, int i, String str, String str2, String str3, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        fet fetVar2 = fetVar;
        fetVar2.g0(2039296476);
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
            mm40 mm40VarE = o7k0.e(mm40Var2, 20.0f);
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
            dww.c(pm80VarF, "", mm40VarN, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar, 56, 0);
            C((i7 & 112) | 3072, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fetVar, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), str, false);
            C(((i6 >> 6) & 112) | 3072, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fetVar, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), str2, false);
            qxw.o(fetVar, i120.Q(o7k0.c(o7k0.s(s5x0.N(jm40Var, 4.0f, 2.0f, 0.0f, 2.0f, 4), 1.0f), 1.0f), ((ThemeColors) fetVar.k(zfnVar)).getSeparator(), jd8.n));
            fetVar2 = fetVar;
            C(((i6 >> 9) & 112) | 3072, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), fetVar2, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), str3, true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lwm(mm40Var2, i, str, str2, str3, i2, i3, (byte) 1);
        }
    }

    public static final void y(mm40 mm40Var, String str, mpm mpmVar, boolean z, fet fetVar, int i) {
        fetVar.g0(-1659602417);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(mpmVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 6.0f, 7), 28.0f);
            tj30 tj30VarC = zq8.c(gqw0.b, false);
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
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i2 >> 3) & 14, 24960, 110586);
            fetVar.r(true);
            l(null, mpmVar, z, fetVar, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0((byte) 25, i, (Object) mm40Var, (Object) str, (Object) mpmVar, z);
        }
    }

    public static final void z(mm40 mm40Var, h1n h1nVar, h1n h1nVar2, mpm mpmVar, fet fetVar, int i) {
        mm40 mm40Var2;
        x0m x0mVar = x0m.f40076a;
        fetVar.g0(-136445970);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(h1nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(h1nVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(mpmVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.e(0) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarD, 54.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarG);
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
            x0m x0mVar2 = x0m.f40076a;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            r(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, h1nVar, fetVar, (i2 << 3) & 896);
            l(null, mpmVar, true, fetVar, 1);
            x0m x0mVar3 = x0m.f40076a;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            D(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, h1nVar2, fetVar, i2 & 896);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i(mm40Var2, h1nVar, h1nVar2, mpmVar, i);
        }
    }
}
