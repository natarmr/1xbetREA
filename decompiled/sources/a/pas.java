package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26669a;
    public final Boolean b;

    public pas(List list, Boolean bool) {
        this.f26669a = list;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pas)) {
            return false;
        }
        pas pasVar = (pas) obj;
        return Intrinsics.d(this.f26669a, pasVar.f26669a) && Intrinsics.d(this.b, pasVar.b);
    }

    public final int hashCode() {
        List list = this.f26669a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "GameEventParamsModel(lastGameEvents=" + this.f26669a + ", lastAuthorized=" + this.b + Separators.RPAREN;
    }
}
