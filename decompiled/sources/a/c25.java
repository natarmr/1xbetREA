package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c25 extends u8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3607a;
    public final String b;

    public c25(List list, String str) {
        this.f3607a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u8f)) {
            return false;
        }
        c25 c25Var = (c25) ((u8f) obj);
        if (!this.f3607a.equals(c25Var.f3607a)) {
            return false;
        }
        String str = c25Var.b;
        String str2 = this.b;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        int iHashCode = (this.f3607a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f3607a);
        sb.append(", orgId=");
        return axq.n(sb, this.b, "}");
    }
}
