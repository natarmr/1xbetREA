package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ahz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wgz f899a;
    public final a4x b;
    public final boolean c;

    public ahz(wgz wgzVar, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f899a = wgzVar;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahz)) {
            return false;
        }
        ahz ahzVar = (ahz) obj;
        return Intrinsics.d(this.f899a, ahzVar.f899a) && Intrinsics.d(this.b, ahzVar.b) && this.c == ahzVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f899a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardScreenStateUiModel(contentState=");
        sb.append(this.f899a);
        sb.append(", itemsList=");
        sb.append(this.b);
        sb.append(", loading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }

    public ahz(vgz vgzVar) {
        this(vgzVar, lak0.c, false);
    }
}
