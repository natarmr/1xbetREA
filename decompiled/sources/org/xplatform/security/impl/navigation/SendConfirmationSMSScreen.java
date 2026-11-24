package org.xplatform.security.impl.navigation;

import a.dci0;
import a.lbi0;
import a.m1r;
import a.rbi0;
import a.ufx;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.security.api.navigation.SecurityNavigationScreen;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/security/api/navigation/SecurityNavigationScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SendConfirmationSMSScreen implements FragmentScreen, SecurityNavigationScreen {
    public static final Parcelable.Creator<SendConfirmationSMSScreen> CREATOR = new lbi0((byte) 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dci0 f46949a;

    public SendConfirmationSMSScreen(dci0 dci0Var) {
        dci0Var.getClass();
        this.f46949a = dci0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        rbi0.U1.getClass();
        dci0 dci0Var = this.f46949a;
        dci0Var.getClass();
        rbi0 rbi0Var = new rbi0();
        rbi0Var.Q1.u(rbi0Var, rbi0.V1[1], dci0Var);
        return rbi0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
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
        parcel.writeSerializable(this.f46949a);
    }
}
