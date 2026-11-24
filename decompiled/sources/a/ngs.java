package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ngs implements pgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23499a;

    public ngs(String str) {
        str.getClass();
        this.f23499a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ngs) && Intrinsics.d(this.f23499a, ((ngs) obj).f23499a);
    }

    public final int hashCode() {
        return this.f23499a.hashCode();
    }

    public final String toString() {
        return kng0.l("TypeLabelUiModel(label=", this.f23499a, Separators.RPAREN);
    }
}
