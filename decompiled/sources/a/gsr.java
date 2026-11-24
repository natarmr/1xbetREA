package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class gsr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11844a;
    public final boolean b;

    public gsr(ArrayList arrayList, boolean z) {
        this.f11844a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsr)) {
            return false;
        }
        gsr gsrVar = (gsr) obj;
        return this.f11844a.equals(gsrVar.f11844a) && this.b == gsrVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f11844a.hashCode() * 31);
    }

    public final String toString() {
        return "GameBroadcastUiModel(broadcastCardList=" + this.f11844a + ", broadcastsExist=" + this.b + Separators.RPAREN;
    }
}
