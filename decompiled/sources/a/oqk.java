package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class oqk implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p6t0 f25692a;
    public final /* synthetic */ Function1 b;

    public oqk(p6t0 p6t0Var, Function1 function1) {
        this.f25692a = p6t0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        smh smhVar = (smh) obj;
        smhVar.getClass();
        boolean zD = Intrinsics.d(((uqk) this.f25692a).b, CyberGamesPage.Real.INSTANCE);
        long j = smhVar.f32446a;
        Function1 function1 = this.b;
        if (zD) {
            function1.invoke(new dpk(j));
        } else {
            function1.invoke(new tok(j));
        }
        return Unit.f46060a;
    }
}
