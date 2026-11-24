package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h9b implements i9b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12665a;

    public h9b(String str) {
        str.getClass();
        this.f12665a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9b) && Intrinsics.d(this.f12665a, ((h9b) obj).f12665a);
    }

    public final int hashCode() {
        return this.f12665a.hashCode();
    }

    public final String toString() {
        return kng0.l("TextCellData(value=", this.f12665a, Separators.RPAREN);
    }
}
