package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hsl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13590a;
    public final /* synthetic */ py1 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ hsl(py1 py1Var, Function0 function0, Function0 function1, int i, byte b) {
        this.f13590a = b;
        this.b = py1Var;
        this.c = function0;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13590a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                bfb.c(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                bfb.a(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
