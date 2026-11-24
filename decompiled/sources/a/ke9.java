package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ke9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18143a;
    public final m0x b;

    public ke9(m0x m0xVar, String str) {
        this.f18143a = str;
        this.b = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke9)) {
            return false;
        }
        ke9 ke9Var = (ke9) obj;
        return Intrinsics.d(this.f18143a, ke9Var.f18143a) && this.b.equals(ke9Var.b);
    }

    public final int hashCode() {
        String str = this.f18143a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ButtonFilterUiModel(title=" + this.f18143a + ", icon=" + this.b + Separators.RPAREN;
    }
}
