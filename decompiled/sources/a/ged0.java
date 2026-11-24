package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ged0 implements ked0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11150a;
    public final String b;
    public final String c;

    public ged0(boolean z, String str, String str2) {
        str2.getClass();
        this.f11150a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ged0)) {
            return false;
        }
        ged0 ged0Var = (ged0) obj;
        return this.f11150a == ged0Var.f11150a && this.b.equals(ged0Var.b) && Intrinsics.d(this.c, ged0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f11150a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(axq.q("OpenNotificationSoundSettings(googleServicesAvailable=", ", defaultSoundPath=", this.b, this.f11150a, ", savedSoundPath="), this.c, Separators.RPAREN);
    }
}
