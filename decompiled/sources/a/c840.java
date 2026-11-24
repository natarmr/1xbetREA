package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class c840 {
    public static final b840 Companion = new b840();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f3896a;
    public final Integer b;

    public /* synthetic */ c840(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f3896a = null;
        } else {
            this.f3896a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c840)) {
            return false;
        }
        c840 c840Var = (c840) obj;
        return Intrinsics.d(this.f3896a, c840Var.f3896a) && Intrinsics.d(this.b, c840Var.b);
    }

    public final int hashCode() {
        Integer num = this.f3896a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("MessagesCountResponse(countNew=", this.f3896a, ", countNewPopUp=", this.b, Separators.RPAREN);
    }
}
