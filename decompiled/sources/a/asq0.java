package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class asq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1403a;

    public asq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f1403a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asq0) || !Intrinsics.d(this.f1403a, ((asq0) obj).f1403a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f1403a;
    }

    public final int hashCode() {
        return uwx.b.hashCode() + (this.f1403a.hashCode() * 31);
    }

    public final String toString() {
        return "ChooseCountry(title=" + this.f1403a + ", itemPosition=" + uwx.b + Separators.RPAREN;
    }
}
