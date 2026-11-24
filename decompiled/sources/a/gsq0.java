package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gsq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11843a;

    public gsq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f11843a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.f36413a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsq0) || !Intrinsics.d(this.f11843a, ((gsq0) obj).f11843a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f11843a;
    }

    public final int hashCode() {
        return uwx.f36413a.hashCode() + (this.f11843a.hashCode() * 31);
    }

    public final String toString() {
        return "MarketsAndEvents(title=" + this.f11843a + ", itemPosition=" + uwx.f36413a + Separators.RPAREN;
    }
}
