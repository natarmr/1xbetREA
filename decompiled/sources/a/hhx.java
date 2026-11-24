package a;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hhx implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13086a;
    public final /* synthetic */ lhx b;

    public /* synthetic */ hhx(lhx lhxVar, byte b) {
        this.f13086a = b;
        this.b = lhxVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13086a;
        lhx lhxVar = this.b;
        switch (b) {
            case 0:
                ihx ihxVar = lhx.Y1;
                Application application = lhxVar.n0().getApplication();
                application.getClass();
                return application;
            default:
                ogx ogxVar = lhxVar.S1;
                if (ogxVar != null) {
                    return new q0h0(ogxVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
