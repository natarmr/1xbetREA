package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m3c0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21108a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m3c0(v8d0 v8d0Var, d9d0 d9d0Var, boolean z, mm40 mm40Var, long j, long j2, float f, int i, int i2) {
        this.h = v8d0Var;
        this.i = d9d0Var;
        this.b = z;
        this.c = mm40Var;
        this.d = j;
        this.e = j2;
        this.f = f;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21108a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1572865);
                mm40 mm40Var = this.c;
                long j = this.d;
                long j2 = this.e;
                boolean z = this.b;
                float f = this.f;
                byte b2 = this.g;
                p3c0.c((Function0) obj4, mm40Var, j, j2, z ? 1 : 0, f, (Function1) obj3, (fet) obj, iL, b2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1572865);
                ((v8d0) obj4).a((d9d0) obj3, this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2, this.g);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m3c0(Function0 function0, mm40 mm40Var, long j, long j2, int i, float f, Function1 function1, int i2, int i3) {
        this.h = function0;
        this.c = mm40Var;
        this.d = j;
        this.e = j2;
        this.b = i;
        this.f = f;
        this.i = function1;
        this.g = i3;
    }
}
