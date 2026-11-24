.class public final La/pqc0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/pqc0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/mi70",
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
.field public static final Q1:La/mi70;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public K1:La/fqi;

.field public L1:La/ii;

.field public final M1:Z

.field public final N1:La/a8z;

.field public final O1:La/s0r;

.field public final P1:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/pqc0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/promo/impl/databinding/FragmentPromoShopDetailBinding;"

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
    const-string v3, "promoShopItem"

    .line 16
    .line 17
    const-string v5, "getPromoShopItem()Lorg/xplatform/promo/impl/promocodes/domain/models/PromoShopItemModel;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/pqc0;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/mi70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/pqc0;->Q1:La/mi70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d02a0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/pqc0;->M1:Z

    .line 9
    .line 10
    const-class v0, La/qrc0;

    .line 11
    .line 12
    sget-object v1, La/sre0;->a:La/tre0;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, La/nqc0;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, p0, v2}, La/nqc0;-><init>(La/pqc0;B)V

    .line 22
    .line 23
    .line 24
    const/16 v2, 0xe

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/pqc0;->N1:La/a8z;

    .line 32
    .line 33
    sget-object v0, La/oqc0;->a:La/oqc0;

    .line 34
    .line 35
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, La/pqc0;->O1:La/s0r;

    .line 40
    .line 41
    new-instance v0, La/yzn0;

    .line 42
    .line 43
    const-string v1, "EXTRA_PROMO_SHOP"

    .line 44
    .line 45
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, La/pqc0;->P1:La/yzn0;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/pqc0;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/pqc0;->O1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/g3r;

    .line 16
    .line 17
    iget-object p1, p1, La/g3r;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/owp0;

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/lma0;

    .line 25
    .line 26
    const/16 v2, 0x1d

    .line 27
    .line 28
    invoke-direct {v1, p0, v2}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/ugd;

    .line 32
    .line 33
    const v2, 0x12ca9cbe

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final C0()V
    .locals 25

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
    const-class v2, La/qqc0;

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
    instance-of v4, v1, La/qqc0;

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
    check-cast v3, La/qqc0;

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
    sget-object v2, La/pqc0;->R1:[La/iiy;

    .line 62
    .line 63
    const/4 v4, 0x1

    .line 64
    aget-object v2, v2, v4

    .line 65
    .line 66
    iget-object v5, v0, La/pqc0;->P1:La/yzn0;

    .line 67
    .line 68
    invoke-virtual {v5, v0, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, La/vrc0;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v1, v3, La/qqc0;->a:La/cad;

    .line 78
    .line 79
    iget-object v5, v3, La/qqc0;->b:La/wsf0;

    .line 80
    .line 81
    iget-object v6, v3, La/qqc0;->c:La/fsd;

    .line 82
    .line 83
    iget-object v7, v3, La/qqc0;->d:La/xyt;

    .line 84
    .line 85
    iget-object v8, v3, La/qqc0;->e:La/gst0;

    .line 86
    .line 87
    iget-object v9, v3, La/qqc0;->f:La/ntu;

    .line 88
    .line 89
    iget-object v10, v3, La/qqc0;->g:La/pru;

    .line 90
    .line 91
    iget-object v11, v3, La/qqc0;->h:La/pbt;

    .line 92
    .line 93
    iget-object v12, v3, La/qqc0;->i:La/fhj;

    .line 94
    .line 95
    iget-object v13, v3, La/qqc0;->j:La/b3c0;

    .line 96
    .line 97
    iget-object v14, v3, La/qqc0;->k:La/oeg0;

    .line 98
    .line 99
    iget-object v15, v3, La/qqc0;->l:La/x20;

    .line 100
    .line 101
    iget-object v4, v3, La/qqc0;->m:La/kt2;

    .line 102
    .line 103
    move-object/from16 v16, v6

    .line 104
    .line 105
    iget-object v6, v3, La/qqc0;->n:La/duj;

    .line 106
    .line 107
    iget-object v0, v3, La/qqc0;->o:La/ii;

    .line 108
    .line 109
    move-object/from16 v17, v0

    .line 110
    .line 111
    iget-object v0, v3, La/qqc0;->p:La/ctf0;

    .line 112
    .line 113
    move-object/from16 v18, v0

    .line 114
    .line 115
    iget-object v0, v3, La/qqc0;->q:La/knf0;

    .line 116
    .line 117
    move-object/from16 v19, v6

    .line 118
    .line 119
    iget-object v6, v3, La/qqc0;->r:La/gii0;

    .line 120
    .line 121
    move-object/from16 v20, v4

    .line 122
    .line 123
    iget-object v4, v3, La/qqc0;->s:La/btt0;

    .line 124
    .line 125
    move-object/from16 v21, v15

    .line 126
    .line 127
    iget-object v15, v3, La/qqc0;->t:La/uf3;

    .line 128
    .line 129
    move-object/from16 v22, v15

    .line 130
    .line 131
    iget-object v15, v3, La/qqc0;->u:La/oct;

    .line 132
    .line 133
    move-object/from16 v23, v15

    .line 134
    .line 135
    iget-object v15, v3, La/qqc0;->v:La/m1e;

    .line 136
    .line 137
    move-object/from16 v24, v14

    .line 138
    .line 139
    iget-object v14, v3, La/qqc0;->w:La/g2v;

    .line 140
    .line 141
    iget-object v3, v3, La/qqc0;->x:La/cdu;

    .line 142
    .line 143
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-object/from16 v16, v14

    .line 180
    .line 181
    new-instance v14, La/hbi;

    .line 182
    .line 183
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 184
    .line 185
    .line 186
    iput-object v2, v14, La/hbi;->b:Ljava/lang/Object;

    .line 187
    .line 188
    iput-object v10, v14, La/hbi;->c:Ljava/lang/Object;

    .line 189
    .line 190
    iput-object v5, v14, La/hbi;->d:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object v7, v14, La/hbi;->h:Ljava/lang/Object;

    .line 193
    .line 194
    iput-object v8, v14, La/hbi;->i:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object v0, v14, La/hbi;->j:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object v6, v14, La/hbi;->k:Ljava/lang/Object;

    .line 199
    .line 200
    iput-object v4, v14, La/hbi;->l:Ljava/lang/Object;

    .line 201
    .line 202
    iput-object v9, v14, La/hbi;->m:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v3, v14, La/hbi;->n:Ljava/lang/Object;

    .line 205
    .line 206
    iput-object v12, v14, La/hbi;->o:Ljava/lang/Object;

    .line 207
    .line 208
    iput-object v13, v14, La/hbi;->p:Ljava/lang/Object;

    .line 209
    .line 210
    iput-object v11, v14, La/hbi;->q:Ljava/lang/Object;

    .line 211
    .line 212
    iput-object v15, v14, La/hbi;->r:Ljava/lang/Object;

    .line 213
    .line 214
    iput-object v1, v14, La/hbi;->s:Ljava/lang/Object;

    .line 215
    .line 216
    move-object/from16 v0, v24

    .line 217
    .line 218
    iput-object v0, v14, La/hbi;->t:Ljava/lang/Object;

    .line 219
    .line 220
    move-object/from16 v0, v22

    .line 221
    .line 222
    iput-object v0, v14, La/hbi;->u:Ljava/lang/Object;

    .line 223
    .line 224
    move-object/from16 v0, v23

    .line 225
    .line 226
    iput-object v0, v14, La/hbi;->v:Ljava/lang/Object;

    .line 227
    .line 228
    move-object/from16 v0, v21

    .line 229
    .line 230
    iput-object v0, v14, La/hbi;->w:Ljava/lang/Object;

    .line 231
    .line 232
    move-object/from16 v0, v20

    .line 233
    .line 234
    iput-object v0, v14, La/hbi;->x:Ljava/lang/Object;

    .line 235
    .line 236
    move-object/from16 v0, v16

    .line 237
    .line 238
    iput-object v0, v14, La/hbi;->y:Ljava/lang/Object;

    .line 239
    .line 240
    move-object/from16 v0, v19

    .line 241
    .line 242
    iput-object v0, v14, La/hbi;->z:Ljava/lang/Object;

    .line 243
    .line 244
    move-object/from16 v0, v18

    .line 245
    .line 246
    iput-object v0, v14, La/hbi;->A:Ljava/lang/Object;

    .line 247
    .line 248
    new-instance v0, La/omi;

    .line 249
    .line 250
    const/16 v1, 0x17

    .line 251
    .line 252
    const/4 v2, 0x1

    .line 253
    invoke-direct {v0, v14, v2, v1}, La/omi;-><init>(Ljava/lang/Object;IB)V

    .line 254
    .line 255
    .line 256
    invoke-static {v0}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    iput-object v0, v14, La/hbi;->a:Ljava/lang/Object;

    .line 261
    .line 262
    new-instance v0, La/omi;

    .line 263
    .line 264
    const/4 v2, 0x2

    .line 265
    invoke-direct {v0, v14, v2, v1}, La/omi;-><init>(Ljava/lang/Object;IB)V

    .line 266
    .line 267
    .line 268
    invoke-static {v0}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    iput-object v0, v14, La/hbi;->e:Ljava/lang/Object;

    .line 273
    .line 274
    new-instance v0, La/omi;

    .line 275
    .line 276
    const/4 v2, 0x3

    .line 277
    invoke-direct {v0, v14, v2, v1}, La/omi;-><init>(Ljava/lang/Object;IB)V

    .line 278
    .line 279
    .line 280
    invoke-static {v0}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    iput-object v0, v14, La/hbi;->f:Ljava/lang/Object;

    .line 285
    .line 286
    new-instance v0, La/omi;

    .line 287
    .line 288
    const/4 v2, 0x0

    .line 289
    invoke-direct {v0, v14, v2, v1}, La/omi;-><init>(Ljava/lang/Object;IB)V

    .line 290
    .line 291
    .line 292
    invoke-static {v0}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    iput-object v0, v14, La/hbi;->g:Ljava/lang/Object;

    .line 297
    .line 298
    iget-object v0, v14, La/hbi;->g:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v0, La/n5d0;

    .line 301
    .line 302
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    check-cast v0, La/fqi;

    .line 307
    .line 308
    move-object/from16 v1, p0

    .line 309
    .line 310
    iput-object v0, v1, La/pqc0;->K1:La/fqi;

    .line 311
    .line 312
    move-object/from16 v0, v17

    .line 313
    .line 314
    iput-object v0, v1, La/pqc0;->L1:La/ii;

    .line 315
    .line 316
    return-void

    .line 317
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 318
    .line 319
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    return-void
.end method

.method public final G0()La/ii;
    .locals 0

    .line 1
    iget-object p0, p0, La/pqc0;->L1:La/ii;

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

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/pqc0;->M1:Z

    .line 2
    .line 3
    return p0
.end method
