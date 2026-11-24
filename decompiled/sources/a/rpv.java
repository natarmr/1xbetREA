package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class rpv {
    public static final rov Companion = new rov();
    public static final a8z[] c = {maz.a(wez.f39042a, new ldv(10)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30903a;
    public final dpv b;

    public /* synthetic */ rpv(int i, List list, dpv dpvVar) {
        if ((i & 1) == 0) {
            this.f30903a = null;
        } else {
            this.f30903a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = dpvVar;
        }
    }
}
