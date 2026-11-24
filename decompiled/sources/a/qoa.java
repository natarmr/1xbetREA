package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qoa implements soa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29064a;

    public qoa(String str) {
        dja djaVar = dja.PENALTY;
        str.getClass();
        this.f29064a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qoa)) {
            return false;
        }
        dja djaVar = dja.PENALTY;
        return Intrinsics.d(this.f29064a, ((qoa) obj).f29064a);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.BROADCASTING_VIDEO;
    }

    public final int hashCode() {
        return this.f29064a.hashCode() + (dja.BROADCASTING_VIDEO.hashCode() * 31);
    }

    public final String toString() {
        return "PlaysHolder(type=" + dja.BROADCASTING_VIDEO + ", description=" + this.f29064a + Separators.RPAREN;
    }
}
