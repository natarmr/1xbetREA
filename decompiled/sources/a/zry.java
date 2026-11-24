package a;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class zry implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44881a;
    public final bsy b;

    public /* synthetic */ zry(bsy bsyVar, byte b) {
        this.f44881a = b;
        this.b = bsyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44881a;
        bsy bsyVar = this.b;
        switch (b) {
            case 0:
                bqy bqyVar = bsyVar.j;
                fqy fqyVar = bqyVar.d;
                if (j24.o.m(j24.f15764a[33], bqyVar)) {
                    return null;
                }
                return fqyVar;
            default:
                Type typeW = vvw.w(bsyVar);
                return typeW == null ? bsyVar.x().getReturnType() : typeW;
        }
    }
}
