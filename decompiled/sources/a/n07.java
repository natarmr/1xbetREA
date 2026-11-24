package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n07 implements q07 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22687a;

    public final boolean equals(Object obj) {
        if (obj instanceof n07) {
            return Intrinsics.d(this.f22687a, ((n07) obj).f22687a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22687a.hashCode();
    }

    public final String toString() {
        return kng0.l("GroupName(value=", this.f22687a, Separators.RPAREN);
    }
}
