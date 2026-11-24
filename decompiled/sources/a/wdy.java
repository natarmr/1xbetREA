package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wdy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38994a;
    public final /* synthetic */ edy b;

    public /* synthetic */ wdy(edy edyVar, byte b) {
        this.f38994a = b;
        this.b = edyVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zD;
        Integer numG;
        byte b = this.f38994a;
        edy edyVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                str.getClass();
                mcy mcyVar = (mcy) edyVar.get(str);
                if (mcyVar == null) {
                    return null;
                }
                jdy jdyVarJ = ncy.j(mcyVar);
                if (jdyVarJ instanceof bdy) {
                    return null;
                }
                return jdyVarJ.b();
            case 1:
                str.getClass();
                mcy mcyVar2 = (mcy) edyVar.get(str);
                if (mcyVar2 != null) {
                    return ncy.g(ncy.j(mcyVar2));
                }
                return null;
            default:
                str.getClass();
                mcy mcyVar3 = (mcy) edyVar.get(str);
                jdy jdyVarJ2 = mcyVar3 != null ? ncy.j(mcyVar3) : null;
                boolean z = false;
                if (jdyVarJ2 != null) {
                    scx scxVar = ncy.f23316a;
                    zD = Intrinsics.d(wsm0.b(jdyVarJ2.b()), Boolean.TRUE);
                } else {
                    zD = false;
                }
                if (zD || (jdyVarJ2 != null && (numG = ncy.g(jdyVarJ2)) != null && numG.intValue() == 1)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
