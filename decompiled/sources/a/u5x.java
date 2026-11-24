package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class u5x implements x5x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f35115a;

    public final boolean equals(Object obj) {
        if (obj instanceof u5x) {
            return this.f35115a.equals(((u5x) obj).f35115a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35115a.hashCode();
    }

    public final String toString() {
        return hne.o("SecondPlayerCards(value=", Separators.RPAREN, this.f35115a);
    }
}
