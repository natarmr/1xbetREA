package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ohh0 implements whh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25264a;
    public final List b;

    public ohh0(String str, List list) {
        str.getClass();
        list.getClass();
        this.f25264a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohh0)) {
            return false;
        }
        ohh0 ohh0Var = (ohh0) obj;
        return Intrinsics.d(this.f25264a, ohh0Var.f25264a) && Intrinsics.d(this.b, ohh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25264a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("Loaded(query=", this.f25264a, ", items=", this.b, Separators.RPAREN);
    }
}
