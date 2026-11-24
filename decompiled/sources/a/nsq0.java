package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nsq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24061a;

    public nsq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f24061a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsq0) || !Intrinsics.d(this.f24061a, ((nsq0) obj).f24061a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f24061a;
    }

    public final int hashCode() {
        return uwx.b.hashCode() + (this.f24061a.hashCode() * 31);
    }

    public final String toString() {
        return "Update(title=" + this.f24061a + ", itemPosition=" + uwx.b + Separators.RPAREN;
    }
}
