package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class qct0 {
    public static final pct0 Companion = new pct0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28500a;
    public final tct0 b;

    public /* synthetic */ qct0(int i, String str, tct0 tct0Var) {
        if ((i & 1) == 0) {
            this.f28500a = null;
        } else {
            this.f28500a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = tct0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qct0)) {
            return false;
        }
        qct0 qct0Var = (qct0) obj;
        return Intrinsics.d(this.f28500a, qct0Var.f28500a) && Intrinsics.d(this.b, qct0Var.b);
    }

    public final int hashCode() {
        String str = this.f28500a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        tct0 tct0Var = this.b;
        return iHashCode + (tct0Var != null ? tct0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SocialItemVariant(title=" + this.f28500a + ", href=" + this.b + Separators.RPAREN;
    }
}
