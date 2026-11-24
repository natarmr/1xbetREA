package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c8m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f3920a;
    public final o7m b;

    public c8m(CharSequence charSequence, o7m o7mVar) {
        charSequence.getClass();
        this.f3920a = charSequence;
        this.b = o7mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8m)) {
            return false;
        }
        c8m c8mVar = (c8m) obj;
        return Intrinsics.d(this.f3920a, c8mVar.f3920a) && Intrinsics.d(this.b, c8mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3920a.hashCode() * 31);
    }

    public final String toString() {
        return "DsCyberHeaderUiModel(label=" + ((Object) this.f3920a) + ", buttonType=" + this.b + Separators.RPAREN;
    }
}
