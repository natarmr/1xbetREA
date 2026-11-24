package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bbm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2314a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ cbm c;
    public final /* synthetic */ byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ bbm(mm40 mm40Var, cbm cbmVar, int i, byte b) {
        this.f2314a = b;
        this.b = mm40Var;
        this.c = cbmVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2314a;
        byte b2 = this.d;
        cbm cbmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ro4.C(mm40Var, cbmVar, fetVar, x8x.L(b2 | 1));
                break;
            default:
                ro4.A(mm40Var, cbmVar, fetVar, x8x.L(b2 | 1));
                break;
        }
        return Unit.f46060a;
    }
}
