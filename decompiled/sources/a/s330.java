package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s330 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31537a;
    public final /* synthetic */ v330 b;

    public /* synthetic */ s330(v330 v330Var, byte b) {
        this.f31537a = b;
        this.b = v330Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31537a;
        v330 v330Var = this.b;
        switch (b) {
            case 0:
                jtl jtlVar = (jtl) obj;
                xuz xuzVar = v330.Q1;
                jtlVar.getClass();
                if (jtlVar.equals(sh00.e)) {
                    v330Var.G0().x(m330.f21094a);
                } else if (jtlVar.equals(sh00.d)) {
                    v330Var.G0().x(d330.f5383a);
                }
                break;
            case 1:
                ((Integer) obj).getClass();
                xuz xuzVar2 = v330.Q1;
                v330Var.G0().x(n330.f22831a);
                break;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                xuz xuzVar3 = v330.Q1;
                v330Var.G0().x(new j330(iIntValue));
                break;
            case 3:
                int iIntValue2 = ((Integer) obj).intValue();
                xuz xuzVar4 = v330.Q1;
                v330Var.G0().x(new o330(iIntValue2));
                break;
            case 4:
                float fFloatValue = ((Float) obj).floatValue();
                xuz xuzVar5 = v330.Q1;
                v330Var.G0().x(new k330(fFloatValue));
                break;
            case 5:
                float fFloatValue2 = ((Float) obj).floatValue();
                xuz xuzVar6 = v330.Q1;
                v330Var.G0().x(new l330(fFloatValue2));
                break;
            case 6:
                float fFloatValue3 = ((Float) obj).floatValue();
                xuz xuzVar7 = v330.Q1;
                v330Var.G0().x(new f330(fFloatValue3));
                break;
            default:
                int iIntValue3 = ((Integer) obj).intValue();
                xuz xuzVar8 = v330.Q1;
                v330Var.G0().x(new g330(iIntValue3));
                break;
        }
        return Unit.f46060a;
    }
}
