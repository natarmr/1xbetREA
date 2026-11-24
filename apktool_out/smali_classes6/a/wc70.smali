.class public final synthetic La/wc70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xd70;


# direct methods
.method public synthetic constructor <init>(La/xd70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wc70;->a:B

    iput-object p1, p0, La/wc70;->b:La/xd70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/wc70;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    const-string v4, ""

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object p0, p0, La/wc70;->b:La/xd70;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, La/k0w0;

    .line 15
    .line 16
    invoke-virtual {p1, v5}, La/k0w0;->c(La/m7h0;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, La/xd70;->s:La/z7z;

    .line 20
    .line 21
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-object v5, v0

    .line 29
    check-cast v5, La/oct;

    .line 30
    .line 31
    sget-object v10, La/t270;->b:La/t270;

    .line 32
    .line 33
    const/4 v11, 0x0

    .line 34
    const/16 v12, 0x17

    .line 35
    .line 36
    const-wide/16 v6, 0x0

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    invoke-static/range {v5 .. v12}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    check-cast p0, La/oct;

    .line 52
    .line 53
    new-instance p0, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getAllBonusesScreen$1;

    .line 54
    .line 55
    invoke-direct {p0, v4}, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getAllBonusesScreen$1;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-array v3, v3, [La/m7h0;

    .line 59
    .line 60
    aput-object v0, v3, v2

    .line 61
    .line 62
    aput-object p0, v3, v1

    .line 63
    .line 64
    invoke-virtual {p1, v3}, La/k0w0;->i([La/m7h0;)V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 71
    .line 72
    invoke-virtual {p1, v5}, La/k0w0;->c(La/m7h0;)V

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, La/xd70;->s:La/z7z;

    .line 76
    .line 77
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-object v5, v0

    .line 85
    check-cast v5, La/oct;

    .line 86
    .line 87
    sget-object v10, La/t270;->b:La/t270;

    .line 88
    .line 89
    const/4 v11, 0x0

    .line 90
    const/16 v12, 0x17

    .line 91
    .line 92
    const-wide/16 v6, 0x0

    .line 93
    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v9, 0x0

    .line 96
    invoke-static/range {v5 .. v12}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    check-cast p0, La/oct;

    .line 108
    .line 109
    new-instance p0, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getAllBonusesScreen$1;

    .line 110
    .line 111
    invoke-direct {p0, v4}, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getAllBonusesScreen$1;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    new-array v3, v3, [La/m7h0;

    .line 115
    .line 116
    aput-object v0, v3, v2

    .line 117
    .line 118
    aput-object p0, v3, v1

    .line 119
    .line 120
    invoke-virtual {p1, v3}, La/k0w0;->i([La/m7h0;)V

    .line 121
    .line 122
    .line 123
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 127
    .line 128
    iget-object v0, p0, La/xd70;->s:La/z7z;

    .line 129
    .line 130
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, La/oct;

    .line 135
    .line 136
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, La/xb70;

    .line 141
    .line 142
    iget-object v1, v1, La/xb70;->n:La/fa70;

    .line 143
    .line 144
    iget-wide v1, v1, La/fa70;->e:J

    .line 145
    .line 146
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    check-cast v3, La/xb70;

    .line 151
    .line 152
    iget-object v3, v3, La/xb70;->p:La/c970;

    .line 153
    .line 154
    iget-object v3, v3, La/c970;->b:La/csr;

    .line 155
    .line 156
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    check-cast p0, La/xb70;

    .line 161
    .line 162
    iget-object p0, p0, La/xb70;->b:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v0, v1, v2, v3, p0}, La/oct;->c(JLa/csr;Ljava/lang/String;)Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 169
    .line 170
    .line 171
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, p1}, La/xd70;->T(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    iget-object p0, p0, La/xd70;->x:La/z7z;

    .line 183
    .line 184
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, La/hkt0;

    .line 189
    .line 190
    sget-object p1, La/vpv0;->a:La/vpv0;

    .line 191
    .line 192
    invoke-virtual {p0, p1}, La/hkt0;->a(La/vpv0;)V

    .line 193
    .line 194
    .line 195
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object p0

    .line 198
    :pswitch_3
    check-cast p1, La/k0w0;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    iget-object v0, p0, La/xd70;->s:La/z7z;

    .line 204
    .line 205
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, La/oct;

    .line 210
    .line 211
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    check-cast v1, La/xb70;

    .line 216
    .line 217
    iget-object v1, v1, La/xb70;->n:La/fa70;

    .line 218
    .line 219
    iget-wide v1, v1, La/fa70;->e:J

    .line 220
    .line 221
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    check-cast v3, La/xb70;

    .line 226
    .line 227
    iget-object v3, v3, La/xb70;->p:La/c970;

    .line 228
    .line 229
    iget-object v3, v3, La/c970;->b:La/csr;

    .line 230
    .line 231
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    check-cast p0, La/xb70;

    .line 236
    .line 237
    iget-object p0, p0, La/xb70;->b:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v0, v1, v2, v3, p0}, La/oct;->c(JLa/csr;Ljava/lang/String;)Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 244
    .line 245
    .line 246
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object p0

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
