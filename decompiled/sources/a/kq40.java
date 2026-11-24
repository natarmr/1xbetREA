package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kq40 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18702a;
    public final /* synthetic */ xcz b;
    public final /* synthetic */ x77 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ kq40(xcz xczVar, x77 x77Var, Function1 function1, int i, byte b) {
        this.f18702a = b;
        this.b = xczVar;
        this.c = x77Var;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18702a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                q0x.m(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                nnw0.f(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
