package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rj0 implements jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30567a;

    public rj0(List list) {
        list.getClass();
        this.f30567a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rj0) && Intrinsics.d(this.f30567a, ((rj0) obj).f30567a);
    }

    public final int hashCode() {
        return this.f30567a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f30567a, "UpdateTournamentsList(list=", Separators.RPAREN);
    }
}
