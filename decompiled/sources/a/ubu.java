package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes3.dex */
public final class ubu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35400a;
    public final v6j0 b;

    public ubu(v6j0 v6j0Var, byte b) {
        this.f35400a = b;
        switch (b) {
            case 1:
                v6j0Var.getClass();
                this.b = v6j0Var;
                break;
            case 2:
                v6j0Var.getClass();
                this.b = v6j0Var;
                break;
            default:
                this.b = v6j0Var;
                break;
        }
    }

    public boolean a() {
        byte b = this.f35400a;
        v6j0 v6j0Var = this.b;
        switch (b) {
            case 0:
                return v6j0Var.f36880a.a().getBoolean("GAME_CURRENCY_POP_UP", true);
            default:
                return v6j0Var.f36880a.a().getBoolean(CommonConstant.RETKEY.QR_CODE, false);
        }
    }
}
