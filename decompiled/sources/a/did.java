package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class did implements vid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6132a;

    public did(List list) {
        list.getClass();
        this.f6132a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof did) && Intrinsics.d(this.f6132a, ((did) obj).f6132a);
    }

    public final int hashCode() {
        return this.f6132a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f6132a, "UpdateGameList(gameList=", Separators.RPAREN);
    }
}
