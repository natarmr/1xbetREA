.class public final synthetic La/g3d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:F

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;FLa/zo50;La/xdr;La/xdr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    const/4 p10, 0x2

    iput-byte p10, p0, La/g3d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/g3d;->b:La/mm40;

    iput p2, p0, La/g3d;->c:F

    iput-object p3, p0, La/g3d;->d:Ljava/lang/Object;

    iput-object p4, p0, La/g3d;->h:Ljava/lang/Object;

    iput-object p5, p0, La/g3d;->i:Ljava/lang/Object;

    iput-object p6, p0, La/g3d;->e:Ljava/lang/Object;

    iput-object p7, p0, La/g3d;->f:Ljava/lang/Object;

    iput-object p8, p0, La/g3d;->g:Ljava/lang/Object;

    iput-object p9, p0, La/g3d;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/f3d;La/j73;La/qkq;FLa/ugd;La/xdr;La/xdr;La/xdr;I)V
    .locals 0

    .line 2
    const/4 p10, 0x0

    iput-byte p10, p0, La/g3d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/g3d;->b:La/mm40;

    iput-object p2, p0, La/g3d;->d:Ljava/lang/Object;

    iput-object p3, p0, La/g3d;->e:Ljava/lang/Object;

    iput-object p4, p0, La/g3d;->f:Ljava/lang/Object;

    iput p5, p0, La/g3d;->c:F

    iput-object p6, p0, La/g3d;->g:Ljava/lang/Object;

    iput-object p7, p0, La/g3d;->h:Ljava/lang/Object;

    iput-object p8, p0, La/g3d;->i:Ljava/lang/Object;

    iput-object p9, p0, La/g3d;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/xcz;Lkotlin/jvm/functions/Function1;FLkotlin/jvm/functions/Function1;La/xak;La/nek;La/l7m0;La/l7m0;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput-byte v0, p0, La/g3d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/g3d;->b:La/mm40;

    iput-object p2, p0, La/g3d;->d:Ljava/lang/Object;

    iput-object p3, p0, La/g3d;->e:Ljava/lang/Object;

    iput p4, p0, La/g3d;->c:F

    iput-object p5, p0, La/g3d;->f:Ljava/lang/Object;

    iput-object p6, p0, La/g3d;->g:Ljava/lang/Object;

    iput-object p7, p0, La/g3d;->h:Ljava/lang/Object;

    iput-object p8, p0, La/g3d;->i:Ljava/lang/Object;

    iput-object p9, p0, La/g3d;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g3d;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/g3d;->j:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, v0, La/g3d;->g:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, v0, La/g3d;->f:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, v0, La/g3d;->e:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v7, v0, La/g3d;->i:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v8, v0, La/g3d;->h:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v9, v0, La/g3d;->d:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object v12, v9

    .line 24
    check-cast v12, La/zo50;

    .line 25
    .line 26
    move-object v13, v8

    .line 27
    check-cast v13, La/xdr;

    .line 28
    .line 29
    move-object v14, v7

    .line 30
    check-cast v14, La/xdr;

    .line 31
    .line 32
    move-object v15, v6

    .line 33
    check-cast v15, Lkotlin/jvm/functions/Function2;

    .line 34
    .line 35
    move-object/from16 v16, v5

    .line 36
    .line 37
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 38
    .line 39
    move-object/from16 v17, v4

    .line 40
    .line 41
    check-cast v17, Lkotlin/jvm/functions/Function1;

    .line 42
    .line 43
    move-object/from16 v18, v3

    .line 44
    .line 45
    check-cast v18, Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    move-object/from16 v19, p1

    .line 48
    .line 49
    check-cast v19, La/fet;

    .line 50
    .line 51
    move-object/from16 v1, p2

    .line 52
    .line 53
    check-cast v1, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v2}, La/x8x;->L(I)I

    .line 59
    .line 60
    .line 61
    move-result v20

    .line 62
    iget-object v10, v0, La/g3d;->b:La/mm40;

    .line 63
    .line 64
    iget v11, v0, La/g3d;->c:F

    .line 65
    .line 66
    invoke-static/range {v10 .. v20}, La/lv00;->M(La/mm40;FLa/zo50;La/xdr;La/xdr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_0
    check-cast v9, La/xcz;

    .line 73
    .line 74
    move-object v11, v6

    .line 75
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 76
    .line 77
    move-object v12, v5

    .line 78
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 79
    .line 80
    check-cast v4, La/xak;

    .line 81
    .line 82
    check-cast v8, La/nek;

    .line 83
    .line 84
    move-object v14, v7

    .line 85
    check-cast v14, La/l7m0;

    .line 86
    .line 87
    move-object v15, v3

    .line 88
    check-cast v15, La/l7m0;

    .line 89
    .line 90
    move-object/from16 v1, p1

    .line 91
    .line 92
    check-cast v1, La/fet;

    .line 93
    .line 94
    move-object/from16 v3, p2

    .line 95
    .line 96
    check-cast v3, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    and-int/lit8 v5, v3, 0x3

    .line 103
    .line 104
    const/4 v6, 0x2

    .line 105
    if-eq v5, v6, :cond_0

    .line 106
    .line 107
    move v5, v2

    .line 108
    goto :goto_0

    .line 109
    :cond_0
    const/4 v5, 0x0

    .line 110
    :goto_0
    and-int/2addr v3, v2

    .line 111
    invoke-virtual {v1, v3, v5}, La/fet;->U(IZ)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_3

    .line 116
    .line 117
    sget-object v3, La/qmk;->a:La/zcl;

    .line 118
    .line 119
    const/high16 v3, 0x41e00000    # 28.0f

    .line 120
    .line 121
    const/4 v5, 0x5

    .line 122
    const/4 v6, 0x0

    .line 123
    const/high16 v7, 0x41000000    # 8.0f

    .line 124
    .line 125
    invoke-static {v6, v7, v6, v3, v5}, La/s5x0;->u(FFFFI)La/lh80;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    new-instance v5, La/qw3;

    .line 130
    .line 131
    new-instance v6, La/jf4;

    .line 132
    .line 133
    const/16 v7, 0xe

    .line 134
    .line 135
    invoke-direct {v6, v7}, La/jf4;-><init>(B)V

    .line 136
    .line 137
    .line 138
    const/high16 v7, 0x41400000    # 12.0f

    .line 139
    .line 140
    invoke-direct {v5, v7, v2, v6}, La/qw3;-><init>(FZLa/rw3;)V

    .line 141
    .line 142
    .line 143
    iget v13, v0, La/g3d;->c:F

    .line 144
    .line 145
    invoke-virtual {v1, v13}, La/fet;->d(F)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    or-int/2addr v2, v6

    .line 154
    invoke-virtual {v1, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    or-int/2addr v2, v6

    .line 159
    invoke-virtual {v1, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    or-int/2addr v2, v6

    .line 164
    invoke-virtual {v1, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    or-int/2addr v2, v6

    .line 169
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    if-nez v2, :cond_1

    .line 174
    .line 175
    sget-object v2, La/ukd;->a:La/cl5;

    .line 176
    .line 177
    if-ne v6, v2, :cond_2

    .line 178
    .line 179
    :cond_1
    new-instance v10, La/y6s;

    .line 180
    .line 181
    move-object/from16 v16, v4

    .line 182
    .line 183
    move-object/from16 v17, v8

    .line 184
    .line 185
    invoke-direct/range {v10 .. v17}, La/y6s;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLa/l7m0;La/l7m0;La/xak;La/nek;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    move-object v6, v10

    .line 192
    :cond_2
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 193
    .line 194
    const/4 v11, 0x0

    .line 195
    const/16 v12, 0x1e8

    .line 196
    .line 197
    move-object v10, v1

    .line 198
    iget-object v1, v0, La/g3d;->b:La/mm40;

    .line 199
    .line 200
    move-object v4, v5

    .line 201
    const/4 v5, 0x0

    .line 202
    move-object v2, v9

    .line 203
    move-object v9, v6

    .line 204
    const/4 v6, 0x0

    .line 205
    const/4 v7, 0x0

    .line 206
    const/4 v8, 0x0

    .line 207
    invoke-static/range {v1 .. v12}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 208
    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_3
    move-object v10, v1

    .line 212
    invoke-virtual {v10}, La/fet;->X()V

    .line 213
    .line 214
    .line 215
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object v0

    .line 218
    :pswitch_1
    move-object v2, v9

    .line 219
    check-cast v2, La/f3d;

    .line 220
    .line 221
    check-cast v6, La/j73;

    .line 222
    .line 223
    check-cast v5, La/qkq;

    .line 224
    .line 225
    check-cast v4, La/ugd;

    .line 226
    .line 227
    check-cast v8, La/xdr;

    .line 228
    .line 229
    check-cast v7, La/xdr;

    .line 230
    .line 231
    move-object v9, v3

    .line 232
    check-cast v9, La/xdr;

    .line 233
    .line 234
    move-object/from16 v10, p1

    .line 235
    .line 236
    check-cast v10, La/fet;

    .line 237
    .line 238
    move-object/from16 v1, p2

    .line 239
    .line 240
    check-cast v1, Ljava/lang/Integer;

    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    const v1, 0x6d80001

    .line 246
    .line 247
    .line 248
    invoke-static {v1}, La/x8x;->L(I)I

    .line 249
    .line 250
    .line 251
    move-result v11

    .line 252
    iget-object v1, v0, La/g3d;->b:La/mm40;

    .line 253
    .line 254
    iget v0, v0, La/g3d;->c:F

    .line 255
    .line 256
    move-object v3, v8

    .line 257
    move-object v8, v7

    .line 258
    move-object v7, v3

    .line 259
    move-object v3, v6

    .line 260
    move-object v6, v4

    .line 261
    move-object v4, v5

    .line 262
    move v5, v0

    .line 263
    invoke-static/range {v1 .. v11}, La/wzb;->a(La/mm40;La/f3d;La/j73;La/qkq;FLa/ugd;La/xdr;La/xdr;La/xdr;La/fet;I)V

    .line 264
    .line 265
    .line 266
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    return-object v0

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
