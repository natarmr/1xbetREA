.class public final synthetic La/txf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/txf;->a:B

    iput-object p1, p0, La/txf;->b:Ljava/lang/String;

    iput-object p2, p0, La/txf;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/txf;->a:B

    iput-object p1, p0, La/txf;->b:Ljava/lang/String;

    iput-object p2, p0, La/txf;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/txf;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/high16 v3, 0x3f800000    # 1.0f

    .line 6
    .line 7
    iget-object v4, p0, La/txf;->c:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, p0, La/txf;->b:Ljava/lang/String;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object p0, p1

    .line 16
    check-cast p0, La/fet;

    .line 17
    .line 18
    move-object/from16 v0, p2

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    and-int/lit8 v7, v0, 0x3

    .line 27
    .line 28
    if-eq v7, v2, :cond_0

    .line 29
    .line 30
    move v1, v5

    .line 31
    :cond_0
    and-int/2addr v0, v5

    .line 32
    invoke-virtual {p0, v0, v1}, La/fet;->U(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    sget-object v0, La/jm40;->b:La/jm40;

    .line 39
    .line 40
    invoke-static {v0, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0, v3}, La/o7k0;->c(La/mm40;F)La/mm40;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v1, 0x6

    .line 49
    invoke-static {v0, v6, v4, p0, v1}, La/xia0;->z(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {p0}, La/fet;->X()V

    .line 54
    .line 55
    .line 56
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_0
    move-object v0, p1

    .line 60
    check-cast v0, La/fet;

    .line 61
    .line 62
    move-object/from16 v4, p2

    .line 63
    .line 64
    check-cast v4, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    and-int/lit8 v7, v4, 0x3

    .line 71
    .line 72
    if-eq v7, v2, :cond_2

    .line 73
    .line 74
    move v1, v5

    .line 75
    :cond_2
    and-int/lit8 v2, v4, 0x1

    .line 76
    .line 77
    invoke-virtual {v0, v2, v1}, La/fet;->U(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    sget-object v1, La/qmk;->a:La/zcl;

    .line 84
    .line 85
    const/high16 v11, 0x41000000    # 8.0f

    .line 86
    .line 87
    const/4 v12, 0x7

    .line 88
    sget-object v7, La/jm40;->b:La/jm40;

    .line 89
    .line 90
    const/4 v8, 0x0

    .line 91
    const/4 v9, 0x0

    .line 92
    const/4 v10, 0x0

    .line 93
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v1, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    new-instance v7, La/wul;

    .line 102
    .line 103
    sget-object v8, La/lul;->e:La/lul;

    .line 104
    .line 105
    sget-object v9, La/oe9;->c:La/oe9;

    .line 106
    .line 107
    new-instance v10, La/ue9;

    .line 108
    .line 109
    invoke-direct {v10, v6}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/4 v12, 0x0

    .line 113
    const/4 v13, 0x0

    .line 114
    const/4 v11, 0x1

    .line 115
    invoke-direct/range {v7 .. v13}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 116
    .line 117
    .line 118
    const/4 v4, 0x0

    .line 119
    const/4 v5, 0x0

    .line 120
    iget-object v2, p0, La/txf;->c:Lkotlin/jvm/functions/Function0;

    .line 121
    .line 122
    move-object v3, v0

    .line 123
    move-object v0, v1

    .line 124
    move-object v1, v7

    .line 125
    invoke-static/range {v0 .. v5}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    move-object v3, v0

    .line 130
    invoke-virtual {v3}, La/fet;->X()V

    .line 131
    .line 132
    .line 133
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_1
    move-object p0, p1

    .line 137
    check-cast p0, La/fet;

    .line 138
    .line 139
    move-object/from16 v0, p2

    .line 140
    .line 141
    check-cast v0, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-static {v5}, La/x8x;->L(I)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-static {v6, v4, p0, v0}, La/jeb;->i(Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 151
    .line 152
    .line 153
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_2
    move-object p0, p1

    .line 157
    check-cast p0, La/fet;

    .line 158
    .line 159
    move-object/from16 v0, p2

    .line 160
    .line 161
    check-cast v0, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-static {v5}, La/x8x;->L(I)I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-static {v6, v4, p0, v0}, La/j2e;->p(Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 171
    .line 172
    .line 173
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object p0

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
