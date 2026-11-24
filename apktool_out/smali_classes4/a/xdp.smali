.class public final synthetic La/xdp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bep;


# direct methods
.method public synthetic constructor <init>(La/bep;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xdp;->a:B

    iput-object p1, p0, La/xdp;->b:La/bep;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/xdp;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/xdp;->b:La/bep;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object v0, p0, La/bep;->D:La/m1e;

    .line 16
    .line 17
    invoke-interface {v0}, La/m1e;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance v0, La/hp1;

    .line 24
    .line 25
    iget-object v2, p0, La/bep;->B:La/ctf0;

    .line 26
    .line 27
    new-array v3, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 30
    .line 31
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v2, p1, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {v0, p1}, La/hp1;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 47
    .line 48
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 49
    .line 50
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 58
    .line 59
    move-object v2, p1

    .line 60
    check-cast v2, La/e2p;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const/4 v12, 0x0

    .line 66
    const v13, 0xff39

    .line 67
    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    const/4 v4, 0x0

    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x1

    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v10, 0x0

    .line 77
    const/4 v11, 0x0

    .line 78
    invoke-static/range {v2 .. v13}, La/e2p;->a(La/e2p;ZZZZZZLjava/util/List;Ljava/util/List;La/ot0;ZI)La/e2p;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_1

    .line 87
    .line 88
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, La/bep;->F:La/peg0;

    .line 97
    .line 98
    new-instance v2, La/fr1;

    .line 99
    .line 100
    iget-object p0, p0, La/bep;->B:La/ctf0;

    .line 101
    .line 102
    new-array v3, v1, [Ljava/lang/Object;

    .line 103
    .line 104
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 105
    .line 106
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    const v3, 0x7f13015a

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    const-wide/16 v3, 0x11

    .line 118
    .line 119
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    sget-object p0, La/nw80;->b:La/nw80;

    .line 128
    .line 129
    invoke-virtual {p0}, La/nw80;->getId()J

    .line 130
    .line 131
    .line 132
    move-result-wide v6

    .line 133
    new-instance v4, La/fs80;

    .line 134
    .line 135
    const/4 v12, 0x0

    .line 136
    const/16 v13, 0x78

    .line 137
    .line 138
    const/4 v9, 0x0

    .line 139
    const-wide/16 v10, 0x0

    .line 140
    .line 141
    invoke-direct/range {v4 .. v13}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 142
    .line 143
    .line 144
    const/4 p0, 0x0

    .line 145
    const/4 v1, 0x2

    .line 146
    invoke-direct {v2, v4, p0, v1}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 154
    .line 155
    .line 156
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    iget-object p0, p0, La/bep;->F:La/peg0;

    .line 165
    .line 166
    new-instance v0, La/hr1;

    .line 167
    .line 168
    const-wide/16 v1, 0x0

    .line 169
    .line 170
    const/4 v3, 0x3

    .line 171
    invoke-direct {v0, v1, v2, v3}, La/hr1;-><init>(JI)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 179
    .line 180
    .line 181
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
