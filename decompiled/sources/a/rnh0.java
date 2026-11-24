package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class rnh0 {
    public static final List b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f30788a = new ArrayList();

    static {
        List listJ = q3d.j("sign", "key", "access_token", "webview_access_token", "webview_refresh_token", "exchange_token", "exchange_tokens", "common_token");
        b = listJ;
        g8x.A(listJ);
    }

    public final String a(String str) {
        for (qnh0 qnh0Var : this.f30788a) {
            str = str != null ? qnh0Var.b.h(str, qnh0Var.c) : null;
        }
        return str == null ? "" : str;
    }

    public final void b(Regex regex, Function1 function1) {
        this.f30788a.add(new qnh0(regex, function1));
    }
}
