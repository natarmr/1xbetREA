package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class idt implements odt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14602a;

    public idt(List list) {
        list.getClass();
        this.f14602a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idt) && Intrinsics.d(this.f14602a, ((idt) obj).f14602a);
    }

    public final int hashCode() {
        return this.f14602a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f14602a, "Loaded(items=", Separators.RPAREN);
    }
}
