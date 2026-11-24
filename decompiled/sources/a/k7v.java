package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class k7v implements m7v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17842a;

    public k7v(ArrayList arrayList) {
        this.f17842a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7v) && this.f17842a.equals(((k7v) obj).f17842a);
    }

    public final int hashCode() {
        return this.f17842a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(freeSpins=", Separators.RPAREN, this.f17842a);
    }
}
