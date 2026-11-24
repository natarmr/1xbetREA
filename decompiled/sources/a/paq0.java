package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class paq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ iiy[] f26667a = {new ez40(paq0.class, "amount", "getAmount(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new ez40(paq0.class, "currency", "getCurrency(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)};
    public static final zai0 b = new zai0("Amount");
    public static final zai0 c = new zai0("Currency");

    public static final void a(mm40 mm40Var, final a9q0 a9q0Var, final a9q0 a9q0Var2, final float f, final float f2, final float f3, final long j, fet fetVar, final int i) {
        final mm40 mm40Var2;
        fetVar.g0(-1488285778);
        int i2 = i | 6 | (fetVar.i(a9q0Var) ? 32 : 16) | (fetVar.i(a9q0Var2) ? 256 : 128) | (fetVar.d(f) ? 16384 : 8192) | (fetVar.d(f2) ? 131072 : 65536) | (fetVar.d(f3) ? 1048576 : 524288) | (fetVar.f(j) ? 8388608 : 4194304);
        boolean z = true;
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            String str = a9q0Var.f491a.f43981a.b;
            String str2 = a9q0Var2.f491a.f43981a.b;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "CURRENCY_AMOUNT_TEXT");
            boolean zG = fetVar.g(str) | fetVar.g(str2);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new b8q0((Object) str, (Object) str2, (byte) 6);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP);
            boolean z2 = ((i2 & 112) == 32 || fetVar.i(a9q0Var)) | ((458752 & i2) == 131072) | ((29360128 & i2) == 8388608) | ((57344 & i2) == 16384) | ((3670016 & i2) == 1048576);
            if ((i2 & 896) != 256 && !fetVar.i(a9q0Var2)) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                Function1 function1 = new Function1() { // from class: a.naq0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        fhl fhlVar = (fhl) obj;
                        fhlVar.getClass();
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        a9q0 a9q0Var3 = a9q0Var;
                        long j2 = j;
                        v2n0.o(fhlVar, a9q0Var3, j2, jFloatToRawIntBits, 248);
                        v2n0.o(fhlVar, a9q0Var2, j2, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 248);
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(function1);
                objP2 = function1;
            }
            p8a.k(mm40VarA, (Function1) objP2, fetVar, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(a9q0Var, a9q0Var2, f, f2, f3, j, i) { // from class: a.oaq0
                public final /* synthetic */ a9q0 b;
                public final /* synthetic */ a9q0 c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ long g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(3649);
                    paq0.a(this.f24941a, this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x013b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0152  */
    /* JADX WARN: Code duplicated, block: B:72:0x0155  */
    /* JADX WARN: Code duplicated, block: B:76:0x016d  */
    /* JADX WARN: Code duplicated, block: B:81:0x017b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void b(mm40 mm40Var, final String str, final String str2, final long j, final y9q0 y9q0Var, final long j2, final long j3, float f, fet fetVar, final int i, final int i2) {
        int i3;
        float f2;
        int i4;
        boolean z;
        final mm40 mm40Var2;
        final float f3;
        yfe0 yfe0VarU;
        final w6k w6kVar;
        final g9q0 g9q0VarN;
        final float fW0;
        final float fX;
        final float fX2;
        final y9q0 y9q0VarA;
        final float fX3;
        boolean z2;
        boolean z3;
        boolean zD;
        Object objP;
        str.getClass();
        str2.getClass();
        fetVar.g0(1369966566);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.f(j) ? 2048 : 1024) | (fetVar.g(y9q0Var) ? 16384 : 8192) | (fetVar.f(j2) ? 131072 : 65536) | (fetVar.f(j3) ? 1048576 : 524288);
        if ((i2 & 128) == 0) {
            f2 = f;
            int i7 = fetVar.d(f2) ? 8388608 : 4194304;
            i4 = i6 | i7;
            if ((i4 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                fetVar.Z();
                if ((i & 1) != 0 || fetVar.B()) {
                    if (i5 != 0) {
                        mm40Var2 = jm40.b;
                    } else {
                        mm40Var2 = mm40Var;
                    }
                    if ((i2 & 128) != 0) {
                        zcl zclVar = qmk.f28987a;
                        i4 &= -29360129;
                        f2 = 2.0f;
                    }
                } else {
                    fetVar.X();
                    if ((i2 & 128) != 0) {
                        i4 &= -29360129;
                    }
                    mm40Var2 = mm40Var;
                }
                fetVar.s();
                w6kVar = (w6k) fetVar.k(bmd.h);
                g9q0VarN = pym0.n(fetVar);
                fW0 = w6kVar.w0(f2);
                fX = w6kVar.X(j2);
                fX2 = w6kVar.X(j3);
                y9q0VarA = y9q0.a(y9q0Var, j, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                fX3 = w6kVar.X(qmk.n);
                boolean zD2 = fetVar.d(fX);
                if ((i4 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zG = z2 | zD2 | fetVar.g(g9q0VarN) | fetVar.g(y9q0VarA) | fetVar.g(w6kVar);
                if ((i4 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zD = zG | z3 | fetVar.d(fW0) | fetVar.d(fX2) | fetVar.d(fX3) | ((i4 & 7168) == 2048);
                objP = fetVar.P();
                if (zD || objP == ukd.f35823a) {
                    objP = new Function2() { // from class: a.kaq0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            float f4;
                            float f5;
                            c5n0 c5n0Var = (c5n0) obj;
                            c5n0Var.getClass();
                            long j4 = ((p4e) obj2).f26347a;
                            int i8 = p4e.i(j4);
                            String str3 = str;
                            float f6 = fX;
                            g9q0 g9q0Var = g9q0VarN;
                            y9q0 y9q0Var2 = y9q0VarA;
                            w6k w6kVar2 = w6kVar;
                            char c2 = ' ';
                            float f7 = (int) (paq0.c(str3, f6, g9q0Var, y9q0Var2, w6kVar2).c >> 32);
                            String str4 = str2;
                            float f8 = (int) (paq0.c(str4, f6, g9q0Var, y9q0Var2, w6kVar2).c >> 32);
                            float f9 = fW0;
                            float f10 = f7 + f9 + f8;
                            while (true) {
                                f4 = i8;
                                if (f10 <= f4) {
                                    break;
                                }
                                float f11 = fX2;
                                if (f6 <= f11) {
                                    break;
                                }
                                f6 -= fX3;
                                if (f6 < f11) {
                                    f6 = f11;
                                }
                                char c3 = c2;
                                f10 = ((int) (paq0.c(str3, f6, g9q0Var, y9q0Var2, w6kVar2).c >> c3)) + f9 + ((int) (paq0.c(str4, f6, g9q0Var, y9q0Var2, w6kVar2).c >> c3));
                                c2 = c3;
                            }
                            char c4 = c2;
                            final a9q0 a9q0VarC = paq0.c(str4, f6, g9q0Var, y9q0Var2, w6kVar2);
                            long j5 = a9q0VarC.c;
                            float f12 = ((int) (j5 >> c4)) + f9;
                            if (f10 <= f4) {
                                f5 = 0.0f;
                            } else {
                                float f13 = f4 - f12;
                                f5 = 0.0f;
                                if (f13 <= 0.0f) {
                                    str3 = "…";
                                } else {
                                    int length = str3.length();
                                    String str5 = "";
                                    int i9 = 0;
                                    while (i9 <= length) {
                                        int i10 = i9;
                                        int i11 = (i9 + length) / 2;
                                        int i12 = length;
                                        String strConcat = ttm0.L(i11, str3).concat("…");
                                        if (((int) (paq0.c(strConcat, f6, g9q0Var, y9q0Var2, w6kVar2).c >> c4)) <= f13) {
                                            i9 = i11 + 1;
                                            length = i12;
                                            str5 = strConcat;
                                        } else {
                                            length = i11 - 1;
                                            i9 = i10;
                                        }
                                    }
                                    str3 = str5;
                                }
                            }
                            final a9q0 a9q0VarC2 = paq0.c(str3, f6, g9q0Var, y9q0Var2, w6kVar2);
                            long j6 = a9q0VarC2.c;
                            float f14 = (int) (j6 >> c4);
                            int i13 = (int) (j6 & 4294967295L);
                            int i14 = (int) (4294967295L & j5);
                            float fMax = Math.max(i13, i14);
                            int iD = l1e0.d(si30.b(f14 + f12), p4e.k(j4), p4e.i(j4));
                            int iD2 = l1e0.d(si30.b(fMax), p4e.j(j4), p4e.h(j4));
                            final float f15 = f14 + f5 + f9;
                            float f16 = iD2 / 2.0f;
                            final float f17 = f16 - (i13 / 2.0f);
                            final float f18 = f16 - (i14 / 2.0f);
                            final long j7 = j;
                            List listK = c5n0Var.k("canvas", new ugd(1246624750, true, new Function2() { // from class: a.maq0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    fet fetVar2 = (fet) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        paq0.a(null, a9q0VarC2, a9q0VarC, f15, f17, f18, j7, fetVar2, 3648);
                                    } else {
                                        fetVar2.X();
                                    }
                                    return Unit.f46060a;
                                }
                            }));
                            ArrayList arrayList = new ArrayList(r3d.q(listK, 10));
                            Iterator it = listK.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((pj30) it.next()).S(p4e.a(iD, iD, iD2, iD2)));
                            }
                            return vj30.x(c5n0Var, iD, iD2, new uy2(arrayList, (byte) 20));
                        }
                    };
                    fetVar.o0(objP);
                }
                x4n0.a(mm40Var2, (Function2) objP, fetVar, i4 & 14, 0);
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
            }
            f3 = f2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.laq0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iL = x8x.L(i | 1);
                        paq0.b(mm40Var2, str, str2, j, y9q0Var, j2, j3, f3, (fet) obj, iL, i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        f2 = f;
        i4 = i6 | i7;
        if ((i4 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            fetVar.Z();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    mm40Var2 = jm40.b;
                } else {
                    mm40Var2 = mm40Var;
                }
                if ((i2 & 128) != 0) {
                    zcl zclVar2 = qmk.f28987a;
                    i4 &= -29360129;
                    f2 = 2.0f;
                }
            } else {
                if (i5 != 0) {
                    mm40Var2 = jm40.b;
                } else {
                    mm40Var2 = mm40Var;
                }
                if ((i2 & 128) != 0) {
                    zcl zclVar3 = qmk.f28987a;
                    i4 &= -29360129;
                    f2 = 2.0f;
                }
            }
            fetVar.s();
            w6kVar = (w6k) fetVar.k(bmd.h);
            g9q0VarN = pym0.n(fetVar);
            fW0 = w6kVar.w0(f2);
            fX = w6kVar.X(j2);
            fX2 = w6kVar.X(j3);
            y9q0VarA = y9q0.a(y9q0Var, j, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
            fX3 = w6kVar.X(qmk.n);
            boolean zD3 = fetVar.d(fX);
            if ((i4 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zG2 = z2 | zD3 | fetVar.g(g9q0VarN) | fetVar.g(y9q0VarA) | fetVar.g(w6kVar);
            if ((i4 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            zD = zG2 | z3 | fetVar.d(fW0) | fetVar.d(fX2) | fetVar.d(fX3) | ((i4 & 7168) == 2048);
            objP = fetVar.P();
            if (zD) {
                objP = new Function2() { // from class: a.kaq0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        float f4;
                        float f5;
                        c5n0 c5n0Var = (c5n0) obj;
                        c5n0Var.getClass();
                        long j4 = ((p4e) obj2).f26347a;
                        int i8 = p4e.i(j4);
                        String str3 = str;
                        float f6 = fX;
                        g9q0 g9q0Var = g9q0VarN;
                        y9q0 y9q0Var2 = y9q0VarA;
                        w6k w6kVar2 = w6kVar;
                        char c2 = ' ';
                        float f7 = (int) (paq0.c(str3, f6, g9q0Var, y9q0Var2, w6kVar2).c >> 32);
                        String str4 = str2;
                        float f8 = (int) (paq0.c(str4, f6, g9q0Var, y9q0Var2, w6kVar2).c >> 32);
                        float f9 = fW0;
                        float f10 = f7 + f9 + f8;
                        while (true) {
                            f4 = i8;
                            if (f10 <= f4) {
                                break;
                            }
                            float f11 = fX2;
                            if (f6 <= f11) {
                                break;
                            }
                            f6 -= fX3;
                            if (f6 < f11) {
                                f6 = f11;
                            }
                            char c3 = c2;
                            f10 = ((int) (paq0.c(str3, f6, g9q0Var, y9q0Var2, w6kVar2).c >> c3)) + f9 + ((int) (paq0.c(str4, f6, g9q0Var, y9q0Var2, w6kVar2).c >> c3));
                            c2 = c3;
                        }
                        char c4 = c2;
                        final a9q0 a9q0VarC = paq0.c(str4, f6, g9q0Var, y9q0Var2, w6kVar2);
                        long j5 = a9q0VarC.c;
                        float f12 = ((int) (j5 >> c4)) + f9;
                        if (f10 <= f4) {
                            f5 = 0.0f;
                        } else {
                            float f13 = f4 - f12;
                            f5 = 0.0f;
                            if (f13 <= 0.0f) {
                                str3 = "…";
                            } else {
                                int length = str3.length();
                                String str5 = "";
                                int i9 = 0;
                                while (i9 <= length) {
                                    int i10 = i9;
                                    int i11 = (i9 + length) / 2;
                                    int i12 = length;
                                    String strConcat = ttm0.L(i11, str3).concat("…");
                                    if (((int) (paq0.c(strConcat, f6, g9q0Var, y9q0Var2, w6kVar2).c >> c4)) <= f13) {
                                        i9 = i11 + 1;
                                        length = i12;
                                        str5 = strConcat;
                                    } else {
                                        length = i11 - 1;
                                        i9 = i10;
                                    }
                                }
                                str3 = str5;
                            }
                        }
                        final a9q0 a9q0VarC2 = paq0.c(str3, f6, g9q0Var, y9q0Var2, w6kVar2);
                        long j6 = a9q0VarC2.c;
                        float f14 = (int) (j6 >> c4);
                        int i13 = (int) (j6 & 4294967295L);
                        int i14 = (int) (4294967295L & j5);
                        float fMax = Math.max(i13, i14);
                        int iD = l1e0.d(si30.b(f14 + f12), p4e.k(j4), p4e.i(j4));
                        int iD2 = l1e0.d(si30.b(fMax), p4e.j(j4), p4e.h(j4));
                        final float f15 = f14 + f5 + f9;
                        float f16 = iD2 / 2.0f;
                        final float f17 = f16 - (i13 / 2.0f);
                        final float f18 = f16 - (i14 / 2.0f);
                        final long j7 = j;
                        List listK = c5n0Var.k("canvas", new ugd(1246624750, true, new Function2() { // from class: a.maq0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                fet fetVar2 = (fet) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    paq0.a(null, a9q0VarC2, a9q0VarC, f15, f17, f18, j7, fetVar2, 3648);
                                } else {
                                    fetVar2.X();
                                }
                                return Unit.f46060a;
                            }
                        }));
                        ArrayList arrayList = new ArrayList(r3d.q(listK, 10));
                        Iterator it = listK.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((pj30) it.next()).S(p4e.a(iD, iD, iD2, iD2)));
                        }
                        return vj30.x(c5n0Var, iD, iD2, new uy2(arrayList, (byte) 20));
                    }
                };
                fetVar.o0(objP);
            } else {
                objP = new Function2() { // from class: a.kaq0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        float f4;
                        float f5;
                        c5n0 c5n0Var = (c5n0) obj;
                        c5n0Var.getClass();
                        long j4 = ((p4e) obj2).f26347a;
                        int i8 = p4e.i(j4);
                        String str3 = str;
                        float f6 = fX;
                        g9q0 g9q0Var = g9q0VarN;
                        y9q0 y9q0Var2 = y9q0VarA;
                        w6k w6kVar2 = w6kVar;
                        char c2 = ' ';
                        float f7 = (int) (paq0.c(str3, f6, g9q0Var, y9q0Var2, w6kVar2).c >> 32);
                        String str4 = str2;
                        float f8 = (int) (paq0.c(str4, f6, g9q0Var, y9q0Var2, w6kVar2).c >> 32);
                        float f9 = fW0;
                        float f10 = f7 + f9 + f8;
                        while (true) {
                            f4 = i8;
                            if (f10 <= f4) {
                                break;
                            }
                            float f11 = fX2;
                            if (f6 <= f11) {
                                break;
                            }
                            f6 -= fX3;
                            if (f6 < f11) {
                                f6 = f11;
                            }
                            char c3 = c2;
                            f10 = ((int) (paq0.c(str3, f6, g9q0Var, y9q0Var2, w6kVar2).c >> c3)) + f9 + ((int) (paq0.c(str4, f6, g9q0Var, y9q0Var2, w6kVar2).c >> c3));
                            c2 = c3;
                        }
                        char c4 = c2;
                        final a9q0 a9q0VarC = paq0.c(str4, f6, g9q0Var, y9q0Var2, w6kVar2);
                        long j5 = a9q0VarC.c;
                        float f12 = ((int) (j5 >> c4)) + f9;
                        if (f10 <= f4) {
                            f5 = 0.0f;
                        } else {
                            float f13 = f4 - f12;
                            f5 = 0.0f;
                            if (f13 <= 0.0f) {
                                str3 = "…";
                            } else {
                                int length = str3.length();
                                String str5 = "";
                                int i9 = 0;
                                while (i9 <= length) {
                                    int i10 = i9;
                                    int i11 = (i9 + length) / 2;
                                    int i12 = length;
                                    String strConcat = ttm0.L(i11, str3).concat("…");
                                    if (((int) (paq0.c(strConcat, f6, g9q0Var, y9q0Var2, w6kVar2).c >> c4)) <= f13) {
                                        i9 = i11 + 1;
                                        length = i12;
                                        str5 = strConcat;
                                    } else {
                                        length = i11 - 1;
                                        i9 = i10;
                                    }
                                }
                                str3 = str5;
                            }
                        }
                        final a9q0 a9q0VarC2 = paq0.c(str3, f6, g9q0Var, y9q0Var2, w6kVar2);
                        long j6 = a9q0VarC2.c;
                        float f14 = (int) (j6 >> c4);
                        int i13 = (int) (j6 & 4294967295L);
                        int i14 = (int) (4294967295L & j5);
                        float fMax = Math.max(i13, i14);
                        int iD = l1e0.d(si30.b(f14 + f12), p4e.k(j4), p4e.i(j4));
                        int iD2 = l1e0.d(si30.b(fMax), p4e.j(j4), p4e.h(j4));
                        final float f15 = f14 + f5 + f9;
                        float f16 = iD2 / 2.0f;
                        final float f17 = f16 - (i13 / 2.0f);
                        final float f18 = f16 - (i14 / 2.0f);
                        final long j7 = j;
                        List listK = c5n0Var.k("canvas", new ugd(1246624750, true, new Function2() { // from class: a.maq0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                fet fetVar2 = (fet) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    paq0.a(null, a9q0VarC2, a9q0VarC, f15, f17, f18, j7, fetVar2, 3648);
                                } else {
                                    fetVar2.X();
                                }
                                return Unit.f46060a;
                            }
                        }));
                        ArrayList arrayList = new ArrayList(r3d.q(listK, 10));
                        Iterator it = listK.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((pj30) it.next()).S(p4e.a(iD, iD, iD2, iD2)));
                        }
                        return vj30.x(c5n0Var, iD, iD2, new uy2(arrayList, (byte) 20));
                    }
                };
                fetVar.o0(objP);
            }
            x4n0.a(mm40Var2, (Function2) objP, fetVar, i4 & 14, 0);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        f3 = f2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.laq0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i | 1);
                    paq0.b(mm40Var2, str, str2, j, y9q0Var, j2, j3, f3, (fet) obj, iL, i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final a9q0 c(String str, float f, g9q0 g9q0Var, y9q0 y9q0Var, w6k w6kVar) {
        return g9q0.b(g9q0Var, new j83(str), y9q0.a(y9q0Var, 0L, w6kVar.B(f), null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 1, false, 1, 0L, k6z.f17794a, null, null, 1888);
    }
}
