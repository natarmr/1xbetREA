package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jze implements kze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17408a;

    public jze(ArrayList arrayList) {
        this.f17408a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jze) && this.f17408a.equals(((jze) obj).f17408a);
    }

    public final int hashCode() {
        return this.f17408a.hashCode();
    }

    public final String toString() {
        return hne.o("ShowBetSystemTypesChangeDialog(couponTypes=", Separators.RPAREN, this.f17408a);
    }
}
