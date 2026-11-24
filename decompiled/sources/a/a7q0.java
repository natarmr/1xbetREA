package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class a7q0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vne f385a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ gy40 c;
    public final /* synthetic */ pz40 d;

    public a7q0(vne vneVar, pz40 pz40Var, gy40 gy40Var, pz40 pz40Var2) {
        this.f385a = vneVar;
        this.b = pz40Var;
        this.c = gy40Var;
        this.d = pz40Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        gxt gxtVar = new gxt(this.f385a, this.b, this.c, (yje) null);
        dbo0 dbo0Var = new dbo0(this.d, (byte) 4);
        bk9 bk9Var = tto0.f34518a;
        Object objJ = d5c.J(yjeVar, new wn2(hpa0Var, gxtVar, dbo0Var, new hub0(hpa0Var), (yje) null, (byte) 29));
        wne wneVar = wne.f39444a;
        if (objJ != wneVar) {
            objJ = Unit.f46060a;
        }
        return objJ == wneVar ? objJ : Unit.f46060a;
    }
}
