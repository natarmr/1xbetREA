package org.xplatform.search.impl.navigation;

import a.bfo0;
import a.bhh0;
import a.g8v;
import a.iiy;
import a.m1r;
import a.t9f;
import a.ufx;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.UUID;
import kotlin.Metadata;
import org.xplatform.search.api.models.GlobalSearchContainerSettings;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/search/impl/navigation/SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bhh0 f46916a;

    public SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1(bhh0 bhh0Var) {
        this.f46916a = bhh0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        Parcelable parcelable;
        m1rVar.getClass();
        bhh0 bhh0Var = this.f46916a;
        int iOrdinal = bhh0Var.ordinal();
        if (iOrdinal == 0) {
            parcelable = new GlobalSearchContainerSettings.Default(bfo0.f2512a, bhh0Var);
        } else if (iOrdinal == 1) {
            parcelable = new GlobalSearchContainerSettings.Default(bfo0.b, bhh0Var);
        } else if (iOrdinal == 2) {
            parcelable = new GlobalSearchContainerSettings.Default(bfo0.c, bhh0Var);
        } else if (iOrdinal == 3) {
            parcelable = GlobalSearchContainerSettings.FromBetSlip.f46915a;
        } else if (iOrdinal == 4) {
            parcelable = GlobalSearchContainerSettings.FavoriteTeam.f46914a;
        } else {
            if (iOrdinal != 5) {
                t9f.b();
                return null;
            }
            parcelable = new GlobalSearchContainerSettings.Default(bfo0.d, bhh0Var);
        }
        g8v.P1.getClass();
        g8v g8vVar = new g8v();
        iiy[] iiyVarArr = g8v.Q1;
        g8vVar.M1.J(g8vVar, iiyVarArr[1], parcelable);
        String string = UUID.randomUUID().toString();
        string.getClass();
        g8vVar.N1.x(g8vVar, iiyVarArr[2], string);
        return g8vVar;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return ufx.C(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
