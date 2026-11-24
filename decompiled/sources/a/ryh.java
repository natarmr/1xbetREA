package a;

import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ryh extends dtb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31314a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;

    public ryh(mie0 mie0Var, Function1 function1) {
        this.f31314a = (byte) 1;
        this.c = mie0Var;
        this.b = function1;
    }

    @Override // a.dtb
    public final Object Q() {
        byte b = this.f31314a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return Boolean.valueOf(((boolean[]) obj)[0]);
            case 1:
                return (mp9) ((mie0) obj).f21842a;
            default:
                ley leyVar = (ley) ((mie0) obj).f21842a;
                return leyVar == null ? ley.d : leyVar;
        }
    }

    @Override // a.dtb
    public void v(Object obj) {
        switch (this.f31314a) {
            case 1:
                mp9 mp9Var = (mp9) obj;
                mp9Var.getClass();
                mie0 mie0Var = (mie0) this.c;
                if (mie0Var.f21842a == null && ((Boolean) ((Function1) this.b).invoke(mp9Var)).booleanValue()) {
                    mie0Var.f21842a = mp9Var;
                    break;
                }
                break;
        }
    }

    @Override // a.dtb
    public final boolean y(Object obj) {
        byte b = this.f31314a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                if (((Boolean) ((Function1) obj2).invoke(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            case 1:
                ((mp9) obj).getClass();
                return ((mie0) obj3).f21842a == null;
            default:
                wm40 wm40Var = (wm40) obj;
                mie0 mie0Var = (mie0) obj3;
                wm40Var.getClass();
                String str = (String) obj2;
                String str2 = bay.f2281a;
                qlc qlcVarH = bay.h(rek.g(wm40Var).f32934a);
                String str3 = (qlcVarH != null ? rey.b(qlcVarH) : lmc.F(wm40Var, hfk0.f)) + '.' + str;
                if (pey.b.contains(str3)) {
                    mie0Var.f21842a = ley.f19927a;
                } else if (pey.d.contains(str3)) {
                    mie0Var.f21842a = ley.b;
                } else if (pey.c.contains(str3)) {
                    mie0Var.f21842a = ley.c;
                } else if (pey.f26874a.contains(str3)) {
                    mie0Var.f21842a = ley.e;
                }
                return mie0Var.f21842a == null;
        }
    }

    public /* synthetic */ ryh(Object obj, Serializable serializable, byte b) {
        this.f31314a = b;
        this.b = obj;
        this.c = serializable;
    }
}
