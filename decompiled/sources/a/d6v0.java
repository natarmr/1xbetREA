package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d6v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5569a;
    public final e6v0 b;

    public d6v0(String str, e6v0 e6v0Var) {
        str.getClass();
        this.f5569a = str;
        this.b = e6v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6v0)) {
            return false;
        }
        d6v0 d6v0Var = (d6v0) obj;
        return Intrinsics.d(this.f5569a, d6v0Var.f5569a) && this.b == d6v0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5569a.hashCode() * 31);
    }

    public final String toString() {
        return "WeekdaysCellUiModel(value=" + this.f5569a + ", state=" + this.b + Separators.RPAREN;
    }
}
