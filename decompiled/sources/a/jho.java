package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jho implements kho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16538a;

    public jho(String str) {
        str.getClass();
        this.f16538a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jho) && Intrinsics.d(this.f16538a, ((jho) obj).f16538a);
    }

    public final int hashCode() {
        return this.f16538a.hashCode();
    }

    public final String toString() {
        return kng0.l("OptionBetLabelUiState(label=", this.f16538a, Separators.RPAREN);
    }
}
