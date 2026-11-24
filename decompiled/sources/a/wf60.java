package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wf60 implements yf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39055a;

    public wf60(String str) {
        str.getClass();
        this.f39055a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wf60) && Intrinsics.d(this.f39055a, ((wf60) obj).f39055a);
    }

    public final int hashCode() {
        return this.f39055a.hashCode();
    }

    public final String toString() {
        return kng0.l("Content(title=", this.f39055a, Separators.RPAREN);
    }
}
