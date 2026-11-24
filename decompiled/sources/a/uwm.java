package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uwm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36400a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ mpm c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ uwm(mm40 mm40Var, mpm mpmVar, boolean z, int i, byte b) {
        this.f36400a = b;
        this.b = mm40Var;
        this.c = mpmVar;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36400a;
        boolean z = this.d;
        mpm mpmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                aac.z(mm40Var, mpmVar, z, fetVar, x8x.L(1));
                break;
            case 1:
                ozb.E(mm40Var, mpmVar, z, fetVar, x8x.L(1));
                break;
            case 2:
                qzb.H(mm40Var, mpmVar, z, fetVar, x8x.L(1));
                break;
            default:
                uzb.K(mm40Var, mpmVar, z, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
