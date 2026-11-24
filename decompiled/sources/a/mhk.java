package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class mhk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile kpd0 f21798a;

    static {
        ipd0 ipd0Var = ipd0.c;
        ipd0Var.f15158a.b(bnk.a(), new y1a(new jhk((byte) 2), (byte) 1));
    }

    public static final kpd0 a() {
        kpd0 kpd0Var = f21798a;
        if (kpd0Var != null) {
            return kpd0Var;
        }
        Intrinsics.h("all");
        throw null;
    }
}
