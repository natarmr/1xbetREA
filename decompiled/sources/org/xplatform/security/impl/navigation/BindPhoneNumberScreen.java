package org.xplatform.security.impl.navigation;

import a.h38;
import a.l38;
import a.m1r;
import a.qo7;
import a.ufx;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.security.api.navigation.SecurityNavigationScreen;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/security/api/navigation/SecurityNavigationScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BindPhoneNumberScreen implements FragmentScreen, SecurityNavigationScreen {
    public static final Parcelable.Creator<BindPhoneNumberScreen> CREATOR = new qo7((byte) 5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l38 f46942a;

    public BindPhoneNumberScreen(l38 l38Var) {
        l38Var.getClass();
        this.f46942a = l38Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        h38.V1.getClass();
        l38 l38Var = this.f46942a;
        l38Var.getClass();
        h38 h38Var = new h38();
        h38Var.U1.u(h38Var, h38.W1[1], l38Var);
        return h38Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45456a() {
        return ufx.C(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.f46942a);
    }
}
