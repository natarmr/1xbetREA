package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xkz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41049a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ clz d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xkz(Object obj, Object obj2, clz clzVar, Function1 function1, int i, int i2, byte b) {
        this.f41049a = b;
        this.b = obj;
        this.c = obj2;
        this.d = clzVar;
        this.e = function1;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41049a) {
            case 0:
                ((Integer) obj2).getClass();
                s0x.h(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                s0x.e(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1), this.g);
                break;
        }
        return Unit.f46060a;
    }
}
