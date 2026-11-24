.class public final synthetic La/i650;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/x650;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/x650;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/i650;->a:B

    iput-object p1, p0, La/i650;->b:La/x650;

    iput-object p2, p0, La/i650;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/i650;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, v0, La/i650;->c:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iget-object v0, v0, La/i650;->b:La/x650;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, La/fet;

    .line 18
    .line 19
    move-object/from16 v6, p2

    .line 20
    .line 21
    check-cast v6, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    and-int/lit8 v7, v6, 0x3

    .line 28
    .line 29
    if-eq v7, v3, :cond_0

    .line 30
    .line 31
    move v2, v4

    .line 32
    :cond_0
    and-int/lit8 v3, v6, 0x1

    .line 33
    .line 34
    invoke-virtual {v1, v3, v2}, La/fet;->U(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    sget-object v2, La/jm40;->b:La/jm40;

    .line 41
    .line 42
    const-string v3, "TOP_CONTENT"

    .line 43
    .line 44
    invoke-static {v2, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-object v0, v0, La/x650;->b:La/z250;

    .line 49
    .line 50
    const/4 v3, 0x6

    .line 51
    invoke-static {v2, v0, v5, v1, v3}, La/bdx;->m(La/mm40;La/z250;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v1}, La/fet;->X()V

    .line 56
    .line 57
    .line 58
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_0
    move-object/from16 v13, p1

    .line 62
    .line 63
    check-cast v13, La/fet;

    .line 64
    .line 65
    move-object/from16 v1, p2

    .line 66
    .line 67
    check-cast v1, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    and-int/lit8 v6, v1, 0x3

    .line 74
    .line 75
    if-eq v6, v3, :cond_2

    .line 76
    .line 77
    move v2, v4

    .line 78
    :cond_2
    and-int/2addr v1, v4

    .line 79
    invoke-virtual {v13, v1, v2}, La/fet;->U(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_7

    .line 84
    .line 85
    iget-object v2, v0, La/x650;->a:La/imm;

    .line 86
    .line 87
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    sget-object v3, La/ukd;->a:La/cl5;

    .line 96
    .line 97
    if-nez v0, :cond_3

    .line 98
    .line 99
    if-ne v1, v3, :cond_4

    .line 100
    .line 101
    :cond_3
    new-instance v1, La/w250;

    .line 102
    .line 103
    const/16 v0, 0x9

    .line 104
    .line 105
    invoke-direct {v1, v5, v0}, La/w250;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    move-object v4, v1

    .line 112
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 113
    .line 114
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-nez v0, :cond_5

    .line 123
    .line 124
    if-ne v1, v3, :cond_6

    .line 125
    .line 126
    :cond_5
    new-instance v1, La/rp30;

    .line 127
    .line 128
    const/16 v0, 0x12

    .line 129
    .line 130
    invoke-direct {v1, v5, v0}, La/rp30;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_6
    move-object v6, v1

    .line 137
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 138
    .line 139
    const/4 v15, 0x0

    .line 140
    const/16 v16, 0xfd5

    .line 141
    .line 142
    const/4 v1, 0x0

    .line 143
    const/4 v3, 0x0

    .line 144
    const/4 v5, 0x0

    .line 145
    const/4 v7, 0x0

    .line 146
    const/4 v8, 0x0

    .line 147
    const/4 v9, 0x0

    .line 148
    const/4 v10, 0x0

    .line 149
    const/4 v11, 0x0

    .line 150
    const/4 v12, 0x0

    .line 151
    const/4 v14, 0x0

    .line 152
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_7
    invoke-virtual {v13}, La/fet;->X()V

    .line 157
    .line 158
    .line 159
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object v0

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
