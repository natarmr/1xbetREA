package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sde implements sie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej90 f32030a;
    public final String b;
    public final int c;

    public sde(ej90 ej90Var, String str, int i) {
        this.f32030a = ej90Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sde)) {
            return false;
        }
        sde sdeVar = (sde) obj;
        return this.f32030a == sdeVar.f32030a && this.b.equals(sdeVar.b) && this.c == sdeVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f32030a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentButtonItemUiModel(type=");
        sb.append(this.f32030a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", icon=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
