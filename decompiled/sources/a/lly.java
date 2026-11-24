package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lly implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20270a;
    public final /* synthetic */ nly b;

    public /* synthetic */ lly(nly nlyVar, byte b) {
        this.f20270a = b;
        this.b = nlyVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f20270a;
        nly nlyVar = this.b;
        switch (b) {
            case 0:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.I(-nlyVar.s);
                break;
            case 1:
                bff0 bff0Var = (bff0) obj;
                bff0Var.getClass();
                nlyVar.t = Integer.valueOf(((int) (((yez) ((rhv0) mbc.R(nlyVar, bmd.u))).b() & 4294967295L)) - ((int) bff0Var.b));
                break;
            default:
                nlyVar.s = ((Number) ((t33) obj).d()).floatValue();
                vcc.Z(nlyVar).V(false);
                break;
        }
        return Unit.f46060a;
    }
}
