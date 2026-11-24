package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cb50 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4046a;

    public cb50(String str) {
        this.f4046a = str;
    }

    public final String a() {
        if (this instanceof bb50) {
            return "popular";
        }
        if (this instanceof ya50) {
            return "favorites";
        }
        if (this instanceof xa50) {
            return "coupon";
        }
        if (this instanceof za50) {
            return "history";
        }
        if (this instanceof ab50) {
            return "menu";
        }
        t9f.b();
        return null;
    }
}
