package a;

import android.os.Looper;
import android.os.Process;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.function.IntConsumer;
import org.xplatform.cyber.game.universal.impl.presentation.killerjoker.KillerJokerView;
import org.xplatform.uikit.components.page_control.DsPageControl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n23 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22780a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n23(com.google.android.material.datepicker.i iVar, MaterialCalendarGridView materialCalendarGridView, int i) {
        this.f22780a = (byte) 11;
        this.c = materialCalendarGridView;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iA;
        byte b = this.f22780a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                Process.setThreadPriority(i);
                ((Runnable) obj).run();
                break;
            case 1:
                ((IntConsumer) obj).accept(i);
                break;
            case 2:
                ((z24) obj).b.onAudioFocusChange(i);
                break;
            case 3:
                qlo qloVar = (qlo) ((xex) obj).b;
                String str = vtt0.f38024a;
                fp fpVar = qloVar.f28944a.C;
                plo ploVar = new plo(i);
                fpVar.getClass();
                x0x.K(Looper.myLooper() == ((q9o0) fpVar.d).f28360a.getLooper());
                fpVar.b++;
                fpVar.M(new fy2(fpVar, ploVar, (byte) 11));
                fpVar.W(Integer.valueOf(i));
                break;
            case 4:
                ((vx9) obj).a(i);
                break;
            case 5:
                dzb0 dzb0Var = (dzb0) ((esg0) ((wx9) obj).b).f8326a;
                if (dzb0Var != null) {
                    dzb0Var.a(i);
                }
                break;
            case 6:
                ((lyl) obj).B0(i);
                break;
            case 7:
                int i2 = DsPageControl.y2;
                ((DsPageControl) obj).B0(i);
                break;
            case 8:
                KillerJokerView.f((KillerJokerView) obj, i);
                break;
            case 9:
                ViewPager2 viewPager2 = ((a720) obj).u2;
                if (viewPager2 != null) {
                    viewPager2.setCurrentItem(i);
                }
                break;
            case 10:
                int[] iArr = MaterialButton.r1;
                ((MaterialButton) obj).setIconSize(i);
                break;
            case 11:
                MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) obj;
                if (materialCalendarGridView.hasFocus() && i != 0) {
                    com.google.android.material.datepicker.h hVarA = materialCalendarGridView.a();
                    if (i == 1) {
                        iA = hVarA.b(hVarA.f() + 1);
                        if (iA == -1) {
                            iA = hVarA.f();
                        }
                    } else {
                        iA = hVarA.a(hVarA.c() - 1);
                        if (iA == -1) {
                            iA = hVarA.c();
                        }
                    }
                    materialCalendarGridView.setSelection(iA);
                    break;
                }
                break;
            case 12:
                ((RecyclerView) obj).B0(i);
                break;
            case 13:
                y2m0 y2m0Var = jho0.R1;
                ((ViewPager2) obj).setCurrentItem(i);
                break;
            default:
                ((x3w0) obj).c.invoke(Integer.valueOf(i));
                break;
        }
    }

    public /* synthetic */ n23(int i, Runnable runnable) {
        this.f22780a = (byte) 0;
        this.b = i;
        this.c = runnable;
    }

    public /* synthetic */ n23(Object obj, int i, byte b) {
        this.f22780a = b;
        this.c = obj;
        this.b = i;
    }
}
