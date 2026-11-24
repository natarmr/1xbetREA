.class public final synthetic La/cq6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ny6;


# direct methods
.method public synthetic constructor <init>(La/ny6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cq6;->a:B

    iput-object p1, p0, La/cq6;->b:La/ny6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/cq6;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/cq6;->b:La/ny6;

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
    iget-object p0, p0, La/ny6;->a:La/uf40;

    .line 54
    .line 55
    iget-object p0, p0, La/uf40;->b:La/d480;

    .line 56
    .line 57
    check-cast p0, La/b480;

    .line 58
    .line 59
    invoke-static {p1, p0, p2, v2}, La/idx;->h(La/mm40;La/b480;La/fet;I)V

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
    move v2, v3

    .line 85
    :cond_2
    and-int/lit8 p1, p3, 0x1

    .line 86
    .line 87
    invoke-virtual {p2, p1, v2}, La/fet;->U(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    sget-object p1, La/jm40;->b:La/jm40;

    .line 94
    .line 95
    const/high16 p3, 0x3f800000    # 1.0f

    .line 96
    .line 97
    invoke-static {p1, p3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget-object p0, p0, La/ny6;->a:La/uf40;

    .line 102
    .line 103
    iget-object p0, p0, La/uf40;->a:La/ogs;

    .line 104
    .line 105
    check-cast p0, La/kgs;

    .line 106
    .line 107
    iget-object p0, p0, La/kgs;->a:Ljava/lang/String;

    .line 108
    .line 109
    const/4 p3, 0x6

    .line 110
    invoke-static {p3, p2, p1, p0}, La/r7x;->c(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 115
    .line 116
    .line 117
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_1
    move-object v10, p2

    .line 121
    check-cast v10, La/fet;

    .line 122
    .line 123
    check-cast p3, Ljava/lang/Integer;

    .line 124
    .line 125
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    and-int/lit8 p1, p2, 0x11

    .line 133
    .line 134
    if-eq p1, v1, :cond_4

    .line 135
    .line 136
    move v2, v3

    .line 137
    :cond_4
    and-int/lit8 p1, p2, 0x1

    .line 138
    .line 139
    invoke-virtual {v10, p1, v2}, La/fet;->U(IZ)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_5

    .line 144
    .line 145
    iget-object p1, p0, La/ny6;->a:La/uf40;

    .line 146
    .line 147
    iget-object v5, p1, La/uf40;->c:La/j43;

    .line 148
    .line 149
    iget-object v6, p1, La/uf40;->d:Ljava/lang/String;

    .line 150
    .line 151
    new-instance p1, La/cq6;

    .line 152
    .line 153
    invoke-direct {p1, p0, v3}, La/cq6;-><init>(La/ny6;B)V

    .line 154
    .line 155
    .line 156
    const p2, -0x775c7a0

    .line 157
    .line 158
    .line 159
    invoke-static {p2, p1, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    new-instance p1, La/cq6;

    .line 164
    .line 165
    const/4 p2, 0x2

    .line 166
    invoke-direct {p1, p0, p2}, La/cq6;-><init>(La/ny6;B)V

    .line 167
    .line 168
    .line 169
    const p0, -0x7ecea041

    .line 170
    .line 171
    .line 172
    invoke-static {p0, p1, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    const v11, 0x36c00

    .line 177
    .line 178
    .line 179
    const/4 v4, 0x0

    .line 180
    const/4 v7, 0x0

    .line 181
    invoke-static/range {v4 .. v11}, La/m8x;->n(La/mm40;La/j43;Ljava/lang/String;La/xdr;La/ugd;La/ugd;La/fet;I)V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_5
    invoke-virtual {v10}, La/fet;->X()V

    .line 186
    .line 187
    .line 188
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
