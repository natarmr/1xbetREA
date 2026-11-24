package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nx8 implements px8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24271a;

    public nx8(String str) {
        str.getClass();
        this.f24271a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx8) && Intrinsics.d(this.f24271a, ((nx8) obj).f24271a);
    }

    public final int hashCode() {
        return this.f24271a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnackBar(message=", this.f24271a, Separators.RPAREN);
    }
}
