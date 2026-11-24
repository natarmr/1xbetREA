package a;

import java.util.Date;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class q3v implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28069a = 0;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public q3v(p7m0 p7m0Var, nc0 nc0Var, long j, int i, int i2, Object obj) {
        this.b = p7m0Var;
        this.f = nc0Var;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.g = obj;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        n3v n3vVar;
        v3v v3vVar;
        byte b = this.f28069a;
        Object obj = this.f;
        gmq gmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof n3v) {
                    n3vVar = (n3v) yjeVar;
                    int i = n3vVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        n3vVar.j = i - Integer.MIN_VALUE;
                    } else {
                        n3vVar = new n3v(this, yjeVar);
                    }
                } else {
                    n3vVar = new n3v(this, yjeVar);
                }
                Object obj2 = n3vVar.i;
                wne wneVar = wne.f39444a;
                int i2 = n3vVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    p3v p3vVar = new p3v(kmqVar, (nc0) obj, this.c, this.d, this.e, this.g);
                    n3vVar.j = 1;
                    if (gmqVar.c(p3vVar, n3vVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof v3v) {
                    v3vVar = (v3v) yjeVar;
                    int i3 = v3vVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        v3vVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        v3vVar = new v3v(this, yjeVar);
                    }
                } else {
                    v3vVar = new v3v(this, yjeVar);
                }
                Object obj3 = v3vVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = v3vVar.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    p3v p3vVar2 = new p3v(kmqVar, (Date) obj, (y3v) this.g, this.c, this.d, this.e);
                    v3vVar.j = 1;
                    if (gmqVar.c(p3vVar2, v3vVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q3v(p7m0 p7m0Var, Date date, y3v y3vVar, long j, int i, int i2) {
        this.b = p7m0Var;
        this.f = date;
        this.g = y3vVar;
        this.c = j;
        this.d = i;
        this.e = i2;
    }
}
