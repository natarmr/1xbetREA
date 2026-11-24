package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l5w implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19479a;
    public final /* synthetic */ q5w b;

    public /* synthetic */ l5w(q5w q5wVar, byte b) {
        this.f19479a = b;
        this.b = q5wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19479a;
        q5w q5wVar = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                if ((th instanceof zhi0) && ((zhi0) th).c == i2o.SelfExclusionChangesProhibited) {
                    q5wVar.D.f(e5w.f7252a);
                }
                break;
            case 1:
                th.getClass();
                str.getClass();
                q5wVar.F.o(null, new c5w(false, false));
                if (th instanceof zhi0) {
                    nhf0 nhf0Var = q5wVar.A;
                    int errorCode = ((zhi0) th).c.getErrorCode();
                    b4j b4jVar = (b4j) nhf0Var.c;
                    a1w a1wVar = a1w.f93a;
                    r6w r6wVar = r6w.g;
                    b4jVar.c(String.valueOf(errorCode), r6wVar);
                    ((au0) nhf0Var.f23530a).f(errorCode, r6wVar.a());
                }
                q5wVar.w.b(th, new l5w(q5wVar, (byte) 2));
                break;
            default:
                th.getClass();
                str.getClass();
                q5wVar.D.f(new g5w(str));
                break;
        }
        return Unit.f46060a;
    }
}
