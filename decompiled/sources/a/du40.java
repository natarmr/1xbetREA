package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class du40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6683a;
    public final /* synthetic */ q99 b;

    public /* synthetic */ du40(q99 q99Var, byte b) {
        this.f6683a = b;
        this.b = q99Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6683a;
        q99 q99Var = this.b;
        switch (b) {
            case 0:
                return (eu40) ztb.b(q99Var.j());
            default:
                return (mds0) ztb.b(q99Var.j());
        }
    }
}
