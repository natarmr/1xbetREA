package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class l7j implements m7j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19561a;

    public l7j(ArrayList arrayList) {
        this.f19561a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7j) && this.f19561a.equals(((l7j) obj).f19561a);
    }

    public final int hashCode() {
        return this.f19561a.hashCode();
    }

    public final String toString() {
        return hne.o("SetDailyTournamentItem(listDailyTournamentItem=", Separators.RPAREN, this.f19561a);
    }
}
