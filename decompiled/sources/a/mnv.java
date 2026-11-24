package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class mnv {
    public static final lnv Companion = new lnv();
    public static final a8z[] b = {maz.a(wez.f39042a, new ldv(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22108a;

    public /* synthetic */ mnv(int i, List list) {
        if ((i & 1) == 0) {
            this.f22108a = new ArrayList();
        } else {
            this.f22108a = list;
        }
    }

    public mnv() {
        this.f22108a = new ArrayList();
    }
}
