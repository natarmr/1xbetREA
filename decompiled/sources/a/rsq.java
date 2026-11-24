package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rsq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31043a;
    public final boolean b;

    public rsq() {
        this.b = true;
        this.f31043a = Collections.singletonList(null);
    }

    public rsq(List list, boolean z) {
        list.getClass();
        this.f31043a = list;
        this.b = z;
    }

    public rsq(ArrayList arrayList) {
        this.b = false;
        this.f31043a = arrayList;
    }
}
