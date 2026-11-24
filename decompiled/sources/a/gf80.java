package a;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class gf80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f11196a;
    public final int b;
    public final String c;
    public final if80 d;
    public final hf80 e;
    public final jf80 f;
    public final kf80 g;
    public final List h;

    public gf80(Size size, int i, String str, if80 if80Var, hf80 hf80Var, jf80 jf80Var, kf80 kf80Var, List list) {
        size.getClass();
        this.f11196a = size;
        this.b = i;
        this.c = str;
        this.d = if80Var;
        this.e = hf80Var;
        this.f = jf80Var;
        this.g = kf80Var;
        this.h = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(size=");
        sb.append(this.f11196a);
        sb.append(", format=");
        sb.append((Object) grm0.b(this.b));
        sb.append(", camera=");
        String str = this.c;
        sb.append((Object) (str == null ? "null" : g0a.b(str)));
        sb.append(", mirrorMode=");
        sb.append(this.d);
        sb.append(", timestampBase=null, dynamicRangeProfile=");
        sb.append(this.e);
        sb.append(", streamUseCase=");
        sb.append(this.f);
        sb.append(", streamUseHint=");
        sb.append(this.g);
        sb.append(", sensorPixelModes=");
        sb.append(this.h);
        sb.append(')');
        return sb.toString();
    }
}
