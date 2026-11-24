package a;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cgj implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4316a;
    public final /* synthetic */ x2i b;
    public final /* synthetic */ cp c;

    public /* synthetic */ cgj(x2i x2iVar, cp cpVar, byte b) {
        this.f4316a = b;
        this.b = x2iVar;
        this.c = cpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f4316a;
        final cp cpVar = this.c;
        final x2i x2iVar = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                dyb.P(ymx.INTERVAL_750, new Function0() { // from class: a.dgj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        cp cpVar2 = cpVar;
                        x2i x2iVar2 = x2iVar;
                        switch (b3) {
                            case 0:
                                x2iVar2.invoke(cpVar2.u());
                                dyb.u0();
                                break;
                            default:
                                x2iVar2.invoke(cpVar2.u());
                                dyb.u0();
                                break;
                        }
                        return Boolean.TRUE;
                    }
                });
                break;
            default:
                final byte b3 = 1;
                dyb.P(ymx.INTERVAL_750, new Function0() { // from class: a.dgj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b3;
                        cp cpVar2 = cpVar;
                        x2i x2iVar2 = x2iVar;
                        switch (b4) {
                            case 0:
                                x2iVar2.invoke(cpVar2.u());
                                dyb.u0();
                                break;
                            default:
                                x2iVar2.invoke(cpVar2.u());
                                dyb.u0();
                                break;
                        }
                        return Boolean.TRUE;
                    }
                });
                break;
        }
    }
}
