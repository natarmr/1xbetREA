package a;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.daily_tasks.impl.workers.DailyTaskFinishingNotificationWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class r120 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ w220 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r120(w220 w220Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = w220Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        w220 w220Var = this.j;
        switch (b) {
            case 0:
                return new r120(w220Var, yjeVar, (byte) 0);
            case 1:
                return new r120(w220Var, yjeVar, (byte) 1);
            case 2:
                return new r120(w220Var, yjeVar, (byte) 2);
            case 3:
                return new r120(w220Var, yjeVar, (byte) 3);
            case 4:
                return new r120(w220Var, yjeVar, (byte) 4);
            default:
                return new r120(w220Var, yjeVar, (byte) 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((r120) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((r120) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((r120) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((r120) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yje yjeVar = null;
        w220 w220Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                lef0 lef0Var = w220Var.V;
                boolean z = w220Var.c1.v;
                j400 j400Var = (j400) lef0Var.f19899a;
                if (z) {
                    j400Var.d(false);
                } else {
                    bby bbyVar = j400Var.g;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        sje sjeVar = j400Var.f;
                        qlq0.f28947a.getClass();
                        rq40.f30914a.getClass();
                        j400Var.k = new plq0(rq40.b());
                        List listC = kotlin.collections.a.c(oqt0.class);
                        long j = j400Var.i;
                        uen uenVar = wen.b;
                        bfn bfnVar = bfn.SECONDS;
                        long jW0 = ibc.w0(300L, bfnVar);
                        wen.b.getClass();
                        j400Var.g = sac.d0(sjeVar, "LimitsRsRepositoryImpl_getLimits", 300L, wen.d(j, 0L) ? 0L : wen.l(wen.j(jW0, j), bfnVar), j400Var.d.b, 300L, listC, new z8z((byte) 22), new slx(j400Var, yjeVar, (byte) 13), 16);
                    }
                    j400Var.d(true);
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                w220Var.x1.f(new v8h0(true));
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                w220Var.z();
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                w220Var.A();
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                i1w0 i1w0VarS = w220Var.s.s();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new q0w0(null)));
                c8d c8dVar = new c8d(y7d.f42146a, o0w0.f24450a);
                ListIterator listIterator = cs0.h(copyOnWriteArrayList, c8dVar, c8dVar, i1w0VarS, copyOnWriteArrayList).listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (pawVar.hasNext()) {
                        i1w0VarS.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            default:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                cr crVar = w220Var.E0;
                us00 us00Var = (us00) crVar.c;
                cpv0 cpv0VarD = cpv0.d(us00Var);
                cpv0VarD.getClass();
                ga3.I(cpv0VarD, us00Var);
                cpv0 cpv0VarD2 = cpv0.d((us00) crVar.c);
                cpv0VarD2.getClass();
                sl50 sl50Var = sl50.f32381a;
                o4e o4eVar = new o4e(new hl50(null), sl50.f32381a, false, false, false, false, -1L, -1L, CollectionsKt.P0(new LinkedHashSet()));
                ag90 ag90Var = new ag90(DailyTaskFinishingNotificationWorker.class);
                ((ppv0) ag90Var.c).j = o4eVar;
                bg90 bg90Var = (bg90) ag90Var.k();
                yko[] ykoVarArr = yko.f42800a;
                cpv0VarD2.b("DailyTaskFinishingNotificationWorker", bg90Var);
                break;
        }
        return Unit.f46060a;
    }
}
