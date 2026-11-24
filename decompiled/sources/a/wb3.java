package a;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wb3 implements zkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38856a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wb3(Object obj, Object obj2, Object obj3, byte b) {
        this.f38856a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // a.zkz
    public final void l(clz clzVar, kkz kkzVar) {
        byte b = this.f38856a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                c5k c5kVar = (c5k) obj3;
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                n6r n6rVar = (n6r) obj;
                if (kkzVar == kkz.ON_DESTROY) {
                    appBarLayout.f((vb3) c5kVar.f3775a);
                    wb3 wb3Var = (wb3) c5kVar.b;
                    if (wb3Var != null) {
                        n6rVar.b();
                        n6rVar.c.f(wb3Var);
                    }
                    c5kVar.f3775a = null;
                    c5kVar.b = null;
                }
                break;
            case 1:
                nlz nlzVar = (nlz) obj3;
                mie0 mie0Var = (mie0) obj2;
                Function1 function1 = (Function1) obj;
                int i = ykz.f42815a[kkzVar.ordinal()];
                if (i == 1) {
                    mie0Var.f21842a = function1.invoke(nlzVar);
                    break;
                } else if (i == 2) {
                    olz olzVar = (olz) mie0Var.f21842a;
                    if (olzVar != null) {
                        olzVar.a();
                    }
                    mie0Var.f21842a = null;
                    break;
                }
                break;
            default:
                ilz ilzVar = (ilz) obj3;
                mie0 mie0Var2 = (mie0) obj2;
                Function1 function2 = (Function1) obj;
                int i2 = ykz.f42815a[kkzVar.ordinal()];
                if (i2 == 3) {
                    mie0Var2.f21842a = function2.invoke(ilzVar);
                    break;
                } else if (i2 == 4) {
                    dlz dlzVar = (dlz) mie0Var2.f21842a;
                    if (dlzVar != null) {
                        dlzVar.a();
                    }
                    mie0Var2.f21842a = null;
                    break;
                }
                break;
        }
    }
}
