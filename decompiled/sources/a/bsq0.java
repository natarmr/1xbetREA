package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bsq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3144a;

    public bsq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f3144a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.f36413a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsq0) || !Intrinsics.d(this.f3144a, ((bsq0) obj).f3144a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f3144a;
    }

    public final int hashCode() {
        return uwx.f36413a.hashCode() + (this.f3144a.hashCode() * 31);
    }

    public final String toString() {
        return "ClientConfig(title=" + this.f3144a + ", itemPosition=" + uwx.f36413a + Separators.RPAREN;
    }
}
