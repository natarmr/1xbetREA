package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class rfj implements yfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f30390a;

    public rfj(ArrayList arrayList) {
        this.f30390a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfj) && this.f30390a.equals(((rfj) obj).f30390a);
    }

    public final int hashCode() {
        return this.f30390a.hashCode();
    }

    public final String toString() {
        return hne.o("UpdateEvents(items=", Separators.RPAREN, this.f30390a);
    }
}
