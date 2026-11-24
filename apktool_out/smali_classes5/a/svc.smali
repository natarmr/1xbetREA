.class public final La/svc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/svc;->a:B

    iput-object p1, p0, La/svc;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/svc;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/svc;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, La/q0h0;

    .line 10
    .line 11
    check-cast p0, La/ype;

    .line 12
    .line 13
    invoke-virtual {p0}, La/ype;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/p0h0;

    .line 18
    .line 19
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    check-cast p0, La/v2;

    .line 24
    .line 25
    iget-object p0, p0, La/v2;->a:La/mre0;

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    move-object v1, p0

    .line 34
    check-cast v1, Ljava/lang/reflect/Type;

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, La/bqe0;->c(Ljava/lang/reflect/Type;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_1
    check-cast p0, La/mie0;

    .line 45
    .line 46
    iget-object p0, p0, La/mie0;->a:Ljava/lang/Object;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    check-cast p0, La/iyj0;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_1
    const-string p0, "result"

    .line 54
    .line 55
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :pswitch_2
    check-cast p0, Ljava/lang/Class;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_3
    check-cast p0, La/svc;

    .line 63
    .line 64
    invoke-virtual {p0}, La/svc;->invoke()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/riu0;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_4
    check-cast p0, La/dce;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_5
    check-cast p0, La/svc;

    .line 75
    .line 76
    invoke-virtual {p0}, La/svc;->invoke()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, La/riu0;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_6
    check-cast p0, La/dbe;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_7
    check-cast p0, La/svc;

    .line 87
    .line 88
    invoke-virtual {p0}, La/svc;->invoke()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, La/riu0;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_8
    check-cast p0, La/e7e;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_9
    check-cast p0, La/svc;

    .line 99
    .line 100
    invoke-virtual {p0}, La/svc;->invoke()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, La/riu0;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_a
    check-cast p0, La/i5e;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_b
    check-cast p0, La/svc;

    .line 111
    .line 112
    invoke-virtual {p0}, La/svc;->invoke()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/riu0;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_c
    check-cast p0, La/uzd;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_d
    new-instance v0, La/q0h0;

    .line 123
    .line 124
    check-cast p0, La/rzd;

    .line 125
    .line 126
    invoke-virtual {p0}, La/rzd;->invoke()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, La/p0h0;

    .line 131
    .line 132
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 133
    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_e
    check-cast p0, La/svc;

    .line 137
    .line 138
    invoke-virtual {p0}, La/svc;->invoke()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    check-cast p0, La/riu0;

    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_f
    check-cast p0, La/xyd;

    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_10
    new-instance v0, La/q0h0;

    .line 149
    .line 150
    check-cast p0, La/uyd;

    .line 151
    .line 152
    invoke-virtual {p0}, La/uyd;->invoke()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, La/p0h0;

    .line 157
    .line 158
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 159
    .line 160
    .line 161
    return-object v0

    .line 162
    :pswitch_11
    check-cast p0, La/svc;

    .line 163
    .line 164
    invoke-virtual {p0}, La/svc;->invoke()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, La/riu0;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_12
    check-cast p0, La/oyd;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_13
    check-cast p0, La/svc;

    .line 175
    .line 176
    invoke-virtual {p0}, La/svc;->invoke()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    check-cast p0, La/riu0;

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_14
    check-cast p0, La/exd;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_15
    new-instance v0, La/q0h0;

    .line 187
    .line 188
    check-cast p0, La/axd;

    .line 189
    .line 190
    invoke-virtual {p0}, La/axd;->invoke()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    check-cast p0, La/p0h0;

    .line 195
    .line 196
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 197
    .line 198
    .line 199
    return-object v0

    .line 200
    :pswitch_16
    check-cast p0, La/svc;

    .line 201
    .line 202
    invoke-virtual {p0}, La/svc;->invoke()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    check-cast p0, La/riu0;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_17
    check-cast p0, La/nud;

    .line 210
    .line 211
    return-object p0

    .line 212
    :pswitch_18
    new-instance v0, La/q0h0;

    .line 213
    .line 214
    check-cast p0, La/jud;

    .line 215
    .line 216
    invoke-virtual {p0}, La/jud;->invoke()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    check-cast p0, La/p0h0;

    .line 221
    .line 222
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 223
    .line 224
    .line 225
    return-object v0

    .line 226
    :pswitch_19
    check-cast p0, La/t33;

    .line 227
    .line 228
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    check-cast p0, La/y3d;

    .line 233
    .line 234
    iget-wide v0, p0, La/y3d;->a:J

    .line 235
    .line 236
    return-object p0

    .line 237
    :pswitch_1a
    check-cast p0, La/svc;

    .line 238
    .line 239
    invoke-virtual {p0}, La/svc;->invoke()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    check-cast p0, La/riu0;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_1b
    check-cast p0, La/ywc;

    .line 247
    .line 248
    return-object p0

    .line 249
    :pswitch_1c
    check-cast p0, La/h79;

    .line 250
    .line 251
    invoke-virtual {p0}, La/h79;->invoke()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    check-cast p0, La/riu0;

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
