package a;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hhi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f13065a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;

    public hhi0(byte b) {
        switch (b) {
            case 1:
                this.f13065a = new HashMap();
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            default:
                this.f13065a = new HashMap();
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
        }
    }

    public hhi0(u7x0 u7x0Var) {
        this.f13065a = new HashMap(u7x0Var.f35207a);
        this.b = new HashMap(u7x0Var.b);
        this.c = new HashMap(u7x0Var.c);
        this.d = new HashMap(u7x0Var.d);
    }

    public hhi0(khi0 khi0Var) {
        this.f13065a = new HashMap(khi0Var.f18295a);
        this.b = new HashMap(khi0Var.b);
        this.c = new HashMap(khi0Var.c);
        this.d = new HashMap(khi0Var.d);
    }
}
