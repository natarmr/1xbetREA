package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w7q implements e8q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38687a;
    public final boolean b;

    public w7q(List list, boolean z) {
        list.getClass();
        this.f38687a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7q)) {
            return false;
        }
        w7q w7qVar = (w7q) obj;
        return Intrinsics.d(this.f38687a, w7qVar.f38687a) && this.b == w7qVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f38687a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenInstrumentsDialog(instruments=" + this.f38687a + ", force=" + this.b + Separators.RPAREN;
    }
}
