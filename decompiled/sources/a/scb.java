package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001JT\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"La/scb;", "", "", "refId", "groupId", "fCountryId", "whence", "", "", "champIds", "La/dx5;", "La/cdb;", "a", "(IIIILjava/util/List;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface scb {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("cyberImages/v2/champs")
    Object a(@xpv("X-Referral") int i, @xpv("X-Group") int i2, @xpv("X-FCountry") int i3, @xpv("X-Whence") int i4, @nkd0(ParameterNames.ID) List<Long> list, yje<dx5<List<cdb>>> yjeVar);
}
