package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bcs extends dcs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2367a;

    public bcs(List list) {
        list.getClass();
        this.f2367a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcs) && Intrinsics.d(this.f2367a, ((bcs) obj).f2367a);
    }

    public final int hashCode() {
        return this.f2367a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f2367a, "RestoreGameField(betsList=", Separators.RPAREN);
    }
}
