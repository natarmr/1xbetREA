package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kr8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18751a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ wdr g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kr8(bc bcVar, boolean z, Function0 function0, mm40 mm40Var, int i, int i2) {
        this.f18751a = (byte) 1;
        this.f = bcVar;
        this.b = z;
        this.g = function0;
        this.c = mm40Var;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18751a;
        int i = this.d;
        wdr wdrVar = this.g;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                nnw0.g((mm40) obj4, (u12) obj3, this.b, (ugd) wdrVar, (fet) obj, x8x.L(i | 1), this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                boolean z = this.b;
                acb.n((bc) obj3, z, (Function0) wdrVar, (mm40) obj4, (fet) obj, iL, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                x2x.k((mm40) obj4, (nuc0) obj3, this.b, (Function1) wdrVar, (fet) obj, x8x.L(i | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                boolean z2 = this.b;
                zcm0.c((String) obj4, (zx7) obj3, z2, (xdr) wdrVar, (fet) obj, iL2, this.e);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kr8(Object obj, Object obj2, boolean z, wdr wdrVar, int i, int i2, byte b) {
        this.f18751a = b;
        this.c = obj;
        this.f = obj2;
        this.b = z;
        this.g = wdrVar;
        this.d = i;
        this.e = i2;
    }
}
