package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class el70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7984a;
    public final /* synthetic */ hl70 b;

    public /* synthetic */ el70(hl70 hl70Var, byte b) {
        this.f7984a = b;
        this.b = hl70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7984a;
        hl70 hl70Var = this.b;
        switch (b) {
            case 0:
                fl70 fl70Var = hl70.Q1;
                return new ko60(hl70Var, (byte) 5);
            default:
                fl70 fl70Var2 = hl70.Q1;
                ol70 ol70Var = (ol70) hl70Var.O1.getValue();
                if (!ol70Var.f.a() || ol70Var.i.a()) {
                    ol70Var.w(gle.f11486a);
                }
                return Unit.f46060a;
        }
    }
}
