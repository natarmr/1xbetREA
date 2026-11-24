.class public final La/iaf0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/iaf0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/zie0",
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
.field public static final Z1:La/zie0;

.field public static final synthetic a2:[La/iiy;

.field public static final b2:Ljava/lang/String;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/ori;

.field public final M1:La/s0r;

.field public final N1:La/a8z;

.field public final O1:La/a8z;

.field public final P1:La/s0r;

.field public Q1:La/gl5;

.field public R1:La/rl70;

.field public S1:La/eke0;

.field public U1:La/pek0;

.field public V1:La/ii;

.field public W1:La/wdk0;

.field public X1:La/kd30;

.field public Y1:La/ndk0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/iaf0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/registration/visual/impl/databinding/FragmentRegistrationVisualBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v3, La/iaf0;->a2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/zie0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/iaf0;->Z1:La/zie0;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, La/iaf0;->b2:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d02b8

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    sget-object v1, La/bp3;->a:La/bp3;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    const v2, 0x7f040b5d

    .line 14
    .line 15
    .line 16
    const v3, 0x7f040ae3

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/iaf0;->K1:La/e9o0;

    .line 23
    .line 24
    sget-object v0, La/haf0;->a:La/haf0;

    .line 25
    .line 26
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, La/iaf0;->M1:La/s0r;

    .line 31
    .line 32
    new-instance v0, La/eaf0;

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-direct {v0, p0, v1}, La/eaf0;-><init>(La/iaf0;B)V

    .line 36
    .line 37
    .line 38
    sget-object v1, La/wez;->b:La/wez;

    .line 39
    .line 40
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, La/iaf0;->N1:La/a8z;

    .line 45
    .line 46
    const-class v0, La/ocf0;

    .line 47
    .line 48
    sget-object v1, La/sre0;->a:La/tre0;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, La/eaf0;

    .line 55
    .line 56
    const/4 v2, 0x2

    .line 57
    invoke-direct {v1, p0, v2}, La/eaf0;-><init>(La/iaf0;B)V

    .line 58
    .line 59
    .line 60
    const/16 v2, 0xe

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/iaf0;->O1:La/a8z;

    .line 68
    .line 69
    sget-object v0, La/gaf0;->a:La/gaf0;

    .line 70
    .line 71
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/iaf0;->P1:La/s0r;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object p1, p0, La/iaf0;->Q1:La/gl5;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    new-instance p1, La/eaf0;

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-direct {p1, p0, v1}, La/eaf0;-><init>(La/iaf0;B)V

    .line 10
    .line 11
    .line 12
    new-instance v1, La/faf0;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, p0, v2}, La/faf0;-><init>(La/iaf0;B)V

    .line 16
    .line 17
    .line 18
    const-string v2, "UNIVERSAL_REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 19
    .line 20
    invoke-static {p0, v2, p1, v1}, La/gl5;->k(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, La/daf0;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {p1, p0, v1}, La/daf0;-><init>(La/iaf0;B)V

    .line 27
    .line 28
    .line 29
    const-string v1, "KEY_PICKER_MODEL_REQUEST"

    .line 30
    .line 31
    invoke-static {p0, v1, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, La/daf0;

    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    invoke-direct {p1, p0, v1}, La/daf0;-><init>(La/iaf0;B)V

    .line 38
    .line 39
    .line 40
    const-string v1, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 41
    .line 42
    invoke-static {p0, v1, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, La/iaf0;->R1:La/rl70;

    .line 46
    .line 47
    const-string v1, "pickerDialogFactory"

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    new-instance p1, La/daf0;

    .line 52
    .line 53
    const/4 v2, 0x3

    .line 54
    invoke-direct {p1, p0, v2}, La/daf0;-><init>(La/iaf0;B)V

    .line 55
    .line 56
    .line 57
    const-string v2, "PICKER_DIALOG_TAG"

    .line 58
    .line 59
    invoke-static {p0, v2, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 60
    .line 61
    .line 62
    new-instance p1, La/eaf0;

    .line 63
    .line 64
    const/4 v3, 0x6

    .line 65
    invoke-direct {p1, p0, v3}, La/eaf0;-><init>(La/iaf0;B)V

    .line 66
    .line 67
    .line 68
    const-string v3, "REQUEST_USER_EXIST_DIALOG_KEY"

    .line 69
    .line 70
    invoke-static {p0, v3, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, La/iaf0;->R1:La/rl70;

    .line 74
    .line 75
    if-eqz p1, :cond_1

    .line 76
    .line 77
    new-instance p1, La/daf0;

    .line 78
    .line 79
    const/4 v1, 0x4

    .line 80
    invoke-direct {p1, p0, v1}, La/daf0;-><init>(La/iaf0;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v2, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 84
    .line 85
    .line 86
    new-instance p1, La/daf0;

    .line 87
    .line 88
    const/4 v1, 0x5

    .line 89
    invoke-direct {p1, p0, v1}, La/daf0;-><init>(La/iaf0;B)V

    .line 90
    .line 91
    .line 92
    const-string v1, "REQUEST_BIRTHDAY_CALENDAR_KEY"

    .line 93
    .line 94
    invoke-static {p0, v1, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 95
    .line 96
    .line 97
    new-instance p1, La/daf0;

    .line 98
    .line 99
    const/4 v1, 0x6

    .line 100
    invoke-direct {p1, p0, v1}, La/daf0;-><init>(La/iaf0;B)V

    .line 101
    .line 102
    .line 103
    const-string v1, "REQUEST_PASSPORT_DATE_ISSUE_CALENDAR_KEY"

    .line 104
    .line 105
    invoke-static {p0, v1, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 106
    .line 107
    .line 108
    new-instance p1, La/daf0;

    .line 109
    .line 110
    const/4 v1, 0x7

    .line 111
    invoke-direct {p1, p0, v1}, La/daf0;-><init>(La/iaf0;B)V

    .line 112
    .line 113
    .line 114
    const-string v1, "REQUEST_PASSPORT_DATE_EXPIRE_CALENDAR_KEY"

    .line 115
    .line 116
    invoke-static {p0, v1, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, La/iaf0;->S1:La/eke0;

    .line 120
    .line 121
    if-eqz p1, :cond_0

    .line 122
    .line 123
    new-instance p1, La/daf0;

    .line 124
    .line 125
    const/4 v0, 0x1

    .line 126
    invoke-direct {p1, p0, v0}, La/daf0;-><init>(La/iaf0;B)V

    .line 127
    .line 128
    .line 129
    const-string v0, "KEY_SELECT_BONUS"

    .line 130
    .line 131
    invoke-static {p0, v0, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    new-instance p1, La/eaf0;

    .line 135
    .line 136
    const/4 v0, 0x0

    .line 137
    invoke-direct {p1, p0, v0}, La/eaf0;-><init>(La/iaf0;B)V

    .line 138
    .line 139
    .line 140
    const-string v0, "REQUEST_EXIT_FROM_REGISTRATION_DIALOG_KEY"

    .line 141
    .line 142
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 143
    .line 144
    .line 145
    new-instance p1, La/eaf0;

    .line 146
    .line 147
    const/4 v1, 0x4

    .line 148
    invoke-direct {p1, p0, v1}, La/eaf0;-><init>(La/iaf0;B)V

    .line 149
    .line 150
    .line 151
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 152
    .line 153
    .line 154
    new-instance p1, La/eaf0;

    .line 155
    .line 156
    const/4 v0, 0x5

    .line 157
    invoke-direct {p1, p0, v0}, La/eaf0;-><init>(La/iaf0;B)V

    .line 158
    .line 159
    .line 160
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_0
    const-string p0, "registrationBonusDialogFactory"

    .line 165
    .line 166
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v0

    .line 170
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v0

    .line 174
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v0

    .line 178
    :cond_3
    const-string p0, "captchaDialogDelegate"

    .line 179
    .line 180
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v0
.end method

.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/iaf0;->N1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/pri;

    .line 8
    .line 9
    iget-object v1, v0, La/pri;->M:La/n5d0;

    .line 10
    .line 11
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/ori;

    .line 16
    .line 17
    iput-object v1, p0, La/iaf0;->L1:La/ori;

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
    iput-object v1, p0, La/iaf0;->Q1:La/gl5;

    .line 27
    .line 28
    iget-object v1, v0, La/pri;->G:La/rl70;

    .line 29
    .line 30
    iput-object v1, p0, La/iaf0;->R1:La/rl70;

    .line 31
    .line 32
    iget-object v1, v0, La/pri;->H:La/eke0;

    .line 33
    .line 34
    iput-object v1, p0, La/iaf0;->S1:La/eke0;

    .line 35
    .line 36
    iget-object v1, v0, La/pri;->I:La/pek0;

    .line 37
    .line 38
    iput-object v1, p0, La/iaf0;->U1:La/pek0;

    .line 39
    .line 40
    iget-object v1, v0, La/pri;->J:La/ii;

    .line 41
    .line 42
    iput-object v1, p0, La/iaf0;->V1:La/ii;

    .line 43
    .line 44
    iget-object v1, v0, La/pri;->K:La/wdk0;

    .line 45
    .line 46
    iput-object v1, p0, La/iaf0;->W1:La/wdk0;

    .line 47
    .line 48
    iget-object v0, v0, La/pri;->L:La/kd30;

    .line 49
    .line 50
    iput-object v0, p0, La/iaf0;->X1:La/kd30;

    .line 51
    .line 52
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    invoke-static {p0}, La/zdx;->B(Landroidx/fragment/app/Fragment;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 8
    .line 9
    invoke-static {v0}, La/o050;->S(La/mm40;)La/mm40;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 15
    .line 16
    :goto_0
    sget-object v1, La/iaf0;->a2:[La/iiy;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    aget-object v1, v1, v2

    .line 20
    .line 21
    iget-object v3, p0, La/iaf0;->P1:La/s0r;

    .line 22
    .line 23
    invoke-virtual {v3, v1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast v1, La/aid;

    .line 31
    .line 32
    iget-object v1, v1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 33
    .line 34
    new-instance v3, La/j5d0;

    .line 35
    .line 36
    const/16 v4, 0xe

    .line 37
    .line 38
    invoke-direct {v3, v0, p0, v4}, La/j5d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    new-instance p0, La/ugd;

    .line 42
    .line 43
    const v0, -0x655023b8

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, v0, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-static {v1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final G0()La/wdk0;
    .locals 0

    .line 1
    iget-object p0, p0, La/iaf0;->W1:La/wdk0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "snackbarManager"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final H0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/iaf0;->O1:La/a8z;

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

.method public final Y()V
    .locals 1

    .line 1
    iget-object v0, p0, La/iaf0;->Y1:La/ndk0;

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
    iput-object v0, p0, La/iaf0;->Y1:La/ndk0;

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
    iget-object p0, p0, La/iaf0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
