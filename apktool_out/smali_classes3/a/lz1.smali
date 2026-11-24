.class public final synthetic La/lz1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wz1;


# direct methods
.method public synthetic constructor <init>(La/wz1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lz1;->a:B

    iput-object p1, p0, La/lz1;->b:La/wz1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/lz1;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/lz1;->b:La/wz1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, La/pb0;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 15
    .line 16
    iget-object v1, p1, La/ocj;->a:La/p7m0;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 26
    .line 27
    move-object v3, p1

    .line 28
    check-cast v3, La/dz1;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v7, v0, La/pb0;->a:La/ql5;

    .line 34
    .line 35
    const/4 v12, 0x0

    .line 36
    const/16 v13, 0xfdf

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v11, 0x0

    .line 45
    invoke-static/range {v3 .. v13}, La/dz1;->a(La/dz1;ZZZLa/ql5;ZLa/myr0;Ljava/lang/Long;ZLa/bie;I)La/dz1;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v1, p1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 64
    .line 65
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 66
    .line 67
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 75
    .line 76
    move-object v2, p1

    .line 77
    check-cast v2, La/dz1;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget-object v11, La/ghe;->a:La/ghe;

    .line 83
    .line 84
    const/16 v12, 0x7ff

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    const/4 v4, 0x0

    .line 88
    const/4 v5, 0x0

    .line 89
    const/4 v6, 0x0

    .line 90
    const/4 v7, 0x0

    .line 91
    const/4 v8, 0x0

    .line 92
    const/4 v9, 0x0

    .line 93
    const/4 v10, 0x0

    .line 94
    invoke-static/range {v2 .. v12}, La/dz1;->a(La/dz1;ZZZLa/ql5;ZLa/myr0;Ljava/lang/Long;ZLa/bie;I)La/dz1;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_1

    .line 103
    .line 104
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object p0, p0, La/wz1;->p:La/duj;

    .line 113
    .line 114
    new-instance v0, La/xg1;

    .line 115
    .line 116
    const/16 v1, 0x11

    .line 117
    .line 118
    invoke-direct {v0, v1}, La/xg1;-><init>(B)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 122
    .line 123
    .line 124
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 133
    .line 134
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 135
    .line 136
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 144
    .line 145
    move-object v2, p1

    .line 146
    check-cast v2, La/dz1;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    sget-object v11, La/ghe;->a:La/ghe;

    .line 152
    .line 153
    const/16 v12, 0x7ff

    .line 154
    .line 155
    const/4 v3, 0x0

    .line 156
    const/4 v4, 0x0

    .line 157
    const/4 v5, 0x0

    .line 158
    const/4 v6, 0x0

    .line 159
    const/4 v7, 0x0

    .line 160
    const/4 v8, 0x0

    .line 161
    const/4 v9, 0x0

    .line 162
    const/4 v10, 0x0

    .line 163
    invoke-static/range {v2 .. v12}, La/dz1;->a(La/dz1;ZZZLa/ql5;ZLa/myr0;Ljava/lang/Long;ZLa/bie;I)La/dz1;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-eqz p1, :cond_2

    .line 172
    .line 173
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 182
    .line 183
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 184
    .line 185
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 193
    .line 194
    move-object v2, p1

    .line 195
    check-cast v2, La/dz1;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    sget-object v11, La/ghe;->a:La/ghe;

    .line 201
    .line 202
    const/16 v12, 0x7ff

    .line 203
    .line 204
    const/4 v3, 0x0

    .line 205
    const/4 v4, 0x0

    .line 206
    const/4 v5, 0x0

    .line 207
    const/4 v6, 0x0

    .line 208
    const/4 v7, 0x0

    .line 209
    const/4 v8, 0x0

    .line 210
    const/4 v9, 0x0

    .line 211
    const/4 v10, 0x0

    .line 212
    invoke-static/range {v2 .. v12}, La/dz1;->a(La/dz1;ZZZLa/ql5;ZLa/myr0;Ljava/lang/Long;ZLa/bie;I)La/dz1;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-eqz p1, :cond_3

    .line 221
    .line 222
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object p0

    .line 225
    :pswitch_4
    check-cast p1, La/k0w0;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    iget-object p0, p0, La/wz1;->D:La/roq0;

    .line 231
    .line 232
    sget-object v0, La/fk60;->b:La/uuz;

    .line 233
    .line 234
    sget-object v0, La/wz1;->T:Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    new-instance p0, Lorg/xplatform/onboarding/impl/navigation/OnBoardingScreens$TipsDialogScreen;

    .line 240
    .line 241
    const/16 v1, 0x12

    .line 242
    .line 243
    invoke-direct {p0, v1, v0}, Lorg/xplatform/onboarding/impl/navigation/OnBoardingScreens$TipsDialogScreen;-><init>(ILjava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 247
    .line 248
    .line 249
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object p0

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
