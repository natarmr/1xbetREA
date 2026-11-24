package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f0u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8733a;

    public f0u(List list) {
        list.getClass();
        this.f8733a = list;
        if (list.isEmpty()) {
            jf4.o("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                }
            }
            for (utu utuVar : this.f8733a) {
            }
        }
    }
}
