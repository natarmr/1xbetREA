package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i3i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14097a;
    public final /* synthetic */ u3i b;

    public /* synthetic */ i3i(u3i u3iVar, byte b) {
        this.f14097a = b;
        this.b = u3iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14097a;
        u3i u3iVar = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (!fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fetVar.X();
                } else if (u3iVar instanceof v3i) {
                    fetVar.e0(-111442529);
                    n4c.d(null, ((v3i) u3iVar).f36733a, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-111337780);
                    fetVar.r(false);
                }
                break;
            default:
                if (!fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fetVar.X();
                } else if (u3iVar instanceof v3i) {
                    fetVar.e0(-1971592665);
                    n4c.d(null, ((v3i) u3iVar).f36733a, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1971487916);
                    fetVar.r(false);
                }
                break;
        }
        return Unit.f46060a;
    }
}
