package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d58 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5492a;
    public final CharSequence b;

    public d58(int i, CharSequence charSequence) {
        this.f5492a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d58)) {
            return false;
        }
        d58 d58Var = (d58) obj;
        if (this.f5492a != d58Var.f5492a) {
            return false;
        }
        CharSequence charSequence = d58Var.b;
        CharSequence charSequence2 = this.b;
        String string = charSequence2 != null ? charSequence2.toString() : null;
        String string2 = charSequence != null ? charSequence.toString() : null;
        if (string == null && string2 == null) {
            return true;
        }
        return string != null && string.equals(string2);
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f5492a);
        CharSequence charSequence = this.b;
        return Arrays.hashCode(new Object[]{numValueOf, charSequence != null ? charSequence.toString() : null});
    }
}
