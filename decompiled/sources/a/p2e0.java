package a;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p2e0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26246a;
    public final /* synthetic */ pru b;

    public /* synthetic */ p2e0(pru pruVar, rqt rqtVar) {
        this.f26246a = (byte) 2;
        this.b = pruVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26246a;
        pru pruVar = this.b;
        switch (b) {
            case 0:
                return new t2e0(pruVar.a().e.d, 0, false);
            case 1:
                return new o7e0(pruVar.a(), f7e0.c, kgz.MALE, null, true);
            case 2:
                sff0 sff0VarA = pruVar.a();
                return new y7f0(iun.f15405a, rqt.f(sff0VarA.k), sff0VarA);
            case 3:
                return new tzh0(null, null, new ArrayList(), 0L, 0L, 0L, pruVar.a().J1);
            case 4:
                toc0 toc0Var = pruVar.a().l;
                y0b y0bVar = y0b.NO_CASHBACK;
                return new s0i0(toc0Var, null, y0bVar, y0bVar, false, false);
            case 5:
                return pruVar.a();
            case 6:
                lmr0 lmr0Var = new lmr0(0, "", ulr0.NONE, false);
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new yhr0(jhr0.f16542a, lmr0Var, lunVar, pruVar.a().f32117a.f, false, false, 0L, 0L, "");
            default:
                return pruVar.a();
        }
    }

    public /* synthetic */ p2e0(pru pruVar, byte b) {
        this.f26246a = b;
        this.b = pruVar;
    }
}
