package a;

import org.xplatform.cyber.calendar.impl.presentation.content.day.CyberCalendarDaySwitcher;
import org.xplatform.related.api.presentation.RelatedContainerView;
import org.xplatform.ui_core.viewcomponents.layouts.constraint.EmptySearchViewNew;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a6g extends h0d0 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a6g(Object obj, Class cls, String str, String str2, int i, byte b) {
        super(obj, cls, str, str2, i);
        this.b = b;
    }

    @Override // a.eiy
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((CyberCalendarDaySwitcher) this.receiver).getBinding();
            case 1:
                return Integer.valueOf(((wl9) this.receiver).c);
            case 2:
                return Integer.valueOf(((cfb) this.receiver).c);
            case 3:
                return Integer.valueOf(((xk80) this.receiver).k());
            case 4:
                return Integer.valueOf(((xk80) this.receiver).k());
            case 5:
                return ((EmptySearchViewNew) this.receiver).getBinding();
            case 6:
                return ((l7m0) this.receiver).getValue();
            case 7:
                return ((l7m0) this.receiver).getValue();
            case 8:
                return ((l7m0) this.receiver).getValue();
            case 9:
                return ((l7m0) this.receiver).getValue();
            case 10:
                return this.receiver.getClass().getSimpleName();
            case 11:
                return Integer.valueOf(((xk80) this.receiver).r());
            case 12:
                return ((RelatedContainerView) this.receiver).getBinding();
            default:
                return Integer.valueOf(((rz10) this.receiver).c);
        }
    }
}
