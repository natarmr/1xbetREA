package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ud9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35466a;
    public final m0x b;

    public ud9(m0x m0xVar, String str) {
        this.f35466a = str;
        this.b = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud9)) {
            return false;
        }
        ud9 ud9Var = (ud9) obj;
        return Intrinsics.d(this.f35466a, ud9Var.f35466a) && this.b.equals(ud9Var.b);
    }

    public final int hashCode() {
        String str = this.f35466a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ButtonAllUiModel(title=" + this.f35466a + ", icon=" + this.b + Separators.RPAREN;
    }
}
