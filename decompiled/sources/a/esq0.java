package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class esq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8343a;

    public esq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f8343a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esq0) || !Intrinsics.d(this.f8343a, ((esq0) obj).f8343a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f8343a;
    }

    public final int hashCode() {
        return uwx.b.hashCode() + (this.f8343a.hashCode() * 31);
    }

    public final String toString() {
        return "FeatureToggles(title=" + this.f8343a + ", itemPosition=" + uwx.b + Separators.RPAREN;
    }
}
