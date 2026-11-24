package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class aes0 implements vk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f745a;
    public final long b;

    public aes0(String str, long j) {
        str.getClass();
        this.f745a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aes0)) {
            return false;
        }
        aes0 aes0Var = (aes0) obj;
        return Intrinsics.d(this.f745a, aes0Var.f745a) && this.b == aes0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f745a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "TransactionDateUiModel(date=", this.f745a, ", defaultData=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
