package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kja implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18377a;
    public final /* synthetic */ cp b;

    public /* synthetic */ kja(cp cpVar, byte b) {
        this.f18377a = b;
        this.b = cpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18377a;
        cp cpVar = this.b;
        switch (b) {
            case 0:
                ((msx) cpVar.u).c.scrollBy(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                break;
            case 1:
                ((msx) cpVar.u).b.scrollBy(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                break;
            case 2:
                ((msx) cpVar.u).c.scrollBy(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                break;
            case 3:
                ((msx) cpVar.u).b.scrollBy(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                break;
            case 4:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n8n0.c(null, (jlo0) cpVar.u(), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    feb.w((liq) cpVar.u(), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
