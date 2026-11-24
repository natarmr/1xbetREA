package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ynr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42953a;
    public final /* synthetic */ lok0 b;

    public /* synthetic */ ynr(lok0 lok0Var, byte b) {
        this.f42953a = b;
        this.b = lok0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42953a;
        lok0 lok0Var = this.b;
        switch (b) {
            case 0:
                qnr qnrVar = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar.getClass();
                int i = lok0Var.f20396a;
                String strValueOf = lok0Var.u;
                strValueOf.getClass();
                bzu bzuVar = new bzu((byte) 23);
                bzuVar.g("static");
                bzuVar.g("img");
                bzuVar.g("android");
                bzuVar.g("TopChamps");
                if (strValueOf.length() == 0) {
                    strValueOf = String.valueOf(i);
                }
                axq.u(bzuVar, strValueOf, "backgrounds", "Game_Screen.png");
                return qnr.a(qnrVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, ((StringBuilder) bzuVar.b).toString(), null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -1, 524286);
            case 1:
                z2s z2sVar = (z2s) obj2;
                ((oyg0) obj).getClass();
                z2sVar.getClass();
                int i2 = lok0Var.f20396a;
                String strValueOf2 = lok0Var.u;
                strValueOf2.getClass();
                bzu bzuVar2 = new bzu((byte) 23);
                bzuVar2.g("static");
                bzuVar2.g("img");
                bzuVar2.g("android");
                bzuVar2.g("TopChamps");
                if (strValueOf2.length() == 0) {
                    strValueOf2 = String.valueOf(i2);
                }
                axq.u(bzuVar2, strValueOf2, "backgrounds", "Game_Screen.png");
                return z2s.a(z2sVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, ((StringBuilder) bzuVar2.b).toString(), null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -268435457, 65535);
            default:
                r7s r7sVar = (r7s) obj2;
                ((oyg0) obj).getClass();
                r7sVar.getClass();
                int i3 = lok0Var.f20396a;
                String strValueOf3 = lok0Var.u;
                strValueOf3.getClass();
                bzu bzuVar3 = new bzu((byte) 23);
                bzuVar3.g("static");
                bzuVar3.g("img");
                bzuVar3.g("android");
                bzuVar3.g("TopChamps");
                if (strValueOf3.length() == 0) {
                    strValueOf3 = String.valueOf(i3);
                }
                axq.u(bzuVar3, strValueOf3, "backgrounds", "Game_Screen.png");
                return r7s.a(r7sVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, ((StringBuilder) bzuVar3.b).toString(), null, false, false, null, null, null, null, null, null, null, null, null, false, -1, 1048567);
        }
    }
}
