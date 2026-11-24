package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kv7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18943a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ tvw c;

    public /* synthetic */ kv7(mm40 mm40Var, tvw tvwVar, int i, byte b) {
        this.f18943a = b;
        this.b = mm40Var;
        this.c = tvwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18943a;
        tvw tvwVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                x4d0.g(mm40Var, tvwVar, fetVar, x8x.L(1));
                break;
            default:
                vsm0.c(mm40Var, tvwVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
