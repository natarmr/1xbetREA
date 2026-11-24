.class public final synthetic La/bx1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yrl;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/yrl;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bx1;->a:B

    iput-object p1, p0, La/bx1;->b:La/yrl;

    iput-object p2, p0, La/bx1;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/bx1;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, La/bx1;->b:La/yrl;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v12, p1

    .line 12
    check-cast v12, La/fet;

    .line 13
    .line 14
    move-object/from16 v0, p2

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    and-int/lit8 v5, v0, 0x3

    .line 23
    .line 24
    if-eq v5, v2, :cond_0

    .line 25
    .line 26
    move v1, v3

    .line 27
    :cond_0
    and-int/2addr v0, v3

    .line 28
    invoke-virtual {v12, v0, v1}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v5, v4, La/yrl;->b:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v6, v4, La/yrl;->c:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v7, v4, La/yrl;->d:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v8, v4, La/yrl;->e:Ljava/lang/String;

    .line 41
    .line 42
    iget-wide v9, v4, La/yrl;->f:J

    .line 43
    .line 44
    const/4 v13, 0x0

    .line 45
    iget-object v11, p0, La/bx1;->c:Lkotlin/jvm/functions/Function0;

    .line 46
    .line 47
    invoke-static/range {v5 .. v13}, La/kx1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v12}, La/fet;->X()V

    .line 52
    .line 53
    .line 54
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_0
    move v0, v3

    .line 58
    move-object v3, p1

    .line 59
    check-cast v3, La/fet;

    .line 60
    .line 61
    move-object/from16 v5, p2

    .line 62
    .line 63
    check-cast v5, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    and-int/lit8 v6, v5, 0x3

    .line 70
    .line 71
    if-eq v6, v2, :cond_2

    .line 72
    .line 73
    move v1, v0

    .line 74
    :cond_2
    and-int/2addr v0, v5

    .line 75
    invoke-virtual {v3, v0, v1}, La/fet;->U(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    iget-object v0, v4, La/yrl;->b:Ljava/lang/String;

    .line 82
    .line 83
    iget-wide v1, v4, La/yrl;->f:J

    .line 84
    .line 85
    move-object v4, v0

    .line 86
    const/4 v0, 0x0

    .line 87
    iget-object v5, p0, La/bx1;->c:Lkotlin/jvm/functions/Function0;

    .line 88
    .line 89
    invoke-static/range {v0 .. v5}, La/ix1;->b(IJLa/fet;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    invoke-virtual {v3}, La/fet;->X()V

    .line 94
    .line 95
    .line 96
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_1
    move v0, v3

    .line 100
    move-object v3, p1

    .line 101
    check-cast v3, La/fet;

    .line 102
    .line 103
    move-object/from16 v5, p2

    .line 104
    .line 105
    check-cast v5, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    and-int/lit8 v6, v5, 0x3

    .line 112
    .line 113
    if-eq v6, v2, :cond_4

    .line 114
    .line 115
    move v1, v0

    .line 116
    :cond_4
    and-int/2addr v0, v5

    .line 117
    invoke-virtual {v3, v0, v1}, La/fet;->U(IZ)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_5

    .line 122
    .line 123
    iget-object v0, v4, La/yrl;->b:Ljava/lang/String;

    .line 124
    .line 125
    iget-wide v1, v4, La/yrl;->f:J

    .line 126
    .line 127
    move-object v4, v0

    .line 128
    const/4 v0, 0x0

    .line 129
    iget-object v5, p0, La/bx1;->c:Lkotlin/jvm/functions/Function0;

    .line 130
    .line 131
    invoke-static/range {v0 .. v5}, La/j120;->F(IJLa/fet;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    invoke-virtual {v3}, La/fet;->X()V

    .line 136
    .line 137
    .line 138
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_2
    move v0, v3

    .line 142
    move-object v3, p1

    .line 143
    check-cast v3, La/fet;

    .line 144
    .line 145
    move-object/from16 v5, p2

    .line 146
    .line 147
    check-cast v5, Ljava/lang/Integer;

    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    and-int/lit8 v6, v5, 0x3

    .line 154
    .line 155
    if-eq v6, v2, :cond_6

    .line 156
    .line 157
    move v1, v0

    .line 158
    :cond_6
    and-int/2addr v0, v5

    .line 159
    invoke-virtual {v3, v0, v1}, La/fet;->U(IZ)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    iget-object v0, v4, La/yrl;->b:Ljava/lang/String;

    .line 166
    .line 167
    iget-wide v1, v4, La/yrl;->f:J

    .line 168
    .line 169
    move-object v4, v0

    .line 170
    const/4 v0, 0x0

    .line 171
    iget-object v5, p0, La/bx1;->c:Lkotlin/jvm/functions/Function0;

    .line 172
    .line 173
    invoke-static/range {v0 .. v5}, La/fx1;->d(IJLa/fet;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_7
    invoke-virtual {v3}, La/fet;->X()V

    .line 178
    .line 179
    .line 180
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
