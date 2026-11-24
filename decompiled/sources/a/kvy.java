package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class kvy implements mvy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18977a;

    public kvy(ArrayList arrayList) {
        this.f18977a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvy) && this.f18977a.equals(((kvy) obj).f18977a);
    }

    public final int hashCode() {
        return this.f18977a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(items=", Separators.RPAREN, this.f18977a);
    }
}
