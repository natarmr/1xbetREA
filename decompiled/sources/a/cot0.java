package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cot0 implements f83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4719a;

    public cot0(String str) {
        this.f4719a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cot0) {
            return Intrinsics.d(this.f4719a, ((cot0) obj).f4719a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4719a.hashCode();
    }

    public final String toString() {
        return kng0.l("UrlAnnotation(url=", this.f4719a, Separators.RPAREN);
    }
}
