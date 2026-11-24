package a;

import android.javax.sip.message.Response;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vmm {
    static {
        dyb.g0("длина не менее 8 символов;", "содержать: строчные, прописные буквы, цифры;", "не должен быть распространенным;", "не более 20% процентов повторяющихся символов.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final mm40 mm40Var, final List list, String str, int i, boolean z, int i2, int i3, final y9q0 y9q0Var, fet fetVar, final int i4) {
        int i5;
        final String str2;
        final int i6;
        final boolean z2;
        final int i7;
        final int i8;
        fet fetVar2;
        yfe0 yfe0VarU;
        Function2 function2;
        String str3;
        final int i9;
        final int i10;
        final int i11;
        boolean z3;
        Object obj;
        int i12;
        Object obj2;
        int i13;
        fet fetVar3 = fetVar;
        fetVar3.g0(348391817);
        if ((i4 & 6) == 0) {
            i5 = i4 | (fetVar3.g(mm40Var) ? 4 : 2);
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= (i4 & 64) == 0 ? fetVar3.g(list) : fetVar3.i(list) ? 32 : 16;
        }
        int i14 = i5 | 1797504;
        if ((i4 & 12582912) == 0) {
            i14 |= fetVar3.g(y9q0Var) ? 8388608 : 4194304;
        }
        int i15 = i14;
        int i16 = 0;
        if (fetVar3.U(i15 & 1, (4793491 & i15) != 4793490)) {
            fetVar3.Z();
            if ((i4 & 1) == 0 || fetVar3.B()) {
                str3 = "•\t\t";
                i9 = Integer.MAX_VALUE;
                i10 = 1;
                i11 = 1;
                z3 = true;
            } else {
                fetVar3.X();
                str3 = str;
                i10 = i;
                z3 = z;
                i9 = i2;
                i11 = i3;
            }
            fetVar3.s();
            if (list.isEmpty()) {
                yfe0VarU = fetVar3.u();
                if (yfe0VarU == null) {
                    return;
                }
                final String str4 = str3;
                final byte b = 0;
                final boolean z4 = z3;
                function2 = new Function2() { // from class: a.umm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b2 = b;
                        int i17 = i4;
                        switch (b2) {
                            case 0:
                                ((Integer) obj4).getClass();
                                int iL = x8x.L(i17 | 1);
                                mm40 mm40Var2 = mm40Var;
                                List list2 = list;
                                String str5 = str4;
                                boolean z5 = i10;
                                boolean z6 = z4;
                                int i18 = i9;
                                boolean z7 = i11;
                                y9q0 y9q0Var2 = y9q0Var;
                                vmm.a(mm40Var2, list2, str5, z5 ? 1 : 0, z6, i18, z7 ? 1 : 0, y9q0Var2, (fet) obj3, iL);
                                break;
                            default:
                                ((Integer) obj4).getClass();
                                int iL2 = x8x.L(i17 | 1);
                                mm40 mm40Var3 = mm40Var;
                                List list3 = list;
                                String str6 = str4;
                                boolean z8 = i10;
                                boolean z9 = z4;
                                int i19 = i9;
                                boolean z10 = i11;
                                y9q0 y9q0Var3 = y9q0Var;
                                vmm.a(mm40Var3, list3, str6, z8 ? 1 : 0, z9, i19, z10 ? 1 : 0, y9q0Var3, (fet) obj3, iL2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                int i17 = i10;
                int i18 = i9;
                int i19 = i11;
                boolean z5 = z3;
                String str5 = str3;
                fetVar3.e0(-202900574);
                g9q0 g9q0VarN = pym0.n(fetVar3);
                int i20 = i15 & 896;
                boolean z6 = ((((29360128 & i15) ^ 12582912) > 8388608 && fetVar3.g(y9q0Var)) || (12582912 & i15) == 8388608) | (i20 == 256);
                Object objP = fetVar3.P();
                Object obj3 = ukd.f35823a;
                if (z6 || objP == obj3) {
                    obj = obj3;
                    i12 = 256;
                    Object objValueOf = Integer.valueOf((int) (g9q0.a(g9q0VarN, str5, y9q0Var, 0, 0, 0L, null, 1020).c >> 32));
                    fetVar3.o0(objValueOf);
                    obj2 = objValueOf;
                } else {
                    i12 = 256;
                    obj = obj3;
                    obj2 = objP;
                }
                long jZ = ((w6k) fetVar3.k(bmd.h)).z(((Number) obj2).intValue());
                fetVar3.r(false);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                int iHashCode = Long.hashCode(fetVar3.T);
                bh90 bh90VarM = fetVar3.m();
                mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var);
                mkd.c0.getClass();
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(e7z.u1);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, x5dVarA, gqw0.x);
                jpm0.o(fetVar3, bh90VarM, gqw0.w);
                jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar3);
                Iterator itV = kng0.v(fetVar3, mm40VarC0, gqw0.v, 1859288373, list);
                int i21 = 0;
                fet fetVar4 = fetVar3;
                while (itV.hasNext()) {
                    Object next = itV.next();
                    int i22 = i21 + 1;
                    if (i21 < 0) {
                        q3d.p();
                        throw null;
                    }
                    CharSequence charSequence = (CharSequence) next;
                    int i23 = (i20 == i12 ? 1 : i16) | (fetVar4.f(jZ) ? 1 : 0);
                    Object objP2 = fetVar4.P();
                    Object obj4 = objP2;
                    if (i23 != 0 || objP2 == obj) {
                        h83 h83Var = new h83();
                        CharSequence charSequenceU0 = StringsKt.u0(charSequence);
                        if (!StringsKt.W(charSequenceU0)) {
                            int iF = h83Var.f(new eo80(i16, new g8q0(jZ, 1), Response.SERVICE_UNAVAILABLE));
                            try {
                                int iG = h83Var.g(new smk0(0L, 0L, psq.g, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65531));
                                try {
                                    h83Var.c(str5);
                                    h83Var.d(iG);
                                    if (charSequenceU0 instanceof j83) {
                                        h83Var.b((j83) charSequenceU0);
                                    } else {
                                        h83Var.f12607a.append(charSequenceU0);
                                    }
                                    h83Var.d(iF);
                                } catch (Throwable th) {
                                    h83Var.d(iG);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                h83Var.d(iF);
                                throw th2;
                            }
                        }
                        Object objH = h83Var.h();
                        fetVar4.o0(objH);
                        obj4 = objH;
                    }
                    jm40 jm40Var = jm40.b;
                    long j = jZ;
                    String str6 = str5;
                    int i24 = i21;
                    int i25 = i20;
                    Object obj5 = obj;
                    boolean z7 = z5;
                    int i26 = i18;
                    int i27 = i12;
                    int i28 = i17;
                    int i29 = i19;
                    int i30 = i15;
                    v8q0.b((j83) obj4, o2e.e0(jm40Var, "BULLET_LIST_TEXT"), 0L, null, 0L, null, 0L, null, 0L, i28, z7, i26, i29, null, null, y9q0Var, fetVar, 48, ((i15 >> 3) & 524160) | ((i15 << 3) & 234881024), 200700);
                    fet fetVar5 = fetVar;
                    if (i24 != list.size() - 1) {
                        fetVar5.e0(-381080450);
                        zcl zclVar = qmk.f28987a;
                        i13 = 0;
                        rz4.t(jm40Var, 8.0f, fetVar5, false);
                    } else {
                        i13 = 0;
                        fetVar5.e0(-381014141);
                        fetVar5.r(false);
                    }
                    i16 = i13;
                    i19 = i29;
                    i17 = i28;
                    z5 = z7;
                    i18 = i26;
                    i21 = i22;
                    i15 = i30;
                    str5 = str6;
                    i12 = i27;
                    jZ = j;
                    i20 = i25;
                    obj = obj5;
                    fetVar4 = fetVar5;
                }
                i8 = i19;
                fetVar4.r(i16);
                fetVar4.r(true);
                i6 = i17;
                z2 = z5;
                i7 = i18;
                str2 = str5;
                fetVar2 = fetVar4;
            }
            yfe0VarU.d = function2;
        }
        fetVar3.X();
        str2 = str;
        i6 = i;
        z2 = z;
        i7 = i2;
        i8 = i3;
        fetVar2 = fetVar3;
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            function2 = new Function2() { // from class: a.umm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    byte b3 = b2;
                    int i110 = i4;
                    switch (b3) {
                        case 0:
                            ((Integer) obj7).getClass();
                            int iL = x8x.L(i110 | 1);
                            mm40 mm40Var2 = mm40Var;
                            List list2 = list;
                            String str7 = str2;
                            boolean z8 = i6;
                            boolean z9 = z2;
                            int i111 = i7;
                            boolean z10 = i8;
                            y9q0 y9q0Var2 = y9q0Var;
                            vmm.a(mm40Var2, list2, str7, z8 ? 1 : 0, z9, i111, z10 ? 1 : 0, y9q0Var2, (fet) obj6, iL);
                            break;
                        default:
                            ((Integer) obj7).getClass();
                            int iL2 = x8x.L(i110 | 1);
                            mm40 mm40Var3 = mm40Var;
                            List list3 = list;
                            String str8 = str2;
                            boolean z11 = i6;
                            boolean z12 = z2;
                            int i112 = i7;
                            boolean z13 = i8;
                            y9q0 y9q0Var3 = y9q0Var;
                            vmm.a(mm40Var3, list3, str8, z11 ? 1 : 0, z12, i112, z13 ? 1 : 0, y9q0Var3, (fet) obj6, iL2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0179  */
    /* JADX WARN: Code duplicated, block: B:85:0x017f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x01da  */
    public static final void b(mm40 mm40Var, String str, a4x a4xVar, wmm wmmVar, l7m0 l7m0Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        String str2;
        wmm wmmVar2;
        Function0 function2;
        cl5 cl5Var;
        boolean z;
        boolean z2;
        Object objP;
        int i3;
        fet fetVar2 = fetVar;
        str.getClass();
        a4xVar.getClass();
        fetVar2.g0(1131978053);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= fetVar2.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar2.g(a4xVar) : fetVar2.i(a4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            wmmVar2 = wmmVar;
            i2 |= fetVar2.g(wmmVar2) ? 2048 : 1024;
        } else {
            wmmVar2 = wmmVar;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(l7m0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function0) ? 131072 : 65536;
        }
        int i4 = i2 | 1572864;
        if (fetVar2.U(i4 & 1, (599187 & i4) != 599186)) {
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP2 == cl5Var2) {
                objP2 = new ndm((byte) 19);
                fetVar2.o0(objP2);
            }
            Function0 function3 = (Function0) objP2;
            boolean z3 = (57344 & i4) == 16384;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var2) {
                objP3 = androidx.compose.runtime.e.e(Boolean.valueOf(l7m0Var != null ? ((Boolean) l7m0Var.getValue()).booleanValue() : false));
                fetVar2.o0(objP3);
            }
            pz40 pz40Var = (pz40) objP3;
            boolean zBooleanValue = ((Boolean) (l7m0Var != null ? l7m0Var.getValue() : pz40Var.getValue())).booleanValue();
            mm40 mm40VarW = y860.W(o7k0.d(mm40Var, 1.0f), null, null, false, null, function3, 28);
            fetVar2.e0(808330871);
            long background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
            fetVar2.r(false);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarW, background, vgg0.a(16.0f)), "PASSWORD_REQUIREMENTS_COLUMN");
            boolean zH = fetVar2.h(zBooleanValue);
            Object objP4 = fetVar2.P();
            if (zH) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP4 == cl5Var) {
                }
                mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP4);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
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
                boolean zG = fetVar2.g(pz40Var);
                if ((458752 & i4) == 131072) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zG | z;
                objP = fetVar2.P();
                if (z2 || objP == cl5Var) {
                    objP = new tmm((byte) 0, pz40Var, function0);
                    fetVar2.o0(objP);
                }
                i3 = i4 >> 3;
                c(str2, wmmVar2, zBooleanValue, (Function0) objP, fetVar2, (i3 & 14) | ((i4 >> 6) & 112));
                if (zBooleanValue) {
                    fetVar2.e0(1070217274);
                    mm40 mm40VarN = s5x0.N(jm40.b, 16.0f, 0.0f, 8.0f, 12.0f, 2);
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    a(mm40VarN, a4xVar, null, 0, false, 0, 0, ibm0.n(g1t0.n(), fetVar2), fetVar, i3 & 112);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(1070547207);
                    fetVar2.r(false);
                }
                fetVar2.r(true);
                function2 = function3;
            }
            objP4 = new z((byte) 24, zBooleanValue);
            fetVar2.o0(objP4);
            mm40 mm40VarA2 = pai0.a(mm40VarE0, false, (Function1) objP4);
            x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarA2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, gqw0.x);
            jpm0.o(fetVar2, bh90VarM2, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC1, gqw0.v);
            boolean zG2 = fetVar2.g(pz40Var);
            if ((458752 & i4) == 131072) {
                z = true;
            } else {
                z = false;
            }
            z2 = zG2 | z;
            objP = fetVar2.P();
            if (z2) {
                objP = new tmm((byte) 0, pz40Var, function0);
                fetVar2.o0(objP);
            } else {
                objP = new tmm((byte) 0, pz40Var, function0);
                fetVar2.o0(objP);
            }
            i3 = i4 >> 3;
            c(str2, wmmVar2, zBooleanValue, (Function0) objP, fetVar2, (i3 & 14) | ((i4 >> 6) & 112));
            if (zBooleanValue) {
                fetVar2.e0(1070547207);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1070217274);
                mm40 mm40VarN2 = s5x0.N(jm40.b, 16.0f, 0.0f, 8.0f, 12.0f, 2);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                a(mm40VarN2, a4xVar, null, 0, false, 0, 0, ibm0.n(g1t0.n(), fetVar2), fetVar, i3 & 112);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
            function2 = function3;
        } else {
            fetVar2.X();
            function2 = function1;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49(mm40Var, str, a4xVar, wmmVar, l7m0Var, function0, function2, i);
        }
    }

    public static final void c(String str, wmm wmmVar, boolean z, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-159286891);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(wmmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function0) ? 2048 : 1024;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            int i4 = i3 >> 3;
            byte b = 6;
            mm40 mm40VarW = yyw.W((i4 & 896) | 6, 0, fetVar2, o7k0.d(jm40Var, 1.0f), function0, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarW, 12.0f, 4.0f, 4.0f, 4.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2);
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            mm40 mm40VarE0 = o2e.e0(o7k0.n(s5x0.L(jm40Var, 0.0f, 8.0f, 1), 24.0f), "PASSWORD_REQUIREMENTS_ICON");
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new aim(b);
                fetVar2.o0(objP);
            }
            dww.c(pm80VarF, null, pai0.a(mm40VarE0, false, (Function1) objP), secondary, fetVar2, 56, 0);
            mm40 mm40VarE1 = o2e.e0(s5x0.N(jm40Var, 10.0f, 0.0f, 8.0f, 0.0f, 10).e(new x7z(1.0f, true)), "PASSWORD_REQUIREMENTS_TITLE");
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE1, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.n(), fetVar2, i3 & 14, 24960, 110584);
            fetVar2.e0(-268007229);
            acb.n(new yb(), z, function0, null, fetVar2, i4 & 1008, 8);
            fetVar2 = fetVar2;
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1((Object) str, (Object) wmmVar, z, (wdr) function0, i, (byte) 16);
        }
    }
}
