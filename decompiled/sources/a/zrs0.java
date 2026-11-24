package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class zrs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44873a;
    public final int b;
    public final short c;
    public int d;
    public String e;

    /* JADX WARN: Multi-variable type inference failed */
    public zrs0(int i, int i2, int i3) {
        this.f44873a = i != Integer.MIN_VALUE ? f140.i(i, Separators.SLASH) : "";
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }

    public final void a() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.f44873a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        jf4.n("generateNewId() must be called before retrieving ids.");
    }

    public zrs0(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }
}
