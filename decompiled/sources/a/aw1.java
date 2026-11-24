package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aw1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1550a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ vv1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ aw1(mm40 mm40Var, vv1 vv1Var, int i, byte b) {
        this.f1550a = b;
        this.b = mm40Var;
        this.c = vv1Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1550a;
        int i = this.d;
        vv1 vv1Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                cjx.e(mm40Var, vv1Var, fetVar, x8x.L(i | 1));
                break;
            default:
                unh0.b(mm40Var, vv1Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
