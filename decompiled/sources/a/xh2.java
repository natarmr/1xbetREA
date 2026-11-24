package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xh2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40868a;
    public final /* synthetic */ sce b;

    public /* synthetic */ xh2(sce sceVar, byte b) {
        this.f40868a = b;
        this.b = sceVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40868a;
        final sce sceVar = this.b;
        final byte b2 = 1;
        hcz hczVar = (hcz) obj;
        switch (b) {
            case 0:
                hczVar.getClass();
                final byte b3 = 0;
                hcz.e(hczVar, null, null, new ugd(-1071725232, true, new xdr() { // from class: a.yh2
                    @Override // a.xdr
                    public final Object F(Object obj2, Object obj3, Object obj4) {
                        byte b4 = b3;
                        sce sceVar2 = sceVar;
                        g9z g9zVar = (g9z) obj2;
                        fet fetVar = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (b4) {
                            case 0:
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    jcb.l(null, sceVar2.f31982a.f33973a, true, null, fetVar, 384, 9);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            default:
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    jcb.l(null, sceVar2.f31982a.f33973a, true, null, fetVar, 384, 9);
                                } else {
                                    fetVar.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }), 3);
                break;
            default:
                hczVar.getClass();
                hcz.e(hczVar, null, null, new ugd(-930220468, true, new xdr() { // from class: a.yh2
                    @Override // a.xdr
                    public final Object F(Object obj2, Object obj3, Object obj4) {
                        byte b4 = b2;
                        sce sceVar2 = sceVar;
                        g9z g9zVar = (g9z) obj2;
                        fet fetVar = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (b4) {
                            case 0:
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    jcb.l(null, sceVar2.f31982a.f33973a, true, null, fetVar, 384, 9);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            default:
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    jcb.l(null, sceVar2.f31982a.f33973a, true, null, fetVar, 384, 9);
                                } else {
                                    fetVar.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }), 3);
                break;
        }
        return Unit.f46060a;
    }
}
