package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fsq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10076a;

    public fsq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f10076a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsq0) || !Intrinsics.d(this.f10076a, ((fsq0) obj).f10076a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f10076a;
    }

    public final int hashCode() {
        return uwx.b.hashCode() + (this.f10076a.hashCode() * 31);
    }

    public final String toString() {
        return "GenerateCouponEvents(title=" + this.f10076a + ", itemPosition=" + uwx.b + Separators.RPAREN;
    }
}
