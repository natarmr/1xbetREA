package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vue implements zue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38044a;

    public vue(ArrayList arrayList) {
        this.f38044a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vue) && this.f38044a.equals(((vue) obj).f38044a);
    }

    public final int hashCode() {
        return this.f38044a.hashCode();
    }

    public final String toString() {
        return hne.o("BetsOnFavoriteEventsConfiguredModel(betsOnFavoriteEvents=", Separators.RPAREN, this.f38044a);
    }
}
