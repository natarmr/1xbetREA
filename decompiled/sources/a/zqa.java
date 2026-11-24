package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zqa implements ara {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44799a;

    public zqa(String str) {
        dja djaVar = dja.PENALTY;
        str.getClass();
        this.f44799a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqa)) {
            return false;
        }
        dja djaVar = dja.PENALTY;
        return Intrinsics.d(this.f44799a, ((zqa) obj).f44799a);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.BROADCASTING_ZONE;
    }

    public final int hashCode() {
        return this.f44799a.hashCode() + (dja.BROADCASTING_ZONE.hashCode() * 31);
    }

    public final String toString() {
        return "PlaysHolderPip(type=" + dja.BROADCASTING_ZONE + ", description=" + this.f44799a + Separators.RPAREN;
    }
}
