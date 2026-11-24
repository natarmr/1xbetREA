package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;

/* JADX INFO: loaded from: classes4.dex */
public final class yhg extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ aig k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yhg(aig aigVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = aigVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        aig aigVar = this.k;
        switch (b) {
            case 0:
                return new yhg(aigVar, yjeVar, (byte) 0);
            case 1:
                return new yhg(aigVar, yjeVar, (byte) 1);
            case 2:
                return new yhg(aigVar, yjeVar, (byte) 2);
            default:
                return new yhg(aigVar, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((yhg) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        aig aigVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gr00 gr00Var = aigVar.q;
                    CyberChampsMainParams cyberChampsMainParams = aigVar.p;
                    gr00Var.getClass();
                    cyberChampsMainParams.getClass();
                    p7m0 p7m0Var = ((nsu) gr00Var.f11760a).f24066a.f4698a.d;
                    p7m0 p7m0Var2 = ((cqc) gr00Var.b).f4786a.f4698a.b;
                    p7m0 p7m0Var3 = ((x2u) gr00Var.c).f40188a.f4698a.c;
                    p7m0 p7m0Var4 = ((x2u) gr00Var.d).f40188a.f4698a.f6413a;
                    ocl oclVar = (ocl) gr00Var.e;
                    bek bekVar = sip.f32274a;
                    chg chgVar = ((dhg) oclVar.f25032a).f6088a;
                    chgVar.getClass();
                    a1g a1gVarD0 = dub.d0(p7m0Var, p7m0Var2, p7m0Var3, p7m0Var4, new h2c(chgVar.f4358a), new zcg(cyberChampsMainParams, null));
                    m0g m0gVar = new m0g(aigVar, (byte) 22);
                    this.j = true;
                    if (a1gVarD0.c(m0gVar, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bqc bqcVar = aigVar.u;
                    this.j = true;
                    if (bqcVar.a() == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    soi0 soi0Var = aigVar.s;
                    this.j = true;
                    if (soi0Var.b("") == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    nsu nsuVar = aigVar.t;
                    this.j = true;
                    if (nsuVar.a() == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
