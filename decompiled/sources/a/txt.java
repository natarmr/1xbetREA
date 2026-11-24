package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class txt implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34718a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ mci c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ txt(gmq gmqVar, Object obj, mci mciVar, boolean z, byte b) {
        this.f34718a = b;
        this.b = gmqVar;
        this.e = obj;
        this.c = mciVar;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        qxt qxtVar;
        uxt uxtVar;
        byte b = this.f34718a;
        Object obj = this.e;
        gmq gmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof qxt) {
                    qxtVar = (qxt) yjeVar;
                    int i = qxtVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        qxtVar.j = i - Integer.MIN_VALUE;
                    } else {
                        qxtVar = new qxt(this, yjeVar);
                    }
                } else {
                    qxtVar = new qxt(this, yjeVar);
                }
                Object obj2 = qxtVar.i;
                wne wneVar = wne.f39444a;
                int i2 = qxtVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    sxt sxtVar = new sxt(kmqVar, (knb) obj, this.c, this.d, (byte) 0);
                    qxtVar.j = 1;
                    if (gmqVar.c(sxtVar, qxtVar) == wneVar) {
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
                if (yjeVar instanceof uxt) {
                    uxtVar = (uxt) yjeVar;
                    int i3 = uxtVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        uxtVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        uxtVar = new uxt(this, yjeVar);
                    }
                } else {
                    uxtVar = new uxt(this, yjeVar);
                }
                Object obj3 = uxtVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = uxtVar.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    sxt sxtVar2 = new sxt(kmqVar, (List) obj, this.c, this.d, (byte) 1);
                    uxtVar.j = 1;
                    if (gmqVar.c(sxtVar2, uxtVar) == wneVar2) {
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
}
