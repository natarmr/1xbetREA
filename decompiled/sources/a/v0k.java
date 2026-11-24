package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v0k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36584a;
    public final boolean b;
    public final String c;

    public v0k(String str, boolean z, String str2) {
        str.getClass();
        this.f36584a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0k)) {
            return false;
        }
        v0k v0kVar = (v0k) obj;
        return Intrinsics.d(this.f36584a, v0kVar.f36584a) && this.b == v0kVar.b && this.c.equals(v0kVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f36584a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(brm0.u("OnAddOrDeleteBetPush(betId=", this.f36584a, ", subscribed=", this.b, ", point="), this.c, Separators.RPAREN);
    }
}
