package a;

import java.util.Map;
import org.xplatform.personal.impl.presentation.edit_tj.models.EditProfileTjItemEnum;
import org.xplatform.personal.impl.presentation.edit_tj.models.ProfileEditTjUiModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e0c0 {
    public static final ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel a(Map map, EditProfileTjItemEnum editProfileTjItemEnum) {
        Object obj = map.get(editProfileTjItemEnum);
        if (obj instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) {
            return (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) obj;
        }
        return null;
    }

    public static final ProfileEditTjUiModel.ProfileEditItemTjUiModel b(Map map, EditProfileTjItemEnum editProfileTjItemEnum) {
        Object obj = map.get(editProfileTjItemEnum);
        if (obj instanceof ProfileEditTjUiModel.ProfileEditItemTjUiModel) {
            return (ProfileEditTjUiModel.ProfileEditItemTjUiModel) obj;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    public static final hqn c(Map map) {
        boolean z;
        String str;
        String str2;
        String str3;
        ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelB;
        String str4;
        ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelB2;
        String str5;
        String str6;
        ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA;
        ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA2;
        String str7;
        ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA3 = a(map, EditProfileTjItemEnum.k);
        if (profileEditItemClickableTjUiModelA3 != null) {
            z = profileEditItemClickableTjUiModelA3.c == 1;
        }
        ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelB3 = b(map, EditProfileTjItemEnum.g);
        if (profileEditItemTjUiModelB3 == null || (str = profileEditItemTjUiModelB3.b) == null) {
            str = "";
        }
        ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelB4 = b(map, EditProfileTjItemEnum.f);
        if (profileEditItemTjUiModelB4 == null || (str2 = profileEditItemTjUiModelB4.b) == null) {
            str2 = "";
        }
        ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelB5 = b(map, EditProfileTjItemEnum.h);
        if (profileEditItemTjUiModelB5 == null || (str3 = profileEditItemTjUiModelB5.b) == null) {
            str3 = "";
        }
        ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA4 = a(map, EditProfileTjItemEnum.i);
        Long lA = (profileEditItemClickableTjUiModelA4 == null || (str7 = profileEditItemClickableTjUiModelA4.b) == null) ? null : f0c0.a(str7);
        ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA5 = a(map, EditProfileTjItemEnum.l);
        int i = profileEditItemClickableTjUiModelA5 != null ? profileEditItemClickableTjUiModelA5.c : 0;
        int i2 = (!z || (profileEditItemClickableTjUiModelA2 = a(map, EditProfileTjItemEnum.m)) == null) ? 0 : profileEditItemClickableTjUiModelA2.c;
        int i3 = (!z || (profileEditItemClickableTjUiModelA = a(map, EditProfileTjItemEnum.n)) == null) ? 0 : profileEditItemClickableTjUiModelA.c;
        ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelB6 = b(map, EditProfileTjItemEnum.p);
        String str8 = (profileEditItemTjUiModelB6 == null || (str6 = profileEditItemTjUiModelB6.b) == null) ? "" : str6;
        String str9 = (!z || (profileEditItemTjUiModelB2 = b(map, EditProfileTjItemEnum.o)) == null || (str5 = profileEditItemTjUiModelB2.b) == null) ? "" : str5;
        String str10 = (!z || (profileEditItemTjUiModelB = b(map, EditProfileTjItemEnum.q)) == null || (str4 = profileEditItemTjUiModelB.b) == null) ? "" : str4;
        ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA6 = a(map, EditProfileTjItemEnum.j);
        return new hqn(str, str2, str3, lA, "", i, i2, i3, 0, "", str8, null, "", str9, str10, "", profileEditItemClickableTjUiModelA6 != null ? profileEditItemClickableTjUiModelA6.c : 0);
    }
}
