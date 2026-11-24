package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class f6u0 {
    public static final e6u0 Companion = new e6u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9031a;
    public final Integer b;

    public /* synthetic */ f6u0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f9031a = null;
        } else {
            this.f9031a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6u0)) {
            return false;
        }
        f6u0 f6u0Var = (f6u0) obj;
        return Intrinsics.d(this.f9031a, f6u0Var.f9031a) && Intrinsics.d(this.b, f6u0Var.b);
    }

    public final int hashCode() {
        String str = this.f9031a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "VeloJerseyResponse(veloJerseyLeaderType=" + this.f9031a + ", veloJerseyType=" + this.b + Separators.RPAREN;
    }
}
