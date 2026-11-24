package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class r8w extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ naw j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8w(naw nawVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = nawVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        naw nawVar = this.j;
        switch (b) {
            case 0:
                return new r8w(nawVar, yjeVar, (byte) 0);
            case 1:
                return new r8w(nawVar, yjeVar, (byte) 1);
            case 2:
                return new r8w(nawVar, yjeVar, (byte) 2);
            case 3:
                return new r8w(nawVar, yjeVar, (byte) 3);
            case 4:
                return new r8w(nawVar, yjeVar, (byte) 4);
            case 5:
                return new r8w(nawVar, yjeVar, (byte) 5);
            case 6:
                return new r8w(nawVar, yjeVar, (byte) 6);
            case 7:
                return new r8w(nawVar, yjeVar, (byte) 7);
            case 8:
                return new r8w(nawVar, yjeVar, (byte) 8);
            default:
                return new r8w(nawVar, yjeVar, (byte) 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r8w) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((r8w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((r8w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((r8w) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((r8w) create((za50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((r8w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((r8w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((r8w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((r8w) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r8w) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        byte b2 = 2;
        yje yjeVar = null;
        byte b3 = 1;
        byte b4 = 4;
        byte b5 = 0;
        naw nawVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = naw.d1;
                nawVar.M(false);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                naw nawVar2 = this.j;
                jpc jpcVar = nawVar2.b0;
                sys0 sys0Var = nawVar2.d;
                jpcVar.getClass();
                sys0Var.getClass();
                tnm0 tnm0Var = (tnm0) jpcVar.f16892a.f35622a;
                tnm0Var.getClass();
                tnm0Var.c(sys0Var).clear();
                qoj0 qoj0Var = tnm0Var.f34244a;
                Unit unit = Unit.f46060a;
                qoj0Var.g(unit);
                bvc bvcVarA = jiu0.a(nawVar2);
                n5w n5wVar = new n5w(1, nawVar2, naw.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 10);
                mne mneVar = nawVar2.L;
                sac.V(bvcVarA, n5wVar, null, mneVar.f22085a, new fhq(nawVar2, yjeVar, (byte) 16), 10);
                ywq0 ywq0Var = nawVar2.j;
                s77 s77Var = nawVar2.D0;
                ywq0Var.getClass();
                s77Var.getClass();
                fnq fnqVar = new fnq(new zj2(vtb.M(((m0w) ((rrd) ywq0Var.f43384a).g).f20975a), ywq0Var, s77Var, (byte) 18), new caw(nawVar2, null, (byte) 1), (byte) 4);
                bvc bvcVarA2 = jiu0.a(nawVar2);
                ax5 ax5Var = nawVar2.b1;
                slb.U(fnqVar, d5c.S(bvcVarA2, ax5Var));
                slb.U(new fnq(vtb.M(((m0w) nawVar2.k.f39903a.g).b), new caw(nawVar2, null, (byte) 2), (byte) 4), jiu0.a(nawVar2));
                td9 td9Var = nawVar2.J;
                p8w p8wVar = new p8w(nawVar2, (byte) 3);
                td9Var.getClass();
                s5w s5wVar = (s5w) td9Var.c;
                s5wVar.getClass();
                s5wVar.e = p8wVar;
                if (nawVar2.D0 == s77.EVENTS) {
                    q37 q37Var = nawVar2.l0;
                    a1w a1wVar = nawVar2.T0 ? a1w.x : a1w.y;
                    q37Var.getClass();
                    q37Var.b.f1961a.c(a1wVar.a());
                }
                if (nawVar2.u0.f()) {
                    nawVar2.v0.n(false);
                    nawVar2.Z0.f(t8w.f33533a);
                }
                qjj.W(jiu0.a(nawVar2), ax5Var, null, new u9w(nawVar2, yjeVar, b5), 2);
                slb.U(new fnq(new dnq(nawVar2.I.b(), new baw(nawVar2, yjeVar, b3), (byte) 1), new v9w(nawVar2, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(nawVar2), mneVar.f22085a));
                sac.T(new fnq(new va(((qe50) nawVar2.P.b).b, (byte) 15), new r8w(nawVar2, yjeVar, b4), (byte) 4), d5c.S(jiu0.a(nawVar2), mneVar.f22085a), gaw.h);
                uzc uzcVar = (uzc) nawVar2.H.b;
                uzcVar.getClass();
                slb.U(new fnq(nkb.z(new rzc(uzcVar, yjeVar, b5)), new r8w(nawVar2, yjeVar, b5), (byte) 4), d5c.S(jiu0.a(nawVar2), ax5Var));
                return unit;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                i1w0 i1w0Var = nawVar.O;
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
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                boolean zA = nawVar.Y.f15225a.a();
                if (!Boolean.valueOf(zA).equals(nawVar.K0) || !nawVar.N0) {
                    nawVar.N0 = true;
                    p7m0 p7m0Var = nawVar.W0;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, false, false, null, false, false, false, !zA, false, null, null, false, false, 32639)));
                    if (zA) {
                        nawVar.G0 = 0L;
                        nawVar.D(pdj.f26809a);
                        if (nawVar.D0 == s77.SALE) {
                            nawVar.A();
                        } else {
                            nawVar.P();
                            nawVar.A();
                        }
                        nawVar.O();
                        slb.U(new fnq(vtb.M(((tnm0) nawVar.l.f22059a.f35622a).f34244a), new r8w(nawVar, yjeVar, (byte) 8), (byte) 4), jiu0.a(nawVar));
                        slb.U(new fnq(((l77) nawVar.m.f24171a).c, new r8w(nawVar, yjeVar, (byte) 9), (byte) 4), jiu0.a(nawVar));
                        nawVar.K();
                    }
                }
                nawVar.K0 = Boolean.valueOf(zA);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                nawVar.Z0.f(w8w.f38746a);
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                nawVar.a1.f(f9w.f9175a);
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                nawVar.Z0.f(h9w.f12697a);
                nawVar.M(false);
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                List list2 = naw.d1;
                sac.V(jiu0.a(nawVar), daw.f5772a, null, null, new r8w(nawVar, yjeVar, b2), 14);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                List list3 = naw.d1;
                nawVar.M(false);
                return Unit.f46060a;
            default:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                List list4 = naw.d1;
                nawVar.M(false);
                return Unit.f46060a;
        }
    }
}
