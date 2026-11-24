package a;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class rwq extends giv {
    public static final Range d = new Range(30, 30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f31227a = 60;
    public final byte b = 60;
    public final lhp c = lhp.b;

    @Override // a.giv
    public final lhp a() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FpsRangeFeature(minFps=");
        sb.append((int) this.f31227a);
        sb.append(", maxFps=");
        return brm0.n(sb, this.b, ')');
    }
}
