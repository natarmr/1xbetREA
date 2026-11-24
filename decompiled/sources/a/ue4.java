package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ue4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35507a;
    public final /* synthetic */ wpq b;
    public final /* synthetic */ pkk0 c;
    public final /* synthetic */ ze4 d;

    public /* synthetic */ ue4(wpq wpqVar, pkk0 pkk0Var, ze4 ze4Var, byte b) {
        this.f35507a = b;
        this.b = wpqVar;
        this.c = pkk0Var;
        this.d = ze4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35507a;
        ze4 ze4Var = this.d;
        pkk0 pkk0Var = this.c;
        wpq wpqVar = this.b;
        switch (b) {
            case 0:
                qek0 qek0Var = ze4.g2;
                ((ypq) wpqVar).b(false);
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                ze4Var.K0().x(be4.f2429a);
                break;
            default:
                qek0 qek0Var2 = ze4.g2;
                ((ypq) wpqVar).b(false);
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                ze4Var.K0().x(je4.f16355a);
                break;
        }
        return Unit.f46060a;
    }
}
