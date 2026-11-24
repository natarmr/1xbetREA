package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.dota.api.presentation.CyberGameDotaScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class bbl extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ebl k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bbl(ebl eblVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = eblVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ebl eblVar = this.k;
        switch (b) {
            case 0:
                bbl bblVar = new bbl(eblVar, yjeVar, (byte) 0);
                bblVar.j = ((Boolean) obj).booleanValue();
                return bblVar;
            case 1:
                bbl bblVar2 = new bbl(eblVar, yjeVar, (byte) 1);
                bblVar2.j = ((Boolean) obj).booleanValue();
                return bblVar2;
            case 2:
                bbl bblVar3 = new bbl(eblVar, yjeVar, (byte) 2);
                bblVar3.j = ((Boolean) obj).booleanValue();
                return bblVar3;
            default:
                return new bbl(eblVar, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((bbl) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((bbl) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((bbl) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bbl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        byte b = this.i;
        ebl eblVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = ebl.g0;
                p7m0 p7m0Var = eblVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, f9l.a((f9l) value, null, null, null, null, null, null, false, null, null, false, null, z, false, null, 0, 0, null, 66846719)));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    eblVar.I.h();
                }
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = ebl.g0;
                p7m0 p7m0Var2 = eblVar.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    boolean z4 = z3;
                    if (p7m0Var2.m(value3, f9l.a((f9l) value3, null, null, null, null, null, null, false, null, null, z4, null, false, false, null, 0, 0, null, 67092479))) {
                        return Unit.f46060a;
                    }
                    z3 = z4;
                }
                break;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    j3c j3cVar = eblVar.D;
                    CyberGameDotaScreenParams cyberGameDotaScreenParams = eblVar.r;
                    long j = cyberGameDotaScreenParams.e;
                    long j2 = cyberGameDotaScreenParams.d;
                    this.j = true;
                    objA = j3cVar.a(j, j2, this);
                    if (objA == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                ypl0 ypl0Var = (ypl0) objA;
                int i3 = ebl.g0;
                p7m0 p7m0Var3 = eblVar.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, f9l.a((f9l) value2, null, null, null, ypl0Var, null, null, false, null, null, false, null, false, false, null, 0, 0, null, 67108847)));
                return Unit.f46060a;
        }
    }
}
