package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hj90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13151a;
    public final /* synthetic */ kk90 b;

    public /* synthetic */ hj90(kk90 kk90Var, byte b) {
        this.f13151a = b;
        this.b = kk90Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f13151a;
        kk90 kk90Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                mi70 mi70Var = kk90Var.o;
                xbi0 xbi0Var = new xbi0(kk90Var.I, 18, false);
                mi70Var.getClass();
                k0w0Var.h(new SendConfirmationSMSScreen(xbi0Var));
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                kk90Var.n.b(th, new ds60(kk90Var, (byte) 26));
                break;
            case 2:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                gle0 gle0Var = kk90Var.w;
                RuleData ruleData = new RuleData("info_contact_1", 14, (Map) null, (String) null);
                gle0Var.getClass();
                k0w0Var2.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.info_contact, false, false, false));
                break;
            case 3:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                Object obj2 = kk90Var.i.f;
                k0w0Var3.h(new BindPhoneNumberScreen(new i38(7)));
                break;
            default:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                mi70 mi70Var2 = kk90Var.o;
                xbi0 xbi0Var2 = new xbi0(kk90Var.I, 6, false);
                mi70Var2.getClass();
                k0w0Var4.h(new SendConfirmationSMSScreen(xbi0Var2));
                break;
        }
        return Unit.f46060a;
    }
}
