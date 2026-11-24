package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class dmg0 {
    public static final v0h0 e = new v0h0(new wtf0((byte) 22), new vtf0(22));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6322a;
    public final agk0 b;
    public Function0 c = new j6g0((byte) 17);
    public final xog d = new xog(this, (byte) 1);

    public dmg0(float f) {
        this.b = androidx.compose.runtime.e.a(f);
    }

    public final float a(float f) {
        float f2 = this.f6322a;
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        agk0 agk0Var = this.b;
        float fC = l1e0.c(agk0Var.l(), 0.0f, f2);
        float fC2 = l1e0.c(fC - f, 0.0f, f2);
        agk0Var.m(fC2);
        return fC - fC2;
    }
}
