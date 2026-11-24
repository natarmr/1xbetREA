package a;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.RectF;
import android.text.Layout;
import android.util.Property;
import android.view.View;
import android.view.Window;
import java.text.Bidi;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iym0 {
    public static final void a(aus0 aus0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-931007834);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(aus0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
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
            hxm0.a(o7k0.d(jm40Var, 1.0f), aus0Var.b, fetVar2, 6);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 1.0f, 0.0f, 2);
            StaticColors staticColors = StaticColors.INSTANCE;
            jcb.v(mm40VarL, 0.0f, staticColors.m125getWhite100d7_KjU(), fetVar2, 0, 2);
            mym0.f(aus0Var.d, fetVar2, 0);
            lgb.g(s5x0.L(o7k0.d(jm40Var, 1.0f), 1.0f, 0.0f, 2), staticColors.m125getWhite100d7_KjU(), 0.0f, 0.0f, 0.0f, fetVar, 0);
            fetVar2 = fetVar;
            mym0.f(aus0Var.c, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xts0(aus0Var, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01db  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x025b  */
    /* JADX WARN: Code duplicated, block: B:119:0x025f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0296  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x0340  */
    /* JADX WARN: Code duplicated, block: B:144:0x0353  */
    /* JADX WARN: Code duplicated, block: B:147:0x035d  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x0100  */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:82:0x0135  */
    /* JADX WARN: Code duplicated, block: B:84:0x0146  */
    /* JADX WARN: Code duplicated, block: B:85:0x0148  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0154  */
    /* JADX WARN: Code duplicated, block: B:94:0x0199  */
    /* JADX WARN: Code duplicated, block: B:95:0x019d  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01be  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v4, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v7, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r35v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v8, types: [a.fet] */
    public static final void b(final mm40 mm40Var, final qym0 qym0Var, final long j, final boolean z, boolean z2, boolean z3, final Function1 function1, fet fetVar, final int i, final int i2) {
        int i3;
        final boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        final boolean z7;
        ?? r10;
        yfe0 yfe0VarU;
        boolean z8;
        boolean z9;
        pkk0 pkk0Var;
        boolean z10;
        pcy pcyVar;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        jm40 jm40Var;
        cl5 cl5Var;
        pcy pcyVar2;
        shd shdVar5;
        pkk0 pkk0Var2;
        cl5 cl5Var2;
        shd shdVar6;
        shd shdVar7;
        jm40 jm40Var2;
        shd shdVar8;
        byte b;
        ?? r13;
        ?? r8;
        ?? r14;
        cl5 cl5Var3;
        ?? r11;
        Object obj;
        cl5 cl5Var4;
        Object obj2;
        boolean z11;
        byte b2;
        Object obj3;
        float f;
        int i7;
        fet fetVar2 = fetVar;
        zx7 zx7Var = gqw0.e;
        function1.getClass();
        fetVar2.g0(569044244);
        if ((i & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar2.g(qym0Var) : fetVar2.i(qym0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar2.h(z) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                z4 = z2;
                i3 |= fetVar2.h(z4) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z5 = z3;
                    if (fetVar2.h(z5)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((1572864 & i) == 0) {
                    if (fetVar2.i(function1)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i6 = i3;
                if ((i6 & 599187) != 599186) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (fetVar2.U(i6 & 1, z6)) {
                    if (i8 != 0) {
                        z8 = true;
                    } else {
                        z8 = z4;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z5;
                    }
                    pkk0Var = (pkk0) fetVar2.k(bmd.q);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    z10 = fetVar2.S;
                    pcyVar = e7z.u1;
                    if (z10) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shdVar = gqw0.x;
                    jpm0.o(fetVar2, thg0VarA, shdVar);
                    shdVar2 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shdVar3 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf, shdVar3);
                    jpm0.n(fetVar2);
                    shdVar4 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC0, shdVar4);
                    jm40Var = jm40.b;
                    cl5Var = ukd.f35823a;
                    if (z9) {
                        pcyVar2 = pcyVar;
                        shdVar5 = shdVar;
                        pkk0Var2 = pkk0Var;
                        cl5Var2 = cl5Var;
                        shdVar6 = shdVar2;
                        shdVar7 = shdVar3;
                        jm40Var2 = jm40Var;
                        fet fetVar3 = fetVar2;
                        shdVar8 = shdVar4;
                        b = 1;
                        r13 = 0;
                        fetVar3.e0(1964540082);
                        fetVar3.r(false);
                        r8 = fetVar3;
                    } else {
                        fetVar2.e0(1963572355);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
                        if ((i6 & 3670016) == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Object objP = fetVar2.P();
                        if (!z11 || objP == cl5Var) {
                            b2 = 1;
                            opm0 opm0Var = new opm0(function1, b2);
                            fetVar2.o0(opm0Var);
                            obj3 = opm0Var;
                        } else {
                            b2 = 1;
                            obj3 = objP;
                        }
                        Function0 function0 = (Function0) obj3;
                        pkk0Var2 = pkk0Var;
                        pcyVar2 = pcyVar;
                        shdVar5 = shdVar;
                        shdVar6 = shdVar2;
                        shdVar7 = shdVar3;
                        shdVar8 = shdVar4;
                        jm40Var2 = jm40Var;
                        cl5Var2 = cl5Var;
                        r13 = 0;
                        mm40 mm40VarW = y860.W(mm40VarN, null, null, z, null, function0, 24);
                        tj30 tj30VarC = zq8.c(zx7Var, false);
                        int iHashCode2 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM2 = fetVar2.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar2);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC, shdVar5);
                        jpm0.o(fetVar2, bh90VarM2, shdVar6);
                        vqd.u(iHashCode2, fetVar2, shdVar7, fetVar2);
                        jpm0.o(fetVar2, mm40VarC1, shdVar8);
                        pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_search, 0, fetVar2);
                        mm40 mm40VarN2 = o7k0.n(jm40Var2, 16.0f);
                        if (z) {
                            f = 1.0f;
                        } else {
                            f = 0.5f;
                        }
                        fet fetVar4 = fetVar;
                        dww.c(pm80VarF, null, epv0.N(mm40VarN2, f), j, fetVar4, 56 | ((i6 << 3) & 7168), 0);
                        b = 1;
                        fetVar4.r(true);
                        fetVar4.r(false);
                        r8 = fetVar4;
                    }
                    if (z8 || z9) {
                        ?? r35 = r13;
                        r14 = b;
                        cl5Var3 = cl5Var2;
                        r8.e0(1965510258);
                        r8.r(r35);
                    } else {
                        r8.e0(1964635748);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarN3 = o7k0.n(jm40Var2, 40.0f);
                        pkk0 pkk0Var3 = pkk0Var2;
                        int i9 = (r8.g(pkk0Var3) ? 1 : 0) | ((i6 & 3670016) == 1048576 ? b : r13);
                        Object objP2 = r8.P();
                        if (i9 == 0) {
                            cl5Var4 = cl5Var2;
                            if (objP2 != cl5Var4) {
                                obj2 = objP2;
                            }
                            mm40 mm40VarW2 = y860.W(mm40VarN3, null, null, false, null, (Function0) obj2, 28);
                            tj30 tj30VarC2 = zq8.c(zx7Var, r13);
                            int iHashCode3 = Long.hashCode(r8.T);
                            bh90 bh90VarM3 = r8.m();
                            mm40 mm40VarC2 = kbc.c0(r8, mm40VarW2);
                            r8.i0();
                            if (r8.S) {
                                r8.l(pcyVar2);
                            } else {
                                r8.r0();
                            }
                            jpm0.o(r8, tj30VarC2, shdVar5);
                            jpm0.o(r8, bh90VarM3, shdVar6);
                            vqd.u(iHashCode3, r8, shdVar7, r8);
                            jpm0.o(r8, mm40VarC2, shdVar8);
                            cl5Var3 = cl5Var4;
                            r14 = 1;
                            dww.c(a8k0.F(R.drawable.ic_glyph_brush, r13, r8), null, o7k0.n(jm40Var2, 16.0f), j, r8, 56 | ((i6 << 3) & 7168), 0);
                            r8.r(true);
                            r8.r(false);
                        } else {
                            cl5Var4 = cl5Var2;
                        }
                        e54 e54Var = new e54(pkk0Var3, function1, b);
                        r8.o0(e54Var);
                        obj2 = e54Var;
                        mm40 mm40VarW3 = y860.W(mm40VarN3, null, null, false, null, (Function0) obj2, 28);
                        tj30 tj30VarC3 = zq8.c(zx7Var, r13);
                        int iHashCode4 = Long.hashCode(r8.T);
                        bh90 bh90VarM4 = r8.m();
                        mm40 mm40VarC3 = kbc.c0(r8, mm40VarW3);
                        r8.i0();
                        if (r8.S) {
                            r8.l(pcyVar2);
                        } else {
                            r8.r0();
                        }
                        jpm0.o(r8, tj30VarC3, shdVar5);
                        jpm0.o(r8, bh90VarM4, shdVar6);
                        vqd.u(iHashCode4, r8, shdVar7, r8);
                        jpm0.o(r8, mm40VarC3, shdVar8);
                        cl5Var3 = cl5Var4;
                        r14 = 1;
                        dww.c(a8k0.F(R.drawable.ic_glyph_brush, r13, r8), null, o7k0.n(jm40Var2, 16.0f), j, r8, 56 | ((i6 << 3) & 7168), 0);
                        r8.r(true);
                        r8.r(false);
                    }
                    if (qym0Var.b || z9) {
                        ?? r12 = r8;
                        r12.e0(1966408018);
                        r12.r(false);
                        r11 = r12;
                    } else {
                        r8.e0(1965595973);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarN4 = o7k0.n(jm40Var2, 40.0f);
                        ?? r4 = (i6 & 3670016) == 1048576 ? r14 : 0;
                        Object objP3 = r8.P();
                        if (r4 != 0 || objP3 == cl5Var3) {
                            opm0 opm0Var2 = new opm0(function1, (byte) 2);
                            r8.o0(opm0Var2);
                            obj = opm0Var2;
                        } else {
                            obj = objP3;
                        }
                        mm40 mm40VarW4 = y860.W(mm40VarN4, null, null, false, null, (Function0) obj, 28);
                        tj30 tj30VarC4 = zq8.c(zx7Var, false);
                        int iHashCode5 = Long.hashCode(r8.T);
                        bh90 bh90VarM5 = r8.m();
                        mm40 mm40VarC4 = kbc.c0(r8, mm40VarW4);
                        r8.i0();
                        if (r8.S) {
                            r8.l(pcyVar2);
                        } else {
                            r8.r0();
                        }
                        jpm0.o(r8, tj30VarC4, shdVar5);
                        jpm0.o(r8, bh90VarM5, shdVar6);
                        vqd.u(iHashCode5, r8, shdVar7, r8);
                        jpm0.o(r8, mm40VarC4, shdVar8);
                        dww.c(a8k0.F(R.drawable.ic_glyph_list, 0, r8), null, o7k0.n(jm40Var2, 16.0f), j, r8, 56 | ((i6 << 3) & 7168), 0);
                        ?? r15 = r8;
                        r15.r(r14);
                        r15.r(false);
                        r11 = r15;
                    }
                    r11.r(r14);
                    z4 = z8;
                    z7 = z9;
                    r10 = r11;
                } else {
                    fetVar2.X();
                    z7 = z5;
                    r10 = fetVar2;
                }
                yfe0VarU = r10.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.hym0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            ((Integer) obj5).getClass();
                            iym0.b(mm40Var, qym0Var, j, z, z4, z7, function1, (fet) obj4, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 196608;
            z5 = z3;
            if ((1572864 & i) == 0) {
                if (fetVar2.i(function1)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i6 = i3;
            if ((i6 & 599187) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (fetVar2.U(i6 & 1, z6)) {
                if (i8 != 0) {
                    z8 = true;
                } else {
                    z8 = z4;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z5;
                }
                pkk0Var = (pkk0) fetVar2.k(bmd.q);
                thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
                int iHashCode6 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM6 = fetVar2.m();
                mm40 mm40VarC5 = kbc.c0(fetVar2, mm40Var);
                mkd.c0.getClass();
                fetVar2.i0();
                z10 = fetVar2.S;
                pcyVar = e7z.u1;
                if (z10) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                shdVar = gqw0.x;
                jpm0.o(fetVar2, thg0VarA2, shdVar);
                shdVar2 = gqw0.w;
                jpm0.o(fetVar2, bh90VarM6, shdVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode6);
                shdVar3 = gqw0.y;
                jpm0.o(fetVar2, numValueOf2, shdVar3);
                jpm0.n(fetVar2);
                shdVar4 = gqw0.v;
                jpm0.o(fetVar2, mm40VarC5, shdVar4);
                jm40Var = jm40.b;
                cl5Var = ukd.f35823a;
                if (z9) {
                    fetVar2.e0(1963572355);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarN5 = o7k0.n(jm40Var, 40.0f);
                    if ((i6 & 3670016) == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object objP4 = fetVar2.P();
                    if (z11) {
                        b2 = 1;
                        opm0 opm0Var3 = new opm0(function1, b2);
                        fetVar2.o0(opm0Var3);
                        obj3 = opm0Var3;
                    } else {
                        b2 = 1;
                        opm0 opm0Var4 = new opm0(function1, b2);
                        fetVar2.o0(opm0Var4);
                        obj3 = opm0Var4;
                    }
                    Function0 function2 = (Function0) obj3;
                    pkk0Var2 = pkk0Var;
                    pcyVar2 = pcyVar;
                    shdVar5 = shdVar;
                    shdVar6 = shdVar2;
                    shdVar7 = shdVar3;
                    shdVar8 = shdVar4;
                    jm40Var2 = jm40Var;
                    cl5Var2 = cl5Var;
                    r13 = 0;
                    mm40 mm40VarW5 = y860.W(mm40VarN5, null, null, z, null, function2, 24);
                    tj30 tj30VarC5 = zq8.c(zx7Var, false);
                    int iHashCode7 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM7 = fetVar2.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar2, mm40VarW5);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar2);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC5, shdVar5);
                    jpm0.o(fetVar2, bh90VarM7, shdVar6);
                    vqd.u(iHashCode7, fetVar2, shdVar7, fetVar2);
                    jpm0.o(fetVar2, mm40VarC6, shdVar8);
                    pm80 pm80VarF2 = a8k0.F(R.drawable.ic_glyph_search, 0, fetVar2);
                    mm40 mm40VarN6 = o7k0.n(jm40Var2, 16.0f);
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    fet fetVar5 = fetVar;
                    dww.c(pm80VarF2, null, epv0.N(mm40VarN6, f), j, fetVar5, 56 | ((i6 << 3) & 7168), 0);
                    b = 1;
                    fetVar5.r(true);
                    fetVar5.r(false);
                    r8 = fetVar5;
                } else {
                    pcyVar2 = pcyVar;
                    shdVar5 = shdVar;
                    pkk0Var2 = pkk0Var;
                    cl5Var2 = cl5Var;
                    shdVar6 = shdVar2;
                    shdVar7 = shdVar3;
                    jm40Var2 = jm40Var;
                    fet fetVar6 = fetVar2;
                    shdVar8 = shdVar4;
                    b = 1;
                    r13 = 0;
                    fetVar6.e0(1964540082);
                    fetVar6.r(false);
                    r8 = fetVar6;
                }
                if (z8) {
                    ?? r36 = r13;
                    r14 = b;
                    cl5Var3 = cl5Var2;
                    r8.e0(1965510258);
                    r8.r(r36);
                } else {
                    ?? r37 = r13;
                    r14 = b;
                    cl5Var3 = cl5Var2;
                    r8.e0(1965510258);
                    r8.r(r37);
                }
                if (qym0Var.b) {
                    ?? r16 = r8;
                    r16.e0(1966408018);
                    r16.r(false);
                    r11 = r16;
                } else {
                    ?? r17 = r8;
                    r17.e0(1966408018);
                    r17.r(false);
                    r11 = r17;
                }
                r11.r(r14);
                z4 = z8;
                z7 = z9;
                r10 = r11;
            } else {
                fetVar2.X();
                z7 = z5;
                r10 = fetVar2;
            }
            yfe0VarU = r10.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.hym0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        iym0.b(mm40Var, qym0Var, j, z, z4, z7, function1, (fet) obj4, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 24576;
        z4 = z2;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z5 = z3;
                if (fetVar2.h(z5)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((1572864 & i) == 0) {
                if (fetVar2.i(function1)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i6 = i3;
            if ((i6 & 599187) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (fetVar2.U(i6 & 1, z6)) {
                if (i8 != 0) {
                    z8 = true;
                } else {
                    z8 = z4;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z5;
                }
                pkk0Var = (pkk0) fetVar2.k(bmd.q);
                thg0 thg0VarA3 = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
                int iHashCode8 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM8 = fetVar2.m();
                mm40 mm40VarC7 = kbc.c0(fetVar2, mm40Var);
                mkd.c0.getClass();
                fetVar2.i0();
                z10 = fetVar2.S;
                pcyVar = e7z.u1;
                if (z10) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                shdVar = gqw0.x;
                jpm0.o(fetVar2, thg0VarA3, shdVar);
                shdVar2 = gqw0.w;
                jpm0.o(fetVar2, bh90VarM8, shdVar2);
                Integer numValueOf3 = Integer.valueOf(iHashCode8);
                shdVar3 = gqw0.y;
                jpm0.o(fetVar2, numValueOf3, shdVar3);
                jpm0.n(fetVar2);
                shdVar4 = gqw0.v;
                jpm0.o(fetVar2, mm40VarC7, shdVar4);
                jm40Var = jm40.b;
                cl5Var = ukd.f35823a;
                if (z9) {
                    fetVar2.e0(1963572355);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN7 = o7k0.n(jm40Var, 40.0f);
                    if ((i6 & 3670016) == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object objP5 = fetVar2.P();
                    if (z11) {
                        b2 = 1;
                        opm0 opm0Var5 = new opm0(function1, b2);
                        fetVar2.o0(opm0Var5);
                        obj3 = opm0Var5;
                    } else {
                        b2 = 1;
                        opm0 opm0Var6 = new opm0(function1, b2);
                        fetVar2.o0(opm0Var6);
                        obj3 = opm0Var6;
                    }
                    Function0 function3 = (Function0) obj3;
                    pkk0Var2 = pkk0Var;
                    pcyVar2 = pcyVar;
                    shdVar5 = shdVar;
                    shdVar6 = shdVar2;
                    shdVar7 = shdVar3;
                    shdVar8 = shdVar4;
                    jm40Var2 = jm40Var;
                    cl5Var2 = cl5Var;
                    r13 = 0;
                    mm40 mm40VarW6 = y860.W(mm40VarN7, null, null, z, null, function3, 24);
                    tj30 tj30VarC6 = zq8.c(zx7Var, false);
                    int iHashCode9 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM9 = fetVar2.m();
                    mm40 mm40VarC8 = kbc.c0(fetVar2, mm40VarW6);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar2);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC6, shdVar5);
                    jpm0.o(fetVar2, bh90VarM9, shdVar6);
                    vqd.u(iHashCode9, fetVar2, shdVar7, fetVar2);
                    jpm0.o(fetVar2, mm40VarC8, shdVar8);
                    pm80 pm80VarF3 = a8k0.F(R.drawable.ic_glyph_search, 0, fetVar2);
                    mm40 mm40VarN8 = o7k0.n(jm40Var2, 16.0f);
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    fet fetVar7 = fetVar;
                    dww.c(pm80VarF3, null, epv0.N(mm40VarN8, f), j, fetVar7, 56 | ((i6 << 3) & 7168), 0);
                    b = 1;
                    fetVar7.r(true);
                    fetVar7.r(false);
                    r8 = fetVar7;
                } else {
                    pcyVar2 = pcyVar;
                    shdVar5 = shdVar;
                    pkk0Var2 = pkk0Var;
                    cl5Var2 = cl5Var;
                    shdVar6 = shdVar2;
                    shdVar7 = shdVar3;
                    jm40Var2 = jm40Var;
                    fet fetVar8 = fetVar2;
                    shdVar8 = shdVar4;
                    b = 1;
                    r13 = 0;
                    fetVar8.e0(1964540082);
                    fetVar8.r(false);
                    r8 = fetVar8;
                }
                if (z8) {
                    ?? r38 = r13;
                    r14 = b;
                    cl5Var3 = cl5Var2;
                    r8.e0(1965510258);
                    r8.r(r38);
                } else {
                    ?? r39 = r13;
                    r14 = b;
                    cl5Var3 = cl5Var2;
                    r8.e0(1965510258);
                    r8.r(r39);
                }
                if (qym0Var.b) {
                    ?? r18 = r8;
                    r18.e0(1966408018);
                    r18.r(false);
                    r11 = r18;
                } else {
                    ?? r19 = r8;
                    r19.e0(1966408018);
                    r19.r(false);
                    r11 = r19;
                }
                r11.r(r14);
                z4 = z8;
                z7 = z9;
                r10 = r11;
            } else {
                fetVar2.X();
                z7 = z5;
                r10 = fetVar2;
            }
            yfe0VarU = r10.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.hym0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        iym0.b(mm40Var, qym0Var, j, z, z4, z7, function1, (fet) obj4, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 196608;
        z5 = z3;
        if ((1572864 & i) == 0) {
            if (fetVar2.i(function1)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        i6 = i3;
        if ((i6 & 599187) != 599186) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (fetVar2.U(i6 & 1, z6)) {
            if (i8 != 0) {
                z8 = true;
            } else {
                z8 = z4;
            }
            if (i4 != 0) {
                z9 = false;
            } else {
                z9 = z5;
            }
            pkk0Var = (pkk0) fetVar2.k(bmd.q);
            thg0 thg0VarA4 = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode10 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM10 = fetVar2.m();
            mm40 mm40VarC9 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            z10 = fetVar2.S;
            pcyVar = e7z.u1;
            if (z10) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA4, shdVar);
            shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM10, shdVar2);
            Integer numValueOf4 = Integer.valueOf(iHashCode10);
            shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf4, shdVar3);
            jpm0.n(fetVar2);
            shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC9, shdVar4);
            jm40Var = jm40.b;
            cl5Var = ukd.f35823a;
            if (z9) {
                fetVar2.e0(1963572355);
                zcl zclVar6 = qmk.f28987a;
                mm40 mm40VarN9 = o7k0.n(jm40Var, 40.0f);
                if ((i6 & 3670016) == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object objP6 = fetVar2.P();
                if (z11) {
                    b2 = 1;
                    opm0 opm0Var7 = new opm0(function1, b2);
                    fetVar2.o0(opm0Var7);
                    obj3 = opm0Var7;
                } else {
                    b2 = 1;
                    opm0 opm0Var8 = new opm0(function1, b2);
                    fetVar2.o0(opm0Var8);
                    obj3 = opm0Var8;
                }
                Function0 function4 = (Function0) obj3;
                pkk0Var2 = pkk0Var;
                pcyVar2 = pcyVar;
                shdVar5 = shdVar;
                shdVar6 = shdVar2;
                shdVar7 = shdVar3;
                shdVar8 = shdVar4;
                jm40Var2 = jm40Var;
                cl5Var2 = cl5Var;
                r13 = 0;
                mm40 mm40VarW7 = y860.W(mm40VarN9, null, null, z, null, function4, 24);
                tj30 tj30VarC7 = zq8.c(zx7Var, false);
                int iHashCode11 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM11 = fetVar2.m();
                mm40 mm40VarC10 = kbc.c0(fetVar2, mm40VarW7);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar2);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC7, shdVar5);
                jpm0.o(fetVar2, bh90VarM11, shdVar6);
                vqd.u(iHashCode11, fetVar2, shdVar7, fetVar2);
                jpm0.o(fetVar2, mm40VarC10, shdVar8);
                pm80 pm80VarF4 = a8k0.F(R.drawable.ic_glyph_search, 0, fetVar2);
                mm40 mm40VarN10 = o7k0.n(jm40Var2, 16.0f);
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                fet fetVar9 = fetVar;
                dww.c(pm80VarF4, null, epv0.N(mm40VarN10, f), j, fetVar9, 56 | ((i6 << 3) & 7168), 0);
                b = 1;
                fetVar9.r(true);
                fetVar9.r(false);
                r8 = fetVar9;
            } else {
                pcyVar2 = pcyVar;
                shdVar5 = shdVar;
                pkk0Var2 = pkk0Var;
                cl5Var2 = cl5Var;
                shdVar6 = shdVar2;
                shdVar7 = shdVar3;
                jm40Var2 = jm40Var;
                fet fetVar10 = fetVar2;
                shdVar8 = shdVar4;
                b = 1;
                r13 = 0;
                fetVar10.e0(1964540082);
                fetVar10.r(false);
                r8 = fetVar10;
            }
            if (z8) {
                ?? r310 = r13;
                r14 = b;
                cl5Var3 = cl5Var2;
                r8.e0(1965510258);
                r8.r(r310);
            } else {
                ?? r311 = r13;
                r14 = b;
                cl5Var3 = cl5Var2;
                r8.e0(1965510258);
                r8.r(r311);
            }
            if (qym0Var.b) {
                ?? r110 = r8;
                r110.e0(1966408018);
                r110.r(false);
                r11 = r110;
            } else {
                ?? r111 = r8;
                r111.e0(1966408018);
                r111.r(false);
                r11 = r111;
            }
            r11.r(r14);
            z4 = z8;
            z7 = z9;
            r10 = r11;
        } else {
            fetVar2.X();
            z7 = z5;
            r10 = fetVar2;
        }
        yfe0VarU = r10.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.hym0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    iym0.b(mm40Var, qym0Var, j, z, z4, z7, function1, (fet) obj4, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    public static final void c(int i, fet fetVar, Function0 function0) {
        function0.getClass();
        fetVar.g0(-909457480);
        byte b = 4;
        int i2 = (fetVar.i(function0) ? 4 : 2) | i;
        boolean z = true;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            ywv0 ywv0Var = (ywv0) function0.invoke();
            if (ywv0Var != null) {
                glt0 glt0Var = ywv0Var.d;
                if (!glt0Var.f() && !((t33) glt0Var.c).e()) {
                    z = false;
                }
            } else {
                z = false;
            }
            View view = (View) fetVar.k(dy2.f);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = fetVar.i(view) | fetVar.h(z);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zI || objP == obj) {
                objP = new ij90((Object) view, z, (byte) 20);
                fetVar.o0(objP);
            }
            m0x0.n(view, boolValueOf, (Function1) objP, fetVar);
            boolean zI2 = fetVar.i(view);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == obj) {
                objP2 = new oz7(view, b);
                fetVar.o0(objP2);
            }
            m0x0.o(view, (Function1) objP2, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wr4((byte) 12, i, function0);
        }
    }

    public static final void d(mm40 mm40Var, weo0 weo0Var, fet fetVar, int i) {
        fetVar.g0(853612236);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(weo0Var) ? 32 : 16);
        byte b = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            jcb.l(null, weo0Var.f39028a, false, null, fetVar, 0, 13);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(mm40Var, weo0Var, i, b);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        String str2;
        str.getClass();
        fetVar.g0(1453856255);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(g1t0.g(), fetVar), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 0, 131068);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str2, i, (byte) 21);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, String str) {
        str.getClass();
        fetVar.g0(-1414369563);
        byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            slb.n(mm40Var, str, null, null, null, false, null, new ojm(127), null, null, fetVar, (i2 & 14) | 1797504 | (i2 & 112), 768);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(mm40Var, str, i, b);
        }
    }

    public static final void g(mm40 mm40Var, nyq0 nyq0Var, ugd ugdVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-1309649804);
        int i2 = i | 6 | (fetVar.g(nyq0Var) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.a(0.0f);
                fetVar.o0(objP);
            }
            agk0 agk0Var = (agk0) objP;
            Float fValueOf = Float.valueOf(agk0Var.l());
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new i3d(nyq0Var, agk0Var, null, b);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, fValueOf, (Function2) objP2);
            boolean z2 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new h13(nyq0Var, agk0Var, (byte) 3);
                fetVar.o0(objP3);
            }
            tj30 tj30Var = (tj30) objP3;
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
            twn.v(6, ugdVar, fetVar, true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(mm40Var2, nyq0Var, ugdVar, i, (byte) 4);
        }
    }

    public static final void h(mm40 mm40Var, a4x a4xVar, zzr0 zzr0Var, fet fetVar, int i) {
        mm40 mm40VarU;
        a4xVar.getClass();
        fetVar.g0(-83671191);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.e(zzr0Var.ordinal()) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            int iT = w6kVar.T(24.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(iT);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            int iOrdinal = zzr0Var.ordinal();
            jm40 jm40Var = jm40.b;
            if (iOrdinal == 0) {
                fetVar.e0(-1952614842);
                mm40VarU = o7k0.u(jm40Var, pkd.e(cgk0Var.l(), fetVar), 0.0f, 2);
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(-1952616936, fetVar, false);
                }
                fetVar.e0(-1952610963);
                fetVar.r(false);
                mm40VarU = o7k0.d(jm40Var, 1.0f);
            }
            fetVar.e0(-1952609226);
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                mzr0 mzr0Var = (mzr0) it.next();
                if (mzr0Var != null) {
                    if (mzr0Var instanceof kzr0) {
                        fetVar.e0(-1431838667);
                        zsm0.d(mm40VarU, (kzr0) mzr0Var, fetVar, 0);
                        fetVar.r(false);
                    } else if (mzr0Var instanceof lzr0) {
                        fetVar.e0(-1431834010);
                        lzr0 lzr0Var = (lzr0) mzr0Var;
                        Object objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = new ip30(cgk0Var, b);
                            fetVar.o0(objP2);
                        }
                        zsm0.c(mm40VarU, lzr0Var, (Function1) objP2, fetVar, 384);
                        fetVar.r(false);
                    }
                }
                throw b1j.f(-1431840754, fetVar, false);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(mm40Var, a4xVar, zzr0Var, i, (byte) 10);
        }
    }

    public static final void i(aus0 aus0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1754053749);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(aus0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40VarD, 268.0f).e((mm40) fetVar.k(t0h.f33118a)), "TWENTY_ONE_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            k7x.a(aus0Var.f1495a, null, i120.S(dw9.i(zclVar2, zclVar2, zclVar2, zclVar2, jm40Var), 1.0f, StaticColors.INSTANCE.m125getWhite100d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), gqw0.A, null, fetVar, 1572912, 1976);
            a(aus0Var, fetVar, i2 & 14);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xts0(aus0Var, i, b);
        }
    }

    public static final void j(ndv0 ndv0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(969274485);
        int i2 = i | (fetVar2.g(ndv0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            k7x.b(ndv0Var.f23353a.a(), null, o7k0.n(jm40Var, 16.0f), a8k0.F(R.drawable.ic_glyph_cyber_gamepad, 0, fetVar2), a8k0.F(R.drawable.ic_glyph_cyber_gamepad, 0, fetVar2), null, null, null, null, null, gqw0.f1, null, fetVar2, 36912, 6, 31712);
            v8q0.a(ndv0Var.b, o2e.e0(s5x0.N(o7k0.d(jm40Var, 1.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14).e(new ecu0(gqw0.k)), "WIDGET_EVENT_HEADER_TEXT"), StaticColors.INSTANCE.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ggt0(ndv0Var, i, (byte) 18);
        }
    }

    public static final void k(mm40 mm40Var, rdv0 rdv0Var, Function0 function0, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        rdv0Var.getClass();
        pdv0 pdv0Var = rdv0Var.d;
        function0.getClass();
        fetVar.g0(-519217336);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(rdv0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i5 & 1, (i5 & 147) != 146)) {
            mm40 mm40Var4 = i4 != 0 ? jm40.b : mm40Var2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var4, 120.0f), 256.0f);
            zcl zclVar2 = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), StaticColors.INSTANCE.m126getWhite200d7_KjU(), jd8.n);
            boolean z = (i5 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xks0(function0, (byte) 7);
                fetVar.o0(objP);
            }
            mm40 mm40VarL = s5x0.L(y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28), 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar, 6);
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
            if (pdv0Var instanceof ndv0) {
                fetVar.e0(-1795870505);
                j((ndv0) pdv0Var, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-1795815728);
                fetVar.r(false);
            }
            l(rdv0Var, fetVar, (i5 >> 3) & 14);
            fetVar.r(true);
            mm40Var3 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(mm40Var3, (Object) rdv0Var, (Object) function0, i, i2, (byte) 20);
        }
    }

    public static final void l(rdv0 rdv0Var, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(-2109110895);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(rdv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            if (rdv0Var.h) {
                fetVar.e0(368997592);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(368998516);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-1502021039, new ggt0(rdv0Var, (byte) 17), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eus0(rdv0Var, i, b);
        }
    }

    public static final void m(qdv0 qdv0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        String str = qdv0Var.b;
        fetVar2.g0(-1843775274);
        int i2 = i | (fetVar2.g(qdv0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(o7k0.s(jm40Var, 62.0f), 68.0f), "WIDGET_EVENT_OPPONENT");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new rbt0(qdv0Var, (byte) 27);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            if (str.length() > 0) {
                fetVar2.e0(-1472699263);
                v8q0.a(str, o2e.e0(s5x0.N(o7k0.t(jm40Var, 32.0f, 54.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), "WIDGET_EVENT_OPPONENT_COEF"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1472238634);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ggt0(qdv0Var, i, (byte) 19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    public static final void n(mm40 mm40Var, iev0 iev0Var, boolean z, fet fetVar, int i) {
        ?? r2;
        ieu0 ieu0Var = iev0Var.b;
        ieu0 ieu0Var2 = iev0Var.f14656a;
        fetVar.g0(-1581860511);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(iev0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = fetVar.k(bmd.n) == k6z.b;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40Var, 4.0f, 0.0f, 4.0f, 4.0f, 2), 46.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
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
            byte b = ieu0Var.f14654a;
            if (ieu0Var2.f14654a <= 0 || b <= 0) {
                r2 = 0;
                fetVar.e0(-1116257209);
                fetVar.r(false);
            } else {
                fetVar.e0(-1116473868);
                ktt0.e(o2e.e0(jm40Var, "FIRST_TEAM_VICTORY_INDICATOR"), ieu0Var2, z2, fetVar, 6);
                r2 = 0;
                fetVar.r(false);
            }
            n4c.l(s5x0.L(jm40Var, 4.0f, 0.0f, 2), iev0Var.c, z, fetVar, r2);
            if (ieu0Var2.f14654a <= 0 || b <= 0) {
                fetVar.e0(-1115684825);
                fetVar.r(r2);
            } else {
                fetVar.e0(-1115904367);
                ktt0.e(o2e.e0(jm40Var, "SECOND_TEAM_VICTORY_INDICATOR"), ieu0Var, !z2, fetVar, 6);
                fetVar.r(r2);
            }
            fetVar.r(true);
            v8q0.a(iev0Var.d, o7k0.e(jm40Var, 12.0f), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 110584);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) mm40Var, (Object) iev0Var, z, i, (byte) 28);
        }
    }

    public static final ValueAnimator o(View view, int i, int i2) {
        view.getClass();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        valueAnimatorOfObject.addUpdateListener(new ro10(view, (byte) 1));
        valueAnimatorOfObject.setDuration(600L);
        return valueAnimatorOfObject;
    }

    public static final o0x p(String str) {
        if (StringsKt.W(str)) {
            str = null;
        }
        if (str == null) {
            return new m0x(R.drawable.ic_sport_boxing_champs_228, null, 6);
        }
        StringBuilder sb = new StringBuilder(ujn.h);
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
        return new n0x(sb.toString());
    }

    public static final float q(int i, int i2, float[] fArr) {
        return fArr[twn.b(i, i2, 2, 1)];
    }

    public static final int r(float f) {
        zcl zclVar = qmk.f28987a;
        List listJ = q3d.j(new ycl(48.0f), new ycl(304.0f), new ycl(188.0f));
        int size = listJ.size() - 1;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            float f2 = f - ((ycl) listJ.get(i2)).f42389a;
            zcl zclVar2 = qmk.f28987a;
            if (ycl.a(f2, 0.0f) < 0) {
                return i;
            }
            f -= ((ycl) listJ.get(i2)).f42389a;
            i++;
        }
        while (true) {
            f -= 64.0f;
            zcl zclVar3 = qmk.f28987a;
            if (ycl.a(f, 0.0f) < 0) {
                return i;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025b A[EDGE_INSN: B:144:0x025b->B:171:0x02b8 BREAK  A[LOOP:5: B:154:0x0277->B:206:0x0277]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a3  */
    public static final int s(y8q0 y8q0Var, Layout layout, w5z w5zVar, int i, RectF rectF, awh0 awh0Var, fa2 fa2Var, boolean z) {
        m6z[] m6zVarArr;
        m6z[] m6zVarArr2;
        int i2;
        int i3;
        int iC;
        int i4;
        int i5;
        int iB;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i6 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i6];
        Layout layout2 = y8q0Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int iE = y8q0Var.e(i);
        if (i6 < (iE - lineStart2) * 2) {
            ycx.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        tlw tlwVar = new tlw(y8q0Var);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i7 = 0;
        while (lineStart2 < iE) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fA = tlwVar.a(lineStart2, z2, z2, true);
                fA3 = tlwVar.a(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fA3 = tlwVar.a(lineStart2, false, false, false);
                fA = tlwVar.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = tlwVar.a(lineStart2, false, false, true);
                    fA = tlwVar.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = tlwVar.a(lineStart2, false, false, false);
                    fA2 = tlwVar.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i7] = fA;
            fArr[i7 + 1] = fA3;
            i7 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) w5zVar.f38604a;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iE2 = w5zVar.E(lineStart3, false);
        int iF = w5zVar.F(iE2);
        int i8 = lineStart3 - iF;
        int i9 = lineEnd2 - iF;
        Bidi bidiG = w5zVar.g(iE2);
        if (bidiG == null || (bidiCreateLineBidi = bidiG.createLineBidi(i8, i9)) == null) {
            m6zVarArr = new m6z[]{new m6z(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            m6zVarArr = new m6z[runCount];
            int i10 = 0;
            while (i10 < runCount) {
                int i11 = runCount;
                m6zVarArr[i10] = new m6z(bidiCreateLineBidi.getRunStart(i10) + lineStart3, bidiCreateLineBidi.getRunLimit(i10) + lineStart3, bidiCreateLineBidi.getRunLevel(i10) % 2 == 1);
                i10++;
                runCount = i11;
            }
        }
        kotlin.ranges.a intRange = z ? new IntRange(0, m6zVarArr.length - 1, 1) : l1e0.i(m6zVarArr.length - 1, 0);
        int i12 = intRange.f46068a;
        int i13 = intRange.b;
        int i14 = intRange.c;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return -1;
        }
        while (true) {
            m6z m6zVar = m6zVarArr[i12];
            boolean z4 = m6zVar.c;
            int iA = m6zVar.f21295a;
            int iE3 = m6zVar.b;
            float f = z4 ? fArr[((iE3 - 1) - lineStart) * 2] : fArr[(iA - lineStart) * 2];
            float fQ = z4 ? q(iA, lineStart, fArr) : q(iE3 - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i15 = i14;
            if (!z) {
                m6zVarArr2 = m6zVarArr;
                if (fQ < f2) {
                    i2 = -1;
                    break;
                }
                float f3 = rectF.right;
                if (f <= f3) {
                    if ((z4 || f3 < fQ) && (!z4 || f2 > f)) {
                        int i16 = iE3;
                        int i17 = iA;
                        while (i16 - i17 > 1) {
                            int i18 = (i16 + i17) / 2;
                            float f4 = fArr[(i18 - lineStart) * 2];
                            int i19 = i16;
                            if ((z4 || f4 <= rectF.right) && (!z4 || f4 >= rectF.left)) {
                                i16 = i19;
                                i17 = i18;
                            } else {
                                i16 = i18;
                            }
                        }
                        i3 = z4 ? i16 : i17;
                    } else {
                        i3 = iE3 - 1;
                    }
                    int iB2 = awh0Var.b(i3 + 1);
                    if (iB2 == -1 || (iC = awh0Var.c(iB2)) <= iA) {
                        i2 = -1;
                        break;
                    }
                    if (iB2 < iA) {
                        iB2 = iA;
                    }
                    if (iC <= iE3) {
                        iE3 = iC;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iB3 = iB2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iE3 - 1) - lineStart) * 2] : fArr[(iB3 - lineStart) * 2];
                        rectF2.right = z4 ? q(iB3, lineStart, fArr) : q(iE3 - 1, lineStart, fArr);
                        if (((Boolean) fa2Var.invoke(rectF2, rectF)).booleanValue()) {
                            i2 = iE3;
                            break;
                        }
                        iE3 = awh0Var.e(iE3);
                        if (iE3 == -1 || iE3 <= iA) {
                            i2 = -1;
                            break;
                        }
                        iB3 = awh0Var.b(iE3);
                        if (iB3 < iA) {
                            iB3 = iA;
                        }
                    }
                } else {
                    i2 = -1;
                    break;
                }
                iA = i2;
            } else {
                if (fQ < f2) {
                    m6zVarArr2 = m6zVarArr;
                    iA = -1;
                    break;
                }
                float f5 = rectF.right;
                if (f <= f5) {
                    if ((z4 || f2 > f) && (!z4 || f5 < fQ)) {
                        int i20 = iE3;
                        int i21 = iA;
                        while (true) {
                            i4 = i20;
                            if (i20 - i21 <= 1) {
                                break;
                            }
                            int i22 = (i4 + i21) / 2;
                            float f6 = fArr[(i22 - lineStart) * 2];
                            if ((z4 || f6 <= rectF.left) && (!z4 || f6 >= rectF.right)) {
                                i20 = i4;
                                i21 = i22;
                            } else {
                                i20 = i22;
                            }
                        }
                        i5 = z4 ? i4 : i21;
                    } else {
                        i5 = iA;
                    }
                    int iC2 = awh0Var.c(i5);
                    if (iC2 != -1 && (iB = awh0Var.b(iC2)) < iE3) {
                        if (iB >= iA) {
                            iA = iB;
                        }
                        if (iC2 > iE3) {
                            iC2 = iE3;
                        }
                        m6zVarArr2 = m6zVarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iC3 = iC2;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iC3 - 1) - lineStart) * 2] : fArr[(iA - lineStart) * 2];
                            rectF3.right = z4 ? q(iA, lineStart, fArr) : q(iC3 - 1, lineStart, fArr);
                            if (((Boolean) fa2Var.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iA = awh0Var.a(iA);
                            if (iA != -1 && iA < iE3) {
                                iC3 = awh0Var.c(iA);
                                if (iC3 > iE3) {
                                    iC3 = iE3;
                                }
                            }
                        }
                    } else {
                        m6zVarArr2 = m6zVarArr;
                    }
                    iA = -1;
                    break;
                } else {
                    m6zVarArr2 = m6zVarArr;
                    iA = -1;
                    break;
                }
            }
            if (iA >= 0) {
                return iA;
            }
            if (i12 == i13) {
                return -1;
            }
            i12 += i15;
            i14 = i15;
            m6zVarArr = m6zVarArr2;
        }
    }

    public static final String t(c2p0 c2p0Var) {
        List list;
        b2p0 b2p0Var;
        String str = (c2p0Var == null || (list = c2p0Var.d) == null || (b2p0Var = (b2p0) CollectionsKt.f0(list)) == null) ? null : b2p0Var.b;
        if (str == null) {
            str = "";
        }
        if (kotlin.text.c.x(str, ujn.h, false)) {
            return str;
        }
        if (str.length() != 0) {
            List list2 = u0d.f34849a;
            if (!u0d.c(str)) {
                return String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
            }
        }
        return "";
    }

    public static final String u(c2p0 c2p0Var, cys0 cys0Var) {
        List list;
        b2p0 b2p0Var;
        String str = null;
        String str2 = c2p0Var != null ? c2p0Var.c : null;
        if (str2 == null) {
            str2 = "";
        }
        if (cys0Var == cys0.c && str2.length() == 0) {
            if (c2p0Var != null && (list = c2p0Var.d) != null && (b2p0Var = (b2p0) CollectionsKt.firstOrNull(list)) != null) {
                str = b2p0Var.b;
            }
            str2 = str == null ? "" : str;
        }
        if (kotlin.text.c.x(str2, ujn.h, false)) {
            return str2;
        }
        if (str2.length() != 0) {
            List list2 = u0d.f34849a;
            if (!u0d.c(str2)) {
                return String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
            }
        }
        return "";
    }

    public static final boolean v(Window window) {
        window.getClass();
        WeakHashMap weakHashMap = hxv0.f13831a;
        window.getClass();
        return hxv0.f13831a.containsKey(window);
    }

    public static final ObjectAnimator w(View view, float f) {
        view.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f);
        objectAnimatorOfFloat.setDuration(600L);
        return objectAnimatorOfFloat;
    }

    public static String x(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
