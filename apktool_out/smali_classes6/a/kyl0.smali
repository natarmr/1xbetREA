.class public final synthetic La/kyl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/syl0;


# direct methods
.method public synthetic constructor <init>(La/syl0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kyl0;->a:B

    iput-object p1, p0, La/kyl0;->b:La/syl0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/kyl0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/kyl0;->b:La/syl0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/mk50;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/String;

    .line 11
    .line 12
    sget-object v0, La/syl0;->f2:La/eke0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, La/syl0;->H0()La/k3t0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v0, La/szl0;

    .line 25
    .line 26
    invoke-direct {v0, p1, p2}, La/szl0;-><init>(La/mk50;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    check-cast p1, La/clz;

    .line 36
    .line 37
    check-cast p2, La/blz;

    .line 38
    .line 39
    sget-object v0, La/syl0;->f2:La/eke0;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/syl0;->d2:La/v62;

    .line 48
    .line 49
    invoke-virtual {p0}, La/eg60;->e()V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_1
    check-cast p1, La/clz;

    .line 56
    .line 57
    check-cast p2, La/blz;

    .line 58
    .line 59
    sget-object v0, La/syl0;->f2:La/eke0;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2}, La/agd;->k()La/jg60;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    iget-object p0, p0, La/syl0;->d2:La/v62;

    .line 76
    .line 77
    invoke-virtual {p2, p1, p0}, La/jg60;->a(La/clz;La/eg60;)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    check-cast p2, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    sget-object v0, La/syl0;->f2:La/eke0;

    .line 96
    .line 97
    invoke-virtual {p0}, La/syl0;->H0()La/k3t0;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    new-instance v0, La/ozl0;

    .line 102
    .line 103
    invoke-direct {v0, p1, p2}, La/ozl0;-><init>(II)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_3
    check-cast p1, La/fet;

    .line 113
    .line 114
    check-cast p2, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    sget-object v0, La/syl0;->f2:La/eke0;

    .line 121
    .line 122
    and-int/lit8 v0, p2, 0x3

    .line 123
    .line 124
    const/4 v1, 0x2

    .line 125
    const/4 v2, 0x1

    .line 126
    const/4 v3, 0x0

    .line 127
    if-eq v0, v1, :cond_0

    .line 128
    .line 129
    move v0, v2

    .line 130
    goto :goto_0

    .line 131
    :cond_0
    move v0, v3

    .line 132
    :goto_0
    and-int/2addr p2, v2

    .line 133
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-eqz p2, :cond_3

    .line 138
    .line 139
    invoke-virtual {p0}, La/syl0;->H0()La/k3t0;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    check-cast p2, La/i3t0;

    .line 144
    .line 145
    invoke-virtual {p2, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-virtual {p0}, La/syl0;->H0()La/k3t0;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    invoke-virtual {p1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-nez p0, :cond_1

    .line 162
    .line 163
    sget-object p0, La/ukd;->a:La/cl5;

    .line 164
    .line 165
    if-ne v0, p0, :cond_2

    .line 166
    .line 167
    :cond_1
    new-instance v4, La/kcl0;

    .line 168
    .line 169
    const/4 v10, 0x0

    .line 170
    const/16 v11, 0xc

    .line 171
    .line 172
    const/4 v5, 0x1

    .line 173
    const-class v7, La/k3t0;

    .line 174
    .line 175
    const-string v8, "onAction"

    .line 176
    .line 177
    const-string v9, "onAction(Ljava/lang/Object;)V"

    .line 178
    .line 179
    invoke-direct/range {v4 .. v11}, La/kcl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    move-object v0, v4

    .line 186
    :cond_2
    check-cast v0, La/jhy;

    .line 187
    .line 188
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 189
    .line 190
    invoke-static {p2, v0, p1, v3}, La/l8x;->M(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 195
    .line 196
    .line 197
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
