.class public final synthetic La/h57;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z77;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/z77;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h57;->a:B

    iput-object p1, p0, La/h57;->b:La/z77;

    iput-object p2, p0, La/h57;->c:Lkotlin/jvm/functions/Function1;

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
    iget-byte v1, v0, La/h57;->a:B

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
    iget-object v6, v0, La/h57;->c:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iget-object v0, v0, La/h57;->b:La/z77;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/g9z;

    .line 21
    .line 22
    move-object/from16 v10, p2

    .line 23
    .line 24
    check-cast v10, La/fet;

    .line 25
    .line 26
    move-object/from16 v7, p3

    .line 27
    .line 28
    check-cast v7, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v7

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
    invoke-virtual {v10, v1, v3}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    check-cast v0, La/x77;

    .line 51
    .line 52
    iget-object v0, v0, La/x77;->h:La/rv7;

    .line 53
    .line 54
    check-cast v0, La/pv7;

    .line 55
    .line 56
    iget-object v8, v0, La/pv7;->a:La/dn7;

    .line 57
    .line 58
    invoke-virtual {v10, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    if-ne v1, v2, :cond_2

    .line 69
    .line 70
    :cond_1
    new-instance v1, La/gno0;

    .line 71
    .line 72
    const/4 v0, 0x6

    .line 73
    invoke-direct {v1, v6, v0}, La/gno0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v10, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    move-object v9, v1

    .line 80
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 81
    .line 82
    const/4 v11, 0x0

    .line 83
    const/4 v12, 0x1

    .line 84
    const/4 v7, 0x0

    .line 85
    invoke-static/range {v7 .. v12}, La/x4d0;->h(La/mm40;La/dn7;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    invoke-virtual {v10}, La/fet;->X()V

    .line 90
    .line 91
    .line 92
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_0
    move-object/from16 v1, p1

    .line 96
    .line 97
    check-cast v1, La/g9z;

    .line 98
    .line 99
    move-object/from16 v10, p2

    .line 100
    .line 101
    check-cast v10, La/fet;

    .line 102
    .line 103
    move-object/from16 v7, p3

    .line 104
    .line 105
    check-cast v7, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    and-int/lit8 v1, v7, 0x11

    .line 115
    .line 116
    if-eq v1, v4, :cond_4

    .line 117
    .line 118
    move v3, v5

    .line 119
    :cond_4
    and-int/lit8 v1, v7, 0x1

    .line 120
    .line 121
    invoke-virtual {v10, v1, v3}, La/fet;->U(IZ)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_7

    .line 126
    .line 127
    sget-object v1, La/qmk;->a:La/zcl;

    .line 128
    .line 129
    const/4 v15, 0x0

    .line 130
    const/16 v16, 0xd

    .line 131
    .line 132
    sget-object v11, La/jm40;->b:La/jm40;

    .line 133
    .line 134
    const/4 v12, 0x0

    .line 135
    const/high16 v13, 0x41000000    # 8.0f

    .line 136
    .line 137
    const/4 v14, 0x0

    .line 138
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    check-cast v0, La/x77;

    .line 143
    .line 144
    iget-object v0, v0, La/x77;->h:La/rv7;

    .line 145
    .line 146
    check-cast v0, La/pv7;

    .line 147
    .line 148
    iget-object v8, v0, La/pv7;->a:La/dn7;

    .line 149
    .line 150
    invoke-virtual {v10, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    if-nez v0, :cond_5

    .line 159
    .line 160
    if-ne v1, v2, :cond_6

    .line 161
    .line 162
    :cond_5
    new-instance v1, La/xv50;

    .line 163
    .line 164
    const/16 v0, 0xe

    .line 165
    .line 166
    invoke-direct {v1, v6, v0}, La/xv50;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v10, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_6
    move-object v9, v1

    .line 173
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 174
    .line 175
    const/4 v11, 0x0

    .line 176
    const/4 v12, 0x0

    .line 177
    invoke-static/range {v7 .. v12}, La/x4d0;->h(La/mm40;La/dn7;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_7
    invoke-virtual {v10}, La/fet;->X()V

    .line 182
    .line 183
    .line 184
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_1
    move-object/from16 v1, p1

    .line 188
    .line 189
    check-cast v1, La/g9z;

    .line 190
    .line 191
    move-object/from16 v10, p2

    .line 192
    .line 193
    check-cast v10, La/fet;

    .line 194
    .line 195
    move-object/from16 v7, p3

    .line 196
    .line 197
    check-cast v7, Ljava/lang/Integer;

    .line 198
    .line 199
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    and-int/lit8 v1, v7, 0x11

    .line 207
    .line 208
    if-eq v1, v4, :cond_8

    .line 209
    .line 210
    move v3, v5

    .line 211
    :cond_8
    and-int/lit8 v1, v7, 0x1

    .line 212
    .line 213
    invoke-virtual {v10, v1, v3}, La/fet;->U(IZ)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_b

    .line 218
    .line 219
    check-cast v0, La/x77;

    .line 220
    .line 221
    iget-object v0, v0, La/x77;->h:La/rv7;

    .line 222
    .line 223
    check-cast v0, La/pv7;

    .line 224
    .line 225
    iget-object v8, v0, La/pv7;->a:La/dn7;

    .line 226
    .line 227
    invoke-virtual {v10, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    if-nez v0, :cond_9

    .line 236
    .line 237
    if-ne v1, v2, :cond_a

    .line 238
    .line 239
    :cond_9
    new-instance v1, La/to6;

    .line 240
    .line 241
    const/4 v0, 0x5

    .line 242
    invoke-direct {v1, v6, v0}, La/to6;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v10, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    :cond_a
    move-object v9, v1

    .line 249
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 250
    .line 251
    const/4 v11, 0x0

    .line 252
    const/4 v12, 0x1

    .line 253
    const/4 v7, 0x0

    .line 254
    invoke-static/range {v7 .. v12}, La/x4d0;->h(La/mm40;La/dn7;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 255
    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_b
    invoke-virtual {v10}, La/fet;->X()V

    .line 259
    .line 260
    .line 261
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object v0

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
