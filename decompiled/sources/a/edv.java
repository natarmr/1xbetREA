package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class edv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7638a;

    public edv(ArrayList arrayList) {
        this.f7638a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edv) && this.f7638a.equals(((edv) obj).f7638a);
    }

    public final int hashCode() {
        return this.f7638a.hashCode();
    }

    public final String toString() {
        return hne.o("OpenSeasonBottomSheet(seasonUiModelList=", Separators.RPAREN, this.f7638a);
    }
}
