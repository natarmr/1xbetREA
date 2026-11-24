.class public final synthetic La/n230;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/n230;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte p0, p0, La/n230;->a:B

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/zw3;

    .line 9
    .line 10
    sget-object v0, La/gv6;->a:La/gv6;

    .line 11
    .line 12
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance p0, La/zw3;

    .line 17
    .line 18
    sget-object v0, La/h9a0;->a:La/h9a0;

    .line 19
    .line 20
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_1
    :try_start_0
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 25
    .line 26
    const-string p0, "antifraud"

    .line 27
    .line 28
    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    move-object p0, v0

    .line 36
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 37
    .line 38
    new-instance v0, La/g0g0;

    .line 39
    .line 40
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    move-object p0, v0

    .line 44
    :goto_0
    instance-of p0, p0, La/g0g0;

    .line 45
    .line 46
    xor-int/lit8 p0, p0, 0x1

    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_2
    sget-object p0, La/xt40;->a:La/xt40;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_3
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_4
    new-instance p0, La/zw3;

    .line 60
    .line 61
    sget-object v0, La/ze30;->a:La/ze30;

    .line 62
    .line 63
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_5
    new-instance p0, La/zw3;

    .line 68
    .line 69
    sget-object v0, La/ef30;->a:La/ef30;

    .line 70
    .line 71
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_6
    new-instance p0, La/zw3;

    .line 76
    .line 77
    sget-object v0, La/if30;->a:La/if30;

    .line 78
    .line 79
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_7
    new-instance p0, La/zw3;

    .line 84
    .line 85
    sget-object v0, La/lf30;->a:La/lf30;

    .line 86
    .line 87
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 88
    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_8
    new-instance p0, La/zw3;

    .line 92
    .line 93
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 94
    .line 95
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 96
    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_9
    new-instance p0, La/zw3;

    .line 100
    .line 101
    sget-object v0, La/me30;->a:La/me30;

    .line 102
    .line 103
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 104
    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_a
    new-instance p0, La/zw3;

    .line 108
    .line 109
    sget-object v0, La/te30;->a:La/te30;

    .line 110
    .line 111
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_b
    new-instance p0, La/zw3;

    .line 116
    .line 117
    sget-object v0, La/qe30;->a:La/qe30;

    .line 118
    .line 119
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_c
    new-instance p0, La/zw3;

    .line 124
    .line 125
    sget-object v0, La/ke30;->a:La/ke30;

    .line 126
    .line 127
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 128
    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_d
    new-instance p0, La/zw3;

    .line 132
    .line 133
    sget-object v0, La/ked;->a:La/ked;

    .line 134
    .line 135
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 136
    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_e
    new-instance p0, La/zw3;

    .line 140
    .line 141
    sget-object v0, La/dd30;->a:La/dd30;

    .line 142
    .line 143
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 144
    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_f
    new-instance p0, La/xcz;

    .line 148
    .line 149
    invoke-direct {p0, v1, v0, v1}, La/xcz;-><init>(III)V

    .line 150
    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_10
    new-instance p0, La/zw3;

    .line 154
    .line 155
    sget-object v0, La/boa0;->a:La/boa0;

    .line 156
    .line 157
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 158
    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_11
    new-instance p0, La/zw3;

    .line 162
    .line 163
    sget-object v0, La/bc30;->a:La/bc30;

    .line 164
    .line 165
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 166
    .line 167
    .line 168
    return-object p0

    .line 169
    :pswitch_12
    new-instance p0, La/zw3;

    .line 170
    .line 171
    sget-object v0, La/whp0;->a:La/whp0;

    .line 172
    .line 173
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 174
    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_13
    new-instance p0, La/xcz;

    .line 178
    .line 179
    invoke-direct {p0, v1, v0, v1}, La/xcz;-><init>(III)V

    .line 180
    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_14
    new-instance p0, La/zw3;

    .line 184
    .line 185
    sget-object v0, La/tn5;->a:La/tn5;

    .line 186
    .line 187
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 188
    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_16
    sget p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->t1:I

    .line 195
    .line 196
    new-instance p0, La/x930;

    .line 197
    .line 198
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 199
    .line 200
    .line 201
    return-object p0

    .line 202
    :pswitch_17
    sget p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->t1:I

    .line 203
    .line 204
    new-instance p0, La/tk80;

    .line 205
    .line 206
    invoke-direct {p0}, La/efk0;-><init>()V

    .line 207
    .line 208
    .line 209
    return-object p0

    .line 210
    :pswitch_18
    new-instance p0, La/zw3;

    .line 211
    .line 212
    sget-object v0, La/m4q0;->a:La/m4q0;

    .line 213
    .line 214
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 215
    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_19
    new-instance p0, La/zw3;

    .line 219
    .line 220
    sget-object v0, La/jd00;->a:La/jd00;

    .line 221
    .line 222
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 223
    .line 224
    .line 225
    return-object p0

    .line 226
    :pswitch_1a
    new-instance p0, La/zw3;

    .line 227
    .line 228
    sget-object v0, La/jd00;->a:La/jd00;

    .line 229
    .line 230
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 231
    .line 232
    .line 233
    return-object p0

    .line 234
    :pswitch_1b
    sget p0, La/l830;->A:I

    .line 235
    .line 236
    sget-object p0, La/p030;->a:La/p030;

    .line 237
    .line 238
    return-object p0

    .line 239
    :pswitch_1c
    new-instance v0, La/g7h;

    .line 240
    .line 241
    sget-object v3, La/iun;->a:La/iun;

    .line 242
    .line 243
    sget-object v4, La/uh90;->g:La/uh90;

    .line 244
    .line 245
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    const-wide/16 v9, -0x1a

    .line 258
    .line 259
    const/4 v1, 0x0

    .line 260
    const/4 v2, 0x0

    .line 261
    move-object v5, v4

    .line 262
    move-object v6, v4

    .line 263
    move-object v7, v4

    .line 264
    move-object v8, v3

    .line 265
    invoke-direct/range {v0 .. v10}, La/g7h;-><init>(La/m9s;La/ms2;Ljava/util/List;La/th90;La/th90;La/th90;La/th90;Ljava/util/List;J)V

    .line 266
    .line 267
    .line 268
    return-object v0

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
