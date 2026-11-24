.class public final synthetic La/a2a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/q2a0;


# direct methods
.method public synthetic constructor <init>(La/q2a0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/a2a0;->a:B

    iput-object p1, p0, La/a2a0;->b:La/q2a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a2a0;->a:B

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const/high16 v4, 0x40000000    # 2.0f

    .line 11
    .line 12
    const/16 v5, 0x20

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/pi9;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v6, v1, La/pi9;->a:La/y99;

    .line 25
    .line 26
    invoke-interface {v6}, La/y99;->d()J

    .line 27
    .line 28
    .line 29
    move-result-wide v6

    .line 30
    shr-long v5, v6, v5

    .line 31
    .line 32
    long-to-int v5, v5

    .line 33
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    div-float v12, v5, v4

    .line 38
    .line 39
    iget-object v5, v1, La/pi9;->a:La/y99;

    .line 40
    .line 41
    invoke-interface {v5}, La/y99;->d()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    and-long/2addr v2, v5

    .line 46
    long-to-int v2, v2

    .line 47
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    div-float v13, v2, v4

    .line 52
    .line 53
    sget-object v2, La/qmk;->a:La/zcl;

    .line 54
    .line 55
    const/high16 v2, 0x428c0000    # 70.0f

    .line 56
    .line 57
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    mul-float/2addr v3, v2

    .line 62
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    mul-float/2addr v2, v4

    .line 67
    sub-float v10, v3, v2

    .line 68
    .line 69
    const/high16 v2, 0x41000000    # 8.0f

    .line 70
    .line 71
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    mul-float v11, v3, v2

    .line 76
    .line 77
    const/high16 v2, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    mul-float v15, v3, v2

    .line 84
    .line 85
    new-instance v14, Landroid/graphics/Paint;

    .line 86
    .line 87
    invoke-direct {v14}, Landroid/graphics/Paint;-><init>()V

    .line 88
    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 92
    .line 93
    .line 94
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 95
    .line 96
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    invoke-static {v2, v3}, La/fbc;->U(J)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 105
    .line 106
    .line 107
    sget-wide v2, La/qmk;->q:J

    .line 108
    .line 109
    invoke-interface {v1, v2, v3}, La/w6k;->X(J)F

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 114
    .line 115
    .line 116
    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 117
    .line 118
    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 119
    .line 120
    .line 121
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 122
    .line 123
    const/4 v3, 0x0

    .line 124
    invoke-static {v2, v3}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v14}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    iget v3, v2, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 136
    .line 137
    iget v5, v2, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 138
    .line 139
    sub-float/2addr v3, v5

    .line 140
    div-float v9, v3, v4

    .line 141
    .line 142
    iget-object v7, v0, La/a2a0;->b:La/q2a0;

    .line 143
    .line 144
    iget-object v0, v7, La/q2a0;->a:La/a4x;

    .line 145
    .line 146
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    new-instance v6, La/c2a0;

    .line 151
    .line 152
    move-object/from16 v16, v2

    .line 153
    .line 154
    invoke-direct/range {v6 .. v16}, La/c2a0;-><init>(La/q2a0;IFFFFFLandroid/graphics/Paint;FLandroid/graphics/Paint$FontMetrics;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v6}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    return-object v0

    .line 162
    :pswitch_0
    move-object/from16 v1, p1

    .line 163
    .line 164
    check-cast v1, La/pi9;

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iget-object v6, v1, La/pi9;->a:La/y99;

    .line 170
    .line 171
    invoke-interface {v6}, La/y99;->d()J

    .line 172
    .line 173
    .line 174
    move-result-wide v6

    .line 175
    shr-long v5, v6, v5

    .line 176
    .line 177
    long-to-int v5, v5

    .line 178
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    div-float/2addr v5, v4

    .line 183
    iget-object v6, v1, La/pi9;->a:La/y99;

    .line 184
    .line 185
    invoke-interface {v6}, La/y99;->d()J

    .line 186
    .line 187
    .line 188
    move-result-wide v6

    .line 189
    and-long/2addr v2, v6

    .line 190
    long-to-int v2, v2

    .line 191
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    div-float/2addr v2, v4

    .line 196
    sget-object v3, La/qmk;->a:La/zcl;

    .line 197
    .line 198
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    mul-float/2addr v3, v4

    .line 203
    invoke-static {v5, v2}, Ljava/lang/Math;->min(FF)F

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    sub-float/2addr v4, v3

    .line 208
    iget-object v8, v0, La/a2a0;->b:La/q2a0;

    .line 209
    .line 210
    iget-object v0, v8, La/q2a0;->a:La/a4x;

    .line 211
    .line 212
    new-instance v3, La/er90;

    .line 213
    .line 214
    const/4 v6, 0x6

    .line 215
    invoke-direct {v3, v6}, La/er90;-><init>(B)V

    .line 216
    .line 217
    .line 218
    invoke-static {v5, v2, v4, v0, v3}, La/xww;->x(FFFLjava/util/List;Lkotlin/jvm/functions/Function1;)La/w03;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    new-instance v3, La/er90;

    .line 223
    .line 224
    const/4 v6, 0x7

    .line 225
    invoke-direct {v3, v6}, La/er90;-><init>(B)V

    .line 226
    .line 227
    .line 228
    invoke-static {v5, v2, v4, v0, v3}, La/xww;->x(FFFLjava/util/List;Lkotlin/jvm/functions/Function1;)La/w03;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    new-instance v10, La/vtm0;

    .line 233
    .line 234
    const/high16 v0, 0x3f800000    # 1.0f

    .line 235
    .line 236
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    mul-float v11, v2, v0

    .line 241
    .line 242
    const/4 v15, 0x0

    .line 243
    const/16 v16, 0x12

    .line 244
    .line 245
    const/4 v12, 0x0

    .line 246
    const/4 v13, 0x1

    .line 247
    const/4 v14, 0x1

    .line 248
    invoke-direct/range {v10 .. v16}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 249
    .line 250
    .line 251
    new-instance v6, La/enm;

    .line 252
    .line 253
    const/16 v11, 0x18

    .line 254
    .line 255
    invoke-direct/range {v6 .. v11}, La/enm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v6}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    return-object v0

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
