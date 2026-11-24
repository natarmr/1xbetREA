package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h4t implements s8p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12449a;
    public final String b;

    public h4t(String str) {
        str.getClass();
        this.f12449a = str;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h4t) && Intrinsics.d(this.f12449a, ((h4t) obj).f12449a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f12449a.hashCode();
    }

    public final String toString() {
        return kng0.l("GamesCategoryHeader(text=", this.f12449a, Separators.RPAREN);
    }
}
