package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p3m0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26306a;
    public final /* synthetic */ dp20 b;

    public /* synthetic */ p3m0(dp20 dp20Var, byte b) {
        this.f26306a = b;
        this.b = dp20Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        w6k w6kVar = (w6k) obj;
        switch (this.f26306a) {
            case 0:
                w6kVar.getClass();
                return new adl(this.b.b(r3m0.c));
            default:
                w6kVar.getClass();
                return new adl(this.b.b(r3m0.b));
        }
    }
}
