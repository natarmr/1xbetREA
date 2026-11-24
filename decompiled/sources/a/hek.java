package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class hek implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12927a;
    public final iek b;

    public /* synthetic */ hek(iek iekVar, byte b) {
        this.f12927a = b;
        this.b = iekVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12927a;
        iek iekVar = this.b;
        switch (b) {
            case 0:
                pzs0 pzs0Var = (pzs0) obj;
                pzs0Var.getClass();
                if (pzs0Var.c()) {
                    return Separators.STAR;
                }
                wsy wsyVarB = pzs0Var.b();
                wsyVarB.getClass();
                String strP = iekVar.P(wsyVarB);
                if (pzs0Var.a() == t3u0.c) {
                    return strP;
                }
                return pzs0Var.a() + ' ' + strP;
            default:
                wsy wsyVar = (wsy) obj;
                wsyVar.getClass();
                return iekVar.P(wsyVar);
        }
    }
}
