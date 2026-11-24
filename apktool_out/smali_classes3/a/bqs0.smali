.class public final La/bqs0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:I

.field public final synthetic l:La/diu0;


# direct methods
.method public synthetic constructor <init>(La/diu0;ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/bqs0;->i:B

    iput-object p1, p0, La/bqs0;->l:La/diu0;

    iput p2, p0, La/bqs0;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/bqs0;->i:B

    .line 2
    .line 3
    iget v0, p0, La/bqs0;->k:I

    .line 4
    .line 5
    iget-object p0, p0, La/bqs0;->l:La/diu0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/bqs0;

    .line 11
    .line 12
    check-cast p0, La/j9v0;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {p1, p0, v0, p2, v1}, La/bqs0;-><init>(La/diu0;ILa/yje;B)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    new-instance p1, La/bqs0;

    .line 20
    .line 21
    check-cast p0, La/cqs0;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, La/bqs0;-><init>(La/diu0;ILa/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/bqs0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/bqs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bqs0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/bqs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/bqs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/bqs0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/bqs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/bqs0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/bqs0;->l:La/diu0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, La/j9v0;

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v5, p0, La/bqs0;->j:Z

    .line 17
    .line 18
    iget v10, p0, La/bqs0;->k:I

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    if-ne v5, v2, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v3, La/j9v0;->r:La/gsb;

    .line 36
    .line 37
    iput-boolean v2, p0, La/bqs0;->j:Z

    .line 38
    .line 39
    iget-object p1, p1, La/gsb;->a:La/oue0;

    .line 40
    .line 41
    invoke-virtual {p1, v10, p0}, La/oue0;->a(ILa/zje;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-ne p0, v0, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    :goto_0
    if-ne p0, v0, :cond_3

    .line 51
    .line 52
    move-object v4, v0

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    :goto_1
    sget p0, La/j9v0;->v:I

    .line 55
    .line 56
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 57
    .line 58
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 59
    .line 60
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-object v6, p0

    .line 68
    check-cast v6, La/e9v0;

    .line 69
    .line 70
    const/4 v9, 0x0

    .line 71
    const/4 v11, 0x7

    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v8, 0x0

    .line 74
    invoke-static/range {v6 .. v11}, La/e9v0;->a(La/e9v0;ZZLjava/util/List;II)La/e9v0;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    :goto_2
    return-object v4

    .line 87
    :pswitch_0
    check-cast v3, La/cqs0;

    .line 88
    .line 89
    sget-object v0, La/wne;->a:La/wne;

    .line 90
    .line 91
    iget-boolean v5, p0, La/bqs0;->j:Z

    .line 92
    .line 93
    if-eqz v5, :cond_6

    .line 94
    .line 95
    if-ne v5, v2, :cond_5

    .line 96
    .line 97
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object p1, v3, La/cqs0;->g:La/kd30;

    .line 109
    .line 110
    iput-boolean v2, p0, La/bqs0;->j:Z

    .line 111
    .line 112
    iget-object v1, p1, La/kd30;->a:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, La/h0q0;

    .line 115
    .line 116
    iget-object p1, p1, La/kd30;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, La/s470;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    const/4 v2, 0x2

    .line 125
    if-eq p1, v2, :cond_8

    .line 126
    .line 127
    const/4 v2, 0x3

    .line 128
    if-ne p1, v2, :cond_7

    .line 129
    .line 130
    const-wide/16 v5, 0x29

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    const-string p0, "Illegal game type"

    .line 134
    .line 135
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_8
    const-wide/16 v5, 0x28

    .line 140
    .line 141
    :goto_3
    invoke-virtual {v1, v5, v6, p0}, La/h0q0;->z(JLa/zje;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-ne p1, v0, :cond_9

    .line 146
    .line 147
    move-object v4, v0

    .line 148
    goto :goto_5

    .line 149
    :cond_9
    :goto_4
    check-cast p1, La/qx90;

    .line 150
    .line 151
    iget p0, p0, La/bqs0;->k:I

    .line 152
    .line 153
    iput p0, v3, La/cqs0;->n:I

    .line 154
    .line 155
    iget-object v0, v3, La/cqs0;->l:La/p7m0;

    .line 156
    .line 157
    new-instance v1, La/xps0;

    .line 158
    .line 159
    iget p1, p1, La/qx90;->d:I

    .line 160
    .line 161
    invoke-direct {v1, p0, p1}, La/xps0;-><init>(II)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    :goto_5
    return-object v4

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
