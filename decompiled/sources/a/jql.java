package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jql implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16959a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ fw1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ jql(mm40 mm40Var, fw1 fw1Var, int i, byte b) {
        this.f16959a = b;
        this.b = mm40Var;
        this.c = fw1Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16959a;
        int i = this.d;
        fw1 fw1Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ebc.q(mm40Var, fw1Var, fetVar, x8x.L(i | 1));
                break;
            case 1:
                knx.x(mm40Var, fw1Var, fetVar, x8x.L(i | 1));
                break;
            case 2:
                fbc.v(mm40Var, fw1Var, fetVar, x8x.L(i | 1));
                break;
            default:
                kbc.j(mm40Var, fw1Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
