package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class drv implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p6t0 f6583a;
    public final /* synthetic */ Function1 b;

    public drv(p6t0 p6t0Var, Function1 function1) {
        this.f6583a = p6t0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        smh smhVar = (smh) obj;
        smhVar.getClass();
        boolean zD = Intrinsics.d(((hrv) this.f6583a).b, CyberGamesPage.Real.INSTANCE);
        long j = smhVar.f32446a;
        Function1 function1 = this.b;
        if (zD) {
            function1.invoke(new ohw(j));
        } else {
            function1.invoke(new xgw(j));
        }
        return Unit.f46060a;
    }
}
