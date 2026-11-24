package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s7m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31756a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ r7m c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ short g;
    public final /* synthetic */ b8m h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s7m(mm40 mm40Var, b8m b8mVar, r7m r7mVar, float f, Function0 function0, Function0 function1, int i, byte b) {
        this.f31756a = b;
        this.b = mm40Var;
        this.h = b8mVar;
        this.c = r7mVar;
        this.d = f;
        this.e = function0;
        this.f = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31756a) {
            case 0:
                ((Integer) obj2).getClass();
                fxb.m(this.b, (x7m) this.h, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                dyb.q(this.b, (a8m) this.h, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
        }
        return Unit.f46060a;
    }
}
