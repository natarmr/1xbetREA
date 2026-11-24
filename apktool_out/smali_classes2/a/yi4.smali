.class public final synthetic La/yi4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wul;

.field public final synthetic c:La/wpq;

.field public final synthetic d:La/pkk0;

.field public final synthetic e:La/cj4;


# direct methods
.method public synthetic constructor <init>(La/wul;La/wpq;La/pkk0;La/cj4;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/yi4;->a:B

    iput-object p1, p0, La/yi4;->b:La/wul;

    iput-object p2, p0, La/yi4;->c:La/wpq;

    iput-object p3, p0, La/yi4;->d:La/pkk0;

    iput-object p4, p0, La/yi4;->e:La/cj4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yi4;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x90

    .line 9
    .line 10
    const/16 v5, 0x10

    .line 11
    .line 12
    const/16 v6, 0x20

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    iget-object v8, v0, La/yi4;->e:La/cj4;

    .line 16
    .line 17
    iget-object v9, v0, La/yi4;->d:La/pkk0;

    .line 18
    .line 19
    iget-object v10, v0, La/yi4;->c:La/wpq;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/y5d;

    .line 27
    .line 28
    move-object/from16 v11, p2

    .line 29
    .line 30
    check-cast v11, La/mm40;

    .line 31
    .line 32
    move-object/from16 v14, p3

    .line 33
    .line 34
    check-cast v14, La/fet;

    .line 35
    .line 36
    move-object/from16 v12, p4

    .line 37
    .line 38
    check-cast v12, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v12

    .line 44
    sget-object v13, La/cj4;->U1:La/gfk0;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    and-int/lit8 v1, v12, 0x30

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v14, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    move v5, v6

    .line 63
    :cond_0
    or-int/2addr v12, v5

    .line 64
    :cond_1
    and-int/lit16 v1, v12, 0x91

    .line 65
    .line 66
    if-eq v1, v4, :cond_2

    .line 67
    .line 68
    move v3, v7

    .line 69
    :cond_2
    and-int/lit8 v1, v12, 0x1

    .line 70
    .line 71
    invoke-virtual {v14, v1, v3}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    invoke-virtual {v14, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-virtual {v14, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    or-int/2addr v1, v3

    .line 86
    invoke-virtual {v14, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    or-int/2addr v1, v3

    .line 91
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    const/4 v4, 0x3

    .line 96
    if-nez v1, :cond_3

    .line 97
    .line 98
    if-ne v3, v2, :cond_4

    .line 99
    .line 100
    :cond_3
    new-instance v3, La/zi4;

    .line 101
    .line 102
    invoke-direct {v3, v10, v9, v8, v4}, La/zi4;-><init>(La/wpq;La/pkk0;La/cj4;B)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v14, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    move-object v13, v3

    .line 109
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 110
    .line 111
    shr-int/lit8 v1, v12, 0x3

    .line 112
    .line 113
    and-int/lit8 v15, v1, 0xe

    .line 114
    .line 115
    const/16 v16, 0x0

    .line 116
    .line 117
    iget-object v12, v0, La/yi4;->b:La/wul;

    .line 118
    .line 119
    invoke-static/range {v11 .. v16}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_5
    invoke-virtual {v14}, La/fet;->X()V

    .line 124
    .line 125
    .line 126
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_0
    move-object/from16 v1, p1

    .line 130
    .line 131
    check-cast v1, La/y5d;

    .line 132
    .line 133
    move-object/from16 v11, p2

    .line 134
    .line 135
    check-cast v11, La/mm40;

    .line 136
    .line 137
    move-object/from16 v15, p3

    .line 138
    .line 139
    check-cast v15, La/fet;

    .line 140
    .line 141
    move-object/from16 v12, p4

    .line 142
    .line 143
    check-cast v12, Ljava/lang/Integer;

    .line 144
    .line 145
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    sget-object v13, La/cj4;->U1:La/gfk0;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    and-int/lit8 v1, v12, 0x30

    .line 158
    .line 159
    if-nez v1, :cond_7

    .line 160
    .line 161
    invoke-virtual {v15, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_6

    .line 166
    .line 167
    move v5, v6

    .line 168
    :cond_6
    or-int/2addr v12, v5

    .line 169
    :cond_7
    and-int/lit16 v1, v12, 0x91

    .line 170
    .line 171
    if-eq v1, v4, :cond_8

    .line 172
    .line 173
    move v3, v7

    .line 174
    :cond_8
    and-int/lit8 v1, v12, 0x1

    .line 175
    .line 176
    invoke-virtual {v15, v1, v3}, La/fet;->U(IZ)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eqz v1, :cond_b

    .line 181
    .line 182
    sget-object v1, La/qmk;->a:La/zcl;

    .line 183
    .line 184
    const/high16 v20, 0x41400000    # 12.0f

    .line 185
    .line 186
    const/16 v21, 0x7

    .line 187
    .line 188
    sget-object v16, La/jm40;->b:La/jm40;

    .line 189
    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    const/16 v18, 0x0

    .line 193
    .line 194
    const/16 v19, 0x0

    .line 195
    .line 196
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-interface {v1, v11}, La/mm40;->e(La/mm40;)La/mm40;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    invoke-virtual {v15, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    invoke-virtual {v15, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    or-int/2addr v1, v3

    .line 213
    invoke-virtual {v15, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    or-int/2addr v1, v3

    .line 218
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    if-nez v1, :cond_9

    .line 223
    .line 224
    if-ne v3, v2, :cond_a

    .line 225
    .line 226
    :cond_9
    new-instance v3, La/zi4;

    .line 227
    .line 228
    const/4 v1, 0x2

    .line 229
    invoke-direct {v3, v10, v9, v8, v1}, La/zi4;-><init>(La/wpq;La/pkk0;La/cj4;B)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v15, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_a
    move-object v14, v3

    .line 236
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 237
    .line 238
    const/16 v16, 0x0

    .line 239
    .line 240
    const/16 v17, 0x0

    .line 241
    .line 242
    iget-object v13, v0, La/yi4;->b:La/wul;

    .line 243
    .line 244
    invoke-static/range {v12 .. v17}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 245
    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_b
    invoke-virtual {v15}, La/fet;->X()V

    .line 249
    .line 250
    .line 251
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object v0

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
