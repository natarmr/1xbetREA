package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class iqt0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15226a;
    public final i7a b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iqt0(i7a i7aVar, String str) {
        this(str, i7aVar, false);
        str.getClass();
        i7aVar.getClass();
    }

    public iqt0(String str, i7a i7aVar, boolean z) {
        this.f15226a = str;
        this.b = i7aVar;
    }
}
