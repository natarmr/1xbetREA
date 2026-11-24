package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nx5<T> {
    public static final mx5 Companion = new mx5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f24265a;
    public final List b;
    public final edy c;

    static {
        zna0 zna0Var = new zna0("org.xplatform.app_start.impl.data.model.response.BaseDictionaryResponse.DataDictionaryResponse", null, 3);
        zna0Var.j("lastUpdate", true);
        zna0Var.j("items", true);
        zna0Var.j("errors", true);
    }

    public /* synthetic */ nx5(int i, Long l, List list, edy edyVar) {
        if ((i & 1) == 0) {
            this.f24265a = null;
        } else {
            this.f24265a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = edyVar;
        }
    }
}
