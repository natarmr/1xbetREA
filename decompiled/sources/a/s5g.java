package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class s5g implements v5g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f31651a;

    public final boolean equals(Object obj) {
        if (obj instanceof s5g) {
            return this.f31651a.equals(((s5g) obj).f31651a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31651a.hashCode();
    }

    public final String toString() {
        return hne.o("Teams(value=", Separators.RPAREN, this.f31651a);
    }
}
