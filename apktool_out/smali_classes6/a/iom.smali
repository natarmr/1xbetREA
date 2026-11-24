.class public final synthetic La/iom;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLa/wom;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/iom;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/iom;->b:J

    iput-object p3, p0, La/iom;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/iom;->a:B

    iput-object p1, p0, La/iom;->c:Ljava/lang/Object;

    iput-wide p2, p0, La/iom;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iom;->a:B

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/iom;->c:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v5, La/mm40;

    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, La/yhg0;

    .line 19
    .line 20
    move-object/from16 v11, p2

    .line 21
    .line 22
    check-cast v11, La/fet;

    .line 23
    .line 24
    move-object/from16 v6, p3

    .line 25
    .line 26
    check-cast v6, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    and-int/lit8 v1, v6, 0x11

    .line 36
    .line 37
    if-eq v1, v2, :cond_0

    .line 38
    .line 39
    move v1, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v1, v4

    .line 42
    :goto_0
    and-int/lit8 v2, v6, 0x1

    .line 43
    .line 44
    invoke-virtual {v11, v2, v1}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    sget-object v1, La/qmk;->a:La/zcl;

    .line 51
    .line 52
    const/high16 v1, 0x41a00000    # 20.0f

    .line 53
    .line 54
    invoke-static {v5, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    const v1, 0x7f0807e4

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v4, v11}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    const/16 v12, 0x38

    .line 66
    .line 67
    const/4 v13, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    iget-wide v9, v0, La/iom;->b:J

    .line 70
    .line 71
    invoke-static/range {v6 .. v13}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {v11}, La/fet;->X()V

    .line 76
    .line 77
    .line 78
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_0
    check-cast v5, La/wom;

    .line 82
    .line 83
    move-object/from16 v1, p1

    .line 84
    .line 85
    check-cast v1, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    move-object/from16 v14, p2

    .line 92
    .line 93
    check-cast v14, La/fet;

    .line 94
    .line 95
    move-object/from16 v2, p3

    .line 96
    .line 97
    check-cast v2, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    and-int/lit8 v6, v2, 0x6

    .line 104
    .line 105
    if-nez v6, :cond_3

    .line 106
    .line 107
    invoke-virtual {v14, v1}, La/fet;->h(Z)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-eqz v6, :cond_2

    .line 112
    .line 113
    const/4 v6, 0x4

    .line 114
    goto :goto_2

    .line 115
    :cond_2
    const/4 v6, 0x2

    .line 116
    :goto_2
    or-int/2addr v2, v6

    .line 117
    :cond_3
    and-int/lit8 v6, v2, 0x13

    .line 118
    .line 119
    const/16 v7, 0x12

    .line 120
    .line 121
    if-eq v6, v7, :cond_4

    .line 122
    .line 123
    move v6, v3

    .line 124
    goto :goto_3

    .line 125
    :cond_4
    move v6, v4

    .line 126
    :goto_3
    and-int/2addr v2, v3

    .line 127
    invoke-virtual {v14, v2, v6}, La/fet;->U(IZ)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_8

    .line 132
    .line 133
    iget-wide v7, v0, La/iom;->b:J

    .line 134
    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    const v0, -0x2d42ece1

    .line 138
    .line 139
    .line 140
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 141
    .line 142
    .line 143
    sget v9, La/mom;->d:F

    .line 144
    .line 145
    sget-object v0, La/jm40;->b:La/jm40;

    .line 146
    .line 147
    sget v1, La/mom;->a:F

    .line 148
    .line 149
    invoke-static {v0, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    const/16 v15, 0x186

    .line 154
    .line 155
    const/16 v16, 0x38

    .line 156
    .line 157
    const-wide/16 v10, 0x0

    .line 158
    .line 159
    const/4 v12, 0x0

    .line 160
    const/4 v13, 0x0

    .line 161
    invoke-static/range {v6 .. v16}, La/p3c0;->a(La/mm40;JFJIFLa/fet;II)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v14, v4}, La/fet;->r(Z)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_5
    const v0, -0x2d3fb1ee

    .line 169
    .line 170
    .line 171
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v14, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    if-nez v0, :cond_6

    .line 183
    .line 184
    sget-object v0, La/ukd;->a:La/cl5;

    .line 185
    .line 186
    if-ne v1, v0, :cond_7

    .line 187
    .line 188
    :cond_6
    new-instance v1, La/ntl;

    .line 189
    .line 190
    const/16 v0, 0x8

    .line 191
    .line 192
    invoke-direct {v1, v5, v0}, La/ntl;-><init>(Ljava/lang/Object;B)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_7
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 199
    .line 200
    invoke-static {v7, v8, v1, v14, v4}, La/mom;->a(JLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v14, v4}, La/fet;->r(Z)V

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_8
    invoke-virtual {v14}, La/fet;->X()V

    .line 208
    .line 209
    .line 210
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object v0

    .line 213
    :pswitch_1
    check-cast v5, La/wom;

    .line 214
    .line 215
    move-object/from16 v1, p1

    .line 216
    .line 217
    check-cast v1, La/ir8;

    .line 218
    .line 219
    move-object/from16 v11, p2

    .line 220
    .line 221
    check-cast v11, La/fet;

    .line 222
    .line 223
    move-object/from16 v6, p3

    .line 224
    .line 225
    check-cast v6, Ljava/lang/Integer;

    .line 226
    .line 227
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    and-int/lit8 v1, v6, 0x11

    .line 235
    .line 236
    if-eq v1, v2, :cond_9

    .line 237
    .line 238
    move v4, v3

    .line 239
    :cond_9
    and-int/lit8 v1, v6, 0x1

    .line 240
    .line 241
    invoke-virtual {v11, v1, v4}, La/fet;->U(IZ)Z

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    if-eqz v1, :cond_a

    .line 246
    .line 247
    iget-object v1, v5, La/wom;->c:La/pz40;

    .line 248
    .line 249
    check-cast v1, La/hgk0;

    .line 250
    .line 251
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    move-object v6, v1

    .line 256
    check-cast v6, Ljava/lang/Boolean;

    .line 257
    .line 258
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    new-instance v1, La/iom;

    .line 262
    .line 263
    iget-wide v2, v0, La/iom;->b:J

    .line 264
    .line 265
    invoke-direct {v1, v2, v3, v5}, La/iom;-><init>(JLa/wom;)V

    .line 266
    .line 267
    .line 268
    const v0, 0xdc3c901

    .line 269
    .line 270
    .line 271
    invoke-static {v0, v1, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    const/16 v12, 0x6000

    .line 276
    .line 277
    const/16 v13, 0xe

    .line 278
    .line 279
    const/4 v7, 0x0

    .line 280
    const/4 v8, 0x0

    .line 281
    const/4 v9, 0x0

    .line 282
    invoke-static/range {v6 .. v13}, La/jwb;->e(Ljava/lang/Object;La/mm40;La/cfq;Ljava/lang/String;La/ugd;La/fet;II)V

    .line 283
    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_a
    invoke-virtual {v11}, La/fet;->X()V

    .line 287
    .line 288
    .line 289
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object v0

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
