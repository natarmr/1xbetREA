.class public final synthetic La/qaa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/waa;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/waa;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qaa;->a:B

    iput-object p1, p0, La/qaa;->b:La/waa;

    iput-object p2, p0, La/qaa;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/qaa;->a:B

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x4

    .line 7
    iget-object v4, p0, La/qaa;->c:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    iget-object p0, p0, La/qaa;->b:La/waa;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v7, p1

    .line 17
    check-cast v7, La/mm40;

    .line 18
    .line 19
    move-object/from16 v11, p2

    .line 20
    .line 21
    check-cast v11, La/fet;

    .line 22
    .line 23
    move-object/from16 v0, p3

    .line 24
    .line 25
    check-cast v0, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    and-int/lit8 v8, v0, 0x6

    .line 35
    .line 36
    if-nez v8, :cond_1

    .line 37
    .line 38
    invoke-virtual {v11, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-eqz v8, :cond_0

    .line 43
    .line 44
    move v2, v3

    .line 45
    :cond_0
    or-int/2addr v0, v2

    .line 46
    :cond_1
    and-int/lit8 v2, v0, 0x13

    .line 47
    .line 48
    if-eq v2, v1, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move v6, v5

    .line 52
    :goto_0
    and-int/lit8 v1, v0, 0x1

    .line 53
    .line 54
    invoke-virtual {v11, v1, v6}, La/fet;->U(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    iget-object v8, p0, La/waa;->d:La/ddp0;

    .line 61
    .line 62
    new-instance p0, La/naa;

    .line 63
    .line 64
    invoke-direct {p0, v4, v5}, La/naa;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 65
    .line 66
    .line 67
    const v1, -0xbeb1dda

    .line 68
    .line 69
    .line 70
    invoke-static {v1, p0, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    and-int/lit8 p0, v0, 0xe

    .line 75
    .line 76
    or-int/lit16 v12, p0, 0x6000

    .line 77
    .line 78
    const/16 v13, 0xc

    .line 79
    .line 80
    const/4 v9, 0x0

    .line 81
    invoke-static/range {v7 .. v13}, La/xf0;->h(La/mm40;La/xdp0;La/pw3;La/ugd;La/fet;II)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-virtual {v11}, La/fet;->X()V

    .line 86
    .line 87
    .line 88
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_0
    move-object v0, p1

    .line 92
    check-cast v0, La/mm40;

    .line 93
    .line 94
    move-object/from16 v7, p2

    .line 95
    .line 96
    check-cast v7, La/fet;

    .line 97
    .line 98
    move-object/from16 v8, p3

    .line 99
    .line 100
    check-cast v8, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    and-int/lit8 v9, v8, 0x6

    .line 110
    .line 111
    if-nez v9, :cond_5

    .line 112
    .line 113
    invoke-virtual {v7, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    if-eqz v9, :cond_4

    .line 118
    .line 119
    move v2, v3

    .line 120
    :cond_4
    or-int/2addr v8, v2

    .line 121
    :cond_5
    and-int/lit8 v2, v8, 0x13

    .line 122
    .line 123
    if-eq v2, v1, :cond_6

    .line 124
    .line 125
    move v5, v6

    .line 126
    :cond_6
    and-int/lit8 v1, v8, 0x1

    .line 127
    .line 128
    invoke-virtual {v7, v1, v5}, La/fet;->U(IZ)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_7

    .line 133
    .line 134
    iget-object v1, p0, La/waa;->c:La/ddp0;

    .line 135
    .line 136
    new-instance p0, La/naa;

    .line 137
    .line 138
    invoke-direct {p0, v4, v6}, La/naa;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 139
    .line 140
    .line 141
    const v2, -0x47f1c818

    .line 142
    .line 143
    .line 144
    invoke-static {v2, p0, v7}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    and-int/lit8 p0, v8, 0xe

    .line 149
    .line 150
    or-int/lit16 v5, p0, 0x6000

    .line 151
    .line 152
    const/16 v6, 0xc

    .line 153
    .line 154
    const/4 v2, 0x0

    .line 155
    move-object v4, v7

    .line 156
    invoke-static/range {v0 .. v6}, La/xf0;->h(La/mm40;La/xdp0;La/pw3;La/ugd;La/fet;II)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_7
    move-object v4, v7

    .line 161
    invoke-virtual {v4}, La/fet;->X()V

    .line 162
    .line 163
    .line 164
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
