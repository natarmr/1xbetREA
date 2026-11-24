package a;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p24 {
    public static final p24 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26233a;
    public final int b;
    public final f4x c;

    static {
        p24 p24Var;
        if (Build.VERSION.SDK_INT >= 33) {
            e4x e4xVar = new e4x(4);
            for (int i = 1; i <= 10; i++) {
                e4xVar.b(Integer.valueOf(vtt0.p(i)));
            }
            p24Var = new p24(2, e4xVar.g());
        } else {
            p24Var = new p24(2, 10);
        }
        d = p24Var;
    }

    public p24(int i, Set set) {
        this.f26233a = i;
        f4x f4xVarM = f4x.m(set);
        this.c = f4xVarM;
        eet0 it = f4xVarM.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p24)) {
            return false;
        }
        p24 p24Var = (p24) obj;
        return this.f26233a == p24Var.f26233a && this.b == p24Var.b && Objects.equals(this.c, p24Var.c);
    }

    public final int hashCode() {
        int i = ((this.f26233a * 31) + this.b) * 31;
        f4x f4xVar = this.c;
        return i + (f4xVar == null ? 0 : f4xVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f26233a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public p24(int i, int i2) {
        this.f26233a = i;
        this.b = i2;
        this.c = null;
    }
}
