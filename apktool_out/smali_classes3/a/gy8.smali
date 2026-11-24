.class public final synthetic La/gy8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ty8;


# direct methods
.method public synthetic constructor <init>(La/ty8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gy8;->a:B

    iput-object p1, p0, La/gy8;->b:La/ty8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/gy8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/gy8;->b:La/ty8;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/k0w0;

    .line 10
    .line 11
    iget-object v0, p0, La/ty8;->x:La/peg0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, La/yx8;

    .line 18
    .line 19
    iget-object v2, v2, La/yx8;->c:La/xx8;

    .line 20
    .line 21
    iget-object v2, v2, La/xx8;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-object p0, p0, La/ty8;->p:La/uc0;

    .line 24
    .line 25
    iget-object p0, p0, La/uc0;->h:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandInfoFragmentScreen;

    .line 34
    .line 35
    invoke-direct {v0, v2, p0, v1}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandInfoFragmentScreen;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    move-object v0, p1

    .line 45
    check-cast v0, La/pb0;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 51
    .line 52
    iget-object v2, p1, La/ocj;->a:La/p7m0;

    .line 53
    .line 54
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 62
    .line 63
    move-object v3, p1

    .line 64
    check-cast v3, La/yx8;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v8, v0, La/pb0;->a:La/ql5;

    .line 70
    .line 71
    const/4 v12, 0x0

    .line 72
    const v13, 0xfffef

    .line 73
    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    const/4 v5, 0x0

    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v7, 0x0

    .line 79
    const/4 v9, 0x0

    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v11, 0x0

    .line 82
    invoke-static/range {v3 .. v13}, La/yx8;->a(La/yx8;La/wx8;La/vx8;La/xx8;ZLa/ql5;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZI)La/yx8;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v2, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_0

    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    instance-of v0, p1, La/jfp;

    .line 101
    .line 102
    iget-object v2, p0, La/ty8;->s:La/ctf0;

    .line 103
    .line 104
    if-eqz v0, :cond_1

    .line 105
    .line 106
    new-instance p1, La/ox8;

    .line 107
    .line 108
    new-array v0, v1, [Ljava/lang/Object;

    .line 109
    .line 110
    iget-object v3, v2, La/ctf0;->b:La/lsm0;

    .line 111
    .line 112
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const v4, 0x7f1307bb

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v4, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    new-array v3, v1, [Ljava/lang/Object;

    .line 124
    .line 125
    iget-object v4, v2, La/ctf0;->b:La/lsm0;

    .line 126
    .line 127
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    const v5, 0x7f1303d7

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    new-array v4, v1, [Ljava/lang/Object;

    .line 139
    .line 140
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 141
    .line 142
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    const v4, 0x7f130e5d

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-direct {p1, v0, v3, v1}, La/ox8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_1
    new-instance v0, La/nx8;

    .line 161
    .line 162
    invoke-static {p1, v2}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-direct {v0, p1}, La/nx8;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object p0

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
