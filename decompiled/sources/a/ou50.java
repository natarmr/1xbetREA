package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ou50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25861a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ou50(mm40 mm40Var, kwj kwjVar, int i, float f, float f2, long j, long j2, int i2) {
        this.b = mm40Var;
        this.h = kwjVar;
        this.g = i;
        this.d = f;
        this.f = f2;
        this.c = j;
        this.e = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25861a;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                ju70.D(this.b, (kwj) obj3, this.g, this.d, this.f, this.c, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                p3c0.b((Function0) obj3, this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ou50(Function0 function0, mm40 mm40Var, long j, float f, long j2, float f2, int i) {
        this.h = function0;
        this.b = mm40Var;
        this.c = j;
        this.d = f;
        this.e = j2;
        this.f = f2;
        this.g = i;
    }
}
