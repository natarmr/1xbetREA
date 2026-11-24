package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ymn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42899a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ imm c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ ymn(mm40 mm40Var, imm immVar, Function1 function1, int i, byte b) {
        this.f42899a = b;
        this.b = mm40Var;
        this.c = immVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42899a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                hmw0.u(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                bsr0.y(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
