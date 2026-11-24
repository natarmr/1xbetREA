package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rpa extends spa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f30876a;

    public rpa(ArrayList arrayList) {
        this.f30876a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rpa) && this.f30876a.equals(((rpa) obj).f30876a);
    }

    public final int hashCode() {
        return this.f30876a.hashCode();
    }

    public final String toString() {
        return hne.o("TeamTwoPenaltyListChanged(penaltyUiModelList=", Separators.RPAREN, this.f30876a);
    }
}
