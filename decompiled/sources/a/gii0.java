package a;

import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public class gii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vby f11348a;
    public final Function0 b;
    public final Function0 c;
    public final LinkedHashMap d;

    public gii0(vby vbyVar, Function0 function0, Function0 function1) {
        vbyVar.getClass();
        this.f11348a = vbyVar;
        this.b = function0;
        this.c = function1;
        this.d = new LinkedHashMap();
    }

    public final Object a(sgy sgyVar, String str, String str2) {
        OkHttpClient okHttpClient = (OkHttpClient) this.b.invoke();
        x9g0 x9g0Var = new x9g0();
        x9g0Var.b(str2);
        Regex regex = MediaType.e;
        x9g0Var.a(kcx.E(this.f11348a, MediaType.Companion.a("application/json")));
        Objects.requireNonNull(okHttpClient, "client == null");
        x9g0Var.f40508a = okHttpClient;
        Object objB = x9g0Var.c().b(azw.G(sgyVar));
        System.out.println((Object) "Create new service: ".concat(azw.G(sgyVar).getSimpleName()));
        objB.getClass();
        this.d.put(str, new fii0(objB));
        return objB;
    }

    public final Object b(sgy sgyVar) {
        Object objA;
        sgyVar.getClass();
        synchronized (this) {
            String name = azw.G(sgyVar).getName();
            fii0 fii0Var = (fii0) this.d.get(name);
            if (fii0Var == null) {
                return a(sgyVar, name, (String) this.c.invoke());
            }
            if (System.currentTimeMillis() - fii0Var.b < 120000) {
                objA = fii0Var.f9590a;
                objA.getClass();
            } else {
                objA = a(sgyVar, name, (String) this.c.invoke());
            }
            return objA;
        }
    }
}
