package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nvy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24210a;

    public /* synthetic */ nvy(String str) {
        this.f24210a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nvy) {
            return Intrinsics.d(this.f24210a, ((nvy) obj).f24210a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24210a.hashCode();
    }

    public final String toString() {
        return kng0.l("LabelChanged(value=", this.f24210a, Separators.RPAREN);
    }
}
