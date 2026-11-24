package a;

import java.util.Iterator;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yoh implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42985a;
    public final /* synthetic */ a4x b;

    public /* synthetic */ yoh(a4x a4xVar, byte b) {
        this.f42985a = b;
        this.b = a4xVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f42985a;
        jm40 jm40Var = jm40.b;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    v3c.c(R.drawable.ufc_statistics_beat_map_fighter_placeholder, 100, fetVar, 48);
                    v3c.c(R.drawable.ufc_statistics_beat_map_fighter_head, v3c.j0(a4xVar, aph.f1252a), fetVar, 0);
                    v3c.c(R.drawable.ufc_statistics_beat_map_fighter_body, v3c.j0(a4xVar, aph.b), fetVar, 0);
                    v3c.c(R.drawable.ufc_statistics_beat_map_fighter_legs, v3c.j0(a4xVar, aph.c), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bpq) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Iterator<E> it = a4xVar.iterator();
                    while (it.hasNext()) {
                        pm80 pm80VarF = a8k0.F(((Number) it.next()).intValue(), 0, fetVar2);
                        zcl zclVar = qmk.f28987a;
                        j0x.b(pm80VarF, null, o7k0.p(jm40Var, 30.0f, 40.0f), null, null, 0.0f, null, fetVar2, 56, 120);
                    }
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((bpq) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    Iterator<E> it2 = a4xVar.iterator();
                    while (it2.hasNext()) {
                        pm80 pm80VarF2 = a8k0.F(((Number) it2.next()).intValue(), 0, fetVar3);
                        zcl zclVar2 = qmk.f28987a;
                        j0x.b(pm80VarF2, null, o7k0.p(jm40Var, 24.0f, 32.0f), null, null, 0.0f, null, fetVar3, 56, 120);
                    }
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((bpq) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    Iterator<E> it3 = a4xVar.iterator();
                    while (it3.hasNext()) {
                        pm80 pm80VarF3 = a8k0.F(((Number) it3.next()).intValue(), 0, fetVar4);
                        zcl zclVar3 = qmk.f28987a;
                        j0x.b(pm80VarF3, null, o7k0.p(jm40Var, 24.0f, 32.0f), null, null, 0.0f, null, fetVar4, 56, 120);
                    }
                } else {
                    fetVar4.X();
                }
                break;
            default:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((bpq) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    Iterator<E> it4 = a4xVar.iterator();
                    while (it4.hasNext()) {
                        pm80 pm80VarF4 = a8k0.F(((Number) it4.next()).intValue(), 0, fetVar5);
                        zcl zclVar4 = qmk.f28987a;
                        j0x.b(pm80VarF4, null, o7k0.p(jm40Var, 24.0f, 32.0f), null, null, 0.0f, null, fetVar5, 56, 120);
                    }
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
