.class public final La/z43;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a53;


# direct methods
.method public synthetic constructor <init>(La/a53;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/z43;->a:B

    iput-object p1, p0, La/z43;->b:La/a53;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/z43;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/z43;->b:La/a53;

    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/ou90;

    .line 16
    .line 17
    iget-object v6, v0, La/a53;->b:[La/pu90;

    .line 18
    .line 19
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget v7, v0, La/a53;->d:I

    .line 23
    .line 24
    iget v8, v0, La/a53;->f:I

    .line 25
    .line 26
    array-length v9, v6

    .line 27
    :goto_0
    if-ge v2, v9, :cond_1

    .line 28
    .line 29
    aget-object v10, v6, v2

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    iget-object v11, v0, La/a53;->a:La/i53;

    .line 34
    .line 35
    iget-object v12, v11, La/i53;->b:La/u12;

    .line 36
    .line 37
    iget v11, v10, La/pu90;->a:I

    .line 38
    .line 39
    iget v13, v10, La/pu90;->b:I

    .line 40
    .line 41
    int-to-long v14, v11

    .line 42
    shl-long/2addr v14, v3

    .line 43
    move/from16 p0, v3

    .line 44
    .line 45
    const-wide v18, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    int-to-long v3, v13

    .line 51
    and-long v3, v3, v18

    .line 52
    .line 53
    or-long v13, v14, v3

    .line 54
    .line 55
    int-to-long v3, v7

    .line 56
    shl-long v3, v3, p0

    .line 57
    .line 58
    move v5, v2

    .line 59
    move-wide v15, v3

    .line 60
    int-to-long v2, v8

    .line 61
    and-long v2, v2, v18

    .line 62
    .line 63
    or-long/2addr v15, v2

    .line 64
    sget-object v17, La/k6z;->a:La/k6z;

    .line 65
    .line 66
    invoke-interface/range {v12 .. v17}, La/u12;->a(JJLa/k6z;)J

    .line 67
    .line 68
    .line 69
    move-result-wide v2

    .line 70
    shr-long v11, v2, p0

    .line 71
    .line 72
    long-to-int v4, v11

    .line 73
    and-long v2, v2, v18

    .line 74
    .line 75
    long-to-int v2, v2

    .line 76
    invoke-static {v1, v10, v4, v2}, La/ou90;->h(La/ou90;La/pu90;II)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_0
    move v5, v2

    .line 81
    move/from16 p0, v3

    .line 82
    .line 83
    const-wide v18, 0xffffffffL

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    :goto_1
    add-int/lit8 v2, v5, 0x1

    .line 89
    .line 90
    move/from16 v3, p0

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_0
    move/from16 p0, v3

    .line 97
    .line 98
    const-wide v18, 0xffffffffL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    move-object/from16 v1, p1

    .line 104
    .line 105
    check-cast v1, La/ou90;

    .line 106
    .line 107
    iget-object v3, v0, La/a53;->c:[La/pu90;

    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget v4, v0, La/a53;->e:I

    .line 113
    .line 114
    iget v5, v0, La/a53;->g:I

    .line 115
    .line 116
    array-length v6, v3

    .line 117
    :goto_2
    if-ge v2, v6, :cond_3

    .line 118
    .line 119
    aget-object v7, v3, v2

    .line 120
    .line 121
    if-eqz v7, :cond_2

    .line 122
    .line 123
    iget-object v8, v0, La/a53;->a:La/i53;

    .line 124
    .line 125
    iget-object v9, v8, La/i53;->b:La/u12;

    .line 126
    .line 127
    iget v8, v7, La/pu90;->a:I

    .line 128
    .line 129
    iget v10, v7, La/pu90;->b:I

    .line 130
    .line 131
    int-to-long v11, v8

    .line 132
    shl-long v11, v11, p0

    .line 133
    .line 134
    int-to-long v13, v10

    .line 135
    and-long v13, v13, v18

    .line 136
    .line 137
    or-long v10, v11, v13

    .line 138
    .line 139
    int-to-long v12, v4

    .line 140
    shl-long v12, v12, p0

    .line 141
    .line 142
    int-to-long v14, v5

    .line 143
    and-long v14, v14, v18

    .line 144
    .line 145
    or-long/2addr v12, v14

    .line 146
    sget-object v14, La/k6z;->a:La/k6z;

    .line 147
    .line 148
    invoke-interface/range {v9 .. v14}, La/u12;->a(JJLa/k6z;)J

    .line 149
    .line 150
    .line 151
    move-result-wide v8

    .line 152
    shr-long v10, v8, p0

    .line 153
    .line 154
    long-to-int v10, v10

    .line 155
    and-long v8, v8, v18

    .line 156
    .line 157
    long-to-int v8, v8

    .line 158
    invoke-static {v1, v7, v10, v8}, La/ou90;->h(La/ou90;La/pu90;II)V

    .line 159
    .line 160
    .line 161
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
