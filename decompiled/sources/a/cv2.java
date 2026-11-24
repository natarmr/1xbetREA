package a;

import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class cv2 extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv2(tzi tziVar, j700 j700Var, yje yjeVar) {
        super(4, yjeVar);
        this.i = (byte) 2;
        this.k = tziVar;
        this.l = j700Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z = true;
        boolean z2 = false;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                nv2 nv2Var = (nv2) this.j;
                float fD = ((vtj) this.k).d(this.l);
                if (!Float.isNaN(fD)) {
                    nv2Var.a(fD, 0.0f);
                }
                return Unit.f46060a;
            case 1:
                gxb gxbVar = (gxb) this.j;
                String str = (String) this.k;
                f9e f9eVar = (f9e) this.l;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = gxbVar.g;
                boolean z4 = !z3;
                if (!z3 && (!(f9eVar instanceof e9e) || StringsKt.u0(str).toString().length() > 0)) {
                    z2 = true;
                }
                return new exb(z4, z2, !gxbVar.g);
            default:
                Throwable th = (Throwable) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                tzi tziVar = (tzi) this.k;
                boolean zJ = t9x.J((j700) this.l);
                if (!agc.W(th)) {
                    z = false;
                } else if (zJ) {
                    ((t4v) tziVar.i).a();
                } else {
                    ((wsc) tziVar.j).a();
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 4;
        switch (this.i) {
            case 0:
                cv2 cv2Var = new cv2(i, (yje) obj4, (byte) 0);
                cv2Var.j = (nv2) obj;
                cv2Var.k = (vtj) obj2;
                cv2Var.l = obj3;
                return cv2Var.invokeSuspend(Unit.f46060a);
            case 1:
                cv2 cv2Var2 = new cv2(i, (yje) obj4, (byte) 1);
                cv2Var2.j = (gxb) obj;
                cv2Var2.k = (String) obj2;
                cv2Var2.l = (f9e) obj3;
                return cv2Var2.invokeSuspend(Unit.f46060a);
            default:
                ((Number) obj3).longValue();
                cv2 cv2Var3 = new cv2((tzi) this.k, (j700) this.l, (yje) obj4);
                cv2Var3.j = (Throwable) obj2;
                return cv2Var3.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cv2(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }
}
