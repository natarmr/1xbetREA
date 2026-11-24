package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i2i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14048a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ v3i d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ i2i(mm40 mm40Var, boolean z, v3i v3iVar, Function1 function1, int i, byte b) {
        this.f14048a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = v3iVar;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14048a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                d5c.d(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ebc.h(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
