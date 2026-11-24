package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dsv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6632a;
    public final sip b;
    public final boolean c;

    public dsv(String str, sip sipVar, boolean z) {
        str.getClass();
        this.f6632a = str;
        this.b = sipVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsv)) {
            return false;
        }
        dsv dsvVar = (dsv) obj;
        return Intrinsics.d(this.f6632a, dsvVar.f6632a) && this.b == dsvVar.b && this.c == dsvVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f6632a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderSwitchTabUiModel(title=");
        sb.append(this.f6632a);
        sb.append(", feedKind=");
        sb.append(this.b);
        sb.append(", active=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
