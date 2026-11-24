package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h4l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12438a;

    public final boolean equals(Object obj) {
        if (obj instanceof h4l) {
            return this.f12438a.equals(((h4l) obj).f12438a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12438a.hashCode();
    }

    public final String toString() {
        return hne.o("HeroesItem(value=", Separators.RPAREN, this.f12438a);
    }
}
