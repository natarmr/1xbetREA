package org.xplatform.security.impl.presentation.email.confirmation.screen;

import a.lbi0;
import a.m1r;
import a.ufx;
import a.xyd;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.security.api.navigation.SecurityNavigationScreen;
import org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/security/impl/presentation/email/confirmation/screen/SendConfirmationEmailScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/security/api/navigation/SecurityNavigationScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SendConfirmationEmailScreen implements FragmentScreen, SecurityNavigationScreen {
    public static final Parcelable.Creator<SendConfirmationEmailScreen> CREATOR = new lbi0((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmSendEmailScreenParams f46951a;

    public SendConfirmationEmailScreen(ConfirmSendEmailScreenParams confirmSendEmailScreenParams) {
        confirmSendEmailScreenParams.getClass();
        this.f46951a = confirmSendEmailScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        xyd.U1.getClass();
        ConfirmSendEmailScreenParams confirmSendEmailScreenParams = this.f46951a;
        confirmSendEmailScreenParams.getClass();
        xyd xydVar = new xyd();
        xydVar.S1.J(xydVar, xyd.V1[1], confirmSendEmailScreenParams);
        return xydVar;
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
        parcel.writeParcelable(this.f46951a, i);
    }
}
