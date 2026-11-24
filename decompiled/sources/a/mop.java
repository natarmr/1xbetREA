package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mop implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22145a;
    public final /* synthetic */ a8z b;

    public /* synthetic */ mop(a8z a8zVar, byte b) {
        this.f22145a = b;
        this.b = a8zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22145a;
        a8z a8zVar = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                nek nekVar = rop.a2;
                uidVar.getClass();
                ((k3t0) a8zVar.getValue()).x(new dmp(uidVar));
                break;
            case 1:
                uid uidVar2 = (uid) obj;
                nek nekVar2 = rop.a2;
                uidVar2.getClass();
                ((k3t0) a8zVar.getValue()).x(new ihs(uidVar2));
                break;
            case 2:
                uid uidVar3 = (uid) obj;
                nek nekVar3 = rop.a2;
                uidVar3.getClass();
                ((k3t0) a8zVar.getValue()).x(new ei00(uidVar3));
                break;
            default:
                mi70 mi70Var = lmc0.Q1;
                ((GamesActionsFragmentResultModel) obj).getClass();
                ((k3t0) a8zVar.getValue()).x(zlc0.f44574a);
                break;
        }
        return Unit.f46060a;
    }
}
