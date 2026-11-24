package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.coupon.impl.coupon.presentation.models.CouponTypeUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class oze extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ wze j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oze(wze wzeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = wzeVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wze wzeVar = this.j;
        switch (b) {
            case 0:
                return new oze(wzeVar, yjeVar, (byte) 0);
            case 1:
                return new oze(wzeVar, yjeVar, (byte) 1);
            default:
                return new oze(wzeVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((oze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((oze) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((oze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        en7 en7Var;
        Object value;
        Object value2;
        byte b = this.i;
        wze wzeVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List listA = wzeVar.p.A();
                ol60 ol60Var = wzeVar.G;
                ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
                int i = 0;
                for (Object obj2 : listA) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    en7 en7Var2 = (en7) obj2;
                    boolean z = i == listA.size() - 1;
                    p7m0 p7m0Var = wzeVar.B;
                    en7 en7Var3 = ((im7) p7m0Var.getValue()).d;
                    boolean z2 = en7Var3 != null && en7Var3.c == en7Var2.c && (en7Var = ((im7) p7m0Var.getValue()).d) != null && en7Var.f8078a == en7Var2.f8078a;
                    ctf0 ctf0Var = wzeVar.i;
                    en7Var2.getClass();
                    ctf0Var.getClass();
                    arrayList.add(new CouponTypeUiModel(lv00.X(en7Var2, ctf0Var), z2, true, z));
                    i = i2;
                }
                ol60Var.f(new jze(arrayList));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                wzeVar.D.f(wzeVar.n.a());
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (wzeVar.w()) {
                    p7m0 p7m0Var2 = wzeVar.A;
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, sc7.a((sc7) value2, 0L, 0.0d, null, null, null, false, false, null, true, false, null, null, null, null, 32511)));
                }
                p7m0 p7m0Var3 = wzeVar.B;
                do {
                    value = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value, im7.a((im7) value, null, false, true, null, 11)));
                return Unit.f46060a;
        }
    }
}
