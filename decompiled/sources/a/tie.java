package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class tie implements gje {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f34004a;

    public tie(ArrayList arrayList) {
        this.f34004a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tie) && this.f34004a.equals(((tie) obj).f34004a);
    }

    public final int hashCode() {
        return this.f34004a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(filterItems=", Separators.RPAREN, this.f34004a);
    }
}
