package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wjl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39266a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ bkl c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ wjl(mm40 mm40Var, bkl bklVar, Function1 function1, int i, byte b) {
        this.f39266a = b;
        this.b = mm40Var;
        this.c = bklVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39266a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                uc9.p(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            case 1:
                p8a.q(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                q8a.i(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
