package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ffb implements hfb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9441a;
    public final List b;

    public ffb(List list, List list2) {
        list2.getClass();
        this.f9441a = list;
        this.b = list2;
    }

    @Override // a.ifb
    public final List a() {
        return this.b;
    }

    @Override // a.hfb
    public final List b() {
        return this.f9441a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffb)) {
            return false;
        }
        ffb ffbVar = (ffb) obj;
        return this.f9441a.equals(ffbVar.f9441a) && Intrinsics.d(this.b, ffbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9441a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("Final(opponents=", ", games=", this.f9441a, Separators.RPAREN, this.b);
    }
}
