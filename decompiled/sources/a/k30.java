package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k30 implements w30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17594a;

    public k30(String str) {
        str.getClass();
        this.f17594a = str;
    }

    @Override // a.w30
    public final String a() {
        return this.f17594a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k30) && Intrinsics.d(this.f17594a, ((k30) obj).f17594a);
    }

    public final int hashCode() {
        return this.f17594a.hashCode();
    }

    public final String toString() {
        return kng0.l("Primary(advanceTitle=", this.f17594a, Separators.RPAREN);
    }
}
