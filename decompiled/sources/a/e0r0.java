package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes.dex */
public final class e0r0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0r0(boolean z, yez yezVar, cqq cqqVar, pkk0 pkk0Var, wpq wpqVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = z;
        this.k = yezVar;
        this.l = cqqVar;
        this.m = pkk0Var;
        this.n = wpqVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        Object obj4 = this.l;
        switch (b) {
            case 0:
                e0r0 e0r0Var = new e0r0((cyu) obj4, (CyberGamesPage) obj3, (sip) obj2, yjeVar);
                e0r0Var.k = obj;
                return e0r0Var;
            case 1:
                return new e0r0(this.j, (yez) this.k, (cqq) obj4, (pkk0) obj3, (wpq) obj2, yjeVar);
            default:
                return new e0r0((mie0) this.k, (fge0) obj4, (clz) obj3, (n1r) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((e0r0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((e0r0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((e0r0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.l;
        Object obj3 = this.m;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                kmq kmqVar = (kmq) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    List list = (List) ((n660) ((cyu) obj2).c).r((CyberGamesPage) obj3, (sip) obj4).b();
                    if (list != null) {
                        this.k = null;
                        this.j = true;
                        if (kmqVar.a(list, this) == wneVar) {
                            return wneVar;
                        }
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
                z1x.P(obj);
                if (this.j && ((yez) this.k).c()) {
                    cqq.a((cqq) obj2);
                    pkk0 pkk0Var = (pkk0) obj3;
                    if (pkk0Var != null) {
                        ((r3k) pkk0Var).b();
                    }
                } else {
                    ((ypq) ((wpq) obj4)).b(true);
                }
                return Unit.f46060a;
            default:
                n1r n1rVar = (n1r) obj4;
                clz clzVar = (clz) obj3;
                fge0 fge0Var = (fge0) obj2;
                Object obj5 = wne.f39444a;
                boolean z2 = this.j;
                try {
                    if (!z2) {
                        z1x.P(obj);
                        ls40 ls40Var = (ls40) ((mie0) this.k).f21842a;
                        if (ls40Var != null) {
                            ls40Var.b = d5c.a(fge0Var.x);
                        }
                        this.j = true;
                        byte b2 = 23;
                        Object objD0 = qjj.d0(fge0Var.f9488a, new wn2(b2, (yje) null, new ege0(fge0Var, null), fge0Var, s0x.P(getContext())), this);
                        if (objD0 != obj5) {
                            objD0 = Unit.f46060a;
                        }
                        if (objD0 != obj5) {
                            objD0 = Unit.f46060a;
                        }
                        if (objD0 == obj5) {
                            return obj5;
                        }
                    } else {
                        if (!z2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    clzVar.x().f(n1rVar);
                    return Unit.f46060a;
                } catch (Throwable th) {
                    clzVar.x().f(n1rVar);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0r0(mie0 mie0Var, fge0 fge0Var, clz clzVar, n1r n1rVar, yje yjeVar) {
        super(2, yjeVar);
        this.k = mie0Var;
        this.l = fge0Var;
        this.m = clzVar;
        this.n = n1rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0r0(cyu cyuVar, CyberGamesPage cyberGamesPage, sip sipVar, yje yjeVar) {
        super(2, yjeVar);
        this.l = cyuVar;
        this.m = cyberGamesPage;
        this.n = sipVar;
    }
}
