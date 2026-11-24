.class public final synthetic La/yka;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bla;


# direct methods
.method public synthetic constructor <init>(La/bla;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yka;->a:B

    iput-object p1, p0, La/yka;->b:La/bla;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/yka;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    iget-object p0, p0, La/yka;->b:La/bla;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    check-cast p1, La/y5d;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p2, La/mm40;

    .line 17
    .line 18
    move-object v0, p3

    .line 19
    check-cast v0, La/fet;

    .line 20
    .line 21
    move-object/from16 v5, p4

    .line 22
    .line 23
    check-cast v5, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-static {v5, p1, p2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    and-int/lit8 v5, p1, 0x30

    .line 30
    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    move v1, v2

    .line 40
    :cond_0
    or-int/2addr p1, v1

    .line 41
    :cond_1
    and-int/lit16 v1, p1, 0x91

    .line 42
    .line 43
    const/16 v2, 0x90

    .line 44
    .line 45
    if-eq v1, v2, :cond_2

    .line 46
    .line 47
    move v4, v3

    .line 48
    :cond_2
    and-int/2addr p1, v3

    .line 49
    invoke-virtual {v0, p1, v4}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    iget-object p0, p0, La/bla;->a:La/ao8;

    .line 56
    .line 57
    invoke-static {p2, p0, v0}, La/unh0;->i(La/mm40;La/ao8;La/fet;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-virtual {v0}, La/fet;->X()V

    .line 62
    .line 63
    .line 64
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_0
    move-object v5, p2

    .line 68
    check-cast v5, La/mm40;

    .line 69
    .line 70
    move-object p2, p3

    .line 71
    check-cast p2, La/fet;

    .line 72
    .line 73
    move-object/from16 v0, p4

    .line 74
    .line 75
    check-cast v0, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-static {v0, p1, v5}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    and-int/lit8 v6, v0, 0x6

    .line 82
    .line 83
    if-nez v6, :cond_5

    .line 84
    .line 85
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-eqz v6, :cond_4

    .line 90
    .line 91
    const/4 v6, 0x4

    .line 92
    goto :goto_1

    .line 93
    :cond_4
    const/4 v6, 0x2

    .line 94
    :goto_1
    or-int/2addr v6, v0

    .line 95
    goto :goto_2

    .line 96
    :cond_5
    move v6, v0

    .line 97
    :goto_2
    and-int/lit8 v0, v0, 0x30

    .line 98
    .line 99
    if-nez v0, :cond_7

    .line 100
    .line 101
    invoke-virtual {p2, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    move v1, v2

    .line 108
    :cond_6
    or-int/2addr v6, v1

    .line 109
    :cond_7
    and-int/lit16 v0, v6, 0x93

    .line 110
    .line 111
    const/16 v1, 0x92

    .line 112
    .line 113
    if-eq v0, v1, :cond_8

    .line 114
    .line 115
    move v0, v3

    .line 116
    goto :goto_3

    .line 117
    :cond_8
    move v0, v4

    .line 118
    :goto_3
    and-int/lit8 v1, v6, 0x1

    .line 119
    .line 120
    invoke-virtual {p2, v1, v0}, La/fet;->U(IZ)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_9

    .line 125
    .line 126
    sget-object v0, La/qmk;->a:La/zcl;

    .line 127
    .line 128
    const/4 v9, 0x0

    .line 129
    const/16 v10, 0xd

    .line 130
    .line 131
    const/4 v6, 0x0

    .line 132
    const/high16 v7, 0x41000000    # 8.0f

    .line 133
    .line 134
    const/4 v8, 0x0

    .line 135
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const/high16 v1, 0x3f800000    # 1.0f

    .line 140
    .line 141
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {p1, v0}, La/y5d;->c(La/y5d;La/mm40;)La/mm40;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    new-instance p1, La/zka;

    .line 150
    .line 151
    invoke-direct {p1, p0, v4}, La/zka;-><init>(La/bla;B)V

    .line 152
    .line 153
    .line 154
    const v0, 0x927b77f

    .line 155
    .line 156
    .line 157
    invoke-static {v0, p1, p2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    new-instance p1, La/zka;

    .line 162
    .line 163
    invoke-direct {p1, p0, v3}, La/zka;-><init>(La/bla;B)V

    .line 164
    .line 165
    .line 166
    const p0, 0x50bfadde

    .line 167
    .line 168
    .line 169
    invoke-static {p0, p1, p2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    const/16 v6, 0xd80

    .line 174
    .line 175
    const/4 v11, 0x0

    .line 176
    move-object v9, p2

    .line 177
    invoke-static/range {v6 .. v11}, La/cy2;->e(ILa/ugd;La/ugd;La/fet;La/mm40;Z)V

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_9
    move-object v9, p2

    .line 182
    invoke-virtual {v9}, La/fet;->X()V

    .line 183
    .line 184
    .line 185
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object p0

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
