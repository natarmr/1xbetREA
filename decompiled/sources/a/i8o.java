package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i8o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14348a;
    public final /* synthetic */ k8o b;

    public /* synthetic */ i8o(k8o k8oVar, byte b) {
        this.f14348a = b;
        this.b = k8oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14348a;
        k8o k8oVar = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                uidVar.getClass();
                k8oVar.G0().x(new l7o(uidVar));
                break;
            case 1:
                s7o s7oVar = (s7o) obj;
                s7oVar.getClass();
                k8oVar.G0().x(s7oVar);
                break;
            default:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                k8oVar.G0().x(new m7o(bemVar));
                break;
        }
        return Unit.f46060a;
    }
}
