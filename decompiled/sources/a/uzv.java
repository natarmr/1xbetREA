package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class uzv implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36553a;
    public final /* synthetic */ vzv b;

    public /* synthetic */ uzv(vzv vzvVar, byte b) {
        this.f36553a = b;
        this.b = vzvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36553a;
        vzv vzvVar = this.b;
        switch (b) {
            case 0:
                sqt sqtVar = vzv.p2;
                vzvVar.P0().x(xzv.f41772a);
                break;
            default:
                sqt sqtVar2 = vzv.p2;
                vzvVar.P0().x(wzv.f40037a);
                break;
        }
        return Unit.f46060a;
    }
}
