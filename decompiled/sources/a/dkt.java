package a;

import android.content.Context;
import android.content.Intent;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.widget.Toast;
import java.util.Locale;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dkt implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6249a;
    public final /* synthetic */ hkt b;

    public /* synthetic */ dkt(hkt hktVar, byte b) {
        this.f6249a = b;
        this.b = hktVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6249a;
        final hkt hktVar = this.b;
        switch (b) {
            case 0:
                hktVar.X1.a(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                return Unit.f46060a;
            case 1:
                pek pekVar = hkt.Z1;
                hktVar.H0().b.setVisibility(0);
                return Unit.f46060a;
            case 2:
                pek pekVar2 = hkt.Z1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = hktVar.Q1;
                if (j == -1 || jCurrentTimeMillis - j >= 2000) {
                    hktVar.Q1 = jCurrentTimeMillis;
                    new nvu(hktVar.o0()).Z();
                    kxq kxqVarB = hktVar.B();
                    if (kxqVarB == null || !kxqVarB.isFinishing()) {
                        Context contextO0 = hktVar.o0();
                        Toast.makeText(contextO0, contextO0.getString(R.string.double_click_exit), 1).show();
                    }
                } else {
                    kxq kxqVarB2 = hktVar.B();
                    if (kxqVarB2 != null) {
                        kxqVarB2.finishAffinity();
                    }
                }
                return Unit.f46060a;
            case 3:
                fiu0 fiu0Var = hktVar.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 4:
                pek pekVar3 = hkt.Z1;
                return new Consumer() { // from class: a.ckt
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Location location = (Location) obj;
                        pek pekVar4 = hkt.Z1;
                        if (location != null) {
                            double latitude = location.getLatitude();
                            double longitude = location.getLongitude();
                            hkt hktVar2 = hktVar;
                            Context contextD = hktVar2.D();
                            if (contextD != null) {
                                mkt mktVarI0 = hktVar2.I0();
                                Geocoder geocoder = hktVar2.R1;
                                if (geocoder == null) {
                                    geocoder = new Geocoder(contextD, Locale.getDefault());
                                    hktVar2.R1 = geocoder;
                                }
                                mktVarI0.w(latitude, longitude, geocoder);
                            }
                        }
                    }
                };
            default:
                pek pekVar4 = hkt.Z1;
                return new LocationListener() { // from class: a.ekt
                    @Override // android.location.LocationListener
                    public final void onLocationChanged(Location location) {
                        pek pekVar5 = hkt.Z1;
                        location.getClass();
                        hkt hktVar2 = hktVar;
                        Context contextD = hktVar2.D();
                        if (contextD != null) {
                            mkt mktVarI0 = hktVar2.I0();
                            double latitude = location.getLatitude();
                            double longitude = location.getLongitude();
                            Geocoder geocoder = hktVar2.R1;
                            if (geocoder == null) {
                                geocoder = new Geocoder(contextD, Locale.getDefault());
                                hktVar2.R1 = geocoder;
                            }
                            mktVarI0.w(latitude, longitude, geocoder);
                        }
                    }
                };
        }
    }
}
