package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yrq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43134a;

    public yrq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f43134a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrq0) || !Intrinsics.d(this.f43134a, ((yrq0) obj).f43134a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f43134a;
    }

    public final int hashCode() {
        return uwx.d.hashCode() + (this.f43134a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthorizationCredsConfig(title=" + this.f43134a + ", itemPosition=" + uwx.d + Separators.RPAREN;
    }
}
