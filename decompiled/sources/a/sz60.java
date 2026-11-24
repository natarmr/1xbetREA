package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class sz60 {
    public static final rz60 Companion = new rz60();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33056a;
    public final String b;

    public /* synthetic */ sz60(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f33056a = null;
        } else {
            this.f33056a = num;
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
        if (!(obj instanceof sz60)) {
            return false;
        }
        sz60 sz60Var = (sz60) obj;
        return Intrinsics.d(this.f33056a, sz60Var.f33056a) && Intrinsics.d(this.b, sz60Var.b);
    }

    public final int hashCode() {
        Integer num = this.f33056a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f33056a, "CategoryTranslate(recordId=", ", translate=", this.b, Separators.RPAREN);
    }
}
