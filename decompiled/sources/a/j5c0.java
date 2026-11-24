package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j5c0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15926a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ w5c0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ j5c0(mm40 mm40Var, w5c0 w5c0Var, Function0 function0, int i, byte b) {
        this.f15926a = b;
        this.b = mm40Var;
        this.c = w5c0Var;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (this.f15926a) {
            case 0:
                num.getClass();
                m8x.t(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                num.intValue();
                m8x.g(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
