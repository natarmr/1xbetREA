package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h5w implements j5w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3w f12501a;

    public h5w(n3w n3wVar) {
        n3wVar.getClass();
        this.f12501a = n3wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5w) && Intrinsics.d(this.f12501a, ((h5w) obj).f12501a);
    }

    public final int hashCode() {
        return this.f12501a.hashCode();
    }

    public final String toString() {
        return "ShowQuickSale(item=" + this.f12501a + Separators.RPAREN;
    }
}
