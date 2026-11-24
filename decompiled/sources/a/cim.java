package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cim implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4423a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ short d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ wdr g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cim(mm40 mm40Var, e0x e0xVar, boolean z, Function1 function1, int i, int i2) {
        this.c = mm40Var;
        this.f = e0xVar;
        this.b = z;
        this.g = function1;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4423a) {
            case 0:
                ((Integer) obj2).getClass();
                bkb.w(this.c, (e0x) this.f, this.b, (Function1) this.g, (fet) obj, x8x.L(this.d | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                n2x.f((of90) this.f, this.b, this.c, (xdr) this.g, (fet) obj, x8x.L(this.d | 1), this.e);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cim(of90 of90Var, boolean z, mm40 mm40Var, xdr xdrVar, int i, int i2) {
        this.f = of90Var;
        this.b = z;
        this.c = mm40Var;
        this.g = xdrVar;
        this.d = i;
        this.e = i2;
    }
}
