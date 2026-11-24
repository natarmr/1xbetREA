package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dsq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6624a;

    public dsq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f6624a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsq0) || !Intrinsics.d(this.f6624a, ((dsq0) obj).f6624a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f6624a;
    }

    public final int hashCode() {
        return uwx.b.hashCode() + (this.f6624a.hashCode() * 31);
    }

    public final String toString() {
        return "EnvironmentAndServers(title=" + this.f6624a + ", itemPosition=" + uwx.b + Separators.RPAREN;
    }
}
