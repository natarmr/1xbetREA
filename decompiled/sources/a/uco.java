package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class uco {
    public static final tco Companion = new tco();
    public static final a8z[] b = {maz.a(wez.f39042a, new urn(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35440a;

    public /* synthetic */ uco(int i, List list) {
        if (1 == (i & 1)) {
            this.f35440a = list;
        } else {
            m2x.I(i, 1, sco.f31996a.getDescriptor());
            throw null;
        }
    }

    public uco(ArrayList arrayList) {
        this.f35440a = arrayList;
    }
}
