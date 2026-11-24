.class public final synthetic La/axp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/agk0;La/l7m0;FFLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/axp;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/axp;->f:La/l7m0;

    iput-object p2, p0, La/axp;->b:La/l7m0;

    iput p3, p0, La/axp;->c:F

    iput p4, p0, La/axp;->d:F

    iput-object p5, p0, La/axp;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/l7m0;La/l7m0;FFLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/axp;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/axp;->b:La/l7m0;

    iput-object p2, p0, La/axp;->f:La/l7m0;

    iput p3, p0, La/axp;->c:F

    iput p4, p0, La/axp;->d:F

    iput-object p5, p0, La/axp;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/axp;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v6, v0, La/axp;->f:La/l7m0;

    .line 10
    .line 11
    iget-object v7, v0, La/axp;->b:La/l7m0;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v11, p1

    .line 17
    .line 18
    check-cast v11, La/l7m0;

    .line 19
    .line 20
    move-object/from16 v1, p2

    .line 21
    .line 22
    check-cast v1, La/l7m0;

    .line 23
    .line 24
    move-object/from16 v8, p3

    .line 25
    .line 26
    check-cast v8, La/ycl;

    .line 27
    .line 28
    move-object/from16 v9, p4

    .line 29
    .line 30
    check-cast v9, La/fet;

    .line 31
    .line 32
    move-object/from16 v10, p5

    .line 33
    .line 34
    check-cast v10, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    and-int/lit8 v1, v10, 0x6

    .line 47
    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {v9, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    move v3, v4

    .line 57
    :cond_0
    or-int v1, v10, v3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move v1, v10

    .line 61
    :goto_0
    and-int/lit16 v3, v10, 0x180

    .line 62
    .line 63
    if-nez v3, :cond_3

    .line 64
    .line 65
    iget v3, v8, La/ycl;->a:F

    .line 66
    .line 67
    invoke-virtual {v9, v3}, La/fet;->d(F)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_2

    .line 72
    .line 73
    const/16 v3, 0x100

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    const/16 v3, 0x80

    .line 77
    .line 78
    :goto_1
    or-int/2addr v1, v3

    .line 79
    :cond_3
    and-int/lit16 v3, v1, 0x483

    .line 80
    .line 81
    const/16 v4, 0x482

    .line 82
    .line 83
    if-eq v3, v4, :cond_4

    .line 84
    .line 85
    move v2, v5

    .line 86
    :cond_4
    and-int/lit8 v3, v1, 0x1

    .line 87
    .line 88
    invoke-virtual {v9, v3, v2}, La/fet;->U(IZ)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, La/jkw;

    .line 99
    .line 100
    iget-object v2, v2, La/jkw;->b:La/l7m0;

    .line 101
    .line 102
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, La/fkw;

    .line 107
    .line 108
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    instance-of v10, v3, La/djw;

    .line 113
    .line 114
    iget v14, v8, La/ycl;->a:F

    .line 115
    .line 116
    shl-int/lit8 v3, v1, 0x9

    .line 117
    .line 118
    and-int/lit16 v3, v3, 0x1c00

    .line 119
    .line 120
    shl-int/lit8 v1, v1, 0xc

    .line 121
    .line 122
    const/high16 v4, 0x380000

    .line 123
    .line 124
    and-int/2addr v1, v4

    .line 125
    or-int v17, v3, v1

    .line 126
    .line 127
    const/4 v8, 0x0

    .line 128
    iget v12, v0, La/axp;->c:F

    .line 129
    .line 130
    iget v13, v0, La/axp;->d:F

    .line 131
    .line 132
    iget-object v15, v0, La/axp;->e:Lkotlin/jvm/functions/Function1;

    .line 133
    .line 134
    move-object/from16 v16, v9

    .line 135
    .line 136
    move-object v9, v2

    .line 137
    invoke-static/range {v8 .. v17}, La/cy2;->i(La/mm40;La/fkw;ZLa/l7m0;FFFLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_5
    move-object/from16 v16, v9

    .line 142
    .line 143
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 144
    .line 145
    .line 146
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_0
    check-cast v6, La/agk0;

    .line 150
    .line 151
    move-object/from16 v10, p1

    .line 152
    .line 153
    check-cast v10, La/l7m0;

    .line 154
    .line 155
    move-object/from16 v1, p2

    .line 156
    .line 157
    check-cast v1, La/l7m0;

    .line 158
    .line 159
    move-object/from16 v8, p3

    .line 160
    .line 161
    check-cast v8, La/ycl;

    .line 162
    .line 163
    move-object/from16 v14, p4

    .line 164
    .line 165
    check-cast v14, La/fet;

    .line 166
    .line 167
    move-object/from16 v8, p5

    .line 168
    .line 169
    check-cast v8, Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    and-int/lit8 v1, v8, 0x6

    .line 182
    .line 183
    if-nez v1, :cond_7

    .line 184
    .line 185
    invoke-virtual {v14, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_6

    .line 190
    .line 191
    move v3, v4

    .line 192
    :cond_6
    or-int/2addr v8, v3

    .line 193
    :cond_7
    and-int/lit16 v1, v8, 0x403

    .line 194
    .line 195
    const/16 v3, 0x402

    .line 196
    .line 197
    if-eq v1, v3, :cond_8

    .line 198
    .line 199
    move v2, v5

    .line 200
    :cond_8
    and-int/lit8 v1, v8, 0x1

    .line 201
    .line 202
    invoke-virtual {v14, v1, v2}, La/fet;->U(IZ)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-eqz v1, :cond_b

    .line 207
    .line 208
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    check-cast v1, Ljava/lang/Number;

    .line 213
    .line 214
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    invoke-virtual {v6, v1}, La/agk0;->m(F)V

    .line 219
    .line 220
    .line 221
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    check-cast v1, La/qyp;

    .line 226
    .line 227
    iget-object v9, v1, La/qyp;->a:La/pyp;

    .line 228
    .line 229
    iget-object v1, v0, La/axp;->e:Lkotlin/jvm/functions/Function1;

    .line 230
    .line 231
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    if-nez v2, :cond_9

    .line 240
    .line 241
    sget-object v2, La/ukd;->a:La/cl5;

    .line 242
    .line 243
    if-ne v3, v2, :cond_a

    .line 244
    .line 245
    :cond_9
    new-instance v3, La/mfp;

    .line 246
    .line 247
    const/16 v2, 0x16

    .line 248
    .line 249
    invoke-direct {v3, v1, v2}, La/mfp;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v14, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :cond_a
    move-object v13, v3

    .line 256
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 257
    .line 258
    shl-int/lit8 v1, v8, 0x6

    .line 259
    .line 260
    and-int/lit16 v15, v1, 0x380

    .line 261
    .line 262
    const/4 v8, 0x0

    .line 263
    iget v11, v0, La/axp;->c:F

    .line 264
    .line 265
    iget v12, v0, La/axp;->d:F

    .line 266
    .line 267
    invoke-static/range {v8 .. v15}, La/u1c;->n(La/mm40;La/pyp;La/l7m0;FFLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 268
    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_b
    invoke-virtual {v14}, La/fet;->X()V

    .line 272
    .line 273
    .line 274
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object v0

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
