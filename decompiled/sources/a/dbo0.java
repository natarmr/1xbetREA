package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dbo0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5816a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ dbo0(pz40 pz40Var, byte b) {
        this.f5816a = b;
        this.b = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5816a;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                pz40Var.setValue((qkx) obj);
                break;
            case 1:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                zai0 zai0Var = cbi0.m;
                Boolean bool = (Boolean) pz40Var.getValue();
                bool.getClass();
                abi0Var.b(zai0Var, bool);
                break;
            case 2:
                a9q0 a9q0Var = (a9q0) obj;
                a9q0Var.getClass();
                pz40Var.setValue(Boolean.valueOf(a9q0Var.f()));
                break;
            case 3:
                a9q0 a9q0Var2 = (a9q0) obj;
                a9q0Var2.getClass();
                pz40Var.setValue(new daq0(a9q0Var2.m(0) ? qmk.q : qmk.r));
                break;
            case 4:
                ((Function1) pz40Var.getValue()).invoke((ne60) obj);
                break;
            case 5:
                pz40Var.setValue((j6z) obj);
                break;
            case 6:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                Boolean bool2 = (Boolean) pz40Var.getValue();
                bool2.booleanValue();
                zai0 zai0Var2 = ter0.b;
                iiy iiyVar = ter0.f33835a[0];
                zai0Var2.getClass();
                abi0Var2.b(zai0Var2, bool2);
                break;
            case 7:
                qkx qkxVar = (qkx) obj;
                long j = qkxVar.f28908a;
                pz40Var.setValue(qkxVar);
                break;
            case 8:
                lz3 lz3Var = (lz3) obj;
                lz3Var.getClass();
                pz40Var.setValue(lz3Var);
                break;
            case 9:
                a9q0 a9q0Var3 = (a9q0) obj;
                a9q0Var3.getClass();
                long j2 = a9q0Var3.f491a.b.f42262a.b;
                daq0 daq0Var = new daq0(j2);
                long j3 = ((daq0) pz40Var.getValue()).f5764a;
                idm0.n(j2, j3);
                if (Float.compare(daq0.c(j2), daq0.c(j3)) >= 0) {
                    daq0Var = null;
                }
                pz40Var.setValue(new daq0(daq0Var != null ? daq0Var.f5764a : ((daq0) pz40Var.getValue()).f5764a));
                break;
            case 10:
                String str = (String) obj;
                int i = ffv0.k2;
                str.getClass();
                pz40Var.setValue(str);
                break;
            default:
                qkx qkxVar2 = (qkx) obj;
                long j4 = qkxVar2.f28908a;
                pz40Var.setValue(qkxVar2);
                break;
        }
        return Unit.f46060a;
    }
}
