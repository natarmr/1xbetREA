package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sem0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rem0 f32081a;
    public final String b;

    public sem0(rem0 rem0Var, String str) {
        str.getClass();
        this.f32081a = rem0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sem0)) {
            return false;
        }
        sem0 sem0Var = (sem0) obj;
        return this.f32081a == sem0Var.f32081a && Intrinsics.d(this.b, sem0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32081a.hashCode() * 31);
    }

    public final String toString() {
        return "StatisticItemModel(keyInfo=" + this.f32081a + ", valueInfo=" + this.b + Separators.RPAREN;
    }
}
