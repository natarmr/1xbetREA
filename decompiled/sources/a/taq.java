package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class taq implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33625a;
    public final /* synthetic */ ebq b;

    public /* synthetic */ taq(ebq ebqVar, byte b) {
        this.f33625a = b;
        this.b = ebqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f33625a;
        ebq ebqVar = this.b;
        switch (b) {
            case 0:
                ebqVar.G(kaq.f17976a);
                break;
            default:
                p7m0 p7m0Var = ebqVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    ebqVar.f.getClass();
                } while (!p7m0Var.m(value, oaq.a((oaq) value, null, false, null, null, null, null, null, false, false, 0, null, false, 2047)));
                break;
        }
        return Unit.f46060a;
    }
}
