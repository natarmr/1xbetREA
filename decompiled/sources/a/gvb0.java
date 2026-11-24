package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import org.xbet.client1.R;
import org.xplatform.personal.impl.presentation.edit.ProfileEditViewModel$UiState;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModel;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItemClickable;
import org.xplatform.registration.success.api.RegistrationSuccessParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gvb0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11968a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gvb0(Object obj, Object obj2, byte b) {
        this.f11968a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x02ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x02b0 A[LOOP:6: B:80:0x027b->B:90:0x02b0, LOOP_END] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        float f2;
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        t2m0 t2m0Var;
        byte b = this.f11968a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((Function1) obj2).invoke(Integer.valueOf(((xls) obj).j));
                return Unit.f46060a;
            case 1:
                return n2x.w((us00) obj2, ((vwb0) obj).f38143a);
            case 2:
                fl70 fl70Var = org.xplatform.personal.impl.presentation.edit.a.X1;
                org.xplatform.personal.impl.presentation.edit.n nVarH0 = ((org.xplatform.personal.impl.presentation.edit.a) obj2).H0();
                w2c0 w2c0Var = ((ug60) obj).f35609a;
                if (w2c0Var == w2c0.h) {
                    ProfileEditViewModel$UiState profileEditViewModel$UiStateB = nVarH0.B();
                    if (profileEditViewModel$UiStateB instanceof ProfileEditViewModel$UiState.Loaded) {
                        ProfileEditViewModel$UiState.Loaded loaded = (ProfileEditViewModel$UiState.Loaded) profileEditViewModel$UiStateB;
                        Map map = loaded.f46786a;
                        Object obj3 = map.get(w2c0Var);
                        ProfileEditUiModel profileEditUiModel = obj3 instanceof ProfileEditUiModel ? (ProfileEditUiModel) obj3 : null;
                        if (profileEditUiModel != null) {
                            ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ = ProfileEditUiModelItemClickable.z((ProfileEditUiModelItemClickable) profileEditUiModel, 0, "", false, false, "", 91);
                            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                            linkedHashMap.put(w2c0Var, profileEditUiModelItemClickableZ);
                            loaded = new ProfileEditViewModel$UiState.Loaded(linkedHashMap);
                        }
                        nVarH0.E(loaded);
                        nVarH0.D(f2c0.f8805a);
                    }
                }
                return Unit.f46060a;
            case 3:
                ((Function1) obj2).invoke(((v7c0) obj).f36917a);
                return Unit.f46060a;
            case 4:
                ((a8c0) obj).getClass();
                ((Function1) obj2).invoke("CASHBACK");
                return Unit.f46060a;
            case 5:
                ((w7c0) obj).getClass();
                ((Function1) obj2).invoke("CASHBACK");
                return Unit.f46060a;
            case 6:
                ((Function1) obj2).invoke(new c9c0(((kac0) obj).d));
                return Unit.f46060a;
            case 7:
                ((Function1) obj2).invoke(Long.valueOf(((cuc0) obj).getId()));
                return Unit.f46060a;
            case 8:
                ((Function1) obj2).invoke((yrc0) obj);
                return Unit.f46060a;
            case 9:
                ((Function1) obj2).invoke((aec0) obj);
                return Unit.f46060a;
            case 10:
                ((Function1) obj2).invoke(((r5d0) obj).f29879a);
                return Unit.f46060a;
            case 11:
                xi70 xi70Var = jgd0.V1;
                shd0 shd0VarI0 = ((jgd0) obj2).I0();
                ngd0 ngd0Var = ngd0.f23480a;
                if (mhd0.f21787a[0] != 1) {
                    t9f.b();
                    return null;
                }
                i1w0 i1w0Var = shd0VarI0.c;
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI.k(shd0VarI0.q.k(shd0VarI0.v, shd0VarI0.d.d));
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 12:
                ((Function1) obj2).invoke(((e2e0) obj).f7080a);
                return Unit.f46060a;
            case 13:
                ((Function1) obj2).invoke(new ark0(((n1e0) ((p1e0) obj)).f22747a));
                return Unit.f46060a;
            case 14:
                ((Function1) obj2).invoke(new qce0(!((ade0) obj).c));
                return Unit.f46060a;
            case 15:
                ctf0 ctf0Var = (ctf0) obj2;
                return new zce0(ctf0Var.b.a(R.string.reality_lock_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.reality_lock_description_v2, Arrays.copyOf(new Object[]{Integer.valueOf(((wqc) obj).f39583a.c.g)}, 1)), false);
            case 16:
                iz40 iz40Var = (iz40) obj2;
                tld tldVar = (tld) obj;
                Object[] objArr = iz40Var.b;
                long[] jArr = iz40Var.f15620a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    tldVar.C(objArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                return Unit.f46060a;
            case 17:
                ((Function1) obj2).invoke(new ime0(((ome0) obj).f25500a));
                return Unit.f46060a;
            case 18:
                lse0 lse0Var = Regex.b;
                return ((Regex) obj2).b((CharSequence) obj);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                RegistrationSuccessParams registrationSuccessParams = (RegistrationSuccessParams) obj;
                sff0 sff0VarA = ((pru) obj2).a();
                return new o7f0(registrationSuccessParams.f46859a, registrationSuccessParams.b, registrationSuccessParams.c, registrationSuccessParams.d, sff0VarA.e0, false, true, sff0VarA.T, sff0VarA.W0, sff0VarA.u0, sff0VarA.q1);
            case 20:
                pz40 pz40Var = (pz40) obj;
                if (((t9f0) ((nbf0) ((l7m0) obj2).getValue()).f23236a.getValue()).d) {
                    zcl zclVar = qmk.f28987a;
                    f = ((ycl) pz40Var.getValue()).f42389a;
                    f2 = 174.0f;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f = ((ycl) pz40Var.getValue()).f42389a;
                    f2 = 116.0f;
                }
                return new ycl(f + f2);
            case 21:
                m0o0 m0o0Var = (m0o0) ((khf0) obj2).b;
                long jB = ((sgb) obj).b();
                p7m0 p7m0Var = m0o0Var.b.d;
                do {
                    value = p7m0Var.getValue();
                    List listE = abp.e((kap) value);
                    arrayList = new ArrayList();
                    for (Object obj4 : listE) {
                        if (((i5p) obj4).f14203a != jB) {
                            arrayList.add(obj4);
                        }
                    }
                } while (!p7m0Var.m(value, new iap(arrayList)));
                return Unit.f46060a;
            case 22:
                m0o0 m0o0Var2 = (m0o0) ((phf0) obj2).b;
                long jA = ((tnp0) obj).a();
                p7m0 p7m0Var2 = m0o0Var2.b.c;
                do {
                    value2 = p7m0Var2.getValue();
                    List listE2 = abp.e((kap) value2);
                    arrayList2 = new ArrayList();
                    for (Object obj5 : listE2) {
                        if (((xcp) obj5).f40657a != jA) {
                            arrayList2.add(obj5);
                        }
                    }
                } while (!p7m0Var2.m(value2, new iap(arrayList2)));
                return Unit.f46060a;
            case 23:
                return Boolean.valueOf(obj2.equals(((hgk0) ((ekf0) obj).j).getValue()));
            case 24:
                iiy[] iiyVarArr = vof0.O1;
                ((Function0) obj2).invoke();
                ((vof0) obj).H0().d.setState(wqf0.f39589a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((aqf0) obj2).x((vqf0) obj, false);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((s2g0) obj2).x0((String[]) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                String str = (String) obj;
                str.getClass();
                k7g0 k7g0Var = (k7g0) ((z220) ((hnu) obj2).f13365a).c;
                k7g0Var.getClass();
                Iterable iterable = (List) k7g0Var.f17818a.get(str);
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                ArrayList<s6g0> arrayList3 = new ArrayList();
                for (Object obj6 : iterable) {
                    if (!((s6g0) obj6).b.equals("")) {
                        arrayList3.add(obj6);
                    }
                }
                ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                for (s6g0 s6g0Var : arrayList3) {
                    s6g0Var.getClass();
                    String str2 = s6g0Var.b;
                    switch (s6g0Var.f31700a.ordinal()) {
                        case 0:
                            t2m0Var = t2m0.NO_COLOR;
                            break;
                        case 1:
                            t2m0Var = t2m0.DarkBlue;
                            break;
                        case 2:
                            t2m0Var = t2m0.GREEN;
                            break;
                        case 3:
                            t2m0Var = t2m0.LIGHT_GREEN;
                            break;
                        case 4:
                            t2m0Var = t2m0.YELLOW;
                            break;
                        case 5:
                            t2m0Var = t2m0.LIGHT_YELLOW;
                            break;
                        case 6:
                            t2m0Var = t2m0.LIGHT_RED;
                            break;
                        case 7:
                            t2m0Var = t2m0.RED;
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                    arrayList4.add(new kx50(t2m0Var, str2));
                }
                return new e7g0(arrayList4);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                dlg0 dlg0Var = (dlg0) obj;
                ((Function2) obj2).invoke(dlg0Var.d, Boolean.valueOf(dlg0Var.e));
                return Unit.f46060a;
            default:
                tlg0 tlg0Var = (tlg0) obj2;
                boolean z = tlg0Var.d;
                int i4 = tlg0Var.c;
                iun iunVar = iun.f15405a;
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                fsd fsdVar = ((bzt) obj).f3488a;
                int i5 = fsdVar.a().r;
                xuzVar.getClass();
                return new ong0(z, i4, true, null, new mdm(xuz.a(pb10Var, i5), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), new mdm(xuz.a(pb10Var, fsdVar.a().r), pdm.f26814a, ldm.f19857a, 0, R.string.empty_str, R.string.data_is_missing, R.string.empty_str, R.string.empty_str, 0L, 0L, 512), iunVar, null, false);
        }
    }
}
