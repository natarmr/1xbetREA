package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sh10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32188a;
    public final wi10 b;

    public sh10(boolean z, wi10 wi10Var) {
        wi10Var.getClass();
        this.f32188a = z;
        this.b = wi10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh10)) {
            return false;
        }
        sh10 sh10Var = (sh10) obj;
        return this.f32188a == sh10Var.f32188a && Intrinsics.d(this.b, sh10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f32188a) * 31);
    }

    public final String toString() {
        return "LoyaltyProgramCashbackInfoModel(updating=" + this.f32188a + ", userInfo=" + this.b + Separators.RPAREN;
    }
}
