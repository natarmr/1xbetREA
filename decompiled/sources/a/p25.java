package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p25 extends h9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9f f26235a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final g9f e;
    public final List f;
    public final int g;

    public p25(f9f f9fVar, List list, List list2, Boolean bool, g9f g9fVar, List list3, int i) {
        this.f26235a = f9fVar;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = g9fVar;
        this.f = list3;
        this.g = i;
    }

    @Override // a.h9f
    public final o25 a() {
        o25 o25Var = new o25();
        o25Var.f24515a = this.f26235a;
        o25Var.b = this.b;
        o25Var.c = this.c;
        o25Var.d = this.d;
        o25Var.e = this.e;
        o25Var.f = this.f;
        o25Var.g = this.g;
        o25Var.h = (byte) 1;
        return o25Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h9f) {
            p25 p25Var = (p25) ((h9f) obj);
            if (this.f26235a.equals(p25Var.f26235a)) {
                List list = p25Var.b;
                List list2 = this.b;
                if (list2 != null ? list2.equals(list) : list == null) {
                    List list3 = p25Var.c;
                    List list4 = this.c;
                    if (list4 != null ? list4.equals(list3) : list3 == null) {
                        Boolean bool = p25Var.d;
                        Boolean bool2 = this.d;
                        if (bool2 != null ? bool2.equals(bool) : bool == null) {
                            g9f g9fVar = p25Var.e;
                            g9f g9fVar2 = this.e;
                            if (g9fVar2 != null ? g9fVar2.equals(g9fVar) : g9fVar == null) {
                                List list5 = p25Var.f;
                                List list6 = this.f;
                                if (list6 != null ? list6.equals(list5) : list5 == null) {
                                    if (this.g == p25Var.g) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f26235a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        g9f g9fVar = this.e;
        int iHashCode5 = (iHashCode4 ^ (g9fVar == null ? 0 : g9fVar.hashCode())) * 1000003;
        List list3 = this.f;
        return this.g ^ ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f26235a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return rz4.j(this.g, "}", sb);
    }
}
