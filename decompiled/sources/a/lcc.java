package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lcc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uts0 f19792a = ro4.m0(280, 0, hhn.f13072a, 2);

    public static final void a(final xcz xczVar, final vne vneVar, a4x a4xVar, final hh80 hh80Var, tyl tylVar, fet fetVar, final int i) {
        int i2;
        yfe0 yfe0VarU;
        Function2 function2;
        final a4x a4xVar2 = a4xVar;
        final tyl tylVar2 = tylVar;
        fetVar.g0(582770315);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(xczVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(vneVar) : fetVar.i(vneVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(a4xVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(hh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.e(tylVar2.ordinal()) ? 16384 : 8192;
        }
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (tylVar2 == tyl.f34760a) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                function2 = new Function2() { // from class: a.fcc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b2 = b;
                        int i3 = i;
                        switch (b2) {
                            case 0:
                                ((Integer) obj2).getClass();
                                lcc.a(xczVar, vneVar, a4xVar2, hh80Var, tylVar2, (fet) obj, x8x.L(i3 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                lcc.a(xczVar, vneVar, a4xVar2, hh80Var, tylVar2, (fet) obj, x8x.L(i3 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (objP == obj) {
                    objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                    fetVar.o0(objP);
                }
                pz40 pz40Var = (pz40) objP;
                int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32);
                w6k w6kVar = (w6k) fetVar.k(bmd.h);
                k6z k6zVar = (k6z) fetVar.k(bmd.n);
                boolean zE = ((i2 & 14) == 4) | ((i2 & 896) == 256) | fetVar.e(iB) | fetVar.g(w6kVar) | fetVar.e(k6zVar.ordinal()) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
                if ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(vneVar))) {
                    z = true;
                }
                boolean z2 = zE | z;
                Object objP2 = fetVar.P();
                if (z2 || objP2 == obj) {
                    Object gccVar = new gcc(a4xVar, xczVar, iB, w6kVar, k6zVar, hh80Var, tylVar, vneVar, pz40Var, null);
                    a4xVar2 = a4xVar;
                    tylVar2 = tylVar;
                    fetVar.o0(gccVar);
                    objP2 = gccVar;
                } else {
                    a4xVar2 = a4xVar;
                    tylVar2 = tylVar;
                }
                m0x0.v(a4xVar2, tylVar2, (Function2) objP2, fetVar);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            function2 = new Function2() { // from class: a.fcc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    byte b3 = b2;
                    int i3 = i;
                    switch (b3) {
                        case 0:
                            ((Integer) obj3).getClass();
                            lcc.a(xczVar, vneVar, a4xVar2, hh80Var, tylVar2, (fet) obj2, x8x.L(i3 | 1));
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            lcc.a(xczVar, vneVar, a4xVar2, hh80Var, tylVar2, (fet) obj2, x8x.L(i3 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:105:0x0171  */
    /* JADX WARN: Code duplicated, block: B:107:0x01af  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0108  */
    /* JADX WARN: Code duplicated, block: B:89:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0116  */
    /* JADX WARN: Code duplicated, block: B:94:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    public static final void b(mm40 mm40Var, a4x a4xVar, vxl vxlVar, tyl tylVar, syl sylVar, jyl jylVar, hh80 hh80Var, boolean z, Function1 function1, Function1 function2, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        a4x a4xVar2;
        boolean z2;
        Function1 function3;
        int i4;
        Function1 function4;
        int i5;
        boolean z3;
        boolean z4;
        Function1 function5;
        yfe0 yfe0VarU;
        mm40 mm40Var3;
        boolean z5;
        Function1 function6;
        Object objP;
        int i6;
        fet fetVar2 = fetVar;
        a4xVar.getClass();
        vxlVar.getClass();
        tylVar.getClass();
        sylVar.getClass();
        function1.getClass();
        fetVar2.g0(840417256);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            a4xVar2 = a4xVar;
            i3 |= fetVar2.g(a4xVar2) ? 32 : 16;
        } else {
            a4xVar2 = a4xVar;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.e(vxlVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar2.e(tylVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar2.e(sylVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar2.g(jylVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= fetVar2.g(hh80Var) ? 1048576 : 524288;
        }
        int i8 = i2 & 128;
        if (i8 == 0) {
            if ((12582912 & i) == 0) {
                z2 = z;
                i3 |= fetVar2.h(z2) ? 8388608 : 4194304;
            }
            if ((100663296 & i) == 0) {
                function3 = function1;
                if (fetVar2.i(function3)) {
                    i6 = 67108864;
                } else {
                    i6 = 33554432;
                }
                i3 |= i6;
            } else {
                function3 = function1;
            }
            i4 = i2 & 512;
            if (i4 != 0) {
                if ((805306368 & i) == 0) {
                    function4 = function2;
                    if (fetVar2.i(function4)) {
                        i5 = 536870912;
                    } else {
                        i5 = 268435456;
                    }
                    i3 |= i5;
                }
                if ((306783379 & i3) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar2.U(i3 & 1, z3)) {
                    if (i7 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        objP = fetVar2.P();
                        if (objP == ukd.f35823a) {
                            objP = new e6c((byte) 8);
                            fetVar2.o0(objP);
                        }
                        function4 = (Function1) objP;
                    }
                    if (sylVar == syl.f33027a) {
                        fetVar2.e0(1506545035);
                        Function1 function7 = function4;
                        d(mm40Var3, a4xVar2, vxlVar, tylVar, sylVar, hh80Var, jylVar, z2, function3, function7, fetVar2, (65534 & i3) | ((i3 >> 3) & 458752) | (3670016 & (i3 << 3)) | (29360128 & i3) | (i3 & 234881024) | (i3 & 1879048192));
                        z5 = z2;
                        function6 = function7;
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    } else {
                        z5 = z2;
                        function6 = function4;
                        fetVar2.e0(1506977144);
                        int i9 = i3 >> 6;
                        int i10 = (i3 & 126) | (i9 & 896) | (i9 & 7168) | (57344 & (i3 << 6));
                        int i11 = i3 >> 3;
                        e(mm40Var3, a4xVar, sylVar, jylVar, vxlVar, hh80Var, z5, function1, function6, fetVar2, i10 | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024));
                        fetVar2.r(false);
                    }
                    mm40Var2 = mm40Var3;
                    function5 = function6;
                    z4 = z5;
                } else {
                    fetVar2.X();
                    z4 = z2;
                    function5 = function4;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new zbc(mm40Var2, a4xVar, vxlVar, tylVar, sylVar, jylVar, hh80Var, z4, function1, function5, i, i2);
                }
            }
            i3 |= 805306368;
            function4 = function2;
            if ((306783379 & i3) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar2.U(i3 & 1, z3)) {
                if (i7 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var2;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    objP = fetVar2.P();
                    if (objP == ukd.f35823a) {
                        objP = new e6c((byte) 8);
                        fetVar2.o0(objP);
                    }
                    function4 = (Function1) objP;
                }
                if (sylVar == syl.f33027a) {
                    fetVar2.e0(1506545035);
                    Function1 function8 = function4;
                    d(mm40Var3, a4xVar2, vxlVar, tylVar, sylVar, hh80Var, jylVar, z2, function3, function8, fetVar2, (65534 & i3) | ((i3 >> 3) & 458752) | (3670016 & (i3 << 3)) | (29360128 & i3) | (i3 & 234881024) | (i3 & 1879048192));
                    z5 = z2;
                    function6 = function8;
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else {
                    z5 = z2;
                    function6 = function4;
                    fetVar2.e0(1506977144);
                    int i12 = i3 >> 6;
                    int i13 = (i3 & 126) | (i12 & 896) | (i12 & 7168) | (57344 & (i3 << 6));
                    int i14 = i3 >> 3;
                    e(mm40Var3, a4xVar, sylVar, jylVar, vxlVar, hh80Var, z5, function1, function6, fetVar2, i13 | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | (i14 & 234881024));
                    fetVar2.r(false);
                }
                mm40Var2 = mm40Var3;
                function5 = function6;
                z4 = z5;
            } else {
                fetVar2.X();
                z4 = z2;
                function5 = function4;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new zbc(mm40Var2, a4xVar, vxlVar, tylVar, sylVar, jylVar, hh80Var, z4, function1, function5, i, i2);
            }
        }
        i3 |= 12582912;
        z2 = z;
        if ((100663296 & i) == 0) {
            function3 = function1;
            if (fetVar2.i(function3)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i3 |= i6;
        } else {
            function3 = function1;
        }
        i4 = i2 & 512;
        if (i4 != 0) {
            if ((805306368 & i) == 0) {
                function4 = function2;
                if (fetVar2.i(function4)) {
                    i5 = 536870912;
                } else {
                    i5 = 268435456;
                }
                i3 |= i5;
            }
            if ((306783379 & i3) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar2.U(i3 & 1, z3)) {
                if (i7 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var2;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    objP = fetVar2.P();
                    if (objP == ukd.f35823a) {
                        objP = new e6c((byte) 8);
                        fetVar2.o0(objP);
                    }
                    function4 = (Function1) objP;
                }
                if (sylVar == syl.f33027a) {
                    fetVar2.e0(1506545035);
                    Function1 function9 = function4;
                    d(mm40Var3, a4xVar2, vxlVar, tylVar, sylVar, hh80Var, jylVar, z2, function3, function9, fetVar2, (65534 & i3) | ((i3 >> 3) & 458752) | (3670016 & (i3 << 3)) | (29360128 & i3) | (i3 & 234881024) | (i3 & 1879048192));
                    z5 = z2;
                    function6 = function9;
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else {
                    z5 = z2;
                    function6 = function4;
                    fetVar2.e0(1506977144);
                    int i15 = i3 >> 6;
                    int i16 = (i3 & 126) | (i15 & 896) | (i15 & 7168) | (57344 & (i3 << 6));
                    int i17 = i3 >> 3;
                    e(mm40Var3, a4xVar, sylVar, jylVar, vxlVar, hh80Var, z5, function1, function6, fetVar2, i16 | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024));
                    fetVar2.r(false);
                }
                mm40Var2 = mm40Var3;
                function5 = function6;
                z4 = z5;
            } else {
                fetVar2.X();
                z4 = z2;
                function5 = function4;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new zbc(mm40Var2, a4xVar, vxlVar, tylVar, sylVar, jylVar, hh80Var, z4, function1, function5, i, i2);
            }
        }
        i3 |= 805306368;
        function4 = function2;
        if ((306783379 & i3) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar2.U(i3 & 1, z3)) {
            if (i7 != 0) {
                mm40Var3 = jm40.b;
            } else {
                mm40Var3 = mm40Var2;
            }
            if (i8 != 0) {
                z2 = true;
            }
            if (i4 != 0) {
                objP = fetVar2.P();
                if (objP == ukd.f35823a) {
                    objP = new e6c((byte) 8);
                    fetVar2.o0(objP);
                }
                function4 = (Function1) objP;
            }
            if (sylVar == syl.f33027a) {
                fetVar2.e0(1506545035);
                Function1 function10 = function4;
                d(mm40Var3, a4xVar2, vxlVar, tylVar, sylVar, hh80Var, jylVar, z2, function3, function10, fetVar2, (65534 & i3) | ((i3 >> 3) & 458752) | (3670016 & (i3 << 3)) | (29360128 & i3) | (i3 & 234881024) | (i3 & 1879048192));
                z5 = z2;
                function6 = function10;
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                z5 = z2;
                function6 = function4;
                fetVar2.e0(1506977144);
                int i18 = i3 >> 6;
                int i19 = (i3 & 126) | (i18 & 896) | (i18 & 7168) | (57344 & (i3 << 6));
                int i110 = i3 >> 3;
                e(mm40Var3, a4xVar, sylVar, jylVar, vxlVar, hh80Var, z5, function1, function6, fetVar2, i19 | (i110 & 458752) | (i110 & 3670016) | (i110 & 29360128) | (i110 & 234881024));
                fetVar2.r(false);
            }
            mm40Var2 = mm40Var3;
            function5 = function6;
            z4 = z5;
        } else {
            fetVar2.X();
            z4 = z2;
            function5 = function4;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zbc(mm40Var2, a4xVar, vxlVar, tylVar, sylVar, jylVar, hh80Var, z4, function1, function5, i, i2);
        }
    }

    public static final void c(vxl vxlVar, lxl lxlVar, syl sylVar, jyl jylVar, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-280858265);
        int i2 = i | (fetVar2.e(vxlVar.ordinal()) ? 4 : 2) | (fetVar2.g(lxlVar) ? 32 : 16) | (fetVar2.e(sylVar.ordinal()) ? 256 : 128) | (fetVar2.g(jylVar) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192) | (fetVar2.i(function1) ? 131072 : 65536) | (fetVar2.i(function2) ? 1048576 : 524288);
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            int iOrdinal = vxlVar.ordinal();
            if (iOrdinal == 0) {
                fetVar2.e0(678156054);
                int i3 = (i2 >> 3) & 1022;
                int i4 = i2 >> 6;
                pnm.a(lxlVar, sylVar, jylVar, function1, function2, fetVar2, i3 | (i4 & 7168) | (i4 & 57344));
                fetVar2.r(false);
            } else if (iOrdinal == 1) {
                fetVar2.e0(678163768);
                int i5 = (i2 >> 3) & 1022;
                int i6 = i2 >> 6;
                zpm.a(lxlVar, sylVar, jylVar, function1, function2, fetVar2, i5 | (i6 & 7168) | (i6 & 57344));
                fetVar2.r(false);
            } else if (iOrdinal == 2) {
                fetVar2.e0(678171511);
                int i7 = (i2 >> 3) & 1022;
                int i8 = i2 >> 6;
                z6n.a(lxlVar, sylVar, jylVar, function1, function2, fetVar2, i7 | (i8 & 7168) | (i8 & 57344));
                fetVar2.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(678155390, fetVar2, false);
                }
                fetVar2.e0(678179223);
                rmm.a(lxlVar, sylVar, jylVar, z, function1, function2, fetVar2, (i2 >> 3) & 524286);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(vxlVar, lxlVar, sylVar, jylVar, z, function1, function2, i);
        }
    }

    public static final void d(mm40 mm40Var, a4x a4xVar, vxl vxlVar, tyl tylVar, syl sylVar, hh80 hh80Var, jyl jylVar, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        fetVar.g0(1968257596);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(vxlVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(tylVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.e(sylVar.ordinal()) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= fetVar.g(hh80Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(jylVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.h(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= fetVar.i(function2) ? 536870912 : 268435456;
        }
        if (fetVar.U(i2 & 1, (i2 & 306783379) != 306783378)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            int i3 = i2 << 3;
            int i4 = i2;
            a(xczVarA, (vne) objP, a4xVar, hh80Var, tylVar, fetVar, (i3 & 896) | ((i2 >> 6) & 7168) | (i3 & 57344));
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40Var, 48.0f), "HORIZONTAL_LAZY_ROW");
            yx7 yx7Var = gqw0.k;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z2 = ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((i4 & 57344) == 16384) | ((3670016 & i4) == 1048576) | ((29360128 & i4) == 8388608) | ((234881024 & i4) == 67108864) | ((1879048192 & i4) == 536870912);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                acc accVar = new acc(a4xVar, vxlVar, sylVar, jylVar, z, function1, function2);
                fetVar.o0(accVar);
                objP2 = accVar;
            }
            b8k0.f(mm40VarE0, xczVarA, hh80Var, false, qw3Var, yx7Var, null, false, null, (Function1) objP2, fetVar, ((i4 >> 9) & 896) | 196608, 456);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bcc(mm40Var, a4xVar, vxlVar, tylVar, sylVar, hh80Var, jylVar, z, function1, function2, i);
        }
    }

    public static final void e(mm40 mm40Var, a4x a4xVar, final syl sylVar, jyl jylVar, final vxl vxlVar, hh80 hh80Var, final boolean z, final Function1 function1, final Function1 function2, fet fetVar, int i) {
        int i2;
        a4x a4xVar2;
        jyl jylVar2;
        fetVar.g0(-1027731787);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            a4xVar2 = a4xVar;
            i2 |= fetVar.g(a4xVar2) ? 32 : 16;
        } else {
            a4xVar2 = a4xVar;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(sylVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            jylVar2 = jylVar;
            i2 |= fetVar.g(jylVar2) ? 2048 : 1024;
        } else {
            jylVar2 = jylVar;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.e(vxlVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(hh80Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.h(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(function2) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            mm40 mm40VarI = s5x0.I(o7k0.d(mm40Var, 1.0f), hh80Var);
            zcl zclVar = qmk.f28987a;
            final a4x a4xVar3 = a4xVar2;
            final jyl jylVar3 = jylVar2;
            jwb.p(mm40VarI, new qw3(8.0f, true, new jf4((byte) 14)), null, null, 0, 0, u1c.M(-1668420432, new xdr() { // from class: a.ccc
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((bpq) obj).getClass();
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                        Iterator<E> it = a4xVar3.iterator();
                        while (it.hasNext()) {
                            lcc.c(vxlVar, lcc.g((lxl) it.next(), fetVar2), sylVar, jylVar3, z, function1, function2, fetVar2, 0);
                        }
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 1572864, 60);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dcc(mm40Var, a4xVar, sylVar, jylVar, vxlVar, hh80Var, z, function1, function2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (a.bww.T(r7, r15, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        if (a.bww.T(r7, r2, r0) == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(a.xcz r7, int r8, boolean r9, int r10, a.w6k r11, a.k6z r12, a.hh80 r13, a.xx r14, a.zje r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lcc.f(a.xcz, int, boolean, int, a.w6k, a.k6z, a.hh80, a.xx, a.zje):java.lang.Object");
    }

    public static final lxl g(lxl lxlVar, fet fetVar) {
        uxl uxlVar;
        boolean zG = fetVar.g(lxlVar);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            if (lxlVar.c() && lxlVar.b()) {
                uxlVar = uxl.d;
            } else if (!lxlVar.c() || lxlVar.b()) {
                uxlVar = lxlVar.b() ? uxl.b : uxl.f36445a;
            } else {
                uxlVar = uxl.c;
            }
            objP = lxl.a(lxlVar, uxlVar);
            fetVar.o0(objP);
        }
        return (lxl) objP;
    }
}
