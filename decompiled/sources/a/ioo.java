package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ioo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final paj f15127a;
    public final paj b;
    public final tdq c;

    public ioo(paj pajVar, paj pajVar2, tdq tdqVar) {
        this.f15127a = pajVar;
        this.b = pajVar2;
        this.c = tdqVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ioo)) {
            return false;
        }
        ioo iooVar = (ioo) obj;
        return Objects.equals(this.f15127a, iooVar.f15127a) && Objects.equals(this.b, iooVar.b) && Objects.equals(this.c, iooVar.c);
    }

    public final int hashCode() {
        return Objects.hashCode(this.c) ^ (Objects.hashCode(this.f15127a) ^ Objects.hashCode(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f15127a);
        sb.append(" , ");
        sb.append(this.b);
        sb.append(" : ");
        tdq tdqVar = this.c;
        sb.append(tdqVar == null ? "null" : Integer.valueOf(tdqVar.f33781a));
        sb.append(" ]");
        return sb.toString();
    }
}
