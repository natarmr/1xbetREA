package a;

import java.util.Collection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class afk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f781a;
    public final cfk b;

    public /* synthetic */ afk(cfk cfkVar, byte b) {
        this.f781a = b;
        this.b = cfkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f781a;
        cfk cfkVar = this.b;
        switch (b) {
            case 0:
                cek cekVar = cek.m;
                cr30.f4824a.getClass();
                j9x j9xVar = j9x.Y;
                ux50 ux50Var = ux50.f36425a;
                return cfkVar.i(cekVar, j9xVar);
            default:
                cty ctyVar = cfkVar.g;
                ffk ffkVar = cfkVar.j;
                ctyVar.getClass();
                ffkVar.getClass();
                Collection collectionB = ((r5) ffkVar.h()).b();
                collectionB.getClass();
                return collectionB;
        }
    }
}
