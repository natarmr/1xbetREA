package a;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cic implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4405a;
    public final /* synthetic */ dic b;

    public /* synthetic */ cic(dic dicVar, byte b) {
        this.f4405a = b;
        this.b = dicVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4405a;
        dic dicVar = this.b;
        switch (b) {
            case 0:
                kj5 kj5Var = dic.n2;
                Application application = dicVar.n0().getApplication();
                application.getClass();
                return application;
            case 1:
                kj5 kj5Var2 = dic.n2;
                Application application2 = dicVar.n0().getApplication();
                application2.getClass();
                return application2;
            default:
                kj5 kj5Var3 = dic.n2;
                fiu0 fiu0Var = dicVar.k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
