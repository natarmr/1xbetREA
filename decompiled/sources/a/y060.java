package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y060 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41792a;
    public final /* synthetic */ b160 b;

    public /* synthetic */ y060(b160 b160Var, byte b) {
        this.f41792a = b;
        this.b = b160Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41792a;
        b160 b160Var = this.b;
        switch (b) {
            case 0:
                dn60 dn60Var = (dn60) obj;
                evz evzVar = b160.O1;
                dn60Var.getClass();
                b160Var.H0().x(new gz50(dn60Var));
                break;
            case 1:
                on60 on60Var = (on60) obj;
                evz evzVar2 = b160.O1;
                on60Var.getClass();
                b160Var.H0().x(new ez50(on60Var));
                break;
            case 2:
                uid uidVar = (uid) obj;
                evz evzVar3 = b160.O1;
                uidVar.getClass();
                b160Var.H0().x(new zy50(uidVar));
                break;
            case 3:
                dn60 dn60Var2 = (dn60) obj;
                evz evzVar4 = b160.O1;
                dn60Var2.getClass();
                b160Var.H0().x(new gz50(dn60Var2));
                break;
            default:
                evz evzVar5 = b160.O1;
                ((GamesActionsFragmentResultModel) obj).getClass();
                b160Var.H0().x(fz50.f10393a);
                break;
        }
        return Unit.f46060a;
    }
}
