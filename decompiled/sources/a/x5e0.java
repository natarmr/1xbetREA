package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x5e0 implements z5e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40312a;

    public x5e0(String str) {
        str.getClass();
        this.f40312a = str;
    }

    @Override // a.z5e0
    public final String a() {
        return this.f40312a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x5e0) && Intrinsics.d(this.f40312a, ((x5e0) obj).f40312a);
    }

    public final int hashCode() {
        return this.f40312a.hashCode();
    }

    public final String toString() {
        return kng0.l("Loading(screenTitle=", this.f40312a, Separators.RPAREN);
    }
}
