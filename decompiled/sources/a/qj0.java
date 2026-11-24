package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class qj0 implements jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28814a;

    public qj0(ArrayList arrayList) {
        this.f28814a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qj0) && this.f28814a.equals(((qj0) obj).f28814a);
    }

    public final int hashCode() {
        return this.f28814a.hashCode();
    }

    public final String toString() {
        return hne.o("UpdateRecommendedGamesList(list=", Separators.RPAREN, this.f28814a);
    }
}
