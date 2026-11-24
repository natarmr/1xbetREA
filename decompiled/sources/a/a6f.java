package a;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.coupon.impl.coupon.presentation.models.CouponTypeUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class a6f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ r7f j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a6f(r7f r7fVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = r7fVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        r7f r7fVar = this.j;
        switch (b) {
            case 0:
                return new a6f(r7fVar, yjeVar, (byte) 0);
            case 1:
                return new a6f(r7fVar, yjeVar, (byte) 1);
            case 2:
                return new a6f(r7fVar, yjeVar, (byte) 2);
            case 3:
                return new a6f(r7fVar, yjeVar, (byte) 3);
            case 4:
                return new a6f(r7fVar, yjeVar, (byte) 4);
            case 5:
                return new a6f(r7fVar, yjeVar, (byte) 5);
            case 6:
                return new a6f(r7fVar, yjeVar, (byte) 6);
            default:
                return new a6f(r7fVar, yjeVar, (byte) 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a6f) create((hf6) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((a6f) create((xa50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((a6f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((a6f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((a6f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((a6f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((a6f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a6f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        r7f r7fVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                bby bbyVar = r7fVar.S1;
                if (bbyVar != null) {
                    v3c.N(bbyVar);
                }
                r7fVar.k0(r7fVar.g.c(), false);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                r7fVar.R(g3f.f10607a);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                List listA = r7fVar.q0.A();
                ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
                int i = 0;
                for (Object obj2 : listA) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    en7 en7Var = (en7) obj2;
                    boolean z = i == listA.size() - 1;
                    en7 en7Var2 = ((lye) r7fVar.C.f17117a.f10647a).k;
                    boolean z2 = en7Var2.c == en7Var.c && en7Var2.f8078a == en7Var.f8078a;
                    ctf0 ctf0Var = r7fVar.T0;
                    ctf0Var.getClass();
                    arrayList.add(new CouponTypeUiModel(lv00.X(en7Var, ctf0Var), z2, true, z));
                    i = i2;
                }
                r7fVar.R(new i3f(arrayList));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                i1w0 i1w0Var = r7fVar.V0;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                c8d c8dVar = new c8d(y7d.f42146a, o0w0.f24450a);
                ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0Var, copyOnWriteArrayListQ).listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (r7fVar.C1 == w4f.c) {
                    r7fVar.B();
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (r7fVar.w1 && r7fVar.C1 != w4f.c) {
                    r7fVar.h0(false, true, new x5f((byte) 5));
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                bby bbyVar2 = r7fVar.M1;
                if (bbyVar2 != null && bbyVar2.isActive()) {
                    r7fVar.g0();
                }
                return Unit.f46060a;
            default:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                r7fVar.y(new t4f(r7fVar, (byte) 9));
                return Unit.f46060a;
        }
    }
}
