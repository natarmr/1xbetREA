.class public final synthetic La/wwk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(FJB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/wwk;->a:B

    iput p1, p0, La/wwk;->b:F

    iput-wide p2, p0, La/wwk;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/wwk;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-wide v3, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/16 v5, 0x20

    .line 12
    .line 13
    iget v6, p0, La/wwk;->b:F

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, La/pi9;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, La/pi9;->getDensity()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    mul-float/2addr v0, v6

    .line 28
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    int-to-long v1, v1

    .line 33
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    int-to-long v6, v0

    .line 38
    shl-long v0, v1, v5

    .line 39
    .line 40
    and-long v2, v6, v3

    .line 41
    .line 42
    or-long v8, v0, v2

    .line 43
    .line 44
    new-instance v4, La/lf4;

    .line 45
    .line 46
    const/4 v5, 0x7

    .line 47
    iget-wide v6, p0, La/wwk;->c:J

    .line 48
    .line 49
    invoke-direct/range {v4 .. v9}, La/lf4;-><init>(BJJ)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v4}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_0
    move-object v0, p1

    .line 58
    check-cast v0, La/fhl;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    int-to-long v7, v7

    .line 72
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    int-to-long v9, p1

    .line 77
    shl-long/2addr v7, v5

    .line 78
    and-long/2addr v9, v3

    .line 79
    or-long/2addr v7, v9

    .line 80
    invoke-interface {v0}, La/fhl;->d()J

    .line 81
    .line 82
    .line 83
    move-result-wide v9

    .line 84
    and-long/2addr v9, v3

    .line 85
    long-to-int p1, v9

    .line 86
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    mul-float/2addr v9, v1

    .line 95
    sub-float/2addr p1, v9

    .line 96
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    int-to-long v9, v9

    .line 101
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    int-to-long v11, p1

    .line 106
    shl-long/2addr v9, v5

    .line 107
    and-long/2addr v3, v11

    .line 108
    or-long/2addr v3, v9

    .line 109
    invoke-interface {v0}, La/fhl;->d()J

    .line 110
    .line 111
    .line 112
    move-result-wide v9

    .line 113
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    mul-float/2addr p1, v1

    .line 118
    const/high16 v1, 0x3f800000    # 1.0f

    .line 119
    .line 120
    invoke-interface {v0, v1}, La/w6k;->w0(F)F

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    add-float/2addr v1, p1

    .line 125
    const/4 p1, 0x1

    .line 126
    invoke-static {v9, v10, v2, v1, p1}, La/h7k0;->a(JFFI)J

    .line 127
    .line 128
    .line 129
    move-result-wide v5

    .line 130
    const/4 v9, 0x0

    .line 131
    const/16 v10, 0xf0

    .line 132
    .line 133
    iget-wide v1, p0, La/wwk;->c:J

    .line 134
    .line 135
    invoke-static/range {v0 .. v10}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 136
    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_1
    move-object v0, p1

    .line 142
    check-cast v0, La/fhl;

    .line 143
    .line 144
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    div-float/2addr p1, v1

    .line 153
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    int-to-long v8, v2

    .line 158
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    int-to-long v10, p1

    .line 163
    shl-long/2addr v8, v5

    .line 164
    and-long/2addr v10, v3

    .line 165
    or-long/2addr v8, v10

    .line 166
    invoke-interface {v0}, La/fhl;->d()J

    .line 167
    .line 168
    .line 169
    move-result-wide v10

    .line 170
    shr-long/2addr v10, v5

    .line 171
    long-to-int p1, v10

    .line 172
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    div-float/2addr v2, v1

    .line 181
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    int-to-long v10, p1

    .line 186
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    int-to-long v1, p1

    .line 191
    shl-long v5, v10, v5

    .line 192
    .line 193
    and-long/2addr v1, v3

    .line 194
    or-long/2addr v5, v1

    .line 195
    move-wide v3, v8

    .line 196
    const/4 v9, 0x0

    .line 197
    const/16 v10, 0x1f0

    .line 198
    .line 199
    iget-wide v1, p0, La/wwk;->c:J

    .line 200
    .line 201
    const/4 v8, 0x0

    .line 202
    invoke-static/range {v0 .. v10}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 203
    .line 204
    .line 205
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object p0

    .line 208
    :pswitch_2
    move-object v0, p1

    .line 209
    check-cast v0, La/fhl;

    .line 210
    .line 211
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    div-float/2addr p1, v1

    .line 220
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    int-to-long v8, p1

    .line 225
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    int-to-long v10, p1

    .line 230
    shl-long/2addr v8, v5

    .line 231
    and-long/2addr v10, v3

    .line 232
    or-long/2addr v8, v10

    .line 233
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    div-float/2addr p1, v1

    .line 238
    invoke-interface {v0}, La/fhl;->d()J

    .line 239
    .line 240
    .line 241
    move-result-wide v1

    .line 242
    and-long/2addr v1, v3

    .line 243
    long-to-int v1, v1

    .line 244
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    int-to-long v10, p1

    .line 253
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    int-to-long v1, p1

    .line 258
    shl-long v5, v10, v5

    .line 259
    .line 260
    and-long/2addr v1, v3

    .line 261
    or-long/2addr v5, v1

    .line 262
    move-wide v3, v8

    .line 263
    const/4 v9, 0x0

    .line 264
    const/16 v10, 0x1f0

    .line 265
    .line 266
    iget-wide v1, p0, La/wwk;->c:J

    .line 267
    .line 268
    const/4 v8, 0x0

    .line 269
    invoke-static/range {v0 .. v10}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 270
    .line 271
    .line 272
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object p0

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
