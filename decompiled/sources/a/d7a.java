package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d7a implements e7a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7a f5586a;
    public final String b;

    public d7a(i7a i7aVar, String str) {
        i7aVar.getClass();
        str.getClass();
        this.f5586a = i7aVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7a)) {
            return false;
        }
        d7a d7aVar = (d7a) obj;
        return Intrinsics.d(this.f5586a, d7aVar.f5586a) && Intrinsics.d(this.b, d7aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5586a.hashCode() * 31);
    }

    public final String toString() {
        return "UserActionRequired(captchaTask=" + this.f5586a + ", phoneNumber=" + this.b + Separators.RPAREN;
    }
}
