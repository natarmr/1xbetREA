package a;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class gy90 {
    public static final ew3 q = new ew3((byte) 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12117a;
    public final ey90 b;
    public final SparseArray c;
    public final boolean d;
    public final czj e;
    public final l9o0 f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final veu0 i;
    public tyc j = new tyc((byte) 7);
    public q9o0 k;
    public Pair l;
    public int m;
    public byte n;
    public long o;
    public int p;

    public gy90(by90 by90Var) {
        this.f12117a = by90Var.f3406a;
        ey90 ey90Var = by90Var.c;
        ey90Var.getClass();
        this.b = ey90Var;
        this.c = new SparseArray();
        v3x v3xVar = b4x.b;
        rcf0 rcf0Var = rcf0.e;
        this.d = by90Var.d;
        l9o0 l9o0Var = by90Var.e;
        this.f = l9o0Var;
        long j = by90Var.g;
        this.h = j != -9223372036854775807L ? -j : -9223372036854775807L;
        veu0 veu0Var = by90Var.h;
        this.i = veu0Var;
        this.e = new czj(by90Var.b, veu0Var, l9o0Var);
        this.g = new CopyOnWriteArraySet();
        new androidx.media3.common.b(new awq());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = (byte) 0;
    }
}
