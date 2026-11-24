package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f9v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9174a;
    public final th90 b;
    public final hjm c;
    public final uc50 d;
    public final hjm e;
    public final String f;
    public final String g;

    public f9v0(boolean z, th90 th90Var, hjm hjmVar, uc50 uc50Var, hjm hjmVar2, String str, String str2) {
        th90Var.getClass();
        str.getClass();
        str2.getClass();
        this.f9174a = z;
        this.b = th90Var;
        this.c = hjmVar;
        this.d = uc50Var;
        this.e = hjmVar2;
        this.f = str;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9v0)) {
            return false;
        }
        f9v0 f9v0Var = (f9v0) obj;
        return this.f9174a == f9v0Var.f9174a && Intrinsics.d(this.b, f9v0Var.b) && this.c.equals(f9v0Var.c) && this.d.equals(f9v0Var.d) && this.e.equals(f9v0Var.e) && Intrinsics.d(this.f, f9v0Var.f) && Intrinsics.d(this.g, f9v0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(hne.e(this.e, (this.d.hashCode() + hne.e(this.c, (this.b.hashCode() + (Boolean.hashCode(this.f9174a) * 31)) * 31, 31)) * 31, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WelcomeBonusUiState(isLoading=");
        sb.append(this.f9174a);
        sb.append(", bonusesDsModelsList=");
        sb.append(this.b);
        sb.append(", headerData=");
        sb.append(this.c);
        sb.append(", topBarStyle=");
        sb.append(this.d);
        sb.append(", headerInfoStyle=");
        sb.append(this.e);
        sb.append(", footerPart1Text=");
        sb.append(this.f);
        sb.append(", footerPart2Text=");
        return axq.n(sb, this.g, Separators.RPAREN);
    }
}
