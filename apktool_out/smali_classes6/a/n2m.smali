.class public final synthetic La/n2m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:La/v6n;


# direct methods
.method public synthetic constructor <init>(ILa/v6n;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/n2m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/n2m;->b:I

    iput-object p2, p0, La/n2m;->c:La/v6n;

    return-void
.end method

.method public synthetic constructor <init>(La/v6n;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/n2m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n2m;->c:La/v6n;

    iput p2, p0, La/n2m;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/n2m;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/n2m;->c:La/v6n;

    .line 5
    .line 6
    iget p0, p0, La/n2m;->b:I

    .line 7
    .line 8
    check-cast p1, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    and-int/lit8 v0, p2, 0x3

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x2

    .line 23
    if-eq v0, v4, :cond_0

    .line 24
    .line 25
    move v0, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v3

    .line 28
    :goto_0
    and-int/2addr p2, v1

    .line 29
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_4

    .line 34
    .line 35
    sget-object p2, La/qmk;->a:La/zcl;

    .line 36
    .line 37
    const/high16 p2, 0x41400000    # 12.0f

    .line 38
    .line 39
    invoke-static {p2, p1}, La/pkd;->b(FLa/fet;)F

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    mul-int/2addr p0, v4

    .line 44
    int-to-float p0, p0

    .line 45
    sub-float/2addr p2, p0

    .line 46
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 47
    .line 48
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 53
    .line 54
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    sget-object p0, La/vgg0;->a:La/ugg0;

    .line 59
    .line 60
    new-instance p0, La/qed0;

    .line 61
    .line 62
    invoke-direct {p0, p2}, La/qed0;-><init>(F)V

    .line 63
    .line 64
    .line 65
    new-instance p2, La/ugg0;

    .line 66
    .line 67
    invoke-direct {p2, p0, p0, p0, p0}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, La/jm40;->b:La/jm40;

    .line 71
    .line 72
    invoke-static {p0, v4, v5, p2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    sget-object v0, La/gqw0;->e:La/zx7;

    .line 77
    .line 78
    invoke-static {v0, v3}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-wide v4, p1, La/fet;->T:J

    .line 83
    .line 84
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-static {p1, p2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, La/fet;->i0()V

    .line 102
    .line 103
    .line 104
    iget-boolean v6, p1, La/fet;->S:Z

    .line 105
    .line 106
    if-eqz v6, :cond_1

    .line 107
    .line 108
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 109
    .line 110
    invoke-virtual {p1, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    invoke-virtual {p1}, La/fet;->r0()V

    .line 115
    .line 116
    .line 117
    :goto_1
    sget-object v6, La/gqw0;->x:La/shd;

    .line 118
    .line 119
    invoke-static {p1, v0, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 120
    .line 121
    .line 122
    sget-object v0, La/gqw0;->w:La/shd;

    .line 123
    .line 124
    invoke-static {p1, v5, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    sget-object v4, La/gqw0;->y:La/shd;

    .line 132
    .line 133
    invoke-static {p1, v0, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 137
    .line 138
    .line 139
    sget-object v0, La/gqw0;->v:La/shd;

    .line 140
    .line 141
    invoke-static {p1, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    const/high16 p2, 0x40000000    # 2.0f

    .line 145
    .line 146
    invoke-static {p0, p2}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {p1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    if-nez p2, :cond_2

    .line 159
    .line 160
    sget-object p2, La/ukd;->a:La/cl5;

    .line 161
    .line 162
    if-ne v0, p2, :cond_3

    .line 163
    .line 164
    :cond_2
    new-instance v0, La/m2m;

    .line 165
    .line 166
    const/4 p2, 0x3

    .line 167
    invoke-direct {v0, v2, p2}, La/m2m;-><init>(La/v6n;B)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_3
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 174
    .line 175
    invoke-static {v3, p1, p0, v0}, La/kkb;->p(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v1}, La/fet;->r(Z)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_4
    invoke-virtual {p1}, La/fet;->X()V

    .line 183
    .line 184
    .line 185
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object p0

    .line 188
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    or-int/2addr p0, v1

    .line 192
    invoke-static {p0}, La/x8x;->L(I)I

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    invoke-static {v2, p1, p0}, La/vdb;->h(La/v6n;La/fet;I)V

    .line 197
    .line 198
    .line 199
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object p0

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
