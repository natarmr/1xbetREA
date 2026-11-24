package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class htd0 {
    public static final gtd0 Companion = new gtd0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new etd0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13628a;
    public final List b;

    public /* synthetic */ htd0(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f13628a = null;
        } else {
            this.f13628a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }
}
