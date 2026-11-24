package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class u8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f35237a;

    public final boolean equals(Object obj) {
        if (obj instanceof u8l) {
            return this.f35237a.equals(((u8l) obj).f35237a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35237a.hashCode();
    }

    public final String toString() {
        return hne.o("MapHeroes(value=", Separators.RPAREN, this.f35237a);
    }
}
