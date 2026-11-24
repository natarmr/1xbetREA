package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class spo implements tpo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32597a;

    public final boolean equals(Object obj) {
        if (obj instanceof spo) {
            return this.f32597a.equals(((spo) obj).f32597a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32597a.hashCode();
    }

    public final String toString() {
        return hne.o("Events(value=", Separators.RPAREN, this.f32597a);
    }
}
