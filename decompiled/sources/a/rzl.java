package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rzl implements tzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31366a;

    public rzl(String str) {
        str.getClass();
        this.f31366a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzl) && Intrinsics.d(this.f31366a, ((rzl) obj).f31366a);
    }

    public final int hashCode() {
        return this.f31366a.hashCode();
    }

    public final String toString() {
        return kng0.l("AllMarkets(buttonTitle=", this.f31366a, Separators.RPAREN);
    }
}
