.class public final La/o890;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/o890;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/jh70",
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
.field public static final f2:La/jh70;

.field public static final synthetic g2:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/nni;

.field public M1:La/oni;

.field public N1:La/z7z;

.field public O1:La/z7z;

.field public P1:La/z7z;

.field public Q1:La/z7z;

.field public R1:La/ojj;

.field public final S1:La/kiu0;

.field public final U1:La/s0r;

.field public final V1:La/n0o0;

.field public final W1:La/n0o0;

.field public final X1:La/n0o0;

.field public final Y1:La/n0o0;

.field public Z1:Landroid/webkit/ValueCallback;

.field public a2:Landroid/webkit/PermissionRequest;

.field public final b2:La/r34;

.field public final c2:La/phf0;

.field public final d2:La/cgx0;

.field public final e2:La/zz2;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/o890;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/feature/office/payment/impl/databinding/FragmentPaymentBrowserBinding;"

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
    sput-object v1, La/o890;->g2:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/jh70;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/o890;->f2:La/jh70;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0280

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/o890;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/l890;

    .line 12
    .line 13
    const/16 v1, 0xa

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, La/l890;-><init>(La/o890;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/wz80;

    .line 19
    .line 20
    const/4 v2, 0x6

    .line 21
    invoke-direct {v1, p0, v2}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v3, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v4, La/wz80;

    .line 27
    .line 28
    const/4 v5, 0x7

    .line 29
    invoke-direct {v4, v1, v5}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-class v3, La/p990;

    .line 37
    .line 38
    sget-object v4, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    new-instance v4, La/a190;

    .line 45
    .line 46
    invoke-direct {v4, v1, v2}, La/a190;-><init>(La/a8z;B)V

    .line 47
    .line 48
    .line 49
    new-instance v2, La/a190;

    .line 50
    .line 51
    invoke-direct {v2, v1, v5}, La/a190;-><init>(La/a8z;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v3, v4, v2, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/o890;->S1:La/kiu0;

    .line 59
    .line 60
    sget-object v0, La/n890;->a:La/n890;

    .line 61
    .line 62
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, La/o890;->U1:La/s0r;

    .line 67
    .line 68
    new-instance v0, La/l890;

    .line 69
    .line 70
    const/16 v1, 0xb

    .line 71
    .line 72
    invoke-direct {v0, p0, v1}, La/l890;-><init>(La/o890;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/o890;->V1:La/n0o0;

    .line 80
    .line 81
    new-instance v0, La/l890;

    .line 82
    .line 83
    const/16 v1, 0xc

    .line 84
    .line 85
    invoke-direct {v0, p0, v1}, La/l890;-><init>(La/o890;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, La/o890;->W1:La/n0o0;

    .line 93
    .line 94
    new-instance v0, La/l890;

    .line 95
    .line 96
    const/16 v1, 0xd

    .line 97
    .line 98
    invoke-direct {v0, p0, v1}, La/l890;-><init>(La/o890;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iput-object v0, p0, La/o890;->X1:La/n0o0;

    .line 106
    .line 107
    new-instance v0, La/l890;

    .line 108
    .line 109
    const/16 v1, 0xe

    .line 110
    .line 111
    invoke-direct {v0, p0, v1}, La/l890;-><init>(La/o890;B)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iput-object v0, p0, La/o890;->Y1:La/n0o0;

    .line 119
    .line 120
    new-instance v0, La/r34;

    .line 121
    .line 122
    const-string v1, "CURRENCY_ID"

    .line 123
    .line 124
    const-wide/16 v2, 0x0

    .line 125
    .line 126
    invoke-direct {v0, v1, v2, v3}, La/r34;-><init>(Ljava/lang/String;J)V

    .line 127
    .line 128
    .line 129
    iput-object v0, p0, La/o890;->b2:La/r34;

    .line 130
    .line 131
    new-instance v0, La/phf0;

    .line 132
    .line 133
    const-string v1, "REDIRECT_URL"

    .line 134
    .line 135
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iput-object v0, p0, La/o890;->c2:La/phf0;

    .line 139
    .line 140
    new-instance v0, La/cgx0;

    .line 141
    .line 142
    const-string v1, "deposit"

    .line 143
    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-direct {v0, v1, v2}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 146
    .line 147
    .line 148
    iput-object v0, p0, La/o890;->d2:La/cgx0;

    .line 149
    .line 150
    new-instance v0, La/zz2;

    .line 151
    .line 152
    const-string v1, "NOTIFICATION_ID"

    .line 153
    .line 154
    const/4 v2, -0x1

    .line 155
    invoke-direct {v0, v1, v2}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 156
    .line 157
    .line 158
    iput-object v0, p0, La/o890;->e2:La/zz2;

    .line 159
    .line 160
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 28

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, La/agd;->k()La/jg60;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v3, La/m890;

    .line 16
    .line 17
    const/4 v8, 0x3

    .line 18
    invoke-direct {v3, v2, v8}, La/m890;-><init>(La/o890;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, v3}, La/bdx;->O(La/jg60;La/i0h0;Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, La/o890;->K0()La/s2r;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v9, v0, La/s2r;->f:La/nq8;

    .line 29
    .line 30
    invoke-virtual {v2}, La/o890;->K0()La/s2r;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v0, v0, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    invoke-static {v0, v10}, La/knm0;->h(Landroid/view/View;Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, La/o890;->K0()La/s2r;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v11, v0, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 45
    .line 46
    new-instance v0, La/xj80;

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    const/16 v7, 0x1a

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    const-class v3, La/o890;

    .line 53
    .line 54
    const-string v4, "onShowFileChooser"

    .line 55
    .line 56
    const-string v5, "onShowFileChooser(Landroid/webkit/ValueCallback;)V"

    .line 57
    .line 58
    invoke-direct/range {v0 .. v7}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 59
    .line 60
    .line 61
    move-object v12, v0

    .line 62
    new-instance v0, La/xj80;

    .line 63
    .line 64
    const/16 v7, 0x1b

    .line 65
    .line 66
    const-string v4, "onPermissionRequest"

    .line 67
    .line 68
    const-string v5, "onPermissionRequest(Landroid/webkit/PermissionRequest;)V"

    .line 69
    .line 70
    invoke-direct/range {v0 .. v7}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 71
    .line 72
    .line 73
    iput-object v12, v11, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->m:Lkotlin/jvm/functions/Function1;

    .line 74
    .line 75
    iput-object v0, v11, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->n:Lkotlin/jvm/functions/Function1;

    .line 76
    .line 77
    invoke-virtual {v2}, La/o890;->K0()La/s2r;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object v0, v0, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 82
    .line 83
    new-instance v1, La/m890;

    .line 84
    .line 85
    invoke-direct {v1, v2, v10}, La/m890;-><init>(La/o890;B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->setOnWebViewErrorListener$impl(Lkotlin/jvm/functions/Function1;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, La/o890;->K0()La/s2r;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object v11, v0, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 96
    .line 97
    new-instance v0, La/xj80;

    .line 98
    .line 99
    const/16 v7, 0x1c

    .line 100
    .line 101
    const/4 v1, 0x1

    .line 102
    const-string v4, "checkOnPay"

    .line 103
    .line 104
    const-string v5, "checkOnPay(Ljava/lang/String;)Z"

    .line 105
    .line 106
    invoke-direct/range {v0 .. v7}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 107
    .line 108
    .line 109
    move-object v12, v0

    .line 110
    new-instance v13, La/l890;

    .line 111
    .line 112
    const/4 v14, 0x1

    .line 113
    invoke-direct {v13, v2, v14}, La/l890;-><init>(La/o890;B)V

    .line 114
    .line 115
    .line 116
    new-instance v15, La/pl70;

    .line 117
    .line 118
    const/16 v0, 0xf

    .line 119
    .line 120
    invoke-direct {v15, v9, v0}, La/pl70;-><init>(Ljava/lang/Object;B)V

    .line 121
    .line 122
    .line 123
    new-instance v0, La/cz60;

    .line 124
    .line 125
    const/16 v7, 0x10

    .line 126
    .line 127
    const/4 v1, 0x0

    .line 128
    const-string v4, "showErrorData"

    .line 129
    .line 130
    const-string v5, "showErrorData()V"

    .line 131
    .line 132
    invoke-direct/range {v0 .. v7}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 133
    .line 134
    .line 135
    move-object v9, v15

    .line 136
    move-object v15, v0

    .line 137
    new-instance v0, La/kx2;

    .line 138
    .line 139
    const/4 v7, 0x4

    .line 140
    const/4 v1, 0x3

    .line 141
    const-string v4, "startLaunchSocial"

    .line 142
    .line 143
    const-string v5, "startLaunchSocial(ILjava/lang/String;Ljava/lang/String;)V"

    .line 144
    .line 145
    invoke-direct/range {v0 .. v7}, La/kx2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 146
    .line 147
    .line 148
    move-object/from16 v16, v0

    .line 149
    .line 150
    new-instance v0, La/l890;

    .line 151
    .line 152
    const/4 v1, 0x2

    .line 153
    invoke-direct {v0, v2, v1}, La/l890;-><init>(La/o890;B)V

    .line 154
    .line 155
    .line 156
    new-instance v4, La/m890;

    .line 157
    .line 158
    invoke-direct {v4, v2, v14}, La/m890;-><init>(La/o890;B)V

    .line 159
    .line 160
    .line 161
    new-instance v19, La/xj80;

    .line 162
    .line 163
    const/16 v7, 0x18

    .line 164
    .line 165
    move v5, v1

    .line 166
    const/4 v1, 0x1

    .line 167
    move-object/from16 v18, v4

    .line 168
    .line 169
    const-string v4, "startIntentAction"

    .line 170
    .line 171
    move/from16 v17, v5

    .line 172
    .line 173
    const-string v5, "startIntentAction(Landroid/content/Intent;)V"

    .line 174
    .line 175
    move/from16 p1, v8

    .line 176
    .line 177
    move/from16 v8, v17

    .line 178
    .line 179
    move-object/from16 v17, v0

    .line 180
    .line 181
    move-object/from16 v0, v19

    .line 182
    .line 183
    invoke-direct/range {v0 .. v7}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 184
    .line 185
    .line 186
    new-instance v0, La/xj80;

    .line 187
    .line 188
    const/16 v7, 0x19

    .line 189
    .line 190
    const-string v4, "startIntentActionAndFinish"

    .line 191
    .line 192
    const-string v5, "startIntentActionAndFinish(Landroid/content/Intent;)V"

    .line 193
    .line 194
    invoke-direct/range {v0 .. v7}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 195
    .line 196
    .line 197
    move-object/from16 v20, v0

    .line 198
    .line 199
    move v0, v14

    .line 200
    move-object v14, v9

    .line 201
    invoke-virtual/range {v11 .. v20}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/xdr;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, La/o890;->K0()La/s2r;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    iget-object v1, v1, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 209
    .line 210
    new-instance v3, La/ww0;

    .line 211
    .line 212
    invoke-direct {v3, v2, v0}, La/ww0;-><init>(Ljava/lang/Object;B)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1, v3}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->setDownloadListener$impl(Landroid/webkit/DownloadListener;)V

    .line 216
    .line 217
    .line 218
    sget-object v1, La/o890;->g2:[La/iiy;

    .line 219
    .line 220
    aget-object v3, v1, p1

    .line 221
    .line 222
    iget-object v4, v2, La/o890;->d2:La/cgx0;

    .line 223
    .line 224
    invoke-virtual {v4, v2, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-eqz v3, :cond_0

    .line 233
    .line 234
    const v3, 0x7f130f26

    .line 235
    .line 236
    .line 237
    goto :goto_0

    .line 238
    :cond_0
    const v3, 0x7f130f27

    .line 239
    .line 240
    .line 241
    :goto_0
    invoke-virtual {v2}, La/o890;->K0()La/s2r;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    iget-object v4, v4, La/s2r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 246
    .line 247
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2}, La/o890;->K0()La/s2r;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    iget-object v3, v3, La/s2r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 262
    .line 263
    new-instance v4, La/l890;

    .line 264
    .line 265
    const/4 v5, 0x7

    .line 266
    invoke-direct {v4, v2, v5}, La/l890;-><init>(La/o890;B)V

    .line 267
    .line 268
    .line 269
    invoke-static {v3, v4}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2}, La/o890;->K0()La/s2r;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    iget-object v3, v3, La/s2r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 277
    .line 278
    new-instance v11, La/hc50;

    .line 279
    .line 280
    sget-object v13, La/ybg0;->a:La/ybg0;

    .line 281
    .line 282
    new-instance v15, La/l890;

    .line 283
    .line 284
    const/16 v4, 0x8

    .line 285
    .line 286
    invoke-direct {v15, v2, v4}, La/l890;-><init>(La/o890;B)V

    .line 287
    .line 288
    .line 289
    const/16 v16, 0x7f0

    .line 290
    .line 291
    const-string v12, "REFRESH_BUTTON"

    .line 292
    .line 293
    const v14, 0x7f080b1d

    .line 294
    .line 295
    .line 296
    invoke-direct/range {v11 .. v16}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 297
    .line 298
    .line 299
    filled-new-array {v11}, [La/hc50;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-static {v5}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, La/o890;->K0()La/s2r;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    iget-object v3, v3, La/s2r;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 315
    .line 316
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2}, La/o890;->K0()La/s2r;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    iget-object v3, v3, La/s2r;->f:La/nq8;

    .line 324
    .line 325
    iget-object v3, v3, La/nq8;->b:Landroid/view/View;

    .line 326
    .line 327
    check-cast v3, Landroid/widget/ProgressBar;

    .line 328
    .line 329
    invoke-virtual {v3, v10}, Landroid/view/View;->setVisibility(I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, La/o890;->K0()La/s2r;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    iget-object v3, v3, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 337
    .line 338
    invoke-virtual {v3}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->b()Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-eqz v3, :cond_1

    .line 343
    .line 344
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    iget v3, v3, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 353
    .line 354
    and-int/2addr v3, v8

    .line 355
    if-eqz v3, :cond_1

    .line 356
    .line 357
    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 358
    .line 359
    .line 360
    :cond_1
    iget-object v0, v2, La/o890;->e2:La/zz2;

    .line 361
    .line 362
    const/4 v3, 0x4

    .line 363
    aget-object v1, v1, v3

    .line 364
    .line 365
    invoke-virtual {v0, v2, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    const/4 v15, 0x0

    .line 374
    if-ltz v0, :cond_3

    .line 375
    .line 376
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    const-string v1, "notification"

    .line 381
    .line 382
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    instance-of v1, v0, Landroid/app/NotificationManager;

    .line 387
    .line 388
    if-eqz v1, :cond_2

    .line 389
    .line 390
    check-cast v0, Landroid/app/NotificationManager;

    .line 391
    .line 392
    goto :goto_1

    .line 393
    :cond_2
    move-object v0, v15

    .line 394
    :goto_1
    if-eqz v0, :cond_3

    .line 395
    .line 396
    iget v1, v2, Landroidx/fragment/app/Fragment;->z:I

    .line 397
    .line 398
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 399
    .line 400
    .line 401
    :cond_3
    invoke-virtual {v2}, La/o890;->M0()La/p990;

    .line 402
    .line 403
    .line 404
    move-result-object v12

    .line 405
    iget-object v0, v12, La/p990;->p:La/mne;

    .line 406
    .line 407
    iget-object v1, v12, La/p990;->B:Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    const/4 v4, 0x5

    .line 414
    if-lez v1, :cond_4

    .line 415
    .line 416
    invoke-virtual {v12}, La/p990;->x()V

    .line 417
    .line 418
    .line 419
    goto :goto_2

    .line 420
    :cond_4
    iget-wide v13, v12, La/p990;->F:J

    .line 421
    .line 422
    const-wide/16 v5, 0x0

    .line 423
    .line 424
    cmp-long v1, v13, v5

    .line 425
    .line 426
    if-nez v1, :cond_5

    .line 427
    .line 428
    invoke-static {v12}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 429
    .line 430
    .line 431
    move-result-object v16

    .line 432
    iget-object v1, v0, La/mne;->b:La/dvj;

    .line 433
    .line 434
    new-instance v5, La/r890;

    .line 435
    .line 436
    invoke-direct {v5, v12, v4}, La/r890;-><init>(La/p990;B)V

    .line 437
    .line 438
    .line 439
    new-instance v6, La/f990;

    .line 440
    .line 441
    invoke-direct {v6, v12, v15, v10}, La/f990;-><init>(La/p990;La/yje;B)V

    .line 442
    .line 443
    .line 444
    const/16 v21, 0xa

    .line 445
    .line 446
    const/16 v18, 0x0

    .line 447
    .line 448
    move-object/from16 v19, v1

    .line 449
    .line 450
    move-object/from16 v17, v5

    .line 451
    .line 452
    move-object/from16 v20, v6

    .line 453
    .line 454
    invoke-static/range {v16 .. v21}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 455
    .line 456
    .line 457
    goto :goto_2

    .line 458
    :cond_5
    invoke-static {v12}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 459
    .line 460
    .line 461
    move-result-object v22

    .line 462
    iget-object v1, v0, La/mne;->b:La/dvj;

    .line 463
    .line 464
    new-instance v5, La/r890;

    .line 465
    .line 466
    move/from16 v6, p1

    .line 467
    .line 468
    invoke-direct {v5, v12, v6}, La/r890;-><init>(La/p990;B)V

    .line 469
    .line 470
    .line 471
    new-instance v26, La/wn10;

    .line 472
    .line 473
    const/16 v16, 0x6

    .line 474
    .line 475
    move-object/from16 v11, v26

    .line 476
    .line 477
    invoke-direct/range {v11 .. v16}, La/wn10;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 478
    .line 479
    .line 480
    const/16 v27, 0xa

    .line 481
    .line 482
    const/16 v24, 0x0

    .line 483
    .line 484
    move-object/from16 v25, v1

    .line 485
    .line 486
    move-object/from16 v23, v5

    .line 487
    .line 488
    invoke-static/range {v22 .. v27}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 489
    .line 490
    .line 491
    :goto_2
    invoke-static {v12}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 492
    .line 493
    .line 494
    move-result-object v16

    .line 495
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 496
    .line 497
    new-instance v1, La/r890;

    .line 498
    .line 499
    invoke-direct {v1, v12, v8}, La/r890;-><init>(La/p990;B)V

    .line 500
    .line 501
    .line 502
    new-instance v5, La/f990;

    .line 503
    .line 504
    invoke-direct {v5, v12, v15, v8}, La/f990;-><init>(La/p990;La/yje;B)V

    .line 505
    .line 506
    .line 507
    const/16 v21, 0xa

    .line 508
    .line 509
    const/16 v18, 0x0

    .line 510
    .line 511
    move-object/from16 v19, v0

    .line 512
    .line 513
    move-object/from16 v17, v1

    .line 514
    .line 515
    move-object/from16 v20, v5

    .line 516
    .line 517
    invoke-static/range {v16 .. v21}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 518
    .line 519
    .line 520
    iget-object v0, v12, La/p990;->z:La/p7m0;

    .line 521
    .line 522
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    move-object v5, v1

    .line 527
    check-cast v5, La/d990;

    .line 528
    .line 529
    sget-object v5, La/d990;->a:La/d990;

    .line 530
    .line 531
    invoke-virtual {v0, v1, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    if-eqz v1, :cond_6

    .line 536
    .line 537
    invoke-virtual {v12}, La/p990;->C()V

    .line 538
    .line 539
    .line 540
    new-instance v0, La/l890;

    .line 541
    .line 542
    const/4 v6, 0x3

    .line 543
    invoke-direct {v0, v2, v6}, La/l890;-><init>(La/o890;B)V

    .line 544
    .line 545
    .line 546
    const-string v1, "VERIFICATION_LISTENER"

    .line 547
    .line 548
    invoke-static {v2, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 549
    .line 550
    .line 551
    new-instance v0, La/l890;

    .line 552
    .line 553
    invoke-direct {v0, v2, v3}, La/l890;-><init>(La/o890;B)V

    .line 554
    .line 555
    .line 556
    const-string v1, "BONUS_LISTENER"

    .line 557
    .line 558
    invoke-static {v2, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 559
    .line 560
    .line 561
    new-instance v0, La/l890;

    .line 562
    .line 563
    invoke-direct {v0, v2, v4}, La/l890;-><init>(La/o890;B)V

    .line 564
    .line 565
    .line 566
    invoke-static {v2, v1, v0}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 567
    .line 568
    .line 569
    new-instance v0, La/l890;

    .line 570
    .line 571
    invoke-direct {v0, v2, v10}, La/l890;-><init>(La/o890;B)V

    .line 572
    .line 573
    .line 574
    const-string v1, "REQUEST_OPEN_SETTINGS_DIALOG_KEY"

    .line 575
    .line 576
    invoke-static {v2, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 577
    .line 578
    .line 579
    new-instance v0, La/l890;

    .line 580
    .line 581
    const/16 v1, 0x9

    .line 582
    .line 583
    invoke-direct {v0, v2, v1}, La/l890;-><init>(La/o890;B)V

    .line 584
    .line 585
    .line 586
    const-string v1, "ERROR_DIALOG_LISTENER"

    .line 587
    .line 588
    invoke-static {v2, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v2}, La/o890;->K0()La/s2r;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    iget-object v0, v0, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 596
    .line 597
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    if-eqz v0, :cond_8

    .line 602
    .line 603
    new-instance v1, La/l3v0;

    .line 604
    .line 605
    new-instance v3, La/l890;

    .line 606
    .line 607
    const/4 v4, 0x6

    .line 608
    invoke-direct {v3, v2, v4}, La/l890;-><init>(La/o890;B)V

    .line 609
    .line 610
    .line 611
    new-instance v4, La/m890;

    .line 612
    .line 613
    invoke-direct {v4, v2, v8}, La/m890;-><init>(La/o890;B)V

    .line 614
    .line 615
    .line 616
    iget-object v2, v2, La/o890;->Q1:La/z7z;

    .line 617
    .line 618
    if-eqz v2, :cond_7

    .line 619
    .line 620
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    check-cast v2, La/vby;

    .line 628
    .line 629
    invoke-direct {v1, v3, v4, v2}, La/l3v0;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/vby;)V

    .line 630
    .line 631
    .line 632
    const-string v2, "paymentWebHandler"

    .line 633
    .line 634
    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    return-void

    .line 638
    :cond_7
    const-string v0, "json"

    .line 639
    .line 640
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    throw v15

    .line 644
    :cond_8
    return-void
.end method

.method public final C0()V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/p890;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/p890;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/p890;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v12, La/k790;

    .line 62
    .line 63
    const/4 v2, 0x3

    .line 64
    sget-object v4, La/o890;->g2:[La/iiy;

    .line 65
    .line 66
    aget-object v2, v4, v2

    .line 67
    .line 68
    iget-object v5, v0, La/o890;->d2:La/cgx0;

    .line 69
    .line 70
    invoke-virtual {v5, v0, v2}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    iget-object v5, v0, La/o890;->b2:La/r34;

    .line 79
    .line 80
    const/4 v6, 0x1

    .line 81
    aget-object v7, v4, v6

    .line 82
    .line 83
    invoke-virtual {v5, v0, v7}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 88
    .line 89
    .line 90
    move-result-wide v7

    .line 91
    const/4 v5, 0x2

    .line 92
    aget-object v4, v4, v5

    .line 93
    .line 94
    iget-object v5, v0, La/o890;->c2:La/phf0;

    .line 95
    .line 96
    invoke-virtual {v5, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-direct {v12, v4, v7, v8, v2}, La/k790;-><init>(Ljava/lang/String;JZ)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v5, v3, La/p890;->h:La/zas0;

    .line 107
    .line 108
    iget-object v8, v3, La/p890;->i:La/d1p;

    .line 109
    .line 110
    move v1, v6

    .line 111
    iget-object v6, v3, La/p890;->o:La/zx10;

    .line 112
    .line 113
    iget-object v13, v3, La/p890;->a:La/hse0;

    .line 114
    .line 115
    iget-object v7, v3, La/p890;->e:La/pv00;

    .line 116
    .line 117
    iget-object v14, v3, La/p890;->b:La/rou;

    .line 118
    .line 119
    iget-object v15, v3, La/p890;->c:La/buo0;

    .line 120
    .line 121
    iget-object v10, v3, La/p890;->d:La/lp4;

    .line 122
    .line 123
    iget-object v9, v3, La/p890;->p:La/wsf0;

    .line 124
    .line 125
    iget-object v2, v3, La/p890;->f:La/vd1;

    .line 126
    .line 127
    iget-object v4, v3, La/p890;->g:La/duj;

    .line 128
    .line 129
    iget-object v11, v3, La/p890;->j:La/mne;

    .line 130
    .line 131
    move-object/from16 v18, v11

    .line 132
    .line 133
    iget-object v11, v3, La/p890;->q:La/ii;

    .line 134
    .line 135
    iget-object v1, v3, La/p890;->k:La/ctf0;

    .line 136
    .line 137
    move-object/from16 v19, v1

    .line 138
    .line 139
    iget-object v1, v3, La/p890;->l:La/pru;

    .line 140
    .line 141
    move-object/from16 v20, v1

    .line 142
    .line 143
    iget-object v1, v3, La/p890;->m:La/sa10;

    .line 144
    .line 145
    move-object/from16 v21, v1

    .line 146
    .line 147
    iget-object v1, v3, La/p890;->n:La/zri;

    .line 148
    .line 149
    move-object/from16 v22, v1

    .line 150
    .line 151
    iget-object v1, v3, La/p890;->r:La/ntu;

    .line 152
    .line 153
    move-object/from16 v23, v1

    .line 154
    .line 155
    iget-object v1, v3, La/p890;->s:La/grj;

    .line 156
    .line 157
    move-object/from16 v24, v1

    .line 158
    .line 159
    iget-object v1, v3, La/p890;->t:La/wdk0;

    .line 160
    .line 161
    move-object/from16 v25, v1

    .line 162
    .line 163
    iget-object v1, v3, La/p890;->u:La/i7u0;

    .line 164
    .line 165
    move-object/from16 v26, v1

    .line 166
    .line 167
    iget-object v1, v3, La/p890;->v:La/gst0;

    .line 168
    .line 169
    move-object/from16 v27, v1

    .line 170
    .line 171
    iget-object v1, v3, La/p890;->w:La/vby;

    .line 172
    .line 173
    iget-object v3, v3, La/p890;->x:La/ony;

    .line 174
    .line 175
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-object/from16 v17, v4

    .line 203
    .line 204
    new-instance v4, La/o9i;

    .line 205
    .line 206
    move-object/from16 v28, v1

    .line 207
    .line 208
    move-object/from16 v16, v2

    .line 209
    .line 210
    move-object/from16 v29, v3

    .line 211
    .line 212
    const/4 v1, 0x1

    .line 213
    invoke-direct/range {v4 .. v29}, La/o9i;-><init>(La/zas0;La/zx10;La/pv00;La/d1p;La/wsf0;La/lp4;La/ii;La/k790;La/hse0;La/rou;La/buo0;La/vd1;La/duj;La/mne;La/ctf0;La/pru;La/sa10;La/zri;La/ntu;La/grj;La/wdk0;La/i7u0;La/gst0;La/vby;La/ony;)V

    .line 214
    .line 215
    .line 216
    iget-object v2, v4, La/o9i;->m:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v2, La/n5d0;

    .line 219
    .line 220
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    check-cast v2, La/nni;

    .line 225
    .line 226
    iput-object v2, v0, La/o890;->L1:La/nni;

    .line 227
    .line 228
    iget-object v2, v4, La/o9i;->n:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v2, La/n5d0;

    .line 231
    .line 232
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    check-cast v2, La/oni;

    .line 237
    .line 238
    iput-object v2, v0, La/o890;->M1:La/oni;

    .line 239
    .line 240
    iget-object v2, v4, La/o9i;->A:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v2, La/zix;

    .line 243
    .line 244
    invoke-static {v2}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    iput-object v2, v0, La/o890;->N1:La/z7z;

    .line 249
    .line 250
    iget-object v2, v4, La/o9i;->l:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v2, La/omi;

    .line 253
    .line 254
    invoke-static {v2}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    iput-object v2, v0, La/o890;->O1:La/z7z;

    .line 259
    .line 260
    iget-object v2, v4, La/o9i;->C:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v2, La/zix;

    .line 263
    .line 264
    invoke-static {v2}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    iput-object v2, v0, La/o890;->P1:La/z7z;

    .line 269
    .line 270
    iget-object v2, v4, La/o9i;->D:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v2, La/zix;

    .line 273
    .line 274
    invoke-static {v2}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    iput-object v2, v0, La/o890;->Q1:La/z7z;

    .line 279
    .line 280
    new-instance v2, La/ojj;

    .line 281
    .line 282
    iget-object v3, v4, La/o9i;->v:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v3, La/ony;

    .line 285
    .line 286
    invoke-direct {v2, v3, v1}, La/ojj;-><init>(La/ony;B)V

    .line 287
    .line 288
    .line 289
    iput-object v2, v0, La/o890;->R1:La/ojj;

    .line 290
    .line 291
    return-void

    .line 292
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 293
    .line 294
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    return-void
.end method

.method public final D0()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, La/o890;->M0()La/p990;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, La/p990;->z:La/p7m0;

    .line 10
    .line 11
    new-instance v2, La/hi70;

    .line 12
    .line 13
    const/4 v8, 0x4

    .line 14
    const/16 v9, 0xe

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    const-class v5, La/o890;

    .line 18
    .line 19
    const-string v6, "handleReloadState"

    .line 20
    .line 21
    const-string v7, "handleReloadState(Lorg/xplatform/feature/office/payment/impl/presentation/PaymentOldViewModel$ReloadState;)V"

    .line 22
    .line 23
    move-object v4, p0

    .line 24
    invoke-direct/range {v2 .. v9}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 25
    .line 26
    .line 27
    sget-object p0, La/lkz;->a:La/lkz;

    .line 28
    .line 29
    invoke-static {v4}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    new-instance v5, La/w090;

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    invoke-direct {v5, v1, p0, v2, v6}, La/w090;-><init>(La/gmq;La/clz;La/hi70;La/yje;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x3

    .line 48
    invoke-static {v3, v6, v6, v5, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, La/o890;->M0()La/p990;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v1, v1, La/p990;->y:La/ol60;

    .line 56
    .line 57
    new-instance v2, La/s980;

    .line 58
    .line 59
    const/16 v3, 0x9

    .line 60
    .line 61
    invoke-direct {v2, v4, v6, v3}, La/s980;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, La/n6r;->x()La/glz;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    new-instance v4, La/w090;

    .line 73
    .line 74
    invoke-direct {v4, v1, v0, v2, v6}, La/w090;-><init>(La/gmq;La/n6r;La/s980;La/yje;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v3, v6, v6, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final G0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/o890;->W1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/qog0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, La/lz9;

    .line 12
    .line 13
    const/4 v2, 0x5

    .line 14
    invoke-direct {v1, v0, p0, v2}, La/lz9;-><init>(La/qog0;Landroidx/fragment/app/Fragment;B)V

    .line 15
    .line 16
    .line 17
    iget-object p0, v0, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, La/qog0;->a()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final H0(Landroid/webkit/PermissionRequest;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/o890;->Y1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/qog0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, La/p790;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v1, v0, p1, p0, v2}, La/p790;-><init>(La/qog0;Landroid/webkit/PermissionRequest;La/yx5;B)V

    .line 15
    .line 16
    .line 17
    iget-object p0, v0, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, La/qog0;->a()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final I0(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/s2r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    iget-object v0, v0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 8
    .line 9
    iget-object v0, v0, La/bcg0;->d:La/acg0;

    .line 10
    .line 11
    iget-object v0, v0, La/acg0;->e:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, La/e1i;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, La/e1i;->setNavigationBarButtonEnable(Z)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object p0, p0, La/s2r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 38
    .line 39
    const-string v0, "REFRESH_BUTTON"

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    xor-int/lit8 p1, p1, 0x1

    .line 48
    .line 49
    invoke-virtual {p0, p1}, La/e1i;->setNavigationBarButtonAlpha(Z)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public final J0()La/z7z;
    .locals 0

    .line 1
    iget-object p0, p0, La/o890;->N1:La/z7z;

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

.method public final K0()La/s2r;
    .locals 2

    .line 1
    sget-object v0, La/o890;->g2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/o890;->U1:La/s0r;

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
    check-cast p0, La/s2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final L0()La/qm90;
    .locals 0

    .line 1
    iget-object p0, p0, La/o890;->V1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

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

.method public final M0()La/p990;
    .locals 0

    .line 1
    iget-object p0, p0, La/o890;->S1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/p990;

    .line 8
    .line 9
    return-object p0
.end method

.method public final N0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/s2r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, La/s2r;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p0, p0, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 26
    .line 27
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final O0(ZLandroid/webkit/PermissionRequest;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/o890;->J0()La/z7z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/ii;

    .line 10
    .line 11
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 12
    .line 13
    const v2, 0x7f1303fb

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const v3, 0x7f130f39

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const v4, 0x7f130f34

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const v5, 0x7f13032f

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    sget-object v10, La/n12;->a:La/n12;

    .line 45
    .line 46
    const/4 v11, 0x0

    .line 47
    const/16 v12, 0x5d0

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    const-string v7, "CAMERA_PERMISSION_DIALOG"

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x0

    .line 54
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, La/lf2;

    .line 68
    .line 69
    const/16 v1, 0xb

    .line 70
    .line 71
    invoke-direct {v0, p1, p0, p2, v1}, La/lf2;-><init>(ZLjava/lang/Object;Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    const-string p1, "CAMERA_PERMISSION_DIALOG"

    .line 75
    .line 76
    invoke-static {p0, p1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final P0(Z)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/o890;->J0()La/z7z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/ii;

    .line 10
    .line 11
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 12
    .line 13
    const v2, 0x7f1303fb

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const v3, 0x7f130f3d

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const v4, 0x7f130f34

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const v5, 0x7f13032f

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    sget-object v10, La/n12;->a:La/n12;

    .line 45
    .line 46
    const/4 v11, 0x0

    .line 47
    const/16 v12, 0x5d0

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    const-string v7, "PERMISSION_DIALOG"

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x0

    .line 54
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, La/rd7;

    .line 68
    .line 69
    const/16 v1, 0xd

    .line 70
    .line 71
    invoke-direct {v0, p1, p0, v1}, La/rd7;-><init>(ZLjava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    const-string p1, "PERMISSION_DIALOG"

    .line 75
    .line 76
    invoke-static {p0, p1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final Q0(ILa/sek0;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, La/o890;->P1:La/z7z;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-object v2, v1

    .line 19
    check-cast v2, La/wdk0;

    .line 20
    .line 21
    new-instance v3, La/xdk0;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    const/16 v10, 0x7c

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v8, 0x0

    .line 36
    move-object v4, p2

    .line 37
    invoke-direct/range {v3 .. v10}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 38
    .line 39
    .line 40
    const/16 v9, 0x3fc

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v7, 0x0

    .line 44
    move-object v4, p0

    .line 45
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const-string p0, "snackbarManager"

    .line 50
    .line 51
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    throw p0

    .line 56
    :cond_1
    return-void
.end method

.method public final R0(Landroid/content/Intent;)V
    .locals 9

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    iget-object p1, p0, La/o890;->P1:La/z7z;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, La/z7z;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/wdk0;

    .line 18
    .line 19
    new-instance v1, La/xdk0;

    .line 20
    .line 21
    sget-object v2, La/rek0;->b:La/rek0;

    .line 22
    .line 23
    const p1, 0x7f130a82

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    const/16 v8, 0x7c

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 40
    .line 41
    .line 42
    const/16 v7, 0x3fc

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    move-object v2, p0

    .line 47
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    const-string p0, "snackbarManager"

    .line 52
    .line 53
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    throw p0
.end method

.method public final U(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->U(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x22b

    .line 5
    .line 6
    if-ne p1, p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, La/o890;->G0()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/16 p2, 0x213

    .line 13
    .line 14
    if-ne p1, p2, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, La/o890;->a2:Landroid/webkit/PermissionRequest;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, La/o890;->H0(Landroid/webkit/PermissionRequest;)V

    .line 21
    .line 22
    .line 23
    :cond_1
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
    invoke-virtual {p0}, La/o890;->L0()La/qm90;

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
    invoke-virtual {p0}, La/o890;->L0()La/qm90;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, La/k890;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {v0, p0, v1}, La/k890;-><init>(La/o890;B)V

    .line 51
    .line 52
    .line 53
    new-instance v1, La/k890;

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    invoke-direct {v1, p0, v2}, La/k890;-><init>(La/o890;B)V

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
    invoke-virtual {p0}, La/o890;->L0()La/qm90;

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
    .locals 2

    .line 1
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 22
    .line 23
    iput-object v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->o:Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    iput-object v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->p:Lkotlin/jvm/functions/Function0;

    .line 26
    .line 27
    iput-object v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->q:Lkotlin/jvm/functions/Function0;

    .line 28
    .line 29
    iput-object v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->r:Lkotlin/jvm/functions/Function0;

    .line 30
    .line 31
    iput-object v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->s:La/xdr;

    .line 32
    .line 33
    iput-object v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->t:Lkotlin/jvm/functions/Function0;

    .line 34
    .line 35
    iput-object v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->u:Lkotlin/jvm/functions/Function1;

    .line 36
    .line 37
    iput-object v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->v:Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    iput-object v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->w:Lkotlin/jvm/functions/Function1;

    .line 40
    .line 41
    iput-object v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->m:Lkotlin/jvm/functions/Function1;

    .line 42
    .line 43
    iput-object v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->n:Lkotlin/jvm/functions/Function1;

    .line 44
    .line 45
    iput-object v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->x:Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 52
    .line 53
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a()V

    .line 54
    .line 55
    .line 56
    invoke-super {p0}, La/yx5;->Z()V

    .line 57
    .line 58
    .line 59
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
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p0, p0, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->e()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->f()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {v0}, La/hxm0;->n(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-super {p0}, La/yx5;->e0()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final f0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/o890;->L0()La/qm90;

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
    iget-object p0, p0, La/o890;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
