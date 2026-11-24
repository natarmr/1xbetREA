package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class zzq0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ cyu k;
    public final /* synthetic */ sip l;
    public final /* synthetic */ CyberGamesPage m;
    public final /* synthetic */ jo20 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzq0(cyu cyuVar, sip sipVar, CyberGamesPage cyberGamesPage, jo20 jo20Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = cyuVar;
        this.l = sipVar;
        this.m = cyberGamesPage;
        this.n = jo20Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        switch (this.i) {
            case 0:
                return new zzq0(this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            case 1:
                return new zzq0(this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
            default:
                return new zzq0(this.k, this.l, this.m, this.n, yjeVar, (byte) 2);
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
        }
        return ((zzq0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        jo20 jo20Var = this.n;
        CyberGamesPage cyberGamesPage = this.m;
        cyu cyuVar = this.k;
        sip sipVar = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    roi0 roi0Var = (roi0) cyuVar.b;
                    this.j = true;
                    obj = roi0Var.k(sipVar, cyberGamesPage, jo20Var, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(n8n0.m((fzq0) it.next(), kpb.u(sipVar)));
                }
                return arrayList;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    roi0 roi0Var2 = (roi0) cyuVar.b;
                    this.j = true;
                    obj = roi0Var2.k(sipVar, cyberGamesPage, jo20Var, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Iterable iterable2 = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(r3d.q(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(n8n0.m((fzq0) it2.next(), kpb.u(sipVar)));
                }
                return arrayList2;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    roi0 roi0Var3 = (roi0) cyuVar.b;
                    this.j = true;
                    obj = roi0Var3.k(sipVar, cyberGamesPage, jo20Var, this);
                    if (obj == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Iterable iterable3 = (Iterable) obj;
                ArrayList arrayList3 = new ArrayList(r3d.q(iterable3, 10));
                Iterator it3 = iterable3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(n8n0.m((fzq0) it3.next(), kpb.u(sipVar)));
                }
                return arrayList3;
        }
    }
}
