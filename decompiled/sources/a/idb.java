package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class idb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fhb f14576a;
    public final List b;

    public idb(fhb fhbVar, List list) {
        fhbVar.getClass();
        list.getClass();
        this.f14576a = fhbVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idb)) {
            return false;
        }
        idb idbVar = (idb) obj;
        return Intrinsics.d(this.f14576a, idbVar.f14576a) && Intrinsics.d(this.b, idbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14576a.hashCode() * 31);
    }

    public final String toString() {
        return "ChampInfoContainer(champ=" + this.f14576a + ", gameEventModels=" + this.b + Separators.RPAREN;
    }
}
