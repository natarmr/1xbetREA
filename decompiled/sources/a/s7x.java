package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s7x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31773a;
    public final /* synthetic */ int b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ ugd d;

    public /* synthetic */ s7x(byte b, int i, ugd ugdVar, a4x a4xVar) {
        this.f31773a = b;
        this.b = i;
        this.c = a4xVar;
        this.d = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31773a;
        ugd ugdVar = this.d;
        a4x a4xVar = this.c;
        switch (b) {
            case 0:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                i8z.f(i8zVar, this.b, new oea(a4xVar, (byte) 16), new oea(a4xVar, (byte) 17), new ugd(2095168232, true, new fpg(ugdVar, a4xVar, (byte) 2)), 4);
                break;
            default:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(this.b, new oea(a4xVar, (byte) 18), new oea(a4xVar, (byte) 19), new ugd(120824804, true, new fpg(ugdVar, a4xVar, (byte) 3)));
                break;
        }
        return Unit.f46060a;
    }
}
