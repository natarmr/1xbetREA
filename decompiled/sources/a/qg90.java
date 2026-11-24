package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class qg90 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f28672a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ hie0 d;
    public final /* synthetic */ pz40 e;

    public qg90(List list, boolean z, pz40 pz40Var, hie0 hie0Var, pz40 pz40Var2) {
        this.f28672a = list;
        this.b = z;
        this.c = pz40Var;
        this.d = hie0Var;
        this.e = pz40Var2;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        List list = this.f28672a;
        boolean zIsEmpty = list.isEmpty();
        hie0 hie0Var = this.d;
        if (zIsEmpty) {
            boolean z = this.b;
            pz40 pz40Var = this.e;
            pz40 pz40Var2 = this.c;
            if (z) {
                int i2 = (int) (j >> 32);
                if (Float.intBitsToFloat(i2) < 0.0f && ((Boolean) pz40Var2.getValue()).booleanValue()) {
                    hie0Var.f13108a = true;
                }
                if (Float.intBitsToFloat(i2) > 0.0f && ((Boolean) pz40Var.getValue()).booleanValue()) {
                    hie0Var.f13108a = true;
                }
            } else {
                int i3 = (int) (j >> 32);
                if (Float.intBitsToFloat(i3) > 0.0f && ((Boolean) pz40Var2.getValue()).booleanValue()) {
                    hie0Var.f13108a = true;
                }
                if (Float.intBitsToFloat(i3) < 0.0f && ((Boolean) pz40Var.getValue()).booleanValue()) {
                    hie0Var.f13108a = true;
                }
            }
        }
        list.add(new ne60(j));
        if (hie0Var.f13108a) {
            return j;
        }
        return 0L;
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        if (!this.d.f13108a) {
            return j2;
        }
        long j3 = ((ne60) CollectionsKt.d0(this.f28672a)).f23370a;
        return ne60.a(j3, -Float.intBitsToFloat((int) (j3 >> 32)), 0.0f, 2);
    }
}
