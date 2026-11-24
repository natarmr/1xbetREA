package a;

import android.javax.sip.header.WarningHeader;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k1l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17531a;
    public final /* synthetic */ m1l0 b;

    public /* synthetic */ k1l0(m1l0 m1l0Var, byte b) {
        this.f17531a = b;
        this.b = m1l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f17531a;
        m1l0 m1l0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                gle0 gle0Var = m1l0Var.w;
                RuleData ruleData = new RuleData("sport_cashback_288", 14, (Map) null, (String) null);
                gle0Var.getClass();
                k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.rules, false, false, false));
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                m1l0Var.M(th);
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                if (b8k0.Q((c1l0) m1l0Var.D()) || !((c1l0) m1l0Var.D()).e) {
                    m1l0Var.q.a(th2);
                } else {
                    m1l0Var.M(th2);
                }
                p7m0 p7m0Var = m1l0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    m1l0Var.f.getClass();
                } while (!p7m0Var.m(value, c1l0.a((c1l0) value, null, null, false, null, false, false, false, WarningHeader.MISCELLANEOUS_WARNING)));
                break;
        }
        return Unit.f46060a;
    }
}
