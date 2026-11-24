package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b6v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2076a;
    public final String b;

    public b6v0(int i, String str) {
        str.getClass();
        this.f2076a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6v0)) {
            return false;
        }
        b6v0 b6v0Var = (b6v0) obj;
        return this.f2076a == b6v0Var.f2076a && Intrinsics.d(this.b, b6v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f2076a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f2076a, "WeekdayHeader(dayOfWeek=", ", label=", this.b, Separators.RPAREN);
    }
}
