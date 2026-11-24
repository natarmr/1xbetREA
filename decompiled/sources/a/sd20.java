package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sd20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32013a;

    public sd20(String str) {
        str.getClass();
        this.f32013a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd20) && Intrinsics.d(this.f32013a, ((sd20) obj).f32013a);
    }

    public final int hashCode() {
        return this.f32013a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(errorMessage=", this.f32013a, Separators.RPAREN);
    }
}
