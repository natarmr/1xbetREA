package a;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t7a {
    public static final u15 f = new u15("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final u15 g = new u15("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final u15 h = new u15("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f33457a;
    public final b780 b;
    public final int c;
    public final List d;
    public final eoo0 e;

    public t7a(ArrayList arrayList, b780 b780Var, int i, ArrayList arrayList2, eoo0 eoo0Var) {
        this.f33457a = arrayList;
        this.b = b780Var;
        this.c = i;
        this.d = Collections.unmodifiableList(arrayList2);
        this.e = eoo0Var;
    }

    public final Range a() {
        Range range = (Range) this.b.e(h, h55.h);
        Objects.requireNonNull(range);
        return range;
    }
}
