package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sg90 extends ug90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32151a;

    public sg90(String str) {
        str.getClass();
        this.f32151a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg90) && Intrinsics.d(this.f32151a, ((sg90) obj).f32151a);
    }

    public final int hashCode() {
        return this.f32151a.hashCode();
    }

    public final String toString() {
        return kng0.l("Permanently(permission=", this.f32151a, Separators.RPAREN);
    }
}
