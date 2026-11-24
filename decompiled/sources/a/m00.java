package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20929a;
    public final /* synthetic */ d280 b;

    public /* synthetic */ m00(d280 d280Var, byte b) {
        this.f20929a = b;
        this.b = d280Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f20929a;
        d280 d280Var = this.b;
        switch (b) {
            case 0:
                return new u6n(d4d.STATIC_WHITE60, w6n.f, d280Var);
            case 1:
                return new u6n(d4d.SECONDARY, w6n.f, d280Var);
            default:
                return new u6n(d4d.STATIC_WHITE60, w6n.h, d280Var);
        }
    }
}
