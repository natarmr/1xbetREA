package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yqa implements ara {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43067a;

    public yqa(String str) {
        dja djaVar = dja.PENALTY;
        str.getClass();
        this.f43067a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqa)) {
            return false;
        }
        dja djaVar = dja.PENALTY;
        return Intrinsics.d(this.f43067a, ((yqa) obj).f43067a);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.BROADCASTING_ZONE;
    }

    public final int hashCode() {
        return this.f43067a.hashCode() + (dja.BROADCASTING_ZONE.hashCode() * 31);
    }

    public final String toString() {
        return "PlaysHolder(type=" + dja.BROADCASTING_ZONE + ", description=" + this.f43067a + Separators.RPAREN;
    }
}
