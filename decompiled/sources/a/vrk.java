package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class vrk implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p6t0 f37903a;
    public final /* synthetic */ Function1 b;

    public vrk(p6t0 p6t0Var, Function1 function1) {
        this.f37903a = p6t0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        boolean zD = Intrinsics.d(((rrk) this.f37903a).b, CyberGamesPage.Real.INSTANCE);
        Function1 function1 = this.b;
        if (zD) {
            function1.invoke(new dpk(jLongValue));
        } else {
            function1.invoke(new tok(jLongValue));
        }
        return Unit.f46060a;
    }
}
