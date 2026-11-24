package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ndb extends odb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23331a;
    public final String b;

    public ndb(long j, String str) {
        str.getClass();
        this.f23331a = j;
        this.b = str;
    }

    @Override // a.odb
    public final long a() {
        return this.f23331a;
    }

    @Override // a.odb
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndb)) {
            return false;
        }
        ndb ndbVar = (ndb) obj;
        return this.f23331a == ndbVar.f23331a && Intrinsics.d(this.b, ndbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f23331a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f23331a, "ChampTitleItem(id=", ", title=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
