package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class z8e implements b9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43962a;

    public z8e(ArrayList arrayList) {
        this.f43962a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8e) && this.f43962a.equals(((z8e) obj).f43962a);
    }

    public final int hashCode() {
        return this.f43962a.hashCode();
    }

    public final String toString() {
        return hne.o("Images(items=", Separators.RPAREN, this.f43962a);
    }
}
