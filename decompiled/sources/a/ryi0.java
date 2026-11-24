package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ryi0 implements czi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vdj0 f31317a;

    public ryi0(vdj0 vdj0Var) {
        vdj0Var.getClass();
        this.f31317a = vdj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ryi0) && Intrinsics.d(this.f31317a, ((ryi0) obj).f31317a);
    }

    public final int hashCode() {
        return this.f31317a.hashCode();
    }

    public final String toString() {
        return "OnToggleSwitchClick(settingsUiModel=" + this.f31317a + Separators.RPAREN;
    }
}
