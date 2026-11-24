package a;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class wq30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39571a;
    public final xq30 b;
    public final v0 c;
    public final z3 d;
    public final int e;
    public final int f;
    public final i4d0 g;

    public /* synthetic */ wq30(xq30 xq30Var, v0 v0Var, z3 z3Var, int i, int i2, i4d0 i4d0Var, byte b) {
        this.f39571a = b;
        this.b = xq30Var;
        this.c = v0Var;
        this.d = z3Var;
        this.e = i;
        this.f = i2;
        this.g = i4d0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39571a;
        xq30 xq30Var = this.b;
        switch (b) {
            case 0:
                return CollectionsKt.L0(((m83) ((f6i) xq30Var.f41296a.f10647a).g).o(this.c, this.d, this.e, this.f, this.g));
            default:
                return CollectionsKt.L0(((m83) ((f6i) xq30Var.f41296a.f10647a).g).m(this.c, this.d, this.e, this.f, this.g));
        }
    }
}
