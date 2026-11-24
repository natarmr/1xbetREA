package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class etl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ iiy[] f8381a = {new ez40(etl.class, "lineCount", "getLineCount(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new ez40(etl.class, "hasEllipsis", "getHasEllipsis(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)};
    public static final zai0 b = new zai0("LineCount");
    public static final zai0 c = new zai0("Ellipsis");

    public static final void a(final mm40 mm40Var, final o0x o0xVar, final o0x o0xVar2, final int i, final Integer num, cp5 cp5Var, float f, final Function1 function1, fet fetVar, final int i2, final int i3) {
        int i4;
        o0x o0xVar3;
        float f2;
        final cp5 cp5Var2;
        final float f3;
        float f4;
        int i5;
        cp5 cp5Var3;
        float f5;
        Object tg4Var;
        int i6;
        cl5 cl5Var;
        Object obj;
        float f6;
        long secondary20;
        boolean z;
        long secondary40;
        fet fetVar2 = fetVar;
        pge pgeVar = gqw0.A;
        o0xVar.getClass();
        o0xVar2.getClass();
        fetVar2.g0(39304048);
        if ((i2 & 6) == 0) {
            i4 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            o0xVar3 = o0xVar;
            i4 |= fetVar2.g(o0xVar3) ? 32 : 16;
        } else {
            o0xVar3 = o0xVar;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar2.g(o0xVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar2.e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= fetVar2.g(num) ? 16384 : 8192;
        }
        int i7 = i3 & 32;
        int i8 = 196608;
        if (i7 != 0) {
            i4 |= i8;
        } else if ((196608 & i2) == 0) {
            i8 = fetVar2.e(cp5Var == null ? -1 : cp5Var.ordinal()) ? 131072 : 65536;
            i4 |= i8;
        }
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                f2 = f;
                int i9 = fetVar2.d(f2) ? 1048576 : 524288;
                i4 |= i9;
            } else {
                f2 = f;
            }
            i4 |= i9;
        } else {
            f2 = f;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= fetVar2.i(function1) ? 8388608 : 4194304;
        }
        if (fetVar2.U(i4 & 1, (i4 & 4793491) != 4793490)) {
            fetVar2.Z();
            if ((i2 & 1) == 0 || fetVar2.B()) {
                cp5 cp5Var4 = i7 != 0 ? cp5.f4728a : cp5Var;
                if ((i3 & 64) != 0) {
                    zcl zclVar = qmk.f28987a;
                    i4 &= -3670017;
                    f4 = 40.0f;
                } else {
                    f4 = f2;
                }
                cp5 cp5Var5 = cp5Var4;
                i5 = i4;
                cp5Var3 = cp5Var5;
                f5 = f4;
            } else {
                fetVar2.X();
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                }
                i5 = i4;
                f5 = f2;
                cp5Var3 = cp5Var;
            }
            fetVar2.s();
            Object objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP == cl5Var2) {
                objP = o0xVar3.a();
                fetVar2.o0(objP);
            }
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var2) {
                objP2 = o0xVar2.a();
                fetVar2.o0(objP2);
            }
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var2) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP3);
            }
            pz40 pz40Var = (pz40) objP3;
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var2) {
                objP4 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP4);
            }
            pz40 pz40Var2 = (pz40) objP4;
            boolean zH = fetVar2.h(((Boolean) pz40Var.getValue()).booleanValue());
            Object objP5 = fetVar2.P();
            if (zH || objP5 == cl5Var2) {
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    objP = objP2;
                }
                fetVar2.o0(objP);
                objP5 = objP;
            }
            boolean zI = ((i5 & 896) == 256) | fetVar2.i(objP5) | fetVar2.i(objP2) | ((i5 & 112) == 32) | ((29360128 & i5) == 8388608);
            Object objP6 = fetVar2.P();
            if (zI || objP6 == cl5Var2) {
                i6 = 16384;
                Object obj2 = objP5;
                tg4Var = new tg4(obj2, objP2, (Object) o0xVar2, (Object) o0xVar3, (Object) function1, (Object) pz40Var, (Object) pz40Var2, (byte) 6);
                cl5Var = cl5Var2;
                obj = obj2;
                fetVar2.o0(tg4Var);
            } else {
                tg4Var = objP6;
                obj = objP5;
                cl5Var = cl5Var2;
                i6 = 16384;
            }
            int i10 = i5;
            float f7 = f5;
            cl5 cl5Var3 = cl5Var;
            mz3 mz3VarX = l7x.X(obj, (Function1) tg4Var, null, fetVar2, 0, 26);
            boolean z2 = ((i10 & 7168) == 2048) | ((57344 & i10) == i6);
            Object objP7 = fetVar2.P();
            if (z2 || objP7 == cl5Var3) {
                objP7 = new g18((Object) num, i, (Object) pz40Var2, (byte) 2);
                fetVar2.o0(objP7);
            }
            mm40 mm40VarA = pai0.a(mm40Var, false, (Function1) objP7);
            if (((Boolean) pz40Var2.getValue()).booleanValue()) {
                fetVar2.e0(-1617556104);
                fetVar2 = fetVar;
                f6 = f7;
                j0x.b(mz3VarX, null, mm40VarA, null, pgeVar, 0.0f, null, fetVar2, 24624, 104);
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                f6 = f7;
                if (num != null) {
                    fetVar2.e0(-1617297409);
                    j0x.b(a8k0.F(num.intValue(), (i10 >> 12) & 14, fetVar2), null, mm40VarA, null, pgeVar, 0.0f, null, fetVar2, 24632, 104);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1617016332);
                    int iOrdinal = cp5Var3.ordinal();
                    if (iOrdinal == 0) {
                        fetVar2.e0(-883436581);
                        secondary20 = afn0.m(fetVar2).getSecondary20();
                        fetVar2.r(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw b1j.f(-883442538, fetVar2, false);
                        }
                        fetVar2.e0(-883439401);
                        secondary20 = afn0.p(fetVar2).m126getWhite200d7_KjU();
                        fetVar2.r(false);
                    }
                    mm40 mm40VarQ = i120.Q(mm40VarA, secondary20, jd8.n);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                    pm80 pm80VarF = a8k0.F(i, (i10 >> 9) & 14, fetVar2);
                    int iOrdinal2 = cp5Var3.ordinal();
                    if (iOrdinal2 != 0) {
                        z = true;
                        if (iOrdinal2 != 1) {
                            throw b1j.f(-397750415, fetVar2, false);
                        }
                        fetVar2.e0(-397747394);
                        secondary40 = afn0.p(fetVar2).m129getWhite400d7_KjU();
                        fetVar2.r(false);
                    } else {
                        z = true;
                        fetVar2.e0(-397744702);
                        secondary40 = afn0.m(fetVar2).getSecondary40();
                        fetVar2.r(false);
                    }
                    dww.c(pm80VarF, null, jr8.f16991a.b(o7k0.n(jm40.b, f6), gqw0.e), secondary40, fetVar, 56, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(z);
                    fetVar2.r(false);
                }
            }
            f3 = f6;
            cp5Var2 = cp5Var3;
        } else {
            fetVar2.X();
            cp5Var2 = cp5Var;
            f3 = f2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ysl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    etl.a(mm40Var, o0xVar, o0xVar2, i, num, cp5Var2, f3, function1, (fet) obj3, x8x.L(i2 | 1), i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(244137318);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zq8.a(0, fetVar, xbc.c0(mm40Var, vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 6);
        }
    }

    public static final void c(mm40 mm40Var, er5 er5Var, fet fetVar, int i, int i2) {
        int i3;
        fet fetVar2;
        er5Var.getClass();
        fetVar.g0(1959649252);
        int i4 = i2 & 1;
        byte b2 = 4;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        int i5 = i3 | (fetVar.g(er5Var) ? 32 : 16);
        if (fetVar.U(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            String str = er5Var.f8264a;
            gro0 gro0Var = er5Var.b;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new xjl(b2);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            j6n.h(str, gro0Var, ffb0.P(mm40Var, (Function1) objP), 0, 0, fetVar2, 0, 24);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm(mm40Var2, (Object) er5Var, i, i2, (byte) 13);
        }
    }

    public static final void d(mm40 mm40Var, o0x o0xVar, fet fetVar, int i) {
        o0xVar.getClass();
        fetVar.g0(-1666848400);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(o0xVar) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objA = o0xVar.a();
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new wil(pz40Var, (byte) 5);
                fetVar.o0(objP2);
            }
            mz3 mz3VarX = l7x.X(objA, (Function1) objP2, null, fetVar, 384, 26);
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
            if (((lz3) pz40Var.getValue()) instanceof kz3) {
                fetVar.e0(1485582520);
                zcl zclVar = qmk.f28987a;
                j0x.b(mz3VarX, null, o7k0.p(jm40.b, 320.0f, 40.0f), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
                fetVar.r(false);
            } else {
                fetVar.e0(1485826924);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zwa(mm40Var, o0xVar, i, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:105:0x0148  */
    /* JADX WARN: Code duplicated, block: B:109:0x015c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0183  */
    /* JADX WARN: Code duplicated, block: B:113:0x0185  */
    /* JADX WARN: Code duplicated, block: B:116:0x018c  */
    /* JADX WARN: Code duplicated, block: B:117:0x018e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0196  */
    /* JADX WARN: Code duplicated, block: B:121:0x0198  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:141:0x020e  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0113  */
    /* JADX WARN: Code duplicated, block: B:93:0x0121  */
    /* JADX WARN: Code duplicated, block: B:94:0x0128  */
    public static final void e(final mm40 mm40Var, final a4x a4xVar, final lq5 lq5Var, boolean z, xcz xczVar, float f, int i, Integer num, final Function2 function2, fet fetVar, final int i2, final int i3) {
        int i4;
        a4x a4xVar2;
        boolean z2;
        xcz xczVar2;
        int i5;
        Integer num2;
        int i6;
        boolean z3;
        final float f2;
        final int i7;
        final boolean z4;
        final xcz xczVar3;
        final Integer num3;
        yfe0 yfe0VarU;
        xcz xczVarA;
        float f3;
        int i8;
        int i9;
        int i10;
        float f4;
        Integer num4;
        ow3 qw3Var;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objP;
        boolean z11;
        int i11;
        a4xVar.getClass();
        lq5Var.getClass();
        function2.getClass();
        fetVar.g0(-334322795);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            a4xVar2 = a4xVar;
            i4 |= fetVar.g(a4xVar2) ? 32 : 16;
        } else {
            a4xVar2 = a4xVar;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.g(lq5Var) ? 256 : 128;
        }
        int i12 = i3 & 8;
        if (i12 == 0) {
            if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= fetVar.h(z2) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    xczVar2 = xczVar;
                    int i13 = fetVar.g(xczVar2) ? 16384 : 8192;
                    i4 |= i13;
                } else {
                    xczVar2 = xczVar;
                }
                i4 |= i13;
            } else {
                xczVar2 = xczVar;
            }
            if ((196608 & i2) == 0) {
                i4 |= 65536;
            }
            if ((1572864 & i2) == 0) {
                i4 |= 524288;
            }
            i5 = i3 & 128;
            if (i5 != 0) {
                i4 |= 12582912;
                num2 = num;
            } else {
                num2 = num;
                if ((i2 & 12582912) == 0) {
                    if (fetVar.g(num2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
            }
            if ((i2 & 100663296) == 0) {
                if (fetVar.i(function2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            if ((i4 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i4 & 1, z3)) {
                fetVar.Z();
                if ((i2 & 1) != 0 || fetVar.B()) {
                    if (i12 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 16) != 0) {
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        i4 &= -57345;
                    } else {
                        xczVarA = xczVar2;
                    }
                    f3 = xfn.a(fetVar).c;
                    i8 = i4 & (-4128769);
                    if (i5 != 0) {
                        i10 = R.drawable.ic_glyph_sand_clock;
                        f4 = f3;
                        xczVar2 = xczVarA;
                        num4 = null;
                        i9 = i8;
                    } else {
                        i9 = i8;
                        i10 = R.drawable.ic_glyph_sand_clock;
                        f4 = f3;
                        xczVar2 = xczVarA;
                        num4 = num2;
                    }
                } else {
                    fetVar.X();
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    f4 = f;
                    i10 = i;
                    i9 = i4 & (-4128769);
                    num4 = num2;
                }
                fetVar.s();
                if (a4xVar2.size() != 1 && ((lq5Var instanceof eq5) || (lq5Var instanceof dq5))) {
                    qw3Var = rq8.c;
                } else if (!(lq5Var instanceof jq5) || (lq5Var instanceof kq5)) {
                    zcl zclVar = qmk.f28987a;
                    qw3Var = new qw3(16.0f, true, new jf4((byte) 14));
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                }
                ow3 ow3Var = qw3Var;
                mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var, 1.0f), "LAZY_ROW_BANNER_COLLECTION");
                lh80 lh80VarT = s5x0.t(f4, 0.0f, 2);
                if ((i9 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i9 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z12 = z5 | z6;
                if ((i9 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zE = z12 | z7 | fetVar.e(i10);
                if ((29360128 & i9) == 8388608) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z13 = zE | z8;
                if ((234881024 & i9) == 67108864) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z13 | z9;
                objP = fetVar.P();
                if (!z10 || objP == ukd.f35823a) {
                    boolean z14 = z2;
                    zsl zslVar = new zsl(z14, lq5Var, a4xVar2, i10, num4, function2);
                    z11 = z14;
                    fetVar.o0(zslVar);
                    objP = zslVar;
                } else {
                    z11 = z2;
                }
                xcz xczVar4 = xczVar2;
                b8k0.f(mm40VarE0, xczVar4, lh80VarT, false, ow3Var, null, null, false, null, (Function1) objP, fetVar, (i9 >> 9) & 112, Response.NOT_ACCEPTABLE_HERE);
                xczVar3 = xczVar4;
                i7 = i10;
                z4 = z11;
                num3 = num4;
                f2 = f4;
            } else {
                fetVar.X();
                f2 = f;
                i7 = i;
                z4 = z2;
                xczVar3 = xczVar2;
                num3 = num2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.atl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        etl.e(mm40Var, a4xVar, lq5Var, z4, xczVar3, f2, i7, num3, function2, (fet) obj, x8x.L(i2 | 1), i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                xczVar2 = xczVar;
                if (fetVar.g(xczVar2)) {
                }
                i4 |= i13;
            } else {
                xczVar2 = xczVar;
            }
            i4 |= i13;
        } else {
            xczVar2 = xczVar;
        }
        if ((196608 & i2) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= 524288;
        }
        i5 = i3 & 128;
        if (i5 != 0) {
            i4 |= 12582912;
            num2 = num;
        } else {
            num2 = num;
            if ((i2 & 12582912) == 0) {
                if (fetVar.g(num2)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
        }
        if ((i2 & 100663296) == 0) {
            if (fetVar.i(function2)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i4 |= i11;
        }
        if ((i4 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i4 & 1, z3)) {
            fetVar.Z();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    z2 = false;
                }
                if ((i3 & 16) != 0) {
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    i4 &= -57345;
                } else {
                    xczVarA = xczVar2;
                }
                f3 = xfn.a(fetVar).c;
                i8 = i4 & (-4128769);
                if (i5 != 0) {
                    i10 = R.drawable.ic_glyph_sand_clock;
                    f4 = f3;
                    xczVar2 = xczVarA;
                    num4 = null;
                    i9 = i8;
                } else {
                    i9 = i8;
                    i10 = R.drawable.ic_glyph_sand_clock;
                    f4 = f3;
                    xczVar2 = xczVarA;
                    num4 = num2;
                }
            } else {
                if (i12 != 0) {
                    z2 = false;
                }
                if ((i3 & 16) != 0) {
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    i4 &= -57345;
                } else {
                    xczVarA = xczVar2;
                }
                f3 = xfn.a(fetVar).c;
                i8 = i4 & (-4128769);
                if (i5 != 0) {
                    i10 = R.drawable.ic_glyph_sand_clock;
                    f4 = f3;
                    xczVar2 = xczVarA;
                    num4 = null;
                    i9 = i8;
                } else {
                    i9 = i8;
                    i10 = R.drawable.ic_glyph_sand_clock;
                    f4 = f3;
                    xczVar2 = xczVarA;
                    num4 = num2;
                }
            }
            fetVar.s();
            if (a4xVar2.size() != 1) {
                if (lq5Var instanceof jq5) {
                    zcl zclVar3 = qmk.f28987a;
                    qw3Var = new qw3(16.0f, true, new jf4((byte) 14));
                } else {
                    zcl zclVar4 = qmk.f28987a;
                    qw3Var = new qw3(16.0f, true, new jf4((byte) 14));
                }
            } else if (lq5Var instanceof jq5) {
                zcl zclVar5 = qmk.f28987a;
                qw3Var = new qw3(16.0f, true, new jf4((byte) 14));
            } else {
                zcl zclVar6 = qmk.f28987a;
                qw3Var = new qw3(16.0f, true, new jf4((byte) 14));
            }
            ow3 ow3Var2 = qw3Var;
            mm40 mm40VarE1 = o2e.e0(o7k0.d(mm40Var, 1.0f), "LAZY_ROW_BANNER_COLLECTION");
            lh80 lh80VarT2 = s5x0.t(f4, 0.0f, 2);
            if ((i9 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i9 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z15 = z5 | z6;
            if ((i9 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean zE2 = z15 | z7 | fetVar.e(i10);
            if ((29360128 & i9) == 8388608) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z16 = zE2 | z8;
            if ((234881024 & i9) == 67108864) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z16 | z9;
            objP = fetVar.P();
            if (z10) {
                boolean z17 = z2;
                zsl zslVar2 = new zsl(z17, lq5Var, a4xVar2, i10, num4, function2);
                z11 = z17;
                fetVar.o0(zslVar2);
                objP = zslVar2;
            } else {
                boolean z18 = z2;
                zsl zslVar3 = new zsl(z18, lq5Var, a4xVar2, i10, num4, function2);
                z11 = z18;
                fetVar.o0(zslVar3);
                objP = zslVar3;
            }
            xcz xczVar5 = xczVar2;
            b8k0.f(mm40VarE1, xczVar5, lh80VarT2, false, ow3Var2, null, null, false, null, (Function1) objP, fetVar, (i9 >> 9) & 112, Response.NOT_ACCEPTABLE_HERE);
            xczVar3 = xczVar5;
            i7 = i10;
            z4 = z11;
            num3 = num4;
            f2 = f4;
        } else {
            fetVar.X();
            f2 = f;
            i7 = i;
            z4 = z2;
            xczVar3 = xczVar2;
            num3 = num2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.atl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    etl.e(mm40Var, a4xVar, lq5Var, z4, xczVar3, f2, i7, num3, function2, (fet) obj, x8x.L(i2 | 1), i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(987470699);
        int i2 = i | 48 | (fetVar.d(16.0f) ? 256 : 128);
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 48.0f);
            zfn zfnVar = m8m0.f21378a;
            zq8.a(0, fetVar, jr8.f16991a.b(i120.P(mm40VarE, yk5.n(q3d.j(new y3d(((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU()), new y3d(((StaticColors) fetVar.k(zfnVar)).m78getBlack800d7_KjU())), 0.0f, 0.0f, 14), vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3), 4), gqw0.h));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 5);
        }
    }

    public static final void g(abi0 abi0Var, int i) {
        iiy iiyVar = f8381a[0];
        Integer numValueOf = Integer.valueOf(i);
        zai0 zai0Var = b;
        zai0Var.getClass();
        abi0Var.b(zai0Var, numValueOf);
    }
}
