package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s25 extends b9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31485a;
    public final String b;
    public final List c;
    public final b9f d;
    public final int e;

    public s25(String str, String str2, List list, b9f b9fVar, int i) {
        this.f31485a = str;
        this.b = str2;
        this.c = list;
        this.d = b9fVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b9f) {
            s25 s25Var = (s25) ((b9f) obj);
            if (this.f31485a.equals(s25Var.f31485a)) {
                String str = s25Var.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c.equals(s25Var.c)) {
                        b9f b9fVar = s25Var.d;
                        b9f b9fVar2 = this.d;
                        if (b9fVar2 != null ? b9fVar2.equals(b9fVar) : b9fVar == null) {
                            if (this.e == s25Var.e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f31485a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        b9f b9fVar = this.d;
        return this.e ^ ((iHashCode2 ^ (b9fVar != null ? b9fVar.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f31485a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return rz4.j(this.e, "}", sb);
    }
}
