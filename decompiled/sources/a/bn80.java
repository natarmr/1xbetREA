package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bn80 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2870a;
    public final /* synthetic */ w6n b;
    public final /* synthetic */ zfp c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ bn80(w6n w6nVar, zfp zfpVar, Function2 function2, byte b) {
        this.f2870a = b;
        this.b = w6nVar;
        this.c = zfpVar;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2870a;
        Function2 function2 = this.d;
        zfp zfpVar = this.c;
        w6n w6nVar = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wfp.a(mrv.k0(fww.D(w6nVar, zfpVar.c, (k6z) fetVar.k(cn80.f4642a)), "FAVORITE_ICON"), zfpVar, function2, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wfp.a(mrv.k0(fww.D(w6nVar, zfpVar.c, (k6z) fetVar.k(cn80.f4642a)), "FAVORITE_ICON"), zfpVar, function2, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wfp.a(mrv.k0(fww.D(w6nVar, zfpVar.c, (k6z) fetVar.k(cn80.f4642a)), "FAVORITE_ICON"), zfpVar, function2, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
