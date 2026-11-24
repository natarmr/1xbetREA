package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class s7l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f31755a;

    public final boolean equals(Object obj) {
        if (obj instanceof s7l) {
            return this.f31755a.equals(((s7l) obj).f31755a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31755a.hashCode();
    }

    public final String toString() {
        return hne.o("DireSelectedHeroes(value=", Separators.RPAREN, this.f31755a);
    }
}
