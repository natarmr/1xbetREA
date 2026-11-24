package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class crt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kki f4861a;

    public /* synthetic */ crt(kki kkiVar) {
        this.f4861a = kkiVar;
    }

    public i89 a() {
        return new i89(((o0j) this.f4861a.c).c, (byte) 22);
    }

    public void b(int i, long j) {
        p7m0 p7m0Var = ((o0j) this.f4861a.c).b;
        if (Intrinsics.d(p7m0Var.getValue(), tmt0.f34212a)) {
            return;
        }
        p7m0Var.o(null, new umt0(j, i));
    }
}
