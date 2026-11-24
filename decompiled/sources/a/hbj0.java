package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hbj0 implements kbj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdj0 f12773a;

    public /* synthetic */ hbj0(zdj0 zdj0Var) {
        this.f12773a = zdj0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hbj0) {
            return Intrinsics.d(this.f12773a, ((hbj0) obj).f12773a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12773a.hashCode();
    }

    public final String toString() {
        return "OnToggleSwitchClick(settingsUiModel=" + this.f12773a + Separators.RPAREN;
    }
}
