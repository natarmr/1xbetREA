package a;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y1o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41866a = 0;
    public final /* synthetic */ Context b;

    public /* synthetic */ y1o(Context context) {
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41866a;
        Context context = this.b;
        switch (b) {
            case 0:
                String string = context.getString(((Integer) obj).intValue());
                string.getClass();
                return string;
            default:
                b1o0 b1o0Var = (b1o0) obj;
                b1o0Var.getClass();
                b1o0Var.b.setImageDrawable(sj3.U(R.drawable.cybergame_crystal_blue, context));
                b1o0Var.c.setImageDrawable(context.getDrawable(R.drawable.cybergame_crystal_cyan));
                b1o0Var.d.setImageDrawable(context.getDrawable(R.drawable.cybergame_crystal_orange));
                b1o0Var.f.setImageDrawable(context.getDrawable(R.drawable.cybergame_crystal_red));
                b1o0Var.e.setImageDrawable(context.getDrawable(R.drawable.cybergame_crystal_purple));
                b1o0Var.g.setImageDrawable(context.getDrawable(R.drawable.cybergame_crystal_yellow));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ y1o(Context context, mgf mgfVar) {
        this.b = context;
    }
}
