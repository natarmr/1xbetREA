package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vly implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37651a;
    public final /* synthetic */ zly b;

    public /* synthetic */ vly(zly zlyVar, byte b) {
        this.f37651a = b;
        this.b = zlyVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f37651a;
        zly zlyVar = this.b;
        switch (b) {
            case 0:
                bff0 bff0Var = (bff0) obj;
                bff0Var.getClass();
                zlyVar.s = Integer.valueOf(((int) (((yez) ((rhv0) mbc.R(zlyVar, bmd.u))).b() & 4294967295L)) - ((int) bff0Var.b));
                zlyVar.a1();
                break;
            default:
                zlyVar.q = ((Number) ((t33) obj).d()).floatValue();
                n7x.I(zlyVar);
                break;
        }
        return Unit.f46060a;
    }
}
