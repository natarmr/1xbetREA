package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zf70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44289a;
    public final /* synthetic */ dg70 b;

    public /* synthetic */ zf70(dg70 dg70Var, byte b) {
        this.f44289a = b;
        this.b = dg70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44289a;
        dg70 dg70Var = this.b;
        switch (b) {
            case 0:
                dg70.H0(dg70Var);
                return Unit.f46060a;
            default:
                xuz xuzVar = dg70.Q1;
                return new ko60(dg70Var, (byte) 2);
        }
    }
}
