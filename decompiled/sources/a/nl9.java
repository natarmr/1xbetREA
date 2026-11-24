package a;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweek.CyberCalendarDaysOfWeekParams;

/* JADX INFO: loaded from: classes3.dex */
public final class nl9 extends zx5 {
    public final yag o;
    public final boolean p;
    public final e8g q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl9(yag yagVar, boolean z, androidx.fragment.app.e eVar, glz glzVar, iun iunVar, e8g e8gVar) {
        super(eVar, glzVar, iunVar);
        eVar.getClass();
        glzVar.getClass();
        iunVar.getClass();
        this.o = yagVar;
        this.p = z;
        this.q = e8gVar;
    }

    @Override // a.f5r
    public final Fragment B(int i) {
        ArrayList arrayList = (ArrayList) this.n;
        yag yagVar = yag.d;
        boolean z = this.p;
        yag yagVar2 = this.o;
        if (yagVar2 == yagVar) {
            std stdVar = y7g.Q1;
            CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel = (CyberCalendarPeriodUiModel) arrayList.get(i);
            stdVar.getClass();
            cyberCalendarPeriodUiModel.getClass();
            y7g y7gVar = new y7g();
            iiy[] iiyVarArr = y7g.R1;
            y7gVar.O1.J(y7gVar, iiyVarArr[1], cyberCalendarPeriodUiModel);
            y7gVar.P1.u(y7gVar, iiyVarArr[2], Boolean.valueOf(z));
            return y7gVar;
        }
        kwd kwdVar = l6g.Q1;
        CyberCalendarDaysOfWeekParams cyberCalendarDaysOfWeekParams = new CyberCalendarDaysOfWeekParams(yagVar2, (CyberCalendarPeriodUiModel) arrayList.get(i));
        kwdVar.getClass();
        l6g l6gVar = new l6g();
        iiy[] iiyVarArr2 = l6g.R1;
        l6gVar.O1.J(l6gVar, iiyVarArr2[1], cyberCalendarDaysOfWeekParams);
        l6gVar.P1.u(l6gVar, iiyVarArr2[2], Boolean.valueOf(z));
        l6gVar.u1.a(new tvj(new m87(this, (byte) 25), null, null, 59));
        return l6gVar;
    }
}
