.class public final synthetic La/j8b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g9b0;


# direct methods
.method public synthetic constructor <init>(La/g9b0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j8b0;->a:B

    iput-object p1, p0, La/j8b0;->b:La/g9b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/j8b0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/j8b0;->b:La/g9b0;

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
    iget-object p0, p0, La/g9b0;->S:La/p7m0;

    .line 16
    .line 17
    new-instance v0, La/n8b0;

    .line 18
    .line 19
    invoke-direct {v0, p1}, La/n8b0;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    new-instance p0, La/yn90;

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/g9b0;->R:La/p7m0;

    .line 39
    .line 40
    new-instance v0, La/n8b0;

    .line 41
    .line 42
    invoke-direct {v0, p1}, La/n8b0;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    new-instance p0, La/yn90;

    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, La/g9b0;->T:La/p7m0;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget-object p1, La/m8b0;->a:La/m8b0;

    .line 67
    .line 68
    invoke-virtual {p0, v2, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_2
    check-cast p1, La/k0w0;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object p0, p0, La/g9b0;->j:La/uf3;

    .line 80
    .line 81
    iget-object p0, p0, La/uf3;->a:La/oct;

    .line 82
    .line 83
    invoke-virtual {p0}, La/oct;->d()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, La/c8d;

    .line 94
    .line 95
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 96
    .line 97
    new-instance v0, La/v7d;

    .line 98
    .line 99
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 103
    .line 104
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_3
    check-cast p1, La/k0w0;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object p0, p0, La/g9b0;->j:La/uf3;

    .line 113
    .line 114
    iget-object p0, p0, La/uf3;->a:La/oct;

    .line 115
    .line 116
    invoke-virtual {p0}, La/oct;->e()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p0, La/c8d;

    .line 127
    .line 128
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 129
    .line 130
    new-instance v0, La/v7d;

    .line 131
    .line 132
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 133
    .line 134
    .line 135
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 136
    .line 137
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_4
    check-cast p1, Ljava/util/List;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    sget-object p1, La/s8b0;->b:La/s8b0;

    .line 146
    .line 147
    invoke-virtual {p0, p1}, La/g9b0;->A(La/s8b0;)V

    .line 148
    .line 149
    .line 150
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object p0, p0, La/g9b0;->U:La/p7m0;

    .line 159
    .line 160
    new-instance v0, La/n8b0;

    .line 161
    .line 162
    invoke-direct {v0, p1}, La/n8b0;-><init>(Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    new-instance p0, La/yn90;

    .line 172
    .line 173
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object p0

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
