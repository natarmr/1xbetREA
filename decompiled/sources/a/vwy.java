package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vwy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38176a;
    public final /* synthetic */ zeb b;

    public /* synthetic */ vwy(zeb zebVar, byte b) {
        this.f38176a = b;
        this.b = zebVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f38176a;
        zeb zebVar = this.b;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.e(hczVar, null, null, cwr0.c, 3);
                hcz.g(hczVar, zebVar.f44242a, null, null, cwr0.d, 6);
                break;
            case 1:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.e(hczVar2, null, null, j2e.c, 3);
                hcz.g(hczVar2, zebVar.f44242a, null, null, j2e.d, 6);
                break;
            default:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.e(hczVar3, null, null, y9a.d, 3);
                hcz.g(hczVar3, zebVar.f44242a, null, null, y9a.e, 6);
                break;
        }
        return Unit.f46060a;
    }
}
