package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class puk extends ruk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f27621a;

    public puk(ArrayList arrayList) {
        this.f27621a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof puk) && this.f27621a.equals(((puk) obj).f27621a);
    }

    public final int hashCode() {
        return this.f27621a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(items=", Separators.RPAREN, this.f27621a);
    }
}
