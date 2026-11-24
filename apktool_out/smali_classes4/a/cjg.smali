.class public final synthetic La/cjg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/djg;


# direct methods
.method public synthetic constructor <init>(La/djg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cjg;->a:B

    iput-object p1, p0, La/cjg;->b:La/djg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/cjg;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    check-cast p1, La/y5d;

    .line 8
    .line 9
    check-cast p2, La/fet;

    .line 10
    .line 11
    check-cast p3, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    sget-object v0, La/djg;->n2:La/kwd;

    .line 21
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
    move p1, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p1, v3

    .line 32
    :goto_0
    and-int/2addr p3, v2

    .line 33
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_5

    .line 38
    .line 39
    iget-object v6, p0, La/cjg;->b:La/djg;

    .line 40
    .line 41
    iget-object p0, v6, La/djg;->k2:La/zz2;

    .line 42
    .line 43
    sget-object p1, La/djg;->o2:[La/iiy;

    .line 44
    .line 45
    aget-object p1, p1, v3

    .line 46
    .line 47
    invoke-virtual {p0, v6, p1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    const p1, 0x68c1bc95

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, p1}, La/fet;->e0(I)V

    .line 59
    .line 60
    .line 61
    sget-object p1, La/ygq0;->b:La/j6m0;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {}, La/j6m0;->d()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance p3, Ljava/util/ArrayList;

    .line 71
    .line 72
    const/16 v0, 0xa

    .line 73
    .line 74
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, La/ygq0;

    .line 96
    .line 97
    new-instance v1, La/ejg;

    .line 98
    .line 99
    invoke-static {v0}, La/ipm0;->i(La/ygq0;)I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    invoke-static {v4, v3, p2}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    sget-object v5, La/ygq0;->b:La/j6m0;

    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {p0}, La/j6m0;->a(I)La/ygq0;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    if-ne v0, v5, :cond_1

    .line 117
    .line 118
    move v5, v2

    .line 119
    goto :goto_2

    .line 120
    :cond_1
    move v5, v3

    .line 121
    :goto_2
    invoke-direct {v1, v0, v4, v5}, La/ejg;-><init>(La/ygq0;Ljava/lang/String;Z)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    invoke-virtual {p2, v3}, La/fet;->r(Z)V

    .line 129
    .line 130
    .line 131
    invoke-static {p3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p2, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    if-nez p1, :cond_3

    .line 144
    .line 145
    sget-object p1, La/ukd;->a:La/cl5;

    .line 146
    .line 147
    if-ne p3, p1, :cond_4

    .line 148
    .line 149
    :cond_3
    new-instance v4, La/x6f;

    .line 150
    .line 151
    const/4 v10, 0x0

    .line 152
    const/16 v11, 0x10

    .line 153
    .line 154
    const/4 v5, 0x1

    .line 155
    const-class v7, La/djg;

    .line 156
    .line 157
    const-string v8, "onFilterSelected"

    .line 158
    .line 159
    const-string v9, "onFilterSelected(Lorg/xplatform/feed/domain/models/TimeFilter;)V"

    .line 160
    .line 161
    invoke-direct/range {v4 .. v11}, La/x6f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    move-object p3, v4

    .line 168
    :cond_4
    check-cast p3, La/jhy;

    .line 169
    .line 170
    check-cast p3, Lkotlin/jvm/functions/Function1;

    .line 171
    .line 172
    sget-object p1, La/iw5;->j2:[La/iiy;

    .line 173
    .line 174
    const/16 p1, 0x200

    .line 175
    .line 176
    invoke-virtual {v6, p0, p3, p2, p1}, La/djg;->Q0(La/a4x;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_5
    invoke-virtual {p2}, La/fet;->X()V

    .line 181
    .line 182
    .line 183
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_0
    sget-object v0, La/djg;->n2:La/kwd;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    and-int/lit8 p1, p3, 0x11

    .line 192
    .line 193
    if-eq p1, v1, :cond_6

    .line 194
    .line 195
    move v3, v2

    .line 196
    :cond_6
    and-int/lit8 p1, p3, 0x1

    .line 197
    .line 198
    invoke-virtual {p2, p1, v3}, La/fet;->U(IZ)Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    if-eqz p1, :cond_7

    .line 203
    .line 204
    sget-object p1, La/iw5;->j2:[La/iiy;

    .line 205
    .line 206
    const/16 p1, 0x8

    .line 207
    .line 208
    iget-object p0, p0, La/cjg;->b:La/djg;

    .line 209
    .line 210
    invoke-virtual {p0, p1, p2}, La/djg;->R0(ILa/fet;)V

    .line 211
    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 215
    .line 216
    .line 217
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    return-object p0

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
