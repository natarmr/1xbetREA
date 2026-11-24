package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class khm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18301a;
    public final String b;

    public khm0(int i, String str) {
        str.getClass();
        this.f18301a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khm0)) {
            return false;
        }
        khm0 khm0Var = (khm0) obj;
        return this.f18301a == khm0Var.f18301a && Intrinsics.d(this.b, khm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f18301a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f18301a, "StatisticsDictionariesItemModel(id=", ", title=", this.b, Separators.RPAREN);
    }
}
