package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a000 implements g100 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3a;

    public a000(String str) {
        str.getClass();
        this.f3a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a000) && Intrinsics.d(this.f3a, ((a000) obj).f3a);
    }

    public final int hashCode() {
        return this.f3a.hashCode();
    }

    public final String toString() {
        return kng0.l("LimitsNeFooterUiModel(text=", this.f3a, Separators.RPAREN);
    }
}
