.class public final synthetic La/f4b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/ugd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f4b;->a:B

    iput-object p1, p0, La/f4b;->b:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/f4b;->a:B

    .line 2
    .line 3
    const/16 v1, 0x82

    .line 4
    .line 5
    const/16 v2, 0x92

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const/16 v4, 0x20

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x4

    .line 14
    const/4 v8, 0x1

    .line 15
    iget-object p0, p0, La/f4b;->b:La/ugd;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast p1, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    check-cast p2, La/l7m0;

    .line 27
    .line 28
    check-cast p3, La/fet;

    .line 29
    .line 30
    check-cast p4, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p4

    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v1, p4, 0x6

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p3, v0}, La/fet;->e(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    move v6, v7

    .line 50
    :cond_0
    or-int v0, p4, v6

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move v0, p4

    .line 54
    :goto_0
    and-int/lit8 p4, p4, 0x30

    .line 55
    .line 56
    if-nez p4, :cond_3

    .line 57
    .line 58
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p4

    .line 62
    if-eqz p4, :cond_2

    .line 63
    .line 64
    move v3, v4

    .line 65
    :cond_2
    or-int/2addr v0, v3

    .line 66
    :cond_3
    and-int/lit16 p4, v0, 0x93

    .line 67
    .line 68
    if-eq p4, v2, :cond_4

    .line 69
    .line 70
    move v5, v8

    .line 71
    :cond_4
    and-int/lit8 p4, v0, 0x1

    .line 72
    .line 73
    invoke-virtual {p3, p4, v5}, La/fet;->U(IZ)Z

    .line 74
    .line 75
    .line 76
    move-result p4

    .line 77
    if-eqz p4, :cond_5

    .line 78
    .line 79
    and-int/lit8 p4, v0, 0x7e

    .line 80
    .line 81
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    invoke-virtual {p0, p1, p2, p3, p4}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_5
    invoke-virtual {p3}, La/fet;->X()V

    .line 90
    .line 91
    .line 92
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_0
    check-cast p1, La/zdz;

    .line 96
    .line 97
    check-cast p2, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    check-cast p3, La/fet;

    .line 103
    .line 104
    check-cast p4, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    and-int/lit8 p4, p2, 0x6

    .line 111
    .line 112
    if-nez p4, :cond_7

    .line 113
    .line 114
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p4

    .line 118
    if-eqz p4, :cond_6

    .line 119
    .line 120
    move v6, v7

    .line 121
    :cond_6
    or-int/2addr p2, v6

    .line 122
    :cond_7
    and-int/lit16 p4, p2, 0x83

    .line 123
    .line 124
    if-eq p4, v1, :cond_8

    .line 125
    .line 126
    move v5, v8

    .line 127
    :cond_8
    and-int/lit8 p4, p2, 0x1

    .line 128
    .line 129
    invoke-virtual {p3, p4, v5}, La/fet;->U(IZ)Z

    .line 130
    .line 131
    .line 132
    move-result p4

    .line 133
    if-eqz p4, :cond_9

    .line 134
    .line 135
    and-int/lit8 p2, p2, 0xe

    .line 136
    .line 137
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-virtual {p0, p1, p3, p2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_9
    invoke-virtual {p3}, La/fet;->X()V

    .line 146
    .line 147
    .line 148
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_1
    check-cast p1, La/k8z;

    .line 152
    .line 153
    check-cast p2, Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    check-cast p3, La/fet;

    .line 159
    .line 160
    check-cast p4, Ljava/lang/Integer;

    .line 161
    .line 162
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    and-int/lit8 p4, p2, 0x6

    .line 167
    .line 168
    if-nez p4, :cond_b

    .line 169
    .line 170
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p4

    .line 174
    if-eqz p4, :cond_a

    .line 175
    .line 176
    move v6, v7

    .line 177
    :cond_a
    or-int/2addr p2, v6

    .line 178
    :cond_b
    and-int/lit16 p4, p2, 0x83

    .line 179
    .line 180
    if-eq p4, v1, :cond_c

    .line 181
    .line 182
    move v5, v8

    .line 183
    :cond_c
    and-int/lit8 p4, p2, 0x1

    .line 184
    .line 185
    invoke-virtual {p3, p4, v5}, La/fet;->U(IZ)Z

    .line 186
    .line 187
    .line 188
    move-result p4

    .line 189
    if-eqz p4, :cond_d

    .line 190
    .line 191
    and-int/lit8 p2, p2, 0xe

    .line 192
    .line 193
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-virtual {p0, p1, p3, p2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_d
    invoke-virtual {p3}, La/fet;->X()V

    .line 202
    .line 203
    .line 204
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object p0

    .line 207
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    check-cast p2, La/l7m0;

    .line 214
    .line 215
    check-cast p3, La/fet;

    .line 216
    .line 217
    check-cast p4, Ljava/lang/Integer;

    .line 218
    .line 219
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result p4

    .line 223
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    and-int/lit8 v1, p4, 0x6

    .line 227
    .line 228
    if-nez v1, :cond_f

    .line 229
    .line 230
    invoke-virtual {p3, v0}, La/fet;->e(I)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_e

    .line 235
    .line 236
    move v6, v7

    .line 237
    :cond_e
    or-int v0, p4, v6

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_f
    move v0, p4

    .line 241
    :goto_4
    and-int/lit8 p4, p4, 0x30

    .line 242
    .line 243
    if-nez p4, :cond_11

    .line 244
    .line 245
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result p4

    .line 249
    if-eqz p4, :cond_10

    .line 250
    .line 251
    move v3, v4

    .line 252
    :cond_10
    or-int/2addr v0, v3

    .line 253
    :cond_11
    and-int/lit16 p4, v0, 0x93

    .line 254
    .line 255
    if-eq p4, v2, :cond_12

    .line 256
    .line 257
    move v5, v8

    .line 258
    :cond_12
    and-int/lit8 p4, v0, 0x1

    .line 259
    .line 260
    invoke-virtual {p3, p4, v5}, La/fet;->U(IZ)Z

    .line 261
    .line 262
    .line 263
    move-result p4

    .line 264
    if-eqz p4, :cond_13

    .line 265
    .line 266
    and-int/lit8 p4, v0, 0x7e

    .line 267
    .line 268
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object p4

    .line 272
    invoke-virtual {p0, p1, p2, p3, p4}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_13
    invoke-virtual {p3}, La/fet;->X()V

    .line 277
    .line 278
    .line 279
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    return-object p0

    .line 282
    nop

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
