package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m8n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21379a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m8n(int i, int i2, x8n x8nVar, mm40 mm40Var, boolean z) {
        this.b = mm40Var;
        this.f = x8nVar;
        this.e = z;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21379a) {
            case 0:
                ((Integer) obj2).getClass();
                p8n.b(this.b, (x8n) this.f, this.e, (fet) obj, x8x.L(this.c | 1), this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                i4w0.J(this.b, this.c, (pdz) this.f, (fet) obj, x8x.L(this.d | 1), this.e ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                xcm0.c((ylp0) this.f, this.b, this.e, (fet) obj, x8x.L(this.c | 1), this.d);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m8n(mm40 mm40Var, int i, pdz pdzVar, int i2, int i3) {
        this.b = mm40Var;
        this.c = i;
        this.f = pdzVar;
        this.d = i2;
        this.e = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m8n(ylp0 ylp0Var, mm40 mm40Var, boolean z, int i, int i2) {
        this.f = ylp0Var;
        this.b = mm40Var;
        this.e = z;
        this.c = i;
        this.d = i2;
    }
}
