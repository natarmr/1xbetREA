package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eoz implements foz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8160a;

    public final boolean equals(Object obj) {
        if (obj instanceof eoz) {
            return this.f8160a.equals(((eoz) obj).f8160a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8160a.hashCode();
    }

    public final String toString() {
        return kng0.l("Title(value=", this.f8160a, Separators.RPAREN);
    }
}
