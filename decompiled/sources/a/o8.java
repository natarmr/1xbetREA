package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24807a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pqv c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ o8(mm40 mm40Var, pqv pqvVar, Function1 function1, int i, byte b) {
        this.f24807a = b;
        this.b = mm40Var;
        this.c = pqvVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24807a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                j47.G(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                jd8.b(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
