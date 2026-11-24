package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class isn implements x0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15313a;

    public isn(String str) {
        u0f0 u0f0Var = u0f0.f34852a;
        str.getClass();
        this.f15313a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isn)) {
            return false;
        }
        u0f0 u0f0Var = u0f0.f34852a;
        return Intrinsics.d(this.f15313a, ((isn) obj).f15313a);
    }

    public final int hashCode() {
        return this.f15313a.hashCode() + (u0f0.h1.hashCode() * 31);
    }

    @Override // a.x0f0
    public final u0f0 q() {
        return u0f0.h1;
    }

    public final String toString() {
        return "EmailRecommendationsUiModel(registrationFieldType=" + u0f0.h1 + ", recommendations=" + this.f15313a + Separators.RPAREN;
    }
}
