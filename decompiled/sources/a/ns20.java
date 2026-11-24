package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ns20 implements rs20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24034a;

    public ns20(String str) {
        str.getClass();
        this.f24034a = str;
    }

    @Override // a.rs20
    public final long a() {
        return -27L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ns20) && Intrinsics.d(this.f24034a, ((ns20) obj).f24034a);
    }

    @Override // a.rs20
    public final String getName() {
        return this.f24034a;
    }

    public final int hashCode() {
        return this.f24034a.hashCode() + (Long.hashCode(-27L) * 31);
    }

    @Override // a.rs20
    public final boolean isSelected() {
        return false;
    }

    public final String toString() {
        return kng0.l("BetsOnPlayers(marketTypeId=-27, name=", this.f24034a, Separators.RPAREN);
    }
}
