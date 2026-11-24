package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class wt3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ zu3 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt3(zu3 zu3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = zu3Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zu3 zu3Var = this.j;
        switch (b) {
            case 0:
                return new wt3(zu3Var, yjeVar, (byte) 0);
            case 1:
                return new wt3(zu3Var, yjeVar, (byte) 1);
            case 2:
                return new wt3(zu3Var, yjeVar, (byte) 2);
            case 3:
                return new wt3(zu3Var, yjeVar, (byte) 3);
            default:
                return new wt3(zu3Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((wt3) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0039 A[PHI: r5
  0x0039: PHI (r5v4 long) = (r5v1 long), (r5v2 long) binds: [B:7:0x0037, B:10:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        long j;
        byte b = this.i;
        zu3 zu3Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = zu3.s0;
                zu3Var.A(0L);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                zgk zgkVar = (zgk) zu3Var.i.get();
                zgkVar.f44348a.b("root_user", zgkVar.b.g() ? "1" : "0");
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                v3c.N(((flt) zu3Var.l.get()).d);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                flt fltVar = (flt) zu3Var.l.get();
                v3c.N(fltVar.d);
                sje sjeVar = fltVar.c;
                long jA = 600;
                if (fltVar.e == 0) {
                    j = jA;
                } else {
                    jA = 600 - ((fltVar.b.a() - fltVar.e) / 1000);
                    if (jA < 0) {
                        j = 0;
                    } else {
                        j = jA;
                    }
                }
                fltVar.d = sac.d0(sjeVar, "GeoUpdateExecutorImpl.start", 600L, j, null, 0L, null, null, new gkr(fltVar, null, (byte) 11), 232);
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                return ((pru) zu3Var.J.get()).a();
        }
    }
}
