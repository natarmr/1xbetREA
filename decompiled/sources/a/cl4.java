package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4538a;

    public cl4(String str) {
        this.f4538a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cl4) && Intrinsics.d(this.f4538a, ((cl4) obj).f4538a);
    }

    public final int hashCode() {
        String str = this.f4538a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("AuthOfferStateModel(imageUrl=", this.f4538a, Separators.RPAREN);
    }
}
