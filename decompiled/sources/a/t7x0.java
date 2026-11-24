package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t7x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33489a;
    public final List b;
    public final qdw0 c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final s3x0 k;

    public t7x0(boolean z, b4x b4xVar, qdw0 qdw0Var, String str, String str2, b4x b4xVar2, b4x b4xVar3, boolean z2, boolean z3, boolean z4, s3x0 s3x0Var) {
        b4xVar.getClass();
        qdw0Var.getClass();
        str.getClass();
        str2.getClass();
        b4xVar2.getClass();
        b4xVar3.getClass();
        s3x0Var.getClass();
        this.f33489a = z;
        this.b = b4xVar;
        this.c = qdw0Var;
        this.d = str;
        this.e = str2;
        this.f = b4xVar2;
        this.g = b4xVar3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = s3x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7x0)) {
            return false;
        }
        t7x0 t7x0Var = (t7x0) obj;
        return this.f33489a == t7x0Var.f33489a && Intrinsics.d(this.b, t7x0Var.b) && Intrinsics.d(this.c, t7x0Var.c) && Intrinsics.d(this.d, t7x0Var.d) && Intrinsics.d(this.e, t7x0Var.e) && Intrinsics.d(this.f, t7x0Var.f) && Intrinsics.d(this.g, t7x0Var.g) && this.h == t7x0Var.h && this.i == t7x0Var.i && this.j == t7x0Var.j && Intrinsics.d(this.k, t7x0Var.k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f33489a), this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j));
    }

    public final String toString() {
        boolean z = this.f33489a;
        int length = String.valueOf(z).length();
        List list = this.b;
        int length2 = String.valueOf(list).length();
        qdw0 qdw0Var = this.c;
        int length3 = String.valueOf(qdw0Var).length();
        String str = this.d;
        int length4 = String.valueOf(str).length();
        String str2 = this.e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.g;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.h;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.i;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.j;
        int length10 = String.valueOf(z4).length();
        s3x0 s3x0Var = this.k;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(s3x0Var).length() + 1);
        esw0.l(sb, "SharedStorageInfo(shouldUseSharedStorage=", z, ", enabledBackings=", list);
        sb.append(", secret=");
        sb.append(qdw0Var);
        sb.append(", dirPath=");
        sb.append(str);
        ua80.t(", gmsCoreDirPath=", str2, ", includeStaticConfigPackages=", sb, list2);
        esw0.k(sb, ", excludeStaticConfigPackages=", list3, ", hasStorageInfoFromGms=", z2);
        w6x.A(", allowEmptySnapshotToken=", ", enableCommitV2Api=", sb, z3, z4);
        sb.append(", clientFlags=");
        sb.append(s3x0Var);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
