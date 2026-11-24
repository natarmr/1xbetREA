package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class roa implements soa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30827a;

    public roa(String str) {
        dja djaVar = dja.PENALTY;
        str.getClass();
        this.f30827a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roa)) {
            return false;
        }
        dja djaVar = dja.PENALTY;
        return Intrinsics.d(this.f30827a, ((roa) obj).f30827a);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.BROADCASTING_VIDEO;
    }

    public final int hashCode() {
        return this.f30827a.hashCode() + (dja.BROADCASTING_VIDEO.hashCode() * 31);
    }

    public final String toString() {
        return "PlaysHolderPip(type=" + dja.BROADCASTING_VIDEO + ", description=" + this.f30827a + Separators.RPAREN;
    }
}
