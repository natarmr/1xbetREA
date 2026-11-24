package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w1g0 implements d2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38397a;

    public w1g0(List list) {
        list.getClass();
        this.f38397a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1g0) && Intrinsics.d(this.f38397a, ((w1g0) obj).f38397a);
    }

    public final int hashCode() {
        return this.f38397a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f38397a, "UpdateGameList(gameList=", Separators.RPAREN);
    }
}
