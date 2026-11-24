package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qsv implements s1q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29271a;

    public qsv(String str) {
        str.getClass();
        this.f29271a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qsv) && Intrinsics.d(this.f29271a, ((qsv) obj).f29271a);
    }

    public final int hashCode() {
        return this.f29271a.hashCode();
    }

    public final String toString() {
        return kng0.l("HeaderUiModel(title=", this.f29271a, Separators.RPAREN);
    }
}
