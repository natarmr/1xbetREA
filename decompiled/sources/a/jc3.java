package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16257a;

    public jc3(String str) {
        str.getClass();
        this.f16257a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jc3) && Intrinsics.d(this.f16257a, ((jc3) obj).f16257a);
    }

    public final int hashCode() {
        return this.f16257a.hashCode();
    }

    public final String toString() {
        return kng0.l("Simple(imageUrl=", this.f16257a, Separators.RPAREN);
    }
}
