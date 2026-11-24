package a;

import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class lii0 implements kii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gii0 f20108a;
    public final azj0 b;

    public lii0(gii0 gii0Var, azj0 azj0Var) {
        this.f20108a = gii0Var;
        this.b = azj0Var;
    }

    public final Object a(sgy sgyVar) {
        Object objC;
        sgyVar.getClass();
        azj0 azj0Var = this.b;
        synchronized (azj0Var) {
            OkHttpClient.Builder builderB = new OkHttpClient(new OkHttpClient.Builder()).b();
            eii0 eii0Var = azj0Var.f1720a;
            eii0Var.a(builderB);
            builderB.a(30L);
            builderB.c(30L);
            builderB.b(30L);
            eii0.b(builderB, eii0Var.f7862a.H0());
            objC = azj0Var.c(sgyVar, new OkHttpClient(builderB), "https://1xbet.com/");
        }
        return objC;
    }
}
