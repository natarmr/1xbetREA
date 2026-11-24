package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ika implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14915a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ List c;

    public /* synthetic */ ika(byte b, mm40 mm40Var, List list) {
        this.f14915a = b;
        this.b = mm40Var;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14915a;
        List list = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                ugd ugdVar = j2e.f15775a;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ugdVar.j(mm40Var, u1c.M(-1129244748, new jka(list, (byte) 0), fetVar), fetVar, 48);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ugd ugdVar2 = i120.c;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ugdVar2.j(mm40Var, u1c.M(-579633274, new jka(list, (byte) 2), fetVar2), fetVar2, 48);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                ugd ugdVar3 = j120.d;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ugdVar3.j(mm40Var, u1c.M(1871965826, new jka(list, (byte) 3), fetVar3), fetVar3, 48);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                q5x.m(mm40Var, list, (fet) obj, x8x.L(7));
                break;
            default:
                ((Integer) obj2).getClass();
                mym0.a(mm40Var, list, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ika(mm40 mm40Var, List list, int i, byte b) {
        this.f14915a = b;
        this.b = mm40Var;
        this.c = list;
    }
}
