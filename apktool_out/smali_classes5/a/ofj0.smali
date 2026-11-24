.class public final La/ofj0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ofj0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/cge0",
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
.field public static final X1:La/cge0;

.field public static final synthetic Y1:[La/iiy;


# instance fields
.field public K1:La/rqj0;

.field public L1:La/ii;

.field public M1:La/gl5;

.field public N1:La/ux00;

.field public O1:La/nwd;

.field public P1:La/wdk0;

.field public Q1:La/zav;

.field public R1:La/fiu0;

.field public final S1:La/a8z;

.field public final U1:La/s0r;

.field public V1:La/qgd;

.field public W1:La/xi70;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ofj0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/ofj0;->Y1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/cge0;

    .line 21
    .line 22
    const/16 v1, 0x15

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/cge0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/ofj0;->X1:La/cge0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-class v0, La/ngj0;

    .line 8
    .line 9
    sget-object v1, La/sre0;->a:La/tre0;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/jfj0;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, v2}, La/jfj0;-><init>(La/ofj0;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/ofj0;->S1:La/a8z;

    .line 26
    .line 27
    sget-object v0, La/mfj0;->a:La/mfj0;

    .line 28
    .line 29
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/ofj0;->U1:La/s0r;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/jfj0;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/jfj0;-><init>(La/ofj0;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "REQUEST_OPEN_SITE_DIALOG_KEY"

    .line 8
    .line 9
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, La/lfj0;

    .line 13
    .line 14
    invoke-direct {p1, p0, v0}, La/lfj0;-><init>(La/ofj0;B)V

    .line 15
    .line 16
    .line 17
    const-string v1, "DEV_PASS_REQUEST_KEY"

    .line 18
    .line 19
    invoke-static {p0, v1, p1}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, La/jfj0;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {p1, p0, v1}, La/jfj0;-><init>(La/ofj0;B)V

    .line 26
    .line 27
    .line 28
    const-string v1, "REQUEST_SHOW_PAYOUT_ERROR_DIALOG_KEY"

    .line 29
    .line 30
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 31
    .line 32
    .line 33
    new-instance p1, La/jfj0;

    .line 34
    .line 35
    const/4 v1, 0x5

    .line 36
    invoke-direct {p1, p0, v1}, La/jfj0;-><init>(La/ofj0;B)V

    .line 37
    .line 38
    .line 39
    const-string v1, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY"

    .line 40
    .line 41
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 42
    .line 43
    .line 44
    new-instance p1, La/jfj0;

    .line 45
    .line 46
    const/4 v2, 0x6

    .line 47
    invoke-direct {p1, p0, v2}, La/jfj0;-><init>(La/ofj0;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v1, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 51
    .line 52
    .line 53
    new-instance p1, La/jfj0;

    .line 54
    .line 55
    const/4 v1, 0x7

    .line 56
    invoke-direct {p1, p0, v1}, La/jfj0;-><init>(La/ofj0;B)V

    .line 57
    .line 58
    .line 59
    const-string v1, "REQUEST_DELETE_ACCOUNT"

    .line 60
    .line 61
    invoke-static {p0, v1, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, La/ofj0;->M1:La/gl5;

    .line 65
    .line 66
    if-eqz p1, :cond_0

    .line 67
    .line 68
    new-instance p1, La/jfj0;

    .line 69
    .line 70
    const/4 v1, 0x3

    .line 71
    invoke-direct {p1, p0, v1}, La/jfj0;-><init>(La/ofj0;B)V

    .line 72
    .line 73
    .line 74
    new-instance v1, La/lfj0;

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    invoke-direct {v1, p0, v2}, La/lfj0;-><init>(La/ofj0;B)V

    .line 78
    .line 79
    .line 80
    const-string v3, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 81
    .line 82
    invoke-static {p0, v3, p1, v1}, La/gl5;->k(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-instance v1, La/kfj0;

    .line 90
    .line 91
    invoke-direct {v1, p0, v2}, La/kfj0;-><init>(La/ofj0;B)V

    .line 92
    .line 93
    .line 94
    const-string v3, "REQUEST_QUICKBET_KEY"

    .line 95
    .line 96
    invoke-virtual {p1, v3, p0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    new-instance v1, La/kfj0;

    .line 108
    .line 109
    invoke-direct {v1, p0, v0}, La/kfj0;-><init>(La/ofj0;B)V

    .line 110
    .line 111
    .line 112
    const-string v3, "REQUEST_SHOW_LOGOUT_DIALOG"

    .line 113
    .line 114
    invoke-virtual {p1, v3, p0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 115
    .line 116
    .line 117
    new-instance p1, La/jfj0;

    .line 118
    .line 119
    const/4 v1, 0x4

    .line 120
    invoke-direct {p1, p0, v1}, La/jfj0;-><init>(La/ofj0;B)V

    .line 121
    .line 122
    .line 123
    const-string v1, "REQUEST_APP_INFO_DIALOG_KEY"

    .line 124
    .line 125
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 126
    .line 127
    .line 128
    sget-object p1, La/ofj0;->Y1:[La/iiy;

    .line 129
    .line 130
    aget-object p1, p1, v2

    .line 131
    .line 132
    iget-object v1, p0, La/ofj0;->U1:La/s0r;

    .line 133
    .line 134
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    check-cast p1, La/aid;

    .line 142
    .line 143
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 144
    .line 145
    new-instance v1, La/uph0;

    .line 146
    .line 147
    const/16 v2, 0x17

    .line 148
    .line 149
    invoke-direct {v1, p0, v2}, La/uph0;-><init>(Ljava/lang/Object;B)V

    .line 150
    .line 151
    .line 152
    new-instance p0, La/ugd;

    .line 153
    .line 154
    const v2, -0x3fac2314

    .line 155
    .line 156
    .line 157
    invoke-direct {p0, v2, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_0
    const-string p0, "captchaDialogDelegate"

    .line 165
    .line 166
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const/4 p0, 0x0

    .line 170
    throw p0
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
    const-class v1, La/j0j0;

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
    instance-of v3, v0, La/j0j0;

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
    check-cast v2, La/j0j0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-class v1, La/ofj0;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v2, v0, v1}, La/j0j0;->a(La/i1w0;Ljava/lang/String;)La/uti;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v1, v0, La/uti;->a:La/rqj0;

    .line 70
    .line 71
    iput-object v1, p0, La/ofj0;->K1:La/rqj0;

    .line 72
    .line 73
    iget-object v1, v0, La/uti;->b:La/ii;

    .line 74
    .line 75
    iput-object v1, p0, La/ofj0;->L1:La/ii;

    .line 76
    .line 77
    new-instance v1, La/gl5;

    .line 78
    .line 79
    const/16 v2, 0x11

    .line 80
    .line 81
    invoke-direct {v1, v2}, La/gl5;-><init>(B)V

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, La/ofj0;->M1:La/gl5;

    .line 85
    .line 86
    new-instance v1, La/ux00;

    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v1, p0, La/ofj0;->N1:La/ux00;

    .line 92
    .line 93
    iget-object v1, v0, La/uti;->c:La/nwd;

    .line 94
    .line 95
    iput-object v1, p0, La/ofj0;->O1:La/nwd;

    .line 96
    .line 97
    iget-object v1, v0, La/uti;->d:La/wdk0;

    .line 98
    .line 99
    iput-object v1, p0, La/ofj0;->P1:La/wdk0;

    .line 100
    .line 101
    iget-object v1, v0, La/uti;->v0:La/ok50;

    .line 102
    .line 103
    iget-object v1, v1, La/ok50;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v1, La/vqc;

    .line 106
    .line 107
    invoke-virtual {v1}, La/vqc;->f()La/zav;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iput-object v1, p0, La/ofj0;->Q1:La/zav;

    .line 115
    .line 116
    invoke-virtual {v0}, La/uti;->a()La/fiu0;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iput-object v1, p0, La/ofj0;->R1:La/fiu0;

    .line 121
    .line 122
    iget-object v1, v0, La/uti;->i:La/qgd;

    .line 123
    .line 124
    iput-object v1, p0, La/ofj0;->V1:La/qgd;

    .line 125
    .line 126
    iget-object v0, v0, La/uti;->Z:La/rmd0;

    .line 127
    .line 128
    invoke-interface {v0}, La/rmd0;->f()La/xi70;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, La/ofj0;->W1:La/xi70;

    .line 133
    .line 134
    return-void

    .line 135
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 136
    .line 137
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public final G0()La/ii;
    .locals 0

    .line 1
    iget-object p0, p0, La/ofj0;->L1:La/ii;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "actionDialogManager"

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
    iget-object p0, p0, La/ofj0;->S1:La/a8z;

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

.method public final I0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/ofj0;->G0()La/ii;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 6
    .line 7
    const v2, 0x7f130e5d

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v10, La/n12;->b:La/n12;

    .line 18
    .line 19
    const/4 v11, 0x0

    .line 20
    const/16 v12, 0x5f8

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x0

    .line 27
    move-object v2, p1

    .line 28
    move-object v3, p2

    .line 29
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, La/kfj0;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {v0, p0, v1}, La/kfj0;-><init>(La/ofj0;B)V

    .line 16
    .line 17
    .line 18
    const-string v2, "SETTINGS_QR_SCANNER_REQUEST_KEY"

    .line 19
    .line 20
    invoke-virtual {p1, v2, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v0, La/kfj0;

    .line 32
    .line 33
    const/4 v2, 0x3

    .line 34
    invoke-direct {v0, p0, v2}, La/kfj0;-><init>(La/ofj0;B)V

    .line 35
    .line 36
    .line 37
    const-string v2, "OTP_CONFIRMATION_RESULT_KEY"

    .line 38
    .line 39
    invoke-virtual {p1, v2, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 40
    .line 41
    .line 42
    new-instance p1, La/lfj0;

    .line 43
    .line 44
    invoke-direct {p1, p0, v1}, La/lfj0;-><init>(La/ofj0;B)V

    .line 45
    .line 46
    .line 47
    const-string v0, "REQUEST_CONFIRMATION_NEW_PLACE_KEY"

    .line 48
    .line 49
    invoke-static {p0, v0, p1}, La/vdb;->j0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final Y()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "SETTINGS_QR_SCANNER_REQUEST_KEY"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

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
