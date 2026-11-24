package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ejo {
    public static final cjo Companion = new cjo();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new ago(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7918a;
    public final List b;

    public /* synthetic */ ejo(String str, List list, int i) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, ajo.f986a.getDescriptor());
            throw null;
        }
        this.f7918a = str;
        this.b = list;
    }

    public ejo(String str, ArrayList arrayList) {
        this.f7918a = str;
        this.b = arrayList;
    }
}
