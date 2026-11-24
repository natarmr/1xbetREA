package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wrq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39657a;

    public wrq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f39657a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrq0) || !Intrinsics.d(this.f39657a, ((wrq0) obj).f39657a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f39657a;
    }

    public final int hashCode() {
        return uwx.b.hashCode() + (this.f39657a.hashCode() * 31);
    }

    public final String toString() {
        return "AppGuid(title=" + this.f39657a + ", itemPosition=" + uwx.b + Separators.RPAREN;
    }
}
