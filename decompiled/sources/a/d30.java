package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d30 implements v30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5379a;

    public d30(String str) {
        str.getClass();
        this.f5379a = str;
    }

    @Override // a.v30
    public final String a() {
        return this.f5379a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d30) && Intrinsics.d(this.f5379a, ((d30) obj).f5379a);
    }

    public final int hashCode() {
        return this.f5379a.hashCode();
    }

    public final String toString() {
        return kng0.l("Disabled(advanceTitle=", this.f5379a, Separators.RPAREN);
    }
}
