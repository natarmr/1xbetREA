package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ayz implements tyz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1693a;

    public ayz(String str) {
        str.getClass();
        this.f1693a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ayz) && Intrinsics.d(this.f1693a, ((ayz) obj).f1693a);
    }

    public final int hashCode() {
        return this.f1693a.hashCode();
    }

    public final String toString() {
        return kng0.l("LimitsKenyaFooterUiModel(text=", this.f1693a, Separators.RPAREN);
    }
}
