package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class fqa extends gqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9964a;

    public fqa(ArrayList arrayList) {
        this.f9964a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fqa) && this.f9964a.equals(((fqa) obj).f9964a);
    }

    public final int hashCode() {
        return this.f9964a.hashCode();
    }

    public final String toString() {
        return hne.o("InfoListChanged(infoList=", Separators.RPAREN, this.f9964a);
    }
}
