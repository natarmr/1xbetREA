package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class xgk extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40844a;
    public final /* synthetic */ uii b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xgk(uii uiiVar, byte b) {
        super(0);
        this.f40844a = b;
        this.b = uiiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40844a;
        String str = "";
        uii uiiVar = this.b;
        switch (b) {
            case 0:
                Object objE = c3x.E(1000L, new sz2((h03) uiiVar.b, (byte) 0));
                e0g0 e0g0Var = j0g0.b;
                Object obj = str;
                if (!(objE instanceof g0g0)) {
                    obj = objE;
                }
                return new tz2((String) obj);
            case 1:
                Object objE2 = c3x.E(1000L, new sz2((xsu) uiiVar.f35730a, (byte) 11));
                e0g0 e0g0Var2 = j0g0.b;
                if (objE2 instanceof g0g0) {
                    objE2 = "";
                }
                String str2 = (String) objE2;
                String str3 = str;
                if (str2 != null) {
                    str3 = str2;
                }
                return new liv(str3);
            default:
                Object objE3 = c3x.E(3000L, new vut0((uuz) uiiVar.c, (byte) 23));
                e0g0 e0g0Var3 = j0g0.b;
                if (objE3 instanceof g0g0) {
                    objE3 = null;
                }
                String str4 = (String) objE3;
                String str5 = str;
                if (str4 != null) {
                    str5 = str4;
                }
                return new zm30(str5);
        }
    }
}
