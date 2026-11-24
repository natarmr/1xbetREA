package a;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes6.dex */
public final class otl extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25834a;
    public final /* synthetic */ stl b;

    public /* synthetic */ otl(stl stlVar, byte b) {
        this.f25834a = b;
        this.b = stlVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        byte b = this.f25834a;
        stl stlVar = this.b;
        switch (b) {
            case 0:
                view.getClass();
                outline.getClass();
                iiy[] iiyVarArr = stl.f2;
                int iIntValue = ((Number) stlVar.Z1.getValue()).intValue();
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + iIntValue, Math.abs(iIntValue));
                break;
            default:
                view.getClass();
                outline.getClass();
                iiy[] iiyVarArr2 = stl.f2;
                int iIntValue2 = ((Number) stlVar.Z1.getValue()).intValue();
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + iIntValue2, Math.abs(iIntValue2));
                break;
        }
    }
}
