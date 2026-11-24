package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class it60 implements tt60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15341a;

    public it60(String str) {
        this.f15341a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof it60) && Intrinsics.d(this.f15341a, ((it60) obj).f15341a);
    }

    public final int hashCode() {
        String str = this.f15341a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("OnFirstGameClick(loadedImageUrl=", this.f15341a, Separators.RPAREN);
    }
}
