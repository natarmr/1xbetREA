package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ax80 implements cx80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1612a;

    public ax80(String str) {
        str.getClass();
        this.f1612a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax80) && Intrinsics.d(this.f1612a, ((ax80) obj).f1612a);
    }

    public final int hashCode() {
        return this.f1612a.hashCode();
    }

    public final String toString() {
        return kng0.l("Content(matchTextInfo=", this.f1612a, Separators.RPAREN);
    }
}
