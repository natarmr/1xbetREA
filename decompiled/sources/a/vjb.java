package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vjb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37518a;
    public final /* synthetic */ xjb b;

    public /* synthetic */ vjb(xjb xjbVar, byte b) {
        this.f37518a = b;
        this.b = xjbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f37518a;
        xjb xjbVar = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                kj5 kj5Var = xjb.U1;
                uidVar.getClass();
                ((k3t0) xjbVar.P1.getValue()).x(new gjb(uidVar));
                break;
            default:
                ojb ojbVar = (ojb) obj;
                kj5 kj5Var2 = xjb.U1;
                ojbVar.getClass();
                ((k3t0) xjbVar.P1.getValue()).x(ojbVar);
                break;
        }
        return Unit.f46060a;
    }
}
