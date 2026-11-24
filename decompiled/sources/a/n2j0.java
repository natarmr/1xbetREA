package a;

import android.view.View;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.components.cells.right.DsCellRightRadioButton;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n2j0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22803a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n2j0(Object obj, Object obj2, Object obj3, byte b) {
        this.f22803a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f22803a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((DsCellRightRadioButton) ((h2j0) obj3).d.d).setSelected(((m2j0) ((cp) obj2).u()).f21063a);
                ((w5j0) obj).A(ezc.CONFIRM_ANY_CHANGE);
                break;
            case 1:
                ((DsCellRightRadioButton) ((h2j0) obj3).b.d).setSelected(((m2j0) ((cp) obj2).u()).b);
                ((w5j0) obj).A(ezc.ACCEPT_ANY_CHANGE);
                break;
            case 2:
                ((DsCellRightRadioButton) ((h2j0) obj3).c.d).setSelected(((m2j0) ((cp) obj2).u()).c);
                ((w5j0) obj).A(ezc.ACCEPT_INCREASE);
                break;
            default:
                rvy rvyVar = (rvy) obj2;
                Function2 function2 = ((bvy) obj3).f;
                rvyVar.getClass();
                function2.invoke(rvyVar, ((fvy) ((avy) obj).u.getValue()).getLoadedPictureUrl());
                break;
        }
    }
}
