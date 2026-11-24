package a;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;

/* JADX INFO: loaded from: classes4.dex */
public final class uig extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xig k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uig(xig xigVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = xigVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        xig xigVar = this.k;
        switch (b) {
            case 0:
                return new uig(xigVar, yjeVar, (byte) 0);
            case 1:
                return new uig(xigVar, yjeVar, (byte) 1);
            case 2:
                return new uig(xigVar, yjeVar, (byte) 2);
            case 3:
                return new uig(xigVar, yjeVar, (byte) 3);
            default:
                return new uig(xigVar, yjeVar, (byte) 4);
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
            case 3:
                break;
        }
        return ((uig) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        byte b2 = 0;
        xig xigVar = this.k;
        yje yjeVar = null;
        byte b3 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    o3c o3cVar = xigVar.t;
                    CyberChampsMainParams cyberChampsMainParams = xigVar.p;
                    byte b4 = cyberChampsMainParams.f46548a.f46556a;
                    List listC = cyberChampsMainParams.d;
                    if (listC.isEmpty()) {
                        long j = cyberChampsMainParams.b;
                        listC = j == 40 ? iun.f15405a : kotlin.collections.a.c(Long.valueOf(j));
                    }
                    List list = listC;
                    sip sipVar = xigVar.o;
                    o3cVar.getClass();
                    list.getClass();
                    sipVar.getClass();
                    yje yjeVar2 = null;
                    a1g a1gVarD0 = dub.d0(new dnq(new vsg0(new ic1((gmq) aoq.c(aoq.c(new vsg0(new t2h(o3cVar, yjeVar2, b2)), new r2h(null, o3cVar, org.xplatform.cyber.section.api.domain.entity.d.d(b4), sipVar, list, ((viu) o3cVar.d).a())), new zo1(yjeVar2, (Object) o3cVar, (byte) 13)), yjeVar2, (Object) o3cVar, (Object) sipVar, (byte) 21)), new rl2(3, yjeVar2, b3), (byte) 1), ((m0o0) ((ocl) o3cVar.h).f25032a).b(), new vsg0(new t2h(o3cVar, yjeVar2, b3)), ((x2u) o3cVar.g).f40188a.f4698a.d, new vsg0(new u2h(o3cVar, b4, (yje) null)), new q2h(null));
                    e9g e9gVar = new e9g(xigVar, yjeVar2, (byte) 5);
                    this.j = true;
                    Object objC = a1gVarD0.c(new vnq(h660.f12515a, e9gVar, (byte) 2), this);
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar) {
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
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                p7m0 p7m0Var = xigVar.D.f3021a.f4698a.c;
                vig vigVar = new vig(xigVar, b2);
                this.j = true;
                p7m0Var.c(vigVar, this);
                return wneVar2;
            case 2:
                Object obj2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    lhf0 lhf0Var = xigVar.z;
                    sip sipVar2 = xigVar.o;
                    lhf0Var.getClass();
                    sipVar2.getClass();
                    chg chgVar = ((dhg) ((uyn) lhf0Var.b).f36498a).f6088a;
                    chgVar.getClass();
                    bhg bhgVar = new bhg(chgVar.f4358a, sipVar2, (byte) 0);
                    rch rchVar = ((vsu) lhf0Var.c).f37970a;
                    rchVar.getClass();
                    bhg bhgVar2 = new bhg(rchVar.f30238a.f25617a, sipVar2, (byte) 1);
                    sch schVar = new sch(lhf0Var, sipVar2, yjeVar, b2);
                    vig vigVar2 = new vig(xigVar, b3);
                    this.j = true;
                    Object objG = tdc.G(this, vigVar2, new kh1((Object) schVar, yjeVar, (byte) 9), pul.j, new gmq[]{bhgVar, bhgVar2});
                    if (objG != wne.f39444a) {
                        objG = Unit.f46060a;
                    }
                    if (objG == obj2) {
                        return obj2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bqc bqcVar = xigVar.B;
                    this.j = true;
                    if (bqcVar.a() == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    p7m0 p7m0Var2 = ((rch) xigVar.A.b).f30238a.f25617a;
                    sip sipVar3 = sip.c;
                    iun iunVar = iun.f15405a;
                    p7m0Var2.o(null, xp20.f(new Pair(sipVar3, iunVar), new Pair(sip.b, iunVar)));
                    bqc bqcVar2 = xigVar.C;
                    this.j = true;
                    bqcVar2.f3021a.f4698a.c.o(null, Boolean.FALSE);
                    if (Unit.f46060a == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
