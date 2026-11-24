package a;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class ua6 extends yw5 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua6(b4e b4eVar, byte b) {
        super(b4eVar);
        this.b = b;
    }

    @Override // a.y2e
    public final boolean b(ppv0 ppv0Var) {
        byte b = this.b;
        ppv0Var.getClass();
        switch (b) {
            case 0:
                return ppv0Var.j.c;
            case 1:
                return ppv0Var.j.e;
            case 2:
                return ppv0Var.j.f24629a == sl50.b;
            case 3:
                return ppv0Var.j.f24629a == sl50.c;
            default:
                return ppv0Var.j.f;
        }
    }

    @Override // a.yw5
    public final int d() {
        switch (this.b) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 7;
            default:
                return 9;
        }
    }

    @Override // a.yw5
    public final boolean e(Object obj) {
        boolean zBooleanValue;
        switch (this.b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                pl50 pl50Var = (pl50) obj;
                pl50Var.getClass();
                return pl50Var.e || !pl50Var.f27167a || (Build.VERSION.SDK_INT >= 26 && !pl50Var.b);
            case 3:
                pl50 pl50Var2 = (pl50) obj;
                pl50Var2.getClass();
                return !pl50Var2.f27167a || pl50Var2.c || pl50Var2.e;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
