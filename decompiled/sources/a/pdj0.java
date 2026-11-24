package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pdj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qdj0 f26810a;
    public final String b;

    public pdj0(qdj0 qdj0Var, String str) {
        qdj0Var.getClass();
        this.f26810a = qdj0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdj0)) {
            return false;
        }
        pdj0 pdj0Var = (pdj0) obj;
        return Intrinsics.d(this.f26810a, pdj0Var.f26810a) && this.b.equals(pdj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26810a.hashCode() * 31);
    }

    public final String toString() {
        return "SettingsTipModel(screen=" + this.f26810a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
