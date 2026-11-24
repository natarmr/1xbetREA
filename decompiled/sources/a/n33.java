package a;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.calendar.impl.presentation.content.month.CyberCalendarMonthView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n33 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22830a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n33(Context context, Function1 function1, androidx.compose.runtime.a aVar, fzg0 fzg0Var, int i, View view) {
        this.c = context;
        this.d = function1;
        this.e = aVar;
        this.f = fzg0Var;
        this.b = i;
        this.g = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22830a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                KeyEvent.Callback callback = (View) obj;
                callback.getClass();
                return new bhu0((Context) obj5, (Function1) obj4, (androidx.compose.runtime.a) obj3, (fzg0) obj2, this.b, (cg80) callback).getLayoutNode();
            default:
                CyberCalendarMonthView cyberCalendarMonthView = (CyberCalendarMonthView) obj5;
                p6g p6gVar = (p6g) obj4;
                x7g x7gVar = (x7g) obj2;
                x7g x7gVar2 = (x7g) obj;
                int i = CyberCalendarMonthView.b;
                int size = ((ArrayList) obj3).size() - 1;
                int i2 = this.b;
                boolean z = i2 == size;
                ArrayList arrayList = cyberCalendarMonthView.f46489a;
                ibg ibgVarA = (ibg) CollectionsKt.W(i2, arrayList);
                if (ibgVarA == null) {
                    ibgVarA = ibg.a(LayoutInflater.from(cyberCalendarMonthView.getContext()), cyberCalendarMonthView);
                    cyberCalendarMonthView.addView(ibgVarA.f14485a);
                    arrayList.add(ibgVarA);
                }
                ibgVarA.b.f(yag.d, p6gVar.b, x7gVar, x7gVar2);
                ibgVarA.d.setVisibility(z ? 8 : 0);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ n33(CyberCalendarMonthView cyberCalendarMonthView, p6g p6gVar, int i, ArrayList arrayList, x7g x7gVar, x7g x7gVar2) {
        this.c = cyberCalendarMonthView;
        this.d = p6gVar;
        this.b = i;
        this.e = arrayList;
        this.f = x7gVar;
        this.g = x7gVar2;
    }
}
