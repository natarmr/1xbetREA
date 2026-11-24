package a;

import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j7e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16036a;
    public final /* synthetic */ v8e b;

    public /* synthetic */ j7e(v8e v8eVar, byte b) {
        this.f16036a = b;
        this.b = v8eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16036a;
        v8e v8eVar = this.b;
        switch (b) {
            case 0:
                String str = (String) v8eVar.b.invoke();
                u8e u8eVar = v8eVar.i;
                if (!str.equals(v8eVar.h) || v8eVar.i == null) {
                    u8eVar = null;
                }
                if (u8eVar != null) {
                    return u8eVar;
                }
                x9g0 x9g0Var = new x9g0();
                x9g0Var.b(str);
                vby vbyVar = v8eVar.f;
                Regex regex = MediaType.e;
                x9g0Var.a(kcx.E(vbyVar, MediaType.Companion.a("application/json")));
                OkHttpClient okHttpClient = (OkHttpClient) v8eVar.g.getValue();
                Objects.requireNonNull(okHttpClient, "client == null");
                x9g0Var.f40508a = okHttpClient;
                Object objB = x9g0Var.c().b(u8e.class);
                objB.getClass();
                u8e u8eVar2 = (u8e) objB;
                v8eVar.h = str;
                v8eVar.i = u8eVar2;
                return u8eVar2;
            default:
                OkHttpClient.Builder builderB = new OkHttpClient(new OkHttpClient.Builder()).b();
                v8eVar.e.a(builderB);
                builderB.a(60L);
                builderB.b(60L);
                builderB.c(60L);
                builderB.c.add(new buc(v8eVar, (byte) 1));
                HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
                httpLoggingInterceptor.d = HttpLoggingInterceptor.Level.f46235a;
                builderB.c.add(httpLoggingInterceptor);
                builderB.c.add(new ltf0());
                builderB.c.add(v8eVar.d);
                builderB.c.add(v8eVar.c);
                eii0.b(builderB, v8eVar.e.f7862a.H0());
                return new OkHttpClient(builderB);
        }
    }
}
