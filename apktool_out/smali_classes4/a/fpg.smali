.class public final synthetic La/fpg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;

.field public final synthetic c:La/a4x;


# direct methods
.method public synthetic constructor <init>(La/ugd;La/a4x;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fpg;->a:B

    iput-object p1, p0, La/fpg;->b:La/ugd;

    iput-object p2, p0, La/fpg;->c:La/a4x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/fpg;->a:B

    .line 2
    .line 3
    const/16 v1, 0x90

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, p0, La/fpg;->c:La/a4x;

    .line 12
    .line 13
    iget-object p0, p0, La/fpg;->b:La/ugd;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, La/g9z;

    .line 19
    .line 20
    check-cast p2, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    check-cast p3, La/fet;

    .line 27
    .line 28
    check-cast p4, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p4

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    and-int/lit8 p1, p4, 0x30

    .line 38
    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p3, p2}, La/fet;->e(I)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    move v2, v3

    .line 48
    :cond_0
    or-int/2addr p4, v2

    .line 49
    :cond_1
    and-int/lit16 p1, p4, 0x91

    .line 50
    .line 51
    if-eq p1, v1, :cond_2

    .line 52
    .line 53
    move p1, v4

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move p1, v5

    .line 56
    :goto_0
    and-int/2addr p4, v4

    .line 57
    invoke-virtual {p3, p4, p1}, La/fet;->U(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-static {p2, p1}, La/kbc;->d0(II)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-interface {v6, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p0, p1, p3, p2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-virtual {p3}, La/fet;->X()V

    .line 84
    .line 85
    .line 86
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_0
    check-cast p1, La/k8z;

    .line 90
    .line 91
    check-cast p2, Ljava/lang/Integer;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    check-cast p3, La/fet;

    .line 98
    .line 99
    check-cast p4, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result p4

    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    and-int/lit8 p1, p4, 0x30

    .line 109
    .line 110
    if-nez p1, :cond_5

    .line 111
    .line 112
    invoke-virtual {p3, p2}, La/fet;->e(I)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_4

    .line 117
    .line 118
    move v2, v3

    .line 119
    :cond_4
    or-int/2addr p4, v2

    .line 120
    :cond_5
    and-int/lit16 p1, p4, 0x91

    .line 121
    .line 122
    if-eq p1, v1, :cond_6

    .line 123
    .line 124
    move p1, v4

    .line 125
    goto :goto_2

    .line 126
    :cond_6
    move p1, v5

    .line 127
    :goto_2
    and-int/2addr p4, v4

    .line 128
    invoke-virtual {p3, p4, p1}, La/fet;->U(IZ)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_7

    .line 133
    .line 134
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-static {p2, p1}, La/kbc;->d0(II)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    invoke-interface {v6, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-virtual {p0, p1, p3, p2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_7
    invoke-virtual {p3}, La/fet;->X()V

    .line 155
    .line 156
    .line 157
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_1
    check-cast p1, La/rk80;

    .line 161
    .line 162
    check-cast p2, Ljava/lang/Integer;

    .line 163
    .line 164
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    check-cast p3, La/fet;

    .line 169
    .line 170
    check-cast p4, Ljava/lang/Integer;

    .line 171
    .line 172
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result p4

    .line 176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    and-int/lit8 p1, p4, 0x30

    .line 180
    .line 181
    if-nez p1, :cond_9

    .line 182
    .line 183
    invoke-virtual {p3, p2}, La/fet;->e(I)Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-eqz p1, :cond_8

    .line 188
    .line 189
    move v2, v3

    .line 190
    :cond_8
    or-int/2addr p4, v2

    .line 191
    :cond_9
    and-int/lit16 p1, p4, 0x91

    .line 192
    .line 193
    if-eq p1, v1, :cond_a

    .line 194
    .line 195
    move p1, v4

    .line 196
    goto :goto_4

    .line 197
    :cond_a
    move p1, v5

    .line 198
    :goto_4
    and-int/2addr p4, v4

    .line 199
    invoke-virtual {p3, p4, p1}, La/fet;->U(IZ)Z

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    if-eqz p1, :cond_b

    .line 204
    .line 205
    invoke-interface {v6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-virtual {p0, p1, p3, p2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_b
    invoke-virtual {p3}, La/fet;->X()V

    .line 218
    .line 219
    .line 220
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object p0

    .line 223
    :pswitch_2
    check-cast p1, La/k8z;

    .line 224
    .line 225
    check-cast p2, Ljava/lang/Integer;

    .line 226
    .line 227
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result p2

    .line 231
    check-cast p3, La/fet;

    .line 232
    .line 233
    check-cast p4, Ljava/lang/Integer;

    .line 234
    .line 235
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result p4

    .line 239
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    and-int/lit8 p1, p4, 0x30

    .line 243
    .line 244
    if-nez p1, :cond_d

    .line 245
    .line 246
    invoke-virtual {p3, p2}, La/fet;->e(I)Z

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    if-eqz p1, :cond_c

    .line 251
    .line 252
    move v2, v3

    .line 253
    :cond_c
    or-int/2addr p4, v2

    .line 254
    :cond_d
    and-int/lit16 p1, p4, 0x91

    .line 255
    .line 256
    if-eq p1, v1, :cond_e

    .line 257
    .line 258
    move p1, v4

    .line 259
    goto :goto_6

    .line 260
    :cond_e
    move p1, v5

    .line 261
    :goto_6
    and-int/2addr p4, v4

    .line 262
    invoke-virtual {p3, p4, p1}, La/fet;->U(IZ)Z

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    if-eqz p1, :cond_f

    .line 267
    .line 268
    invoke-interface {v6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    invoke-virtual {p0, p1, v6, p3, p2}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_f
    invoke-virtual {p3}, La/fet;->X()V

    .line 281
    .line 282
    .line 283
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 284
    .line 285
    return-object p0

    .line 286
    nop

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
