package a;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ouj implements jgd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25880a;
    public final /* synthetic */ jkd0 b;

    public /* synthetic */ ouj(jkd0 jkd0Var, byte b) {
        this.f25880a = b;
        this.b = jkd0Var;
    }

    @Override // a.jgd
    public final Object x0(pzu pzuVar) {
        byte b = this.f25880a;
        jkd0 jkd0Var = this.b;
        switch (b) {
            case 0:
                return new quj((Context) pzuVar.a(Context.class), ((nfq) pzuVar.a(nfq.class)).f(), pzuVar.m(jkd0.a(jtv.class)), pzuVar.j(yyj.class), (Executor) pzuVar.e(jkd0Var));
            case 1:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(jkd0Var, pzuVar);
            case 2:
                return FirebasePerfRegistrar.lambda$getComponents$0(jkd0Var, pzuVar);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(jkd0Var, pzuVar);
        }
    }
}
