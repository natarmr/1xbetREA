package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gyz implements tyz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12154a;
    public final String b;

    public gyz(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f12154a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyz)) {
            return false;
        }
        gyz gyzVar = (gyz) obj;
        return Intrinsics.d(this.f12154a, gyzVar.f12154a) && Intrinsics.d(this.b, gyzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12154a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LimitsKenyaHeaderWithDescriptionUiModel(title=", this.f12154a, ", description=", this.b, Separators.RPAREN);
    }
}
