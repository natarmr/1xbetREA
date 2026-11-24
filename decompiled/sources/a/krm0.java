package a;

import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class krm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18773a;
    public final Size b;
    public final int c;
    public final String d;
    public final if80 e;
    public final hf80 f;
    public final jf80 g;
    public final m2a h;
    public final kf80 i;
    public f3a j;

    public krm0(int i, int i2, m2a m2aVar, hf80 hf80Var, if80 if80Var, jf80 jf80Var, kf80 kf80Var, Size size, String str) {
        size.getClass();
        str.getClass();
        this.f18773a = i;
        this.b = size;
        this.c = i2;
        this.d = str;
        this.e = if80Var;
        this.f = hf80Var;
        this.g = jf80Var;
        this.h = m2aVar;
        this.i = kf80Var;
    }

    public final boolean a() {
        kf80 kf80Var;
        jf80 jf80Var = this.g;
        if (jf80Var == null) {
            return true;
        }
        long j = jf80Var.f16412a;
        if (jf80.a(j, 0L) || jf80.a(j, 1L) || jf80.a(j, 3L) || (kf80Var = this.i) == null) {
            return true;
        }
        long j2 = kf80Var.f18185a;
        return kf80.a(j2, 0L) || kf80.a(j2, 1L);
    }

    public final String toString() {
        return twn.m(this.f18773a, "Output-");
    }
}
