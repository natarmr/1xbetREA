package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class uty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36277a;
    public final String b;

    static {
        vtt0.H(0);
        vtt0.H(1);
    }

    public uty(String str, String str2) {
        this.f36277a = vtt0.N(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uty.class == obj.getClass()) {
            uty utyVar = (uty) obj;
            if (Objects.equals(this.f36277a, utyVar.f36277a) && Objects.equals(this.b, utyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.f36277a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{ lang=");
        sb.append(this.f36277a);
        sb.append(", '");
        return axq.n(sb, this.b, "' }");
    }
}
