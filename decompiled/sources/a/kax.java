package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kax implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17986a = 1;
    public final /* synthetic */ tax b;
    public final /* synthetic */ y9x c;
    public final /* synthetic */ String d;

    public /* synthetic */ kax(tax taxVar, y9x y9xVar, String str) {
        this.b = taxVar;
        this.c = y9xVar;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f17986a;
        String str = this.d;
        y9x y9xVar = this.c;
        tax taxVar = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                gle0 gle0Var = taxVar.r;
                RuleData ruleData = new RuleData(str, 14, (Map) null, (String) null);
                int iT = x9x.T(y9xVar);
                gle0Var.getClass();
                k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, iT, false, false, false));
                break;
            default:
                k0w0Var.getClass();
                bzs0 bzs0Var = taxVar.s;
                int iT2 = x9x.T(y9xVar);
                bzs0Var.getClass();
                k0w0Var.h(bzs0.d(iT2, str));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ kax(tax taxVar, String str, y9x y9xVar) {
        this.b = taxVar;
        this.d = str;
        this.c = y9xVar;
    }
}
