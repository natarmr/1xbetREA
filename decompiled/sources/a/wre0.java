package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class wre0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39638a;
    public final String b;

    public /* synthetic */ wre0(String str, byte b) {
        this.f39638a = b;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        byte b = this.f39638a;
        String str2 = this.b;
        switch (b) {
            case 0:
                String strM = axq.m(new StringBuilder(), j4m0.n.f32934a.f34663a, '.');
                str = kotlin.text.c.x(str2, strM, false) ? strM : null;
                return str == null ? "" : str;
            default:
                String strM2 = axq.m(new StringBuilder(), j4m0.l.f32934a.f34663a, '.');
                str = kotlin.text.c.x(str2, strM2, false) ? strM2 : null;
                return str == null ? "" : str;
        }
    }
}
