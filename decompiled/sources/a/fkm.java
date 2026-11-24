package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fkm implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9700a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fkm(long j, qzt qztVar, fhj fhjVar, String str, wyu wyuVar) {
        this.f9700a = (byte) 4;
        this.c = j;
        this.b = qztVar;
        this.d = fhjVar;
        this.e = str;
        this.f = wyuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9700a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                return DsLottieEmpty.f((Function0) obj4, (DsLottieEmpty) obj3, this.c, (jkm) obj2, (DsButton) obj);
            case 1:
                ((wl40) obj3).e((Function0) obj4, (em40) obj2, this.c, (k6z) obj);
                return Unit.f46060a;
            case 2:
                return new v5a0(((fhj) obj4).s((String) obj3, this.c, ((wyu) obj2).a(), 0L), true, false, false, null, (oaa0) obj);
            case 3:
                String str = (String) obj2;
                return new b5k0(((pru) obj4).a().g.t, "", ((fhj) obj3).s(str, this.c, ((wyu) obj).a(), 0L), null, true, false, false);
            default:
                ofb ofbVar = new ofb(iun.f15405a, "", "", "");
                long j = this.c;
                return new dcm0(j, true, false, new sfb(j, ofbVar), ((qzt) obj4).a(), ((fhj) obj3).s((String) obj2, j, ((wyu) obj).a(), 0L), "");
        }
    }

    public /* synthetic */ fkm(byte b, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f9700a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ fkm(pru pruVar, fhj fhjVar, String str, long j, wyu wyuVar) {
        this.f9700a = (byte) 3;
        this.b = pruVar;
        this.d = fhjVar;
        this.e = str;
        this.c = j;
        this.f = wyuVar;
    }

    public /* synthetic */ fkm(wl40 wl40Var, Function0 function0, em40 em40Var, long j, k6z k6zVar) {
        this.f9700a = (byte) 1;
        this.d = wl40Var;
        this.b = function0;
        this.e = em40Var;
        this.c = j;
        this.f = k6zVar;
    }
}
