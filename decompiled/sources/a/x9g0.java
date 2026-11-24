package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes5.dex */
public final class x9g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClient f40508a;
    public HttpUrl b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public final void a(bvo bvoVar) {
        this.c.add(bvoVar);
    }

    public final void b(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        HttpUrl httpUrlB = HttpUrl.Companion.b(str);
        ArrayList arrayList = httpUrlB.f;
        if ("".equals(arrayList.get(arrayList.size() - 1))) {
            this.b = httpUrlB;
        } else {
            e9d0.i(httpUrlB, "baseUrl must end in /: ");
        }
    }

    public final y9g0 c() {
        if (this.b == null) {
            jf4.n("Base URL required.");
            return null;
        }
        OkHttpClient okHttpClient = this.f40508a;
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient();
        }
        OkHttpClient okHttpClient2 = okHttpClient;
        k03 k03Var = ov90.f25914a;
        kl5 kl5Var = ov90.c;
        ArrayList arrayList = new ArrayList(this.d);
        List listB = kl5Var.b(k03Var);
        arrayList.addAll(listB);
        List listC = kl5Var.c();
        int size = listC.size();
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
        arrayList3.add(new vc9((byte) 0));
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(listC);
        HttpUrl httpUrl = this.b;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
        listB.size();
        return new y9g0(okHttpClient2, httpUrl, listUnmodifiableList, listUnmodifiableList2, k03Var);
    }
}
