.class public final La/ca70;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ca70;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/htz",
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
.field public static final U1:La/htz;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public K1:La/smi;

.field public L1:La/z7z;

.field public M1:La/z7z;

.field public N1:La/z7z;

.field public O1:La/kl5;

.field public P1:La/z7z;

.field public final Q1:La/s0r;

.field public final R1:La/a8z;

.field public final S1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ca70;

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
    sput-object v1, La/ca70;->V1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/htz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/ca70;->U1:La/htz;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/ba70;->a:La/ba70;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/ca70;->Q1:La/s0r;

    .line 14
    .line 15
    const-class v0, La/xd70;

    .line 16
    .line 17
    sget-object v1, La/sre0;->a:La/tre0;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, La/w970;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, p0, v2}, La/w970;-><init>(La/ca70;B)V

    .line 27
    .line 28
    .line 29
    const/16 v2, 0xe

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/ca70;->R1:La/a8z;

    .line 37
    .line 38
    new-instance v0, La/w970;

    .line 39
    .line 40
    const/16 v1, 0x8

    .line 41
    .line 42
    invoke-direct {v0, p0, v1}, La/w970;-><init>(La/ca70;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, La/ca70;->S1:La/n0o0;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "OneXGamesWebGameDisableDemoBottomDialog.TAG"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object v0, La/t670;->a:La/t670;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    new-instance p1, La/w970;

    .line 25
    .line 26
    const/16 v0, 0xd

    .line 27
    .line 28
    invoke-direct {p1, p0, v0}, La/w970;-><init>(La/ca70;B)V

    .line 29
    .line 30
    .line 31
    const-string v0, "CHANGE_ACCOUNT_TO_PRIMARY_DIALOG"

    .line 32
    .line 33
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, La/w970;

    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    invoke-direct {p1, p0, v0}, La/w970;-><init>(La/ca70;B)V

    .line 40
    .line 41
    .line 42
    const-string v1, "DEMO_BONUS_DIALOG"

    .line 43
    .line 44
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 45
    .line 46
    .line 47
    new-instance p1, La/w970;

    .line 48
    .line 49
    const/4 v2, 0x3

    .line 50
    invoke-direct {p1, p0, v2}, La/w970;-><init>(La/ca70;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v1, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v1, La/x970;

    .line 61
    .line 62
    invoke-direct {v1, p0, v2}, La/x970;-><init>(La/ca70;B)V

    .line 63
    .line 64
    .line 65
    const-string v2, "DEMO_DISABLE_DIALOG"

    .line 66
    .line 67
    invoke-virtual {p1, v2, p0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 68
    .line 69
    .line 70
    new-instance p1, La/w970;

    .line 71
    .line 72
    const/4 v1, 0x1

    .line 73
    invoke-direct {p1, p0, v1}, La/w970;-><init>(La/ca70;B)V

    .line 74
    .line 75
    .line 76
    const-string v2, "DEMO_REPLENISH_DIALOG"

    .line 77
    .line 78
    invoke-static {p0, v2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v2, La/x970;

    .line 86
    .line 87
    const/4 v3, 0x4

    .line 88
    invoke-direct {v2, p0, v3}, La/x970;-><init>(La/ca70;B)V

    .line 89
    .line 90
    .line 91
    const-string v4, "DEMO_UNAUTHORIZED_DIALOG"

    .line 92
    .line 93
    invoke-virtual {p1, v4, p0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 94
    .line 95
    .line 96
    new-instance p1, La/w970;

    .line 97
    .line 98
    const/16 v2, 0x9

    .line 99
    .line 100
    invoke-direct {p1, p0, v2}, La/w970;-><init>(La/ca70;B)V

    .line 101
    .line 102
    .line 103
    const-string v2, "DEMO_UNAVAILABLE_DIALOG"

    .line 104
    .line 105
    invoke-static {p0, v2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    new-instance v4, La/x970;

    .line 113
    .line 114
    invoke-direct {v4, p0, v0}, La/x970;-><init>(La/ca70;B)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v2, p0, v4}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 118
    .line 119
    .line 120
    new-instance p1, La/w970;

    .line 121
    .line 122
    invoke-direct {p1, p0, v3}, La/w970;-><init>(La/ca70;B)V

    .line 123
    .line 124
    .line 125
    const-string v0, "RESTART_PAGE_DIALOG"

    .line 126
    .line 127
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 128
    .line 129
    .line 130
    new-instance p1, La/w970;

    .line 131
    .line 132
    const/4 v2, 0x5

    .line 133
    invoke-direct {p1, p0, v2}, La/w970;-><init>(La/ca70;B)V

    .line 134
    .line 135
    .line 136
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    new-instance v0, La/x970;

    .line 144
    .line 145
    invoke-direct {v0, p0, v1}, La/x970;-><init>(La/ca70;B)V

    .line 146
    .line 147
    .line 148
    const-string v2, "UNFINISHED_GAME_DIALOG"

    .line 149
    .line 150
    invoke-virtual {p1, v2, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    new-instance v0, La/x970;

    .line 158
    .line 159
    const/4 v2, 0x0

    .line 160
    invoke-direct {v0, p0, v2}, La/x970;-><init>(La/ca70;B)V

    .line 161
    .line 162
    .line 163
    const-string v3, "BALANCE_SELECTOR"

    .line 164
    .line 165
    invoke-virtual {p1, v3, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 166
    .line 167
    .line 168
    new-instance p1, La/w970;

    .line 169
    .line 170
    const/16 v0, 0xe

    .line 171
    .line 172
    invoke-direct {p1, p0, v0}, La/w970;-><init>(La/ca70;B)V

    .line 173
    .line 174
    .line 175
    const-string v0, "SECTION_BALANCE_EXPIRED_DIALOG"

    .line 176
    .line 177
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 178
    .line 179
    .line 180
    new-instance p1, La/w970;

    .line 181
    .line 182
    const/4 v0, 0x6

    .line 183
    invoke-direct {p1, p0, v0}, La/w970;-><init>(La/ca70;B)V

    .line 184
    .line 185
    .line 186
    const-string v0, "BONUS_BALANCE_UNAVAILABLE_DIALOG"

    .line 187
    .line 188
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 189
    .line 190
    .line 191
    new-instance p1, La/w970;

    .line 192
    .line 193
    const/4 v0, 0x7

    .line 194
    invoke-direct {p1, p0, v0}, La/w970;-><init>(La/ca70;B)V

    .line 195
    .line 196
    .line 197
    const-string v0, "SPORT_BONUS_BALANCE_UNAVAILABLE_DIALOG"

    .line 198
    .line 199
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 200
    .line 201
    .line 202
    new-instance p1, La/w970;

    .line 203
    .line 204
    const/16 v0, 0xc

    .line 205
    .line 206
    invoke-direct {p1, p0, v0}, La/w970;-><init>(La/ca70;B)V

    .line 207
    .line 208
    .line 209
    const-string v0, "TECHNICAL_WORKS_DIALOG_REQUEST_KEY"

    .line 210
    .line 211
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 212
    .line 213
    .line 214
    iget-object p1, p0, La/ca70;->O1:La/kl5;

    .line 215
    .line 216
    if-eqz p1, :cond_1

    .line 217
    .line 218
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    new-instance v0, La/y970;

    .line 223
    .line 224
    invoke-direct {v0, p0, v1}, La/y970;-><init>(La/ca70;B)V

    .line 225
    .line 226
    .line 227
    new-instance v3, La/jk8;

    .line 228
    .line 229
    invoke-direct {v3, v0, v2}, La/jk8;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 230
    .line 231
    .line 232
    const-string v0, "BonusesFeature.BONUS_RESULT_KEY"

    .line 233
    .line 234
    invoke-virtual {p1, v0, p0, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 235
    .line 236
    .line 237
    sget-object p1, La/ca70;->V1:[La/iiy;

    .line 238
    .line 239
    aget-object p1, p1, v2

    .line 240
    .line 241
    iget-object v0, p0, La/ca70;->Q1:La/s0r;

    .line 242
    .line 243
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    check-cast p1, La/aid;

    .line 251
    .line 252
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 253
    .line 254
    new-instance v0, La/y970;

    .line 255
    .line 256
    invoke-direct {v0, p0, v2}, La/y970;-><init>(La/ca70;B)V

    .line 257
    .line 258
    .line 259
    new-instance p0, La/ugd;

    .line 260
    .line 261
    const v2, 0x55143f22

    .line 262
    .line 263
    .line 264
    invoke-direct {p0, v2, v1, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :cond_1
    const-string p0, "bonusesResultListener"

    .line 272
    .line 273
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const/4 p0, 0x0

    .line 277
    throw p0
.end method

.method public final C0()V
    .locals 41

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
    const-class v2, La/d970;

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
    instance-of v4, v1, La/d970;

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
    check-cast v3, La/d970;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v37

    .line 61
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v12, v3, La/d970;->a:La/us00;

    .line 65
    .line 66
    iget-object v5, v3, La/d970;->b:La/wsf0;

    .line 67
    .line 68
    iget-object v6, v3, La/d970;->c:La/peg0;

    .line 69
    .line 70
    iget-object v7, v3, La/d970;->d:La/cad;

    .line 71
    .line 72
    iget-object v8, v3, La/d970;->e:La/iw20;

    .line 73
    .line 74
    iget-object v9, v3, La/d970;->f:La/mct;

    .line 75
    .line 76
    iget-object v10, v3, La/d970;->g:La/d1p;

    .line 77
    .line 78
    iget-object v11, v3, La/d970;->h:La/nr00;

    .line 79
    .line 80
    iget-object v13, v3, La/d970;->i:La/hse0;

    .line 81
    .line 82
    iget-object v14, v3, La/d970;->j:La/btt0;

    .line 83
    .line 84
    iget-object v15, v3, La/d970;->k:La/k9c;

    .line 85
    .line 86
    iget-object v1, v3, La/d970;->l:La/ntu;

    .line 87
    .line 88
    iget-object v2, v3, La/d970;->m:La/ddu;

    .line 89
    .line 90
    iget-object v4, v3, La/d970;->n:La/z4u;

    .line 91
    .line 92
    move-object/from16 v16, v1

    .line 93
    .line 94
    iget-object v1, v3, La/d970;->o:La/bzt;

    .line 95
    .line 96
    move-object/from16 v19, v1

    .line 97
    .line 98
    iget-object v1, v3, La/d970;->p:La/wyu;

    .line 99
    .line 100
    move-object/from16 v20, v1

    .line 101
    .line 102
    iget-object v1, v3, La/d970;->q:La/uyu;

    .line 103
    .line 104
    move-object/from16 v21, v1

    .line 105
    .line 106
    iget-object v1, v3, La/d970;->r:La/knf0;

    .line 107
    .line 108
    move-object/from16 v22, v1

    .line 109
    .line 110
    iget-object v1, v3, La/d970;->s:La/tgk;

    .line 111
    .line 112
    move-object/from16 v23, v1

    .line 113
    .line 114
    iget-object v1, v3, La/d970;->t:La/us3;

    .line 115
    .line 116
    move-object/from16 v24, v1

    .line 117
    .line 118
    iget-object v1, v3, La/d970;->u:La/peg0;

    .line 119
    .line 120
    move-object/from16 v25, v1

    .line 121
    .line 122
    iget-object v1, v3, La/d970;->v:La/pbt;

    .line 123
    .line 124
    move-object/from16 v27, v1

    .line 125
    .line 126
    iget-object v1, v3, La/d970;->w:La/j1q0;

    .line 127
    .line 128
    move-object/from16 v26, v1

    .line 129
    .line 130
    iget-object v1, v3, La/d970;->x:La/gst0;

    .line 131
    .line 132
    move-object/from16 v28, v1

    .line 133
    .line 134
    iget-object v1, v3, La/d970;->y:La/kt2;

    .line 135
    .line 136
    move-object/from16 v29, v1

    .line 137
    .line 138
    iget-object v1, v3, La/d970;->z:La/duj;

    .line 139
    .line 140
    move-object/from16 v30, v1

    .line 141
    .line 142
    iget-object v1, v3, La/d970;->A:La/v88;

    .line 143
    .line 144
    move-object/from16 v31, v1

    .line 145
    .line 146
    iget-object v1, v3, La/d970;->B:La/ouu;

    .line 147
    .line 148
    move-object/from16 v32, v1

    .line 149
    .line 150
    iget-object v1, v3, La/d970;->C:La/ctf0;

    .line 151
    .line 152
    move-object/from16 v33, v1

    .line 153
    .line 154
    iget-object v1, v3, La/d970;->D:La/wdk0;

    .line 155
    .line 156
    move-object/from16 v34, v1

    .line 157
    .line 158
    iget-object v1, v3, La/d970;->E:La/ii;

    .line 159
    .line 160
    move-object/from16 v35, v1

    .line 161
    .line 162
    iget-object v1, v3, La/d970;->F:La/m1e;

    .line 163
    .line 164
    move-object/from16 v36, v1

    .line 165
    .line 166
    iget-object v1, v3, La/d970;->G:La/vwb0;

    .line 167
    .line 168
    move-object/from16 v17, v1

    .line 169
    .line 170
    iget-object v1, v3, La/d970;->H:La/xwb0;

    .line 171
    .line 172
    move-object/from16 v18, v1

    .line 173
    .line 174
    iget-object v1, v3, La/d970;->I:La/vby;

    .line 175
    .line 176
    move-object/from16 v38, v1

    .line 177
    .line 178
    iget-object v1, v3, La/d970;->J:La/oeg0;

    .line 179
    .line 180
    iget-object v3, v3, La/d970;->K:La/kl5;

    .line 181
    .line 182
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    move-object/from16 v18, v4

    .line 243
    .line 244
    new-instance v4, La/tmi;

    .line 245
    .line 246
    move-object/from16 v39, v1

    .line 247
    .line 248
    move-object/from16 v17, v2

    .line 249
    .line 250
    move-object/from16 v40, v3

    .line 251
    .line 252
    invoke-direct/range {v4 .. v40}, La/tmi;-><init>(La/wsf0;La/peg0;La/cad;La/iw20;La/mct;La/d1p;La/nr00;La/us00;La/hse0;La/btt0;La/k9c;La/ntu;La/ddu;La/z4u;La/bzt;La/wyu;La/uyu;La/knf0;La/tgk;La/us3;La/peg0;La/j1q0;La/pbt;La/gst0;La/kt2;La/duj;La/v88;La/ouu;La/ctf0;La/wdk0;La/ii;La/m1e;La/i1w0;La/vby;La/oeg0;La/kl5;)V

    .line 253
    .line 254
    .line 255
    move-object/from16 v1, v40

    .line 256
    .line 257
    iget-object v2, v4, La/tmi;->o0:La/n5d0;

    .line 258
    .line 259
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    check-cast v2, La/smi;

    .line 264
    .line 265
    iput-object v2, v0, La/ca70;->K1:La/smi;

    .line 266
    .line 267
    iget-object v2, v4, La/tmi;->p0:La/zix;

    .line 268
    .line 269
    invoke-static {v2}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    iput-object v2, v0, La/ca70;->L1:La/z7z;

    .line 274
    .line 275
    iget-object v2, v4, La/tmi;->q0:La/zix;

    .line 276
    .line 277
    invoke-static {v2}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    iput-object v2, v0, La/ca70;->M1:La/z7z;

    .line 282
    .line 283
    iget-object v2, v4, La/tmi;->r0:La/omi;

    .line 284
    .line 285
    invoke-static {v2}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    iput-object v2, v0, La/ca70;->N1:La/z7z;

    .line 290
    .line 291
    iput-object v1, v0, La/ca70;->O1:La/kl5;

    .line 292
    .line 293
    iget-object v1, v4, La/tmi;->n0:La/zix;

    .line 294
    .line 295
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    iput-object v1, v0, La/ca70;->P1:La/z7z;

    .line 300
    .line 301
    return-void

    .line 302
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 303
    .line 304
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    return-void
.end method

.method public final G0()La/z7z;
    .locals 0

    .line 1
    iget-object p0, p0, La/ca70;->L1:La/z7z;

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
    iget-object p0, p0, La/ca70;->R1:La/a8z;

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

.method public final I0(Z)V
    .locals 13

    .line 1
    const v0, 0x7f130162

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const v0, 0x7f1317e2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const v0, 0x7f1317e1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    const v0, 0x7f1317e0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v10, La/n12;->b:La/n12;

    .line 33
    .line 34
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 35
    .line 36
    const/4 v11, 0x0

    .line 37
    const/16 v12, 0x5d0

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    const-string v7, "RESTART_PAGE_DIALOG"

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    invoke-virtual {p0}, La/ca70;->G0()La/z7z;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/ii;

    .line 65
    .line 66
    invoke-virtual {p0, v1, v0}, La/ii;->a(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    invoke-virtual {p0}, La/ca70;->G0()La/z7z;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, La/ii;

    .line 79
    .line 80
    invoke-virtual {p0, v1, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 0

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
    iget-object p1, p1, La/zfd;->a:La/glz;

    .line 9
    .line 10
    iget-object p0, p0, La/ca70;->S1:La/n0o0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/aa70;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, La/glz;->a(La/blz;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final Y()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/zfd;->a:La/glz;

    .line 9
    .line 10
    iget-object v1, p0, La/ca70;->S1:La/n0o0;

    .line 11
    .line 12
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, La/aa70;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, La/glz;->f(La/blz;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "OneXGames.BONUS_NOT_USED_RESULT_KEY"

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
