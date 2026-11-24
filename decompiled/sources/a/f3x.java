package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class f3x extends c2 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ bg5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3x(bg5 bg5Var, byte b) {
        super((byte) 8);
        this.c = b;
        this.d = bg5Var;
    }

    @Override // a.c2
    public final int q(int i) {
        byte b = this.c;
        bg5 bg5Var = this.d;
        switch (b) {
            case 0:
                List list = bg5Var.e.f;
                list.getClass();
                Object objW = CollectionsKt.W(i, list);
                k1d k1dVar = objW instanceof k1d ? (k1d) objW : null;
                return (k1dVar != null ? k1dVar.c : null) == j1d.SQUARE ? 1 : 2;
            default:
                List list2 = bg5Var.e.f;
                list2.getClass();
                Object objW2 = CollectionsKt.W(i, list2);
                k1d k1dVar2 = objW2 instanceof k1d ? (k1d) objW2 : null;
                return (k1dVar2 != null ? k1dVar2.c : null) == j1d.SQUARE ? 1 : 2;
        }
    }
}
