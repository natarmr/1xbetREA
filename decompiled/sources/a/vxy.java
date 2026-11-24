package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vxy {
    public static final vxy c = new vxy(-1, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38222a;
    public final boolean b;

    public vxy(int i, boolean z) {
        this.f38222a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxy)) {
            return false;
        }
        vxy vxyVar = (vxy) obj;
        return this.f38222a == vxyVar.f38222a && this.b == vxyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f38222a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f38222a, "LastChatMessageInfo(id=", ", clientMessage=", Separators.RPAREN, this.b);
    }
}
