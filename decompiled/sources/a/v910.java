package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class v910 extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37012a;
    public final /* synthetic */ fa10 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ mm40 d;
    public final /* synthetic */ qge e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ v910(fa10 fa10Var, Function0 function0, mm40 mm40Var, qge qgeVar, int i, int i2, int i3, byte b) {
        super(2);
        this.f37012a = b;
        this.b = fa10Var;
        this.c = function0;
        this.d = mm40Var;
        this.e = qgeVar;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37012a;
        byte b2 = this.g;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                piz.j(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1), x8x.L(b2), this.h);
                break;
            default:
                ((Number) obj2).intValue();
                piz.j(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1), x8x.L(b2), this.h);
                break;
        }
        return Unit.f46060a;
    }
}
