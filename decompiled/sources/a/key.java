package a;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class key implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18172a;
    public final mey b;

    public /* synthetic */ key(mey meyVar, byte b) {
        this.f18172a = b;
        this.b = meyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18172a;
        mey meyVar = this.b;
        switch (b) {
            case 0:
                List listC = kotlin.collections.a.c(d93.a(meyVar.f21670a.c(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                listC.getClass();
                return listC.isEmpty() ? ujn.c : new i93(listC, (byte) 0);
            default:
                return meyVar.f21670a.c().e();
        }
    }
}
