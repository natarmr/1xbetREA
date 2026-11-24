.class public final synthetic La/yz8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jjm;


# direct methods
.method public synthetic constructor <init>(La/jjm;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yz8;->a:B

    iput-object p1, p0, La/yz8;->b:La/jjm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yz8;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41800000    # 16.0f

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/high16 v4, 0x3f800000    # 1.0f

    .line 9
    .line 10
    sget-object v5, La/jm40;->b:La/jm40;

    .line 11
    .line 12
    const/16 v6, 0x10

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/g9z;

    .line 23
    .line 24
    move-object/from16 v2, p2

    .line 25
    .line 26
    check-cast v2, La/fet;

    .line 27
    .line 28
    move-object/from16 v10, p3

    .line 29
    .line 30
    check-cast v10, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v1, v10, 0x11

    .line 40
    .line 41
    if-eq v1, v6, :cond_0

    .line 42
    .line 43
    move v8, v7

    .line 44
    :cond_0
    and-int/lit8 v1, v10, 0x1

    .line 45
    .line 46
    invoke-virtual {v2, v1, v8}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    sget-object v1, La/qmk;->a:La/zcl;

    .line 57
    .line 58
    const/4 v14, 0x0

    .line 59
    const/16 v15, 0x8

    .line 60
    .line 61
    const/high16 v11, 0x41400000    # 12.0f

    .line 62
    .line 63
    const/high16 v12, 0x41400000    # 12.0f

    .line 64
    .line 65
    const/high16 v13, 0x41400000    # 12.0f

    .line 66
    .line 67
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    iget v4, v4, La/wfn;->e:F

    .line 76
    .line 77
    invoke-static {v1, v4, v9, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    sget-object v12, La/kjm;->b:La/kjm;

    .line 82
    .line 83
    const/16 v17, 0x180

    .line 84
    .line 85
    const/16 v18, 0x38

    .line 86
    .line 87
    iget-object v11, v0, La/yz8;->b:La/jjm;

    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const/4 v14, 0x0

    .line 91
    const/4 v15, 0x0

    .line 92
    move-object/from16 v16, v2

    .line 93
    .line 94
    invoke-static/range {v10 .. v18}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    move-object/from16 v16, v2

    .line 99
    .line 100
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 101
    .line 102
    .line 103
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_0
    move-object/from16 v1, p1

    .line 107
    .line 108
    check-cast v1, La/g9z;

    .line 109
    .line 110
    move-object/from16 v10, p2

    .line 111
    .line 112
    check-cast v10, La/fet;

    .line 113
    .line 114
    move-object/from16 v11, p3

    .line 115
    .line 116
    check-cast v11, Ljava/lang/Integer;

    .line 117
    .line 118
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    and-int/lit8 v1, v11, 0x11

    .line 126
    .line 127
    if-eq v1, v6, :cond_2

    .line 128
    .line 129
    move v8, v7

    .line 130
    :cond_2
    and-int/lit8 v1, v11, 0x1

    .line 131
    .line 132
    invoke-virtual {v10, v1, v8}, La/fet;->U(IZ)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_3

    .line 137
    .line 138
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    sget-object v1, La/qmk;->a:La/zcl;

    .line 143
    .line 144
    const/4 v15, 0x0

    .line 145
    const/16 v16, 0xd

    .line 146
    .line 147
    const/4 v12, 0x0

    .line 148
    const/high16 v13, 0x41800000    # 16.0f

    .line 149
    .line 150
    const/4 v14, 0x0

    .line 151
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-static {v1, v2, v9, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    sget-object v12, La/kjm;->b:La/kjm;

    .line 160
    .line 161
    const/16 v17, 0x180

    .line 162
    .line 163
    const/16 v18, 0x38

    .line 164
    .line 165
    iget-object v11, v0, La/yz8;->b:La/jjm;

    .line 166
    .line 167
    const/4 v13, 0x0

    .line 168
    const/4 v14, 0x0

    .line 169
    const/4 v15, 0x0

    .line 170
    move-object/from16 v16, v10

    .line 171
    .line 172
    move-object v10, v1

    .line 173
    invoke-static/range {v10 .. v18}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_3
    move-object/from16 v16, v10

    .line 178
    .line 179
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 180
    .line 181
    .line 182
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_1
    move-object/from16 v1, p1

    .line 186
    .line 187
    check-cast v1, La/g9z;

    .line 188
    .line 189
    move-object/from16 v10, p2

    .line 190
    .line 191
    check-cast v10, La/fet;

    .line 192
    .line 193
    move-object/from16 v11, p3

    .line 194
    .line 195
    check-cast v11, Ljava/lang/Integer;

    .line 196
    .line 197
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    and-int/lit8 v1, v11, 0x11

    .line 205
    .line 206
    if-eq v1, v6, :cond_4

    .line 207
    .line 208
    move v8, v7

    .line 209
    :cond_4
    and-int/lit8 v1, v11, 0x1

    .line 210
    .line 211
    invoke-virtual {v10, v1, v8}, La/fet;->U(IZ)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-eqz v1, :cond_5

    .line 216
    .line 217
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    sget-object v4, La/qmk;->a:La/zcl;

    .line 222
    .line 223
    invoke-static {v1, v2, v9, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    sget-object v12, La/kjm;->b:La/kjm;

    .line 228
    .line 229
    const/16 v17, 0x180

    .line 230
    .line 231
    const/16 v18, 0x38

    .line 232
    .line 233
    iget-object v11, v0, La/yz8;->b:La/jjm;

    .line 234
    .line 235
    const/4 v13, 0x0

    .line 236
    const/4 v14, 0x0

    .line 237
    const/4 v15, 0x0

    .line 238
    move-object/from16 v16, v10

    .line 239
    .line 240
    move-object v10, v1

    .line 241
    invoke-static/range {v10 .. v18}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 242
    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_5
    move-object/from16 v16, v10

    .line 246
    .line 247
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 248
    .line 249
    .line 250
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object v0

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
