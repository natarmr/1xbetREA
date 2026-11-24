package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wpp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f39554a;
    public final List b;

    public wpp0(btk0 btk0Var, List list) {
        list.getClass();
        this.f39554a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpp0)) {
            return false;
        }
        wpp0 wpp0Var = (wpp0) obj;
        return this.f39554a.equals(wpp0Var.f39554a) && Intrinsics.d(this.b, wpp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39554a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("TeamsLiveGamesStateModel(contentStatus=", this.f39554a, ", content=", this.b, Separators.RPAREN);
    }
}
