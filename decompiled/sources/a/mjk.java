package a;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class mjk implements i2h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21899a;

    public /* synthetic */ mjk(byte b) {
        this.f21899a = b;
    }

    @Override // a.i2h0
    public final y1h0 a(o470 o470Var, List list) {
        fjk fjkVar;
        Map map;
        switch (this.f21899a) {
            case 0:
                ob50 ob50Var = (ob50) CollectionsKt.f0(list);
                if (ob50Var == null || (map = ob50Var.c) == null) {
                    fjkVar = null;
                } else {
                    Object obj = map.get(ujn.j.toString());
                    if (obj == null) {
                        obj = null;
                    }
                    fjkVar = (fjk) obj;
                }
                if (fjkVar != null) {
                    return new ljk(ob50Var.b, ob50Var, CollectionsKt.P(1, list), CollectionsKt.P(1, list), fjkVar, (rip) o470Var.f24619a);
                }
                return null;
            default:
                return new h3k0(((ob50) CollectionsKt.d0(list)).b, (ob50) CollectionsKt.d0(list), CollectionsKt.P(1, list));
        }
    }
}
