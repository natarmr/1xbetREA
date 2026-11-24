package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vw8 implements xw8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38136a;

    public vw8(iun iunVar) {
        iunVar.getClass();
        this.f38136a = iunVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw8) && Intrinsics.d(this.f38136a, ((vw8) obj).f38136a);
    }

    public final int hashCode() {
        return this.f38136a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f38136a, "Content(selectedLanguages=", Separators.RPAREN);
    }
}
