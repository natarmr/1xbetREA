package a;

import kotlin.Pair;
import org.xplatform.core.navigation.authorization.model.AuthType;
import org.xplatform.core.navigation.authorization.screen.Authorization;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class wu4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1w0 f39774a;
    public final gdv0 b;

    public wu4(h1w0 h1w0Var, gdv0 gdv0Var) {
        this.f39774a = h1w0Var;
        this.b = gdv0Var;
    }

    public final Pair a(lf50 lf50Var, g1w0 g1w0Var) {
        lf50Var.getClass();
        Authorization authorization = (Authorization) this.b.invoke(AuthType.f46456a);
        if (authorization == null) {
            return new Pair(lf50Var, iun.f15405a);
        }
        pe50 pe50Var = lf50Var.c;
        wul0 wul0VarA = qxw.A(lf50Var);
        m7h0 m7h0VarA = wul0VarA != null ? wul0VarA.a() : null;
        if (g1w0Var == null) {
            g1w0Var = lf50Var.c.b;
        }
        pe50 pe50VarA = pe50.a(pe50Var, m7h0VarA, g1w0Var, null, null, null, null, 60);
        bjk bjkVar = pe50VarA.d.f27596a;
        return new Pair(qxw.P(lf50.a(lf50Var, null, null, pe50VarA, 3), nu4.f24131a, authorization, bjkVar), kotlin.collections.a.c(authorization instanceof Authorization.Login.Dialog ? new le50((DialogScreen) authorization, bjkVar) : new fe50(authorization)));
    }
}
