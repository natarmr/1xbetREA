package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sro implements tro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32688a;
    public final List b;

    public sro(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f32688a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sro)) {
            return false;
        }
        sro sroVar = (sro) obj;
        return Intrinsics.d(this.f32688a, sroVar.f32688a) && Intrinsics.d(this.b, sroVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32688a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("Success(contentItems=", ", uiItems=", this.f32688a, Separators.RPAREN, this.b);
    }
}
