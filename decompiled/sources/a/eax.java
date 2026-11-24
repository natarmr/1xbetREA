package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class eax implements jax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7490a;
    public final String b;
    public final a4x c;

    public eax(a4x a4xVar, String str, String str2) {
        dja djaVar = dja.PENALTY;
        w6x.x(a4xVar, str, str2);
        this.f7490a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eax)) {
            return false;
        }
        eax eaxVar = (eax) obj;
        dja djaVar = dja.PENALTY;
        return Intrinsics.d(this.f7490a, eaxVar.f7490a) && Intrinsics.d(this.b, eaxVar.b) && Intrinsics.d(this.c, eaxVar.c);
    }

    @Override // a.jax
    public final dja getType() {
        return dja.HOSTS_AND_GUESTS;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(ua80.b(dja.HOSTS_AND_GUESTS.hashCode() * 31, 31, this.f7490a), 31, this.b);
    }

    public final String toString() {
        return "HostVsGuest(type=" + dja.HOSTS_AND_GUESTS + ", hostsName=" + this.f7490a + ", guestsName=" + this.b + ", infoList=" + this.c + Separators.RPAREN;
    }
}
