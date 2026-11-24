package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ejb0 implements kjb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7901a;

    public ejb0(String str) {
        str.getClass();
        this.f7901a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejb0) && Intrinsics.d(this.f7901a, ((ejb0) obj).f7901a);
    }

    public final int hashCode() {
        return this.f7901a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenMinAgeAlertDialog(message=", this.f7901a, Separators.RPAREN);
    }
}
