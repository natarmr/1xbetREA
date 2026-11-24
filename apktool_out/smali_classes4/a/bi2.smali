.class public final La/bi2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/p6t0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bi2;->a:B

    iput-object p1, p0, La/bi2;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/bi2;->c:La/p6t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/bi2;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/bi2;->c:La/p6t0;

    .line 5
    .line 6
    iget-object p0, p0, La/bi2;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/bem;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p1, La/m2p0;

    .line 17
    .line 18
    check-cast v2, La/v2p0;

    .line 19
    .line 20
    iget-object v0, v2, La/v2p0;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {p1, v0}, La/m2p0;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/h2l0;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v0, La/kgl0;->a:[I

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    aget p1, v0, p1

    .line 43
    .line 44
    if-ne p1, v1, :cond_0

    .line 45
    .line 46
    new-instance p1, La/zfl0;

    .line 47
    .line 48
    check-cast v2, La/gpp;

    .line 49
    .line 50
    iget-wide v0, v2, La/gpp;->a:J

    .line 51
    .line 52
    invoke-direct {p1, v0, v1}, La/zfl0;-><init>(J)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_1
    check-cast p1, La/h2l0;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget-object v0, La/jgl0;->a:[I

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    aget p1, v0, p1

    .line 73
    .line 74
    if-ne p1, v1, :cond_1

    .line 75
    .line 76
    new-instance p1, La/zfl0;

    .line 77
    .line 78
    check-cast v2, La/gpp;

    .line 79
    .line 80
    iget-wide v0, v2, La/gpp;->a:J

    .line 81
    .line 82
    invoke-direct {p1, v0, v1}, La/zfl0;-><init>(J)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_2
    check-cast p1, La/h2l0;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    sget-object v0, La/igl0;->a:[I

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    aget p1, v0, p1

    .line 103
    .line 104
    if-ne p1, v1, :cond_2

    .line 105
    .line 106
    new-instance p1, La/zfl0;

    .line 107
    .line 108
    check-cast v2, La/gpp;

    .line 109
    .line 110
    iget-wide v0, v2, La/gpp;->a:J

    .line 111
    .line 112
    invoke-direct {p1, v0, v1}, La/zfl0;-><init>(J)V

    .line 113
    .line 114
    .line 115
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_3
    check-cast p1, La/h2l0;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    sget-object v0, La/ggl0;->a:[I

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    aget p1, v0, p1

    .line 133
    .line 134
    if-ne p1, v1, :cond_3

    .line 135
    .line 136
    new-instance p1, La/zfl0;

    .line 137
    .line 138
    check-cast v2, La/gpp;

    .line 139
    .line 140
    iget-wide v0, v2, La/gpp;->a:J

    .line 141
    .line 142
    invoke-direct {p1, v0, v1}, La/zfl0;-><init>(J)V

    .line 143
    .line 144
    .line 145
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_4
    check-cast p1, Ljava/lang/Number;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 154
    .line 155
    .line 156
    move-result-wide v3

    .line 157
    new-instance p1, La/shw;

    .line 158
    .line 159
    check-cast v2, La/yqv;

    .line 160
    .line 161
    iget-object v0, v2, La/yqv;->d:La/sip;

    .line 162
    .line 163
    sget-object v2, La/sip;->c:La/sip;

    .line 164
    .line 165
    if-ne v0, v2, :cond_4

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_4
    const/4 v1, 0x0

    .line 169
    :goto_0
    invoke-direct {p1, v1, v3, v4}, La/shw;-><init>(ZJ)V

    .line 170
    .line 171
    .line 172
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object p0

    .line 178
    :pswitch_5
    check-cast p1, La/h2l0;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    new-instance p1, La/rh2;

    .line 184
    .line 185
    check-cast v2, La/vnp0;

    .line 186
    .line 187
    iget-wide v0, v2, La/vnp0;->a:J

    .line 188
    .line 189
    iget-boolean v2, v2, La/vnp0;->c:Z

    .line 190
    .line 191
    invoke-direct {p1, v2, v0, v1}, La/rh2;-><init>(ZJ)V

    .line 192
    .line 193
    .line 194
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_6
    check-cast p1, La/zia;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    new-instance v0, La/lk2;

    .line 206
    .line 207
    check-cast v2, La/sbs0;

    .line 208
    .line 209
    iget-object v1, v2, La/sbs0;->a:La/qbs0;

    .line 210
    .line 211
    iget-object v1, v1, La/qbs0;->b:La/mbs0;

    .line 212
    .line 213
    iget-wide v1, v1, La/mbs0;->h:J

    .line 214
    .line 215
    invoke-direct {v0, p1, v1, v2}, La/lk2;-><init>(La/zia;J)V

    .line 216
    .line 217
    .line 218
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object p0

    .line 224
    :pswitch_7
    check-cast p1, La/h2l0;

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    new-instance p1, La/zi2;

    .line 230
    .line 231
    check-cast v2, La/o8s0;

    .line 232
    .line 233
    iget-wide v0, v2, La/o8s0;->a:J

    .line 234
    .line 235
    iget-boolean v2, v2, La/o8s0;->c:Z

    .line 236
    .line 237
    invoke-direct {p1, v2, v0, v1}, La/zi2;-><init>(ZJ)V

    .line 238
    .line 239
    .line 240
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_8
    check-cast p1, La/h2l0;

    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    new-instance p1, La/zi2;

    .line 252
    .line 253
    check-cast v2, La/o8s0;

    .line 254
    .line 255
    iget-wide v0, v2, La/o8s0;->a:J

    .line 256
    .line 257
    iget-boolean v2, v2, La/o8s0;->c:Z

    .line 258
    .line 259
    invoke-direct {p1, v2, v0, v1}, La/zi2;-><init>(ZJ)V

    .line 260
    .line 261
    .line 262
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object p0

    .line 268
    :pswitch_9
    check-cast p1, La/h2l0;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    new-instance p1, La/rh2;

    .line 274
    .line 275
    check-cast v2, La/vnp0;

    .line 276
    .line 277
    iget-wide v0, v2, La/vnp0;->a:J

    .line 278
    .line 279
    iget-boolean v2, v2, La/vnp0;->c:Z

    .line 280
    .line 281
    invoke-direct {p1, v2, v0, v1}, La/rh2;-><init>(ZJ)V

    .line 282
    .line 283
    .line 284
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    return-object p0

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
