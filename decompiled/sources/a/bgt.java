package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bgt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2573a;
    public final List b;

    public bgt(String str, List list) {
        str.getClass();
        list.getClass();
        this.f2573a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgt)) {
            return false;
        }
        bgt bgtVar = (bgt) obj;
        return Intrinsics.d(this.f2573a, bgtVar.f2573a) && Intrinsics.d(this.b, bgtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2573a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("GenderChoiceUiState(title=", this.f2573a, ", items=", this.b, Separators.RPAREN);
    }
}
