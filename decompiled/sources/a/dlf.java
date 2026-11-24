package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dlf implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6278a;
    public final /* synthetic */ m9s b;

    public /* synthetic */ dlf(m9s m9sVar, byte b) {
        this.f6278a = b;
        this.b = m9sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6278a;
        m9s m9sVar = this.b;
        ljg ljgVar = (ljg) obj;
        switch (b) {
            case 0:
                ljgVar.getClass();
                break;
            case 1:
                ljgVar.getClass();
                break;
            default:
                ljgVar.getClass();
                break;
        }
        return z1z.a(ljgVar, m9sVar);
    }
}
