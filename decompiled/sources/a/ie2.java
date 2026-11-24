package a;

import java.net.UnknownHostException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ie2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ le2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ie2(le2 le2Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = le2Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        le2 le2Var = this.k;
        switch (b) {
            case 0:
                return new ie2(le2Var, yjeVar, (byte) 0);
            default:
                return new ie2(le2Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ie2) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        le2 le2Var = this.k;
        byte b2 = 1;
        switch (b) {
            case 0:
                n0o0 n0o0Var = le2Var.B;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    n660 n660Var = le2Var.r;
                    Set set = le2Var.p.f46900a;
                    boolean z2 = ((sff0) n0o0Var.getValue()).J1;
                    boolean z3 = ((sff0) n0o0Var.getValue()).O1;
                    n660Var.getClass();
                    nr nrVar = (nr) n660Var.f22981a;
                    yje yjeVar = null;
                    utb utbVarC = aoq.c(bkb.h0(8L, TimeUnit.SECONDS, new fhq(nrVar, set, yjeVar, (byte) 10)), new b9u((byte) 3, yjeVar, nrVar, z2, z3));
                    abp abpVar = (abp) ((i9u) n660Var.d).f14406a.b;
                    byte b3 = 0;
                    gmq gmqVarL = ulb.L(bkb.i0(dub.f0(utbVarC, i120.W(new p6d(abp.d(abpVar.b), new h2c(abpVar.f, (byte) 6), new y8p(3, yjeVar, b3), (byte) 1)), new eu4(new qaf0(i120.W(vtb.N(((g8n0) ((b3c) n660Var.c).f1895a.b).f10874a)), (byte) 14), (byte) 21), new fl9(n660Var, yjeVar, (byte) 9)), "GamesLiveResultsViewModel.loadData", 3, 0L, q3d.j(oqt0.class, zhi0.class, UnknownHostException.class), null, null, 52), ((mne) n660Var.b).b);
                    he2 he2Var = new he2(le2Var, b3);
                    this.j = true;
                    if (gmqVarL.c(he2Var, this) == wneVar) {
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
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    gmq gmqVarA = le2Var.s.a();
                    he2 he2Var2 = new he2(le2Var, b2);
                    this.j = true;
                    if (gmqVarA.c(he2Var2, this) == wneVar2) {
                        return wneVar2;
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
