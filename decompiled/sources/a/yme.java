package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yme implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42883a;
    public final /* synthetic */ ane b;

    public /* synthetic */ yme(ane aneVar, byte b) {
        this.f42883a = b;
        this.b = aneVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        pkk0 pkk0Var;
        byte b = this.f42883a;
        ane aneVar = this.b;
        switch (b) {
            case 0:
                vcc.W(aneVar);
                return Unit.f46060a;
            case 1:
                aneVar.x.e(true);
                return Boolean.TRUE;
            case 2:
                aneVar.x.a(true);
                return Boolean.TRUE;
            case 3:
                aneVar.x.c();
                return Boolean.TRUE;
            case 4:
                vcc.W(aneVar);
                return Unit.f46060a;
            case 5:
                aneVar.x.o();
                return Boolean.TRUE;
            case 6:
                aneVar.s.w.b.r.b(aneVar.y.e);
                return Boolean.TRUE;
            default:
                djz djzVar = aneVar.s;
                cqq cqqVar = aneVar.z;
                boolean z = aneVar.t;
                if (!djzVar.b()) {
                    cqq.a(cqqVar);
                } else if (!z && (pkk0Var = djzVar.c) != null) {
                    ((r3k) pkk0Var).b();
                }
                return Boolean.TRUE;
        }
    }
}
