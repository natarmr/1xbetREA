package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ue10 implements we10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yh10 f35505a;

    public ue10(yh10 yh10Var) {
        yh10Var.getClass();
        this.f35505a = yh10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue10) && Intrinsics.d(this.f35505a, ((ue10) obj).f35505a);
    }

    public final int hashCode() {
        return this.f35505a.hashCode();
    }

    public final String toString() {
        return "Loaded(model=" + this.f35505a + Separators.RPAREN;
    }
}
