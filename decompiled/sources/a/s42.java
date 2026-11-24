package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class s42 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31583a;
    public final /* synthetic */ t42 b;

    public /* synthetic */ s42(t42 t42Var, byte b) {
        this.f31583a = b;
        this.b = t42Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31583a;
        t42 t42Var = this.b;
        switch (b) {
            case 0:
                s3q s3qVar = (s3q) obj;
                long jLongValue = ((Number) obj2).longValue();
                s3qVar.getClass();
                jdk0 jdk0Var = t42.p2;
                t42Var.Q0().x(new h42(s3qVar, jLongValue));
                break;
            default:
                s3q s3qVar2 = (s3q) obj;
                long jLongValue2 = ((Number) obj2).longValue();
                s3qVar2.getClass();
                jdk0 jdk0Var2 = t42.p2;
                t42Var.Q0().x(new h42(s3qVar2, jLongValue2));
                break;
        }
        return Unit.f46060a;
    }
}
