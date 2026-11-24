package org.xplatform.security.impl.presentation.password.change.input_password;

import a.b090;
import a.bnn0;
import a.duj;
import a.jiu0;
import a.s980;
import a.sac;
import a.wne;
import a.x4x;
import a.xj80;
import a.yje;
import a.z1x;
import a.zhi0;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ f j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = fVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        e eVar = new e(this.j, yjeVar);
        eVar.i = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        boolean z = th instanceof x4x;
        f fVar = this.j;
        if (z) {
            String f46956a = ((PasswordChangeViewModel$ScreenUiState) fVar.n.f40549a.getValue()).getF46956a();
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.b.e("current_password_key", new PasswordChangeViewModel$ScreenUiState.IncorrectPassword(f46956a, message));
        } else if (th == null) {
            fVar.l.a(th);
        } else if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
            fVar.p.f(b090.f1756a);
        } else if (th instanceof zhi0) {
            sac.V(jiu0.a(fVar), new xj80(1, fVar.l, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 10), null, null, new s980((zhi0) th, fVar, null, (byte) 5), 14);
        } else {
            fVar.l.a(th);
        }
        return Unit.f46060a;
    }
}
