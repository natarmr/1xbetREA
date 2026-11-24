package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jka implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16657a;
    public final /* synthetic */ List b;

    public /* synthetic */ jka(List list, byte b) {
        this.f16657a = b;
        this.b = list;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f16657a;
        List list = this.b;
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (b) {
            case 0:
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((xdr) it.next()).F(mm40Var, fetVar, Integer.valueOf(iIntValue & 14));
                    }
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((xdr) it2.next()).F(mm40Var, fetVar, Integer.valueOf(iIntValue & 14));
                    }
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((xdr) it3.next()).F(mm40Var, fetVar, Integer.valueOf(iIntValue & 14));
                    }
                } else {
                    fetVar.X();
                }
                break;
            default:
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        ((xdr) it4.next()).F(mm40Var, fetVar, Integer.valueOf(iIntValue & 14));
                    }
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
