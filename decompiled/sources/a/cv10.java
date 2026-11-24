package a;

import android.content.Context;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cv10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5012a;
    public final /* synthetic */ hv10 b;

    public /* synthetic */ cv10(hv10 hv10Var, byte b) {
        this.f5012a = b;
        this.b = hv10Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jCurrentTimeMillis;
        long j;
        kxq kxqVarB;
        byte b = this.f5012a;
        Object obj = null;
        hv10 hv10Var = this.b;
        switch (b) {
            case 0:
                atz atzVar = hv10.X1;
                List listP = hv10Var.C().c.p();
                listP.getClass();
                ListIterator listIterator = listP.listIterator(listP.size());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    Fragment fragment = (Fragment) objPrevious;
                    if ((fragment instanceof cg60) && fragment.S() && ((cg60) fragment).j()) {
                        obj = objPrevious;
                        if (((Fragment) obj) != null) {
                            jCurrentTimeMillis = System.currentTimeMillis();
                            j = hv10Var.W1;
                            if (j != -1 || jCurrentTimeMillis - j >= 2000) {
                                hv10Var.W1 = jCurrentTimeMillis;
                                new nvu(hv10Var.o0()).Z();
                                kxqVarB = hv10Var.B();
                                if (kxqVarB != null || !kxqVarB.isFinishing()) {
                                    Context contextO0 = hv10Var.o0();
                                    Toast.makeText(contextO0, contextO0.getString(R.string.double_click_exit), 1).show();
                                }
                            } else {
                                kxq kxqVarB2 = hv10Var.B();
                                if (kxqVarB2 != null) {
                                    kxqVarB2.finishAffinity();
                                }
                            }
                        }
                        return Unit.f46060a;
                    }
                }
                if (((Fragment) obj) != null) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    j = hv10Var.W1;
                    if (j != -1) {
                        hv10Var.W1 = jCurrentTimeMillis;
                        new nvu(hv10Var.o0()).Z();
                        kxqVarB = hv10Var.B();
                        if (kxqVarB != null) {
                            Context contextO1 = hv10Var.o0();
                            Toast.makeText(contextO1, contextO1.getString(R.string.double_click_exit), 1).show();
                        } else {
                            Context contextO2 = hv10Var.o0();
                            Toast.makeText(contextO2, contextO2.getString(R.string.double_click_exit), 1).show();
                        }
                    } else {
                        hv10Var.W1 = jCurrentTimeMillis;
                        new nvu(hv10Var.o0()).Z();
                        kxqVarB = hv10Var.B();
                        if (kxqVarB != null) {
                            Context contextO3 = hv10Var.o0();
                            Toast.makeText(contextO3, contextO3.getString(R.string.double_click_exit), 1).show();
                        } else {
                            Context contextO4 = hv10Var.o0();
                            Toast.makeText(contextO4, contextO4.getString(R.string.double_click_exit), 1).show();
                        }
                    }
                }
                return Unit.f46060a;
            default:
                ski skiVar = hv10Var.K1;
                if (skiVar != null) {
                    return skiVar;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
