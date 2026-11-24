package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class isq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15319a;

    public isq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f15319a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isq0) || !Intrinsics.d(this.f15319a, ((isq0) obj).f15319a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f15319a;
    }

    public final int hashCode() {
        return uwx.b.hashCode() + (this.f15319a.hashCode() * 31);
    }

    public final String toString() {
        return "OnlineCall(title=" + this.f15319a + ", itemPosition=" + uwx.b + Separators.RPAREN;
    }
}
