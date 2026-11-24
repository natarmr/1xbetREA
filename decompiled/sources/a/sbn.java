package a;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sbn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31944a;
    public final /* synthetic */ vbn b;

    public /* synthetic */ sbn(vbn vbnVar, byte b) {
        this.f31944a = b;
        this.b = vbnVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31944a;
        vbn vbnVar = this.b;
        switch (b) {
            case 0:
                nek nekVar = vbn.n2;
                Application application = vbnVar.n0().getApplication();
                application.getClass();
                return application;
            case 1:
                nek nekVar2 = vbn.n2;
                fiu0 fiu0Var = vbnVar.k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                nek nekVar3 = vbn.n2;
                ((k3t0) vbnVar.m2.getValue()).x(obn.f24990a);
                return Unit.f46060a;
        }
    }
}
