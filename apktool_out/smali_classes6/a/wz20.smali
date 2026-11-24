.class public final synthetic La/wz20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wz20;->a:B

    iput-object p1, p0, La/wz20;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/wz20;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wz20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    const/16 v4, 0x20

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/fv20;

    .line 17
    .line 18
    move-object/from16 v7, p2

    .line 19
    .line 20
    check-cast v7, La/d4n;

    .line 21
    .line 22
    move-object/from16 v6, p3

    .line 23
    .line 24
    check-cast v6, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-object/from16 v11, p4

    .line 30
    .line 31
    check-cast v11, La/fet;

    .line 32
    .line 33
    move-object/from16 v6, p5

    .line 34
    .line 35
    check-cast v6, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    and-int/lit8 v1, v6, 0x30

    .line 48
    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    invoke-virtual {v11, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    move v3, v4

    .line 58
    :cond_0
    or-int/2addr v6, v3

    .line 59
    :cond_1
    and-int/lit16 v1, v6, 0x411

    .line 60
    .line 61
    const/16 v3, 0x410

    .line 62
    .line 63
    if-eq v1, v3, :cond_2

    .line 64
    .line 65
    move v2, v5

    .line 66
    :cond_2
    and-int/lit8 v1, v6, 0x1

    .line 67
    .line 68
    invoke-virtual {v11, v1, v2}, La/fet;->U(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    sget-object v1, La/kr00;->a:La/zfn;

    .line 75
    .line 76
    invoke-virtual {v11, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    and-int/lit8 v12, v6, 0x70

    .line 87
    .line 88
    const/4 v13, 0x1

    .line 89
    const/4 v6, 0x0

    .line 90
    iget-object v9, v0, La/wz20;->b:Lkotlin/jvm/functions/Function1;

    .line 91
    .line 92
    iget-object v10, v0, La/wz20;->c:Lkotlin/jvm/functions/Function1;

    .line 93
    .line 94
    invoke-static/range {v6 .. v13}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    invoke-virtual {v11}, La/fet;->X()V

    .line 99
    .line 100
    .line 101
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_0
    move-object/from16 v1, p1

    .line 105
    .line 106
    check-cast v1, La/fv20;

    .line 107
    .line 108
    move-object/from16 v7, p2

    .line 109
    .line 110
    check-cast v7, La/d4n;

    .line 111
    .line 112
    move-object/from16 v6, p3

    .line 113
    .line 114
    check-cast v6, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    move-object/from16 v11, p4

    .line 121
    .line 122
    check-cast v11, La/fet;

    .line 123
    .line 124
    move-object/from16 v8, p5

    .line 125
    .line 126
    check-cast v8, Ljava/lang/Integer;

    .line 127
    .line 128
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    and-int/lit8 v9, v8, 0x6

    .line 139
    .line 140
    if-nez v9, :cond_5

    .line 141
    .line 142
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-eqz v9, :cond_4

    .line 147
    .line 148
    const/4 v9, 0x4

    .line 149
    goto :goto_1

    .line 150
    :cond_4
    const/4 v9, 0x2

    .line 151
    :goto_1
    or-int/2addr v9, v8

    .line 152
    goto :goto_2

    .line 153
    :cond_5
    move v9, v8

    .line 154
    :goto_2
    and-int/lit8 v10, v8, 0x30

    .line 155
    .line 156
    if-nez v10, :cond_7

    .line 157
    .line 158
    invoke-virtual {v11, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-eqz v10, :cond_6

    .line 163
    .line 164
    move v3, v4

    .line 165
    :cond_6
    or-int/2addr v9, v3

    .line 166
    :cond_7
    and-int/lit16 v3, v8, 0x180

    .line 167
    .line 168
    if-nez v3, :cond_9

    .line 169
    .line 170
    invoke-virtual {v11, v6}, La/fet;->e(I)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_8

    .line 175
    .line 176
    const/16 v3, 0x100

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_8
    const/16 v3, 0x80

    .line 180
    .line 181
    :goto_3
    or-int/2addr v9, v3

    .line 182
    :cond_9
    and-int/lit16 v3, v9, 0x493

    .line 183
    .line 184
    const/16 v4, 0x492

    .line 185
    .line 186
    if-eq v3, v4, :cond_a

    .line 187
    .line 188
    move v2, v5

    .line 189
    :cond_a
    and-int/lit8 v3, v9, 0x1

    .line 190
    .line 191
    invoke-virtual {v11, v3, v2}, La/fet;->U(IZ)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_d

    .line 196
    .line 197
    const/high16 v2, 0x40000000    # 2.0f

    .line 198
    .line 199
    sget-object v3, La/qmk;->a:La/zcl;

    .line 200
    .line 201
    if-nez v6, :cond_b

    .line 202
    .line 203
    const/high16 v3, 0x41400000    # 12.0f

    .line 204
    .line 205
    move v14, v3

    .line 206
    goto :goto_4

    .line 207
    :cond_b
    move v14, v2

    .line 208
    :goto_4
    iget-object v1, v1, La/fv20;->b:La/a4x;

    .line 209
    .line 210
    invoke-static {v1}, La/q3d;->i(Ljava/util/List;)I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-ne v6, v1, :cond_c

    .line 215
    .line 216
    const/high16 v2, 0x41000000    # 8.0f

    .line 217
    .line 218
    :cond_c
    move/from16 v16, v2

    .line 219
    .line 220
    const/16 v17, 0x5

    .line 221
    .line 222
    sget-object v12, La/jm40;->b:La/jm40;

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v15, 0x0

    .line 226
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    sget-object v1, La/kr00;->a:La/zfn;

    .line 231
    .line 232
    invoke-virtual {v11, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    check-cast v1, Ljava/lang/Boolean;

    .line 237
    .line 238
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 239
    .line 240
    .line 241
    move-result v8

    .line 242
    and-int/lit8 v12, v9, 0x70

    .line 243
    .line 244
    const/4 v13, 0x0

    .line 245
    iget-object v9, v0, La/wz20;->b:Lkotlin/jvm/functions/Function1;

    .line 246
    .line 247
    iget-object v10, v0, La/wz20;->c:Lkotlin/jvm/functions/Function1;

    .line 248
    .line 249
    invoke-static/range {v6 .. v13}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 250
    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_d
    invoke-virtual {v11}, La/fet;->X()V

    .line 254
    .line 255
    .line 256
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
