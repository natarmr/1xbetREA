package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n400 implements q400 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22875a;

    public n400(String str) {
        str.getClass();
        this.f22875a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n400) && Intrinsics.d(this.f22875a, ((n400) obj).f22875a);
    }

    public final int hashCode() {
        return this.f22875a.hashCode();
    }

    public final String toString() {
        return kng0.l("Footer(text=", this.f22875a, Separators.RPAREN);
    }
}
