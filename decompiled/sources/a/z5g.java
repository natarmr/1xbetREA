package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.calendar.impl.presentation.content.day.CyberCalendarDaySwitcher;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z5g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43813a = 0;
    public final /* synthetic */ CyberCalendarDaySwitcher b;
    public final /* synthetic */ i5g c;
    public final /* synthetic */ i5g d;

    public /* synthetic */ z5g(CyberCalendarDaySwitcher cyberCalendarDaySwitcher, i5g i5gVar, i5g i5gVar2) {
        this.b = cyberCalendarDaySwitcher;
        this.d = i5gVar;
        this.c = i5gVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f43813a;
        i5g i5gVar = this.d;
        i5g i5gVar2 = this.c;
        CyberCalendarDaySwitcher cyberCalendarDaySwitcher = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                int i = CyberCalendarDaySwitcher.s;
                view.getClass();
                if (cyberCalendarDaySwitcher.r) {
                    i5gVar.invoke();
                } else {
                    i5gVar2.invoke();
                }
                break;
            default:
                int i2 = CyberCalendarDaySwitcher.s;
                view.getClass();
                if (cyberCalendarDaySwitcher.r) {
                    i5gVar2.invoke();
                } else {
                    i5gVar.invoke();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ z5g(CyberCalendarDaySwitcher cyberCalendarDaySwitcher, i5g i5gVar, i5g i5gVar2, byte b) {
        this.b = cyberCalendarDaySwitcher;
        this.c = i5gVar;
        this.d = i5gVar2;
    }
}
