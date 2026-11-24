package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qg9 f3497a;
    public static final qg9 b;
    public static final qg9 c;
    public static final qg9 d;
    public static final qg9 e;

    static {
        qg9 qg9Var = qg9.d;
        f3497a = gl5.i(Separators.SLASH);
        b = gl5.i("\\");
        c = gl5.i("/\\");
        d = gl5.i(Separators.DOT);
        e = gl5.i("..");
    }

    public static final y190 a(y190 y190Var, y190 y190Var2, boolean z) {
        y190Var2.getClass();
        if (c(y190Var2) != -1 || y190Var2.f() != null) {
            return y190Var2;
        }
        qg9 qg9VarB = b(y190Var);
        if (qg9VarB == null && (qg9VarB = b(y190Var2)) == null) {
            qg9VarB = f(y190.b);
        }
        f99 f99Var = new f99();
        f99Var.T(y190Var.f41844a);
        if (f99Var.b > 0) {
            f99Var.T(qg9VarB);
        }
        f99Var.T(y190Var2.f41844a);
        return d(f99Var, z);
    }

    public static final qg9 b(y190 y190Var) {
        qg9 qg9Var = y190Var.f41844a;
        qg9 qg9Var2 = f3497a;
        if (qg9.j(qg9Var, qg9Var2) != -1) {
            return qg9Var2;
        }
        qg9 qg9Var3 = y190Var.f41844a;
        qg9 qg9Var4 = b;
        if (qg9.j(qg9Var3, qg9Var4) != -1) {
            return qg9Var4;
        }
        return null;
    }

    public static final int c(y190 y190Var) {
        qg9 qg9Var = y190Var.f41844a;
        if (qg9Var.e() != 0) {
            if (qg9Var.l(0) != 47) {
                if (qg9Var.l(0) == 92) {
                    if (qg9Var.e() > 2 && qg9Var.l(1) == 92) {
                        qg9 qg9Var2 = b;
                        qg9Var2.getClass();
                        int i = qg9Var.i(qg9Var2.k(), 2);
                        return i == -1 ? qg9Var.e() : i;
                    }
                } else if (qg9Var.e() > 2 && qg9Var.l(1) == 58 && qg9Var.l(2) == 92) {
                    char cL = (char) qg9Var.l(0);
                    if ('a' <= cL && cL < '{') {
                        return 3;
                    }
                    if ('A' <= cL && cL < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110 A[EDGE_INSN: B:98:0x0110->B:81:0x0110 BREAK  A[LOOP:1: B:53:0x00ab->B:112:0x00ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00fe A[SYNTHETIC] */
    public static final y190 d(f99 f99Var, boolean z) {
        qg9 qg9Var;
        long j;
        char cN;
        boolean z2;
        ArrayList arrayList;
        boolean zV0;
        qg9 qg9Var2;
        int size;
        int i;
        long jW;
        qg9 qg9VarQ0;
        qg9 qg9Var3;
        f99 f99Var2 = new f99();
        qg9 qg9VarE = null;
        int i2 = 0;
        while (true) {
            if (!f99Var.m0(0L, f3497a)) {
                qg9Var = b;
                if (!f99Var.m0(0L, qg9Var)) {
                    break;
                }
            }
            byte b2 = f99Var.readByte();
            if (qg9VarE == null) {
                qg9VarE = e(b2);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && Intrinsics.d(qg9VarE, qg9Var);
        qg9 qg9Var4 = c;
        if (z3) {
            qg9VarE.getClass();
            f99Var2.T(qg9VarE);
            f99Var2.T(qg9VarE);
        } else {
            if (i2 <= 0) {
                long jW2 = f99Var.w(qg9Var4);
                if (qg9VarE == null) {
                    qg9VarE = jW2 == -1 ? f(y190.b) : e(f99Var.n(jW2));
                }
                if (Intrinsics.d(qg9VarE, qg9Var) && f99Var.b >= 2) {
                    j = -1;
                    if (f99Var.n(1L) == 58 && (('a' <= (cN = (char) f99Var.n(0L)) && cN < '{') || ('A' <= cN && cN < '['))) {
                        if (jW2 == 2) {
                            f99Var2.F0(f99Var, 3L);
                        } else {
                            f99Var2.F0(f99Var, 2L);
                        }
                    }
                }
                if (f99Var2.b > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zV0 = f99Var.v0();
                    qg9Var2 = d;
                    if (!zV0) {
                        break;
                    }
                    jW = f99Var.w(qg9Var4);
                    if (jW == j) {
                        qg9VarQ0 = f99Var.q0(f99Var.b);
                    } else {
                        qg9VarQ0 = f99Var.q0(jW);
                        f99Var.readByte();
                    }
                    qg9Var3 = e;
                    if (Intrinsics.d(qg9VarQ0, qg9Var3)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || Intrinsics.d(CollectionsKt.d0(arrayList), qg9Var3)))) {
                                arrayList.add(qg9VarQ0);
                            } else if (!z3 || arrayList.size() != 1) {
                                w3d.A(arrayList);
                            }
                        }
                    } else if (Intrinsics.d(qg9VarQ0, qg9Var2) && !Intrinsics.d(qg9VarQ0, qg9.d)) {
                        arrayList.add(qg9VarQ0);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        f99Var2.T(qg9VarE);
                    }
                    f99Var2.T((qg9) arrayList.get(i));
                }
                if (f99Var2.b == 0) {
                    f99Var2.T(qg9Var2);
                }
                return new y190(f99Var2.q0(f99Var2.b));
            }
            qg9VarE.getClass();
            f99Var2.T(qg9VarE);
        }
        j = -1;
        if (f99Var2.b > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zV0 = f99Var.v0();
            qg9Var2 = d;
            if (!zV0) {
                break;
                break;
            }
            jW = f99Var.w(qg9Var4);
            if (jW == j) {
                qg9VarQ0 = f99Var.q0(f99Var.b);
            } else {
                qg9VarQ0 = f99Var.q0(jW);
                f99Var.readByte();
            }
            qg9Var3 = e;
            if (Intrinsics.d(qg9VarQ0, qg9Var3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(qg9VarQ0);
            } else if (Intrinsics.d(qg9VarQ0, qg9Var2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                f99Var2.T(qg9VarE);
            }
            f99Var2.T((qg9) arrayList.get(i));
        }
        if (f99Var2.b == 0) {
            f99Var2.T(qg9Var2);
        }
        return new y190(f99Var2.q0(f99Var2.b));
    }

    public static final qg9 e(byte b2) {
        if (b2 == 47) {
            return f3497a;
        }
        if (b2 == 92) {
            return b;
        }
        jf4.o(twn.m(b2, "not a directory separator: "));
        return null;
    }

    public static final qg9 f(String str) {
        if (Intrinsics.d(str, Separators.SLASH)) {
            return f3497a;
        }
        if (Intrinsics.d(str, "\\")) {
            return b;
        }
        jf4.o(kng0.k("not a directory separator: ", str));
        return null;
    }
}
