package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hho implements kho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13074a;

    public hho(String str) {
        str.getClass();
        this.f13074a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hho) && Intrinsics.d(this.f13074a, ((hho) obj).f13074a);
    }

    public final int hashCode() {
        return this.f13074a.hashCode();
    }

    public final String toString() {
        return kng0.l("AutoSubLabelUiState(label=", this.f13074a, Separators.RPAREN);
    }
}
