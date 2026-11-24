.class public final synthetic La/rzo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Z

.field public final synthetic d:La/xcz;

.field public final synthetic e:La/a4x;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;ZLa/xcz;La/a4x;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/rzo0;->a:B

    iput-object p1, p0, La/rzo0;->b:La/mm40;

    iput-boolean p2, p0, La/rzo0;->c:Z

    iput-object p3, p0, La/rzo0;->d:La/xcz;

    iput-object p4, p0, La/rzo0;->e:La/a4x;

    iput-object p5, p0, La/rzo0;->f:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rzo0;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/high16 v4, 0x42000000    # 32.0f

    .line 9
    .line 10
    const/16 v5, 0x10

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    iget-object v8, v0, La/rzo0;->f:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    iget-object v9, v0, La/rzo0;->e:La/a4x;

    .line 17
    .line 18
    iget-boolean v10, v0, La/rzo0;->c:Z

    .line 19
    .line 20
    iget-object v11, v0, La/rzo0;->b:La/mm40;

    .line 21
    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, La/ir8;

    .line 28
    .line 29
    move-object/from16 v12, p2

    .line 30
    .line 31
    check-cast v12, La/fet;

    .line 32
    .line 33
    move-object/from16 v13, p3

    .line 34
    .line 35
    check-cast v13, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v13

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    and-int/lit8 v1, v13, 0x11

    .line 45
    .line 46
    if-eq v1, v5, :cond_0

    .line 47
    .line 48
    move v7, v6

    .line 49
    :cond_0
    and-int/lit8 v1, v13, 0x1

    .line 50
    .line 51
    invoke-virtual {v12, v1, v7}, La/fet;->U(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 58
    .line 59
    invoke-interface {v11, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    xor-int/lit8 v18, v10, 0x1

    .line 64
    .line 65
    invoke-static {v12}, La/xfn;->a(La/fet;)La/wfn;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    iget v5, v5, La/wfn;->c:F

    .line 70
    .line 71
    invoke-static {v12}, La/xfn;->a(La/fet;)La/wfn;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    iget v6, v6, La/wfn;->c:F

    .line 76
    .line 77
    sget-object v7, La/qmk;->a:La/zcl;

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    invoke-static {v5, v7, v6, v4, v3}, La/s5x0;->u(FFFFI)La/lh80;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v3, v12}, La/knm0;->g(La/hh80;La/fet;)La/ch80;

    .line 85
    .line 86
    .line 87
    move-result-object v14

    .line 88
    invoke-virtual {v12, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-virtual {v12, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    or-int/2addr v3, v4

    .line 97
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    if-nez v3, :cond_1

    .line 102
    .line 103
    if-ne v4, v2, :cond_2

    .line 104
    .line 105
    :cond_1
    new-instance v4, La/a7j0;

    .line 106
    .line 107
    const/4 v2, 0x3

    .line 108
    invoke-direct {v4, v9, v8, v2}, La/a7j0;-><init>(La/a4x;Lkotlin/jvm/functions/Function1;B)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_2
    move-object/from16 v20, v4

    .line 115
    .line 116
    check-cast v20, Lkotlin/jvm/functions/Function1;

    .line 117
    .line 118
    const/16 v22, 0x0

    .line 119
    .line 120
    const/16 v23, 0x178

    .line 121
    .line 122
    iget-object v13, v0, La/rzo0;->d:La/xcz;

    .line 123
    .line 124
    const/4 v15, 0x0

    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    const/16 v19, 0x0

    .line 130
    .line 131
    move-object/from16 v21, v12

    .line 132
    .line 133
    move-object v12, v1

    .line 134
    invoke-static/range {v12 .. v23}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_3
    move-object/from16 v21, v12

    .line 139
    .line 140
    invoke-virtual/range {v21 .. v21}, La/fet;->X()V

    .line 141
    .line 142
    .line 143
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object v0

    .line 146
    :pswitch_0
    move-object/from16 v1, p1

    .line 147
    .line 148
    check-cast v1, La/ir8;

    .line 149
    .line 150
    move-object/from16 v12, p2

    .line 151
    .line 152
    check-cast v12, La/fet;

    .line 153
    .line 154
    move-object/from16 v13, p3

    .line 155
    .line 156
    check-cast v13, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    and-int/lit8 v1, v13, 0x11

    .line 166
    .line 167
    if-eq v1, v5, :cond_4

    .line 168
    .line 169
    move v7, v6

    .line 170
    :cond_4
    and-int/lit8 v1, v13, 0x1

    .line 171
    .line 172
    invoke-virtual {v12, v1, v7}, La/fet;->U(IZ)Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_7

    .line 177
    .line 178
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 179
    .line 180
    invoke-interface {v11, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    xor-int/lit8 v18, v10, 0x1

    .line 185
    .line 186
    sget-object v5, La/qmk;->a:La/zcl;

    .line 187
    .line 188
    invoke-static {v12}, La/qmk;->a(La/fet;)La/wfn;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    iget v5, v5, La/wfn;->c:F

    .line 193
    .line 194
    invoke-static {v12}, La/qmk;->a(La/fet;)La/wfn;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    iget v6, v6, La/wfn;->c:F

    .line 199
    .line 200
    const/high16 v7, 0x41000000    # 8.0f

    .line 201
    .line 202
    invoke-static {v5, v7, v6, v4, v12}, La/h97;->f(FFFFLa/fet;)La/ch80;

    .line 203
    .line 204
    .line 205
    move-result-object v14

    .line 206
    invoke-virtual {v12, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    invoke-virtual {v12, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    or-int/2addr v4, v5

    .line 215
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    if-nez v4, :cond_5

    .line 220
    .line 221
    if-ne v5, v2, :cond_6

    .line 222
    .line 223
    :cond_5
    new-instance v5, La/a7j0;

    .line 224
    .line 225
    invoke-direct {v5, v9, v8, v3}, La/a7j0;-><init>(La/a4x;Lkotlin/jvm/functions/Function1;B)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_6
    move-object/from16 v20, v5

    .line 232
    .line 233
    check-cast v20, Lkotlin/jvm/functions/Function1;

    .line 234
    .line 235
    const/16 v22, 0x0

    .line 236
    .line 237
    const/16 v23, 0x178

    .line 238
    .line 239
    iget-object v13, v0, La/rzo0;->d:La/xcz;

    .line 240
    .line 241
    const/4 v15, 0x0

    .line 242
    const/16 v16, 0x0

    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    .line 246
    const/16 v19, 0x0

    .line 247
    .line 248
    move-object/from16 v21, v12

    .line 249
    .line 250
    move-object v12, v1

    .line 251
    invoke-static/range {v12 .. v23}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 252
    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_7
    move-object/from16 v21, v12

    .line 256
    .line 257
    invoke-virtual/range {v21 .. v21}, La/fet;->X()V

    .line 258
    .line 259
    .line 260
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object v0

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
