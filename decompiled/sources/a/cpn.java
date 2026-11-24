package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cpn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4756a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ton c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ cpn(mm40 mm40Var, ton tonVar, boolean z, int i, byte b) {
        this.f4756a = b;
        this.b = mm40Var;
        this.c = tonVar;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4756a;
        boolean z = this.d;
        ton tonVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                vfc.A(mm40Var, tonVar, z, fetVar, x8x.L(7));
                break;
            default:
                efx.c(mm40Var, tonVar, z, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
