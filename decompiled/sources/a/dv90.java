package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dv90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6733a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ dv90(int i, int i2, byte b) {
        this.f6733a = b;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        be80 be80Var;
        byte b = this.f6733a;
        jm40 jm40Var = jm40.b;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wdx.C((i2 - i) + 1, 6, fetVar, o7k0.d(jm40Var, 1.0f));
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    xdx.q((i2 - i) + 1, 6, fetVar2, o7k0.d(jm40Var, 1.0f));
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ydx.s((i2 - i) + 1, 6, fetVar3, o7k0.d(jm40Var, 1.0f));
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zdx.o((i2 - i) + 1, 6, fetVar4, o7k0.d(jm40Var, 1.0f));
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            default:
                ztr0 ztr0Var = (ztr0) obj2;
                ((oyg0) obj).getClass();
                ztr0Var.getClass();
                List list = ztr0Var.b;
                vd80 vd80Var = (vd80) list.get(i2);
                List list2 = vd80Var.d;
                ArrayList arrayList = new ArrayList(list);
                ArrayList arrayList2 = new ArrayList(list2);
                ntr0 ntr0Var = (ntr0) list2.get(i);
                ntr0 ntr0VarA = ntr0.a(ntr0Var, !ntr0Var.b);
                arrayList2.set(i, ntr0VarA);
                boolean z = ntr0VarA.b;
                int i3 = vd80Var.c;
                int i4 = z ? i3 + 1 : i3 - 1;
                if (i4 == vd80Var.d.size()) {
                    be80Var = be80.f2437a;
                } else {
                    be80Var = i4 == 0 ? be80.b : be80.c;
                }
                arrayList.set(i2, vd80.a(vd80Var, be80Var, i4, arrayList2));
                int i5 = ztr0Var.d;
                return new ztr0(ztr0Var.f44976a, arrayList, ztr0Var.c, z ? i5 + 1 : i5 - 1);
        }
    }
}
