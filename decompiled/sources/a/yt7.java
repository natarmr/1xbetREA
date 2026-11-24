package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yt7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43203a;
    public final /* synthetic */ au7 b;

    public /* synthetic */ yt7(au7 au7Var, byte b) {
        this.f43203a = b;
        this.b = au7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f43203a;
        au7 au7Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                yk5 yk5Var = au7.U1;
                str.getClass();
                au7Var.H0().x(new mt7(str));
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                yk5 yk5Var2 = au7.U1;
                au7Var.H0().x(new kt7(iIntValue));
                break;
            case 2:
                String str2 = (String) obj;
                yk5 yk5Var3 = au7.U1;
                str2.getClass();
                au7Var.H0().x(new nt7(str2));
                break;
            case 3:
                int iIntValue2 = ((Integer) obj).intValue();
                yk5 yk5Var4 = au7.U1;
                au7Var.H0().x(new qt7(iIntValue2));
                break;
            default:
                int iIntValue3 = ((Integer) obj).intValue();
                yk5 yk5Var5 = au7.U1;
                au7Var.H0().x(new lt7(iIntValue3));
                break;
        }
        return Unit.f46060a;
    }
}
