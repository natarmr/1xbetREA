package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qwn implements rwn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29443a;

    public qwn(String str) {
        str.getClass();
        this.f29443a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qwn) && Intrinsics.d(this.f29443a, ((qwn) obj).f29443a);
    }

    public final int hashCode() {
        return this.f29443a.hashCode();
    }

    public final String toString() {
        return kng0.l("UpdateDestination(value=", this.f29443a, Separators.RPAREN);
    }
}
