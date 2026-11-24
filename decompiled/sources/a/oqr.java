package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oqr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25702a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ j83 c;
    public final /* synthetic */ int d;

    public /* synthetic */ oqr(mm40 mm40Var, j83 j83Var, int i, byte b) {
        this.f25702a = b;
        this.b = mm40Var;
        this.c = j83Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25702a;
        int i = this.d;
        j83 j83Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                jwb.r(mm40Var, j83Var, fetVar, x8x.L(i | 1));
                break;
            default:
                wdx.m(mm40Var, j83Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
