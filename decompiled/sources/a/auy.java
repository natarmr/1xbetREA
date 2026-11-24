package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class auy implements buy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1501a;

    public /* synthetic */ auy(String str) {
        this.f1501a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof auy) {
            return Intrinsics.d(this.f1501a, ((auy) obj).f1501a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1501a.hashCode();
    }

    public final String toString() {
        return kng0.l("Title(value=", this.f1501a, Separators.RPAREN);
    }
}
