package a;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class sti0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7s0 f32774a;

    public sti0(p7s0 p7s0Var) {
        this.f32774a = p7s0Var;
    }

    public final void a(boolean z, long j) {
        p7m0 p7m0Var = this.f32774a.f26522a;
        p7m0Var.n(xp20.k((Map) p7m0Var.getValue(), new Pair(Long.valueOf(j), Boolean.valueOf(z))));
    }
}
