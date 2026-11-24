package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g3n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10618a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ short c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g3n(pm80 pm80Var, n4d n4dVar, mm40 mm40Var, int i, int i2) {
        this.f10618a = (byte) 1;
        this.e = pm80Var;
        this.f = n4dVar;
        this.b = mm40Var;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10618a) {
            case 0:
                ((Integer) obj2).getClass();
                rsr0.r(this.b, (n3n) this.e, (Function2) this.f, (fet) obj, x8x.L(this.c | 1), this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                dww.a((pm80) this.e, (n4d) this.f, this.b, (fet) obj, x8x.L(this.c | 1), this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                x1x.s(this.b, (l7m0) this.e, (xdr) this.f, (fet) obj, x8x.L(this.c | 1), this.d);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g3n(mm40 mm40Var, Object obj, wdr wdrVar, int i, int i2, byte b) {
        this.f10618a = b;
        this.b = mm40Var;
        this.e = obj;
        this.f = wdrVar;
        this.c = i;
        this.d = i2;
    }
}
