package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class l550 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ d650 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l550(d650 d650Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = d650Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        d650 d650Var = this.j;
        switch (b) {
            case 0:
                return new l550(d650Var, yjeVar, (byte) 0);
            case 1:
                return new l550(d650Var, yjeVar, (byte) 1);
            case 2:
                return new l550(d650Var, yjeVar, (byte) 2);
            case 3:
                return new l550(d650Var, yjeVar, (byte) 3);
            case 4:
                return new l550(d650Var, yjeVar, (byte) 4);
            case 5:
                return new l550(d650Var, yjeVar, (byte) 5);
            case 6:
                return new l550(d650Var, yjeVar, (byte) 6);
            case 7:
                return new l550(d650Var, yjeVar, (byte) 7);
            case 8:
                return new l550(d650Var, yjeVar, (byte) 8);
            case 9:
                return new l550(d650Var, yjeVar, (byte) 9);
            case 10:
                return new l550(d650Var, yjeVar, (byte) 10);
            default:
                return new l550(d650Var, yjeVar, (byte) 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((l550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((l550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((l550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((l550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((l550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((l550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((l550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((l550) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((l550) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((l550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((l550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((l550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0212  */
    /* JADX WARN: Code duplicated, block: B:72:0x0215  */
    /* JADX WARN: Code duplicated, block: B:74:0x0219  */
    /* JADX WARN: Code duplicated, block: B:75:0x021c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0220  */
    /* JADX WARN: Code duplicated, block: B:81:0x025f A[LOOP:6: B:79:0x0256->B:81:0x025f, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ef40 ef40Var;
        i1w0 i1w0VarC;
        ListIterator listIteratorP;
        paw pawVar;
        vbj vbjVar;
        d3j d3jVar;
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        byte b = this.i;
        obj objVar = obj.f24982a;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z = false;
        d650 d650Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                d650Var.J.f35083a.c("aggregator_game_favor_choose");
                d650Var.K.f11237a.a(xun.f41520a, 11482L);
                s91.d(d650Var.H, new fr1(null, null, 3), false, false, 12);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                f3j f3jVar = d650Var.X;
                String strJ = sre0.f32672a.b(o450.class).J();
                String str = "";
                if (strJ == null) {
                    strJ = "";
                }
                for (Object obj3 : (Iterable) d650Var.g1.getValue()) {
                    if (((ef40) obj3) instanceof oe40) {
                        obj2 = obj3;
                        ef40Var = (ef40) obj2;
                        if (ef40Var != null && (ef40Var instanceof oe40)) {
                            vbjVar = ((oe40) ef40Var).f25107a;
                            if ((vbjVar instanceof qbj) && (d3jVar = (d3j) ((qbj) vbjVar).f28448a) != null) {
                                if (d3jVar instanceof y2j) {
                                    str = "start";
                                } else if (d3jVar instanceof x2j) {
                                    str = "progress";
                                } else if (d3jVar instanceof z2j) {
                                    str = "finish";
                                }
                            }
                        }
                        f3jVar.getClass();
                        ((b4j) f3jVar.l).f(strJ, str);
                        ((je) f3jVar.m).d(strJ, str);
                        i1w0VarC = ((oeg0) f3jVar.j).c();
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                        listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new a1w0(new e8g(f3jVar, (byte) 23))), i1w0VarC, copyOnWriteArrayListQ, 0);
                        while (true) {
                            pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0VarC.a((oe50) pawVar.next());
                            }
                            break;
                        }
                    }
                }
                ef40Var = (ef40) obj2;
                if (ef40Var != null) {
                    vbjVar = ((oe40) ef40Var).f25107a;
                    if (vbjVar instanceof qbj) {
                        if (d3jVar instanceof y2j) {
                            str = "start";
                        } else if (d3jVar instanceof x2j) {
                            str = "progress";
                        } else if (d3jVar instanceof z2j) {
                            str = "finish";
                        }
                    }
                }
                f3jVar.getClass();
                ((b4j) f3jVar.l).f(strJ, str);
                ((je) f3jVar.m).d(strJ, str);
                i1w0VarC = ((oeg0) f3jVar.j).c();
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC);
                listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new a1w0(new e8g(f3jVar, (byte) 23))), i1w0VarC, copyOnWriteArrayListQ2, 0);
                while (true) {
                    pawVar = (paw) listIteratorP;
                    if (pawVar.hasNext()) {
                        i1w0VarC.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                i1w0 i1w0VarC2 = d650Var.I.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0VarC2);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC2, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (pawVar2.hasNext()) {
                        i1w0VarC2.a((oe50) pawVar2.next());
                    }
                    break;
                }
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i = d650.k1;
                sac.V(jiu0.a(d650Var), w550.f38569a, null, d650Var.L.f22085a, new x550(d650Var, z, objArr == true ? 1 : 0, (byte) 1), 10);
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                int i2 = d650.k1;
                d650Var.c0.d("my_aggregator");
                d650Var.d0.l(y1p.MY_AGGREGATOR);
                s91.d(d650Var.H, new jr1(new dvc0(0)), false, false, 12);
                break;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                int i3 = d650.k1;
                d650Var.c0.e("my_aggregator");
                d650Var.d0.j(y1p.MY_AGGREGATOR);
                s91.d(d650Var.H, new jr1(new cvc0(d7v.b)), false, false, 12);
                break;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                d650Var.a1.getClass();
                wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
                d650Var.b.c(new AggregatorScreenModel(null, null, 0L, vl1.f37601a, wgh0Var, 0L, 0L, null, false, Response.REQUEST_TERMINATED));
                d650Var.f.g(wgh0Var);
                d650Var.o.C("my_aggregator");
                break;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = d650Var.g1;
                do {
                    value = p7m0Var.getValue();
                    Iterable<Object> iterable = (Iterable) p7m0Var.getValue();
                    arrayList = new ArrayList(r3d.q(iterable, 10));
                    for (Object we40Var : iterable) {
                        if (we40Var instanceof we40) {
                            we40Var = new we40(objVar);
                        }
                        arrayList.add(we40Var);
                    }
                } while (!p7m0Var.m(value, arrayList));
                break;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = d650Var.g1;
                do {
                    value2 = p7m0Var2.getValue();
                    Iterable<Object> iterable2 = (Iterable) p7m0Var2.getValue();
                    arrayList2 = new ArrayList(r3d.q(iterable2, 10));
                    for (Object xe40Var : iterable2) {
                        if (xe40Var instanceof xe40) {
                            xe40Var = new xe40(objVar);
                        }
                        arrayList2.add(xe40Var);
                    }
                } while (!p7m0Var2.m(value2, arrayList2));
                break;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                ol60 ol60Var = d650Var.h1;
                uuz uuzVar = fk60.b;
                ol60Var.f(new x450());
                break;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                if (d650Var.t0.r(fk60.MY_AGGREGATOR_INTERNAL)) {
                    sac.V(jiu0.a(d650Var), null, null, d650Var.L.b, new l550(d650Var, objArr2 == true ? 1 : 0, (byte) 9), 11);
                }
                break;
            default:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                d650Var.e0.c("my_aggregator");
                d650Var.f0.i("my_aggregator");
                d650Var.h1.f(y450.f41986a);
                break;
        }
        return Unit.f46060a;
    }
}
