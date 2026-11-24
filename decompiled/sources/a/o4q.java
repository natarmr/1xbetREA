package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o4q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24652a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ imm c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ o4q(mm40 mm40Var, imm immVar, Function1 function1, int i, byte b) {
        this.f24652a = b;
        this.b = mm40Var;
        this.c = immVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24652a;
        int i = this.e;
        Function1 function1 = this.d;
        imm immVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ntr.I(mm40Var, immVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                o050.x(mm40Var, immVar, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                n8n0.f(mm40Var, immVar, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
