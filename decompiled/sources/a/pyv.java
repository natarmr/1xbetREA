package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class pyv implements ryv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f27817a;

    public pyv(ArrayList arrayList) {
        this.f27817a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pyv) && this.f27817a.equals(((pyv) obj).f27817a);
    }

    public final int hashCode() {
        return this.f27817a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(items=", Separators.RPAREN, this.f27817a);
    }
}
