package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class hff implements kff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12970a;

    public hff(ArrayList arrayList) {
        this.f12970a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hff) && this.f12970a.equals(((hff) obj).f12970a);
    }

    public final int hashCode() {
        return this.f12970a.hashCode();
    }

    public final String toString() {
        return hne.o("NewField(newItems=", Separators.RPAREN, this.f12970a);
    }
}
