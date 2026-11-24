package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h1w implements i1w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12303a;

    public h1w(String str) {
        str.getClass();
        this.f12303a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1w) && Intrinsics.d(this.f12303a, ((h1w) obj).f12303a);
    }

    public final int hashCode() {
        return this.f12303a.hashCode();
    }

    public final String toString() {
        return kng0.l("TitleStatusUiModel(title=", this.f12303a, Separators.RPAREN);
    }
}
