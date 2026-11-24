package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class r0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f29646a;
    public final ArrayList b;

    public r0s(ArrayList arrayList, ArrayList arrayList2) {
        this.f29646a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0s)) {
            return false;
        }
        r0s r0sVar = (r0s) obj;
        return this.f29646a.equals(r0sVar.f29646a) && this.b.equals(r0sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29646a.hashCode() * 31);
    }

    public final String toString() {
        return "GameCardsUiModel(matchInfoCardList=" + this.f29646a + ", compressedCardList=" + this.b + Separators.RPAREN;
    }
}
