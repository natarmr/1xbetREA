.class public final La/gin;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/kin;


# direct methods
.method public synthetic constructor <init>(La/kin;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gin;->i:B

    iput-object p1, p0, La/gin;->k:La/kin;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/gin;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/gin;->k:La/kin;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/gin;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/gin;-><init>(La/kin;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/gin;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/gin;-><init>(La/kin;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/gin;->i:B

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
    invoke-virtual {p0, p1, p2}, La/gin;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/gin;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/gin;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/gin;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/gin;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/gin;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/gin;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/gin;->k:La/kin;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v6, p0, La/gin;->j:B

    .line 16
    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    if-eq v6, v3, :cond_1

    .line 20
    .line 21
    if-ne v6, v4, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v2, La/kin;->w:La/p7m0;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget-object v1, La/zin;->a:La/zin;

    .line 44
    .line 45
    invoke-virtual {p1, v5, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    iget-object p1, v2, La/kin;->p:La/rpt;

    .line 49
    .line 50
    invoke-virtual {p1}, La/rpt;->c()La/cjn;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object v1, v2, La/kin;->o:La/fhj;

    .line 55
    .line 56
    iget p1, p1, La/cjn;->b:I

    .line 57
    .line 58
    iput-byte v3, p0, La/gin;->j:B

    .line 59
    .line 60
    iget-object v3, v1, La/fhj;->a:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, La/f4u;

    .line 63
    .line 64
    iget-object v1, v1, La/fhj;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, La/gmt;

    .line 67
    .line 68
    invoke-virtual {v1}, La/gmt;->a()La/ql5;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_5

    .line 73
    .line 74
    iget-wide v5, v1, La/ql5;->a:J

    .line 75
    .line 76
    iget-object v1, v3, La/f4u;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, La/ali;

    .line 79
    .line 80
    invoke-virtual {v1, p1, v5, v6, p0}, La/ali;->l(IJLa/zje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p1, v0, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    :goto_0
    check-cast p1, La/cjn;

    .line 88
    .line 89
    iput-byte v4, p0, La/gin;->j:B

    .line 90
    .line 91
    invoke-virtual {v2, p1, p0}, La/kin;->B(La/cjn;La/zje;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-ne p0, v0, :cond_4

    .line 96
    .line 97
    :goto_1
    move-object v5, v0

    .line 98
    goto :goto_3

    .line 99
    :cond_4
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    :goto_3
    return-object v5

    .line 102
    :cond_5
    new-instance p0, La/ss3;

    .line 103
    .line 104
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 105
    .line 106
    .line 107
    throw p0

    .line 108
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 109
    .line 110
    iget-byte v6, p0, La/gin;->j:B

    .line 111
    .line 112
    if-eqz v6, :cond_8

    .line 113
    .line 114
    if-eq v6, v3, :cond_7

    .line 115
    .line 116
    if-ne v6, v4, :cond_6

    .line 117
    .line 118
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_7

    .line 126
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    sget-object p1, La/ymx;->b:La/ymx;

    .line 134
    .line 135
    iput-byte v3, p0, La/gin;->j:B

    .line 136
    .line 137
    const-wide/16 v6, 0x1f4

    .line 138
    .line 139
    invoke-static {v6, v7, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-ne p1, v0, :cond_9

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_9
    :goto_4
    iget-object p1, v2, La/kin;->p:La/rpt;

    .line 147
    .line 148
    invoke-virtual {p1}, La/rpt;->c()La/cjn;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    iput-byte v4, p0, La/gin;->j:B

    .line 153
    .line 154
    invoke-virtual {v2, p1, p0}, La/kin;->B(La/cjn;La/zje;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    if-ne p0, v0, :cond_a

    .line 159
    .line 160
    :goto_5
    move-object v5, v0

    .line 161
    goto :goto_7

    .line 162
    :cond_a
    :goto_6
    iget-object p0, v2, La/kin;->y:La/p7m0;

    .line 163
    .line 164
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v5, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    :goto_7
    return-object v5

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
