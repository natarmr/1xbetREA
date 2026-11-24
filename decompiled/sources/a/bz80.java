package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bz80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3454a;

    public bz80(String str) {
        str.getClass();
        this.f3454a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz80) && Intrinsics.d(this.f3454a, ((bz80) obj).f3454a);
    }

    public final int hashCode() {
        return this.f3454a.hashCode();
    }

    public final String toString() {
        return kng0.l("PartnersTeamsToolbarUiModel(title=", this.f3454a, Separators.RPAREN);
    }
}
