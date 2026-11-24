package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qaj f421a;
    public final es b;

    public a8f(qaj qajVar, xzp xzpVar) {
        this.f421a = qajVar;
        es esVar = new es();
        esVar.b = null;
        esVar.c = null;
        esVar.f8305a = xzpVar;
        this.b = esVar;
    }

    public final void a(String str) {
        es esVar = this.b;
        synchronized (esVar) {
            if (!Objects.equals((String) esVar.b, str)) {
                es.z((xzp) esVar.f8305a, str, (String) esVar.c);
                esVar.b = str;
            }
        }
    }
}
