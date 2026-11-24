.class public final La/xcg0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:I

.field public final synthetic l:La/xcz;

.field public final synthetic m:F

.field public final synthetic n:F

.field public final synthetic o:F


# direct methods
.method public synthetic constructor <init>(La/xcz;FFFLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/xcg0;->i:B

    iput-object p1, p0, La/xcg0;->l:La/xcz;

    iput p2, p0, La/xcg0;->m:F

    iput p3, p0, La/xcg0;->n:F

    iput p4, p0, La/xcg0;->o:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/xcg0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/xcg0;

    .line 7
    .line 8
    iget v5, p0, La/xcg0;->o:F

    .line 9
    .line 10
    const/4 v7, 0x1

    .line 11
    iget-object v2, p0, La/xcg0;->l:La/xcz;

    .line 12
    .line 13
    iget v3, p0, La/xcg0;->m:F

    .line 14
    .line 15
    iget v4, p0, La/xcg0;->n:F

    .line 16
    .line 17
    move-object v6, p2

    .line 18
    invoke-direct/range {v1 .. v7}, La/xcg0;-><init>(La/xcz;FFFLa/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput p0, v1, La/xcg0;->k:I

    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    move-object v6, p2

    .line 31
    new-instance v2, La/xcg0;

    .line 32
    .line 33
    move-object v7, v6

    .line 34
    iget v6, p0, La/xcg0;->o:F

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    iget-object v3, p0, La/xcg0;->l:La/xcz;

    .line 38
    .line 39
    iget v4, p0, La/xcg0;->m:F

    .line 40
    .line 41
    iget v5, p0, La/xcg0;->n:F

    .line 42
    .line 43
    invoke-direct/range {v2 .. v8}, La/xcg0;-><init>(La/xcz;FFFLa/yje;B)V

    .line 44
    .line 45
    .line 46
    check-cast p1, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    iput p0, v2, La/xcg0;->k:I

    .line 53
    .line 54
    return-object v2

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/xcg0;->i:B

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    check-cast p2, La/yje;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1, p2}, La/xcg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/xcg0;

    .line 23
    .line 24
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/xcg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1, p2}, La/xcg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/xcg0;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/xcg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/xcg0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget v5, p0, La/xcg0;->k:I

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v4, p0, La/xcg0;->j:Z

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    if-ne v4, v2, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput v5, p0, La/xcg0;->k:I

    .line 32
    .line 33
    iput-boolean v2, p0, La/xcg0;->j:Z

    .line 34
    .line 35
    iget-object v4, p0, La/xcg0;->l:La/xcz;

    .line 36
    .line 37
    iget v6, p0, La/xcg0;->m:F

    .line 38
    .line 39
    iget v7, p0, La/xcg0;->n:F

    .line 40
    .line 41
    iget v8, p0, La/xcg0;->o:F

    .line 42
    .line 43
    const/16 v9, 0x258

    .line 44
    .line 45
    move-object v10, p0

    .line 46
    invoke-static/range {v4 .. v10}, La/idm0;->w(La/xcz;IFFFILa/zje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-ne p0, v0, :cond_2

    .line 51
    .line 52
    move-object v3, v0

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    :goto_1
    return-object v3

    .line 57
    :pswitch_0
    move-object v10, p0

    .line 58
    iget p0, v10, La/xcg0;->k:I

    .line 59
    .line 60
    sget-object v0, La/wne;->a:La/wne;

    .line 61
    .line 62
    iget-boolean v4, v10, La/xcg0;->j:Z

    .line 63
    .line 64
    if-eqz v4, :cond_4

    .line 65
    .line 66
    if-ne v4, v2, :cond_3

    .line 67
    .line 68
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iput p0, v10, La/xcg0;->k:I

    .line 80
    .line 81
    iput-boolean v2, v10, La/xcg0;->j:Z

    .line 82
    .line 83
    const/4 p1, -0x1

    .line 84
    if-eq p0, p1, :cond_8

    .line 85
    .line 86
    iget-object p1, v10, La/xcg0;->l:La/xcz;

    .line 87
    .line 88
    invoke-virtual {p1}, La/xcz;->j()La/mcz;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget v1, v1, La/mcz;->o:I

    .line 93
    .line 94
    if-nez v1, :cond_5

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    invoke-virtual {p1}, La/xcz;->j()La/mcz;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v1}, La/mcz;->h()J

    .line 102
    .line 103
    .line 104
    move-result-wide v1

    .line 105
    const/16 v4, 0x20

    .line 106
    .line 107
    shr-long/2addr v1, v4

    .line 108
    long-to-int v1, v1

    .line 109
    int-to-float v1, v1

    .line 110
    const/4 v2, 0x0

    .line 111
    cmpg-float v2, v1, v2

    .line 112
    .line 113
    if-nez v2, :cond_6

    .line 114
    .line 115
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    const/high16 v2, 0x40000000    # 2.0f

    .line 119
    .line 120
    div-float/2addr v1, v2

    .line 121
    invoke-virtual {p1}, La/xcz;->h()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    invoke-virtual {p1}, La/xcz;->i()I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    int-to-float v5, v5

    .line 130
    iget v6, v10, La/xcg0;->m:F

    .line 131
    .line 132
    iget v7, v10, La/xcg0;->n:F

    .line 133
    .line 134
    add-float/2addr v7, v6

    .line 135
    sub-int/2addr p0, v4

    .line 136
    int-to-float p0, p0

    .line 137
    mul-float/2addr p0, v7

    .line 138
    div-float/2addr v6, v2

    .line 139
    add-float/2addr v6, p0

    .line 140
    sub-float/2addr v6, v5

    .line 141
    sub-float/2addr v6, v1

    .line 142
    iget p0, v10, La/xcg0;->o:F

    .line 143
    .line 144
    add-float/2addr v6, p0

    .line 145
    new-instance p0, La/ycz;

    .line 146
    .line 147
    invoke-direct {p0, v6, v3}, La/ycz;-><init>(FLa/yje;)V

    .line 148
    .line 149
    .line 150
    sget-object v1, La/c050;->a:La/c050;

    .line 151
    .line 152
    invoke-virtual {p1, v1, p0, v10}, La/xcz;->b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    if-ne p0, v0, :cond_7

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_8
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    :goto_3
    if-ne p0, v0, :cond_9

    .line 165
    .line 166
    move-object v3, v0

    .line 167
    goto :goto_5

    .line 168
    :cond_9
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    :goto_5
    return-object v3

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
