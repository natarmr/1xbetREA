package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bd80 implements cd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2386a;

    public bd80(String str) {
        str.getClass();
        this.f2386a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bd80) && Intrinsics.d(this.f2386a, ((bd80) obj).f2386a);
    }

    public final int hashCode() {
        return this.f2386a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorMessage(text=", this.f2386a, Separators.RPAREN);
    }
}
