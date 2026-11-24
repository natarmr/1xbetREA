package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public enum p3u0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(1, "#.#"),
    c(2, "#.##"),
    d(4, "#.####"),
    e(3, "#.#####"),
    f(3, "#,###,###,###,###.###"),
    g(2, "##############.##"),
    h(2, "##############.0#"),
    i(2, "#.##"),
    j(0, Separators.POUND),
    k(2, "###,###,##0.##");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26317a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    p3u0(int i2, String str) {
        this.f26317a = str;
        this.b = i2;
    }
}
