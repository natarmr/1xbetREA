package org.xplatform.core.navigation.authorization.screen;

import a.jf4;
import a.m1r;
import a.m7h0;
import a.of80;
import a.xbf;
import a.yx5;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lorg/xplatform/core/navigation/authorization/screen/Authorization;", "La/m7h0;", "Login", "Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login;", "navigation"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface Authorization extends m7h0 {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login;", "Lorg/xplatform/core/navigation/authorization/screen/Authorization;", "Dialog", "Screen", "Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Dialog;", "Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Screen;", "navigation"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface Login extends Authorization {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Dialog;", "Lorg/xplatform/core/navigation/dialog/DialogScreen;", "Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login;", "navigation"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Dialog implements DialogScreen, Login {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f46457a;
            public final jf4 b;

            public Dialog(String str, jf4 jf4Var) {
                this.f46457a = str;
                this.b = jf4Var;
            }

            @Override // a.m7h0
            /* JADX INFO: renamed from: b */
            public final String getF45455a() {
                String str = this.f46457a;
                return str == null ? jf4.class.getName() : str;
            }

            @Override // org.xplatform.core.navigation.dialog.DialogScreen
            public final of80 d(m1r m1rVar) {
                m1rVar.getClass();
                return (of80) this.b.c(m1rVar);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Screen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login;", "navigation"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Screen implements FragmentScreen, Login {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f46458a;
            public final xbf b;

            public Screen(String str, xbf xbfVar, int i) {
                this.f46458a = (i & 1) != 0 ? null : str;
                this.b = xbfVar;
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                return (yx5) this.b.c(m1rVar);
            }

            @Override // a.m7h0
            /* JADX INFO: renamed from: b */
            public final String getF45455a() {
                String str = this.f46458a;
                return str == null ? this.b.getClass().getName() : str;
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            /* JADX INFO: renamed from: g */
            public final boolean getB() {
                return true;
            }
        }
    }
}
