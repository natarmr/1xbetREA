package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cs8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4875a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ wdr i;

    public /* synthetic */ cs8(mm40 mm40Var, es8 es8Var, boolean z, long j, float f, long j2, xdr xdrVar, int i) {
        this.g = mm40Var;
        this.h = es8Var;
        this.b = z;
        this.c = j;
        this.e = f;
        this.d = j2;
        this.i = xdrVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4875a;
        int i = this.f;
        wdr wdrVar = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                s5x0.h((mm40) obj4, (es8) obj3, this.b, this.c, this.e, this.d, (xdr) wdrVar, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                k7x.g(this.b, (String) obj4, (String) obj3, this.c, this.d, this.e, (Function0) wdrVar, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cs8(boolean z, String str, String str2, long j, long j2, float f, Function0 function0, int i) {
        this.b = z;
        this.g = str;
        this.h = str2;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.i = function0;
        this.f = i;
    }
}
