.class public final La/z880;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/z880;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xi70",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final U1:La/xi70;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/gl5;

.field public M1:La/rl70;

.field public N1:La/wdk0;

.field public final O1:La/kiu0;

.field public final P1:La/s0r;

.field public final Q1:La/phf0;

.field public final R1:La/cgx0;

.field public final S1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/z880;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/callback/impl/databinding/FragmentOrderCallBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "requestKey"

    .line 16
    .line 17
    const-string v5, "getRequestKey()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "showNavBarArg"

    .line 25
    .line 26
    const-string v6, "getShowNavBarArg()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/z880;->V1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/xi70;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/z880;->U1:La/xi70;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0275

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/pl70;

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    invoke-direct {v0, p0, v1}, La/pl70;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/gg70;

    .line 14
    .line 15
    const/16 v2, 0x16

    .line 16
    .line 17
    invoke-direct {v1, p0, v2}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    sget-object v2, La/wez;->b:La/wez;

    .line 21
    .line 22
    new-instance v3, La/gg70;

    .line 23
    .line 24
    const/16 v4, 0x17

    .line 25
    .line 26
    invoke-direct {v3, v1, v4}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-class v3, La/aa80;

    .line 34
    .line 35
    sget-object v4, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    new-instance v4, La/ph70;

    .line 42
    .line 43
    const/16 v5, 0x12

    .line 44
    .line 45
    invoke-direct {v4, v1, v5}, La/ph70;-><init>(La/a8z;B)V

    .line 46
    .line 47
    .line 48
    new-instance v5, La/ph70;

    .line 49
    .line 50
    const/16 v6, 0x13

    .line 51
    .line 52
    invoke-direct {v5, v1, v6}, La/ph70;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/z880;->O1:La/kiu0;

    .line 60
    .line 61
    sget-object v0, La/y880;->a:La/y880;

    .line 62
    .line 63
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/z880;->P1:La/s0r;

    .line 68
    .line 69
    new-instance v0, La/phf0;

    .line 70
    .line 71
    const-string v1, "BUNDLE_REQUEST_KEY"

    .line 72
    .line 73
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, La/z880;->Q1:La/phf0;

    .line 77
    .line 78
    new-instance v0, La/cgx0;

    .line 79
    .line 80
    const-string v1, "SHOW_NAV_BAR"

    .line 81
    .line 82
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, La/z880;->R1:La/cgx0;

    .line 86
    .line 87
    new-instance v0, La/i280;

    .line 88
    .line 89
    const/16 v1, 0x9

    .line 90
    .line 91
    invoke-direct {v0, v1}, La/i280;-><init>(B)V

    .line 92
    .line 93
    .line 94
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, p0, La/z880;->S1:La/a8z;

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/z880;->L1:La/gl5;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v2, La/cz60;

    .line 8
    .line 9
    invoke-virtual {v0}, La/z880;->H0()La/aa80;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x6

    .line 15
    const/4 v3, 0x0

    .line 16
    const-class v13, La/aa80;

    .line 17
    .line 18
    const-string v6, "onCaptchaCancel"

    .line 19
    .line 20
    const-string v7, "onCaptchaCancel()V"

    .line 21
    .line 22
    move-object v5, v13

    .line 23
    invoke-direct/range {v2 .. v9}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 24
    .line 25
    .line 26
    new-instance v10, La/gk70;

    .line 27
    .line 28
    invoke-virtual {v0}, La/z880;->H0()La/aa80;

    .line 29
    .line 30
    .line 31
    move-result-object v12

    .line 32
    const/16 v16, 0x0

    .line 33
    .line 34
    const/16 v17, 0x1a

    .line 35
    .line 36
    const/4 v11, 0x1

    .line 37
    const-string v14, "onConfirmCaptcha"

    .line 38
    .line 39
    const-string v15, "onConfirmCaptcha(Lorg/xplatform/captcha/api/domain/model/UserActionCaptcha;)V"

    .line 40
    .line 41
    invoke-direct/range {v10 .. v17}, La/gk70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 42
    .line 43
    .line 44
    const-string v1, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 45
    .line 46
    invoke-static {v0, v1, v2, v10}, La/gl5;->k(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, La/x880;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-direct {v1, v0, v2}, La/x880;-><init>(La/z880;B)V

    .line 53
    .line 54
    .line 55
    const-string v2, "REQUEST_SELECT_THEME_DIALOG_KEY"

    .line 56
    .line 57
    invoke-static {v0, v2, v1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, La/x880;

    .line 61
    .line 62
    const/4 v2, 0x1

    .line 63
    invoke-direct {v1, v0, v2}, La/x880;-><init>(La/z880;B)V

    .line 64
    .line 65
    .line 66
    const-string v2, "KEY_PICKER_MODEL_REQUEST"

    .line 67
    .line 68
    invoke-static {v0, v2, v1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 69
    .line 70
    .line 71
    new-instance v1, La/x880;

    .line 72
    .line 73
    const/4 v2, 0x2

    .line 74
    invoke-direct {v1, v0, v2}, La/x880;-><init>(La/z880;B)V

    .line 75
    .line 76
    .line 77
    const-string v2, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 78
    .line 79
    invoke-static {v0, v2, v1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 80
    .line 81
    .line 82
    new-instance v1, La/zc70;

    .line 83
    .line 84
    invoke-direct {v1, v0}, La/zc70;-><init>(La/z880;)V

    .line 85
    .line 86
    .line 87
    const-string v2, "PICKER_DISMISS_KEY"

    .line 88
    .line 89
    invoke-static {v0, v2, v1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, La/z880;->G0()La/m2r;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget-object v1, v1, La/m2r;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 97
    .line 98
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, La/z880;->G0()La/m2r;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iget-object v1, v1, La/m2r;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 106
    .line 107
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, La/z880;->G0()La/m2r;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget-object v1, v1, La/m2r;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 115
    .line 116
    new-instance v10, La/gk70;

    .line 117
    .line 118
    invoke-virtual {v0}, La/z880;->H0()La/aa80;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    const/16 v17, 0x1b

    .line 123
    .line 124
    const-string v14, "onPhoneChanged"

    .line 125
    .line 126
    const-string v15, "onPhoneChanged(Ljava/lang/String;)V"

    .line 127
    .line 128
    invoke-direct/range {v10 .. v17}, La/gk70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v10}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setAfterTextFormattingCallback(Lkotlin/jvm/functions/Function1;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, La/z880;->G0()La/m2r;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    iget-object v2, v1, La/m2r;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 139
    .line 140
    new-instance v3, La/jt6;

    .line 141
    .line 142
    new-instance v4, La/csw;

    .line 143
    .line 144
    const/4 v5, 0x5

    .line 145
    invoke-direct {v4, v0, v5}, La/csw;-><init>(Ljava/lang/Object;B)V

    .line 146
    .line 147
    .line 148
    const/16 v5, 0xb

    .line 149
    .line 150
    invoke-direct {v3, v4, v5}, La/jt6;-><init>(Ljava/lang/Object;B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 154
    .line 155
    .line 156
    iget-object v2, v1, La/m2r;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 157
    .line 158
    new-instance v3, La/l910;

    .line 159
    .line 160
    const/16 v4, 0xc

    .line 161
    .line 162
    invoke-direct {v3, v0, v4}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    const v4, 0x7f040b10

    .line 173
    .line 174
    .line 175
    const/4 v5, 0x4

    .line 176
    invoke-static {v3, v4, v5}, La/m5d;->g(Landroid/content/Context;II)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-virtual {v2}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->d()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeStartIconTint(I)V

    .line 184
    .line 185
    .line 186
    iget-object v2, v1, La/m2r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 187
    .line 188
    new-instance v3, La/a540;

    .line 189
    .line 190
    const/16 v4, 0x1b

    .line 191
    .line 192
    invoke-direct {v3, v0, v1, v4}, La/a540;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 193
    .line 194
    .line 195
    invoke-static {v2, v3}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 196
    .line 197
    .line 198
    iget-object v1, v1, La/m2r;->g:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 199
    .line 200
    new-instance v2, La/cd60;

    .line 201
    .line 202
    const/16 v3, 0x18

    .line 203
    .line 204
    invoke-direct {v2, v0, v3}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 205
    .line 206
    .line 207
    invoke-static {v1, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_0
    const-string v0, "captchaDialogDelegate"

    .line 212
    .line 213
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const/4 v0, 0x0

    .line 217
    throw v0
.end method

.method public final C0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/o880;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/o880;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/o880;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, La/o880;->a()La/cni;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v1, La/fiu0;

    .line 60
    .line 61
    const-class v2, La/aa80;

    .line 62
    .line 63
    iget-object v3, v0, La/cni;->x:La/omi;

    .line 64
    .line 65
    invoke-static {v2, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, La/z880;->K1:La/fiu0;

    .line 73
    .line 74
    new-instance v1, La/gl5;

    .line 75
    .line 76
    const/16 v2, 0x11

    .line 77
    .line 78
    invoke-direct {v1, v2}, La/gl5;-><init>(B)V

    .line 79
    .line 80
    .line 81
    iput-object v1, p0, La/z880;->L1:La/gl5;

    .line 82
    .line 83
    iget-object v1, v0, La/cni;->t:La/rl70;

    .line 84
    .line 85
    iput-object v1, p0, La/z880;->M1:La/rl70;

    .line 86
    .line 87
    iget-object v0, v0, La/cni;->u:La/wdk0;

    .line 88
    .line 89
    iput-object v0, p0, La/z880;->N1:La/wdk0;

    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 93
    .line 94
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final D0()V
    .locals 20

    .line 1
    invoke-virtual/range {p0 .. p0}, La/z880;->H0()La/aa80;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/aa80;->z:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/m430;

    .line 8
    .line 9
    const/16 v3, 0x12

    .line 10
    .line 11
    invoke-direct {v2, v1, v0, v3}, La/m430;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    new-instance v4, La/hi70;

    .line 15
    .line 16
    const/4 v10, 0x4

    .line 17
    const/16 v11, 0x9

    .line 18
    .line 19
    const/4 v5, 0x2

    .line 20
    const-class v15, La/z880;

    .line 21
    .line 22
    const-string v8, "handleUiState"

    .line 23
    .line 24
    const-string v9, "handleUiState(Lorg/xplatform/callback/impl/presentation/call/model/OrderCallUiState;)V"

    .line 25
    .line 26
    move-object/from16 v6, p0

    .line 27
    .line 28
    move-object v7, v15

    .line 29
    invoke-direct/range {v4 .. v11}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 30
    .line 31
    .line 32
    sget-object v0, La/lkz;->a:La/lkz;

    .line 33
    .line 34
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    new-instance v3, La/zm70;

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-direct {v3, v2, v0, v4, v5}, La/zm70;-><init>(La/m430;La/clz;La/hi70;La/yje;)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x3

    .line 53
    invoke-static {v1, v5, v5, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 54
    .line 55
    .line 56
    invoke-virtual/range {p0 .. p0}, La/z880;->H0()La/aa80;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v1, v1, La/aa80;->A:La/p7m0;

    .line 61
    .line 62
    new-instance v2, La/wk30;

    .line 63
    .line 64
    const/16 v3, 0xa

    .line 65
    .line 66
    invoke-direct {v2, v1, v3}, La/wk30;-><init>(La/gmq;B)V

    .line 67
    .line 68
    .line 69
    new-instance v12, La/hi70;

    .line 70
    .line 71
    const/16 v18, 0x4

    .line 72
    .line 73
    const/16 v19, 0xa

    .line 74
    .line 75
    const/4 v13, 0x2

    .line 76
    const-string v16, "handleEvent"

    .line 77
    .line 78
    const-string v17, "handleEvent(Lorg/xplatform/callback/impl/presentation/call/model/OrderCallEvent;)V"

    .line 79
    .line 80
    move-object/from16 v14, p0

    .line 81
    .line 82
    invoke-direct/range {v12 .. v19}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 83
    .line 84
    .line 85
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    new-instance v4, La/zm70;

    .line 98
    .line 99
    invoke-direct {v4, v2, v1, v12, v5}, La/zm70;-><init>(La/wk30;La/clz;La/hi70;La/yje;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v3, v5, v5, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final G0()La/m2r;
    .locals 2

    .line 1
    sget-object v0, La/z880;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/z880;->P1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/m2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/aa80;
    .locals 0

    .line 1
    iget-object p0, p0, La/z880;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/aa80;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d0()V
    .locals 1

    .line 1
    invoke-static {p0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 6
    .line 7
    return-void
.end method

.method public final e0()V
    .locals 10

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-static {v0}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, La/xiv0;->a:La/uiv0;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const v2, 0x7f070074

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const v3, 0x7f0706ea

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {p0}, La/z880;->G0()La/m2r;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v4, v3, La/m2r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 45
    .line 46
    const/16 v3, 0x8

    .line 47
    .line 48
    invoke-virtual {v0, v3}, La/uiv0;->i(I)La/pfx;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iget v3, v3, La/pfx;->d:I

    .line 53
    .line 54
    const/4 v5, 0x2

    .line 55
    invoke-virtual {v0, v5}, La/uiv0;->i(I)La/pfx;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget v0, v0, La/pfx;->d:I

    .line 60
    .line 61
    invoke-virtual {p0}, La/z880;->x0()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_0

    .line 66
    .line 67
    sub-int/2addr v3, v0

    .line 68
    :cond_0
    sub-int/2addr v3, v1

    .line 69
    sub-int/2addr v3, v2

    .line 70
    const/4 p0, 0x0

    .line 71
    invoke-static {v3, p0}, Ljava/lang/Math;->max(II)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v9, 0x7

    .line 77
    const/4 v5, 0x0

    .line 78
    const/4 v6, 0x0

    .line 79
    invoke-static/range {v4 .. v9}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 80
    .line 81
    .line 82
    :cond_1
    return-void
.end method

.method public final x0()Z
    .locals 2

    .line 1
    sget-object v0, La/z880;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/z880;->R1:La/cgx0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method
