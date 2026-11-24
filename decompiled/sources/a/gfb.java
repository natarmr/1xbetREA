package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gfb implements hfb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11200a;
    public final List b;

    public gfb(List list, List list2) {
        list2.getClass();
        this.f11200a = list;
        this.b = list2;
    }

    @Override // a.ifb
    public final List a() {
        return this.b;
    }

    @Override // a.hfb
    public final List b() {
        return this.f11200a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfb)) {
            return false;
        }
        gfb gfbVar = (gfb) obj;
        return this.f11200a.equals(gfbVar.f11200a) && Intrinsics.d(this.b, gfbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11200a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("PlayOff(opponents=", ", games=", this.f11200a, Separators.RPAREN, this.b);
    }
}
