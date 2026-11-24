package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lgp implements ngp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugp f20018a;

    public lgp(ugp ugpVar) {
        ugpVar.getClass();
        this.f20018a = ugpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lgp) && Intrinsics.d(this.f20018a, ((lgp) obj).f20018a);
    }

    public final int hashCode() {
        return this.f20018a.hashCode();
    }

    public final String toString() {
        return "OnGameClicked(featureMatchDataUiModel=" + this.f20018a + Separators.RPAREN;
    }
}
