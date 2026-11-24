package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ckg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4504a;
    public final /* synthetic */ xcz b;
    public final /* synthetic */ float c;

    public /* synthetic */ ckg(xcz xczVar, float f, byte b) {
        this.f4504a = b;
        this.b = xczVar;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4504a;
        boolean z = true;
        float f = this.c;
        xcz xczVar = this.b;
        switch (b) {
            case 0:
                if ((xczVar.h() != 0 || xczVar.i() <= f) && xczVar.h() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if ((xczVar.h() != 0 || xczVar.i() <= f) && xczVar.h() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (xczVar.h() <= 0 && xczVar.i() <= f) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
