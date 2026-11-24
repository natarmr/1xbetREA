package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v8b implements y8b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36972a;
    public final Integer b;
    public final Integer c;

    public v8b(int i, Integer num, Integer num2, List list) {
        num = (i & 8) != 0 ? null : num;
        num2 = (i & 16) != 0 ? null : num2;
        list.getClass();
        this.f36972a = list;
        this.b = num;
        this.c = num2;
    }
}
