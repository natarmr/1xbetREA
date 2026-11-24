package a;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class nbw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23262a;
    public final List b;
    public final boolean c;

    public nbw(String str, List list, boolean z) {
        this.f23262a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }

    public Object a(List list) {
        return this;
    }
}
