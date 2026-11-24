package a;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gnw0 {
    public static volatile gnw0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList f11606a;

    public gnw0(byte b2) {
        switch (b2) {
            case 1:
                this.f11606a = new CopyOnWriteArrayList();
                break;
            default:
                this.f11606a = new CopyOnWriteArrayList();
                break;
        }
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw rw2.h(it);
        }
    }
}
