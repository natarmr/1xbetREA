package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oyi0 implements czi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hej0 f26062a;

    public oyi0(hej0 hej0Var) {
        hej0Var.getClass();
        this.f26062a = hej0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oyi0) && Intrinsics.d(this.f26062a, ((oyi0) obj).f26062a);
    }

    public final int hashCode() {
        return this.f26062a.hashCode();
    }

    public final String toString() {
        return "OnSettingsItemClick(settingsUiModel=" + this.f26062a + Separators.RPAREN;
    }
}
