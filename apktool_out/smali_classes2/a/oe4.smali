.class public final synthetic La/oe4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/if4;

.field public final synthetic c:La/wpq;

.field public final synthetic d:La/pkk0;

.field public final synthetic e:La/ze4;


# direct methods
.method public synthetic constructor <init>(La/if4;La/wpq;La/pkk0;La/ze4;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/oe4;->a:B

    iput-object p1, p0, La/oe4;->b:La/if4;

    iput-object p2, p0, La/oe4;->c:La/wpq;

    iput-object p3, p0, La/oe4;->d:La/pkk0;

    iput-object p4, p0, La/oe4;->e:La/ze4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/oe4;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x12

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v6, p1

    .line 13
    check-cast v6, La/mm40;

    .line 14
    .line 15
    move-object v9, p2

    .line 16
    check-cast v9, La/fet;

    .line 17
    .line 18
    check-cast p3, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    sget-object p2, La/ze4;->g2:La/qek0;

    .line 25
    .line 26
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    and-int/lit8 p2, p1, 0x6

    .line 30
    .line 31
    if-nez p2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v9, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    move v3, v4

    .line 40
    :cond_0
    or-int/2addr p1, v3

    .line 41
    :cond_1
    and-int/lit8 p2, p1, 0x13

    .line 42
    .line 43
    if-eq p2, v2, :cond_2

    .line 44
    .line 45
    move v1, v5

    .line 46
    :cond_2
    and-int/lit8 p2, p1, 0x1

    .line 47
    .line 48
    invoke-virtual {v9, p2, v1}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_5

    .line 53
    .line 54
    iget-object p2, p0, La/oe4;->b:La/if4;

    .line 55
    .line 56
    iget-object v7, p2, La/if4;->b:La/wul;

    .line 57
    .line 58
    iget-object p2, p0, La/oe4;->c:La/wpq;

    .line 59
    .line 60
    invoke-virtual {v9, p2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    iget-object v0, p0, La/oe4;->d:La/pkk0;

    .line 65
    .line 66
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    or-int/2addr p3, v1

    .line 71
    iget-object p0, p0, La/oe4;->e:La/ze4;

    .line 72
    .line 73
    invoke-virtual {v9, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    or-int/2addr p3, v1

    .line 78
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-nez p3, :cond_3

    .line 83
    .line 84
    sget-object p3, La/ukd;->a:La/cl5;

    .line 85
    .line 86
    if-ne v1, p3, :cond_4

    .line 87
    .line 88
    :cond_3
    new-instance v1, La/ue4;

    .line 89
    .line 90
    invoke-direct {v1, p2, v0, p0, v5}, La/ue4;-><init>(La/wpq;La/pkk0;La/ze4;B)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    move-object v8, v1

    .line 97
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 98
    .line 99
    and-int/lit8 v10, p1, 0xe

    .line 100
    .line 101
    const/4 v11, 0x0

    .line 102
    invoke-static/range {v6 .. v11}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_5
    invoke-virtual {v9}, La/fet;->X()V

    .line 107
    .line 108
    .line 109
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_0
    check-cast p1, La/mm40;

    .line 113
    .line 114
    check-cast p2, La/fet;

    .line 115
    .line 116
    check-cast p3, Ljava/lang/Integer;

    .line 117
    .line 118
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result p3

    .line 122
    sget-object v0, La/ze4;->g2:La/qek0;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    and-int/lit8 v0, p3, 0x6

    .line 128
    .line 129
    if-nez v0, :cond_7

    .line 130
    .line 131
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_6

    .line 136
    .line 137
    move v3, v4

    .line 138
    :cond_6
    or-int/2addr p3, v3

    .line 139
    :cond_7
    and-int/lit8 v0, p3, 0x13

    .line 140
    .line 141
    if-eq v0, v2, :cond_8

    .line 142
    .line 143
    move v1, v5

    .line 144
    :cond_8
    and-int/lit8 v0, p3, 0x1

    .line 145
    .line 146
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_9

    .line 151
    .line 152
    new-instance v0, La/un6;

    .line 153
    .line 154
    const/16 v1, 0x16

    .line 155
    .line 156
    iget-object v3, p0, La/oe4;->b:La/if4;

    .line 157
    .line 158
    invoke-direct {v0, v3, v1}, La/un6;-><init>(Ljava/lang/Object;B)V

    .line 159
    .line 160
    .line 161
    const v1, 0x4c06f5de    # 3.5379064E7f

    .line 162
    .line 163
    .line 164
    invoke-static {v1, v0, p2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    new-instance v2, La/oe4;

    .line 169
    .line 170
    const/4 v7, 0x1

    .line 171
    iget-object v4, p0, La/oe4;->c:La/wpq;

    .line 172
    .line 173
    iget-object v5, p0, La/oe4;->d:La/pkk0;

    .line 174
    .line 175
    iget-object v6, p0, La/oe4;->e:La/ze4;

    .line 176
    .line 177
    invoke-direct/range {v2 .. v7}, La/oe4;-><init>(La/if4;La/wpq;La/pkk0;La/ze4;B)V

    .line 178
    .line 179
    .line 180
    const p0, 0x54f9ef7d

    .line 181
    .line 182
    .line 183
    invoke-static {p0, v2, p2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    and-int/lit8 p3, p3, 0xe

    .line 188
    .line 189
    or-int/lit16 p3, p3, 0x1b0

    .line 190
    .line 191
    invoke-static {p3, v0, p0, p2, p1}, La/j120;->f(ILa/ugd;La/ugd;La/fet;La/mm40;)V

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_9
    invoke-virtual {p2}, La/fet;->X()V

    .line 196
    .line 197
    .line 198
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
