package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rj9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30581a;
    public final /* synthetic */ sj9 b;
    public final /* synthetic */ tj9 c;

    public /* synthetic */ rj9(sj9 sj9Var, tj9 tj9Var, byte b) {
        this.f30581a = b;
        this.b = sj9Var;
        this.c = tj9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30581a;
        tj9 tj9Var = this.c;
        sj9 sj9Var = this.b;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                sj9Var.f(tj9Var, iIntValue, iIntValue2);
                break;
            default:
                sj9Var.f(tj9Var, iIntValue, iIntValue2);
                break;
        }
        return Unit.f46060a;
    }
}
