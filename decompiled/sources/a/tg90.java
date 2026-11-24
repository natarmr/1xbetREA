package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tg90 extends ug90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33899a;

    public tg90(String str) {
        str.getClass();
        this.f33899a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tg90) && Intrinsics.d(this.f33899a, ((tg90) obj).f33899a);
    }

    public final int hashCode() {
        return this.f33899a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShouldShowRationale(permission=", this.f33899a, Separators.RPAREN);
    }
}
