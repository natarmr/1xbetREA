package a;

import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.huawei.hms.framework.common.BundleUtil;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class cvm0 {
    /* JADX WARN: Code duplicated, block: B:100:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x011c A[EDGE_INSN: B:101:0x011c->B:94:0x011c BREAK  A[LOOP:0: B:87:0x0107->B:92:0x0118], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118 A[LOOP:0: B:87:0x0107->B:92:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x015f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0170  */
    public static final void a(final mm40 mm40Var, final kz20 kz20Var, final mbh0 mbh0Var, boolean z, cfq cfqVar, final Function1 function1, final ugd ugdVar, final ugd ugdVar2, ugd ugdVar3, xdr xdrVar, xdr xdrVar2, fet fetVar, final int i, final int i2, final int i3) {
        final mbh0 mbh0Var2;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        xdr xdrVar3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        ugd ugdVar4;
        final cfq cfqVar2;
        final xdr xdrVar4;
        final boolean z4;
        final xdr xdrVar5;
        yfe0 yfe0VarU;
        final boolean z5;
        final cfq cfqVarM0;
        int i13;
        final xdr xdrVar6;
        Iterator it;
        mbh0Var.getClass();
        function1.getClass();
        fetVar.g0(-1210168686);
        int i14 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(kz20Var) ? 32 : 16);
        if ((i & 384) == 0) {
            mbh0Var2 = mbh0Var;
            i14 |= fetVar.g(mbh0Var2) ? 256 : 128;
        } else {
            mbh0Var2 = mbh0Var;
        }
        int i15 = i3 & 8;
        if (i15 != 0) {
            i4 = i14 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i4 = i14 | (fetVar.h(z2) ? 2048 : 1024);
        }
        int i16 = i3 & 16;
        if (i16 == 0) {
            if ((i & 24576) == 0) {
                i4 |= fetVar.g(cfqVar) ? 16384 : 8192;
            }
            if (fetVar.i(function1)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i6 = i4 | i5;
            i7 = i3 & 512;
            if (i7 != 0) {
                if ((805306368 & i) == 0) {
                    xdrVar3 = xdrVar;
                    if (fetVar.i(xdrVar3)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i6 |= i8;
                }
                i9 = i6;
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = 6;
                } else if ((i2 & 6) == 0) {
                    if (fetVar.i(xdrVar2)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i9 & 306783379) == 306783378 || (i11 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i9 & 1, z3)) {
                    if (i15 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i16 != 0) {
                        cfqVarM0 = ro4.m0(0, 0, null, 7);
                    } else {
                        cfqVarM0 = cfqVar;
                    }
                    if (i7 != 0) {
                        xdrVar3 = null;
                    }
                    if (i10 != 0) {
                        xdrVar6 = null;
                        i13 = 0;
                    } else {
                        i13 = 0;
                        xdrVar6 = xdrVar2;
                    }
                    it = kz20Var.b.f29542a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            i13 = -1;
                            break;
                        } else if (((rwm0) it.next()).e) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    final pz40 pz40VarF = androidx.compose.runtime.e.f(Integer.valueOf(i13), fetVar);
                    ugdVar4 = ugdVar3;
                    xdr xdrVar7 = xdrVar3;
                    ydx.g(mm40Var, u1c.M(1943713599, new nhl0(ugdVar4, kz20Var, (byte) 9), fetVar), u1c.M(-1256427264, new xdr() { // from class: a.zum0
                        @Override // a.xdr
                        public final Object F(Object obj, Object obj2, Object obj3) {
                            mm40 mm40Var2 = (mm40) obj;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            mm40Var2.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar2.g(mm40Var2) ? 4 : 2;
                            }
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                xdr xdrVar8 = xdrVar6;
                                pz40 pz40Var = pz40VarF;
                                kz20 kz20Var2 = kz20Var;
                                mbh0 mbh0Var3 = mbh0Var2;
                                Function1 function2 = function1;
                                ugd ugdVar5 = ugdVar;
                                ugd ugdVar6 = ugdVar2;
                                if (xdrVar8 == null) {
                                    fetVar2.e0(415435017);
                                    if (((Number) pz40Var.getValue()).intValue() == -1) {
                                        fetVar2.r(false);
                                        return Unit.f46060a;
                                    }
                                    cvm0.b(mm40Var2, kz20Var2, ((Number) pz40Var.getValue()).intValue(), mbh0Var3, function2, ugdVar5, ugdVar6, fetVar2, iIntValue & 14);
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.e0(415955197);
                                    jwb.e(Boolean.valueOf(z5), mm40Var2, cfqVarM0, null, u1c.M(1661831011, new us4(xdrVar8, pz40Var, kz20Var2, mbh0Var3, function2, ugdVar5, ugdVar6), fetVar2), fetVar2, ((iIntValue << 3) & 112) | 24576, 8);
                                    fetVar2.r(false);
                                }
                            } else {
                                fetVar2.X();
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), xdrVar7, fetVar, (i9 & 14) | 432 | ((i9 >> 18) & 7168));
                    xdrVar5 = xdrVar7;
                    xdrVar4 = xdrVar6;
                    z4 = z5;
                    cfqVar2 = cfqVarM0;
                } else {
                    ugdVar4 = ugdVar3;
                    fetVar.X();
                    cfqVar2 = cfqVar;
                    xdrVar4 = xdrVar2;
                    z4 = z2;
                    xdrVar5 = xdrVar3;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    final ugd ugdVar5 = ugdVar4;
                    yfe0VarU.d = new Function2() { // from class: a.avm0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iL = x8x.L(i | 1);
                            int iL2 = x8x.L(i2);
                            cvm0.a(mm40Var, kz20Var, mbh0Var, z4, cfqVar2, function1, ugdVar, ugdVar2, ugdVar5, xdrVar5, xdrVar4, (fet) obj, iL, iL2, i3);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i6 |= 805306368;
            xdrVar3 = xdrVar;
            i9 = i6;
            i10 = i3 & 1024;
            if (i10 != 0) {
                i11 = 6;
            } else if ((i2 & 6) == 0) {
                if (fetVar.i(xdrVar2)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            if ((i9 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar.U(i9 & 1, z3)) {
                if (i15 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i16 != 0) {
                    cfqVarM0 = ro4.m0(0, 0, null, 7);
                } else {
                    cfqVarM0 = cfqVar;
                }
                if (i7 != 0) {
                    xdrVar3 = null;
                }
                if (i10 != 0) {
                    xdrVar6 = null;
                    i13 = 0;
                } else {
                    i13 = 0;
                    xdrVar6 = xdrVar2;
                }
                it = kz20Var.b.f29542a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        i13 = -1;
                        break;
                    } else {
                        if (((rwm0) it.next()).e) {
                            break;
                            break;
                        }
                        i13++;
                    }
                }
                final pz40 pz40VarF2 = androidx.compose.runtime.e.f(Integer.valueOf(i13), fetVar);
                ugdVar4 = ugdVar3;
                xdr xdrVar8 = xdrVar3;
                ydx.g(mm40Var, u1c.M(1943713599, new nhl0(ugdVar4, kz20Var, (byte) 9), fetVar), u1c.M(-1256427264, new xdr() { // from class: a.zum0
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        mm40 mm40Var2 = (mm40) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        mm40Var2.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(mm40Var2) ? 4 : 2;
                        }
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            xdr xdrVar9 = xdrVar6;
                            pz40 pz40Var = pz40VarF2;
                            kz20 kz20Var2 = kz20Var;
                            mbh0 mbh0Var3 = mbh0Var2;
                            Function1 function2 = function1;
                            ugd ugdVar6 = ugdVar;
                            ugd ugdVar7 = ugdVar2;
                            if (xdrVar9 == null) {
                                fetVar2.e0(415435017);
                                if (((Number) pz40Var.getValue()).intValue() == -1) {
                                    fetVar2.r(false);
                                    return Unit.f46060a;
                                }
                                cvm0.b(mm40Var2, kz20Var2, ((Number) pz40Var.getValue()).intValue(), mbh0Var3, function2, ugdVar6, ugdVar7, fetVar2, iIntValue & 14);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(415955197);
                                jwb.e(Boolean.valueOf(z5), mm40Var2, cfqVarM0, null, u1c.M(1661831011, new us4(xdrVar9, pz40Var, kz20Var2, mbh0Var3, function2, ugdVar6, ugdVar7), fetVar2), fetVar2, ((iIntValue << 3) & 112) | 24576, 8);
                                fetVar2.r(false);
                            }
                        } else {
                            fetVar2.X();
                        }
                        return Unit.f46060a;
                    }
                }, fetVar), xdrVar8, fetVar, (i9 & 14) | 432 | ((i9 >> 18) & 7168));
                xdrVar5 = xdrVar8;
                xdrVar4 = xdrVar6;
                z4 = z5;
                cfqVar2 = cfqVarM0;
            } else {
                ugdVar4 = ugdVar3;
                fetVar.X();
                cfqVar2 = cfqVar;
                xdrVar4 = xdrVar2;
                z4 = z2;
                xdrVar5 = xdrVar3;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                final ugd ugdVar6 = ugdVar4;
                yfe0VarU.d = new Function2() { // from class: a.avm0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iL = x8x.L(i | 1);
                        int iL2 = x8x.L(i2);
                        cvm0.a(mm40Var, kz20Var, mbh0Var, z4, cfqVar2, function1, ugdVar, ugdVar2, ugdVar6, xdrVar5, xdrVar4, (fet) obj, iL, iL2, i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 24576;
        if (fetVar.i(function1)) {
            i5 = 131072;
        } else {
            i5 = 65536;
        }
        i6 = i4 | i5;
        i7 = i3 & 512;
        if (i7 != 0) {
            if ((805306368 & i) == 0) {
                xdrVar3 = xdrVar;
                if (fetVar.i(xdrVar3)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i6 |= i8;
            }
            i9 = i6;
            i10 = i3 & 1024;
            if (i10 != 0) {
                i11 = 6;
            } else if ((i2 & 6) == 0) {
                if (fetVar.i(xdrVar2)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            if ((i9 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar.U(i9 & 1, z3)) {
                if (i15 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i16 != 0) {
                    cfqVarM0 = ro4.m0(0, 0, null, 7);
                } else {
                    cfqVarM0 = cfqVar;
                }
                if (i7 != 0) {
                    xdrVar3 = null;
                }
                if (i10 != 0) {
                    xdrVar6 = null;
                    i13 = 0;
                } else {
                    i13 = 0;
                    xdrVar6 = xdrVar2;
                }
                it = kz20Var.b.f29542a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        i13 = -1;
                        break;
                    } else {
                        if (((rwm0) it.next()).e) {
                            break;
                            break;
                        }
                        i13++;
                    }
                }
                final pz40 pz40VarF3 = androidx.compose.runtime.e.f(Integer.valueOf(i13), fetVar);
                ugdVar4 = ugdVar3;
                xdr xdrVar9 = xdrVar3;
                ydx.g(mm40Var, u1c.M(1943713599, new nhl0(ugdVar4, kz20Var, (byte) 9), fetVar), u1c.M(-1256427264, new xdr() { // from class: a.zum0
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        mm40 mm40Var2 = (mm40) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        mm40Var2.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(mm40Var2) ? 4 : 2;
                        }
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            xdr xdrVar10 = xdrVar6;
                            pz40 pz40Var = pz40VarF3;
                            kz20 kz20Var2 = kz20Var;
                            mbh0 mbh0Var3 = mbh0Var2;
                            Function1 function2 = function1;
                            ugd ugdVar7 = ugdVar;
                            ugd ugdVar8 = ugdVar2;
                            if (xdrVar10 == null) {
                                fetVar2.e0(415435017);
                                if (((Number) pz40Var.getValue()).intValue() == -1) {
                                    fetVar2.r(false);
                                    return Unit.f46060a;
                                }
                                cvm0.b(mm40Var2, kz20Var2, ((Number) pz40Var.getValue()).intValue(), mbh0Var3, function2, ugdVar7, ugdVar8, fetVar2, iIntValue & 14);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(415955197);
                                jwb.e(Boolean.valueOf(z5), mm40Var2, cfqVarM0, null, u1c.M(1661831011, new us4(xdrVar10, pz40Var, kz20Var2, mbh0Var3, function2, ugdVar7, ugdVar8), fetVar2), fetVar2, ((iIntValue << 3) & 112) | 24576, 8);
                                fetVar2.r(false);
                            }
                        } else {
                            fetVar2.X();
                        }
                        return Unit.f46060a;
                    }
                }, fetVar), xdrVar9, fetVar, (i9 & 14) | 432 | ((i9 >> 18) & 7168));
                xdrVar5 = xdrVar9;
                xdrVar4 = xdrVar6;
                z4 = z5;
                cfqVar2 = cfqVarM0;
            } else {
                ugdVar4 = ugdVar3;
                fetVar.X();
                cfqVar2 = cfqVar;
                xdrVar4 = xdrVar2;
                z4 = z2;
                xdrVar5 = xdrVar3;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                final ugd ugdVar7 = ugdVar4;
                yfe0VarU.d = new Function2() { // from class: a.avm0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iL = x8x.L(i | 1);
                        int iL2 = x8x.L(i2);
                        cvm0.a(mm40Var, kz20Var, mbh0Var, z4, cfqVar2, function1, ugdVar, ugdVar2, ugdVar7, xdrVar5, xdrVar4, (fet) obj, iL, iL2, i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i6 |= 805306368;
        xdrVar3 = xdrVar;
        i9 = i6;
        i10 = i3 & 1024;
        if (i10 != 0) {
            i11 = 6;
        } else if ((i2 & 6) == 0) {
            if (fetVar.i(xdrVar2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i2 | i12;
        } else {
            i11 = i2;
        }
        if ((i9 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (fetVar.U(i9 & 1, z3)) {
            if (i15 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if (i16 != 0) {
                cfqVarM0 = ro4.m0(0, 0, null, 7);
            } else {
                cfqVarM0 = cfqVar;
            }
            if (i7 != 0) {
                xdrVar3 = null;
            }
            if (i10 != 0) {
                xdrVar6 = null;
                i13 = 0;
            } else {
                i13 = 0;
                xdrVar6 = xdrVar2;
            }
            it = kz20Var.b.f29542a.iterator();
            while (true) {
                if (it.hasNext()) {
                    i13 = -1;
                    break;
                } else {
                    if (((rwm0) it.next()).e) {
                        break;
                        break;
                    }
                    i13++;
                }
            }
            final pz40 pz40VarF4 = androidx.compose.runtime.e.f(Integer.valueOf(i13), fetVar);
            ugdVar4 = ugdVar3;
            xdr xdrVar10 = xdrVar3;
            ydx.g(mm40Var, u1c.M(1943713599, new nhl0(ugdVar4, kz20Var, (byte) 9), fetVar), u1c.M(-1256427264, new xdr() { // from class: a.zum0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    mm40 mm40Var2 = (mm40) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    mm40Var2.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar2.g(mm40Var2) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        xdr xdrVar11 = xdrVar6;
                        pz40 pz40Var = pz40VarF4;
                        kz20 kz20Var2 = kz20Var;
                        mbh0 mbh0Var3 = mbh0Var2;
                        Function1 function2 = function1;
                        ugd ugdVar8 = ugdVar;
                        ugd ugdVar9 = ugdVar2;
                        if (xdrVar11 == null) {
                            fetVar2.e0(415435017);
                            if (((Number) pz40Var.getValue()).intValue() == -1) {
                                fetVar2.r(false);
                                return Unit.f46060a;
                            }
                            cvm0.b(mm40Var2, kz20Var2, ((Number) pz40Var.getValue()).intValue(), mbh0Var3, function2, ugdVar8, ugdVar9, fetVar2, iIntValue & 14);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(415955197);
                            jwb.e(Boolean.valueOf(z5), mm40Var2, cfqVarM0, null, u1c.M(1661831011, new us4(xdrVar11, pz40Var, kz20Var2, mbh0Var3, function2, ugdVar8, ugdVar9), fetVar2), fetVar2, ((iIntValue << 3) & 112) | 24576, 8);
                            fetVar2.r(false);
                        }
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), xdrVar10, fetVar, (i9 & 14) | 432 | ((i9 >> 18) & 7168));
            xdrVar5 = xdrVar10;
            xdrVar4 = xdrVar6;
            z4 = z5;
            cfqVar2 = cfqVarM0;
        } else {
            ugdVar4 = ugdVar3;
            fetVar.X();
            cfqVar2 = cfqVar;
            xdrVar4 = xdrVar2;
            z4 = z2;
            xdrVar5 = xdrVar3;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final ugd ugdVar8 = ugdVar4;
            yfe0VarU.d = new Function2() { // from class: a.avm0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i | 1);
                    int iL2 = x8x.L(i2);
                    cvm0.a(mm40Var, kz20Var, mbh0Var, z4, cfqVar2, function1, ugdVar, ugdVar2, ugdVar8, xdrVar5, xdrVar4, (fet) obj, iL, iL2, i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(mm40 mm40Var, kz20 kz20Var, int i, mbh0 mbh0Var, Function1 function1, ugd ugdVar, ugd ugdVar2, fet fetVar, int i2) {
        int i3;
        fetVar.g0(2100741772);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(kz20Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(mbh0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(ugdVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 1048576 : 524288;
        }
        byte b = 1;
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            int i4 = (i3 & 14) | 1769472;
            int i5 = i3 >> 3;
            xww.n(mm40Var, i, mbh0Var, null, false, u1c.M(-1041474293, new f4b(ugdVar, (byte) 3), fetVar), u1c.M(-1182386294, new g4b(kz20Var, ugdVar2, function1, b), fetVar), fetVar, i4 | (i5 & 112) | (i5 & 896));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l9v(mm40Var, kz20Var, i, mbh0Var, function1, ugdVar, ugdVar2, i2);
        }
    }

    public static final void c(mm40 mm40Var, ivk0 ivk0Var, ebo0 ebo0Var, Function1 function1, fet fetVar, int i) {
        ugd ugdVarM;
        ivk0Var.getClass();
        function1.getClass();
        fetVar.g0(-352401152);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ivk0Var) ? 32 : 16) | (fetVar.g(ebo0Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            rah0 rah0VarT = wha0.T(fetVar);
            t3r0 t3r0Var = ivk0Var.d;
            ugd ugdVarM2 = null;
            if (t3r0Var == null) {
                fetVar.e0(-1482250015);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(-1482250014);
                ugdVarM = u1c.M(1512564439, new tao0(t3r0Var, rah0VarT, function1, b), fetVar);
                fetVar.r(false);
            }
            cpm cpmVar = ivk0Var.c;
            if (cpmVar == null) {
                fetVar.e0(-1481592040);
                fetVar.r(false);
            } else {
                fetVar.e0(-1481592039);
                ugdVarM2 = u1c.M(1107096357, new uao0(rah0VarT, cpmVar, function1, b), fetVar);
                fetVar.r(false);
            }
            ugd ugdVarM3 = u1c.M(-891150270, new vao0(ivk0Var, ebo0Var, function1, b), fetVar);
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
            y5d y5dVar = y5d.f42040a;
            if (ugdVarM == null) {
                fetVar.e0(1885945600);
            } else {
                fetVar.e0(-1878825695);
                ugdVarM.F(y5dVar, fetVar, 6);
            }
            fetVar.r(false);
            if (ugdVarM2 == null) {
                fetVar.e0(1885983296);
            } else {
                fetVar.e0(-1878824479);
                ugdVarM2.F(y5dVar, fetVar, 6);
            }
            fetVar.r(false);
            vqd.t(54, ugdVarM3, y5dVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wao0(mm40Var, ivk0Var, ebo0Var, function1, i, (byte) 0);
        }
    }

    public static final void d(String str, fet fetVar, int i) {
        fetVar.g0(1420719411);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(o7k0.e(lgb.J(mm40VarD, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), 44.0f), StaticColors.INSTANCE.m126getWhite200d7_KjU(), jd8.n), "TeamLastMatchesHeaderTestTag");
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            k7x.b(str, null, o2e.e0(o7k0.n(jm40Var, 36.0f), "TeamIconHeaderTestTag"), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar), null, null, null, null, null, null, null, fetVar, (i2 & 14) | 36912, 0, 32736);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f5n0((byte) 5, i, str);
        }
    }

    public static final void e(boolean z, xsf0 xsf0Var, k7q0 k7q0Var, fet fetVar, int i) {
        int i2;
        b9q0 b9q0VarD;
        fetVar.g0(-1344558920);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.e(xsf0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(k7q0Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean zG = (i3 == 4) | fetVar.g(k7q0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new h7q0(k7q0Var, z);
                fetVar.o0(objP);
            }
            p5q0 p5q0Var = (p5q0) objP;
            boolean zI = (i3 == 4) | fetVar.i(k7q0Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new l7q0(k7q0Var, z);
                fetVar.o0(objP2);
            }
            ye60 ye60Var = (ye60) objP2;
            boolean zG2 = o9q0.g(k7q0Var.l().b);
            int i4 = (int) (z ? k7q0Var.l().b >> 32 : k7q0Var.l().b & 4294967295L);
            djz djzVar = k7q0Var.d;
            float fG = 0.0f;
            if (djzVar != null && (b9q0VarD = djzVar.d()) != null) {
                a9q0 a9q0Var = b9q0VarD.f2224a;
                if (i4 >= 0) {
                    z8q0 z8q0Var = a9q0Var.f491a;
                    bw40 bw40Var = a9q0Var.b;
                    if (z8q0Var.f43981a.b.length() != 0) {
                        int iMin = Math.min(bw40Var.d(i4), Math.min(bw40Var.b - 1, bw40Var.f - 1));
                        if (i4 <= bw40Var.c(iMin, false)) {
                            bw40Var.l(iMin);
                            ArrayList arrayList = bw40Var.h;
                            yn80 yn80Var = (yn80) arrayList.get(b8k0.C(iMin, arrayList));
                            fG = yn80Var.f42927a.d.g(iMin - yn80Var.d);
                        }
                    }
                }
            }
            float f = fG;
            boolean zI2 = fetVar.i(p5q0Var);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new zy2(p5q0Var, (byte) 10);
                fetVar.o0(objP3);
            }
            eeq.E(ye60Var, z, xsf0Var, zG2, 0L, f, fnn0.a(jm40.b, p5q0Var, (PointerInputEventHandler) objP3), fetVar, (i2 << 3) & 1008);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx(z, (Object) xsf0Var, (Object) k7q0Var, i, (byte) 12);
        }
    }

    public static final void f(final ywv0 ywv0Var, lsv0 lsv0Var, final long j, Function0 function0, fet fetVar, int i) {
        int i2;
        boolean z;
        ywv0Var.getClass();
        function0.getClass();
        fetVar.g0(467827810);
        int i3 = i & 6;
        jr8 jr8Var = jr8.f16991a;
        if (i3 == 0) {
            i2 = (fetVar.g(jr8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ywv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(lsv0Var) : fetVar.i(lsv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function0) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            final float fW0 = w6kVar.w0(120.0f);
            final boolean z2 = lsv0Var instanceof isv0;
            final boolean zBooleanValue = ((Boolean) fetVar.k(luv0.f20695a)).booleanValue();
            fetVar.e0(-1389024687);
            mm40 mm40VarA = jr8Var.a(jm40.b);
            boolean zF = ywv0Var.d.f();
            Object obj = ukd.f35823a;
            if (zF && z2) {
                fetVar.e0(197056262);
                boolean z3 = ((458752 & i2) == 131072) | ((i2 & 896) == 256 || ((i2 & 512) != 0 && fetVar.i(lsv0Var))) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
                Object objP = fetVar.P();
                if (z3 || objP == obj) {
                    objP = new twv0(lsv0Var, ywv0Var, function0);
                    fetVar.o0(objP);
                }
                mm40VarA = fnn0.b(mm40VarA, lsv0Var, ywv0Var, (PointerInputEventHandler) objP);
                z = false;
                fetVar.r(false);
            } else {
                z = false;
            }
            fetVar.r(z);
            boolean zH = fetVar.h(z2) | fetVar.h(zBooleanValue) | ((i2 & 112) == 32) | fetVar.d(fW0) | ((i2 & 57344) == 16384);
            Object objP2 = fetVar.P();
            if (zH || objP2 == obj) {
                Object obj2 = new Function1() { // from class: a.swv0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        fhl fhlVar = (fhl) obj3;
                        fhlVar.getClass();
                        if (z2 && !zBooleanValue) {
                            float fC = l1e0.c(((Number) ((t33) ywv0Var.d.c).d()).floatValue() / fW0, 0.0f, 1.0f);
                            if (fC > 0.0f) {
                                fhl.u(fhlVar, j, 0L, 0L, fC, null, null, 0, 118);
                            }
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(obj2);
                objP2 = obj2;
            }
            zq8.a(0, fetVar, rq8.K(mm40VarA, (Function1) objP2));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg(ywv0Var, lsv0Var, j, function0, i);
        }
    }

    public static i7 g(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new i7(ga3.g(view));
        }
        return null;
    }

    public static final ArrayList h(String str, List list, List list2) {
        Object next;
        k0d k0dVar;
        List list3 = list;
        ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
        Iterator it = list3.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next2 = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            f280 f280Var = (f280) next2;
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((nms) next).f23786a != f280Var.d.i);
            nms nmsVar = (nms) next;
            Integer numValueOf = nmsVar != null ? Integer.valueOf(nmsVar.f23786a) : null;
            v12 v12VarI0 = unh0.i0(i, list3);
            f280Var.getClass();
            String strM = dw9.m(f280Var.f8801a, BundleUtil.UNDERLINE_TAG, str);
            int i3 = f280Var.f8801a;
            u6n u6nVar = new u6n(d4d.SECONDARY60, w6n.g, new c280(ohs0.n(ujn.h, f280Var.c), R.drawable.ic_glyph_placeholder_team));
            seo seoVar = f280Var.d;
            String str2 = seoVar.m;
            Iterator it3 = it;
            double d = seoVar.e;
            Double d2 = seoVar.f;
            String str3 = seoVar.g;
            if (seoVar.h) {
                k0dVar = k0d.b;
            } else if (d2 == null) {
                k0dVar = k0d.f17460a;
            } else if (d > d2.doubleValue()) {
                k0dVar = k0d.c;
            } else {
                k0dVar = d < d2.doubleValue() ? k0d.d : k0d.f17460a;
            }
            arrayList.add(new icv0(strM, i3, numValueOf, u6nVar, new chl0(str2, str3, k0dVar, a65.f301a, seoVar.j, seoVar.k, false, false, new xgl0(-1L, 0.0d, 0.0d, "", 0, 0L, 0, 0L, false)), v12VarI0));
            list3 = list;
            it = it3;
            i = i2;
        }
        return arrayList;
    }

    public static final or1 i(int i) {
        String str;
        if (i == 1) {
            str = "Number_Gold.webp";
        } else if (i != 2) {
            str = i != 3 ? "Number_Other.webp" : "Number_Bronze.webp";
        } else {
            str = "Number_Silver.webp";
        }
        List list = u0d.f34849a;
        return new or1(new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/icon_s_icon_l_number/".concat(str))));
    }

    public static final String j(z1s0 z1s0Var, pxb0 pxb0Var, String str, ctf0 ctf0Var) {
        String strA = ctf0Var.b.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
        int i = pxb0Var.i;
        String strI = i > 0 ? f140.i(i, strA) : "";
        if (z1s0Var != z1s0.f43637a) {
            return kng0.l(pxb0Var.d, Separators.SP, strI);
        }
        pn40 pn40Var = pn40.f27267a;
        double d = pxb0Var.f;
        p3u0 p3u0Var = p3u0.c;
        String strL = pn40.l(d);
        return strI.length() > 0 ? axq.n(b1j.n("\u202a", str, Separators.SP, strL, " · "), strI, "\u202c") : axq.n(b1j.n("\u202a", str, Separators.SP, strL, Separators.SP), strI, "\u202c");
    }

    public static final boolean k(k7q0 k7q0Var, boolean z) {
        j6z j6zVarC;
        djz djzVar = k7q0Var.d;
        if (djzVar == null || (j6zVarC = djzVar.c()) == null) {
            return false;
        }
        jge0 jge0VarZ = k7x.z(j6zVarC, true);
        jge0 jge0VarP = k9x.p(j6zVarC.m(jge0VarZ.g()), j6zVarC.m(jge0VarZ.d()));
        long j = k7q0Var.j(z);
        float f = jge0VarP.f16474a;
        float f2 = jge0VarP.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = jge0VarP.b;
        float f4 = jge0VarP.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static void l(androidx.fragment.app.e eVar) {
        eVar.getClass();
        if (eVar.J("TotoBetTypeBottomSheetTag") != null) {
            return;
        }
        new amr0().H0(eVar, "TotoBetTypeBottomSheetTag");
    }

    public static final Pair m(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    public static final hxo0 n(kwo0 kwo0Var, String str, boolean z) {
        wwo0 wwo0Var;
        axo0 ywo0Var;
        tn7 sn7Var;
        str.getClass();
        boolean z2 = kwo0Var.f19012a;
        double d = kwo0Var.d;
        String str2 = kwo0Var.c;
        boolean z3 = kwo0Var.b;
        if (!z3 && !z) {
            if (d == 0.0d) {
                wwo0Var = null;
            } else {
                int i = cy7.f5159a;
                pn40 pn40Var = pn40.f27267a;
                ywo0Var = new ywo0(cy7.e(pn40.p(str, d)), d > 0.0d ? d4d.COMMERCE : d4d.TEXT_PRIMARY);
            }
            String str3 = kwo0Var.e;
            if (!z3 || z) {
                sn7Var = rn7.f30774a;
            } else {
                List<mvo0> list = kwo0Var.f;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (mvo0 mvo0Var : list) {
                    arrayList.add(new fuy(mvo0Var.f22468a, mvo0Var.b));
                }
                sn7Var = new sn7(dyb.r0(arrayList));
            }
            return new hxo0(z2, str2, ywo0Var, str3, sn7Var);
        }
        wwo0Var = wwo0.f39894a;
        ywo0Var = wwo0Var;
        String str4 = kwo0Var.e;
        if (z3) {
            sn7Var = rn7.f30774a;
        } else {
            sn7Var = rn7.f30774a;
        }
        return new hxo0(z2, str2, ywo0Var, str4, sn7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    public static final kqq0 o(oqq0 oqq0Var) {
        List list;
        ?? arrayList;
        ?? arrayList2;
        List<ehb> list2 = oqq0Var.f25701a;
        if (list2 != null) {
            int i = 10;
            ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
            for (ehb ehbVar : list2) {
                ehbVar.getClass();
                Integer num = ehbVar.f7799a;
                int iIntValue = num != null ? num.intValue() : 0;
                String str = ehbVar.b;
                if (str == null) {
                    str = "";
                }
                String str2 = ehbVar.c;
                if (str2 == null) {
                    str2 = "";
                }
                List<xpq0> list3 = ehbVar.d;
                if (list3 != null) {
                    arrayList = new ArrayList(r3d.q(list3, i));
                    for (xpq0 xpq0Var : list3) {
                        xpq0Var.getClass();
                        Integer num2 = xpq0Var.f41281a;
                        int iIntValue2 = num2 != null ? num2.intValue() : 0;
                        Integer num3 = xpq0Var.i;
                        int iIntValue3 = num3 != null ? num3.intValue() : 0;
                        Long l = xpq0Var.d;
                        long jLongValue = l != null ? l.longValue() : 0L;
                        String str3 = xpq0Var.c;
                        String str4 = str3 == null ? "" : str3;
                        Long l2 = xpq0Var.b;
                        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                        String str5 = xpq0Var.e;
                        String str6 = str5 == null ? "" : str5;
                        String str7 = xpq0Var.f;
                        String str8 = str7 == null ? "" : str7;
                        String str9 = xpq0Var.g;
                        String str10 = str9 == null ? "" : str9;
                        String str11 = xpq0Var.h;
                        String str12 = str11 == null ? "" : str11;
                        Integer num4 = xpq0Var.j;
                        int iIntValue4 = num4 != null ? num4.intValue() : 0;
                        Double d = xpq0Var.k;
                        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
                        List<nh7> list4 = xpq0Var.l;
                        if (list4 != null) {
                            arrayList2 = new ArrayList(r3d.q(list4, i));
                            for (nh7 nh7Var : list4) {
                                nh7Var.getClass();
                                Integer num5 = nh7Var.f23520a;
                                int iIntValue5 = num5 != null ? num5.intValue() : 0;
                                Double d2 = nh7Var.c;
                                double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
                                Double d3 = nh7Var.b;
                                arrayList2.add(new kh7(dDoubleValue2, d3 != null ? d3.doubleValue() : 0.0d, iIntValue5));
                            }
                        } else {
                            arrayList2 = 0;
                        }
                        if (arrayList2 == 0) {
                            arrayList2 = iun.f15405a;
                        }
                        arrayList.add(new upq0(iIntValue2, iIntValue3, jLongValue, str4, jLongValue2, str6, str8, str10, str12, iIntValue4, dDoubleValue, arrayList2));
                        i = 10;
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                arrayList3.add(new bhb(iIntValue, str, str2, arrayList));
                i = 10;
            }
            list = arrayList3;
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        return new kqq0(list);
    }

    public static final g090 p(lne lneVar, lne lneVar2) {
        lneVar.getClass();
        lneVar2.getClass();
        lneVar.getClass();
        lneVar2.getClass();
        g090 g090Var = new g090();
        g090Var.f10448a = lneVar;
        g090Var.b = lneVar2;
        return g090Var;
    }

    public static void q() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        jf4.n("Must be called from the main thread.");
    }

    public static int r(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (rtw0.f31097a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }
}
