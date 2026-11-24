package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class msq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22333a;

    public msq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f22333a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msq0) || !Intrinsics.d(this.f22333a, ((msq0) obj).f22333a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f22333a;
    }

    public final int hashCode() {
        return uwx.b.hashCode() + (this.f22333a.hashCode() * 31);
    }

    public final String toString() {
        return "UiSettings(title=" + this.f22333a + ", itemPosition=" + uwx.b + Separators.RPAREN;
    }
}
