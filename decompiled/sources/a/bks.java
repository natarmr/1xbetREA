package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bks implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2765a;
    public final /* synthetic */ yks b;

    public /* synthetic */ bks(yks yksVar, byte b) {
        this.f2765a = b;
        this.b = yksVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2765a;
        yks yksVar = this.b;
        switch (b) {
            case 0:
                njs njsVarA = njs.a((njs) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, true, null, null, null, null, null, null, null, null, null, null, -1, 65521);
                yksVar.o.e("KEY_SHOW_SUB_GAMES", Boolean.valueOf(njsVarA.I));
                return njsVarA;
            case 1:
                njs njsVarA2 = njs.a((njs) obj2, 0L, null, null, false, 0L, 0L, null, tf50.f33851a, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -671089153, 65535);
                yksVar.o.e("KEY_CURRENT_NAVIGATION_TAB", njsVarA2.j);
                return njsVarA2;
            default:
                njs njsVarA3 = njs.a((njs) obj2, 0L, null, null, false, 0L, 0L, null, tf50.f33851a, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -1342177793, 65535);
                yksVar.o.e("KEY_CURRENT_NAVIGATION_TAB", njsVarA3.j);
                return njsVarA3;
        }
    }
}
