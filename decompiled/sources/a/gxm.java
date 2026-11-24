package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gxm implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12082a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ xcz c;
    public final /* synthetic */ xcz d;

    public /* synthetic */ gxm(vne vneVar, xcz xczVar, xcz xczVar2, byte b) {
        this.f12082a = b;
        this.b = vneVar;
        this.c = xczVar;
        this.d = xczVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12082a;
        vne vneVar = this.b;
        Float f = (Float) obj;
        float fFloatValue = f.floatValue();
        switch (b) {
            case 0:
                qjj.W(vneVar, null, null, new hxm(this.c, fFloatValue, this.d, null, (byte) 0), 3);
                break;
            case 1:
                qjj.W(vneVar, null, null, new hxm(this.c, fFloatValue, this.d, null, (byte) 1), 3);
                break;
            case 2:
                qjj.W(vneVar, null, null, new hxm(this.c, fFloatValue, this.d, null, (byte) 2), 3);
                break;
            default:
                qjj.W(vneVar, null, null, new hxm(this.c, fFloatValue, this.d, null, (byte) 3), 3);
                break;
        }
        return f;
    }
}
