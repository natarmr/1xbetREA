package a;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class ur3 extends q1r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36145a;

    public /* synthetic */ ur3(Object obj, byte b) {
        this.f36145a = b;
    }

    @Override // a.q1r
    public void b(androidx.fragment.app.e eVar, Fragment fragment) {
        String str;
        switch (this.f36145a) {
            case 1:
                if (fragment instanceof of80) {
                    of80 of80Var = (of80) fragment;
                    if (of80Var.m && (str = of80Var.B) != null) {
                        i1w0 i1w0VarF = a4n0.f(fragment);
                        i1w0VarF.getClass();
                        mf50 mf50VarC = i1w0VarF.c();
                        mf50VarC.getClass();
                        mf50VarC.g(new ka6(str, (byte) 11));
                    }
                }
                break;
        }
    }

    @Override // a.q1r
    public void f(androidx.fragment.app.e eVar, Fragment fragment) {
        switch (this.f36145a) {
            case 0:
                View viewD = ApplicationActivity.D(fragment);
                if (viewD != null) {
                    ujk.a(viewD, false);
                }
                break;
        }
    }

    @Override // a.q1r
    public void g(androidx.fragment.app.e eVar, Fragment fragment) {
        switch (this.f36145a) {
            case 0:
                View viewD = ApplicationActivity.D(fragment);
                if (viewD != null) {
                    ArrayList arrayList = ujk.f35785a;
                    w3d.y(arrayList, new oz7(viewD, (byte) 2));
                    w3d.y(arrayList, new vbk((byte) 4));
                }
                break;
        }
    }
}
