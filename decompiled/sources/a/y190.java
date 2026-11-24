package a;

import android.gov.nist.core.Separators;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class y190 implements Comparable {
    public static final String b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg9 f41844a;

    static {
        String str = File.separator;
        str.getClass();
        b = str;
    }

    public y190(qg9 qg9Var) {
        qg9Var.getClass();
        this.f41844a = qg9Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iC = c.c(this);
        qg9 qg9Var = this.f41844a;
        if (iC == -1) {
            iC = 0;
        } else if (iC < qg9Var.e() && qg9Var.l(iC) == 92) {
            iC++;
        }
        int iE = qg9Var.e();
        int i = iC;
        while (iC < iE) {
            if (qg9Var.l(iC) == 47 || qg9Var.l(iC) == 92) {
                arrayList.add(qg9Var.s(i, iC));
                i = iC + 1;
            }
            iC++;
        }
        if (i < qg9Var.e()) {
            arrayList.add(qg9Var.s(i, qg9Var.e()));
        }
        return arrayList;
    }

    public final String b() {
        qg9 qg9Var = c.f3497a;
        qg9 qg9VarT = this.f41844a;
        int iN = qg9.n(qg9VarT, qg9Var);
        if (iN == -1) {
            iN = qg9.n(qg9VarT, c.b);
        }
        if (iN != -1) {
            qg9VarT = qg9.t(qg9VarT, iN + 1, 0, 2);
        } else if (f() != null && qg9VarT.e() == 2) {
            qg9VarT = qg9.d;
        }
        return qg9VarT.x();
    }

    public final y190 c() {
        qg9 qg9Var = c.d;
        qg9 qg9Var2 = this.f41844a;
        if (Intrinsics.d(qg9Var2, qg9Var)) {
            return null;
        }
        qg9 qg9Var3 = c.f3497a;
        if (Intrinsics.d(qg9Var2, qg9Var3)) {
            return null;
        }
        qg9 qg9Var4 = c.b;
        if (Intrinsics.d(qg9Var2, qg9Var4)) {
            return null;
        }
        qg9 qg9Var5 = c.e;
        qg9Var2.getClass();
        qg9Var5.getClass();
        int iE = qg9Var2.e();
        byte[] bArr = qg9Var5.f28671a;
        if (qg9Var2.o(iE - bArr.length, qg9Var5, bArr.length) && (qg9Var2.e() == 2 || qg9Var2.o(qg9Var2.e() - 3, qg9Var3, 1) || qg9Var2.o(qg9Var2.e() - 3, qg9Var4, 1))) {
            return null;
        }
        int iN = qg9.n(qg9Var2, qg9Var3);
        if (iN == -1) {
            iN = qg9.n(qg9Var2, qg9Var4);
        }
        if (iN == 2 && f() != null) {
            if (qg9Var2.e() == 3) {
                return null;
            }
            return new y190(qg9.t(qg9Var2, 0, 3, 1));
        }
        if (iN == 1) {
            qg9Var4.getClass();
            if (qg9Var2.o(0, qg9Var4, qg9Var4.e())) {
                return null;
            }
        }
        if (iN != -1 || f() == null) {
            if (iN == -1) {
                return new y190(qg9Var);
            }
            return iN == 0 ? new y190(qg9.t(qg9Var2, 0, 1, 1)) : new y190(qg9.t(qg9Var2, 0, iN, 1));
        }
        if (qg9Var2.e() == 2) {
            return null;
        }
        return new y190(qg9.t(qg9Var2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y190 y190Var = (y190) obj;
        y190Var.getClass();
        return this.f41844a.compareTo(y190Var.f41844a);
    }

    public final y190 d(y190 y190Var) {
        y190Var.getClass();
        qg9 qg9Var = y190Var.f41844a;
        int iC = c.c(this);
        qg9 qg9Var2 = this.f41844a;
        y190 y190Var2 = iC == -1 ? null : new y190(qg9Var2.s(0, iC));
        int iC2 = c.c(y190Var);
        if (!Intrinsics.d(y190Var2, iC2 != -1 ? new y190(qg9Var.s(0, iC2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + y190Var).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = y190Var.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && Intrinsics.d(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && qg9Var2.e() == qg9Var.e()) {
            return rl70.b(Separators.DOT);
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(c.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + y190Var).toString());
        }
        if (Intrinsics.d(qg9Var, c.d)) {
            return this;
        }
        f99 f99Var = new f99();
        qg9 qg9VarB = c.b(y190Var);
        if (qg9VarB == null && (qg9VarB = c.b(this)) == null) {
            qg9VarB = c.f(b);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            f99Var.T(c.e);
            f99Var.T(qg9VarB);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            f99Var.T((qg9) arrayListA.get(i));
            f99Var.T(qg9VarB);
            i++;
        }
        return c.d(f99Var, false);
    }

    public final y190 e(String str) {
        str.getClass();
        f99 f99Var = new f99();
        f99Var.c0(str);
        return c.a(this, c.d(f99Var, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y190) && Intrinsics.d(((y190) obj).f41844a, this.f41844a);
    }

    public final Character f() {
        qg9 qg9Var = c.f3497a;
        qg9 qg9Var2 = this.f41844a;
        if (qg9.j(qg9Var2, qg9Var) != -1 || qg9Var2.e() < 2 || qg9Var2.l(1) != 58) {
            return null;
        }
        char cL = (char) qg9Var2.l(0);
        if (('a' > cL || cL >= '{') && ('A' > cL || cL >= '[')) {
            return null;
        }
        return Character.valueOf(cL);
    }

    public final int hashCode() {
        return this.f41844a.hashCode();
    }

    public final File toFile() {
        return new File(this.f41844a.x());
    }

    public final String toString() {
        return this.f41844a.x();
    }
}
