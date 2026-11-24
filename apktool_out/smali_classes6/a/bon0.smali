.class public final synthetic La/bon0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/don0;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/don0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bon0;->a:B

    iput-object p1, p0, La/bon0;->b:La/l7m0;

    iput-object p2, p0, La/bon0;->c:La/don0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bon0;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x10

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, v0, La/bon0;->b:La/l7m0;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, La/y5d;

    .line 19
    .line 20
    move-object/from16 v11, p2

    .line 21
    .line 22
    check-cast v11, La/fet;

    .line 23
    .line 24
    move-object/from16 v7, p3

    .line 25
    .line 26
    check-cast v7, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    sget-object v8, La/don0;->n2:La/m6m0;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    and-int/lit8 v1, v7, 0x11

    .line 38
    .line 39
    if-eq v1, v4, :cond_0

    .line 40
    .line 41
    move v3, v5

    .line 42
    :cond_0
    and-int/lit8 v1, v7, 0x1

    .line 43
    .line 44
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    sget-object v1, La/qmk;->a:La/zcl;

    .line 51
    .line 52
    const/4 v12, 0x0

    .line 53
    const/4 v13, 0x5

    .line 54
    const/4 v7, 0x0

    .line 55
    const/high16 v8, 0x40800000    # 4.0f

    .line 56
    .line 57
    const-wide/16 v9, 0x0

    .line 58
    .line 59
    invoke-static/range {v7 .. v13}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, La/oon0;

    .line 67
    .line 68
    iget-object v8, v1, La/oon0;->b:Ljava/lang/String;

    .line 69
    .line 70
    const/16 v16, 0x0

    .line 71
    .line 72
    const/16 v17, 0x3d

    .line 73
    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    move-object v15, v11

    .line 77
    const-wide/16 v11, 0x0

    .line 78
    .line 79
    const-wide/16 v13, 0x0

    .line 80
    .line 81
    invoke-static/range {v7 .. v17}, La/kkb;->m(La/mm40;Ljava/lang/String;La/ro8;IJJLa/fet;II)V

    .line 82
    .line 83
    .line 84
    move-object v11, v15

    .line 85
    const/4 v12, 0x0

    .line 86
    const/4 v13, 0x5

    .line 87
    const/high16 v8, 0x41000000    # 8.0f

    .line 88
    .line 89
    const-wide/16 v9, 0x0

    .line 90
    .line 91
    invoke-static/range {v7 .. v13}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, La/oon0;

    .line 99
    .line 100
    iget-object v8, v1, La/oon0;->c:Ljava/lang/String;

    .line 101
    .line 102
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, La/oon0;

    .line 107
    .line 108
    iget-object v9, v1, La/oon0;->d:La/yvl;

    .line 109
    .line 110
    iget-object v7, v0, La/bon0;->c:La/don0;

    .line 111
    .line 112
    invoke-virtual {v11, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    if-nez v0, :cond_1

    .line 121
    .line 122
    if-ne v1, v2, :cond_2

    .line 123
    .line 124
    :cond_1
    new-instance v1, La/con0;

    .line 125
    .line 126
    const/4 v0, 0x4

    .line 127
    invoke-direct {v1, v7, v0}, La/con0;-><init>(La/don0;B)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v11, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_2
    move-object v10, v1

    .line 134
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 135
    .line 136
    const/4 v12, 0x0

    .line 137
    invoke-virtual/range {v7 .. v12}, La/don0;->P0(Ljava/lang/String;La/yvl;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 138
    .line 139
    .line 140
    const/4 v13, 0x5

    .line 141
    const/4 v7, 0x0

    .line 142
    const/high16 v8, 0x41400000    # 12.0f

    .line 143
    .line 144
    const-wide/16 v9, 0x0

    .line 145
    .line 146
    invoke-static/range {v7 .. v13}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_3
    invoke-virtual {v11}, La/fet;->X()V

    .line 151
    .line 152
    .line 153
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object v0

    .line 156
    :pswitch_0
    move-object/from16 v1, p1

    .line 157
    .line 158
    check-cast v1, La/ir8;

    .line 159
    .line 160
    move-object/from16 v15, p2

    .line 161
    .line 162
    check-cast v15, La/fet;

    .line 163
    .line 164
    move-object/from16 v7, p3

    .line 165
    .line 166
    check-cast v7, Ljava/lang/Integer;

    .line 167
    .line 168
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    sget-object v8, La/don0;->n2:La/m6m0;

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    and-int/lit8 v1, v7, 0x11

    .line 178
    .line 179
    if-eq v1, v4, :cond_4

    .line 180
    .line 181
    move v3, v5

    .line 182
    :cond_4
    and-int/lit8 v1, v7, 0x1

    .line 183
    .line 184
    invoke-virtual {v15, v1, v3}, La/fet;->U(IZ)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_9

    .line 189
    .line 190
    sget-object v8, La/vul;->a:La/vul;

    .line 191
    .line 192
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    check-cast v1, La/oon0;

    .line 197
    .line 198
    iget-object v9, v1, La/oon0;->f:La/wul;

    .line 199
    .line 200
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    check-cast v1, La/oon0;

    .line 205
    .line 206
    iget-object v10, v1, La/oon0;->e:La/wul;

    .line 207
    .line 208
    iget-object v0, v0, La/bon0;->c:La/don0;

    .line 209
    .line 210
    invoke-virtual {v15, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    if-nez v1, :cond_5

    .line 219
    .line 220
    if-ne v3, v2, :cond_6

    .line 221
    .line 222
    :cond_5
    new-instance v3, La/con0;

    .line 223
    .line 224
    const/4 v1, 0x2

    .line 225
    invoke-direct {v3, v0, v1}, La/con0;-><init>(La/don0;B)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v15, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_6
    move-object v13, v3

    .line 232
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 233
    .line 234
    invoke-virtual {v15, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    if-nez v1, :cond_7

    .line 243
    .line 244
    if-ne v3, v2, :cond_8

    .line 245
    .line 246
    :cond_7
    new-instance v3, La/con0;

    .line 247
    .line 248
    const/4 v1, 0x3

    .line 249
    invoke-direct {v3, v0, v1}, La/con0;-><init>(La/don0;B)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v15, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :cond_8
    move-object v14, v3

    .line 256
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 257
    .line 258
    const/16 v16, 0x30

    .line 259
    .line 260
    const/16 v17, 0x11

    .line 261
    .line 262
    const/4 v7, 0x0

    .line 263
    const-wide/16 v11, 0x0

    .line 264
    .line 265
    invoke-static/range {v7 .. v17}, La/gkb;->i(La/mm40;La/vul;La/wul;La/wul;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 266
    .line 267
    .line 268
    goto :goto_1

    .line 269
    :cond_9
    invoke-virtual {v15}, La/fet;->X()V

    .line 270
    .line 271
    .line 272
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object v0

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
