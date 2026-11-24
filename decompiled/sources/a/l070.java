package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class l070 {
    public static final k070 Companion = new k070();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19185a;
    public final String b;

    public /* synthetic */ l070(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f19185a = null;
        } else {
            this.f19185a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l070)) {
            return false;
        }
        l070 l070Var = (l070) obj;
        return Intrinsics.d(this.f19185a, l070Var.f19185a) && Intrinsics.d(this.b, l070Var.b);
    }

    public final int hashCode() {
        Integer num = this.f19185a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f19185a, "GameName(idName=", ", gameName=", this.b, Separators.RPAREN);
    }
}
