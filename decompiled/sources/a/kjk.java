package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kjk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18390a;
    public final /* synthetic */ ljk b;

    public /* synthetic */ kjk(ljk ljkVar, byte b) {
        this.f18390a = b;
        this.b = ljkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18390a;
        ljk ljkVar = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    y9a.q(ljkVar.f, ljkVar.e, u1c.M(-662606506, new cxj(r8x.V(null, fetVar, 3), ljkVar, (byte) 6), fetVar), fetVar, 384);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ljkVar.b.a(0, fetVar);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
