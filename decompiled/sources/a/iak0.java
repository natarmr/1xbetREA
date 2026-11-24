package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iak0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14442a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ hjm c;

    public /* synthetic */ iak0(mm40 mm40Var, hjm hjmVar, int i, byte b) {
        this.f14442a = b;
        this.b = mm40Var;
        this.c = hjmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14442a;
        hjm hjmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                jd8.E(mm40Var, hjmVar, fetVar, x8x.L(1));
                break;
            default:
                unh0.F(mm40Var, hjmVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
