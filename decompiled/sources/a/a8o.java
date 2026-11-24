package a;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.championships.esports_world_cup.presentation.discipline.discipline_banner.DisciplineBannerView;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a8o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f436a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ wnk c;

    public /* synthetic */ a8o(wnk wnkVar, Function1 function1) {
        this.c = wnkVar;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f436a;
        wnk wnkVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                bmg bmgVar = (bmg) obj;
                bmgVar.getClass();
                DisciplineBannerView disciplineBannerView = bmgVar.f2835a;
                dyb.c0(disciplineBannerView, new a8o(function1, wnkVar));
                disciplineBannerView.setTitle(wnkVar.c);
                disciplineBannerView.setSubtitle(wnkVar.d);
                String str = wnkVar.e.f34239a;
                List list = u0d.f34849a;
                u0d.j((LoadableShapeableImageView) disciplineBannerView.q.c, str, R.drawable.cybergames_discipline_placeholder, 0, null, null, null, 508);
                disciplineBannerView.setBannerType(wnkVar.f);
                break;
            default:
                ((View) obj).getClass();
                function1.invoke(wnkVar);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ a8o(Function1 function1, wnk wnkVar) {
        this.b = function1;
        this.c = wnkVar;
    }
}
