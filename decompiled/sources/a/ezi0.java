package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ezi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8673a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ hzi0 c;

    public /* synthetic */ ezi0(hzi0 hzi0Var, Function1 function1) {
        this.c = hzi0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8673a;
        hzi0 hzi0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                hxx hxxVar = (hxx) obj;
                hxxVar.getClass();
                DsMenuCell dsMenuCell = hxxVar.b;
                dsMenuCell.getClass();
                dyb.c0(dsMenuCell, new ezi0(function1, hzi0Var));
                DsCellMiddleTitle dsCellMiddleTitle = hxxVar.e;
                dsCellMiddleTitle.setTitle(hzi0Var.b);
                dsCellMiddleTitle.setSubtitle(hzi0Var.f13908a);
                hxxVar.d.setIconResource(R.drawable.glyph_exclamation);
                hxxVar.c.setImageResource(R.drawable.banner_time);
                break;
            default:
                ((View) obj).getClass();
                function1.invoke(hzi0Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ezi0(Function1 function1, hzi0 hzi0Var) {
        this.b = function1;
        this.c = hzi0Var;
    }
}
