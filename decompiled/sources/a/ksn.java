package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ksn implements z0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18822a;

    public ksn(String str) {
        u0f0 u0f0Var = u0f0.f34852a;
        str.getClass();
        this.f18822a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksn)) {
            return false;
        }
        u0f0 u0f0Var = u0f0.f34852a;
        return Intrinsics.d(this.f18822a, ((ksn) obj).f18822a);
    }

    public final int hashCode() {
        return this.f18822a.hashCode() + (u0f0.h1.hashCode() * 31);
    }

    @Override // a.z0f0
    public final u0f0 q() {
        return u0f0.h1;
    }

    public final String toString() {
        return "EmailRecommendationsUiModel(registrationFieldType=" + u0f0.h1 + ", recommendations=" + this.f18822a + Separators.RPAREN;
    }
}
