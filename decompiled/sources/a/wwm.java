package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wwm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39891a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a2m c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ wwm(mm40 mm40Var, a2m a2mVar, boolean z, int i, byte b) {
        this.f39891a = b;
        this.b = mm40Var;
        this.c = a2mVar;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39891a;
        boolean z = this.d;
        a2m a2mVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                sac.B(mm40Var, a2mVar, z, fetVar, x8x.L(1));
                break;
            case 1:
                ebc.L(mm40Var, a2mVar, z, fetVar, x8x.L(1));
                break;
            case 2:
                vzb.w(mm40Var, a2mVar, z, fetVar, x8x.L(1));
                break;
            default:
                wzb.G(mm40Var, a2mVar, z, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
