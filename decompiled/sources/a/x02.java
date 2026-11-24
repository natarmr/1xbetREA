package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x02 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40048a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ n4i0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ x02(mm40 mm40Var, n4i0 n4i0Var, int i, byte b) {
        this.f40048a = b;
        this.b = mm40Var;
        this.c = n4i0Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40048a;
        int i = this.d;
        n4i0 n4i0Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                fre0.e(mm40Var, n4i0Var, fetVar, x8x.L(i | 1));
                break;
            default:
                fre0.c(mm40Var, n4i0Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
