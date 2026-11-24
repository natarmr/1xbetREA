package a;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import org.xplatform.resident.presentation.views.ResidentDoorLineView;
import org.xplatform.resident.presentation.views.ResidentPersonView;
import org.xplatform.resident.presentation.views.ResidentSafeLineView;
import org.xplatform.resident.presentation.views.ResidentSmokeView;
import org.xplatform.resident.presentation.views.ResidentTagView;

/* JADX INFO: loaded from: classes5.dex */
public final class e4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f7197a;
    public final AppCompatButton b;
    public final ResidentDoorLineView c;
    public final ResidentPersonView d;
    public final ResidentSafeLineView e;
    public final ResidentSmokeView f;
    public final ResidentTagView g;
    public final TextView h;
    public final TextView i;
    public final Group j;

    public e4r(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, ResidentDoorLineView residentDoorLineView, ResidentPersonView residentPersonView, ResidentSafeLineView residentSafeLineView, ResidentSmokeView residentSmokeView, ResidentTagView residentTagView, TextView textView, TextView textView2, Group group) {
        this.f7197a = constraintLayout;
        this.b = appCompatButton;
        this.c = residentDoorLineView;
        this.d = residentPersonView;
        this.e = residentSafeLineView;
        this.f = residentSmokeView;
        this.g = residentTagView;
        this.h = textView;
        this.i = textView2;
        this.j = group;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7197a;
    }
}
