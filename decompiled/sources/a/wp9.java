package a;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wp9 {
    public static final vp9 Companion = new vp9();
    public static final a8z[] b = {maz.a(wez.f39042a, new mn9(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f39533a;

    public /* synthetic */ wp9(int i, Map map) {
        if (1 == (i & 1)) {
            this.f39533a = map;
        } else {
            m2x.I(i, 1, up9.f36052a.getDescriptor());
            throw null;
        }
    }

    public wp9(edy edyVar) {
        this.f39533a = edyVar;
    }
}
