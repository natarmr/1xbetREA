package a;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.javax.sip.message.Response;
import android.os.Build;
import android.util.Log;
import android.view.Window;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wb {
    public static final ugd g;
    public static final ugd i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f38851a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final int[] b = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] c = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] d = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] e = {R.attr.name, R.attr.pathData};
    public static final ugd f = new ugd(-341038929, false, new i5b(8));
    public static final ugd h = new ugd(-1308852678, false, new ehd(22));
    public static final ugd j = new ugd(-1759434350, false, new shd(5));
    public static final int[] k = {0, 0, 0, 0, 0, 4096, 9216, 21504, 35840, 44032, 53248, 63488, 74752, 87040, 93696, 100864, 104704, 106752, 108928, 113536, 115968, 118528, 119872, 121280, 122016};
    public static final int[] l = {0, 0, 0, 0, 10, 10, 11, 11, 10, 10, 10, 10, 10, 9, 9, 8, 7, 7, 8, 7, 7, 6, 6, 5, 5};
    public static final ar20 m = new ar20("MARKDOWN_FILE");
    public static final ar20 n = new ar20("UNORDERED_LIST");
    public static final ar20 o = new ar20("ORDERED_LIST");
    public static final ar20 p = new ar20("LIST_ITEM");
    public static final ar20 q = new ar20("BLOCK_QUOTE");
    public static final ar20 r = new ar20("CODE_FENCE");
    public static final ar20 s = new ar20("CODE_BLOCK");
    public static final ar20 t = new ar20("CODE_SPAN");
    public static final ar20 u = new ar20("HTML_BLOCK");
    public static final ar20 v = new ar20("PARAGRAPH", true);
    public static final ar20 w = new ar20("EMPH");
    public static final ar20 x = new ar20("STRONG");
    public static final ar20 y = new ar20("LINK_DEFINITION");
    public static final ar20 z = new ar20("LINK_LABEL", true);
    public static final ar20 A = new ar20("LINK_DESTINATION", true);
    public static final ar20 B = new ar20("LINK_TITLE", true);
    public static final ar20 C = new ar20("LINK_TEXT", true);
    public static final ar20 D = new ar20("INLINE_LINK");
    public static final ar20 E = new ar20("FULL_REFERENCE_LINK");
    public static final ar20 F = new ar20("SHORT_REFERENCE_LINK");
    public static final ar20 G = new ar20("IMAGE");
    public static final ar20 H = new ar20("AUTOLINK");
    public static final ar20 I = new ar20("SETEXT_1");
    public static final ar20 J = new ar20("SETEXT_2");
    public static final ar20 K = new ar20("ATX_1");
    public static final ar20 L = new ar20("ATX_2");
    public static final ar20 M = new ar20("ATX_3");
    public static final ar20 N = new ar20("ATX_4");
    public static final ar20 O = new ar20("ATX_5");
    public static final ar20 P = new ar20("ATX_6");

    static {
        byte b2 = 15;
        g = new ugd(1492715426, false, new bhd(b2));
        i = new ugd(-347242982, false, new mhd(b2));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029f  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:109:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x0232  */
    /* JADX WARN: Code duplicated, block: B:88:0x0236  */
    /* JADX WARN: Code duplicated, block: B:91:0x025f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0263  */
    /* JADX WARN: Code duplicated, block: B:95:0x0294  */
    /* JADX WARN: Code duplicated, block: B:96:0x0296  */
    public static final void A(mm40 mm40Var, lyo0 lyo0Var, e2d e2dVar, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        pcy pcyVar;
        cl5 cl5Var;
        cl5 cl5Var2;
        byte b2;
        cl5 cl5Var3;
        pcy pcyVar2;
        Object objP;
        boolean z2;
        Object objP2;
        boolean z3;
        Object objP3;
        boolean z4;
        Object objP4;
        lyo0 lyo0Var2 = lyo0Var;
        fet fetVar2 = fetVar;
        lyo0Var2.getClass();
        e2dVar.getClass();
        function1.getClass();
        fetVar2.g0(1880914133);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(lyo0Var2) ? 32 : 16) | (fetVar2.g(e2dVar) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 & 7168;
            boolean z5 = i4 == 2048;
            Object objP5 = fetVar2.P();
            cl5 cl5Var4 = ukd.f35823a;
            if (z5 || objP5 == cl5Var4) {
                objP5 = new gno0(function1, (byte) 18);
                fetVar2.o0(objP5);
            }
            Function0 function0 = (Function0) objP5;
            boolean z6 = i4 == 2048;
            Object objP6 = fetVar2.P();
            if (z6 || objP6 == cl5Var4) {
                objP6 = new gno0(function1, (byte) 19);
                fetVar2.o0(objP6);
            }
            v3c.A(function0, (Function0) objP6, null, fetVar, 0, 4);
            Context context = (Context) fetVar.k(dy2.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            boolean zC = pkd.c(fetVar);
            int i5 = i3 & 896;
            boolean zH = fetVar.h(zC) | (i5 == 256);
            Object objP7 = fetVar.P();
            if (zH || objP7 == cl5Var4) {
                objP7 = jgk0.b(new rd7(zC, (Object) e2dVar, (byte) 21));
                fetVar.o0(objP7);
            }
            l7m0 l7m0Var = (l7m0) objP7;
            Boolean boolValueOf = Boolean.valueOf(zC);
            Boolean bool = (Boolean) l7m0Var.getValue();
            bool.booleanValue();
            boolean zI = fetVar.i(window) | fetVar.i(context) | fetVar.g(l7m0Var) | fetVar.h(zC);
            Object objP8 = fetVar.P();
            if (zI || objP8 == cl5Var4) {
                objP8 = new h5b(window, context, zC, l7m0Var, (byte) 2);
                fetVar.o0(objP8);
            }
            s0x.e(boolValueOf, bool, null, (Function1) objP8, fetVar, 0, 4);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z7 = fetVar.S;
            pcy pcyVar3 = e7z.u1;
            if (z7) {
                fetVar.l(pcyVar3);
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
            q6n q6nVar = lyo0Var2.f20873a;
            boolean z8 = i4 == 2048;
            Object objP9 = fetVar.P();
            if (z8) {
                pcyVar = pcyVar3;
                cl5Var = cl5Var4;
            } else {
                pcyVar = pcyVar3;
                cl5Var = cl5Var4;
                if (objP9 != cl5Var) {
                    cl5Var2 = cl5Var;
                    b2 = 1;
                }
                Function1 function2 = (Function1) objP9;
                cl5Var3 = cl5Var2;
                pcyVar2 = pcyVar;
                ntb.s(null, q6nVar, e2dVar, function2, fetVar, i5);
                objP = fetVar.P();
                if (objP == cl5Var3) {
                    objP = new t330((byte) 14);
                    fetVar.o0(objP);
                }
                mm40 mm40VarQ = knx.Q(n0qVar, (xdr) objP);
                if (i5 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var3) {
                    objP2 = new o6n(e2dVar, (byte) 5);
                    fetVar.o0(objP2);
                }
                int i6 = (i3 >> 3) & 112;
                mm40 mm40VarC = nip.c(i120.Q(i4w0.T(mm40VarQ, (Function1) objP2), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), e2dVar, fetVar, i6);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarC);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar2);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, n0qVar);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar2);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar);
                jpm0.o(fetVar, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                float f2 = xfn.a(fetVar).d;
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarK = s5x0.K(mm40VarD, f2, 12.0f);
                lyo0Var2 = lyo0Var;
                dxh0 dxh0Var = lyo0Var2.c;
                a4x a4xVar = lyo0Var2.b;
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP3 = fetVar.P();
                if (z3 || objP3 == cl5Var3) {
                    objP3 = new nxo0(lyo0Var2, (byte) 2);
                    fetVar.o0(objP3);
                }
                Function0 function3 = (Function0) objP3;
                z4 = i4 == 2048;
                objP4 = fetVar.P();
                if (z4 || objP4 == cl5Var3) {
                    objP4 = new coo0(function1, (byte) 2);
                    fetVar.o0(objP4);
                }
                ibc.n(mm40VarK, a4xVar, gxh0.f12078a, dxh0Var, false, function3, (Function1) objP4, fetVar, 384, 16);
                ugdVar.O(y5d.f42040a, e2dVar, lyo0Var2.d, fetVar, Integer.valueOf(i6 | 3078));
                fetVar2 = fetVar;
                ohs0.x(fetVar2, true, true, true);
            }
            cl5Var2 = cl5Var;
            b2 = 1;
            objP9 = new coo0(function1, b2);
            fetVar.o0(objP9);
            Function1 function4 = (Function1) objP9;
            cl5Var3 = cl5Var2;
            pcyVar2 = pcyVar;
            ntb.s(null, q6nVar, e2dVar, function4, fetVar, i5);
            objP = fetVar.P();
            if (objP == cl5Var3) {
                objP = new t330((byte) 14);
                fetVar.o0(objP);
            }
            mm40 mm40VarQ2 = knx.Q(n0qVar, (xdr) objP);
            if (i5 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP2 = fetVar.P();
            if (z2) {
                objP2 = new o6n(e2dVar, (byte) 5);
                fetVar.o0(objP2);
            } else {
                objP2 = new o6n(e2dVar, (byte) 5);
                fetVar.o0(objP2);
            }
            int i7 = (i3 >> 3) & 112;
            mm40 mm40VarC3 = nip.c(i120.Q(i4w0.T(mm40VarQ2, (Function1) objP2), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), e2dVar, fetVar, i7);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarC3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC5 = kbc.c0(fetVar, n0qVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA3, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC5, shdVar4);
            mm40 mm40VarD2 = o7k0.d(jm40.b, 1.0f);
            float f3 = xfn.a(fetVar).d;
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarK2 = s5x0.K(mm40VarD2, f3, 12.0f);
            lyo0Var2 = lyo0Var;
            dxh0 dxh0Var2 = lyo0Var2.c;
            a4x a4xVar2 = lyo0Var2.b;
            if ((i3 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objP3 = fetVar.P();
            if (z3) {
                objP3 = new nxo0(lyo0Var2, (byte) 2);
                fetVar.o0(objP3);
            } else {
                objP3 = new nxo0(lyo0Var2, (byte) 2);
                fetVar.o0(objP3);
            }
            Function0 function5 = (Function0) objP3;
            if (i4 == 2048) {
            }
            objP4 = fetVar.P();
            if (z4) {
                objP4 = new coo0(function1, (byte) 2);
                fetVar.o0(objP4);
            } else {
                objP4 = new coo0(function1, (byte) 2);
                fetVar.o0(objP4);
            }
            ibc.n(mm40VarK2, a4xVar2, gxh0.f12078a, dxh0Var2, false, function5, (Function1) objP4, fetVar, 384, 16);
            ugdVar.O(y5d.f42040a, e2dVar, lyo0Var2.d, fetVar, Integer.valueOf(i7 | 3078));
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tvl0((Object) mm40Var, (Object) lyo0Var2, (Object) e2dVar, (Object) function1, (Object) ugdVar, i2, (byte) 3);
        }
    }

    public static final void B(int i2, fet fetVar) {
        fetVar.g0(-2131942075);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            v8q0.a(rsm0.w(org.xbet.client1.R.string.cs2_decider_map, 0, fetVar), s5x0.N(mm40VarD, 2.0f, 0.0f, 2.0f, 4.0f, 2), StaticColors.INSTANCE.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ksc0(i2, (byte) 17);
        }
    }

    public static final void C(String str, fet fetVar, int i2) {
        int i3;
        String str2;
        fet fetVar2;
        fetVar.g0(444823543);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            long jM130getWhite600d7_KjU = StaticColors.INSTANCE.m130getWhite600d7_KjU();
            pge pgeVar = gqw0.A;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            str2 = str;
            fetVar2 = fetVar;
            lgb.v(o7k0.n(jm40Var, 16.0f), o7k0.n(jm40Var, 16.0f), str2, org.xbet.client1.R.drawable.ic_glyph_circle_globe, jM130getWhite600d7_KjU, pgeVar, fetVar2, ((i3 << 6) & 896) | 196608, 0);
        } else {
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v((byte) 12, i2, str2);
        }
    }

    public static final void D(int i2, fet fetVar, oud0 oud0Var, String str) {
        int i3;
        fetVar.g0(-965096560);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(oud0Var.ordinal()) ? 32 : 16;
        }
        byte b2 = 18;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = Integer.valueOf(oud0Var == oud0.b ? org.xbet.client1.R.drawable.ic_glyph_cyber_color_cross : org.xbet.client1.R.drawable.ic_glyph_cyber_color_checkmark);
                fetVar.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.j, fetVar, 6);
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
            C(str, fetVar, i3 & 14);
            j0x.b(a8k0.F(iIntValue, 6, fetVar), null, o7k0.n(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), null, null, 0.0f, null, fetVar, 56, 120);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680(str, oud0Var, i2, b2);
        }
    }

    public static final void E(vdj0 vdj0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-137605270);
        int i3 = (fetVar.g(vdj0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new y7(function1, (byte) 9);
                fetVar.o0(objP);
            }
            p7x.m((Function1) objP, vdj0Var, H(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vdj0Var.getFirst(), vdj0Var.getLast()), fetVar, (i3 << 3) & 112);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(vdj0Var, function1, i2, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void F(l7m0 l7m0Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        boolean z2;
        a4x a4xVar;
        int i3;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar2.g0(-2043015060);
        byte b2 = 4;
        int i4 = i2 | (fetVar2.g(l7m0Var) ? 4 : 2) | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            Object[] objArr = new Object[0];
            int i5 = i4 & 14;
            ?? r11 = i5 == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (r11 != false || objP == cl5Var) {
                objP = new ojr0(l7m0Var, (byte) 25);
                fetVar2.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar2);
            Object[] objArr2 = new Object[0];
            ?? r12 = i5 == 4;
            Object objP2 = fetVar2.P();
            if (r12 != false || objP2 == cl5Var) {
                objP2 = new ojr0(l7m0Var, (byte) 26);
                fetVar2.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar2);
            Object[] objArr3 = new Object[0];
            ?? r13 = i5 == 4;
            Object objP3 = fetVar2.P();
            if (r13 != false || objP3 == cl5Var) {
                objP3 = new ojr0(l7m0Var, (byte) 27);
                fetVar2.o0(objP3);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP3, fetVar2);
            int i6 = (i4 << 3) & 896;
            xcz xczVarB = qdzVar.b(((z8t0) l7m0VarY2.getValue()).getKey(), new i9t0(b2), fetVar2, i6);
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarX = yyw.X(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n), null, fetVar2, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarX);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            imm immVar = ((gat0) l7m0VarY.getValue()).f10987a;
            int i7 = i4 & 896;
            boolean z3 = i7 == 256;
            Object objP4 = fetVar2.P();
            byte b3 = 28;
            if (z3 || objP4 == cl5Var) {
                objP4 = new nas0(function1, b3);
                fetVar2.o0(objP4);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP4, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            fetVar2 = fetVar;
            mbt0 mbt0Var = (mbt0) l7m0VarY3.getValue();
            if (Intrinsics.d(mbt0Var, kbt0.f18031a)) {
                fetVar2.e0(1432356016);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 8.0f, 1);
                z8t0 z8t0Var = (z8t0) l7m0VarY2.getValue();
                boolean z4 = i7 == 256;
                Object objP5 = fetVar2.P();
                if (z4 || objP5 == cl5Var) {
                    i3 = 0;
                    objP5 = new sbt0(function1, 0 == true ? 1 : 0);
                    fetVar2.o0(objP5);
                } else {
                    i3 = 0;
                }
                idm0.i(mm40VarL, z8t0Var, (Function1) objP5, fetVar2, 0, 0);
                Object[] objArr4 = new Object[i3];
                ?? r6 = i5 == 4 ? 1 : i3;
                Object objP6 = fetVar2.P();
                if (r6 != 0 || objP6 == cl5Var) {
                    objP6 = new ojr0(l7m0Var, (byte) 28);
                    fetVar2.o0(objP6);
                }
                l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP6, fetVar2);
                Object[] objArr5 = new Object[i3];
                ?? r9 = i5 == 4 ? 1 : i3;
                Object objP7 = fetVar2.P();
                if (r9 != 0 || objP7 == cl5Var) {
                    objP7 = new ojr0(l7m0Var, (byte) 29);
                    fetVar2.o0(objP7);
                }
                z2 = true;
                u(null, xczVarB, qdzVar, l7m0VarY4, v3c.Y(objArr5, (Function0) objP7, fetVar2), function1, fetVar2, i6 | ((i4 << 9) & 458752));
                function2 = function1;
                fetVar2 = fetVar2;
                fetVar2.r(i3);
            } else {
                z2 = true;
                function2 = function1;
                byte b4 = 0;
                if (!(mbt0Var instanceof lbt0)) {
                    throw b1j.f(1431676159, fetVar2, false);
                }
                fetVar2.e0(1433192923);
                z8t0 z8t0Var2 = (z8t0) l7m0VarY2.getValue();
                x8t0 x8t0Var = z8t0Var2 instanceof x8t0 ? (x8t0) z8t0Var2 : null;
                if (x8t0Var != null) {
                    cpm cpmVar = x8t0Var.b;
                    apm apmVar = cpmVar instanceof apm ? (apm) cpmVar : null;
                    if (apmVar == null || (a4xVar = apmVar.f1259a) == null || !(!a4xVar.isEmpty())) {
                        fetVar2.e0(1433718528);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1433279351);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarL2 = s5x0.L(jm40Var, 0.0f, 8.0f, 1);
                        z8t0 z8t0Var3 = (z8t0) l7m0VarY2.getValue();
                        ?? r10 = i7 == 256;
                        Object objP8 = fetVar2.P();
                        if (r10 != false || objP8 == cl5Var) {
                            objP8 = new sbt0(function2, z2 ? (byte) 1 : (byte) 0);
                            fetVar2.o0(objP8);
                        }
                        idm0.i(mm40VarL2, z8t0Var3, (Function1) objP8, fetVar2, 0, 0);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.e0(1433718528);
                    fetVar2.r(false);
                }
                Object[] objArr6 = new Object[0];
                boolean zI = fetVar2.i(mbt0Var);
                Object objP9 = fetVar2.P();
                if (zI || objP9 == cl5Var) {
                    objP9 = new rbt0((lbt0) mbt0Var, b4);
                    fetVar2.o0(objP9);
                }
                j(v3c.Y(objArr6, (Function0) objP9, fetVar2), function2, fetVar2, (i4 >> 3) & 112);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn(l7m0Var, qdzVar, function2, i2, (byte) 10);
        }
    }

    public static Bitmap G(Bitmap bitmap, float f2) {
        int i2;
        int i3;
        bitmap.getClass();
        int i4 = 0;
        Bitmap bitmapCreateScaledBitmap = f2 == 0.0f ? bitmap : Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * f2), Math.round(bitmap.getHeight() * f2), false);
        bitmapCreateScaledBitmap.getClass();
        Bitmap.Config config = bitmapCreateScaledBitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        boolean z2 = true;
        Bitmap bitmapCopy = bitmapCreateScaledBitmap.copy(config, true);
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i5 = width * height;
        int[] iArr = new int[i5];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i6 = width - 1;
        int i7 = height - 1;
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[i5];
        int[] iArr4 = new int[i5];
        int[] iArr5 = new int[Math.max(width, height)];
        int[] iArr6 = new int[9216];
        for (int i8 = 0; i8 < 9216; i8++) {
            iArr6[i8] = i8 / 36;
        }
        char c2 = 11;
        int[][] iArr7 = new int[11][];
        int i9 = 0;
        while (i9 < 11) {
            iArr7[i9] = new int[3];
            i9++;
            z2 = z2;
        }
        boolean z3 = z2;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            char c3 = c2;
            if (i10 >= height) {
                break;
            }
            int i13 = i4;
            int i14 = i13;
            int i15 = i14;
            int i16 = i15;
            int i17 = i16;
            int i18 = i17;
            int i19 = i18;
            int i20 = i19;
            int i21 = -5;
            int i22 = i20;
            for (int i23 = 5; i21 <= i23; i23 = 5) {
                int[] iArr8 = iArr4;
                int i24 = iArr[Math.min(i6, Math.max(i21, 0)) + i11];
                int[] iArr9 = iArr7[i21 + 5];
                iArr9[0] = (i24 & 16711680) >> 16;
                iArr9[z3 ? 1 : 0] = (i24 & 65280) >> 8;
                iArr9[2] = i24 & 255;
                int iAbs = 6 - Math.abs(i21);
                int i25 = iArr9[0];
                i22 = (i25 * iAbs) + i22;
                int i26 = iArr9[z3 ? 1 : 0];
                i13 = (i26 * iAbs) + i13;
                int i27 = iArr9[2];
                i14 = (iAbs * i27) + i14;
                if (i21 > 0) {
                    i18 += i25;
                    i19 += i26;
                    i20 += i27;
                } else {
                    i15 += i25;
                    i16 += i26;
                    i17 += i27;
                }
                i21++;
                iArr4 = iArr8;
            }
            int[] iArr10 = iArr4;
            int i28 = 0;
            int i29 = 5;
            while (i28 < width) {
                iArr2[i11] = iArr6[i22];
                iArr3[i11] = iArr6[i13];
                iArr10[i11] = iArr6[i14];
                int i30 = i22 - i15;
                int i31 = i13 - i16;
                int i32 = i14 - i17;
                int[] iArr11 = iArr7[(i29 + 6) % 11];
                int i33 = i15 - iArr11[0];
                int i34 = i16 - iArr11[z3 ? 1 : 0];
                int i35 = i17 - iArr11[2];
                if (i10 == 0) {
                    i3 = i28;
                    iArr5[i3] = Math.min(i3 + 6, i6);
                } else {
                    i3 = i28;
                }
                int i36 = iArr[i12 + iArr5[i3]];
                int i37 = (i36 & 16711680) >> 16;
                iArr11[0] = i37;
                int i38 = (i36 & 65280) >> 8;
                iArr11[z3 ? 1 : 0] = i38;
                int i39 = i36 & 255;
                iArr11[2] = i39;
                int i40 = i18 + i37;
                int i41 = i19 + i38;
                int i42 = i20 + i39;
                i22 = i30 + i40;
                i13 = i31 + i41;
                i14 = i32 + i42;
                i29 = (i29 + 1) % 11;
                int[] iArr12 = iArr7[i29 % 11];
                int i43 = iArr12[0];
                i15 = i33 + i43;
                int i44 = iArr12[z3 ? 1 : 0];
                i16 = i34 + i44;
                int i45 = iArr12[2];
                i17 = i35 + i45;
                i18 = i40 - i43;
                i19 = i41 - i44;
                i20 = i42 - i45;
                i11++;
                i28 = i3 + 1;
            }
            i12 += width;
            i10++;
            c2 = c3;
            iArr4 = iArr10;
            i4 = 0;
        }
        int[] iArr13 = iArr4;
        for (int i46 = 0; i46 < width; i46++) {
            int i47 = (-5) * width;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            for (int i57 = -5; i57 <= 5; i57++) {
                int iMax = Math.max(0, i47) + i46;
                int[] iArr14 = iArr7[i57 + 5];
                iArr14[0] = iArr2[iMax];
                iArr14[z3 ? 1 : 0] = iArr3[iMax];
                iArr14[2] = iArr13[iMax];
                int iAbs2 = 6 - Math.abs(i57);
                i55 = (iArr2[iMax] * iAbs2) + i55;
                i56 = (iArr3[iMax] * iAbs2) + i56;
                i48 = (iArr13[iMax] * iAbs2) + i48;
                if (i57 > 0) {
                    i52 += iArr14[0];
                    i53 += iArr14[z3 ? 1 : 0];
                    i54 += iArr14[2];
                } else {
                    i49 += iArr14[0];
                    i50 += iArr14[z3 ? 1 : 0];
                    i51 += iArr14[2];
                }
                if (i57 < i7) {
                    i47 += width;
                }
            }
            int i58 = i55;
            int i59 = i56;
            int i60 = 0;
            int i61 = 5;
            int i62 = i46;
            while (i60 < height) {
                iArr[i62] = (iArr[i62] & (-16777216)) | (iArr6[i58] << 16) | (iArr6[i59] << 8) | iArr6[i48];
                int i63 = i58 - i49;
                int i64 = i59 - i50;
                int i65 = i48 - i51;
                int[] iArr15 = iArr7[(i61 + 6) % 11];
                int i66 = i49 - iArr15[0];
                int i67 = i50 - iArr15[z3 ? 1 : 0];
                int i68 = i51 - iArr15[2];
                if (i46 == 0) {
                    i2 = i60;
                    iArr5[i2] = Math.min(i2 + 6, i7) * width;
                } else {
                    i2 = i60;
                }
                int i69 = iArr5[i2] + i46;
                int i70 = iArr2[i69];
                iArr15[0] = i70;
                int i71 = iArr3[i69];
                iArr15[z3 ? 1 : 0] = i71;
                int i72 = iArr13[i69];
                iArr15[2] = i72;
                int i73 = i52 + i70;
                int i74 = i53 + i71;
                int i75 = i54 + i72;
                i58 = i63 + i73;
                i59 = i64 + i74;
                i48 = i65 + i75;
                i61 = (i61 + 1) % 11;
                int[] iArr16 = iArr7[i61];
                int i76 = iArr16[0];
                i49 = i66 + i76;
                int i77 = iArr16[z3 ? 1 : 0];
                i50 = i67 + i77;
                int i78 = iArr16[2];
                i51 = i68 + i78;
                i52 = i73 - i76;
                i53 = i74 - i77;
                i54 = i75 - i78;
                i62 += width;
                i60 = i2 + 1;
            }
        }
        bitmapCopy.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCopy;
    }

    public static final mm40 H(long j2, boolean z2, boolean z3) {
        jm40 jm40Var = jm40.b;
        if (z2 && z3) {
            zcl zclVar = qmk.f28987a;
            return i120.Q(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), j2, vgg0.a(16.0f));
        }
        if (z2) {
            zcl zclVar2 = qmk.f28987a;
            return i120.Q(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), j2, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12));
        }
        if (z3) {
            zcl zclVar3 = qmk.f28987a;
            return s5x0.N(i120.Q(jm40Var, j2, vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3)), 24.0f, 0.0f, 0.0f, 0.0f, 14);
        }
        mm40 mm40VarQ = i120.Q(jm40Var, j2, jd8.n);
        zcl zclVar4 = qmk.f28987a;
        return s5x0.N(mm40VarQ, 24.0f, 0.0f, 0.0f, 0.0f, 14);
    }

    public static final mtl I(ad2 ad2Var, ctf0 ctf0Var) {
        ad2Var.getClass();
        ctf0Var.getClass();
        boolean z2 = ad2Var.c;
        Set set = ad2Var.b;
        if (!z2) {
            return null;
        }
        lul lulVar = lul.e;
        oe9 oe9Var = oe9.f25112a;
        Set set2 = set;
        Object[] objArr = {Integer.valueOf(set2.size()), 10};
        lsm0 lsm0Var = ctf0Var.b;
        return new mtl(dyb.g0(new itl(new wul(lulVar, oe9Var, new ue9(lsm0Var.a(org.xbet.client1.R.string.select_items_max, Arrays.copyOf(objArr, 2))), !set2.isEmpty(), false, false), sh00.b), new itl(new wul(nul.e, oe9Var, new ue9(lsm0Var.a(org.xbet.client1.R.string.cancel, Arrays.copyOf(new Object[0], 0))), true, false, false), sh00.f32186a)));
    }

    public static final boolean J(zy9 zy9Var, String str) throws nbx {
        str.getClass();
        zy9Var.getClass();
        if (Intrinsics.d(Build.FINGERPRINT, "robolectric")) {
            if (!l8x.f0("CXCP")) {
                return true;
            }
            Log.d("CXCP", "isBackwardCompatible method returns true because robolectric build detected.");
            return true;
        }
        try {
            g0a.a(str);
            c1a c1aVarB = zy9.b(zy9Var, str);
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            key.getClass();
            int[] iArr = (int[]) ((ow9) c1aVarB).c(key);
            if (iArr != null) {
                return tx3.w(iArr, 0);
            }
            return false;
        } catch (CameraAccessException e2) {
            if (l8x.g0()) {
                Log.e("CXCP", "Error while accessing metadata for cameraID: ".concat(str), e2);
            }
            throw new nbx(e2);
        }
    }

    public static mm40 K(mm40 mm40Var, pm80 pm80Var, u12 u12Var, qge qgeVar, float f2, a4d a4dVar, int i2) {
        if ((i2 & 4) != 0) {
            u12Var = gqw0.e;
        }
        u12 u12Var2 = u12Var;
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        }
        return mm40Var.e(new qm80(pm80Var, u12Var2, qgeVar, f2, a4dVar));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public static final int L(xwh0 xwh0Var, int i2) {
        int i3;
        int[] iArr = xwh0Var.f;
        int i4 = i2 + 1;
        int length = xwh0Var.e.length - 1;
        int i5 = 0;
        while (i5 <= length) {
            i3 = (i5 + length) >>> 1;
            int i6 = iArr[i3];
            if (i6 < i4) {
                i5 = i3 + 1;
            } else {
                if (i6 <= i4) {
                    if (i3 >= 0) {
                        return i3;
                    }
                    return ~i3;
                }
                length = i3 - 1;
            }
        }
        i3 = (-i5) - 1;
        if (i3 >= 0) {
            return i3;
        }
        return ~i3;
    }

    public static final an3 M(ne5 ne5Var, iy3 iy3Var) {
        String str;
        String str2;
        ne5Var.getClass();
        String str3 = ne5Var.f;
        String str4 = ne5Var.e;
        iy3Var.getClass();
        if (iy3Var instanceof ey3) {
            String str5 = ne5Var.c;
            if (str5 != null && (str2 = ne5Var.d) != null) {
                return new an3(str5, str2);
            }
        } else {
            if (iy3Var instanceof fy3) {
                if (str4 == null || str3 == null) {
                    return null;
                }
                return new an3(str4, str3);
            }
            if (!(iy3Var instanceof gy3)) {
                if (!(iy3Var instanceof hy3)) {
                    t9f.b();
                    return null;
                }
                if (str4 == null || str3 == null) {
                    return null;
                }
                return new an3(str4, str3);
            }
            String str6 = ne5Var.f23367a;
            if (str6 != null && (str = ne5Var.b) != null) {
                return new an3(str6, str);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d  */
    /* JADX WARN: Code duplicated, block: B:57:0x014b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0167  */
    /* JADX WARN: Code duplicated, block: B:68:0x0171  */
    public static final qx4 N(hx4 hx4Var, ctf0 ctf0Var, boolean z2) {
        boolean z3;
        String strA;
        String strA2;
        boolean z4;
        boolean z5;
        gx6 gx6Var;
        boolean z6;
        boolean z7;
        double d2;
        boolean z8;
        BigDecimal bigDecimal;
        boolean z9;
        boolean z10;
        double d3;
        ctf0Var.getClass();
        yyc yycVar = hx4Var.b;
        a8q0 a8q0Var = hx4Var.f13795a;
        bx6 bx6Var = hx4Var.c;
        tw6 tw6Var = bx6Var.b;
        boolean z11 = tw6Var.n || z2;
        pn40 pn40Var = pn40.f27267a;
        BigDecimal bigDecimal2 = yycVar.d;
        boolean z12 = yycVar.f;
        BigDecimal bigDecimal3 = yycVar.f43459a;
        BigDecimal bigDecimal4 = yycVar.e;
        boolean z13 = z11;
        Object[] objArr = {pn40.c(bigDecimal2.doubleValue(), p3u0.c)};
        lsm0 lsm0Var = ctf0Var.b;
        nx6 nx6Var = new nx6(a8q0Var, lsm0Var.a(org.xbet.client1.R.string.bet_enter_coefficient_v2, Arrays.copyOf(objArr, 1)), false, false, false);
        if (!yycVar.g) {
            if (z12) {
                strA2 = lsm0Var.a(org.xbet.client1.R.string.max_coef_v2, Arrays.copyOf(new Object[]{pn40.g(bigDecimal4)}, 1));
            } else {
                z3 = false;
                strA = lsm0Var.a(org.xbet.client1.R.string.coupon_makebet_coef, Arrays.copyOf(new Object[0], 0));
            }
            pln0 pln0Var = new pln0(strA, true, z3);
            wnb0 wnb0Var = new wnb0("", "", z3);
            if (!z13 || bigDecimal3.compareTo(bigDecimal2) <= 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z13 || bigDecimal3.compareTo(bigDecimal4) >= 0) {
                z5 = false;
            } else {
                z5 = true;
            }
            kke kkeVar = new kke(true, true, z4, z5);
            if (z13) {
                gx6Var = gx6.c;
            } else if (z13) {
                gx6Var = gx6.b;
            } else {
                if (bigDecimal3.compareTo(bigDecimal2) >= 0 || bigDecimal3.compareTo(bigDecimal4) > 0) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (bigDecimal3.compareTo(new BigDecimal(String.valueOf(-1.0d))) == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((z6 && !z7) || z12) {
                    gx6Var = gx6.b;
                }
            }
            zv6 zv6Var = new zv6(nx6Var, pln0Var, wnb0Var, kkeVar, gx6Var, "", true);
            zv6 zv6VarB0 = ccq0.b0(bx6Var, ctf0Var, hx4Var.e, z2);
            hxo0 hxo0VarA = ktt0.A(hx4Var.d, tw6Var.f, z2);
            iul iulVar = iul.e;
            oe9 oe9Var = oe9.f25112a;
            ue9 ue9Var = new ue9(lsm0Var.a(org.xbet.client1.R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
            d2 = tw6Var.f34633a;
            if (d2 == -1.0d) {
                z8 = false;
            } else {
                d3 = tw6Var.d;
                double d4 = tw6Var.e;
                if (d3 <= d2 || d2 > d4) {
                    z8 = false;
                } else {
                    z8 = true;
                }
            }
            bigDecimal = yycVar.f43459a;
            if (!bigDecimal.equals(new BigDecimal(String.valueOf(-1.0d))) || bigDecimal.compareTo(yycVar.d) < 0) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z8 || !z9 || z2) {
                z10 = false;
            } else {
                z10 = true;
            }
            return new qx4(new wul(iulVar, oe9Var, ue9Var, z10, false, true), hxo0VarA, zv6VarB0, zv6Var);
        }
        strA2 = lsm0Var.a(org.xbet.client1.R.string.min_coef_v2, Arrays.copyOf(new Object[]{bigDecimal2}, 1));
        strA = strA2;
        z3 = false;
        pln0 pln0Var2 = new pln0(strA, true, z3);
        wnb0 wnb0Var2 = new wnb0("", "", z3);
        if (z13) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (z13) {
            z5 = false;
        } else {
            z5 = false;
        }
        kke kkeVar2 = new kke(true, true, z4, z5);
        if (z13) {
            gx6Var = gx6.c;
        } else if (z13) {
            gx6Var = gx6.b;
        } else {
            if (bigDecimal3.compareTo(bigDecimal2) >= 0) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (bigDecimal3.compareTo(new BigDecimal(String.valueOf(-1.0d))) == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            gx6Var = z6 ? gx6.f12062a : gx6.f12062a;
        }
        zv6 zv6Var2 = new zv6(nx6Var, pln0Var2, wnb0Var2, kkeVar2, gx6Var, "", true);
        zv6 zv6VarB1 = ccq0.b0(bx6Var, ctf0Var, hx4Var.e, z2);
        hxo0 hxo0VarA2 = ktt0.A(hx4Var.d, tw6Var.f, z2);
        iul iulVar2 = iul.e;
        oe9 oe9Var2 = oe9.f25112a;
        ue9 ue9Var2 = new ue9(lsm0Var.a(org.xbet.client1.R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
        d2 = tw6Var.f34633a;
        if (d2 == -1.0d) {
            z8 = false;
        } else {
            d3 = tw6Var.d;
            double d5 = tw6Var.e;
            if (d3 <= d2) {
                z8 = false;
            } else {
                z8 = false;
            }
        }
        bigDecimal = yycVar.f43459a;
        if (bigDecimal.equals(new BigDecimal(String.valueOf(-1.0d)))) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (z8) {
            z10 = false;
        } else {
            z10 = false;
        }
        return new qx4(new wul(iulVar2, oe9Var2, ue9Var2, z10, false, true), hxo0VarA2, zv6VarB1, zv6Var2);
    }

    public static final h46 O(jd jdVar) {
        jdVar.getClass();
        List list = jdVar.g;
        Long l2 = jdVar.f16304a;
        Integer num = jdVar.f;
        Long l3 = jdVar.b;
        String str = jdVar.c;
        String str2 = jdVar.d;
        ywp0 ywp0Var = jdVar.i;
        if (list != null && !list.isEmpty() && ywp0Var != null) {
            if (list == null) {
                jf4.k(null);
                return null;
            }
            String str3 = jdVar.h;
            if (str3 != null) {
                return new lwt0(list, str3, new swp0(ywp0Var, false));
            }
            jf4.k(null);
            return null;
        }
        if ((num == null || num.intValue() != 0) && ywp0Var != null) {
            return new owt0(new swp0(ywp0Var, false));
        }
        if ((l2 == null || l2.longValue() != 0) && str != null && str.length() != 0 && str2 != null && str2.length() != 0 && ywp0Var == null) {
            return new mwt0(l2 != null ? l2.longValue() : 0L, str, str2);
        }
        if (str2 != null && str2.length() != 0 && ((l3 == null || l3.longValue() != 0) && ((str == null || str.length() == 0) && ywp0Var == null))) {
            return new fws0(str2, l3);
        }
        if (str2 != null && str2.length() != 0 && l3 != null && l3.longValue() == 0 && ((str == null || str.length() == 0) && ywp0Var == null)) {
            return new nwt0(jdVar);
        }
        jf4.k(null);
        return null;
    }

    public static final g07 P(BetGroupZip betGroupZip, long j2, String str) {
        wyc wycVar;
        vyc vycVar;
        r8d r8dVar;
        List list = betGroupZip.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (arrayList.isEmpty()) {
                    return null;
                }
                long j3 = betGroupZip.b;
                String str2 = betGroupZip.c;
                boolean z2 = str.length() > 0;
                int i2 = betGroupZip.e;
                return new g07(j3, str2, str, z2, i2 > 3 ? 3 : i2, betGroupZip.f.size(), arrayList);
            }
            BetZip betZip = (BetZip) it.next();
            if (betZip.b == 0.0d && betZip.t.length() == 0) {
                wycVar = null;
                r8dVar = null;
            } else {
                long j4 = betZip.f46426a;
                long j5 = betZip.m;
                long j6 = j5 != 0 ? j5 : j2;
                String str3 = betZip.t;
                String strM = ju70.M(betZip, false);
                boolean z3 = betZip.y;
                boolean z4 = betZip.f;
                int iOrdinal = betZip.v.ordinal();
                if (iOrdinal == 0) {
                    vycVar = vyc.b;
                } else if (iOrdinal == 1) {
                    vycVar = vyc.c;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    vycVar = vyc.f38240a;
                }
                vyc vycVar2 = vycVar;
                boolean z5 = betZip.f;
                r8dVar = null;
                wycVar = new wyc(j4, j6, str3, strM, z3, z4, vycVar2, z5 ? 0.45f : 1.0f, betZip.w ? org.xbet.client1.R.drawable.ic_coef_eye : 0, z5 ? org.xbet.client1.R.drawable.ic_lock_new : 0, betZip.d, betZip.b, betZip.c);
            }
            r8d r8dVar2 = wycVar != null ? new r8d(wycVar) : r8dVar;
            arrayList = arrayList;
            if (r8dVar2 != null) {
                arrayList.add(r8dVar2);
            }
        }
    }

    public static final ypl Q(zf1 zf1Var) {
        int iOrdinal = zf1Var.ordinal();
        if (iOrdinal == 0) {
            return ypl.f43036a;
        }
        if (iOrdinal == 1) {
            return ypl.b;
        }
        if (iOrdinal == 2) {
            return ypl.c;
        }
        if (iOrdinal == 3) {
            return ypl.d;
        }
        if (iOrdinal == 4) {
            return ypl.e;
        }
        t9f.b();
        return null;
    }

    public static final void a(nwi0 nwi0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1290292762);
        int i3 = (fetVar.g(nwi0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new y7(function1, (byte) 8);
                fetVar.o0(objP);
            }
            knx.a((Function1) objP, nwi0Var, H(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), true, !nwi0Var.c), fetVar, (i3 << 3) & 112);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(nwi0Var, function1, i2, (byte) 10);
        }
    }

    public static final void b(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1217073964);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new eb(xczVarA, b2));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var2 = (l7m0) objP;
            float f2 = lyq0.f20876a;
            oyq0 oyq0VarD = ob3.d(0, 7, fetVar);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new jb(l7m0Var2, b2);
                fetVar.o0(objP2);
            }
            zyn zynVarA = lyq0.a(oyq0VarD, (Function0) objP2, fetVar, 196656, 28);
            mm40 mm40VarV = o7k0.c;
            if (((rfj0) l7m0Var.getValue()).b.c) {
                mm40VarV = cjx.V(mm40VarV, zynVarA.e, null);
            }
            m8x.y(mm40VarV, u1c.M(1695271152, new iop(l7m0Var, zynVarA, l7m0Var2, function1, (byte) 6), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0L, null, u1c.M(801496699, new qb(l7m0Var, function1, xczVarA, b2), fetVar), fetVar, 805306416, 444);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i2, (byte) 1);
        }
    }

    public static final void c(mwi0 mwi0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(713390793);
        int i3 = (fetVar.g(mwi0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new e0(function1, (byte) 8);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 32;
            Object objP2 = fetVar.P();
            byte b2 = 9;
            if (z3 || objP2 == cl5Var) {
                objP2 = new e0(function1, b2);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z4 = i4 == 32;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new e0(function1, (byte) 10);
                fetVar.o0(objP3);
            }
            nia0.c(function0, function2, (Function0) objP3, mwi0Var, H(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), true, true), fetVar, (i3 << 9) & 7168);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(mwi0Var, function1, i2, (byte) 11);
        }
    }

    public static final void d(rx rxVar, Function1 function1, mm40 mm40Var, fet fetVar, int i2) {
        rxVar.getClass();
        function1.getClass();
        fetVar.g0(-1772885766);
        byte b2 = 4;
        int i3 = i2 | (fetVar.i(rxVar) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40VarD, 52.0f), "ADDITIONAL_INFO_BUTTON");
            lh80 lh80Var = ee9.f7659a;
            be9 be9VarA = ee9.a(StaticColors.INSTANCE.m73getBlack400d7_KjU(), 0L, 0L, 0L, fetVar, 14);
            lh80 lh80Var2 = new lh80(8.0f, 8.0f, 8.0f, 8.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4 || fetVar.i(rxVar));
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new mc((Object) function1, (Object) rxVar, (byte) 5);
                fetVar.o0(objP);
            }
            o050.g((Function0) objP, mm40VarE0, false, ugg0Var2, be9VarA, null, lh80Var2, u1c.M(669167370, new un6(rxVar, b2), fetVar), fetVar, 805306368, 356);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(rxVar, function1, mm40Var, i2, (byte) 12);
        }
    }

    public static final void e(int i2, fet fetVar, nzi0 nzi0Var, Function1 function1) {
        fetVar.g0(1279886346);
        int i3 = (fetVar.g(nzi0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            u7x.o(function1, nzi0Var, H(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), false, false), fetVar, ((i3 << 3) & 112) | ((i3 >> 3) & 14));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fb(nzi0Var, function1, i2);
        }
    }

    public static final void f(nud0 nud0Var, fet fetVar, int i2) {
        fetVar.g0(-154399150);
        int i3 = (fetVar.e(nud0Var.ordinal()) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                int iOrdinal = nud0Var.ordinal();
                if (iOrdinal == 0) {
                    objP = q3d.j(new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU()), new y3d(ijg.i));
                } else if (iOrdinal != 1) {
                    t9f.b();
                    return;
                } else {
                    StaticColors staticColors = StaticColors.INSTANCE;
                    objP = q3d.j(new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(ijg.i));
                }
                fetVar.o0(objP);
            }
            zq8.a(0, fetVar, i120.P(o7k0.c, yk5.n((List) objP, 0.0f, 0.0f, 14), null, 6));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nrc0(nud0Var, i2, (byte) 12);
        }
    }

    public static final void g(et8 et8Var, final boolean z2, final long j2, final float f2, final ugd ugdVar, fet fetVar, final int i2) {
        int i3;
        Object hrmVar;
        final et8 et8Var2 = et8Var;
        fetVar.g0(-1831378909);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(et8Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.h(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.f(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            int i5 = i4 << 3;
            int i6 = (i5 & 896) | (i5 & 112) | 6;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            wgu0 wgu0Var = (wgu0) fetVar.k(bmd.t);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            float fH = wgu0Var.h();
            float fW0 = w6kVar.w0(400.0f);
            boolean zI = ((((i6 & 896) ^ 384) > 256 && fetVar.h(z2)) || (i6 & 384) == 256) | ((((i6 & 112) ^ 48) > 32 && fetVar.g(et8Var2)) || (i6 & 48) == 32) | fetVar.i(vneVar) | fetVar.d(fW0) | fetVar.d(fH);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                hrmVar = new hrm(fH, et8Var, z2, vneVar, fW0);
                et8Var2 = et8Var;
                fetVar.o0(hrmVar);
            } else {
                hrmVar = objP2;
                et8Var2 = et8Var;
            }
            mm40 mm40VarK = rq8.K(fnn0.a(jm40.b, et8Var2, (PointerInputEventHandler) hrmVar), new c63((List) ((hgk0) et8Var2.c).getValue(), j2, f2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            twn.v((i4 >> 12) & 14, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ws8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    wb.g(et8Var2, z2, j2, f2, ugdVar, (fet) obj2, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void h(mm40 mm40Var, Function0 function0, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, fet fetVar, int i2) {
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(2000846995);
        int i3 = i2 | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(xdrVar) ? 256 : 128) | (fetVar.i(xdrVar2) ? 2048 : 1024) | (fetVar.i(xdrVar3) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40Var2 = mm40Var;
            mm40 mm40VarW = y860.W(i120.Q(mm40Var2, y3d.b, jd8.n), null, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            if (xdrVar == null) {
                fetVar.e0(-193869430);
            } else {
                fetVar.e0(-421895849);
                xdrVar.F(o7k0.c, fetVar, Integer.valueOf(((i3 >> 3) & 112) | 6));
            }
            fetVar.r(false);
            if (xdrVar2 == null) {
                fetVar.e0(-193822496);
                fetVar.r(false);
            } else {
                fetVar.e0(-421894335);
                w6x.v((i3 >> 6) & 112, xdrVar2, jr8.f16991a.b(jm40.b, gqw0.e), fetVar, false);
            }
            if (xdrVar3 == null) {
                fetVar.e0(-193760310);
            } else {
                fetVar.e0(-421892329);
                xdrVar3.F(o7k0.c, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s59(mm40Var2, function0, xdrVar, xdrVar2, xdrVar3, i2, (byte) 0);
        }
    }

    public static final void i(mm40 mm40Var, qal0 qal0Var, qw3 qw3Var, ugd ugdVar, fet fetVar, int i2, int i3) {
        fetVar.e0(1021512052);
        sw3 sw3Var = qw3Var;
        if ((i3 & 4) != 0) {
            sw3Var = uc9.f;
        }
        ugd ugdVar2 = q8a.b;
        zcl zclVar = qmk.f28987a;
        mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.L(mm40Var, 12.0f, 0.0f, 2), 84.0f), 96.0f);
        x5d x5dVarA = w5d.a(sw3Var, gqw0.m, fetVar, 0);
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
        mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
        fetVar.e0(-2057392772);
        y5d y5dVar = y5d.f42040a;
        ugdVar.j(y5dVar, mm40VarD, fetVar, 438);
        fetVar.r(false);
        ugdVar2.O(y5dVar, mm40VarD, qal0Var, fetVar, Integer.valueOf(((i2 << 3) & 896) | 54));
        fetVar.r(true);
        fetVar.r(false);
    }

    public static final void j(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1659833741);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new nas0(function1, (byte) 27);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn(l7m0Var, function1, i2, (byte) 10);
        }
    }

    public static final void k(int i2, g4k g4kVar, fet fetVar, Function1 function1) {
        fetVar.g0(615820081);
        int i3 = (fetVar.g(g4kVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new ib(function1, g4kVar, b2);
                fetVar.o0(objP);
            }
            l8x.L((Function1) objP, g4kVar, H(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), false, true), fetVar, (i3 << 3) & 112);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kb(g4kVar, function1, i2);
        }
    }

    public static final void l(jkm jkmVar, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(-1236795405);
        int i3 = (fetVar.g(jkmVar) ? 4 : 2) | i2;
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = y0o.f41817a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z2 = (i3 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new kxf(jkmVar, b2);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, n0qVar, (Function1) objP2, fetVar2, 54, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mxm(jkmVar, i2, (byte) 27);
        }
    }

    public static final void m(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        xczVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(118745304);
        int i3 = i2 | 6 | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.g(qdzVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var, new qw3(16.0f, true, new jf4((byte) 14)), knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, 28.0f, 5), fetVar), false, null, u1c.M(1075474778, new rkb(function1, qdzVar, (byte) 3), fetVar), fetVar, ((i3 >> 3) & 112) | 100663680, Response.OK);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new skb(mm40Var2, l7m0Var, xczVar, qdzVar, function1, i2, (byte) 1);
        }
    }

    public static final void n(int i2, fet fetVar, mv00 mv00Var, Function1 function1) {
        fetVar.g0(1632726571);
        int i3 = (fetVar.g(mv00Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new lb(function1, mv00Var, b2);
                fetVar.o0(objP);
            }
            m8x.C((Function1) objP, mv00Var, H(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), false, mv00Var.f22436a), fetVar, (i3 << 3) & 112);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mb(mv00Var, function1, i2);
        }
    }

    public static final void o(String str, String str2, oud0 oud0Var, fet fetVar, int i2) {
        oud0 oud0Var2;
        fetVar.g0(680556803);
        int i3 = i2 | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16) | (fetVar.e(oud0Var.ordinal()) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            q(str, fetVar, i3 & 14);
            e900 e900VarN = yk5.n(q3d.j(new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU()), new y3d(kkg.t)), 0.0f, 0.0f, 14);
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarP = i120.P(jm40Var, e900VarN, new ugg0(zclVar, zclVar, zclVar, zclVar), 4);
            tj30 tj30VarC = zq8.c(gqw0.h, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarP);
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
            oud0Var2 = oud0Var;
            t((i3 & 112) | ((i3 >> 6) & 14), fetVar, oud0Var2, str2);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            oud0Var2 = oud0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(str, str2, oud0Var2, i2, (byte) 10);
        }
    }

    public static final void p(String str, fet fetVar, int i2) {
        String str2;
        fet fetVar2;
        fetVar.g0(1857811501);
        int i3 = (fetVar.g(str) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            long jM126getWhite200d7_KjU = StaticColors.INSTANCE.m126getWhite200d7_KjU();
            pge pgeVar = gqw0.A;
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            str2 = str;
            fetVar2 = fetVar;
            lgb.v(lgb.J(n0qVar, new ugg0(zclVar, zclVar, zclVar, zclVar)), o7k0.p(dw9.i(zclVar, zclVar, zclVar, zclVar, jm40.b), 64.0f, 156.0f), str2, org.xbet.client1.R.drawable.ic_sport_color_rainbow_six_168, jM126getWhite200d7_KjU, pgeVar, fetVar2, ((i3 << 6) & 896) | 196608, 0);
        } else {
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 20, i2, str2);
        }
    }

    public static final void q(String str, fet fetVar, int i2) {
        fetVar.g0(-1059033432);
        int i3 = i2 | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            v8q0.a(str, o7k0.u(s5x0.N(jm40.b, 4.0f, 0.0f, 4.0f, 4.0f, 2), 0.0f, 94.0f, 1), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, i3 & 14, 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 19, i2, str);
        }
    }

    public static final void r(mm40 mm40Var, pud0 pud0Var, fet fetVar, int i2) {
        fetVar.g0(-1556832492);
        int i3 = i2 | 6 | (fetVar.g(pud0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 84.0f), 118.0f);
            long j2 = ijg.i;
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, i120.Q(mm40VarE, j2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            tj30 tj30VarC = zq8.c(gqw0.h, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE2);
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
            p(pud0Var.c, fetVar, 0);
            f(pud0Var.f, fetVar, 0);
            o(pud0Var.d, pud0Var.b, pud0Var.e, fetVar, 0);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(mm40Var, pud0Var, i2, (byte) 5);
        }
    }

    public static final void s(qud0 qud0Var, qdz qdzVar, fet fetVar, int i2) {
        int i3;
        qud0Var.getClass();
        qdzVar.getClass();
        fetVar.g0(-1669313235);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(qud0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 16;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(qdzVar) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xcz xczVarB = qdzVar.b(qud0Var.f29341a, new ksc0(b2), fetVar, (i3 << 3) & 896);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarA = pkd.a(i120.Q(mm40VarD, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 16.0f);
            lh80 lh80Var = new lh80(4.0f, 4.0f, 4.0f, 4.0f);
            byte b3 = 12;
            qw3 qw3Var = new qw3(4.0f, true, new gne(gqw0.n, b3));
            boolean z2 = (i3 & 14) == 4;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new v6d0(qud0Var, b3);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarA, xczVarB, lh80Var, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) qud0Var, (Object) qdzVar, i2, (byte) 19);
        }
    }

    public static final void t(int i2, fet fetVar, oud0 oud0Var, String str) {
        int i3;
        fetVar.g0(1166008941);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(oud0Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            int iOrdinal = oud0Var.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fetVar.e0(-1122950341);
                D(((i4 << 3) & 112) | ((i4 >> 3) & 14), fetVar, oud0Var, str);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(-1122820079);
                B(0, fetVar);
                fetVar.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(-451869048, fetVar, false);
                }
                fetVar.e0(-1122743757);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qph(oud0Var, str, i2, (byte) 9);
        }
    }

    public static final void u(mm40 mm40Var, xcz xczVar, qdz qdzVar, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(114883739);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(qdzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(l7m0Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            n0q n0qVar = o7k0.c;
            boolean z2 = !((Boolean) l7m0Var2.getValue()).booleanValue();
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var, null, knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 28.0f, 7), fetVar), z2, null, u1c.M(-565255011, new rkb(qdzVar, function1, (byte) 8), fetVar), fetVar, (i3 & 112) | 100663296 | ((i3 >> 3) & 896), 152);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uap0(mm40Var2, xczVar, qdzVar, l7m0Var, l7m0Var2, function1, i2, (byte) 1);
        }
    }

    public static final void v(int i2, fet fetVar, xcz xczVar, mm40 mm40Var, List list, Function1 function1) {
        fetVar.g0(-688150761);
        int i3 = (fetVar.i(function1) ? 4 : 2) | i2 | (fetVar.g(xczVar) ? 32 : 16) | (fetVar.g(list) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = knm0.f(s5x0.u(f2, 0.0f, f3, 24.0f, 2), fetVar);
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new rb(list, function1, b2);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, xczVar, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, 6 | (i3 & 112), Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sb(function1, xczVar, list, mm40Var, i2);
        }
    }

    public static final void w(Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-134171613);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar.i(function1) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            String strW = rsm0.w(org.xbet.client1.R.string.statistic_info_start_team, 0, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                pz40 pz40Var = s6t0.f31722a;
                imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strW, ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
                fetVar.o0(immVar);
                objP = immVar;
            }
            imm immVar2 = (imm) objP;
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o050.W(knm0.r(i120.Q(jm40Var, background, ljcVar)));
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            int i4 = i3;
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
            boolean z3 = (i4 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new w7i0(function1, (byte) 29);
                fetVar.o0(objP2);
            }
            hlm.c(null, immVar2, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 48, 0, 4085);
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.K(jm40Var, 16.0f, 8.0f), 1.0f), 32.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mbc.o(zfi0.f44303a, s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 2.0f, 7), false, fetVar, 6, 4);
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.K(o7k0.e(o7k0.d(jm40Var, 1.0f), 512.0f), 4.0f, 2.0f)), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.K(o7k0.e(o7k0.d(jm40Var, 1.0f), 512.0f), 4.0f, 2.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wt9(function1, i2, (byte) 5);
        }
    }

    public static final void x(int i2, fet fetVar, b8j0 b8j0Var, Function1 function1) {
        fetVar.g0(-882520214);
        int i3 = (fetVar.g(b8j0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new nb(function1, b8j0Var);
                fetVar.o0(objP);
            }
            x9x.x((Function1) objP, b8j0Var, H(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), b8j0Var.getFirst(), b8j0Var.getLast()), fetVar, (i3 << 3) & 112);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ob(b8j0Var, function1, i2);
        }
    }

    public static final void y(wgj0 wgj0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1518309307);
        int i3 = (fetVar.g(wgj0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new pb(function1, wgj0Var);
                fetVar.o0(objP);
            }
            efx.m((Function1) objP, wgj0Var, H(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), wgj0Var.getFirst(), wgj0Var.getLast()), fetVar, (i3 << 3) & 112);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(wgj0Var, function1, i2, (byte) 12);
        }
    }

    public static final void z(int i2, fet fetVar, vhj0 vhj0Var, Function1 function1) {
        fetVar.g0(180149936);
        int i3 = (fetVar.g(vhj0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gb(function1, vhj0Var);
                fetVar.o0(objP);
            }
            uvw.j((Function1) objP, vhj0Var, H(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vhj0Var.c, false), fetVar, (i3 << 3) & 112);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hb(vhj0Var, function1, i2);
        }
    }
}
