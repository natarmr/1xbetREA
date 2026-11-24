package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vnf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37716a;
    public final String b;

    public vnf(String str, String str2) {
        str2.getClass();
        this.f37716a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnf)) {
            return false;
        }
        vnf vnfVar = (vnf) obj;
        return this.f37716a.equals(vnfVar.f37716a) && Intrinsics.d(this.b, vnfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37716a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Team(teamImage=", this.f37716a, ", teamName=", this.b, Separators.RPAREN);
    }
}
