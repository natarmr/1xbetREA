package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e30 implements w30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7111a;

    public e30(String str) {
        str.getClass();
        this.f7111a = str;
    }

    @Override // a.w30
    public final String a() {
        return this.f7111a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e30) && Intrinsics.d(this.f7111a, ((e30) obj).f7111a);
    }

    public final int hashCode() {
        return this.f7111a.hashCode();
    }

    public final String toString() {
        return kng0.l("Disabled(advanceTitle=", this.f7111a, Separators.RPAREN);
    }
}
