package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g4l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10671a;

    public final boolean equals(Object obj) {
        if (obj instanceof g4l) {
            return this.f10671a.equals(((g4l) obj).f10671a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10671a.hashCode();
    }

    public final String toString() {
        return hne.o("Heroes(value=", Separators.RPAREN, this.f10671a);
    }
}
