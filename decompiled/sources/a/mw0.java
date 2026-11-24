package a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mw0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ View j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw0(View view, int i, int i2, w6k w6kVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = view;
        this.k = i;
        this.l = i2;
        this.m = w6kVar;
        this.n = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new mw0(this.j, this.k, this.l, (w6k) this.m, (pz40) obj2, yjeVar);
            default:
                int i = this.l;
                mw0 mw0Var = new mw0(this.j, this.k, (View) obj2, i, yjeVar);
                mw0Var.m = obj;
                return mw0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mw0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mw0) create((cgx) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vvk vvkVarH;
        Rect rect;
        byte b = this.i;
        int i = this.l;
        Object obj2 = this.n;
        int i2 = this.k;
        View view = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                WeakHashMap weakHashMap = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(view);
                if (xiv0VarA != null && (vvkVarH = xiv0VarA.f40966a.h()) != null) {
                    List listI = Build.VERSION.SDK_INT >= 28 ? ia3.i(vvkVarH.f38104a) : Collections.EMPTY_LIST;
                    if (listI != null && (rect = (Rect) CollectionsKt.firstOrNull(listI)) != null) {
                        w6k w6kVar = (w6k) this.m;
                        pz40 pz40Var = (pz40) obj2;
                        int iWidth = (rect.width() / 2) + rect.left;
                        int i3 = i2 / 4;
                        int iHeight = (rect.height() / 2) + rect.top;
                        zcl zclVar = qmk.f28987a;
                        float density = (w6kVar.getDensity() * 56.0f) + i;
                        boolean z = false;
                        if (i <= iHeight && iHeight <= ((int) density)) {
                            z = true;
                        }
                        if (iWidth >= 0 && iWidth <= i3 && z) {
                            pz40Var.setValue(new fh80(rect.width() / w6kVar.getDensity(), 0.0f, 14));
                        } else if (i2 - i3 > iWidth || iWidth > i2 || !z) {
                            pz40Var.setValue(new fh80(0.0f, 0.0f, 15));
                        } else {
                            pz40Var.setValue(new fh80(0.0f, rect.width() / w6kVar.getDensity(), 11));
                        }
                    }
                }
                break;
            default:
                cgx cgxVar = (cgx) this.m;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z2 = cgxVar.c;
                int iMax = cgxVar.f4335a;
                if (z2) {
                    iMax = Math.max(cgxVar.b, iMax);
                }
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i2 + iMax);
                View view2 = (View) obj2;
                if (view2 != null) {
                    int paddingLeft = view2.getPaddingLeft();
                    int paddingTop = view2.getPaddingTop();
                    int paddingRight = view2.getPaddingRight();
                    if (cgxVar.c) {
                        i += iMax;
                    }
                    view2.setPadding(paddingLeft, paddingTop, paddingRight, i);
                }
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw0(View view, int i, View view2, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.j = view;
        this.k = i;
        this.n = view2;
        this.l = i2;
    }
}
