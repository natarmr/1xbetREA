package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hjw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yiw f13180a;
    public final a4x b;
    public final boolean c;

    public hjw(yiw yiwVar, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f13180a = yiwVar;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjw)) {
            return false;
        }
        hjw hjwVar = (hjw) obj;
        return Intrinsics.d(this.f13180a, hjwVar.f13180a) && Intrinsics.d(this.b, hjwVar.b) && this.c == hjwVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f13180a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeScreenStateUiModel(contentState=");
        sb.append(this.f13180a);
        sb.append(", itemList=");
        sb.append(this.b);
        sb.append(", loading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }

    public hjw(xiw xiwVar) {
        this(xiwVar, lak0.c, false);
    }
}
