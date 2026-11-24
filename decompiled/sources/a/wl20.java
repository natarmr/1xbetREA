package a;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.coupon.impl.coupon.presentation.models.CouponTypeUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class wl20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ on20 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl20(on20 on20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = on20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        on20 on20Var = this.j;
        switch (b) {
            case 0:
                return new wl20(on20Var, yjeVar, (byte) 0);
            case 1:
                return new wl20(on20Var, yjeVar, (byte) 1);
            case 2:
                return new wl20(on20Var, yjeVar, (byte) 2);
            default:
                return new wl20(on20Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wl20) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wl20) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((wl20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wl20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yje yjeVar = null;
        byte b2 = 0;
        on20 on20Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = on20.m1;
                BigDecimal scale = new BigDecimal(String.valueOf(on20Var.X.i())).setScale(3, RoundingMode.FLOOR);
                BigDecimal bigDecimal = scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros();
                yyc yycVar = ((a820) on20Var.D()).g.b;
                boolean zEquals = yycVar.f43459a.equals(yycVar.b);
                if (zEquals) {
                    bigDecimal.getClass();
                    on20Var.H0(bigDecimal);
                }
                on20Var.H(new xh20(zEquals, bigDecimal, b2));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                cit0 cit0VarC = on20Var.Z0.c();
                on20Var.L0(cit0VarC.f0);
                i3t0.K(on20Var, on20Var.E.b, null, new hj20(on20Var, yjeVar, (byte) 8), 2);
                on20Var.H(new obg((byte) 21, !cit0VarC.O.isEmpty()));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                gao0 gao0Var = ((a820) on20Var.D()).b.c;
                fao0 fao0Var = gao0Var instanceof fao0 ? (fao0) gao0Var : null;
                if (fao0Var != null) {
                    List listA = on20Var.d0.A();
                    ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
                    int i2 = 0;
                    for (Object obj2 : listA) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            q3d.p();
                            throw null;
                        }
                        en7 en7Var = (en7) obj2;
                        boolean z = i2 == listA.size() - 1;
                        en7 en7Var2 = fao0Var.f9219a;
                        boolean z2 = en7Var2.c == en7Var.c && en7Var2.f8078a == en7Var.f8078a;
                        ctf0 ctf0Var = on20Var.D;
                        ctf0Var.getClass();
                        arrayList.add(new CouponTypeUiModel(lv00.X(en7Var, ctf0Var), z2, true, z));
                        i2 = i3;
                    }
                    on20Var.G(new vb20(arrayList));
                }
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i4 = on20.m1;
                nwo0 nwo0VarC = on20Var.u.c();
                boolean zS0 = on20Var.s0();
                boolean z3 = ((a820) on20Var.D()).p;
                boolean z4 = ((a820) on20Var.D()).o;
                boolean zR0 = on20Var.r0();
                if (z4 && ((nwo0VarC.f24244a || ((zS0 && z3) || (nwo0VarC.b && z3))) && zR0)) {
                    on20Var.H(new ei20((byte) 12));
                }
                return Unit.f46060a;
        }
    }
}
