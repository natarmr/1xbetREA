.class public final synthetic La/ika;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(BLa/mm40;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/ika;->a:B

    iput-object p2, p0, La/ika;->b:La/mm40;

    iput-object p3, p0, La/ika;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/util/List;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/ika;->a:B

    iput-object p1, p0, La/ika;->b:La/mm40;

    iput-object p2, p0, La/ika;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/ika;->a:B

    .line 2
    .line 3
    const/16 v1, 0x30

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, La/ika;->c:Ljava/util/List;

    .line 9
    .line 10
    iget-object p0, p0, La/ika;->b:La/mm40;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, La/fet;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v4}, La/x8x;->L(I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-static {p0, v5, p1, p2}, La/mym0;->a(La/mm40;Ljava/util/List;La/fet;I)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    check-cast p1, La/fet;

    .line 33
    .line 34
    check-cast p2, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const/4 p2, 0x7

    .line 40
    invoke-static {p2}, La/x8x;->L(I)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    invoke-static {p0, v5, p1, p2}, La/q5x;->m(La/mm40;Ljava/util/List;La/fet;I)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    sget-object v0, La/j120;->d:La/ugd;

    .line 51
    .line 52
    check-cast p1, La/fet;

    .line 53
    .line 54
    check-cast p2, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    and-int/lit8 v6, p2, 0x3

    .line 61
    .line 62
    if-eq v6, v3, :cond_0

    .line 63
    .line 64
    move v2, v4

    .line 65
    :cond_0
    and-int/2addr p2, v4

    .line 66
    invoke-virtual {p1, p2, v2}, La/fet;->U(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-eqz p2, :cond_1

    .line 71
    .line 72
    new-instance p2, La/jka;

    .line 73
    .line 74
    const/4 v2, 0x3

    .line 75
    invoke-direct {p2, v5, v2}, La/jka;-><init>(Ljava/util/List;B)V

    .line 76
    .line 77
    .line 78
    const v2, 0x6f93ee82

    .line 79
    .line 80
    .line 81
    invoke-static {v2, p2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, p0, p2, p1, v1}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 94
    .line 95
    .line 96
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_2
    sget-object v0, La/i120;->c:La/ugd;

    .line 100
    .line 101
    check-cast p1, La/fet;

    .line 102
    .line 103
    check-cast p2, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    and-int/lit8 v6, p2, 0x3

    .line 110
    .line 111
    if-eq v6, v3, :cond_2

    .line 112
    .line 113
    move v2, v4

    .line 114
    :cond_2
    and-int/2addr p2, v4

    .line 115
    invoke-virtual {p1, p2, v2}, La/fet;->U(IZ)Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_3

    .line 120
    .line 121
    new-instance p2, La/jka;

    .line 122
    .line 123
    invoke-direct {p2, v5, v3}, La/jka;-><init>(Ljava/util/List;B)V

    .line 124
    .line 125
    .line 126
    const v2, -0x228c807a

    .line 127
    .line 128
    .line 129
    invoke-static {v2, p2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v0, p0, p2, p1, v1}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 142
    .line 143
    .line 144
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_3
    sget-object v0, La/j2e;->a:La/ugd;

    .line 148
    .line 149
    check-cast p1, La/fet;

    .line 150
    .line 151
    check-cast p2, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    and-int/lit8 v6, p2, 0x3

    .line 158
    .line 159
    if-eq v6, v3, :cond_4

    .line 160
    .line 161
    move v3, v4

    .line 162
    goto :goto_2

    .line 163
    :cond_4
    move v3, v2

    .line 164
    :goto_2
    and-int/2addr p2, v4

    .line 165
    invoke-virtual {p1, p2, v3}, La/fet;->U(IZ)Z

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    if-eqz p2, :cond_5

    .line 170
    .line 171
    new-instance p2, La/jka;

    .line 172
    .line 173
    invoke-direct {p2, v5, v2}, La/jka;-><init>(Ljava/util/List;B)V

    .line 174
    .line 175
    .line 176
    const v2, -0x434ee84c

    .line 177
    .line 178
    .line 179
    invoke-static {v2, p2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v0, p0, p2, p1, v1}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 192
    .line 193
    .line 194
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object p0

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
