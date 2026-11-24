package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f33348a = q7m0.a(w52.f38565a);

    public final List a() {
        y52 y52Var = (y52) this.f33348a.getValue();
        if (Intrinsics.d(y52Var, w52.f38565a)) {
            return iun.f15405a;
        }
        if (y52Var instanceof v52) {
            return iun.f15405a;
        }
        if (y52Var instanceof x52) {
            return ((x52) y52Var).f40292a;
        }
        t9f.b();
        return null;
    }
}
