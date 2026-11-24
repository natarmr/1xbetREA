package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xsm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41424a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ w1n c;

    public /* synthetic */ xsm(mm40 mm40Var, w1n w1nVar, int i, byte b) {
        this.f41424a = b;
        this.b = mm40Var;
        this.c = w1nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41424a;
        w1n w1nVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                jcb.y(mm40Var, w1nVar, fetVar, x8x.L(1));
                break;
            default:
                jcb.z(mm40Var, w1nVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
