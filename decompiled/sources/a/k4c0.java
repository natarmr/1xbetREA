package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class k4c0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17662a;

    public final boolean equals(Object obj) {
        if (obj instanceof k4c0) {
            return this.f17662a.equals(((k4c0) obj).f17662a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17662a.hashCode();
    }

    public final String toString() {
        return hne.o("PromoList(value=", Separators.RPAREN, this.f17662a);
    }
}
