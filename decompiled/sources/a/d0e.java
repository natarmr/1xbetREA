package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d0e implements q0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5263a;

    public d0e(String str) {
        str.getClass();
        this.f5263a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0e) && Intrinsics.d(this.f5263a, ((d0e) obj).f5263a);
    }

    public final int hashCode() {
        return this.f5263a.hashCode();
    }

    public final String toString() {
        return kng0.l("InsertCodeFromSms(inputCode=", this.f5263a, Separators.RPAREN);
    }
}
