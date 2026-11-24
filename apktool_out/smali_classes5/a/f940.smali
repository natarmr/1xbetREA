.class public final synthetic La/f940;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m940;


# direct methods
.method public synthetic constructor <init>(La/m940;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f940;->a:B

    iput-object p1, p0, La/f940;->b:La/m940;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/f940;->a:B

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    iget-object p0, p0, La/f940;->b:La/m940;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/m940;->C:La/duj;

    .line 16
    .line 17
    new-instance v2, La/b120;

    .line 18
    .line 19
    invoke-direct {v2, p0, v1}, La/b120;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    move-object v0, p1

    .line 29
    check-cast v0, Ljava/lang/Throwable;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 35
    .line 36
    iget-object v1, p1, La/ocj;->a:La/p7m0;

    .line 37
    .line 38
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 46
    .line 47
    move-object v3, p1

    .line 48
    check-cast v3, La/n940;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v4, La/b940;

    .line 54
    .line 55
    invoke-direct {v4, v0}, La/b940;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    const/16 v8, 0xc

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    invoke-static/range {v3 .. v8}, La/n940;->a(La/n940;La/d940;ZLjava/util/LinkedHashSet;Ljava/util/List;I)La/n940;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v1, p1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_0

    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, La/m940;->u:La/peg0;

    .line 82
    .line 83
    new-instance v0, La/jr1;

    .line 84
    .line 85
    new-instance v1, La/cvc0;

    .line 86
    .line 87
    sget-object v2, La/d7v;->b:La/d7v;

    .line 88
    .line 89
    invoke-direct {v1, v2}, La/cvc0;-><init>(La/d7v;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_2
    check-cast p1, La/k0w0;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, La/m940;->u:La/peg0;

    .line 111
    .line 112
    new-instance v1, La/fr1;

    .line 113
    .line 114
    new-instance v2, La/fs80;

    .line 115
    .line 116
    iget-object p0, p0, La/m940;->z:La/ctf0;

    .line 117
    .line 118
    const/4 v3, 0x0

    .line 119
    new-array v4, v3, [Ljava/lang/Object;

    .line 120
    .line 121
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 122
    .line 123
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    const v4, 0x7f131694

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    sget-object p0, La/nw80;->i:La/nw80;

    .line 135
    .line 136
    invoke-virtual {p0}, La/nw80;->getId()J

    .line 137
    .line 138
    .line 139
    move-result-wide v4

    .line 140
    const/4 v10, 0x0

    .line 141
    const/16 v11, 0x7c

    .line 142
    .line 143
    const/4 v6, 0x0

    .line 144
    const/4 v7, 0x0

    .line 145
    const-wide/16 v8, 0x0

    .line 146
    .line 147
    invoke-direct/range {v2 .. v11}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 148
    .line 149
    .line 150
    sget-object p0, La/q91;->d:La/q91;

    .line 151
    .line 152
    invoke-direct {v1, v2, p0}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v1}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 160
    .line 161
    .line 162
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_3
    check-cast p1, La/k0w0;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object p0, p0, La/m940;->u:La/peg0;

    .line 171
    .line 172
    new-instance v0, La/fr1;

    .line 173
    .line 174
    sget-object v1, La/q91;->d:La/q91;

    .line 175
    .line 176
    const/4 v2, 0x1

    .line 177
    const/4 v3, 0x0

    .line 178
    invoke-direct {v0, v3, v1, v2}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 186
    .line 187
    .line 188
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_4
    check-cast p1, La/k0w0;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object v0, p0, La/m940;->y:La/vjp;

    .line 197
    .line 198
    sget-object v1, La/j700;->b:La/j700;

    .line 199
    .line 200
    sget-object v3, La/xun;->a:La/xun;

    .line 201
    .line 202
    const-string v6, ""

    .line 203
    .line 204
    sget-object v2, La/y8h0;->a:La/y8h0;

    .line 205
    .line 206
    const-wide/16 v4, -0x1

    .line 207
    .line 208
    invoke-virtual/range {v0 .. v6}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 213
    .line 214
    .line 215
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_5
    check-cast p1, La/k0w0;

    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    iget-object v0, p0, La/m940;->y:La/vjp;

    .line 224
    .line 225
    sget-object v1, La/j700;->a:La/j700;

    .line 226
    .line 227
    sget-object v3, La/xun;->a:La/xun;

    .line 228
    .line 229
    const-string v6, ""

    .line 230
    .line 231
    sget-object v2, La/y8h0;->a:La/y8h0;

    .line 232
    .line 233
    const-wide/16 v4, -0x1

    .line 234
    .line 235
    invoke-virtual/range {v0 .. v6}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 240
    .line 241
    .line 242
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    return-object p0

    .line 245
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    iget-object v0, p0, La/m940;->C:La/duj;

    .line 251
    .line 252
    new-instance v2, La/b120;

    .line 253
    .line 254
    invoke-direct {v2, p0, v1}, La/b120;-><init>(Ljava/lang/Object;B)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, p1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 258
    .line 259
    .line 260
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
