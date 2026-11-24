package a;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class k660 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17753a;
    public final n660 b;

    public /* synthetic */ k660(n660 n660Var, byte b) {
        this.f17753a = b;
        this.b = n660Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f17753a;
        n660 n660Var = this.b;
        switch (b) {
            case 0:
                swq swqVar = (swq) obj;
                swqVar.getClass();
                return new nun((ym40) n660Var.b, swqVar, (byte) 0);
            default:
                l660 l660Var = (l660) obj;
                l660Var.getClass();
                qlc qlcVar = l660Var.f19491a;
                List list = l660Var.b;
                if (qlcVar.c) {
                    v4i0.j(qlcVar, "Unresolved local class: ");
                    return null;
                }
                qlc qlcVarE = qlcVar.e();
                vlc vlcVarM = qlcVarE != null ? n660Var.m(qlcVarE, CollectionsKt.O(list, 1)) : (vlc) ((zt00) n660Var.c).invoke(qlcVar.f28927a);
                boolean zG = qlcVar.g();
                eu00 eu00Var = (eu00) n660Var.f22981a;
                g950 g950VarF = qlcVar.f();
                Integer num = (Integer) CollectionsKt.firstOrNull(list);
                return new m660(eu00Var, vlcVarM, g950VarF, zG, num != null ? num.intValue() : 0);
        }
    }
}
