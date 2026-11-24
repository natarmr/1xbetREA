package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20609a;
    public final String b;

    public lt2(String str, String str2) {
        str.getClass();
        this.f20609a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt2)) {
            return false;
        }
        lt2 lt2Var = (lt2) obj;
        return Intrinsics.d(this.f20609a, lt2Var.f20609a) && this.b.equals(lt2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20609a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AnalyticsWinBackStatusModel(analyticsWinBackStatus=", this.f20609a, ", screenFrom=", this.b, Separators.RPAREN);
    }
}
