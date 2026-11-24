.class public final La/dxe0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/dxe0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/lme0",
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
.field public static final Y1:La/lme0;

.field public static final synthetic Z1:[La/iiy;

.field public static final a2:Ljava/lang/String;


# instance fields
.field public final K1:La/h9o0;

.field public L1:La/hri;

.field public M1:La/gl5;

.field public N1:La/rl70;

.field public O1:La/pek0;

.field public P1:La/ii;

.field public Q1:La/wdk0;

.field public R1:La/kd30;

.field public S1:La/ndk0;

.field public final U1:La/s0r;

.field public final V1:La/khf0;

.field public final W1:La/a8z;

.field public final X1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/dxe0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/registration_default/impl/databinding/FragmentRegistrationDefaultComposeBinding;"

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
    const-string v3, "params"

    .line 16
    .line 17
    const-string v5, "getParams()Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v3, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v3, v0

    .line 29
    .line 30
    sput-object v3, La/dxe0;->Z1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/lme0;

    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    invoke-direct {v0, v2}, La/lme0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    sput-object v0, La/dxe0;->Y1:La/lme0;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sput-object v0, La/dxe0;->a2:Ljava/lang/String;

    .line 45
    .line 46
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d02b6

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/h9o0;->a:La/h9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/dxe0;->K1:La/h9o0;

    .line 10
    .line 11
    sget-object v0, La/cxe0;->a:La/cxe0;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/dxe0;->U1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/khf0;

    .line 20
    .line 21
    const-string v1, "PARAMS_REGISTRATION_KEY"

    .line 22
    .line 23
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, La/dxe0;->V1:La/khf0;

    .line 27
    .line 28
    const-class v0, La/eze0;

    .line 29
    .line 30
    sget-object v1, La/sre0;->a:La/tre0;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, La/zwe0;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {v1, p0, v2}, La/zwe0;-><init>(La/dxe0;B)V

    .line 40
    .line 41
    .line 42
    const/16 v2, 0xe

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, La/dxe0;->W1:La/a8z;

    .line 50
    .line 51
    new-instance v0, La/zwe0;

    .line 52
    .line 53
    const/4 v1, 0x3

    .line 54
    invoke-direct {v0, p0, v1}, La/zwe0;-><init>(La/dxe0;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, La/dxe0;->X1:La/n0o0;

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    iget-object p1, p0, La/dxe0;->M1:La/gl5;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    sget-object p1, La/dxe0;->Z1:[La/iiy;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    aget-object p1, p1, v1

    .line 10
    .line 11
    iget-object v2, p0, La/dxe0;->V1:La/khf0;

    .line 12
    .line 13
    invoke-virtual {v2, p0, p1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;

    .line 18
    .line 19
    iget-object p1, p1, Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;->a:La/q7f0;

    .line 20
    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v3, "UNIVERSAL_REQUEST_CAPTCHA_CODE_DIALOG_KEY_"

    .line 24
    .line 25
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v2, La/zwe0;

    .line 36
    .line 37
    const/4 v3, 0x2

    .line 38
    invoke-direct {v2, p0, v3}, La/zwe0;-><init>(La/dxe0;B)V

    .line 39
    .line 40
    .line 41
    new-instance v4, La/bxe0;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-direct {v4, p0, v5}, La/bxe0;-><init>(La/dxe0;B)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, p1, v2, v4}, La/gl5;->k(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, La/axe0;

    .line 51
    .line 52
    const/4 v2, 0x4

    .line 53
    invoke-direct {p1, p0, v2}, La/axe0;-><init>(La/dxe0;B)V

    .line 54
    .line 55
    .line 56
    const-string v4, "KEY_PICKER_MODEL_REQUEST"

    .line 57
    .line 58
    invoke-static {p0, v4, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, La/axe0;

    .line 62
    .line 63
    const/4 v4, 0x5

    .line 64
    invoke-direct {p1, p0, v4}, La/axe0;-><init>(La/dxe0;B)V

    .line 65
    .line 66
    .line 67
    const-string v5, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 68
    .line 69
    invoke-static {p0, v5, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, La/dxe0;->N1:La/rl70;

    .line 73
    .line 74
    const-string v5, "pickerDialogFactory"

    .line 75
    .line 76
    if-eqz p1, :cond_1

    .line 77
    .line 78
    new-instance p1, La/axe0;

    .line 79
    .line 80
    const/4 v6, 0x6

    .line 81
    invoke-direct {p1, p0, v6}, La/axe0;-><init>(La/dxe0;B)V

    .line 82
    .line 83
    .line 84
    const-string v7, "PICKER_DIALOG_TAG"

    .line 85
    .line 86
    invoke-static {p0, v7, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 87
    .line 88
    .line 89
    new-instance p1, La/zwe0;

    .line 90
    .line 91
    invoke-direct {p1, p0, v6}, La/zwe0;-><init>(La/dxe0;B)V

    .line 92
    .line 93
    .line 94
    const-string v6, "REQUEST_USER_EXIST_DIALOG_KEY"

    .line 95
    .line 96
    invoke-static {p0, v6, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, La/dxe0;->N1:La/rl70;

    .line 100
    .line 101
    if-eqz p1, :cond_0

    .line 102
    .line 103
    new-instance p1, La/axe0;

    .line 104
    .line 105
    const/4 v0, 0x7

    .line 106
    invoke-direct {p1, p0, v0}, La/axe0;-><init>(La/dxe0;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {p0, v7, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    new-instance p1, La/axe0;

    .line 113
    .line 114
    const/16 v0, 0x8

    .line 115
    .line 116
    invoke-direct {p1, p0, v0}, La/axe0;-><init>(La/dxe0;B)V

    .line 117
    .line 118
    .line 119
    const-string v0, "KEY_CHOOSE_BONUS"

    .line 120
    .line 121
    invoke-static {p0, v0, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 122
    .line 123
    .line 124
    new-instance p1, La/axe0;

    .line 125
    .line 126
    invoke-direct {p1, p0, v1}, La/axe0;-><init>(La/dxe0;B)V

    .line 127
    .line 128
    .line 129
    const-string v0, "REQUEST_BIRTHDAY_CALENDAR_KEY"

    .line 130
    .line 131
    invoke-static {p0, v0, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    new-instance p1, La/axe0;

    .line 135
    .line 136
    invoke-direct {p1, p0, v3}, La/axe0;-><init>(La/dxe0;B)V

    .line 137
    .line 138
    .line 139
    const-string v0, "REQUEST_PASSPORT_DATE_ISSUE_CALENDAR_KEY"

    .line 140
    .line 141
    invoke-static {p0, v0, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    new-instance p1, La/axe0;

    .line 145
    .line 146
    const/4 v0, 0x3

    .line 147
    invoke-direct {p1, p0, v0}, La/axe0;-><init>(La/dxe0;B)V

    .line 148
    .line 149
    .line 150
    const-string v0, "REQUEST_PASSPORT_DATE_EXPIRE_CALENDAR_KEY"

    .line 151
    .line 152
    invoke-static {p0, v0, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    new-instance p1, La/zwe0;

    .line 156
    .line 157
    invoke-direct {p1, p0, v1}, La/zwe0;-><init>(La/dxe0;B)V

    .line 158
    .line 159
    .line 160
    const-string v0, "REQUEST_EXIT_FROM_REGISTRATION_DIALOG_KEY"

    .line 161
    .line 162
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 163
    .line 164
    .line 165
    new-instance p1, La/zwe0;

    .line 166
    .line 167
    invoke-direct {p1, p0, v2}, La/zwe0;-><init>(La/dxe0;B)V

    .line 168
    .line 169
    .line 170
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 171
    .line 172
    .line 173
    new-instance p1, La/zwe0;

    .line 174
    .line 175
    invoke-direct {p1, p0, v4}, La/zwe0;-><init>(La/dxe0;B)V

    .line 176
    .line 177
    .line 178
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_0
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v0

    .line 186
    :cond_1
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v0

    .line 190
    :cond_2
    const-string p0, "captchaDialogDelegate"

    .line 191
    .line 192
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw v0
.end method

.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/dxe0;->X1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/iri;

    .line 8
    .line 9
    iget-object v1, v0, La/iri;->N:La/n5d0;

    .line 10
    .line 11
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/hri;

    .line 16
    .line 17
    iput-object v1, p0, La/dxe0;->L1:La/hri;

    .line 18
    .line 19
    new-instance v1, La/gl5;

    .line 20
    .line 21
    const/16 v2, 0x11

    .line 22
    .line 23
    invoke-direct {v1, v2}, La/gl5;-><init>(B)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, La/dxe0;->M1:La/gl5;

    .line 27
    .line 28
    iget-object v1, v0, La/iri;->I:La/rl70;

    .line 29
    .line 30
    iput-object v1, p0, La/dxe0;->N1:La/rl70;

    .line 31
    .line 32
    iget-object v1, v0, La/iri;->J:La/pek0;

    .line 33
    .line 34
    iput-object v1, p0, La/dxe0;->O1:La/pek0;

    .line 35
    .line 36
    iget-object v1, v0, La/iri;->K:La/ii;

    .line 37
    .line 38
    iput-object v1, p0, La/dxe0;->P1:La/ii;

    .line 39
    .line 40
    iget-object v1, v0, La/iri;->L:La/wdk0;

    .line 41
    .line 42
    iput-object v1, p0, La/dxe0;->Q1:La/wdk0;

    .line 43
    .line 44
    iget-object v0, v0, La/iri;->M:La/kd30;

    .line 45
    .line 46
    iput-object v0, p0, La/dxe0;->R1:La/kd30;

    .line 47
    .line 48
    return-void
.end method

.method public final D0()V
    .locals 4

    .line 1
    sget-object v0, La/dxe0;->Z1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v2, p0, La/dxe0;->U1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v2, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v0, La/a4r;

    .line 16
    .line 17
    iget-object v0, v0, La/a4r;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v2, La/axe0;

    .line 20
    .line 21
    invoke-direct {v2, p0, v1}, La/axe0;-><init>(La/dxe0;B)V

    .line 22
    .line 23
    .line 24
    new-instance p0, La/ugd;

    .line 25
    .line 26
    const v1, 0x77104fcd

    .line 27
    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-direct {p0, v1, v3, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-static {v0, v1, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/dxe0;->W1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final H0(Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-object v0, p0, La/dxe0;->Q1:La/wdk0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v2, La/rek0;->b:La/rek0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const p1, 0x7f1307bf

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    :cond_0
    move-object v3, p1

    .line 24
    new-instance v1, La/xdk0;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    const/16 v8, 0x7c

    .line 31
    .line 32
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 33
    .line 34
    .line 35
    const/16 v7, 0x3fc

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    move-object v2, p0

    .line 40
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    const-string p0, "snackbarManager"

    .line 45
    .line 46
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    throw p0
.end method

.method public final Y()V
    .locals 1

    .line 1
    iget-object v0, p0, La/dxe0;->S1:La/ndk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, La/dxe0;->S1:La/ndk0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 13
    .line 14
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x20

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 16
    .line 17
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x10

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, La/yx5;->e0()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/dxe0;->K1:La/h9o0;

    .line 2
    .line 3
    return-object p0
.end method
