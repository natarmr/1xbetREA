.class public final synthetic La/umr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uy6;


# direct methods
.method public synthetic constructor <init>(La/uy6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/umr0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/umr0;->b:La/uy6;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/umr0;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/umr0;->b:La/uy6;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    check-cast p1, La/y5d;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p2, La/fet;

    .line 15
    .line 16
    check-cast p3, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    and-int/lit8 p1, p3, 0x11

    .line 26
    .line 27
    if-eq p1, v1, :cond_0

    .line 28
    .line 29
    move p1, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p1, v2

    .line 32
    :goto_0
    and-int/2addr p3, v3

    .line 33
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    sget-object p1, La/qmk;->a:La/zcl;

    .line 40
    .line 41
    const/high16 v7, 0x40000000    # 2.0f

    .line 42
    .line 43
    const/4 v8, 0x7

    .line 44
    sget-object v3, La/jm40;->b:La/jm40;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p0, p0, La/uy6;->a:La/uf40;

    .line 54
    .line 55
    iget-object p0, p0, La/uf40;->b:La/d480;

    .line 56
    .line 57
    check-cast p0, La/c480;

    .line 58
    .line 59
    invoke-static {p1, p0, p2, v2}, La/wpm0;->f(La/mm40;La/c480;La/fet;I)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {p2}, La/fet;->X()V

    .line 64
    .line 65
    .line 66
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_0
    check-cast p2, La/fet;

    .line 70
    .line 71
    check-cast p3, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    and-int/lit8 p1, p3, 0x11

    .line 81
    .line 82
    if-eq p1, v1, :cond_2

    .line 83
    .line 84
    move p1, v3

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    move p1, v2

    .line 87
    :goto_2
    and-int/2addr p3, v3

    .line 88
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    iget-object p0, p0, La/uy6;->a:La/uf40;

    .line 95
    .line 96
    iget-object p0, p0, La/uf40;->a:La/ogs;

    .line 97
    .line 98
    check-cast p0, La/kgs;

    .line 99
    .line 100
    iget-object p0, p0, La/kgs;->a:Ljava/lang/String;

    .line 101
    .line 102
    sget-object p1, La/jm40;->b:La/jm40;

    .line 103
    .line 104
    invoke-static {v2, p2, p1, p0}, La/r7x;->c(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 109
    .line 110
    .line 111
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_1
    move-object v10, p2

    .line 115
    check-cast v10, La/fet;

    .line 116
    .line 117
    check-cast p3, Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    and-int/lit8 p1, p2, 0x11

    .line 127
    .line 128
    if-eq p1, v1, :cond_4

    .line 129
    .line 130
    move v2, v3

    .line 131
    :cond_4
    and-int/lit8 p1, p2, 0x1

    .line 132
    .line 133
    invoke-virtual {v10, p1, v2}, La/fet;->U(IZ)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_5

    .line 138
    .line 139
    iget-object p1, p0, La/uy6;->a:La/uf40;

    .line 140
    .line 141
    iget-object v5, p1, La/uf40;->c:La/j43;

    .line 142
    .line 143
    iget-object v6, p1, La/uf40;->d:Ljava/lang/String;

    .line 144
    .line 145
    new-instance p1, La/umr0;

    .line 146
    .line 147
    invoke-direct {p1, p0, v3}, La/umr0;-><init>(La/uy6;B)V

    .line 148
    .line 149
    .line 150
    const p2, 0x1109950d

    .line 151
    .line 152
    .line 153
    invoke-static {p2, p1, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    new-instance p1, La/umr0;

    .line 158
    .line 159
    const/4 p2, 0x2

    .line 160
    invoke-direct {p1, p0, p2}, La/umr0;-><init>(La/uy6;B)V

    .line 161
    .line 162
    .line 163
    const p0, -0x5e9d6354

    .line 164
    .line 165
    .line 166
    invoke-static {p0, p1, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    const v11, 0x36c00

    .line 171
    .line 172
    .line 173
    const/4 v4, 0x0

    .line 174
    const/4 v7, 0x0

    .line 175
    invoke-static/range {v4 .. v11}, La/m8x;->n(La/mm40;La/j43;Ljava/lang/String;La/xdr;La/ugd;La/ugd;La/fet;I)V

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_5
    invoke-virtual {v10}, La/fet;->X()V

    .line 180
    .line 181
    .line 182
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
