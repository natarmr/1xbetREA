package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rts0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31091a;
    public final /* synthetic */ tts0 b;

    public /* synthetic */ rts0(tts0 tts0Var, byte b) {
        this.f31091a = b;
        this.b = tts0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f31091a;
        tts0 tts0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                p7m0 p7m0Var = tts0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    tts0Var.f.getClass();
                } while (!p7m0Var.m(value, fts0.a((fts0) value, null, 0L, true, null, 247)));
                break;
            default:
                gle0 gle0Var = tts0Var.t;
                RuleData ruleData = new RuleData(((fts0) tts0Var.D()).g, 14, (Map) null, (String) null);
                gle0Var.getClass();
                ((k0w0) obj).h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.rules, false, false, false));
                break;
        }
        return Unit.f46060a;
    }
}
