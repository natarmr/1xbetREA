package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.feature.online_call.impl.navigation.OnlineCallScreenFactoryImpl$getScreen$1;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zjn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44490a;
    public final /* synthetic */ mkn0 b;

    public /* synthetic */ zjn0(mkn0 mkn0Var, byte b) {
        this.f44490a = b;
        this.b = mkn0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44490a;
        mkn0 mkn0Var = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                gle0 gle0Var = mkn0Var.r;
                RuleData ruleData = new RuleData("info_contact_1", 14, (Map) null, (String) null);
                gle0Var.getClass();
                k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.info_contact, false, false, false));
                break;
            default:
                k0w0Var.getClass();
                ys70 ys70Var = mkn0Var.l;
                ys70Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(new OnlineCallScreenFactoryImpl$getScreen$1(ys70Var)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
        }
        return Unit.f46060a;
    }
}
