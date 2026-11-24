package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class nst implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2c f24064a;
    public final /* synthetic */ kki b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ List g;
    public final /* synthetic */ List h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;

    public nst(h2c h2cVar, kki kkiVar, long j, boolean z, long j2, String str, List list, List list2, boolean z2, boolean z3) {
        this.f24064a = h2cVar;
        this.b = kkiVar;
        this.c = j;
        this.d = z;
        this.e = j2;
        this.f = str;
        this.g = list;
        this.h = list2;
        this.i = z2;
        this.j = z3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        kst kstVar;
        if (yjeVar instanceof kst) {
            kstVar = (kst) yjeVar;
            int i = kstVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                kstVar.j = i - Integer.MIN_VALUE;
            } else {
                kstVar = new kst(this, yjeVar);
            }
        } else {
            kstVar = new kst(this, yjeVar);
        }
        Object obj = kstVar.i;
        wne wneVar = wne.f39444a;
        int i2 = kstVar.j;
        if (i2 == 0) {
            z1x.P(obj);
            mst mstVar = new mst(kmqVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
            kstVar.j = 1;
            if (this.f24064a.c(mstVar, kstVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
