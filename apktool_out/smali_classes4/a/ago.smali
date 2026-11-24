.class public final synthetic La/ago;
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
    iput-byte p1, p0, La/ago;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte p0, p0, La/ago;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p0, La/t2p;->O1:La/ddk;

    .line 8
    .line 9
    new-instance p0, La/bdz;

    .line 10
    .line 11
    invoke-direct {p0}, La/bdz;-><init>()V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_1
    new-instance p0, La/zw3;

    .line 19
    .line 20
    sget-object v1, La/pd40;->a:La/pd40;

    .line 21
    .line 22
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_2
    new-instance p0, La/zw3;

    .line 27
    .line 28
    sget-object v1, La/r0p;->a:La/r0p;

    .line 29
    .line 30
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_3
    new-instance v2, La/syo;

    .line 35
    .line 36
    sget-object v9, La/iun;->a:La/iun;

    .line 37
    .line 38
    sget-object v11, La/dyo;->a:La/dyo;

    .line 39
    .line 40
    const/4 v13, 0x0

    .line 41
    const/4 v3, 0x1

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    const-string v6, ""

    .line 45
    .line 46
    const-string v7, ""

    .line 47
    .line 48
    const-string v8, ""

    .line 49
    .line 50
    const-string v10, ""

    .line 51
    .line 52
    move-object v12, v11

    .line 53
    invoke-direct/range {v2 .. v13}, La/syo;-><init>(ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;La/dyo;La/dyo;La/yxo;)V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :pswitch_4
    sget-object p0, La/byo;->P1:La/bek;

    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_5
    new-instance p0, La/zw3;

    .line 63
    .line 64
    sget-object v1, La/s710;->a:La/s710;

    .line 65
    .line 66
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 67
    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_6
    new-instance p0, La/zw3;

    .line 71
    .line 72
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 73
    .line 74
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 75
    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_7
    new-instance p0, La/zw3;

    .line 79
    .line 80
    sget-object v1, La/jro;->a:La/jro;

    .line 81
    .line 82
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 83
    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_8
    new-instance p0, La/zw3;

    .line 87
    .line 88
    sget-object v1, La/gro;->a:La/gro;

    .line 89
    .line 90
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_9
    new-instance p0, La/zw3;

    .line 95
    .line 96
    sget-object v1, La/dro;->a:La/dro;

    .line 97
    .line 98
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 99
    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_a
    new-instance p0, La/zw3;

    .line 103
    .line 104
    sget-object v1, La/aro;->a:La/aro;

    .line 105
    .line 106
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 107
    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_b
    new-instance p0, Landroid/os/Handler;

    .line 111
    .line 112
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 113
    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_c
    new-instance p0, La/zw3;

    .line 117
    .line 118
    sget-object v1, La/ohu;->a:La/ohu;

    .line 119
    .line 120
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 121
    .line 122
    .line 123
    return-object p0

    .line 124
    :pswitch_d
    new-instance p0, La/zw3;

    .line 125
    .line 126
    sget-object v1, La/sio;->a:La/sio;

    .line 127
    .line 128
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 129
    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_e
    new-instance p0, La/zw3;

    .line 133
    .line 134
    sget-object v1, La/rio;->a:La/rio;

    .line 135
    .line 136
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 137
    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_f
    new-instance p0, La/zw3;

    .line 141
    .line 142
    sget-object v1, La/s710;->a:La/s710;

    .line 143
    .line 144
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 145
    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_10
    sget-object p0, La/cio;->P1:La/ddk;

    .line 149
    .line 150
    new-instance p0, La/bdz;

    .line 151
    .line 152
    invoke-direct {p0}, La/bdz;-><init>()V

    .line 153
    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_11
    new-instance p0, La/zw3;

    .line 157
    .line 158
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 159
    .line 160
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 161
    .line 162
    .line 163
    return-object p0

    .line 164
    :pswitch_12
    new-instance p0, La/zw3;

    .line 165
    .line 166
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 167
    .line 168
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 169
    .line 170
    .line 171
    return-object p0

    .line 172
    :pswitch_13
    new-instance p0, La/zw3;

    .line 173
    .line 174
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 175
    .line 176
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 177
    .line 178
    .line 179
    return-object p0

    .line 180
    :pswitch_14
    new-instance p0, La/zw3;

    .line 181
    .line 182
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 183
    .line 184
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 185
    .line 186
    .line 187
    return-object p0

    .line 188
    :pswitch_15
    new-instance p0, La/zw3;

    .line 189
    .line 190
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 191
    .line 192
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 193
    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_16
    new-instance p0, La/zw3;

    .line 197
    .line 198
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 199
    .line 200
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 201
    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_17
    new-instance p0, La/zw3;

    .line 205
    .line 206
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 207
    .line 208
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 209
    .line 210
    .line 211
    return-object p0

    .line 212
    :pswitch_18
    new-instance p0, La/zw3;

    .line 213
    .line 214
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 215
    .line 216
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 217
    .line 218
    .line 219
    return-object p0

    .line 220
    :pswitch_19
    new-instance p0, La/zw3;

    .line 221
    .line 222
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 223
    .line 224
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 225
    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_1a
    new-instance p0, La/zw3;

    .line 229
    .line 230
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 231
    .line 232
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 233
    .line 234
    .line 235
    return-object p0

    .line 236
    :pswitch_1b
    new-instance p0, La/zw3;

    .line 237
    .line 238
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 239
    .line 240
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 241
    .line 242
    .line 243
    return-object p0

    .line 244
    :pswitch_1c
    new-instance p0, La/zw3;

    .line 245
    .line 246
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 247
    .line 248
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 249
    .line 250
    .line 251
    return-object p0

    .line 252
    nop

    .line 253
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
