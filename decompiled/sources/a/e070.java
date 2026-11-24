package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class e070 {
    public static final d070 Companion = new d070();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6976a;
    public final String b;

    public /* synthetic */ e070(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f6976a = null;
        } else {
            this.f6976a = num;
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
        if (!(obj instanceof e070)) {
            return false;
        }
        e070 e070Var = (e070) obj;
        return Intrinsics.d(this.f6976a, e070Var.f6976a) && Intrinsics.d(this.b, e070Var.b);
    }

    public final int hashCode() {
        Integer num = this.f6976a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f6976a, "Category(id=", ", categoryName=", this.b, Separators.RPAREN);
    }
}
