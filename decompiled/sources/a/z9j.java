package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z9j implements haj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44022a;
    public final String b;
    public final a4x c;

    public z9j(a4x a4xVar, String str, String str2) {
        w6x.x(a4xVar, str, str2);
        this.f44022a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9j)) {
            return false;
        }
        z9j z9jVar = (z9j) obj;
        return Intrinsics.d(this.f44022a, z9jVar.f44022a) && Intrinsics.d(this.b, z9jVar.b) && Intrinsics.d(this.c, z9jVar.c);
    }

    @Override // a.haj
    public final jaj getType() {
        return jaj.HOSTS_VS_GUESTS;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f44022a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("HostVsGuest(hostsName=", this.f44022a, ", guestsName=", this.b, ", infoList="), this.c, Separators.RPAREN);
    }
}
