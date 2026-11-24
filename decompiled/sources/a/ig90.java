package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ig90 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14726a;
    public final /* synthetic */ List b;
    public final /* synthetic */ hie0 c;

    public /* synthetic */ ig90(List list, hie0 hie0Var, byte b) {
        this.f14726a = b;
        this.b = list;
        this.c = hie0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f14726a;
        hie0 hie0Var = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    list.clear();
                    hie0Var.f13108a = false;
                }
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    list.clear();
                    hie0Var.f13108a = false;
                }
                break;
        }
        return Unit.f46060a;
    }
}
