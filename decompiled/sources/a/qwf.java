package a;

import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qwf implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29433a;
    public final /* synthetic */ uwf b;

    public /* synthetic */ qwf(uwf uwfVar, byte b) {
        this.f29433a = b;
        this.b = uwfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29433a;
        uwf uwfVar = this.b;
        switch (b) {
            case 0:
                return (pwf) uwfVar.b.getValue();
            default:
                x9g0 x9g0Var = new x9g0();
                x9g0Var.b("https://bwtsrv.com/");
                vby vbyVar = uwfVar.f36390a;
                Regex regex = MediaType.e;
                x9g0Var.a(kcx.E(vbyVar, MediaType.Companion.a("application/json")));
                OkHttpClient okHttpClient = (OkHttpClient) uwfVar.c.getValue();
                Objects.requireNonNull(okHttpClient, "client == null");
                x9g0Var.f40508a = okHttpClient;
                Object objB = x9g0Var.c().b(pwf.class);
                objB.getClass();
                return (pwf) objB;
        }
    }
}
