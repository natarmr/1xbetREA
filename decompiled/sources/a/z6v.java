package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class z6v implements b7v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43888a;

    public z6v(ArrayList arrayList) {
        this.f43888a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6v) && this.f43888a.equals(((z6v) obj).f43888a);
    }

    public final int hashCode() {
        return this.f43888a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(bonuses=", Separators.RPAREN, this.f43888a);
    }
}
