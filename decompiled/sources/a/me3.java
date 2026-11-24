package a;

import android.graphics.Typeface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class me3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f21625a;
    public final String b;
    public final int c;

    public me3(Typeface typeface, String str, int i) {
        this.f21625a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof me3)) {
            return false;
        }
        me3 me3Var = (me3) obj;
        return this.c == me3Var.c && Objects.equals(this.f21625a, me3Var.f21625a) && Objects.equals(this.b, me3Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.f21625a, this.b, Integer.valueOf(this.c));
    }
}
