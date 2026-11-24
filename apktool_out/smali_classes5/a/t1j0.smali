.class public final La/t1j0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/t1j0;",
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
.field public static final Y1:La/zie0;

.field public static final synthetic Z1:[La/iiy;


# instance fields
.field public K1:La/rqj0;

.field public L1:La/ii;

.field public M1:La/gl5;

.field public N1:La/ux00;

.field public O1:La/nwd;

.field public P1:La/wdk0;

.field public Q1:La/fiu0;

.field public final R1:La/kiu0;

.field public final S1:La/s0r;

.field public U1:La/qgd;

.field public V1:La/xi70;

.field public W1:La/zav;

.field public final X1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/t1j0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/settings/impl/databinding/FragmentSettingsBinding;"

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
    sput-object v1, La/t1j0;->Z1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/zie0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/t1j0;->Y1:La/zie0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d02ce

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/r1j0;

    .line 8
    .line 9
    const/4 v1, 0x7

    .line 10
    invoke-direct {v0, p0, v1}, La/r1j0;-><init>(La/t1j0;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/l9i0;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-direct {v1, p0, v2}, La/l9i0;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    sget-object v2, La/wez;->b:La/wez;

    .line 21
    .line 22
    new-instance v3, La/l9i0;

    .line 23
    .line 24
    const/16 v4, 0xb

    .line 25
    .line 26
    invoke-direct {v3, v1, v4}, La/l9i0;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-class v2, Lorg/xplatform/settings/impl/presentation/a;

    .line 34
    .line 35
    sget-object v3, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v3, La/s9i0;

    .line 42
    .line 43
    const/16 v4, 0x8

    .line 44
    .line 45
    invoke-direct {v3, v1, v4}, La/s9i0;-><init>(La/a8z;B)V

    .line 46
    .line 47
    .line 48
    new-instance v5, La/s9i0;

    .line 49
    .line 50
    const/16 v6, 0x9

    .line 51
    .line 52
    invoke-direct {v5, v1, v6}, La/s9i0;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v2, v3, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/t1j0;->R1:La/kiu0;

    .line 60
    .line 61
    sget-object v0, La/s1j0;->a:La/s1j0;

    .line 62
    .line 63
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/t1j0;->S1:La/s0r;

    .line 68
    .line 69
    new-instance v0, La/r1j0;

    .line 70
    .line 71
    invoke-direct {v0, p0, v4}, La/r1j0;-><init>(La/t1j0;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p0, La/t1j0;->X1:La/n0o0;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/t1j0;->H0()La/s4r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/s4r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/t1j0;->H0()La/s4r;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p1, p1, La/s4r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    iget-object v1, p0, La/t1j0;->X1:La/n0o0;

    .line 18
    .line 19
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, La/dzi0;

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, La/t1j0;->H0()La/s4r;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p1, p1, La/s4r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 33
    .line 34
    new-instance v1, La/qkv;

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    invoke-direct {v1, v2}, La/qkv;-><init>(B)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, La/t1j0;->H0()La/s4r;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object p1, p1, La/s4r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-static {p1, v1}, La/knm0;->i(Landroid/view/View;Z)V

    .line 51
    .line 52
    .line 53
    new-instance p1, La/r1j0;

    .line 54
    .line 55
    const/16 v3, 0x9

    .line 56
    .line 57
    invoke-direct {p1, p0, v3}, La/r1j0;-><init>(La/t1j0;B)V

    .line 58
    .line 59
    .line 60
    const-string v3, "REQUEST_OPEN_SITE_DIALOG_KEY"

    .line 61
    .line 62
    invoke-static {p0, v3, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, La/q1j0;

    .line 66
    .line 67
    invoke-direct {p1, p0, v1}, La/q1j0;-><init>(La/t1j0;B)V

    .line 68
    .line 69
    .line 70
    const-string v3, "DEV_PASS_REQUEST_KEY"

    .line 71
    .line 72
    invoke-static {p0, v3, p1}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 73
    .line 74
    .line 75
    new-instance p1, La/r1j0;

    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    invoke-direct {p1, p0, v3}, La/r1j0;-><init>(La/t1j0;B)V

    .line 79
    .line 80
    .line 81
    const-string v4, "REQUEST_SHOW_PAYOUT_ERROR_DIALOG_KEY"

    .line 82
    .line 83
    invoke-static {p0, v4, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 84
    .line 85
    .line 86
    new-instance p1, La/r1j0;

    .line 87
    .line 88
    invoke-direct {p1, p0, v2}, La/r1j0;-><init>(La/t1j0;B)V

    .line 89
    .line 90
    .line 91
    const-string v4, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY"

    .line 92
    .line 93
    invoke-static {p0, v4, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 94
    .line 95
    .line 96
    new-instance p1, La/r1j0;

    .line 97
    .line 98
    const/4 v5, 0x3

    .line 99
    invoke-direct {p1, p0, v5}, La/r1j0;-><init>(La/t1j0;B)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0, v4, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 103
    .line 104
    .line 105
    new-instance p1, La/r1j0;

    .line 106
    .line 107
    const/4 v4, 0x4

    .line 108
    invoke-direct {p1, p0, v4}, La/r1j0;-><init>(La/t1j0;B)V

    .line 109
    .line 110
    .line 111
    const-string v6, "REQUEST_DELETE_ACCOUNT"

    .line 112
    .line 113
    invoke-static {p0, v6, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 114
    .line 115
    .line 116
    new-instance p1, La/r1j0;

    .line 117
    .line 118
    const/4 v6, 0x5

    .line 119
    invoke-direct {p1, p0, v6}, La/r1j0;-><init>(La/t1j0;B)V

    .line 120
    .line 121
    .line 122
    const-string v6, "REQUEST_SHOW_BONUSES"

    .line 123
    .line 124
    invoke-static {p0, v6, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 125
    .line 126
    .line 127
    new-instance p1, La/r1j0;

    .line 128
    .line 129
    const/4 v7, 0x6

    .line 130
    invoke-direct {p1, p0, v7}, La/r1j0;-><init>(La/t1j0;B)V

    .line 131
    .line 132
    .line 133
    invoke-static {p0, v6, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, La/t1j0;->M1:La/gl5;

    .line 137
    .line 138
    if-eqz p1, :cond_7

    .line 139
    .line 140
    new-instance p1, La/r1j0;

    .line 141
    .line 142
    invoke-direct {p1, p0, v1}, La/r1j0;-><init>(La/t1j0;B)V

    .line 143
    .line 144
    .line 145
    new-instance v0, La/q1j0;

    .line 146
    .line 147
    invoke-direct {v0, p0, v3}, La/q1j0;-><init>(La/t1j0;B)V

    .line 148
    .line 149
    .line 150
    const-string v6, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 151
    .line 152
    invoke-static {p0, v6, p1, v0}, La/gl5;->k(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    new-instance v0, La/p1j0;

    .line 160
    .line 161
    invoke-direct {v0, p0, v3}, La/p1j0;-><init>(La/t1j0;B)V

    .line 162
    .line 163
    .line 164
    const-string v6, "REQUEST_QUICKBET_KEY"

    .line 165
    .line 166
    invoke-virtual {p1, v6, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    new-instance v0, La/p1j0;

    .line 178
    .line 179
    invoke-direct {v0, p0, v5}, La/p1j0;-><init>(La/t1j0;B)V

    .line 180
    .line 181
    .line 182
    const-string v6, "REQUEST_SHOW_LOGOUT_DIALOG"

    .line 183
    .line 184
    invoke-virtual {p1, v6, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 185
    .line 186
    .line 187
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 188
    .line 189
    if-eqz p1, :cond_0

    .line 190
    .line 191
    const-string v0, "KEY_SETTINGS_EVENT"

    .line 192
    .line 193
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    goto :goto_0

    .line 198
    :cond_0
    sget-object p1, La/d6j0;->a:La/d6j0;

    .line 199
    .line 200
    move p1, v1

    .line 201
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 202
    .line 203
    if-eqz v0, :cond_1

    .line 204
    .line 205
    invoke-virtual {v0}, Landroid/os/Bundle;->clear()V

    .line 206
    .line 207
    .line 208
    :cond_1
    invoke-virtual {p0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    sget-object v0, La/d6j0;->g:La/c0o;

    .line 213
    .line 214
    invoke-virtual {v0, p1}, La/c0o;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    check-cast p1, La/d6j0;

    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    if-eq p1, v3, :cond_5

    .line 228
    .line 229
    if-eq p1, v2, :cond_4

    .line 230
    .line 231
    if-eq p1, v5, :cond_3

    .line 232
    .line 233
    if-eq p1, v4, :cond_2

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_2
    invoke-virtual {p0}, Lorg/xplatform/settings/impl/presentation/a;->F()V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_3
    invoke-virtual {p0, v1}, Lorg/xplatform/settings/impl/presentation/a;->E(Z)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_4
    invoke-static {p0}, Lorg/xplatform/settings/impl/presentation/a;->D(Lorg/xplatform/settings/impl/presentation/a;)V

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :cond_5
    iget-object p1, p0, Lorg/xplatform/settings/impl/presentation/a;->d:La/s31;

    .line 249
    .line 250
    invoke-virtual {p1}, La/s31;->s()V

    .line 251
    .line 252
    .line 253
    iget-object p1, p0, Lorg/xplatform/settings/impl/presentation/a;->A:La/s64;

    .line 254
    .line 255
    const-string v0, "language"

    .line 256
    .line 257
    invoke-virtual {p1, v0}, La/s64;->e(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    iget-object p1, p0, Lorg/xplatform/settings/impl/presentation/a;->k:La/i1w0;

    .line 261
    .line 262
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    sget-object v2, La/jgc;->INSTANCE:La/jgc;

    .line 267
    .line 268
    new-instance v3, La/kej0;

    .line 269
    .line 270
    const/16 v4, 0x8

    .line 271
    .line 272
    invoke-direct {v3, p0, v4}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    new-instance p0, La/onu0;

    .line 279
    .line 280
    const/16 v4, 0xb

    .line 281
    .line 282
    invoke-direct {p0, v2, v3, v4}, La/onu0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 283
    .line 284
    .line 285
    new-instance v3, La/c1w0;

    .line 286
    .line 287
    invoke-direct {v3, v2, p0}, La/c1w0;-><init>(La/lwv0;La/onu0;)V

    .line 288
    .line 289
    .line 290
    new-instance p0, La/c8d;

    .line 291
    .line 292
    sget-object v2, La/y7d;->a:La/v7d;

    .line 293
    .line 294
    invoke-direct {p0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 295
    .line 296
    .line 297
    invoke-static {v0, p0, p1, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    :goto_1
    move-object v0, p0

    .line 302
    check-cast v0, La/paw;

    .line 303
    .line 304
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    if-eqz v1, :cond_6

    .line 309
    .line 310
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    check-cast v0, La/oe50;

    .line 315
    .line 316
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 317
    .line 318
    .line 319
    goto :goto_1

    .line 320
    :cond_6
    :goto_2
    return-void

    .line 321
    :cond_7
    const-string p0, "captchaDialogDelegate"

    .line 322
    .line 323
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
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
    const-class v1, La/t1j0;

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
    iput-object v1, p0, La/t1j0;->K1:La/rqj0;

    .line 72
    .line 73
    iget-object v1, v0, La/uti;->b:La/ii;

    .line 74
    .line 75
    iput-object v1, p0, La/t1j0;->L1:La/ii;

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
    iput-object v1, p0, La/t1j0;->M1:La/gl5;

    .line 85
    .line 86
    new-instance v1, La/ux00;

    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v1, p0, La/t1j0;->N1:La/ux00;

    .line 92
    .line 93
    iget-object v1, v0, La/uti;->c:La/nwd;

    .line 94
    .line 95
    iput-object v1, p0, La/t1j0;->O1:La/nwd;

    .line 96
    .line 97
    iget-object v1, v0, La/uti;->d:La/wdk0;

    .line 98
    .line 99
    iput-object v1, p0, La/t1j0;->P1:La/wdk0;

    .line 100
    .line 101
    invoke-virtual {v0}, La/uti;->a()La/fiu0;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iput-object v1, p0, La/t1j0;->Q1:La/fiu0;

    .line 106
    .line 107
    iget-object v1, v0, La/uti;->i:La/qgd;

    .line 108
    .line 109
    iput-object v1, p0, La/t1j0;->U1:La/qgd;

    .line 110
    .line 111
    iget-object v1, v0, La/uti;->Z:La/rmd0;

    .line 112
    .line 113
    invoke-interface {v1}, La/rmd0;->f()La/xi70;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iput-object v1, p0, La/t1j0;->V1:La/xi70;

    .line 118
    .line 119
    iget-object v0, v0, La/uti;->v0:La/ok50;

    .line 120
    .line 121
    iget-object v0, v0, La/ok50;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, La/vqc;

    .line 124
    .line 125
    invoke-virtual {v0}, La/vqc;->f()La/zav;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iput-object v0, p0, La/t1j0;->W1:La/zav;

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

.method public final D0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->W0:La/ol60;

    .line 6
    .line 7
    new-instance v1, La/bai0;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v1, p0, v3, v2}, La/bai0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    sget-object v2, La/lkz;->a:La/lkz;

    .line 16
    .line 17
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    new-instance v5, La/r7i0;

    .line 30
    .line 31
    invoke-direct {v5, v0, v2, v1, v3}, La/r7i0;-><init>(La/gmq;La/clz;La/bai0;La/yje;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/t1j0;->H0()La/s4r;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v1, v1, La/s4r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 43
    .line 44
    invoke-virtual {p0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-object v4, v2, Lorg/xplatform/settings/impl/presentation/a;->X0:La/p7m0;

    .line 49
    .line 50
    new-instance v5, La/omi0;

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    invoke-direct {v5, v4, v2, v6}, La/omi0;-><init>(La/gmq;Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    new-instance v4, La/xej0;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    invoke-direct {v4, v2, v3, v6}, La/xej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 60
    .line 61
    .line 62
    new-instance v2, La/fnq;

    .line 63
    .line 64
    invoke-direct {v2, v5, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 65
    .line 66
    .line 67
    sget-object v4, La/lkz;->a:La/lkz;

    .line 68
    .line 69
    new-instance v4, La/qkb0;

    .line 70
    .line 71
    const/16 v5, 0x11

    .line 72
    .line 73
    invoke-direct {v4, p0, v1, v3, v5}, La/qkb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    new-instance v5, La/r7i0;

    .line 89
    .line 90
    invoke-direct {v5, v2, p0, v4, v3}, La/r7i0;-><init>(La/fnq;La/clz;La/qkb0;La/yje;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final G0()La/ii;
    .locals 0

    .line 1
    iget-object p0, p0, La/t1j0;->L1:La/ii;

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

.method public final H0()La/s4r;
    .locals 2

    .line 1
    sget-object v0, La/t1j0;->Z1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/t1j0;->S1:La/s0r;

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
    check-cast p0, La/s4r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()Lorg/xplatform/settings/impl/presentation/a;
    .locals 0

    .line 1
    iget-object p0, p0, La/t1j0;->R1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/settings/impl/presentation/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public final J0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/t1j0;->G0()La/ii;

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
    new-instance v0, La/p1j0;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {v0, p0, v1}, La/p1j0;-><init>(La/t1j0;B)V

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
    new-instance v0, La/p1j0;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v0, p0, v2}, La/p1j0;-><init>(La/t1j0;B)V

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
    new-instance p1, La/q1j0;

    .line 43
    .line 44
    invoke-direct {p1, p0, v1}, La/q1j0;-><init>(La/t1j0;B)V

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
