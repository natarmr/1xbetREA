package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lik0 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20112a;
    public final int b;
    public final String c;
    public final String d;
    public final v12 e;
    public final String f;

    public lik0(String str, int i, String str2, String str3, v12 v12Var) {
        str.getClass();
        str2.getClass();
        this.f20112a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = v12Var;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lik0)) {
            return false;
        }
        lik0 lik0Var = (lik0) obj;
        return Intrinsics.d(this.f20112a, lik0Var.f20112a) && this.b == lik0Var.b && Intrinsics.d(this.c, lik0Var.c) && this.d.equals(lik0Var.d) && this.e == lik0Var.e;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.f;
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(twn.a(this.b, this.f20112a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "SocialNetUiModel(socialName=", this.f20112a, ", icon=", ", link=");
        f140.v(sbP, this.c, ", appPackageName=", this.d, ", alignmentInSection=");
        sbP.append(this.e);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
