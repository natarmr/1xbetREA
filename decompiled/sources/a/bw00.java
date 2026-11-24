package a;

import kotlin.text.Regex;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes2.dex */
public final class bw00 implements HttpLoggingInterceptor.Logger {
    public final /* synthetic */ dw00 b;

    public bw00(dw00 dw00Var) {
        this.b = dw00Var;
    }

    @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
    public final void a(String str) {
        dw00 dw00Var = this.b;
        String str2 = (String) dw00Var.i.get();
        if (str2 != null) {
            str = str2 + ' ' + str;
        }
        if (dw00Var.f6772a) {
            iiy[] iiyVarArr = dw00.k;
            str = ((Regex) dw00Var.g.getValue()).h(((rnh0) dw00Var.e.getValue()).a(str), new fne(dw00Var, new pls0(pgi0.p(Regex.d((Regex) dw00Var.f.getValue(), str), gvy.r)), (byte) 2));
        }
        gsj gsjVar = dw00Var.c;
        gsjVar.b((vv00) gsjVar.f11832a.getValue(), str, null);
    }
}
