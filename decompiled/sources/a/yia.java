package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yia implements zia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42678a;

    public yia(String str) {
        str.getClass();
        this.f42678a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yia) && Intrinsics.d(this.f42678a, ((yia) obj).f42678a);
    }

    public final int hashCode() {
        return this.f42678a.hashCode();
    }

    public final String toString() {
        return kng0.l("OptionBetEachWay(text=", this.f42678a, Separators.RPAREN);
    }
}
