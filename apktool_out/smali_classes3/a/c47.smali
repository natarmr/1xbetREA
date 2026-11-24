.class public final synthetic La/c47;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f47;


# direct methods
.method public synthetic constructor <init>(La/f47;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c47;->a:B

    iput-object p1, p0, La/c47;->b:La/f47;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/c47;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/c47;->b:La/f47;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/k0w0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/f47;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/evz;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object p0, La/fd10;->c:La/fd10;

    .line 22
    .line 23
    new-instance v0, Lorg/xplatform/lotto/impl/navigation/LottoScreenFactoryImpl$getLottoScreen$1;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lorg/xplatform/lotto/impl/navigation/LottoScreenFactoryImpl$getLottoScreen$1;-><init>(La/fd10;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, La/c8d;

    .line 35
    .line 36
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 37
    .line 38
    new-instance v0, La/v7d;

    .line 39
    .line 40
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, La/f47;->p:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, La/s2m0;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance p0, Lorg/xplatform/toto_jackpot/impl/navigation/TotoJackpotScreens$TotoJackpotDsFragmentScreen;

    .line 61
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, La/c8d;

    .line 72
    .line 73
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 74
    .line 75
    new-instance v0, La/v7d;

    .line 76
    .line 77
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, La/f47;->o:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Lorg/xplatform/toto_bet/core/navigation/a;

    .line 93
    .line 94
    invoke-virtual {p0}, Lorg/xplatform/toto_bet/core/navigation/a;->a()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, La/c8d;

    .line 105
    .line 106
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 107
    .line 108
    new-instance v0, La/v7d;

    .line 109
    .line 110
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 114
    .line 115
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0

    .line 118
    :pswitch_2
    check-cast p1, La/i1w0;

    .line 119
    .line 120
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget-object p0, p0, La/f47;->m:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p0, La/jh70;

    .line 127
    .line 128
    const/4 v1, 0x0

    .line 129
    invoke-static {p0, v1}, La/jh70;->j(La/jh70;Z)Lorg/xplatform/personal/impl/navigation/PersonalScreen$PersonalDataScreen;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    instance-of v2, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 134
    .line 135
    if-eqz v2, :cond_0

    .line 136
    .line 137
    new-instance v2, La/e1w0;

    .line 138
    .line 139
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 140
    .line 141
    invoke-direct {v2, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 142
    .line 143
    .line 144
    new-instance p0, La/c8d;

    .line 145
    .line 146
    sget-object v3, La/y7d;->a:La/v7d;

    .line 147
    .line 148
    invoke-direct {p0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_0
    new-instance v2, La/w0w0;

    .line 156
    .line 157
    invoke-direct {v2, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 158
    .line 159
    .line 160
    new-instance p0, La/c8d;

    .line 161
    .line 162
    sget-object v3, La/y7d;->a:La/v7d;

    .line 163
    .line 164
    invoke-direct {p0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    :goto_0
    invoke-static {p1, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    :goto_1
    move-object v0, p0

    .line 175
    check-cast v0, La/paw;

    .line 176
    .line 177
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_1

    .line 182
    .line 183
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    check-cast v0, La/oe50;

    .line 188
    .line 189
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object p0

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
