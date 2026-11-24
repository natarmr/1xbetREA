package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sq implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32608a;
    public final /* synthetic */ vq b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ sq(vq vqVar, Function0 function0, byte b) {
        this.f32608a = b;
        this.b = vqVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32608a;
        Function0 function0 = this.c;
        vq vqVar = this.b;
        switch (b) {
            case 0:
                vqVar.h(function0);
                break;
            case 1:
                vqVar.h(function0);
                break;
            case 2:
                vqVar.h(function0);
                break;
            case 3:
                vqVar.h(function0);
                break;
            default:
                vqVar.h(function0);
                break;
        }
        return Unit.f46060a;
    }
}
