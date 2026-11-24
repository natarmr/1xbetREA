package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nz1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24354a;
    public final /* synthetic */ wz1 b;
    public final /* synthetic */ myr0 c;

    public /* synthetic */ nz1(wz1 wz1Var, myr0 myr0Var, byte b) {
        this.f24354a = b;
        this.b = wz1Var;
        this.c = myr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f24354a;
        myr0 myr0Var = this.c;
        wz1 wz1Var = this.b;
        switch (b) {
            case 0:
                String str = wz1.T;
                p7m0 p7m0Var = wz1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, dz1.a((dz1) value, false, false, false, null, false, null, Long.valueOf(myr0Var.f22617a), true, null, 2559)));
                break;
            case 1:
                String str2 = wz1.T;
                wz1Var.Q(myr0Var);
                break;
            default:
                String str3 = wz1.T;
                wz1Var.Q(myr0Var);
                break;
        }
        return Unit.f46060a;
    }
}
