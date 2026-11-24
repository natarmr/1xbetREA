package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lxf0 implements pxf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20814a;

    public lxf0(String str) {
        str.getClass();
        this.f20814a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxf0) && Intrinsics.d(this.f20814a, ((lxf0) obj).f20814a);
    }

    public final int hashCode() {
        return this.f20814a.hashCode();
    }

    public final String toString() {
        return kng0.l("InitEmail(email=", this.f20814a, Separators.RPAREN);
    }
}
