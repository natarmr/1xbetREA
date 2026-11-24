package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pms0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27253a;
    public final /* synthetic */ oms0 b;

    public /* synthetic */ pms0(oms0 oms0Var, byte b) {
        this.f27253a = b;
        this.b = oms0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27253a;
        oms0 oms0Var = this.b;
        switch (b) {
            case 0:
                return new qms0(oms0Var, (byte) 0);
            default:
                return new qms0(oms0Var, (byte) 1);
        }
    }
}
