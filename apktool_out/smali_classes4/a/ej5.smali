.class public final La/ej5;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ej5;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/bj5",
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
.field public static final V1:La/bj5;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/l9i;

.field public M1:La/rek0;

.field public N1:La/ii;

.field public O1:La/wdk0;

.field public P1:Ljava/lang/String;

.field public final Q1:La/kiu0;

.field public final R1:La/s0r;

.field public final S1:La/n0o0;

.field public final U1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ej5;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/feature/balancemanagement/impl/databinding/FragmentBalanceManagementBinding;"

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
    sput-object v1, La/ej5;->W1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/bj5;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/ej5;->V1:La/bj5;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d01fb

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
    iput-object v0, p0, La/ej5;->K1:La/hnm0;

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    iput-object v0, p0, La/ej5;->P1:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, La/zi5;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, v1}, La/zi5;-><init>(La/ej5;B)V

    .line 19
    .line 20
    .line 21
    new-instance v1, La/pp4;

    .line 22
    .line 23
    const/16 v2, 0x11

    .line 24
    .line 25
    invoke-direct {v1, p0, v2}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    sget-object v2, La/wez;->b:La/wez;

    .line 29
    .line 30
    new-instance v3, La/pp4;

    .line 31
    .line 32
    const/16 v4, 0x12

    .line 33
    .line 34
    invoke-direct {v3, v1, v4}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-class v2, La/dk5;

    .line 42
    .line 43
    sget-object v3, La/sre0;->a:La/tre0;

    .line 44
    .line 45
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-instance v3, La/qw4;

    .line 50
    .line 51
    const/4 v4, 0x6

    .line 52
    invoke-direct {v3, v1, v4}, La/qw4;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    new-instance v4, La/qw4;

    .line 56
    .line 57
    const/4 v5, 0x7

    .line 58
    invoke-direct {v4, v1, v5}, La/qw4;-><init>(La/a8z;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, La/ej5;->Q1:La/kiu0;

    .line 66
    .line 67
    sget-object v0, La/cj5;->a:La/cj5;

    .line 68
    .line 69
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, La/ej5;->R1:La/s0r;

    .line 74
    .line 75
    new-instance v0, La/zi5;

    .line 76
    .line 77
    const/4 v1, 0x2

    .line 78
    invoke-direct {v0, p0, v1}, La/zi5;-><init>(La/ej5;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, La/ej5;->S1:La/n0o0;

    .line 86
    .line 87
    new-instance v0, La/zi5;

    .line 88
    .line 89
    const/4 v1, 0x3

    .line 90
    invoke-direct {v0, p0, v1}, La/zi5;-><init>(La/ej5;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, p0, La/ej5;->U1:La/n0o0;

    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/ej5;->G0()La/gyq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/gyq;->c:Lorg/xplatform/uikit/components/account_info/DsAccountInfo;

    .line 6
    .line 7
    const v0, 0x7f08081b

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setButtonIconRes(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/ej5;->G0()La/gyq;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p1, p1, La/gyq;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 18
    .line 19
    iget-object v0, p0, La/ej5;->S1:La/n0o0;

    .line 20
    .line 21
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, La/ub3;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lcom/google/android/material/appbar/AppBarLayout;->a(La/ub3;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, La/ej5;->G0()La/gyq;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p1, p1, La/gyq;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 35
    .line 36
    iget-object v0, p0, La/ej5;->U1:La/n0o0;

    .line 37
    .line 38
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/ub3;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lcom/google/android/material/appbar/AppBarLayout;->a(La/ub3;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, La/ej5;->G0()La/gyq;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p1, p1, La/gyq;->g:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 52
    .line 53
    new-instance v0, La/zi5;

    .line 54
    .line 55
    const/4 v1, 0x4

    .line 56
    invoke-direct {v0, p0, v1}, La/zi5;-><init>(La/ej5;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, La/ej5;->G0()La/gyq;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object p1, p1, La/gyq;->c:Lorg/xplatform/uikit/components/account_info/DsAccountInfo;

    .line 67
    .line 68
    new-instance v0, La/q10;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    invoke-direct {v0, p0, v1}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, La/ej5;->G0()La/gyq;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object p1, p1, La/gyq;->h:Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionButton;

    .line 82
    .line 83
    new-instance v0, La/aj5;

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    invoke-direct {v0, p0, v2}, La/aj5;-><init>(La/ej5;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, La/ej5;->G0()La/gyq;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iget-object p1, p1, La/gyq;->i:Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionButton;

    .line 97
    .line 98
    new-instance v0, La/aj5;

    .line 99
    .line 100
    invoke-direct {v0, p0, v1}, La/aj5;-><init>(La/ej5;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {p1, v0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    const-class v0, La/ej5;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v2, p1, Landroidx/fragment/app/e;->c:La/pmi;

    .line 120
    .line 121
    invoke-virtual {v2}, La/pmi;->p()Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-static {v2}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_1

    .line 138
    .line 139
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    move-object v5, v4

    .line 144
    check-cast v5, Landroidx/fragment/app/Fragment;

    .line 145
    .line 146
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->O()Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-nez v6, :cond_0

    .line 151
    .line 152
    iget-object v5, v5, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-nez v5, :cond_0

    .line 159
    .line 160
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_1
    invoke-virtual {p1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-eqz v4, :cond_2

    .line 173
    .line 174
    if-eqz v2, :cond_2

    .line 175
    .line 176
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->S()Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-ne v4, v1, :cond_2

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_2
    new-instance v4, La/zb5;

    .line 184
    .line 185
    invoke-direct {v4, p1}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 186
    .line 187
    .line 188
    const p1, 0x7f010053

    .line 189
    .line 190
    .line 191
    const v5, 0x7f010054

    .line 192
    .line 193
    .line 194
    const v6, 0x7f010051

    .line 195
    .line 196
    .line 197
    const v7, 0x7f010052

    .line 198
    .line 199
    .line 200
    invoke-virtual {v4, v6, v7, p1, v5}, La/zb5;->p(IIII)V

    .line 201
    .line 202
    .line 203
    if-eqz v2, :cond_4

    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->S()Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_3

    .line 210
    .line 211
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->O()Z

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    if-eqz p1, :cond_5

    .line 216
    .line 217
    :cond_3
    sget-object p1, La/lkz;->e:La/lkz;

    .line 218
    .line 219
    invoke-virtual {v4, v2, p1}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4, v2}, La/zb5;->r(Landroidx/fragment/app/Fragment;)V

    .line 223
    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_4
    iget-object p1, p0, La/ej5;->M1:La/rek0;

    .line 227
    .line 228
    if-eqz p1, :cond_7

    .line 229
    .line 230
    sget-object p1, La/ii5;->O1:La/gfk0;

    .line 231
    .line 232
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    new-instance p1, La/ii5;

    .line 236
    .line 237
    invoke-direct {p1}, La/ii5;-><init>()V

    .line 238
    .line 239
    .line 240
    const v2, 0x7f0a060f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v4, v2, p1, v0, v1}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 244
    .line 245
    .line 246
    :cond_5
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_6

    .line 255
    .line 256
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 261
    .line 262
    sget-object v1, La/lkz;->d:La/lkz;

    .line 263
    .line 264
    invoke-virtual {v4, v0, v1}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4, v0}, La/zb5;->m(Landroidx/fragment/app/Fragment;)V

    .line 268
    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_6
    invoke-virtual {v4}, La/zb5;->h()V

    .line 272
    .line 273
    .line 274
    :goto_3
    new-instance p1, La/zi5;

    .line 275
    .line 276
    const/4 v0, 0x5

    .line 277
    invoke-direct {p1, p0, v0}, La/zi5;-><init>(La/ej5;B)V

    .line 278
    .line 279
    .line 280
    const-string v0, "PAYMENT_ERROR_DIALOG_REQUEST_KEY"

    .line 281
    .line 282
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_7
    const-string p0, "contentFactory"

    .line 287
    .line 288
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    const/4 p0, 0x0

    .line 292
    throw p0
.end method

.method public final C0()V
    .locals 5

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
    const-class v1, La/ti5;

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
    instance-of v3, v0, La/ti5;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    move-object v0, v2

    .line 50
    :cond_2
    check-cast v0, La/ti5;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iget-object v1, p0, La/ej5;->P1:Ljava/lang/String;

    .line 55
    .line 56
    const/4 v3, 0x7

    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-static {v0, v2, v4, v1, v3}, La/ti5;->a(La/ti5;La/l4b;ZLjava/lang/String;I)La/n9i;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, v0, La/n9i;->J:La/n5d0;

    .line 63
    .line 64
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La/l9i;

    .line 69
    .line 70
    iput-object v1, p0, La/ej5;->L1:La/l9i;

    .line 71
    .line 72
    new-instance v1, La/rek0;

    .line 73
    .line 74
    const/16 v2, 0x1d

    .line 75
    .line 76
    invoke-direct {v1, v2}, La/rek0;-><init>(B)V

    .line 77
    .line 78
    .line 79
    iput-object v1, p0, La/ej5;->M1:La/rek0;

    .line 80
    .line 81
    iget-object v1, v0, La/n9i;->F:La/ii;

    .line 82
    .line 83
    iput-object v1, p0, La/ej5;->N1:La/ii;

    .line 84
    .line 85
    iget-object v0, v0, La/n9i;->G:La/wdk0;

    .line 86
    .line 87
    iput-object v0, p0, La/ej5;->O1:La/wdk0;

    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 91
    .line 92
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final D0()V
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p0}, La/ej5;->H0()La/dk5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/dk5;->c0:La/p7m0;

    .line 6
    .line 7
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 8
    .line 9
    .line 10
    move-result-object v8

    .line 11
    new-instance v0, La/vp3;

    .line 12
    .line 13
    const/4 v6, 0x4

    .line 14
    const/16 v7, 0x10

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const-class v3, La/ej5;

    .line 18
    .line 19
    const-string v4, "applyAppBarState"

    .line 20
    .line 21
    const-string v5, "applyAppBarState(Lorg/xplatform/feature/balance_management_old/impl/presentation/states/BalanceManagementAppBarUiState;)V"

    .line 22
    .line 23
    move-object/from16 v2, p0

    .line 24
    .line 25
    invoke-direct/range {v0 .. v7}, La/vp3;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 26
    .line 27
    .line 28
    move-object v7, v3

    .line 29
    sget-object v1, La/lkz;->a:La/lkz;

    .line 30
    .line 31
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    new-instance v1, La/me5;

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v14, 0x0

    .line 47
    move-object v4, v0

    .line 48
    move-object v2, v8

    .line 49
    move-object v5, v14

    .line 50
    invoke-direct/range {v1 .. v6}, La/me5;-><init>(La/xae0;La/clz;La/vp3;La/yje;B)V

    .line 51
    .line 52
    .line 53
    const/4 v8, 0x3

    .line 54
    invoke-static {v9, v14, v14, v1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 55
    .line 56
    .line 57
    invoke-virtual/range {p0 .. p0}, La/ej5;->H0()La/dk5;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v0, v0, La/dk5;->e0:La/p7m0;

    .line 62
    .line 63
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    new-instance v0, La/vp3;

    .line 68
    .line 69
    const/4 v6, 0x4

    .line 70
    move-object v3, v7

    .line 71
    const/16 v7, 0x11

    .line 72
    .line 73
    const/4 v1, 0x2

    .line 74
    const-string v4, "applyPaymentButtonsState"

    .line 75
    .line 76
    const-string v5, "applyPaymentButtonsState(Lorg/xplatform/feature/balance_management_old/impl/presentation/states/BalanceManagementPaymentButtonsUiState;)V"

    .line 77
    .line 78
    move-object/from16 v2, p0

    .line 79
    .line 80
    invoke-direct/range {v0 .. v7}, La/vp3;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 81
    .line 82
    .line 83
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 84
    .line 85
    .line 86
    move-result-object v12

    .line 87
    invoke-interface {v12}, La/clz;->x()La/glz;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v10, La/me5;

    .line 96
    .line 97
    const/4 v15, 0x0

    .line 98
    move-object v13, v0

    .line 99
    invoke-direct/range {v10 .. v15}, La/me5;-><init>(La/xae0;La/clz;La/vp3;La/yje;C)V

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v14, v14, v10, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {p0 .. p0}, La/ej5;->H0()La/dk5;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v0, v0, La/dk5;->f0:La/p7m0;

    .line 110
    .line 111
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    new-instance v0, La/vp3;

    .line 116
    .line 117
    const/16 v7, 0x12

    .line 118
    .line 119
    const/4 v1, 0x2

    .line 120
    const-string v4, "applyShimmersState"

    .line 121
    .line 122
    const-string v5, "applyShimmersState(Lorg/xplatform/feature/balance_management_old/impl/presentation/states/BalanceManagementShimmersState;)V"

    .line 123
    .line 124
    invoke-direct/range {v0 .. v7}, La/vp3;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 125
    .line 126
    .line 127
    invoke-static {v2}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 128
    .line 129
    .line 130
    move-result-object v12

    .line 131
    invoke-interface {v12}, La/clz;->x()La/glz;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    new-instance v10, La/me5;

    .line 140
    .line 141
    move-object v13, v0

    .line 142
    invoke-direct/range {v10 .. v15}, La/me5;-><init>(La/xae0;La/clz;La/vp3;La/yje;I)V

    .line 143
    .line 144
    .line 145
    invoke-static {v1, v14, v14, v10, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, La/ej5;->H0()La/dk5;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iget-object v0, v0, La/dk5;->d0:La/p7m0;

    .line 153
    .line 154
    new-instance v1, La/dj5;

    .line 155
    .line 156
    const/4 v3, 0x1

    .line 157
    invoke-direct {v1, v2, v14, v3}, La/dj5;-><init>(La/ej5;La/yje;B)V

    .line 158
    .line 159
    .line 160
    invoke-static {v2}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    new-instance v5, La/me5;

    .line 173
    .line 174
    invoke-direct {v5, v0, v3, v1, v14}, La/me5;-><init>(La/gmq;La/clz;La/dj5;La/yje;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v4, v14, v14, v5, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, La/ej5;->H0()La/dk5;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    iget-object v11, v0, La/dk5;->b0:La/ol60;

    .line 185
    .line 186
    new-instance v13, La/dj5;

    .line 187
    .line 188
    const/4 v0, 0x2

    .line 189
    invoke-direct {v13, v2, v14, v0}, La/dj5;-><init>(La/ej5;La/yje;B)V

    .line 190
    .line 191
    .line 192
    invoke-static {v2}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    invoke-interface {v12}, La/clz;->x()La/glz;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    new-instance v10, La/me5;

    .line 205
    .line 206
    invoke-direct/range {v10 .. v15}, La/me5;-><init>(La/gmq;La/clz;La/dj5;La/yje;B)V

    .line 207
    .line 208
    .line 209
    invoke-static {v0, v14, v14, v10, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, La/ej5;->H0()La/dk5;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iget-object v0, v0, La/dk5;->Z:La/p7m0;

    .line 217
    .line 218
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    new-instance v1, La/qv3;

    .line 223
    .line 224
    const/16 v3, 0x8

    .line 225
    .line 226
    invoke-direct {v1, v2, v14, v3}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 227
    .line 228
    .line 229
    invoke-static {v2}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    new-instance v5, La/me5;

    .line 242
    .line 243
    invoke-direct {v5, v0, v3, v1, v14}, La/me5;-><init>(La/xae0;La/clz;La/qv3;La/yje;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v4, v14, v14, v5, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, La/ej5;->H0()La/dk5;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    iget-object v0, v0, La/dk5;->a0:La/p7m0;

    .line 254
    .line 255
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    new-instance v1, La/dj5;

    .line 260
    .line 261
    const/4 v3, 0x0

    .line 262
    invoke-direct {v1, v2, v14, v3}, La/dj5;-><init>(La/ej5;La/yje;B)V

    .line 263
    .line 264
    .line 265
    invoke-static {v2}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    new-instance v4, La/me5;

    .line 278
    .line 279
    invoke-direct {v4, v0, v2, v1, v14}, La/me5;-><init>(La/xae0;La/clz;La/dj5;La/yje;)V

    .line 280
    .line 281
    .line 282
    invoke-static {v3, v14, v14, v4, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 283
    .line 284
    .line 285
    return-void
.end method

.method public final G0()La/gyq;
    .locals 2

    .line 1
    sget-object v0, La/ej5;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ej5;->R1:La/s0r;

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
    check-cast p0, La/gyq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/dk5;
    .locals 0

    .line 1
    iget-object p0, p0, La/ej5;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/dk5;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ej5;->G0()La/gyq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/gyq;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 6
    .line 7
    iget-object v1, p0, La/ej5;->S1:La/n0o0;

    .line 8
    .line 9
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/ub3;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/AppBarLayout;->f(La/ub3;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/ej5;->G0()La/gyq;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/gyq;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 23
    .line 24
    iget-object v1, p0, La/ej5;->U1:La/n0o0;

    .line 25
    .line 26
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, La/ub3;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/AppBarLayout;->f(La/ub3;)V

    .line 33
    .line 34
    .line 35
    invoke-super {p0}, La/yx5;->Z()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ej5;->H0()La/dk5;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, La/dk5;->x()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ej5;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
