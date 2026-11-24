.class public final La/r790;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/r790;",
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
.field public static final Z1:La/xi70;

.field public static final synthetic a2:[La/iiy;


# instance fields
.field public final K1:La/a8z;

.field public final L1:La/s0r;

.field public final M1:La/a8z;

.field public final N1:La/a8z;

.field public final O1:La/hnm0;

.field public final P1:La/a8z;

.field public final Q1:La/a8z;

.field public final R1:La/a8z;

.field public S1:Landroid/webkit/ValueCallback;

.field public U1:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

.field public final V1:La/r34;

.field public final W1:La/phf0;

.field public final X1:La/cgx0;

.field public final Y1:La/zz2;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/r790;

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
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "balanceId"

    .line 16
    .line 17
    const-string v5, "getBalanceId()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "redirectionURL"

    .line 25
    .line 26
    const-string v6, "getRedirectionURL()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "deposit"

    .line 34
    .line 35
    const-string v7, "getDeposit()Z"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "notificationId"

    .line 43
    .line 44
    const-string v8, "getNotificationId()I"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    new-array v1, v1, [La/iiy;

    .line 51
    .line 52
    aput-object v0, v1, v4

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    aput-object v2, v1, v0

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    aput-object v3, v1, v0

    .line 59
    .line 60
    const/4 v0, 0x3

    .line 61
    aput-object v5, v1, v0

    .line 62
    .line 63
    const/4 v0, 0x4

    .line 64
    aput-object v6, v1, v0

    .line 65
    .line 66
    sput-object v1, La/r790;->a2:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/xi70;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/r790;->Z1:La/xi70;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/m790;

    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    invoke-direct {v0, p0, v1}, La/m790;-><init>(La/r790;B)V

    .line 11
    .line 12
    .line 13
    sget-object v1, La/wez;->b:La/wez;

    .line 14
    .line 15
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/r790;->K1:La/a8z;

    .line 20
    .line 21
    sget-object v0, La/o790;->a:La/o790;

    .line 22
    .line 23
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, La/r790;->L1:La/s0r;

    .line 28
    .line 29
    const-class v0, La/db90;

    .line 30
    .line 31
    sget-object v2, La/sre0;->a:La/tre0;

    .line 32
    .line 33
    invoke-virtual {v2, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v2, La/m790;

    .line 38
    .line 39
    const/4 v3, 0x7

    .line 40
    invoke-direct {v2, p0, v3}, La/m790;-><init>(La/r790;B)V

    .line 41
    .line 42
    .line 43
    const/16 v3, 0xe

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-static {p0, v0, v4, v2, v3}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, La/r790;->M1:La/a8z;

    .line 51
    .line 52
    new-instance v0, La/m790;

    .line 53
    .line 54
    const/16 v2, 0x8

    .line 55
    .line 56
    invoke-direct {v0, p0, v2}, La/m790;-><init>(La/r790;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/r790;->N1:La/a8z;

    .line 64
    .line 65
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 66
    .line 67
    iput-object v0, p0, La/r790;->O1:La/hnm0;

    .line 68
    .line 69
    new-instance v0, La/m790;

    .line 70
    .line 71
    const/16 v2, 0x9

    .line 72
    .line 73
    invoke-direct {v0, p0, v2}, La/m790;-><init>(La/r790;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, La/r790;->P1:La/a8z;

    .line 81
    .line 82
    new-instance v0, La/m790;

    .line 83
    .line 84
    const/16 v2, 0xa

    .line 85
    .line 86
    invoke-direct {v0, p0, v2}, La/m790;-><init>(La/r790;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, La/r790;->Q1:La/a8z;

    .line 94
    .line 95
    new-instance v0, La/m790;

    .line 96
    .line 97
    const/16 v2, 0xb

    .line 98
    .line 99
    invoke-direct {v0, p0, v2}, La/m790;-><init>(La/r790;B)V

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, p0, La/r790;->R1:La/a8z;

    .line 107
    .line 108
    new-instance v0, La/r34;

    .line 109
    .line 110
    const-string v1, "CURRENCY_ID"

    .line 111
    .line 112
    const-wide/16 v2, 0x0

    .line 113
    .line 114
    invoke-direct {v0, v1, v2, v3}, La/r34;-><init>(Ljava/lang/String;J)V

    .line 115
    .line 116
    .line 117
    iput-object v0, p0, La/r790;->V1:La/r34;

    .line 118
    .line 119
    new-instance v0, La/phf0;

    .line 120
    .line 121
    const-string v1, "REDIRECT_URL"

    .line 122
    .line 123
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, La/r790;->W1:La/phf0;

    .line 127
    .line 128
    new-instance v0, La/cgx0;

    .line 129
    .line 130
    const-string v1, "deposit"

    .line 131
    .line 132
    const/4 v2, 0x0

    .line 133
    invoke-direct {v0, v1, v2}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 134
    .line 135
    .line 136
    iput-object v0, p0, La/r790;->X1:La/cgx0;

    .line 137
    .line 138
    new-instance v0, La/zz2;

    .line 139
    .line 140
    const-string v1, "NOTIFICATION_ID"

    .line 141
    .line 142
    const/4 v2, -0x1

    .line 143
    invoke-direct {v0, v1, v2}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 144
    .line 145
    .line 146
    iput-object v0, p0, La/r790;->Y1:La/zz2;

    .line 147
    .line 148
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    sget-object p1, La/r790;->a2:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    aget-object v1, p1, v0

    .line 5
    .line 6
    iget-object v2, p0, La/r790;->Y1:La/zz2;

    .line 7
    .line 8
    invoke-virtual {v2, p0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ltz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v3, "notification"

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    instance-of v3, v1, Landroid/app/NotificationManager;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    check-cast v1, Landroid/app/NotificationManager;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v1, 0x0

    .line 36
    :goto_0
    if-eqz v1, :cond_1

    .line 37
    .line 38
    aget-object v3, p1, v0

    .line 39
    .line 40
    invoke-virtual {v2, p0, v3}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v1, v2}, Landroid/app/NotificationManager;->cancel(I)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 60
    .line 61
    const/4 v2, 0x2

    .line 62
    and-int/2addr v1, v2

    .line 63
    const/4 v3, 0x1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    invoke-static {v3}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 67
    .line 68
    .line 69
    :cond_2
    const/4 v1, 0x0

    .line 70
    aget-object p1, p1, v1

    .line 71
    .line 72
    iget-object v1, p0, La/r790;->L1:La/s0r;

    .line 73
    .line 74
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    check-cast p1, La/aid;

    .line 82
    .line 83
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 84
    .line 85
    new-instance v1, La/n790;

    .line 86
    .line 87
    invoke-direct {v1, p0, v2}, La/n790;-><init>(La/r790;B)V

    .line 88
    .line 89
    .line 90
    new-instance v4, La/ugd;

    .line 91
    .line 92
    const v5, 0x67994c4c

    .line 93
    .line 94
    .line 95
    invoke-direct {v4, v5, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v1, La/shd;

    .line 99
    .line 100
    const/16 v5, 0xf

    .line 101
    .line 102
    invoke-direct {v1, v5}, La/shd;-><init>(B)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v1, v4}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 106
    .line 107
    .line 108
    new-instance p1, La/m790;

    .line 109
    .line 110
    invoke-direct {p1, p0, v3}, La/m790;-><init>(La/r790;B)V

    .line 111
    .line 112
    .line 113
    const-string v1, "VERIFICATION_LISTENER"

    .line 114
    .line 115
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 116
    .line 117
    .line 118
    new-instance p1, La/m790;

    .line 119
    .line 120
    invoke-direct {p1, p0, v2}, La/m790;-><init>(La/r790;B)V

    .line 121
    .line 122
    .line 123
    const-string v1, "BONUS_LISTENER"

    .line 124
    .line 125
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 126
    .line 127
    .line 128
    new-instance p1, La/m790;

    .line 129
    .line 130
    const/4 v2, 0x3

    .line 131
    invoke-direct {p1, p0, v2}, La/m790;-><init>(La/r790;B)V

    .line 132
    .line 133
    .line 134
    invoke-static {p0, v1, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 135
    .line 136
    .line 137
    new-instance p1, La/m790;

    .line 138
    .line 139
    invoke-direct {p1, p0, v0}, La/m790;-><init>(La/r790;B)V

    .line 140
    .line 141
    .line 142
    const-string v0, "ERROR_DIALOG_LISTENER"

    .line 143
    .line 144
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 145
    .line 146
    .line 147
    new-instance p1, La/m790;

    .line 148
    .line 149
    const/4 v0, 0x5

    .line 150
    invoke-direct {p1, p0, v0}, La/m790;-><init>(La/r790;B)V

    .line 151
    .line 152
    .line 153
    const-string v0, "REQUEST_OPEN_SETTINGS_DIALOG_KEY"

    .line 154
    .line 155
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public final G0()La/mni;
    .locals 0

    .line 1
    iget-object p0, p0, La/r790;->K1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/mni;

    .line 8
    .line 9
    return-object p0
.end method

.method public final H0()La/qm90;
    .locals 0

    .line 1
    iget-object p0, p0, La/r790;->N1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/qm90;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/r790;->M1:La/a8z;

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

.method public final J0(ZLandroid/webkit/PermissionRequest;)V
    .locals 14

    .line 1
    invoke-virtual {p0}, La/r790;->G0()La/mni;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/mni;->s:La/ii;

    .line 6
    .line 7
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 8
    .line 9
    invoke-virtual {p0}, La/r790;->G0()La/mni;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v2, v2, La/mni;->o:La/ctf0;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    new-array v4, v3, [Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 19
    .line 20
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const v5, 0x7f1303fb

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p0}, La/r790;->G0()La/mni;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-object v4, v4, La/mni;->o:La/ctf0;

    .line 36
    .line 37
    new-array v5, v3, [Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 40
    .line 41
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const v6, 0x7f130f39

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {p0}, La/r790;->G0()La/mni;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    iget-object v5, v5, La/mni;->o:La/ctf0;

    .line 57
    .line 58
    new-array v6, v3, [Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 61
    .line 62
    invoke-static {v6, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    const v7, 0x7f130f34

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {p0}, La/r790;->G0()La/mni;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    iget-object v6, v6, La/mni;->o:La/ctf0;

    .line 78
    .line 79
    new-array v7, v3, [Ljava/lang/Object;

    .line 80
    .line 81
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 82
    .line 83
    invoke-static {v7, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const v7, 0x7f13032f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v7, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    sget-object v10, La/n12;->a:La/n12;

    .line 95
    .line 96
    const/4 v11, 0x0

    .line 97
    const/16 v12, 0x5d0

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    const-string v7, "CAMERA_PERMISSION_DIALOG"

    .line 101
    .line 102
    const/4 v8, 0x0

    .line 103
    const/4 v9, 0x0

    .line 104
    move-object v13, v5

    .line 105
    move-object v5, v3

    .line 106
    move-object v3, v4

    .line 107
    move-object v4, v13

    .line 108
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 119
    .line 120
    .line 121
    new-instance v0, La/lf2;

    .line 122
    .line 123
    const/16 v1, 0xa

    .line 124
    .line 125
    move-object/from16 v2, p2

    .line 126
    .line 127
    invoke-direct {v0, p1, p0, v2, v1}, La/lf2;-><init>(ZLjava/lang/Object;Ljava/lang/Object;B)V

    .line 128
    .line 129
    .line 130
    const-string p1, "CAMERA_PERMISSION_DIALOG"

    .line 131
    .line 132
    invoke-static {p0, p1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public final K0(Z)V
    .locals 14

    .line 1
    invoke-virtual {p0}, La/r790;->G0()La/mni;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/mni;->s:La/ii;

    .line 6
    .line 7
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 8
    .line 9
    invoke-virtual {p0}, La/r790;->G0()La/mni;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v2, v2, La/mni;->o:La/ctf0;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    new-array v4, v3, [Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 19
    .line 20
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const v5, 0x7f1303fb

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p0}, La/r790;->G0()La/mni;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-object v4, v4, La/mni;->o:La/ctf0;

    .line 36
    .line 37
    new-array v5, v3, [Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 40
    .line 41
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const v6, 0x7f130f3d

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {p0}, La/r790;->G0()La/mni;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    iget-object v5, v5, La/mni;->o:La/ctf0;

    .line 57
    .line 58
    new-array v6, v3, [Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 61
    .line 62
    invoke-static {v6, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    const v7, 0x7f130f34

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {p0}, La/r790;->G0()La/mni;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    iget-object v6, v6, La/mni;->o:La/ctf0;

    .line 78
    .line 79
    new-array v7, v3, [Ljava/lang/Object;

    .line 80
    .line 81
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 82
    .line 83
    invoke-static {v7, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const v7, 0x7f13032f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v7, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    sget-object v10, La/n12;->a:La/n12;

    .line 95
    .line 96
    const/4 v11, 0x0

    .line 97
    const/16 v12, 0x5d0

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    const-string v7, "PERMISSION_DIALOG"

    .line 101
    .line 102
    const/4 v8, 0x0

    .line 103
    const/4 v9, 0x0

    .line 104
    move-object v13, v5

    .line 105
    move-object v5, v3

    .line 106
    move-object v3, v4

    .line 107
    move-object v4, v13

    .line 108
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 119
    .line 120
    .line 121
    new-instance v0, La/rd7;

    .line 122
    .line 123
    const/16 v1, 0xc

    .line 124
    .line 125
    invoke-direct {v0, p1, p0, v1}, La/rd7;-><init>(ZLjava/lang/Object;B)V

    .line 126
    .line 127
    .line 128
    const-string p1, "PERMISSION_DIALOG"

    .line 129
    .line 130
    invoke-static {p0, p1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public final L0(Ljava/lang/String;La/da90;)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p2, v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-ne p2, v0, :cond_0

    .line 12
    .line 13
    sget-object p2, La/pek0;->a:La/pek0;

    .line 14
    .line 15
    :goto_0
    move-object v1, p2

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    sget-object p2, La/rek0;->b:La/rek0;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    sget-object p2, La/qek0;->a:La/qek0;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    invoke-virtual {p0}, La/r790;->G0()La/mni;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iget-object p2, p2, La/mni;->u:La/wdk0;

    .line 32
    .line 33
    new-instance v0, La/xdk0;

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    const/16 v7, 0x7c

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    move-object v2, p1

    .line 42
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 43
    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    const/16 v9, 0x3fc

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    move-object v4, p0

    .line 50
    move-object v2, p2

    .line 51
    move-object v3, v0

    .line 52
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x21

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, La/r6e;->w(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v0, "BUNDLE_EXTRA_CONTAINER"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    instance-of v0, p1, La/pm90;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    :cond_1
    check-cast p1, La/pm90;

    .line 29
    .line 30
    :goto_0
    check-cast p1, La/pm90;

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, La/r790;->H0()La/qm90;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/qm90;->g:La/pm90;

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, La/r790;->H0()La/qm90;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, La/n790;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {v0, p0, v1}, La/n790;-><init>(La/r790;B)V

    .line 51
    .line 52
    .line 53
    new-instance v1, La/n790;

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    invoke-direct {v1, p0, v2}, La/n790;-><init>(La/r790;B)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iput-object v0, p1, La/qm90;->c:Lkotlin/jvm/functions/Function2;

    .line 63
    .line 64
    iput-object v1, p1, La/qm90;->d:Lkotlin/jvm/functions/Function2;

    .line 65
    .line 66
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 67
    .line 68
    invoke-virtual {p0}, La/r790;->H0()La/qm90;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p1, p0}, La/glz;->a(La/blz;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    iget-object v0, p0, La/r790;->U1:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iput-object v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->o:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    iput-object v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->p:Lkotlin/jvm/functions/Function0;

    .line 18
    .line 19
    iput-object v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->q:Lkotlin/jvm/functions/Function0;

    .line 20
    .line 21
    iput-object v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->r:Lkotlin/jvm/functions/Function0;

    .line 22
    .line 23
    iput-object v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->s:La/xdr;

    .line 24
    .line 25
    iput-object v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->t:Lkotlin/jvm/functions/Function0;

    .line 26
    .line 27
    iput-object v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->u:Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    iput-object v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->v:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    iput-object v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->w:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    iput-object v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->m:Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    iput-object v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->n:Lkotlin/jvm/functions/Function1;

    .line 36
    .line 37
    iput-object v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->x:Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a()V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-super {p0}, La/yx5;->Z()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, La/hxm0;->m(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 10
    .line 11
    iget-object p0, p0, La/r790;->U1:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->e()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, La/hxm0;->n(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, La/r790;->U1:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->f()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final f0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/r790;->H0()La/qm90;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/qm90;->g:La/pm90;

    .line 6
    .line 7
    const-string v0, "BUNDLE_EXTRA_CONTAINER"

    .line 8
    .line 9
    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/r790;->O1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
