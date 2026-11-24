package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r4l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f29840a;

    public final boolean equals(Object obj) {
        if (obj instanceof r4l) {
            return this.f29840a.equals(((r4l) obj).f29840a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29840a.hashCode();
    }

    public final String toString() {
        return hne.o("HeroesItem(value=", Separators.RPAREN, this.f29840a);
    }
}
