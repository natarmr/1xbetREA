package a;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yly extends oyc {
    public final /* synthetic */ byte c = 1;
    public final Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yly(b9o0 b9o0Var) {
        super(0);
        this.e = b9o0Var;
        this.d = new HashMap();
    }

    @Override // a.oyc
    public final void f(div0 div0Var) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                zly zlyVar = (zly) obj;
                if ((div0Var.f6156a.d() & 8) != 0) {
                    zlyVar.A = false;
                }
                zlyVar.a1();
                break;
            default:
                ArrayList arrayList = ((b9o0) this.e).b;
                if ((div0Var.f6156a.d() & 519) != 0) {
                    ((HashMap) obj).remove(div0Var);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        i2d0 i2d0Var = (i2d0) arrayList.get(size);
                        int i = i2d0Var.e;
                        boolean z = i > 0;
                        int i2 = i - 1;
                        i2d0Var.e = i2;
                        if (z && i2 == 0) {
                            i2d0Var.c();
                        }
                    }
                }
                break;
        }
    }

    @Override // a.oyc
    public final void g(div0 div0Var) {
        switch (this.c) {
            case 0:
                if ((div0Var.f6156a.d() & 8) != 0) {
                    ((zly) this.d).A = true;
                }
                break;
            default:
                ArrayList arrayList = ((b9o0) this.e).b;
                if ((div0Var.f6156a.d() & 519) != 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((i2d0) arrayList.get(size)).e++;
                    }
                }
                break;
        }
    }

    @Override // a.oyc
    public final xiv0 h(xiv0 xiv0Var, List list) {
        byte b = this.c;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                xiv0Var.getClass();
                list.getClass();
                uiv0 uiv0Var = xiv0Var.f40966a;
                boolean z = uiv0Var.u(8) && ((View) obj2).hasWindowFocus();
                ((zly) obj).Z0(z ? uiv0Var.i(8).d : 0.0f, z);
                return xiv0Var;
            default:
                ArrayList arrayList = ((b9o0) obj2).b;
                RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
                int i = 0;
                for (int size = list.size() - 1; size >= 0; size--) {
                    div0 div0Var = (div0) list.get(size);
                    Integer num = (Integer) ((HashMap) obj).get(div0Var);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        float fA = div0Var.f6156a.a();
                        if ((iIntValue & 1) != 0) {
                            rectF.left = fA;
                        }
                        if ((iIntValue & 2) != 0) {
                            rectF.top = fA;
                        }
                        if ((iIntValue & 4) != 0) {
                            rectF.right = fA;
                        }
                        if ((iIntValue & 8) != 0) {
                            rectF.bottom = fA;
                        }
                        i |= iIntValue;
                    }
                }
                pfx.b(xiv0Var.f40966a.i(519), xiv0Var.f40966a.i(64));
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    i2d0 i2d0Var = (i2d0) arrayList.get(size2);
                    pfx pfxVar = i2d0Var.d;
                    ArrayList arrayList2 = i2d0Var.f14042a;
                    for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                        ((p4d) arrayList2.get(size3)).getClass();
                        if ((0 & i) != 0) {
                            throw null;
                        }
                    }
                }
                return xiv0Var;
        }
    }

    @Override // a.oyc
    public hcp0 i(div0 div0Var, hcp0 hcp0Var) {
        switch (this.c) {
            case 1:
                if ((div0Var.f6156a.d() & 519) != 0) {
                    pfx pfxVar = (pfx) hcp0Var.c;
                    pfx pfxVar2 = (pfx) hcp0Var.b;
                    int i = pfxVar.f26926a != pfxVar2.f26926a ? 1 : 0;
                    if (pfxVar.b != pfxVar2.b) {
                        i |= 2;
                    }
                    if (pfxVar.c != pfxVar2.c) {
                        i |= 4;
                    }
                    if (pfxVar.d != pfxVar2.d) {
                        i |= 8;
                    }
                    ((HashMap) this.d).put(div0Var, Integer.valueOf(i));
                }
                break;
        }
        return hcp0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yly(zly zlyVar, View view) {
        super(1);
        this.d = zlyVar;
        this.e = view;
    }
}
