package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jfj0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16430a;
    public final /* synthetic */ ofj0 b;

    public /* synthetic */ jfj0(ofj0 ofj0Var, byte b) {
        this.f16430a = b;
        this.b = ofj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16430a;
        ofj0 ofj0Var = this.b;
        switch (b) {
            case 0:
                cge0 cge0Var = ofj0.X1;
                fiu0 fiu0Var = ofj0Var.R1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                cge0 cge0Var2 = ofj0.X1;
                ofj0Var.H0().x(eyi0.f8631a);
                return Unit.f46060a;
            case 2:
                cge0 cge0Var3 = ofj0.X1;
                ofj0Var.H0().x(uyi0.f36491a);
                return Unit.f46060a;
            case 3:
                cge0 cge0Var4 = ofj0.X1;
                ofj0Var.H0().x(iyi0.f15591a);
                return Unit.f46060a;
            case 4:
                cge0 cge0Var5 = ofj0.X1;
                ofj0Var.H0().x(lyi0.f20863a);
                return Unit.f46060a;
            case 5:
                cge0 cge0Var6 = ofj0.X1;
                ofj0Var.H0().x(byi0.f3420a);
                return Unit.f46060a;
            case 6:
                cge0 cge0Var7 = ofj0.X1;
                ofj0Var.H0().x(yyi0.f43468a);
                return Unit.f46060a;
            case 7:
                cge0 cge0Var8 = ofj0.X1;
                ofj0Var.H0().x(kyi0.f19106a);
                return Unit.f46060a;
            case 8:
                cge0 cge0Var9 = ofj0.X1;
                ofj0Var.H0().x(zyi0.f45208a);
                return Unit.f46060a;
            default:
                cge0 cge0Var10 = ofj0.X1;
                ofj0Var.H0().x(azi0.f1719a);
                return Unit.f46060a;
        }
    }
}
