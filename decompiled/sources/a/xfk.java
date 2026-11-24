package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xfk implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40793a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ xfk(String str, Function0 function0, byte b) {
        this.f40793a = b;
        this.b = str;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40793a;
        Function0 function0 = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                lc50 lc50Var = (lc50) obj;
                lc50Var.getClass();
                DsNavigationBarBasic dsNavigationBarBasic = lc50Var.b;
                dsNavigationBarBasic.setTitle(str);
                dsNavigationBarBasic.b(function0);
                break;
            default:
                abi0 abi0Var = (abi0) obj;
                iiy[] iiyVarArr = yai0.f42300a;
                zai0 zai0Var = xai0.u;
                iiy iiyVar = yai0.f42300a[11];
                Float fValueOf = Float.valueOf(1.0f);
                zai0Var.getClass();
                abi0Var.b(zai0Var, fValueOf);
                yai0.b(abi0Var, str);
                abi0Var.b(mai0.b, new m6(null, new a2z(function0, (byte) 13)));
                break;
        }
        return Unit.f46060a;
    }
}
