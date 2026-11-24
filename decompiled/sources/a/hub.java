package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hub extends fxw {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final fxw[] f;

    public hub(String str, boolean z, boolean z2, String[] strArr, fxw[] fxwVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = fxwVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hub.class != obj.getClass()) {
            return false;
        }
        hub hubVar = (hub) obj;
        return this.c == hubVar.c && this.d == hubVar.d && this.b.equals(hubVar.b) && Arrays.equals(this.e, hubVar.e) && Arrays.equals(this.f, hubVar.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
