.class public abstract La/osm0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:La/nhf0;


# direct methods
.method public static final a(La/mm40;La/wdp0;La/ugd;La/fet;)V
    .locals 5

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    new-instance v0, La/qw3;

    .line 4
    .line 5
    new-instance v1, La/jf4;

    .line 6
    .line 7
    const/16 v2, 0xe

    .line 8
    .line 9
    invoke-direct {v1, v2}, La/jf4;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/high16 v2, 0x40800000    # 4.0f

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-direct {v0, v2, v3, v1}, La/qw3;-><init>(FZLa/rw3;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, La/gqw0;->k:La/yx7;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v1, p3, v2}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-wide v1, p3, La/fet;->T:J

    .line 26
    .line 27
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {p3}, La/fet;->m()La/bh90;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {p3, p0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object v4, La/mkd;->c0:La/gqw0;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p3}, La/fet;->i0()V

    .line 45
    .line 46
    .line 47
    iget-boolean v4, p3, La/fet;->S:Z

    .line 48
    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 52
    .line 53
    invoke-virtual {p3, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p3}, La/fet;->r0()V

    .line 58
    .line 59
    .line 60
    :goto_0
    sget-object v4, La/gqw0;->x:La/shd;

    .line 61
    .line 62
    invoke-static {p3, v0, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 63
    .line 64
    .line 65
    sget-object v0, La/gqw0;->w:La/shd;

    .line 66
    .line 67
    invoke-static {p3, v2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget-object v1, La/gqw0;->y:La/shd;

    .line 75
    .line 76
    invoke-static {p3, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p3}, La/jpm0;->n(La/fet;)V

    .line 80
    .line 81
    .line 82
    sget-object v0, La/gqw0;->v:La/shd;

    .line 83
    .line 84
    invoke-static {p3, p0, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 85
    .line 86
    .line 87
    const/16 p0, 0x186

    .line 88
    .line 89
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    sget-object v0, La/zhg0;->a:La/zhg0;

    .line 94
    .line 95
    invoke-virtual {p2, v0, p1, p3, p0}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p3, v3}, La/fet;->r(Z)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public static final b(ILa/fet;)V
    .locals 21

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v2, 0x414aadac

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move v4, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v4, v3

    .line 18
    :goto_0
    and-int/lit8 v5, v0, 0x1

    .line 19
    .line 20
    invoke-virtual {v1, v5, v4}, La/fet;->U(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    sget-object v5, La/jm40;->b:La/jm40;

    .line 27
    .line 28
    const/high16 v4, 0x3f800000    # 1.0f

    .line 29
    .line 30
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-static {v1}, La/xfn;->a(La/fet;)La/wfn;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    iget v7, v7, La/wfn;->d:F

    .line 39
    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x0

    .line 42
    invoke-static {v6, v7, v9, v8}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    sget-object v7, La/uc9;->c:La/mw3;

    .line 47
    .line 48
    sget-object v8, La/gqw0;->m:La/xx7;

    .line 49
    .line 50
    invoke-static {v7, v8, v1, v3}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    iget-wide v8, v1, La/fet;->T:J

    .line 55
    .line 56
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-static {v1, v6}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 69
    .line 70
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, La/fet;->i0()V

    .line 74
    .line 75
    .line 76
    iget-boolean v10, v1, La/fet;->S:Z

    .line 77
    .line 78
    if-eqz v10, :cond_1

    .line 79
    .line 80
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 81
    .line 82
    invoke-virtual {v1, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 87
    .line 88
    .line 89
    :goto_1
    sget-object v10, La/gqw0;->x:La/shd;

    .line 90
    .line 91
    invoke-static {v1, v7, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 92
    .line 93
    .line 94
    sget-object v7, La/gqw0;->w:La/shd;

    .line 95
    .line 96
    invoke-static {v1, v9, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    sget-object v8, La/gqw0;->y:La/shd;

    .line 104
    .line 105
    invoke-static {v1, v7, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 109
    .line 110
    .line 111
    sget-object v7, La/gqw0;->v:La/shd;

    .line 112
    .line 113
    invoke-static {v1, v6, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    sget-object v6, La/qmk;->a:La/zcl;

    .line 117
    .line 118
    const/4 v9, 0x0

    .line 119
    const/16 v10, 0xd

    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    const/high16 v7, 0x41800000    # 16.0f

    .line 123
    .line 124
    const/4 v8, 0x0

    .line 125
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    const/high16 v11, 0x41400000    # 12.0f

    .line 130
    .line 131
    invoke-static {v6, v11}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    const/high16 v12, 0x43180000    # 152.0f

    .line 136
    .line 137
    invoke-static {v6, v12}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    sget-object v13, La/qmk;->i:La/zcl;

    .line 142
    .line 143
    sget-object v7, La/vgg0;->a:La/ugg0;

    .line 144
    .line 145
    invoke-static {v13, v13, v13, v13, v6}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    const/4 v14, 0x0

    .line 150
    invoke-static {v14, v1, v3, v2}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-static {v6, v7}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-static {v3, v1, v6}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 159
    .line 160
    .line 161
    const/high16 v6, 0x43600000    # 224.0f

    .line 162
    .line 163
    invoke-static {v5, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-static {v6, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 168
    .line 169
    .line 170
    move-result-object v15

    .line 171
    const/16 v19, 0x0

    .line 172
    .line 173
    const/16 v20, 0xd

    .line 174
    .line 175
    const/16 v16, 0x0

    .line 176
    .line 177
    const/high16 v17, 0x41800000    # 16.0f

    .line 178
    .line 179
    const/16 v18, 0x0

    .line 180
    .line 181
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    invoke-static {v13, v13, v13, v13, v6}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    invoke-static {v14, v1, v3, v2}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    invoke-static {v6, v7}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    invoke-static {v3, v1, v6}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 198
    .line 199
    .line 200
    const/4 v6, 0x0

    .line 201
    const/high16 v7, 0x42000000    # 32.0f

    .line 202
    .line 203
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    invoke-static {v6, v11}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    invoke-static {v6, v12}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-static {v13, v13, v13, v13, v6}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-static {v14, v1, v3, v2}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    invoke-static {v6, v7}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    invoke-static {v3, v1, v6}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 228
    .line 229
    .line 230
    const/high16 v6, 0x43040000    # 132.0f

    .line 231
    .line 232
    invoke-static {v5, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    const/4 v10, 0x0

    .line 241
    const/16 v11, 0xd

    .line 242
    .line 243
    const/4 v7, 0x0

    .line 244
    const/high16 v8, 0x41800000    # 16.0f

    .line 245
    .line 246
    invoke-static/range {v6 .. v11}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-static {v13, v13, v13, v13, v4}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-static {v14, v1, v3, v2}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-static {v4, v5, v1, v3, v2}, La/dw9;->x(La/mm40;La/fqj0;La/fet;IZ)V

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_2
    invoke-virtual {v1}, La/fet;->X()V

    .line 263
    .line 264
    .line 265
    :goto_2
    invoke-virtual {v1}, La/fet;->u()La/yfe0;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    if-eqz v1, :cond_3

    .line 270
    .line 271
    new-instance v2, La/zgp0;

    .line 272
    .line 273
    const/16 v3, 0x11

    .line 274
    .line 275
    invoke-direct {v2, v0, v3}, La/zgp0;-><init>(IB)V

    .line 276
    .line 277
    .line 278
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 279
    .line 280
    :cond_3
    return-void
.end method

.method public static final c(La/mm40;La/hyl;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 12

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, -0x701a5e83

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3, v0}, La/fet;->g0(I)La/fet;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x2

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v2

    .line 20
    :goto_0
    or-int v0, p4, v0

    .line 21
    .line 22
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    const/16 v4, 0x20

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/16 v4, 0x10

    .line 32
    .line 33
    :goto_1
    or-int/2addr v0, v4

    .line 34
    invoke-virtual {p3, p2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/16 v6, 0x100

    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    move v4, v6

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v4, 0x80

    .line 45
    .line 46
    :goto_2
    or-int/2addr v0, v4

    .line 47
    and-int/lit16 v4, v0, 0x93

    .line 48
    .line 49
    const/16 v7, 0x92

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v10, 0x1

    .line 53
    if-eq v4, v7, :cond_3

    .line 54
    .line 55
    move v4, v10

    .line 56
    goto :goto_3

    .line 57
    :cond_3
    move v4, v8

    .line 58
    :goto_3
    and-int/lit8 v7, v0, 0x1

    .line 59
    .line 60
    invoke-virtual {p3, v7, v4}, La/fet;->U(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_7

    .line 65
    .line 66
    and-int/lit16 v4, v0, 0x380

    .line 67
    .line 68
    if-ne v4, v6, :cond_4

    .line 69
    .line 70
    move v8, v10

    .line 71
    :cond_4
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    if-nez v8, :cond_5

    .line 76
    .line 77
    sget-object v6, La/ukd;->a:La/cl5;

    .line 78
    .line 79
    if-ne v4, v6, :cond_6

    .line 80
    .line 81
    :cond_5
    new-instance v4, La/xar0;

    .line 82
    .line 83
    invoke-direct {v4, p2, v2}, La/xar0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_6
    move-object v7, v4

    .line 90
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 91
    .line 92
    and-int/lit8 v10, v0, 0x7e

    .line 93
    .line 94
    const/16 v11, 0x2c

    .line 95
    .line 96
    const/4 v6, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    move-object v4, p0

    .line 99
    move-object v5, p1

    .line 100
    move-object v9, p3

    .line 101
    invoke-static/range {v4 .. v11}, La/ebc;->r(La/mm40;La/hyl;La/vxl;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 102
    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_7
    invoke-virtual {p3}, La/fet;->X()V

    .line 106
    .line 107
    .line 108
    :goto_4
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    if-eqz v6, :cond_8

    .line 113
    .line 114
    new-instance v0, La/cgm0;

    .line 115
    .line 116
    const/16 v5, 0x1b

    .line 117
    .line 118
    move-object v1, p0

    .line 119
    move-object v2, p1

    .line 120
    move-object v3, p2

    .line 121
    move/from16 v4, p4

    .line 122
    .line 123
    invoke-direct/range {v0 .. v5}, La/cgm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 124
    .line 125
    .line 126
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 127
    .line 128
    :cond_8
    return-void
.end method

.method public static final d(IILa/fet;La/mm40;)V
    .locals 11

    .line 1
    const v0, 0x115b8009

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    or-int/lit8 v0, p1, 0x6

    .line 8
    .line 9
    invoke-virtual {p2, p0}, La/fet;->e(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0x20

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v1, 0x10

    .line 19
    .line 20
    :goto_0
    or-int/2addr v0, v1

    .line 21
    and-int/lit8 v1, v0, 0x13

    .line 22
    .line 23
    const/16 v2, 0x12

    .line 24
    .line 25
    if-eq v1, v2, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_1
    and-int/lit8 v2, v0, 0x1

    .line 31
    .line 32
    invoke-virtual {p2, v2, v1}, La/fet;->U(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    shr-int/lit8 p3, v0, 0x3

    .line 39
    .line 40
    and-int/lit8 p3, p3, 0xe

    .line 41
    .line 42
    invoke-static {p0, p3, p2}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object p3, La/qmk;->a:La/zcl;

    .line 47
    .line 48
    const/high16 p3, 0x42580000    # 54.0f

    .line 49
    .line 50
    sget-object v10, La/jm40;->b:La/jm40;

    .line 51
    .line 52
    invoke-static {v10, p3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    const/high16 v1, 0x3f800000    # 1.0f

    .line 57
    .line 58
    invoke-static {p3, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    sget-object v4, La/gqw0;->h1:La/pge;

    .line 63
    .line 64
    const/16 v8, 0x6038

    .line 65
    .line 66
    const/16 v9, 0x68

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    const/4 v3, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    const/4 v6, 0x0

    .line 72
    move-object v7, p2

    .line 73
    invoke-static/range {v0 .. v9}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 74
    .line 75
    .line 76
    move-object p3, v10

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    move-object v7, p2

    .line 79
    invoke-virtual {v7}, La/fet;->X()V

    .line 80
    .line 81
    .line 82
    :goto_2
    invoke-virtual {v7}, La/fet;->u()La/yfe0;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-eqz p2, :cond_3

    .line 87
    .line 88
    new-instance v0, La/v2w;

    .line 89
    .line 90
    const/16 v1, 0x19

    .line 91
    .line 92
    invoke-direct {v0, p3, p0, p1, v1}, La/v2w;-><init>(La/mm40;IIB)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 96
    .line 97
    :cond_3
    return-void
.end method

.method public static final e(FF)J
    .locals 4

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-long v0, p0

    .line 6
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    int-to-long p0, p0

    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    shl-long/2addr v0, v2

    .line 14
    const-wide v2, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr p0, v2

    .line 20
    or-long/2addr p0, v0

    .line 21
    sget v0, La/ils0;->c:I

    .line 22
    .line 23
    return-wide p0
.end method

.method public static final f(La/lc00;La/m9s;La/ctf0;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v2, v1, La/m9s;->h:La/qqs;

    .line 12
    .line 13
    iget-object v3, v2, La/qqs;->c:Ljava/util/List;

    .line 14
    .line 15
    iget-object v2, v2, La/qqs;->l:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-lez v2, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance v2, La/psv;

    .line 25
    .line 26
    const-string v4, "ASSAULT_SQUAD_HEADER_KEY"

    .line 27
    .line 28
    const v5, 0x7f13119f

    .line 29
    .line 30
    .line 31
    invoke-direct {v2, v4, v5}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    new-instance v2, Ljava/util/ArrayList;

    .line 38
    .line 39
    const/16 v4, 0xa

    .line 40
    .line 41
    invoke-static {v3, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    const/4 v7, 0x1

    .line 57
    if-eqz v6, :cond_1

    .line 58
    .line 59
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    check-cast v6, La/ve90;

    .line 64
    .line 65
    iget-object v6, v6, La/ve90;->a:Ljava/lang/String;

    .line 66
    .line 67
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    move-object/from16 v8, p2

    .line 72
    .line 73
    iget-object v9, v8, La/ctf0;->b:La/lsm0;

    .line 74
    .line 75
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    const v7, 0x7f13146b

    .line 80
    .line 81
    .line 82
    invoke-virtual {v9, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    new-instance v5, La/r0o0;

    .line 91
    .line 92
    invoke-direct {v5, v2}, La/r0o0;-><init>(Ljava/util/ArrayList;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    iget-object v11, v1, La/m9s;->i:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v2, v1, La/m9s;->m:Ljava/util/List;

    .line 101
    .line 102
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    sget-object v5, La/ujn;->h:Ljava/lang/String;

    .line 112
    .line 113
    const/4 v6, 0x0

    .line 114
    invoke-static {v2, v5, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    const-string v14, "%s/playerlogo/%s"

    .line 119
    .line 120
    const-string v15, "%s/%s"

    .line 121
    .line 122
    const-string v8, "playerlogo/"

    .line 123
    .line 124
    const-string v16, ""

    .line 125
    .line 126
    const/4 v9, 0x2

    .line 127
    if-eqz v5, :cond_2

    .line 128
    .line 129
    :goto_1
    move-object v12, v2

    .line 130
    goto :goto_4

    .line 131
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-nez v5, :cond_3

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    sget-object v5, La/u0d;->a:Ljava/util/List;

    .line 139
    .line 140
    invoke-static {v2}, La/u0d;->c(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_4

    .line 145
    .line 146
    :goto_2
    move-object/from16 v12, v16

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_4
    invoke-static {v2, v8, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_5

    .line 154
    .line 155
    move-object v5, v15

    .line 156
    goto :goto_3

    .line 157
    :cond_5
    move-object v5, v14

    .line 158
    :goto_3
    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 159
    .line 160
    sget-object v12, La/ujn;->h:Ljava/lang/String;

    .line 161
    .line 162
    filled-new-array {v12, v2}, [Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-static {v10, v5, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    goto :goto_1

    .line 175
    :goto_4
    new-instance v13, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-static {v3, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    invoke-direct {v13, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    if-eqz v5, :cond_6

    .line 193
    .line 194
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    check-cast v5, La/ve90;

    .line 199
    .line 200
    iget-object v5, v5, La/ve90;->b:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_6
    new-instance v2, La/t0o0;

    .line 207
    .line 208
    move v5, v9

    .line 209
    const v9, 0x7f080414

    .line 210
    .line 211
    .line 212
    const-string v10, "ASSAULT_SQUAD_FIRST_TEAM_KEY"

    .line 213
    .line 214
    move-object/from16 v23, v8

    .line 215
    .line 216
    move-object v8, v2

    .line 217
    move-object/from16 v2, v23

    .line 218
    .line 219
    invoke-direct/range {v8 .. v13}, La/t0o0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    iget-object v8, v1, La/m9s;->j:Ljava/lang/String;

    .line 226
    .line 227
    iget-object v1, v1, La/m9s;->n:Ljava/util/List;

    .line 228
    .line 229
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    check-cast v1, Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 239
    .line 240
    invoke-static {v1, v9, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    if-eqz v6, :cond_7

    .line 245
    .line 246
    move-object/from16 v21, v1

    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    if-nez v6, :cond_8

    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_8
    sget-object v6, La/u0d;->a:Ljava/util/List;

    .line 257
    .line 258
    invoke-static {v1}, La/u0d;->c(Ljava/lang/String;)Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-eqz v6, :cond_9

    .line 263
    .line 264
    :goto_6
    move-object/from16 v21, v16

    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_9
    invoke-static {v1, v2, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-eqz v2, :cond_a

    .line 272
    .line 273
    move-object v14, v15

    .line 274
    :cond_a
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 275
    .line 276
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 277
    .line 278
    filled-new-array {v6, v1}, [Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-static {v2, v14, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v16

    .line 290
    goto :goto_6

    .line 291
    :goto_7
    new-instance v1, Ljava/util/ArrayList;

    .line 292
    .line 293
    invoke-static {v3, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 298
    .line 299
    .line 300
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    if-eqz v3, :cond_b

    .line 309
    .line 310
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    check-cast v3, La/ve90;

    .line 315
    .line 316
    iget-object v3, v3, La/ve90;->c:Ljava/lang/String;

    .line 317
    .line 318
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_b
    new-instance v17, La/t0o0;

    .line 323
    .line 324
    const v18, 0x7f080416

    .line 325
    .line 326
    .line 327
    const-string v19, "ASSAULT_SQUAD_SECOND_TEAM_KEY"

    .line 328
    .line 329
    move-object/from16 v22, v1

    .line 330
    .line 331
    move-object/from16 v20, v8

    .line 332
    .line 333
    invoke-direct/range {v17 .. v22}, La/t0o0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 334
    .line 335
    .line 336
    move-object/from16 v1, v17

    .line 337
    .line 338
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    return-void
.end method

.method public static final g(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    check-cast p0, La/kgy;

    .line 7
    .line 8
    instance-of p1, p0, La/jgy;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    move-object p1, p0

    .line 13
    check-cast p1, La/jgy;

    .line 14
    .line 15
    iget-object p1, p1, La/jgy;->i:La/mfy;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object p0, p1, La/mfy;->d:La/swq;

    .line 20
    .line 21
    iget-object p0, p0, La/swq;->a:La/twq;

    .line 22
    .line 23
    iget-object p0, p0, La/twq;->a:Ljava/lang/String;

    .line 24
    .line 25
    const/16 p1, 0x2e

    .line 26
    .line 27
    const/16 v0, 0x2f

    .line 28
    .line 29
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    new-instance p1, La/igy;

    .line 36
    .line 37
    invoke-direct {p1, p0}, La/igy;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_0
    const/4 p0, 0x7

    .line 42
    invoke-static {p0}, La/rey;->a(I)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0

    .line 47
    :cond_1
    return-object p0
.end method

.method public static h()Ljava/lang/reflect/InvocationHandler;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, La/x6;->k()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    const-class v0, Landroid/webkit/WebView;

    .line 14
    .line 15
    const-string v1, "getFactory"

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    const-string v1, "org.chromium.support_lib_glue.SupportLibReflectionUtil"

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static {v1, v3, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "createWebViewProviderFactory"

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/reflect/InvocationHandler;

    .line 55
    .line 56
    return-object v0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    goto :goto_1

    .line 59
    :catch_1
    move-exception v0

    .line 60
    goto :goto_1

    .line 61
    :catch_2
    move-exception v0

    .line 62
    :goto_1
    invoke-static {v0}, La/ohq;->p(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    return-object v2
.end method

.method public static final i(ILjava/lang/String;)I
    .locals 11

    .line 1
    invoke-static {}, La/osm0;->k()La/qsn;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    invoke-virtual {v0}, La/qsn;->c()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne v2, v4, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v4, v3

    .line 18
    :goto_0
    const-string v2, "Not initialized yet"

    .line 19
    .line 20
    invoke-static {v2, v4}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v2, "charSequence cannot be null"

    .line 24
    .line 25
    invoke-static {p1, v2}, La/z1x;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, La/qsn;->e:La/yp2;

    .line 29
    .line 30
    iget-object v0, v0, La/yp2;->b:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v4, v0

    .line 33
    check-cast v4, La/lhf0;

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const/4 v0, -0x1

    .line 39
    if-ltz p0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-lt p0, v2, :cond_2

    .line 46
    .line 47
    :cond_1
    move-object v5, p1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    instance-of v2, p1, Landroid/text/Spanned;

    .line 50
    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    move-object v2, p1

    .line 54
    check-cast v2, Landroid/text/Spanned;

    .line 55
    .line 56
    add-int/lit8 v5, p0, 0x1

    .line 57
    .line 58
    const-class v6, La/v0t0;

    .line 59
    .line 60
    invoke-interface {v2, p0, v5, v6}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, [La/v0t0;

    .line 65
    .line 66
    array-length v6, v5

    .line 67
    if-lez v6, :cond_3

    .line 68
    .line 69
    aget-object v3, v5, v3

    .line 70
    .line 71
    invoke-interface {v2, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    move-object v5, p1

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    add-int/lit8 v2, p0, -0x10

    .line 78
    .line 79
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    add-int/lit8 v3, p0, 0x10

    .line 88
    .line 89
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    new-instance v10, La/ctn;

    .line 94
    .line 95
    invoke-direct {v10, p0}, La/ctn;-><init>(I)V

    .line 96
    .line 97
    .line 98
    const v8, 0x7fffffff

    .line 99
    .line 100
    .line 101
    const/4 v9, 0x1

    .line 102
    move-object v5, p1

    .line 103
    invoke-virtual/range {v4 .. v10}, La/lhf0;->E(Ljava/lang/CharSequence;IIIZLa/btn;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, La/ctn;

    .line 108
    .line 109
    iget v2, p1, La/ctn;->c:I

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :goto_1
    move v2, v0

    .line 113
    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-ne v2, v0, :cond_4

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    move-object v1, p1

    .line 121
    goto :goto_3

    .line 122
    :cond_5
    move-object v5, p1

    .line 123
    :goto_3
    if-eqz v1, :cond_6

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    return p0

    .line 130
    :cond_6
    invoke-static {}, Ljava/text/BreakIterator;->getCharacterInstance()Ljava/text/BreakIterator;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1, v5}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, p0}, Ljava/text/BreakIterator;->following(I)I

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    return p0
.end method

.method public static final j(ILjava/lang/String;)I
    .locals 4

    .line 1
    invoke-static {}, La/osm0;->k()La/qsn;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    add-int/lit8 v2, p0, -0x1

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0, v2, p1}, La/qsn;->b(ILjava/lang/CharSequence;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, -0x1

    .line 28
    if-ne v2, v3, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v1, v0

    .line 32
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_2
    invoke-static {}, Ljava/text/BreakIterator;->getCharacterInstance()Ljava/text/BreakIterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/text/BreakIterator;->preceding(I)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0
.end method

.method public static final k()La/qsn;
    .locals 3

    .line 1
    invoke-static {}, La/qsn;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, La/qsn;->a()La/qsn;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, La/qsn;->c()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public static final l(La/ivo0;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/ivo0;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-wide v2, p0, La/ivo0;->b:D

    .line 17
    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    cmpg-double p0, v2, v4

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    move p0, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    :goto_0
    xor-int/2addr p0, v1

    .line 28
    return p0
.end method

.method public static final m(Landroid/view/View;La/jie0;La/pz40;ZF)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    new-instance p3, La/tly;

    .line 13
    .line 14
    iget p1, p1, La/jie0;->a:F

    .line 15
    .line 16
    invoke-direct {p3, p4, p1, p0}, La/tly;-><init>(FFZ)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    invoke-interface {p2, p3}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public static final n(Landroid/view/View;La/jie0;La/pz40;)V
    .locals 3

    .line 1
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-static {p0}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, v0, La/xiv0;->a:La/uiv0;

    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    invoke-virtual {v0, v1}, La/uiv0;->u(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v0, v1}, La/uiv0;->i(I)La/pfx;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v0, v0, La/pfx;->d:I

    .line 23
    .line 24
    int-to-float v0, v0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    cmpl-float v1, v0, v1

    .line 29
    .line 30
    if-lez v1, :cond_1

    .line 31
    .line 32
    iput v0, p1, La/jie0;->a:F

    .line 33
    .line 34
    :cond_1
    invoke-static {p0, p1, p2, v2, v0}, La/osm0;->m(Landroid/view/View;La/jie0;La/pz40;ZF)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static final o(La/n0a;La/rrd;La/wsf0;)V
    .locals 12

    .line 1
    sget-object v0, La/osm0;->a:La/nhf0;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {p0}, La/n0a;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/nhf0;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/j2a;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, La/j2a;->b(Ljava/lang/String;)La/s0a;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    new-instance v5, La/zo;

    .line 21
    .line 22
    invoke-interface {v3}, La/s0a;->h()La/n0a;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v1, La/ky9;->a:La/jy9;

    .line 27
    .line 28
    invoke-direct {v5, p0, v1}, La/zo;-><init>(La/n0a;La/hy9;)V

    .line 29
    .line 30
    .line 31
    sget-object v7, La/c5k;->c:La/c5k;

    .line 32
    .line 33
    new-instance v2, La/t3a;

    .line 34
    .line 35
    iget-object p0, v0, La/nhf0;->b:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v9, p0

    .line 38
    check-cast v9, La/wy9;

    .line 39
    .line 40
    iget-object p0, v0, La/nhf0;->d:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v10, p0

    .line 43
    check-cast v10, La/trm0;

    .line 44
    .line 45
    iget-object p0, v0, La/nhf0;->c:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v11, p0

    .line 48
    check-cast v11, La/ipt0;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    move-object v8, v7

    .line 53
    invoke-direct/range {v2 .. v11}, La/t3a;-><init>(La/s0a;La/s0a;La/zo;La/zo;La/c5k;La/c5k;La/wy9;La/trm0;La/ipt0;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p1, La/rrd;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/wju0;

    .line 59
    .line 60
    iget-object v1, v2, La/t3a;->l:Ljava/lang/Object;

    .line 61
    .line 62
    monitor-enter v1

    .line 63
    :try_start_0
    iput-object p0, v2, La/t3a;->h:La/wju0;

    .line 64
    .line 65
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 66
    iget-object p0, p1, La/rrd;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Ljava/util/List;

    .line 69
    .line 70
    iget-object v3, v2, La/t3a;->l:Ljava/lang/Object;

    .line 71
    .line 72
    monitor-enter v3

    .line 73
    :try_start_1
    iput-object p0, v2, La/t3a;->i:Ljava/util/List;

    .line 74
    .line 75
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 76
    iget-object p0, v2, La/t3a;->l:Ljava/lang/Object;

    .line 77
    .line 78
    monitor-enter p0

    .line 79
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 80
    iget-object p0, p1, La/rrd;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Landroid/util/Range;

    .line 83
    .line 84
    iget-object v1, v2, La/t3a;->l:Ljava/lang/Object;

    .line 85
    .line 86
    monitor-enter v1

    .line 87
    :try_start_3
    iput-object p0, v2, La/t3a;->j:Landroid/util/Range;

    .line 88
    .line 89
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 90
    iget-object p0, p1, La/rrd;->g:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Ljava/util/List;

    .line 93
    .line 94
    const-string p1, "CameraUseCaseAdapter"

    .line 95
    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v1, "simulateAddUseCases: appUseCasesToAdd = "

    .line 99
    .line 100
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v1, ", featureGroup = "

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {p1, v0}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object p1, v2, La/t3a;->l:Ljava/lang/Object;

    .line 122
    .line 123
    monitor-enter p1

    .line 124
    :try_start_4
    iget-object v0, v2, La/t3a;->a:La/ap;

    .line 125
    .line 126
    iget-object v1, v2, La/t3a;->k:La/hy9;

    .line 127
    .line 128
    invoke-virtual {v0, v1}, La/ap;->f(La/hy9;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, v2, La/t3a;->b:La/ap;

    .line 132
    .line 133
    if-eqz v0, :cond_0

    .line 134
    .line 135
    invoke-virtual {v0, v1}, La/ap;->f(La/hy9;)V

    .line 136
    .line 137
    .line 138
    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 139
    .line 140
    iget-object v1, v2, La/t3a;->e:Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v0, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 146
    .line 147
    .line 148
    invoke-static {v0, p2}, La/t3a;->j(Ljava/util/LinkedHashSet;La/wsf0;)Ljava/util/HashMap;

    .line 149
    .line 150
    .line 151
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 152
    :try_start_5
    iget-object p2, v2, La/t3a;->b:La/ap;

    .line 153
    .line 154
    if-eqz p2, :cond_1

    .line 155
    .line 156
    const/4 p2, 0x1

    .line 157
    goto :goto_0

    .line 158
    :cond_1
    const/4 p2, 0x0

    .line 159
    :goto_0
    invoke-virtual {v2, v0, p2}, La/t3a;->s(Ljava/util/LinkedHashSet;Z)La/kk9;

    .line 160
    .line 161
    .line 162
    move-result-object p2
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 163
    :try_start_6
    invoke-static {p0}, La/t3a;->B(Ljava/util/HashMap;)V

    .line 164
    .line 165
    .line 166
    monitor-exit p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 167
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :catchall_0
    move-exception v0

    .line 172
    move-object p0, v0

    .line 173
    goto :goto_2

    .line 174
    :catchall_1
    move-exception v0

    .line 175
    move-object p2, v0

    .line 176
    goto :goto_1

    .line 177
    :catch_0
    move-exception v0

    .line 178
    move-object p2, v0

    .line 179
    :try_start_7
    new-instance v0, La/n3a;

    .line 180
    .line 181
    invoke-direct {v0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 185
    :goto_1
    :try_start_8
    invoke-static {p0}, La/t3a;->B(Ljava/util/HashMap;)V

    .line 186
    .line 187
    .line 188
    throw p2

    .line 189
    :goto_2
    monitor-exit p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 190
    throw p0

    .line 191
    :catchall_2
    move-exception v0

    .line 192
    move-object p0, v0

    .line 193
    :try_start_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 194
    throw p0

    .line 195
    :catchall_3
    move-exception v0

    .line 196
    move-object p1, v0

    .line 197
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 198
    throw p1

    .line 199
    :catchall_4
    move-exception v0

    .line 200
    move-object p0, v0

    .line 201
    :try_start_b
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 202
    throw p0

    .line 203
    :catchall_5
    move-exception v0

    .line 204
    move-object p0, v0

    .line 205
    :try_start_c
    monitor-exit v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 206
    throw p0

    .line 207
    :cond_2
    const-string p0, "mCameraUseCaseAdapterProvider must be initialized first!"

    .line 208
    .line 209
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return-void
.end method

.method public static final p(La/l9s;J)La/anq0;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, La/l9s;->u()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const-wide/16 v3, 0x3e8

    .line 11
    .line 12
    div-long v3, p1, v3

    .line 13
    .line 14
    sub-long/2addr v1, v3

    .line 15
    const-wide/16 v5, 0x0

    .line 16
    .line 17
    cmp-long v7, v1, v5

    .line 18
    .line 19
    if-gez v7, :cond_0

    .line 20
    .line 21
    move-wide/from16 v18, v5

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-wide/from16 v18, v1

    .line 25
    .line 26
    :goto_0
    instance-of v1, v0, La/k9s;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    move-object v1, v0

    .line 32
    check-cast v1, La/k9s;

    .line 33
    .line 34
    iget-object v1, v1, La/k9s;->Z:La/vzj0;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    instance-of v1, v0, La/j9s;

    .line 38
    .line 39
    if-eqz v1, :cond_9

    .line 40
    .line 41
    move-object v1, v2

    .line 42
    :goto_1
    if-eqz v1, :cond_3

    .line 43
    .line 44
    invoke-interface {v1}, La/vzj0;->a()La/znq0;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    iget-wide v7, v1, La/znq0;->a:J

    .line 51
    .line 52
    sub-long/2addr v7, v3

    .line 53
    cmp-long v1, v7, v5

    .line 54
    .line 55
    if-gez v1, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move-wide v5, v7

    .line 59
    :goto_2
    new-instance v1, La/znq0;

    .line 60
    .line 61
    invoke-direct {v1, v5, v6}, La/znq0;-><init>(J)V

    .line 62
    .line 63
    .line 64
    move-object/from16 v20, v1

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    move-object/from16 v20, v2

    .line 68
    .line 69
    :goto_3
    invoke-interface {v0}, La/l9s;->F()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    sget-object v3, La/rem0;->c:La/rem0;

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_5

    .line 84
    .line 85
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    move-object v5, v4

    .line 90
    check-cast v5, La/sem0;

    .line 91
    .line 92
    iget-object v5, v5, La/sem0;->a:La/rem0;

    .line 93
    .line 94
    if-ne v5, v3, :cond_4

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_5
    move-object v4, v2

    .line 98
    :goto_4
    check-cast v4, La/sem0;

    .line 99
    .line 100
    if-eqz v4, :cond_6

    .line 101
    .line 102
    iget-object v2, v4, La/sem0;->b:Ljava/lang/String;

    .line 103
    .line 104
    :cond_6
    if-nez v2, :cond_7

    .line 105
    .line 106
    const-string v2, ""

    .line 107
    .line 108
    :cond_7
    move-object v11, v2

    .line 109
    invoke-interface {v0}, La/l9s;->I()Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    invoke-interface {v0}, La/l9s;->J()Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    invoke-interface {v0}, La/l9s;->R()J

    .line 118
    .line 119
    .line 120
    move-result-wide v14

    .line 121
    invoke-interface {v0}, La/l9s;->u()J

    .line 122
    .line 123
    .line 124
    move-result-wide v16

    .line 125
    invoke-interface {v0}, La/l9s;->e()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_8

    .line 130
    .line 131
    invoke-interface {v0}, La/l9s;->x()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    :goto_5
    move/from16 v21, v1

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_8
    const/4 v1, 0x1

    .line 139
    goto :goto_5

    .line 140
    :goto_6
    invoke-interface {v0}, La/l9s;->e()Z

    .line 141
    .line 142
    .line 143
    move-result v22

    .line 144
    new-instance v8, La/anq0;

    .line 145
    .line 146
    const-wide/16 v12, 0x0

    .line 147
    .line 148
    invoke-direct/range {v8 .. v22}, La/anq0;-><init>(ZZLjava/lang/String;JJJJLa/znq0;ZZ)V

    .line 149
    .line 150
    .line 151
    return-object v8

    .line 152
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 153
    .line 154
    .line 155
    return-object v2
.end method

.method public static final q(La/ctf0;Ljava/util/List;)Ljava/util/List;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v0, La/iun;->a:La/iun;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v1, 0x3

    .line 19
    move-object/from16 v2, p1

    .line 20
    .line 21
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, Ljava/util/ArrayList;

    .line 26
    .line 27
    const/16 v3, 0xa

    .line 28
    .line 29
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const/4 v4, 0x0

    .line 41
    move v5, v4

    .line 42
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    const/4 v7, 0x0

    .line 47
    if-eqz v6, :cond_5

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    add-int/lit8 v8, v5, 0x1

    .line 54
    .line 55
    if-ltz v5, :cond_4

    .line 56
    .line 57
    check-cast v6, La/wwl0;

    .line 58
    .line 59
    invoke-static {v5, v1}, La/unh0;->i0(ILjava/util/List;)La/v12;

    .line 60
    .line 61
    .line 62
    move-result-object v16

    .line 63
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v5, v6, La/wwl0;->c:Ljava/lang/String;

    .line 67
    .line 68
    new-instance v15, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    iget-object v7, v6, La/wwl0;->e:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v9, v6, La/wwl0;->d:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    const/4 v11, 0x1

    .line 82
    if-lez v10, :cond_1

    .line 83
    .line 84
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    iget-object v10, v0, La/ctf0;->b:La/lsm0;

    .line 89
    .line 90
    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const v12, 0x7f131357

    .line 95
    .line 96
    .line 97
    invoke-virtual {v10, v12, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    :cond_1
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-lez v5, :cond_2

    .line 109
    .line 110
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    iget-object v9, v0, La/ctf0;->b:La/lsm0;

    .line 115
    .line 116
    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    const v10, 0x7f13135a

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9, v10, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    :cond_2
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-lez v5, :cond_3

    .line 135
    .line 136
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iget-object v7, v0, La/ctf0;->b:La/lsm0;

    .line 141
    .line 142
    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    const v9, 0x7f131356

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7, v9, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    :cond_3
    new-instance v9, La/o6u0;

    .line 157
    .line 158
    iget-wide v10, v6, La/wwl0;->a:J

    .line 159
    .line 160
    const-class v5, La/o6u0;

    .line 161
    .line 162
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    new-instance v7, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v10, "_"

    .line 175
    .line 176
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    iget-wide v11, v6, La/wwl0;->a:J

    .line 187
    .line 188
    iget-object v13, v6, La/wwl0;->b:Ljava/lang/String;

    .line 189
    .line 190
    new-instance v5, La/b2l0;

    .line 191
    .line 192
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 193
    .line 194
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 199
    .line 200
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 201
    .line 202
    .line 203
    move-result-wide v6

    .line 204
    invoke-direct {v5, v13, v6, v7}, La/b2l0;-><init>(Ljava/lang/String;J)V

    .line 205
    .line 206
    .line 207
    new-instance v17, La/t1l0;

    .line 208
    .line 209
    sget-object v18, La/p1l0;->b:La/p1l0;

    .line 210
    .line 211
    const v6, 0x7f080989

    .line 212
    .line 213
    .line 214
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v21

    .line 218
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 223
    .line 224
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 225
    .line 226
    .line 227
    move-result-wide v6

    .line 228
    new-instance v14, La/y3d;

    .line 229
    .line 230
    invoke-direct {v14, v6, v7}, La/y3d;-><init>(J)V

    .line 231
    .line 232
    .line 233
    const/16 v23, 0x0

    .line 234
    .line 235
    const/16 v24, 0xe6

    .line 236
    .line 237
    const/16 v19, 0x0

    .line 238
    .line 239
    const/16 v20, 0x0

    .line 240
    .line 241
    move-object/from16 v22, v14

    .line 242
    .line 243
    invoke-direct/range {v17 .. v24}, La/t1l0;-><init>(La/p1l0;La/y3d;Ljava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;I)V

    .line 244
    .line 245
    .line 246
    new-instance v6, La/l3l0;

    .line 247
    .line 248
    sget-object v7, La/qmk;->a:La/zcl;

    .line 249
    .line 250
    const/high16 v7, 0x41800000    # 16.0f

    .line 251
    .line 252
    invoke-direct {v6, v7}, La/l3l0;-><init>(F)V

    .line 253
    .line 254
    .line 255
    sget-object v21, La/d4d;->B:La/d4d;

    .line 256
    .line 257
    new-instance v14, La/zrm;

    .line 258
    .line 259
    const/16 v23, 0x24

    .line 260
    .line 261
    move-object/from16 v18, v5

    .line 262
    .line 263
    move-object/from16 v22, v6

    .line 264
    .line 265
    move-object/from16 v19, v17

    .line 266
    .line 267
    move-object/from16 v17, v14

    .line 268
    .line 269
    invoke-direct/range {v17 .. v23}, La/zrm;-><init>(La/f2l0;La/u1l0;La/g3l0;La/d4d;La/n3l0;I)V

    .line 270
    .line 271
    .line 272
    invoke-direct/range {v9 .. v16}, La/o6u0;-><init>(Ljava/lang/String;JLjava/lang/String;La/zrm;Ljava/util/ArrayList;La/v12;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move v5, v8

    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 282
    .line 283
    .line 284
    throw v7

    .line 285
    :cond_5
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    new-instance v3, La/eok0;

    .line 290
    .line 291
    new-instance v8, La/hjm;

    .line 292
    .line 293
    new-array v5, v4, [Ljava/lang/Object;

    .line 294
    .line 295
    iget-object v6, v0, La/ctf0;->b:La/lsm0;

    .line 296
    .line 297
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    const v5, 0x7f131765

    .line 302
    .line 303
    .line 304
    invoke-virtual {v6, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v9

    .line 308
    sget-object v4, La/s6t0;->a:La/pz40;

    .line 309
    .line 310
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 315
    .line 316
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 317
    .line 318
    .line 319
    move-result-wide v4

    .line 320
    new-instance v11, La/y3d;

    .line 321
    .line 322
    invoke-direct {v11, v4, v5}, La/y3d;-><init>(J)V

    .line 323
    .line 324
    .line 325
    const/16 v20, 0x0

    .line 326
    .line 327
    const/16 v21, 0x1ffa

    .line 328
    .line 329
    const/4 v10, 0x0

    .line 330
    const/4 v12, 0x0

    .line 331
    const/4 v13, 0x0

    .line 332
    const/4 v14, 0x0

    .line 333
    const/4 v15, 0x0

    .line 334
    const/16 v16, 0x0

    .line 335
    .line 336
    const/16 v17, 0x0

    .line 337
    .line 338
    const/16 v18, 0x0

    .line 339
    .line 340
    const/16 v19, 0x0

    .line 341
    .line 342
    invoke-direct/range {v8 .. v21}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 343
    .line 344
    .line 345
    sget-object v4, La/i9h0;->a:La/i9h0;

    .line 346
    .line 347
    invoke-direct {v3, v8, v7, v4}, La/eok0;-><init>(La/hjm;La/bqv;La/i9h0;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1, v2}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 354
    .line 355
    .line 356
    const v2, 0x7f1300ef

    .line 357
    .line 358
    .line 359
    sget-object v3, La/ar40;->a:La/ar40;

    .line 360
    .line 361
    invoke-static {v0, v2, v3, v3}, La/m2x;->t(La/ctf0;ILa/ar40;Ljava/lang/Object;)La/br40;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    return-object v0
.end method

.method public static r(La/rew0;La/h0q0;Ljava/util/ArrayList;Z)La/jlw0;
    .locals 11

    .line 1
    const-string v0, "reduce"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, p2, v1}, La/pvm0;->E(Ljava/lang/String;Ljava/util/List;I)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-static {v2, v0, p2}, La/pvm0;->F(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, La/jlw0;

    .line 17
    .line 18
    iget-object v4, p1, La/h0q0;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, La/okt0;

    .line 21
    .line 22
    invoke-virtual {v4, p1, v3}, La/okt0;->s(La/h0q0;La/jlw0;)La/jlw0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    instance-of v4, v3, La/giw0;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    if-eqz v4, :cond_a

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-ne v4, v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, La/jlw0;

    .line 42
    .line 43
    iget-object v4, p1, La/h0q0;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v4, La/okt0;

    .line 46
    .line 47
    invoke-virtual {v4, p1, p2}, La/okt0;->s(La/h0q0;La/jlw0;)La/jlw0;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    instance-of v4, p2, La/kgw0;

    .line 52
    .line 53
    if-nez v4, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const-string p0, "Failed to parse initial value"

    .line 57
    .line 58
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v5

    .line 62
    :cond_1
    invoke-virtual {p0}, La/rew0;->k()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_9

    .line 67
    .line 68
    move-object p2, v5

    .line 69
    :goto_0
    check-cast v3, La/giw0;

    .line 70
    .line 71
    invoke-virtual {p0}, La/rew0;->k()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz p3, :cond_2

    .line 76
    .line 77
    move v6, v0

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    add-int/lit8 v6, v4, -0x1

    .line 80
    .line 81
    :goto_1
    const/4 v7, -0x1

    .line 82
    if-eqz p3, :cond_3

    .line 83
    .line 84
    add-int/2addr v4, v7

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    move v4, v0

    .line 87
    :goto_2
    if-eq v1, p3, :cond_4

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    move v7, v1

    .line 91
    :goto_3
    if-nez p2, :cond_6

    .line 92
    .line 93
    invoke-virtual {p0, v6}, La/rew0;->l(I)La/jlw0;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    :cond_5
    :goto_4
    add-int/2addr v6, v7

    .line 98
    :cond_6
    sub-int p3, v4, v6

    .line 99
    .line 100
    mul-int/2addr p3, v7

    .line 101
    if-ltz p3, :cond_8

    .line 102
    .line 103
    invoke-virtual {p0, v6}, La/rew0;->o(I)Z

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    if-eqz p3, :cond_5

    .line 108
    .line 109
    invoke-virtual {p0, v6}, La/rew0;->l(I)La/jlw0;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    int-to-double v8, v6

    .line 114
    new-instance v10, La/ihw0;

    .line 115
    .line 116
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-direct {v10, v8}, La/ihw0;-><init>(Ljava/lang/Double;)V

    .line 121
    .line 122
    .line 123
    const/4 v8, 0x4

    .line 124
    new-array v8, v8, [La/jlw0;

    .line 125
    .line 126
    aput-object p2, v8, v0

    .line 127
    .line 128
    aput-object p3, v8, v1

    .line 129
    .line 130
    aput-object v10, v8, v2

    .line 131
    .line 132
    const/4 p2, 0x3

    .line 133
    aput-object p0, v8, p2

    .line 134
    .line 135
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-virtual {v3, p1, p2}, La/giw0;->a(La/h0q0;Ljava/util/List;)La/jlw0;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    instance-of p3, p2, La/kgw0;

    .line 144
    .line 145
    if-nez p3, :cond_7

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    const-string p0, "Reduce operation failed"

    .line 149
    .line 150
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-object v5

    .line 154
    :cond_8
    return-object p2

    .line 155
    :cond_9
    const-string p0, "Empty array with no initial value error"

    .line 156
    .line 157
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-object v5

    .line 161
    :cond_a
    const-string p0, "Callback should be a method"

    .line 162
    .line 163
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-object v5
.end method

.method public static s(La/rew0;La/h0q0;La/xkw0;Ljava/lang/Boolean;Ljava/lang/Boolean;)La/rew0;
    .locals 7

    .line 1
    new-instance v0, La/rew0;

    .line 2
    .line 3
    invoke-direct {v0}, La/rew0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/rew0;->j()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p0, v2}, La/rew0;->o(I)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0, v2}, La/rew0;->l(I)La/jlw0;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    int-to-double v4, v2

    .line 37
    new-instance v6, La/ihw0;

    .line 38
    .line 39
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-direct {v6, v4}, La/ihw0;-><init>(Ljava/lang/Double;)V

    .line 44
    .line 45
    .line 46
    const/4 v4, 0x3

    .line 47
    new-array v4, v4, [La/jlw0;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    aput-object v3, v4, v5

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    aput-object v6, v4, v3

    .line 54
    .line 55
    const/4 v3, 0x2

    .line 56
    aput-object p0, v4, v3

    .line 57
    .line 58
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {p2, p1, v3}, La/xkw0;->a(La/h0q0;Ljava/util/List;)La/jlw0;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-interface {v3}, La/jlw0;->zze()Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v4, p3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    if-eqz p4, :cond_2

    .line 78
    .line 79
    invoke-interface {v3}, La/jlw0;->zze()Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v4, p4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_0

    .line 88
    .line 89
    :cond_2
    invoke-virtual {v0, v2, v3}, La/rew0;->m(ILa/jlw0;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    :goto_1
    return-object v0
.end method
