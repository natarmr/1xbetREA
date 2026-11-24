package a;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tom0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34292a;
    public final wcf0 b;
    public final wcf0 c;
    public final wcf0 d;

    public tom0(String str, HashMap map, HashMap map2, HashMap map3) {
        this.f34292a = str;
        this.b = wcf0.b(map);
        this.c = wcf0.b(map2);
        this.d = wcf0.b(map3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tom0)) {
            return false;
        }
        tom0 tom0Var = (tom0) obj;
        return Objects.equals(this.f34292a, tom0Var.f34292a) && this.b.equals(tom0Var.b) && this.c.equals(tom0Var.c) && this.d.equals(tom0Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.f34292a, this.b, this.c, this.d);
    }
}
