package a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cmc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4596a;
    public List b = iun.f15405a;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public cmc(String str) {
        this.f4596a = str;
    }

    public final void a(String str, ugi0 ugi0Var, List list) {
        str.getClass();
        ugi0Var.getClass();
        list.getClass();
        if (!this.d.add(str)) {
            StringBuilder sbT = kng0.t("Element with name '", str, "' is already registered in ");
            sbT.append(this.f4596a);
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        this.c.add(str);
        this.e.add(ugi0Var);
        this.f.add(list);
        this.g.add(Boolean.FALSE);
    }
}
