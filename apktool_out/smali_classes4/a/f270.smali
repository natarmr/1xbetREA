.class public final synthetic La/f270;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/n270;


# direct methods
.method public synthetic constructor <init>(La/n270;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f270;->a:B

    iput-object p1, p0, La/f270;->b:La/n270;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/f270;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/f270;->b:La/n270;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/k0w0;

    .line 10
    .line 11
    iget-object p0, p0, La/n270;->J:La/uf3;

    .line 12
    .line 13
    iget-object p0, p0, La/uf3;->a:La/oct;

    .line 14
    .line 15
    invoke-virtual {p0}, La/oct;->e()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, La/c8d;

    .line 26
    .line 27
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 28
    .line 29
    new-instance v0, La/v7d;

    .line 30
    .line 31
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, La/n270;->M:La/duj;

    .line 45
    .line 46
    new-instance v0, La/cr60;

    .line 47
    .line 48
    const/16 v1, 0xf

    .line 49
    .line 50
    invoke-direct {v0, v1}, La/cr60;-><init>(B)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, La/n270;->J:La/uf3;

    .line 65
    .line 66
    iget-object p0, p0, La/uf3;->a:La/oct;

    .line 67
    .line 68
    new-instance p0, Lorg/xplatform/games_section/feature/bonuses_info/di/BonusesInfoScreenFactoryImpl$getBonusesInfoScreen$1;

    .line 69
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, La/c8d;

    .line 80
    .line 81
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 82
    .line 83
    new-instance v0, La/v7d;

    .line 84
    .line 85
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_2
    check-cast p1, La/k0w0;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, La/n270;->J:La/uf3;

    .line 99
    .line 100
    iget-object p0, p0, La/uf3;->a:La/oct;

    .line 101
    .line 102
    new-instance p0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$WeeklyRewardFragmentScreen;

    .line 103
    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p0, La/c8d;

    .line 114
    .line 115
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 116
    .line 117
    new-instance v0, La/v7d;

    .line 118
    .line 119
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 120
    .line 121
    .line 122
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 123
    .line 124
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_3
    check-cast p1, La/k0w0;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object p0, p0, La/n270;->J:La/uf3;

    .line 133
    .line 134
    iget-object p0, p0, La/uf3;->a:La/oct;

    .line 135
    .line 136
    invoke-virtual {p0}, La/oct;->d()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, La/c8d;

    .line 147
    .line 148
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 149
    .line 150
    new-instance v0, La/v7d;

    .line 151
    .line 152
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 153
    .line 154
    .line 155
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 156
    .line 157
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_4
    check-cast p1, La/k0w0;

    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, La/n270;->J:La/uf3;

    .line 166
    .line 167
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    check-cast p0, La/c270;

    .line 172
    .line 173
    iget-object p0, p0, La/c270;->b:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    new-instance v0, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getAllBonusesScreen$1;

    .line 179
    .line 180
    invoke-direct {v0, p0}, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getAllBonusesScreen$1;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast p0, La/c8d;

    .line 190
    .line 191
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 192
    .line 193
    new-instance v0, La/v7d;

    .line 194
    .line 195
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 196
    .line 197
    .line 198
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 199
    .line 200
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object p0

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
