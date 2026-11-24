package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class s4l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f31612a;

    public final boolean equals(Object obj) {
        if (obj instanceof s4l) {
            return this.f31612a.equals(((s4l) obj).f31612a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31612a.hashCode();
    }

    public final String toString() {
        return hne.o("Skills(value=", Separators.RPAREN, this.f31612a);
    }
}
