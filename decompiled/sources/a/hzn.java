package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class hzn extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13915a;
    public final /* synthetic */ toj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hzn(toj0 toj0Var, byte b) {
        super(0);
        this.f13915a = b;
        this.b = toj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13915a;
        toj0 toj0Var = this.b;
        switch (b) {
            case 0:
                return toj0Var;
            default:
                pz40 pz40Var = toj0Var.b;
                Boolean bool = Boolean.FALSE;
                ((hgk0) pz40Var).setValue(bool);
                toj0Var.c(false);
                sd60 sd60Var = toj0Var.c;
                ((hgk0) ((pz40) sd60Var.b)).setValue(bool);
                ((hgk0) ((pz40) sd60Var.d)).setValue(bool);
                ((hgk0) ((pz40) sd60Var.f)).setValue(bool);
                ((hgk0) ((pz40) sd60Var.h)).setValue(bool);
                toj0Var.e = y3d.f;
                toj0Var.f = 1.0f;
                toj0Var.g = 1.0f;
                i6u0 i6u0Var = toj0Var.j;
                if (i6u0Var != null) {
                    zaj[] zajVarArr = i6u0Var.d;
                    qx3.l(0, zajVarArr.length, null, zajVarArr);
                    i6u0Var.e = 0;
                }
                toj0Var.h = ils0.b;
                toj0Var.i = 0L;
                return Unit.f46060a;
        }
    }
}
