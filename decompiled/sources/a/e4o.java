package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e4o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3o f7192a;
    public final a4x b;
    public final boolean c;

    public e4o(p3o p3oVar, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f7192a = p3oVar;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4o)) {
            return false;
        }
        e4o e4oVar = (e4o) obj;
        return Intrinsics.d(this.f7192a, e4oVar.f7192a) && Intrinsics.d(this.b, e4oVar.b) && this.c == e4oVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f7192a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EsportsScreenStateUiModel(contentState=");
        sb.append(this.f7192a);
        sb.append(", gamesCards=");
        sb.append(this.b);
        sb.append(", isRefreshing=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }

    public e4o(o3o o3oVar, boolean z) {
        this(o3oVar, lak0.c, z);
    }
}
