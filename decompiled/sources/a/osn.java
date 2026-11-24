package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class osn implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25790a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public osn(List list, int i, Throwable th) {
        z1x.x(list, "initCallbacks cannot be null");
        this.f25790a = new ArrayList(list);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f25790a;
        int size = arrayList.size();
        int i = 0;
        if (this.b != 1) {
            while (i < size) {
                ((nsn) arrayList.get(i)).a();
                i++;
            }
        } else {
            while (i < size) {
                ((nsn) arrayList.get(i)).b();
                i++;
            }
        }
    }
}
