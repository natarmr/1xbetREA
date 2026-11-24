package a;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y1s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41873a;
    public final /* synthetic */ j2s b;

    public /* synthetic */ y1s(j2s j2sVar, byte b) {
        this.f41873a = b;
        this.b = j2sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41873a;
        j2s j2sVar = this.b;
        switch (b) {
            case 0:
                xak xakVar = j2s.b2;
                Application application = j2sVar.n0().getApplication();
                application.getClass();
                return application;
            case 1:
                xak xakVar2 = j2s.b2;
                j2sVar.J0().x(d1s.f5325a);
                return Unit.f46060a;
            default:
                nui nuiVar = j2sVar.L1;
                if (nuiVar != null) {
                    return new q0h0(nuiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
