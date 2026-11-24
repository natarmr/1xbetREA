.class public final synthetic La/yuc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fq8;


# direct methods
.method public synthetic constructor <init>(La/fq8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yuc;->a:B

    iput-object p1, p0, La/yuc;->b:La/fq8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yuc;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v0, v0, La/yuc;->b:La/fq8;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/y5d;

    .line 17
    .line 18
    move-object/from16 v13, p2

    .line 19
    .line 20
    check-cast v13, La/fet;

    .line 21
    .line 22
    move-object/from16 v5, p3

    .line 23
    .line 24
    check-cast v5, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    and-int/lit8 v1, v5, 0x11

    .line 34
    .line 35
    if-eq v1, v3, :cond_0

    .line 36
    .line 37
    move v2, v4

    .line 38
    :cond_0
    and-int/lit8 v1, v5, 0x1

    .line 39
    .line 40
    invoke-virtual {v13, v1, v2}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    sget-object v1, La/qmk;->a:La/zcl;

    .line 47
    .line 48
    const/high16 v1, 0x41800000    # 16.0f

    .line 49
    .line 50
    sget-object v2, La/jm40;->b:La/jm40;

    .line 51
    .line 52
    invoke-static {v2, v1}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v15, La/uui0;

    .line 57
    .line 58
    iget-object v0, v0, La/fq8;->a:La/ao4;

    .line 59
    .line 60
    iget v1, v0, La/ao4;->b:I

    .line 61
    .line 62
    iget-object v7, v0, La/ao4;->d:Ljava/lang/String;

    .line 63
    .line 64
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 65
    .line 66
    invoke-virtual {v13, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 71
    .line 72
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    new-instance v8, La/y3d;

    .line 77
    .line 78
    invoke-direct {v8, v3, v4}, La/y3d;-><init>(J)V

    .line 79
    .line 80
    .line 81
    iget-object v9, v0, La/ao4;->f:Ljava/lang/String;

    .line 82
    .line 83
    const/4 v11, 0x0

    .line 84
    const/16 v12, 0x38

    .line 85
    .line 86
    const/4 v10, 0x0

    .line 87
    move-object v6, v15

    .line 88
    invoke-direct/range {v6 .. v12}, La/uui0;-><init>(Ljava/lang/String;La/y3d;Ljava/lang/String;La/y3d;Ljava/lang/Integer;I)V

    .line 89
    .line 90
    .line 91
    sget-object v18, La/d4d;->z:La/d4d;

    .line 92
    .line 93
    new-instance v0, La/pc5;

    .line 94
    .line 95
    invoke-virtual {v13, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 100
    .line 101
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 102
    .line 103
    .line 104
    move-result-wide v2

    .line 105
    new-instance v4, La/y3d;

    .line 106
    .line 107
    invoke-direct {v4, v2, v3}, La/y3d;-><init>(J)V

    .line 108
    .line 109
    .line 110
    invoke-direct {v0, v4}, La/pc5;-><init>(La/y3d;)V

    .line 111
    .line 112
    .line 113
    sget-object v2, La/m8m0;->a:La/zfn;

    .line 114
    .line 115
    invoke-virtual {v13, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 120
    .line 121
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 122
    .line 123
    .line 124
    move-result-wide v2

    .line 125
    new-instance v4, La/m0x;

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    const/4 v7, 0x6

    .line 129
    invoke-direct {v4, v1, v6, v7}, La/m0x;-><init>(ILa/bzw;I)V

    .line 130
    .line 131
    .line 132
    new-instance v16, La/nui0;

    .line 133
    .line 134
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v20

    .line 138
    new-instance v1, La/y3d;

    .line 139
    .line 140
    invoke-direct {v1, v2, v3}, La/y3d;-><init>(J)V

    .line 141
    .line 142
    .line 143
    const/16 v26, 0x0

    .line 144
    .line 145
    const/16 v27, 0xd2

    .line 146
    .line 147
    const/16 v21, 0x0

    .line 148
    .line 149
    const/16 v24, 0x0

    .line 150
    .line 151
    move-object/from16 v25, v0

    .line 152
    .line 153
    move-object/from16 v23, v1

    .line 154
    .line 155
    move-object/from16 v22, v4

    .line 156
    .line 157
    move-object/from16 v19, v16

    .line 158
    .line 159
    invoke-direct/range {v19 .. v27}, La/nui0;-><init>(Ljava/lang/Integer;La/y3d;La/o0x;La/y3d;La/y3d;La/rc5;FI)V

    .line 160
    .line 161
    .line 162
    new-instance v14, La/rqm;

    .line 163
    .line 164
    const/16 v22, 0x0

    .line 165
    .line 166
    const/16 v23, 0x1ec

    .line 167
    .line 168
    const/16 v17, 0x0

    .line 169
    .line 170
    const/16 v19, 0x0

    .line 171
    .line 172
    const/16 v20, 0x0

    .line 173
    .line 174
    const/16 v21, 0x0

    .line 175
    .line 176
    invoke-direct/range {v14 .. v23}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 177
    .line 178
    .line 179
    const/4 v0, 0x0

    .line 180
    const/16 v15, 0xfc

    .line 181
    .line 182
    const/4 v7, 0x0

    .line 183
    const/4 v8, 0x0

    .line 184
    const/4 v9, 0x0

    .line 185
    const/4 v12, 0x0

    .line 186
    move-object v6, v14

    .line 187
    move v14, v0

    .line 188
    invoke-static/range {v5 .. v15}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 189
    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_1
    invoke-virtual {v13}, La/fet;->X()V

    .line 193
    .line 194
    .line 195
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_0
    move-object/from16 v1, p1

    .line 199
    .line 200
    check-cast v1, La/y5d;

    .line 201
    .line 202
    move-object/from16 v12, p2

    .line 203
    .line 204
    check-cast v12, La/fet;

    .line 205
    .line 206
    move-object/from16 v5, p3

    .line 207
    .line 208
    check-cast v5, Ljava/lang/Integer;

    .line 209
    .line 210
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    and-int/lit8 v1, v5, 0x11

    .line 218
    .line 219
    if-eq v1, v3, :cond_2

    .line 220
    .line 221
    move v2, v4

    .line 222
    :cond_2
    and-int/lit8 v1, v5, 0x1

    .line 223
    .line 224
    invoke-virtual {v12, v1, v2}, La/fet;->U(IZ)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-eqz v1, :cond_3

    .line 229
    .line 230
    iget-object v6, v0, La/fq8;->b:Ljava/lang/String;

    .line 231
    .line 232
    const/4 v13, 0x0

    .line 233
    const/16 v14, 0x1d

    .line 234
    .line 235
    const/4 v5, 0x0

    .line 236
    const-wide/16 v7, 0x0

    .line 237
    .line 238
    const/4 v9, 0x0

    .line 239
    const-wide/16 v10, 0x0

    .line 240
    .line 241
    invoke-static/range {v5 .. v14}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_3
    invoke-virtual {v12}, La/fet;->X()V

    .line 246
    .line 247
    .line 248
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object v0

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
