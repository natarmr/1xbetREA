package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class dix0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6159a;

    public /* synthetic */ dix0(byte b) {
        this.f6159a = b;
    }

    public final void a(vgx0 vgx0Var, Iterator it, whx0 whx0Var) {
        switch (this.f6159a) {
            case 0:
                break;
            default:
                if (!vgx0Var.c) {
                    jf4.n("non repeating key");
                } else if (vgx0Var.d && ((adw0) adw0.b.get()).f701a > 20) {
                    while (it.hasNext()) {
                        whx0Var.a(it.next(), vgx0Var.f37405a);
                    }
                } else {
                    vgx0Var.a(it, whx0Var);
                }
                break;
        }
    }

    private final void b(vgx0 vgx0Var, Iterator it, whx0 whx0Var) {
    }
}
