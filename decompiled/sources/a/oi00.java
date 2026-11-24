package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.feed.linelive.presentation.feeds.child.liveexpress.models.LiveExpressItemsScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class oi00 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ qi00 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi00(qi00 qi00Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = qi00Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        qi00 qi00Var = this.k;
        switch (b) {
            case 0:
                return new oi00(qi00Var, yjeVar, (byte) 0);
            default:
                return new oi00(qi00Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((oi00) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        qi00 qi00Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xzp xzpVar = qi00Var.r;
                    LiveExpressItemsScreenParams liveExpressItemsScreenParams = qi00Var.p;
                    long j = liveExpressItemsScreenParams.f46667a;
                    aj00 aj00Var = liveExpressItemsScreenParams.b;
                    xzpVar.getClass();
                    aj00Var.getClass();
                    utb utbVarC = aoq.c(bkb.i0(bkb.h0(8L, TimeUnit.SECONDS, new giu(xzpVar, j, aj00Var, null)), "GetLiveExpressTabGamesScenario.invoke()", 3, 0L, null, null, new t3t(xzpVar, (byte) 5), 28), new sot((yje) null, xzpVar, (byte) 8));
                    jz6 jz6Var = new jz6(qi00Var, (byte) 4);
                    this.j = true;
                    if (utbVarC.c(jz6Var, this) == wneVar) {
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
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    spc spcVar = qi00Var.B;
                    this.j = true;
                    if (spcVar.a(this) == wneVar2) {
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
        }
    }
}
