package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ksr0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18830a;
    public final /* synthetic */ psr0 b;

    public /* synthetic */ ksr0(psr0 psr0Var, byte b) {
        this.f18830a = b;
        this.b = psr0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18830a;
        psr0 psr0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                gle0 gle0Var = psr0Var.q;
                RuleData ruleData = new RuleData("jackpot_rules_152", 14, (Map) null, (String) null);
                gle0Var.getClass();
                k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.rules, false, false, false));
                break;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                psr0Var.p.a(th);
                break;
        }
        return Unit.f46060a;
    }
}
