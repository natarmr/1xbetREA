package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eya implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8619a;
    public final /* synthetic */ htr b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ eya(htr htrVar, Function1 function1, int i) {
        this.f8619a = (byte) 1;
        this.b = htrVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8619a;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                i8z i8zVar = (i8z) obj;
                ((Integer) obj2).getClass();
                i8zVar.getClass();
                uzb.U(i8zVar, this.b, null, null, new xz8(function1, (byte) 16), 6);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                zgc.l(this.b, function1, (fet) obj, iL);
                break;
            case 2:
                i8z i8zVar2 = (i8z) obj;
                ((Integer) obj2).getClass();
                i8zVar2.getClass();
                uzb.U(i8zVar2, this.b, new x6s(function1, (byte) 21), null, null, 12);
                break;
            case 3:
                i8z i8zVar3 = (i8z) obj;
                ((Integer) obj2).getClass();
                i8zVar3.getClass();
                uzb.U(i8zVar3, this.b, new x6s(function1, (byte) 22), new i160(function1, (byte) 4), null, 8);
                break;
            default:
                i8z i8zVar4 = (i8z) obj;
                ((Integer) obj2).getClass();
                i8zVar4.getClass();
                uzb.U(i8zVar4, this.b, new x6s(function1, (byte) 23), new i160(function1, (byte) 11), null, 8);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ eya(htr htrVar, Function1 function1, byte b) {
        this.f8619a = b;
        this.b = htrVar;
        this.c = function1;
    }
}
