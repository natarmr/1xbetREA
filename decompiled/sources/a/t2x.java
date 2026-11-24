package a;

import android.content.res.Resources;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t2x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f33237a;
    public final int b;

    public t2x(Resources.Theme theme, int i) {
        this.f33237a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2x)) {
            return false;
        }
        t2x t2xVar = (t2x) obj;
        return Intrinsics.d(this.f33237a, t2xVar.f33237a) && this.b == t2xVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f33237a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(theme=" + this.f33237a + ", id=" + this.b + Separators.RPAREN;
    }
}
