package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ddf implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5894a;
    public final /* synthetic */ c280 b;

    public /* synthetic */ ddf(c280 c280Var, byte b) {
        this.f5894a = b;
        this.b = c280Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5894a;
        c280 c280Var = this.b;
        switch (b) {
            case 0:
                return new u6n(d4d.SECONDARY60, w6n.j, c280Var);
            case 1:
                return new u6n(d4d.STATIC_WHITE60, w6n.h, c280Var);
            default:
                return new u6n(d4d.STATIC_WHITE60, w6n.h, c280Var);
        }
    }
}
