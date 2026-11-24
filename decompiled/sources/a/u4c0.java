package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class u4c0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f35039a;

    public final boolean equals(Object obj) {
        if (obj instanceof u4c0) {
            return this.f35039a.equals(((u4c0) obj).f35039a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35039a.hashCode();
    }

    public final String toString() {
        return hne.o("PromoList(value=", Separators.RPAREN, this.f35039a);
    }
}
