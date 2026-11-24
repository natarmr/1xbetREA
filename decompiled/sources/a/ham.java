package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ham implements iam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12730a;

    public ham(String str) {
        str.getClass();
        this.f12730a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ham) && Intrinsics.d(this.f12730a, ((ham) obj).f12730a);
    }

    public final int hashCode() {
        return this.f12730a.hashCode();
    }

    public final String toString() {
        return kng0.l("Text(text=", this.f12730a, Separators.RPAREN);
    }
}
