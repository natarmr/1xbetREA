package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class erl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8287a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ irl c;
    public final /* synthetic */ int d;

    public /* synthetic */ erl(mm40 mm40Var, irl irlVar, int i, byte b) {
        this.f8287a = b;
        this.b = mm40Var;
        this.c = irlVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8287a;
        int i = this.d;
        irl irlVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                agc.n(mm40Var, irlVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                hic.i(mm40Var, irlVar, fetVar, x8x.L(i | 1));
                break;
            default:
                plc.h(mm40Var, irlVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
