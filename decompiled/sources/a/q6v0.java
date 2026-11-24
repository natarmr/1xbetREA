package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q6v0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28219a;
    public final /* synthetic */ d7v0 b;

    public /* synthetic */ q6v0(d7v0 d7v0Var, byte b) {
        this.f28219a = b;
        this.b = d7v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f28219a;
        d7v0 d7v0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                Object obj2 = d7v0Var.h.f36498a;
                k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(new RuleData("banner_week_tournament_games", 14, (Map) null, (String) null), R.string.rules, false, false, false));
                break;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                d7v0Var.f.b(th, new b4u0((byte) 27));
                break;
        }
        return Unit.f46060a;
    }
}
