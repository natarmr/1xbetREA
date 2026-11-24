.class public final synthetic La/cbc0;
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
    iput-byte p1, p0, La/cbc0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte p0, p0, La/cbc0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

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
    sget-object v0, La/ftd0;->a:La/ftd0;

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
    sget-object v0, La/o9a0;->a:La/o9a0;

    .line 19
    .line 20
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_1
    new-instance p0, La/zw3;

    .line 25
    .line 26
    sget-object v0, La/whp0;->a:La/whp0;

    .line 27
    .line 28
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_2
    new-instance p0, La/zw3;

    .line 33
    .line 34
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 35
    .line 36
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_4
    sget-object p0, La/y9q0;->d:La/y9q0;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_5
    sget-object p0, La/y9q0;->d:La/y9q0;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_6
    new-instance p0, La/zw3;

    .line 50
    .line 51
    sget-object v0, La/zkd0;->a:La/zkd0;

    .line 52
    .line 53
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_7
    new-instance p0, La/zw3;

    .line 58
    .line 59
    sget-object v0, La/ykd0;->a:La/ykd0;

    .line 60
    .line 61
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_8
    new-instance p0, La/d9d0;

    .line 66
    .line 67
    new-instance v1, La/t33;

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    sget-object v3, La/hp4;->j:La/lxs0;

    .line 75
    .line 76
    const/16 v4, 0xc

    .line 77
    .line 78
    invoke-direct {v1, v2, v3, v0, v4}, La/t33;-><init>(Ljava/lang/Object;La/lxs0;Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, v1}, La/d9d0;-><init>(La/t33;)V

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_9
    invoke-static {}, La/t6d0;->values()[La/t6d0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    const-string v1, "HTTP"

    .line 90
    .line 91
    const-string v2, "SOCKS"

    .line 92
    .line 93
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    filled-new-array {v0, v0}, [[Ljava/lang/annotation/Annotation;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const-string v2, "org.xplatform.onexcore.data.network.ProxyType"

    .line 102
    .line 103
    invoke-static {v2, p0, v1, v0}, La/ntb;->F(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La/g0o;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_a
    sget-object p0, La/t6d0;->Companion:La/s6d0;

    .line 109
    .line 110
    invoke-virtual {p0}, La/s6d0;->serializer()La/jiy;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :pswitch_b
    new-instance p0, La/zw3;

    .line 116
    .line 117
    sget-object v0, La/okx;->a:La/okx;

    .line 118
    .line 119
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_c
    new-instance p0, La/yzc0;

    .line 124
    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_d
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :pswitch_e
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :pswitch_f
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 144
    .line 145
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    :pswitch_10
    new-instance v0, La/qxc0;

    .line 151
    .line 152
    const/4 v4, 0x0

    .line 153
    const/4 v5, 0x1

    .line 154
    const/4 v1, 0x1

    .line 155
    const/4 v2, 0x1

    .line 156
    const/4 v3, 0x0

    .line 157
    invoke-direct/range {v0 .. v5}, La/qxc0;-><init>(ZZZZZ)V

    .line 158
    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_11
    new-instance v1, La/xwc0;

    .line 162
    .line 163
    const/4 v5, 0x0

    .line 164
    const/4 v6, 0x0

    .line 165
    const/4 v2, 0x1

    .line 166
    const/4 v3, 0x1

    .line 167
    const/4 v4, 0x0

    .line 168
    invoke-direct/range {v1 .. v6}, La/xwc0;-><init>(ZZZZZ)V

    .line 169
    .line 170
    .line 171
    return-object v1

    .line 172
    :pswitch_12
    new-instance p0, La/vpi;

    .line 173
    .line 174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 175
    .line 176
    .line 177
    return-object p0

    .line 178
    :pswitch_13
    new-instance p0, La/zw3;

    .line 179
    .line 180
    sget-object v0, La/khc0;->a:La/khc0;

    .line 181
    .line 182
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 183
    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_14
    new-instance p0, La/zw3;

    .line 187
    .line 188
    sget-object v0, La/adc0;->a:La/adc0;

    .line 189
    .line 190
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 191
    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_15
    new-instance p0, La/zw3;

    .line 195
    .line 196
    sget-object v0, La/xcc0;->a:La/xcc0;

    .line 197
    .line 198
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 199
    .line 200
    .line 201
    return-object p0

    .line 202
    :pswitch_16
    new-instance p0, La/zw3;

    .line 203
    .line 204
    sget-object v0, La/mbc0;->a:La/mbc0;

    .line 205
    .line 206
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 207
    .line 208
    .line 209
    return-object p0

    .line 210
    :pswitch_17
    new-instance p0, La/zw3;

    .line 211
    .line 212
    sget-object v0, La/jbc0;->a:La/jbc0;

    .line 213
    .line 214
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 215
    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_18
    new-instance p0, La/zw3;

    .line 219
    .line 220
    sget-object v0, La/ybc0;->a:La/ybc0;

    .line 221
    .line 222
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 223
    .line 224
    .line 225
    return-object p0

    .line 226
    :pswitch_19
    new-instance p0, La/zw3;

    .line 227
    .line 228
    sget-object v0, La/pbc0;->a:La/pbc0;

    .line 229
    .line 230
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 231
    .line 232
    .line 233
    return-object p0

    .line 234
    :pswitch_1a
    new-instance p0, La/zw3;

    .line 235
    .line 236
    sget-object v0, La/dbc0;->a:La/dbc0;

    .line 237
    .line 238
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 239
    .line 240
    .line 241
    return-object p0

    .line 242
    :pswitch_1b
    new-instance p0, La/zw3;

    .line 243
    .line 244
    sget-object v0, La/sbc0;->a:La/sbc0;

    .line 245
    .line 246
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 247
    .line 248
    .line 249
    return-object p0

    .line 250
    :pswitch_1c
    new-instance p0, La/zw3;

    .line 251
    .line 252
    sget-object v0, La/okx;->a:La/okx;

    .line 253
    .line 254
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 255
    .line 256
    .line 257
    return-object p0

    .line 258
    nop

    .line 259
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
