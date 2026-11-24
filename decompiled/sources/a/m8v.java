package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m8v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f21387a = new LinkedHashMap();

    public static g2v a(String str) {
        str.getClass();
        iii iiiVar = (iii) f21387a.get(str);
        if (iiiVar != null) {
            return new g2v((n8v) iiiVar.f14828a.get());
        }
        jf4.n("Can't find GlobalSearchContainerSharedRepository!");
        return null;
    }
}
