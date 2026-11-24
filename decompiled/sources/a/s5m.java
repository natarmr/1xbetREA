package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s5m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31660a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ s5m(vne vneVar, pz40 pz40Var, byte b) {
        this.f31660a = b;
        this.b = vneVar;
        this.c = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31660a;
        yje yjeVar = null;
        pz40 pz40Var = this.c;
        vne vneVar = this.b;
        byte b2 = 3;
        switch (b) {
            case 0:
                qjj.W(vneVar, null, null, new u6h(pz40Var, yjeVar, b2), 3);
                break;
            case 1:
                qjj.W(vneVar, null, null, new u6h(pz40Var, yjeVar, (byte) 4), 3);
                break;
            default:
                qjj.W(vneVar, null, null, new u6h(pz40Var, yjeVar, (byte) 6), 3);
                break;
        }
        return Unit.f46060a;
    }
}
