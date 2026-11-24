package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class iyv extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jyv k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iyv(jyv jyvVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = jyvVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jyv jyvVar = this.k;
        switch (b) {
            case 0:
                iyv iyvVar = new iyv(jyvVar, yjeVar, (byte) 0);
                iyvVar.j = obj;
                return iyvVar;
            case 1:
                iyv iyvVar2 = new iyv(jyvVar, yjeVar, (byte) 1);
                iyvVar2.j = obj;
                return iyvVar2;
            case 2:
                iyv iyvVar3 = new iyv(jyvVar, yjeVar, (byte) 2);
                iyvVar3.j = obj;
                return iyvVar3;
            case 3:
                iyv iyvVar4 = new iyv(jyvVar, yjeVar, (byte) 3);
                iyvVar4.j = obj;
                return iyvVar4;
            case 4:
                iyv iyvVar5 = new iyv(jyvVar, yjeVar, (byte) 4);
                iyvVar5.j = obj;
                return iyvVar5;
            default:
                iyv iyvVar6 = new iyv(jyvVar, yjeVar, (byte) 5);
                iyvVar6.j = obj;
                return iyvVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((iyv) create((uyv) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((iyv) create((ryv) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((iyv) create((nyv) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((iyv) create((oyv) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((iyv) create((myv) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((iyv) create((lyv) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ArrayList arrayList = null;
        jyv jyvVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                uyv uyvVar = (uyv) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (uyvVar instanceof syv) {
                    gst gstVar = jyv.R1;
                    jyvVar.G0().e.setVisibility(0);
                    ((eyv) jyvVar.P1.getValue()).f = ((syv) uyvVar).f33041a;
                } else {
                    if (!Intrinsics.d(uyvVar, tyv.f34775a)) {
                        t9f.b();
                        return null;
                    }
                    gst gstVar2 = jyv.R1;
                    jyvVar.G0().e.setVisibility(8);
                }
                return Unit.f46060a;
            case 1:
                ryv ryvVar = (ryv) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (ryvVar instanceof pyv) {
                    gst gstVar3 = jyv.R1;
                    jyvVar.G0().b.setVisibility(0);
                    ((eyv) jyvVar.Q1.getValue()).f = ((pyv) ryvVar).f27817a;
                } else {
                    if (!Intrinsics.d(ryvVar, qyv.f29553a)) {
                        t9f.b();
                        return null;
                    }
                    gst gstVar4 = jyv.R1;
                    jyvVar.G0().b.setVisibility(8);
                }
                return Unit.f46060a;
            case 2:
                nyv nyvVar = (nyv) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                gst gstVar5 = jyv.R1;
                eyv eyvVar = (eyv) jyvVar.Q1.getValue();
                r21 r21Var = nyvVar.f24347a;
                eyvVar.getClass();
                List<t21> list = (List) eyvVar.f;
                if (list != null) {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (t21 s21Var : list) {
                        if (s21Var instanceof s21) {
                            r21 r21Var2 = ((s21) s21Var).b;
                            s21Var = new s21(r21Var2 == r21Var, r21Var2);
                        }
                        arrayList.add(s21Var);
                    }
                }
                eyvVar.f = arrayList;
                eyvVar.g();
                jyvVar.O1.putSerializable("selected_bet_type_bundle_key", nyvVar.f24347a);
                return Unit.f46060a;
            case 3:
                oyv oyvVar = (oyv) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                gst gstVar6 = jyv.R1;
                eyv eyvVar2 = (eyv) jyvVar.P1.getValue();
                v21 v21Var = oyvVar.f26076a;
                eyvVar2.getClass();
                List<t21> list2 = (List) eyvVar2.f;
                if (list2 != null) {
                    arrayList = new ArrayList(r3d.q(list2, 10));
                    for (t21 x21Var : list2) {
                        if (x21Var instanceof x21) {
                            v21 v21Var2 = ((x21) x21Var).b;
                            x21Var = new x21(v21Var2 == v21Var, v21Var2);
                        }
                        arrayList.add(x21Var);
                    }
                }
                eyvVar2.f = arrayList;
                eyvVar2.g();
                jyvVar.O1.putSerializable("selected_game_type_bundle_key", oyvVar.f26076a);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                gst gstVar7 = jyv.R1;
                jyvVar.G0().d.setEnabled(((myv) obj2).f22621a);
                return Unit.f46060a;
            default:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                gst gstVar8 = jyv.R1;
                jyvVar.G0().c.setEnabled(((lyv) obj2).f20881a);
                return Unit.f46060a;
        }
    }
}
