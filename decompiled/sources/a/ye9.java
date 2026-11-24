package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ye9 extends ff9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42476a;

    public ye9(String str) {
        str.getClass();
        this.f42476a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye9) && Intrinsics.d(this.f42476a, ((ye9) obj).f42476a);
    }

    @Override // a.ff9
    public final String getTitle() {
        return this.f42476a;
    }

    public final int hashCode() {
        return this.f42476a.hashCode();
    }

    public final String toString() {
        return kng0.l("CameraUiModel(title=", this.f42476a, Separators.RPAREN);
    }
}
