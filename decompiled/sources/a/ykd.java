package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class ykd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ev70 f42783a = new ev70("provider");
    public static final ev70 b = new ev70("provider");
    public static final ev70 c = new ev70("compositionLocalMap");
    public static final ev70 d = new ev70("providers");
    public static final ev70 e = new ev70("reference");

    public static final void a(String str) {
        throw new dkd(kng0.l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new dkd(kng0.l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [a.iun] */
    public static final lu40 c(tld tldVar, mu40 mu40Var, t9k0 t9k0Var, bv3 bv3Var) {
        cl5 cl5Var;
        q9k0 q9k0Var;
        ?? arrayList;
        bet betVar;
        long[] jArr;
        bet betVar2;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean zG;
        long[] jArr2;
        int i4;
        long j;
        long[] jArr3;
        int i5;
        int i6;
        mu40 mu40Var2 = mu40Var;
        cl5 cl5Var2 = ukd.f35823a;
        q9k0 q9k0Var2 = new q9k0();
        if (t9k0Var.e != null) {
            q9k0Var2.c();
        }
        if (t9k0Var.f != null) {
            q9k0Var2.k = new ey40();
        }
        int i7 = t9k0Var.t;
        if (bv3Var != null && t9k0Var.E(i7) > 0) {
            int iF = t9k0Var.v;
            while (iF > 0 && !t9k0Var.x(iF)) {
                iF = t9k0Var.F(t9k0Var.b, iF);
            }
            if (iF >= 0 && t9k0Var.x(iF)) {
                Object objD = t9k0Var.D(iF);
                int i8 = iF + 1;
                int iT = t9k0Var.t(iF) + iF;
                int iE = 0;
                while (i8 < iT) {
                    int iT2 = t9k0Var.t(i8) + i8;
                    if (iT2 > i7) {
                        break;
                    }
                    iE += t9k0Var.x(i8) ? 1 : t9k0Var.E(i8);
                    i8 = iT2;
                }
                int iE2 = t9k0Var.x(i7) ? 1 : t9k0Var.E(i7);
                bv3Var.i(objD);
                bv3Var.b(iE, iE2);
                bv3Var.l();
            }
        }
        bet betVar3 = mu40Var2.e;
        if (betVar3.a()) {
            tldVar.getClass();
            if (tldVar.n.e > 0) {
                arrayList = new ArrayList();
                hz40 hz40Var = tldVar.n;
                long[] jArr4 = hz40Var.f13891a;
                int length = jArr4.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j2 = jArr4[i9];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8;
                            int i11 = 8 - ((~(i9 - length)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j2 & 255) < 128) {
                                    int i13 = i10;
                                    int i14 = (i9 << 3) + i12;
                                    betVar2 = betVar3;
                                    Object obj = hz40Var.b[i14];
                                    Object obj2 = hz40Var.c[i14];
                                    obj.getClass();
                                    if (obj2 instanceof iz40) {
                                        iz40 iz40Var = (iz40) obj2;
                                        Object[] objArr = iz40Var.b;
                                        long[] jArr5 = iz40Var.f15620a;
                                        int length2 = jArr5.length - 2;
                                        if (length2 >= 0) {
                                            int i15 = 0;
                                            while (true) {
                                                long j3 = jArr5[i15];
                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                    int i17 = 0;
                                                    while (i17 < i16) {
                                                        if ((j3 & 255) < 128) {
                                                            i4 = i17;
                                                            int i18 = (i15 << 3) + i4;
                                                            j = j3;
                                                            Object obj3 = objArr[i18];
                                                            yfe0 yfe0Var = (yfe0) obj;
                                                            jArr3 = jArr5;
                                                            bet betVar4 = yfe0Var.c;
                                                            if (betVar4 != null) {
                                                                bet betVarJ = obc.J(betVar2);
                                                                i6 = i12;
                                                                bet betVarJ2 = obc.J(betVar4);
                                                                int iC = t9k0Var.c(betVarJ);
                                                                i5 = length;
                                                                int i19 = t9k0Var.b[(iC * 5) + 3] + iC;
                                                                int i20 = betVarJ2.f2467a;
                                                                if (iC <= i20 && i20 < i19) {
                                                                    arrayList.add(new Pair(yfe0Var, obj3));
                                                                    iz40Var.m(i18);
                                                                }
                                                            }
                                                            j3 = j >> i13;
                                                            i17 = i4 + 1;
                                                            jArr5 = jArr3;
                                                            length = i5;
                                                            i12 = i6;
                                                        } else {
                                                            i4 = i17;
                                                            j = j3;
                                                            jArr3 = jArr5;
                                                        }
                                                        i5 = length;
                                                        i6 = i12;
                                                        j3 = j >> i13;
                                                        i17 = i4 + 1;
                                                        jArr5 = jArr3;
                                                        length = i5;
                                                        i12 = i6;
                                                    }
                                                    jArr2 = jArr5;
                                                    i = length;
                                                    i2 = i12;
                                                    if (i16 != i13) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr2 = jArr5;
                                                    i = length;
                                                    i2 = i12;
                                                }
                                                if (i15 == length2) {
                                                    break;
                                                }
                                                i15++;
                                                jArr5 = jArr2;
                                                length = i;
                                                i12 = i2;
                                                i13 = 8;
                                            }
                                        } else {
                                            i = length;
                                            i2 = i12;
                                        }
                                        zG = iz40Var.g();
                                    } else {
                                        i = length;
                                        i2 = i12;
                                        obj2.getClass();
                                        yfe0 yfe0Var2 = (yfe0) obj;
                                        bet betVar5 = yfe0Var2.c;
                                        if (betVar5 != null) {
                                            bet betVarJ3 = obc.J(betVar2);
                                            bet betVarJ4 = obc.J(betVar5);
                                            int iC2 = t9k0Var.c(betVarJ3);
                                            int i21 = t9k0Var.b[(iC2 * 5) + 3] + iC2;
                                            int i22 = betVarJ4.f2467a;
                                            if (iC2 > i22 || i22 >= i21) {
                                                z = false;
                                            } else {
                                                arrayList.add(new Pair(yfe0Var2, obj2));
                                                z = true;
                                            }
                                        } else {
                                            z = false;
                                        }
                                        zG = z;
                                    }
                                    if (zG) {
                                        hz40Var.m(i14);
                                    }
                                    i3 = 8;
                                } else {
                                    betVar2 = betVar3;
                                    cl5Var2 = cl5Var2;
                                    q9k0Var2 = q9k0Var2;
                                    i = length;
                                    j2 = j2;
                                    i2 = i12;
                                    i3 = i10;
                                }
                                j2 >>= i3;
                                i12 = i2 + 1;
                                i10 = i3;
                                betVar3 = betVar2;
                                jArr4 = jArr4;
                                cl5Var2 = cl5Var2;
                                q9k0Var2 = q9k0Var2;
                                length = i;
                            }
                            betVar = betVar3;
                            cl5Var = cl5Var2;
                            q9k0Var = q9k0Var2;
                            jArr = jArr4;
                            int i23 = length;
                            if (i11 != i10) {
                                break;
                            }
                            length = i23;
                        } else {
                            betVar = betVar3;
                            cl5Var = cl5Var2;
                            q9k0Var = q9k0Var2;
                            jArr = jArr4;
                        }
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                        betVar3 = betVar;
                        jArr4 = jArr;
                        cl5Var2 = cl5Var;
                        q9k0Var2 = q9k0Var;
                    }
                } else {
                    cl5Var = cl5Var2;
                    q9k0Var = q9k0Var2;
                }
            } else {
                cl5Var = cl5Var2;
                q9k0Var = q9k0Var2;
                arrayList = iun.f15405a;
            }
            mu40Var2 = mu40Var;
            mu40Var2.f = CollectionsKt.q0(mu40Var2.f, arrayList);
        } else {
            cl5Var = cl5Var2;
            q9k0Var = q9k0Var2;
        }
        t9k0 t9k0VarH = q9k0Var.h();
        try {
            t9k0VarH.d();
            cl5 cl5Var3 = cl5Var;
            t9k0VarH.R(126665345, mu40Var2.f22397a, false, cl5Var3);
            t9k0.y(t9k0VarH);
            t9k0VarH.T(mu40Var2.b);
            List listC = t9k0Var.C(obc.J(mu40Var2.e), t9k0VarH);
            t9k0VarH.M();
            t9k0VarH.i();
            t9k0VarH.j();
            t9k0VarH.e(true);
            q9k0 q9k0Var3 = q9k0Var;
            lu40 lu40Var = new lu40(q9k0Var3);
            if (!listC.isEmpty()) {
                int size = listC.size();
                for (int i24 = 0; i24 < size; i24++) {
                    bet betVar6 = (bet) listC.get(i24);
                    if (q9k0Var3.j(betVar6)) {
                        int iB = q9k0Var3.b(betVar6);
                        int iD = s9k0.d(q9k0Var3.f28352a, iB);
                        int i25 = iB + 1;
                        if (((i25 < q9k0Var3.b ? q9k0Var3.f28352a[(i25 * 5) + 4] : q9k0Var3.c.length) - iD > 0 ? q9k0Var3.c[iD] : cl5Var3) instanceof yfe0) {
                            yzn0 yzn0Var = new yzn0(tldVar, mu40Var2);
                            t9k0 t9k0VarH2 = q9k0Var3.h();
                            try {
                                r8x.C(t9k0VarH2, listC, yzn0Var);
                                boolean z2 = true;
                                return lu40Var;
                            } finally {
                                t9k0VarH2.e(false);
                            }
                        }
                    }
                }
            }
            return lu40Var;
        } catch (Throwable th) {
            t9k0VarH.e(false);
            throw th;
        }
    }
}
