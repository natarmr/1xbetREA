package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mjw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ljw f21915a;
    public final a4x b;

    public mjw(ljw ljwVar, i4 i4Var) {
        i4Var.getClass();
        this.f21915a = ljwVar;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjw)) {
            return false;
        }
        mjw mjwVar = (mjw) obj;
        return this.f21915a.equals(mjwVar.f21915a) && Intrinsics.d(this.b, mjwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21915a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeSegmentedControlUiModel(type=" + this.f21915a + ", segments=" + this.b + Separators.RPAREN;
    }
}
