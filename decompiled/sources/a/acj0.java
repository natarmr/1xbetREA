package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class acj0 implements scj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f630a;

    public acj0(String str) {
        str.getClass();
        this.f630a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acj0) && Intrinsics.d(this.f630a, ((acj0) obj).f630a);
    }

    public final int hashCode() {
        return this.f630a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShareApp(url=", this.f630a, Separators.RPAREN);
    }
}
