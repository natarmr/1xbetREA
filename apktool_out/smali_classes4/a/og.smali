.class public final La/og;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:Z

.field public final synthetic l:La/t33;

.field public final synthetic m:F


# direct methods
.method public constructor <init>(La/t33;FLa/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/og;->i:B

    .line 15
    iput-object p1, p0, La/og;->l:La/t33;

    iput p2, p0, La/og;->m:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(ZLa/t33;FLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/og;->i:B

    .line 3
    .line 4
    iput-boolean p1, p0, La/og;->k:Z

    .line 5
    .line 6
    iput-object p2, p0, La/og;->l:La/t33;

    .line 7
    .line 8
    iput p3, p0, La/og;->m:F

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/og;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/og;

    .line 7
    .line 8
    iget-object v1, p0, La/og;->l:La/t33;

    .line 9
    .line 10
    iget p0, p0, La/og;->m:F

    .line 11
    .line 12
    invoke-direct {v0, v1, p0, p2}, La/og;-><init>(La/t33;FLa/yje;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    iput-boolean p0, v0, La/og;->k:Z

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    new-instance p1, La/og;

    .line 25
    .line 26
    iget-boolean v0, p0, La/og;->k:Z

    .line 27
    .line 28
    iget-object v1, p0, La/og;->l:La/t33;

    .line 29
    .line 30
    iget p0, p0, La/og;->m:F

    .line 31
    .line 32
    invoke-direct {p1, v0, v1, p0, p2}, La/og;-><init>(ZLa/t33;FLa/yje;)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/og;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/og;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/og;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/og;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/og;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/og;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/og;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/og;->i:B

    .line 2
    .line 3
    iget v1, p0, La/og;->m:F

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v8, 0x2

    .line 11
    iget-object v9, p0, La/og;->l:La/t33;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, La/og;->k:Z

    .line 17
    .line 18
    sget-object v6, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-byte v10, p0, La/og;->j:B

    .line 21
    .line 22
    if-eqz v10, :cond_2

    .line 23
    .line 24
    if-eq v10, v4, :cond_1

    .line 25
    .line 26
    if-ne v10, v8, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Ljava/lang/Float;

    .line 44
    .line 45
    invoke-direct {v2, v7}, Ljava/lang/Float;-><init>(F)V

    .line 46
    .line 47
    .line 48
    iput-boolean v0, p0, La/og;->k:Z

    .line 49
    .line 50
    iput-byte v4, p0, La/og;->j:B

    .line 51
    .line 52
    invoke-virtual {v9, p0, v2}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-ne v2, v6, :cond_3

    .line 57
    .line 58
    :goto_0
    move-object v2, v6

    .line 59
    goto :goto_3

    .line 60
    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    .line 61
    .line 62
    iput-boolean v0, p0, La/og;->k:Z

    .line 63
    .line 64
    iput-byte v8, p0, La/og;->j:B

    .line 65
    .line 66
    invoke-static {v9, v1, p0}, La/w3m;->d(La/t33;FLa/zje;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    :goto_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    :goto_3
    return-object v2

    .line 73
    :pswitch_0
    sget-object v10, La/wne;->a:La/wne;

    .line 74
    .line 75
    iget-byte v0, p0, La/og;->j:B

    .line 76
    .line 77
    if-eqz v0, :cond_7

    .line 78
    .line 79
    if-eq v0, v4, :cond_6

    .line 80
    .line 81
    if-ne v0, v8, :cond_5

    .line 82
    .line 83
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_6

    .line 87
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_7

    .line 91
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-boolean v0, p0, La/og;->k:Z

    .line 99
    .line 100
    if-eqz v0, :cond_9

    .line 101
    .line 102
    new-instance v0, Ljava/lang/Float;

    .line 103
    .line 104
    invoke-direct {v0, v1}, Ljava/lang/Float;-><init>(F)V

    .line 105
    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    sget-object v2, La/ihn;->d:La/z73;

    .line 109
    .line 110
    const/16 v3, 0x3e8

    .line 111
    .line 112
    invoke-static {v3, v1, v2, v8}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    iput-byte v4, p0, La/og;->j:B

    .line 117
    .line 118
    move-object v1, v0

    .line 119
    iget-object v0, p0, La/og;->l:La/t33;

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    const/4 v4, 0x0

    .line 123
    const/16 v6, 0xc

    .line 124
    .line 125
    move-object v5, p0

    .line 126
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-ne v0, v10, :cond_8

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_8
    :goto_4
    new-instance v0, Ljava/lang/Float;

    .line 134
    .line 135
    invoke-direct {v0, v7}, Ljava/lang/Float;-><init>(F)V

    .line 136
    .line 137
    .line 138
    iput-byte v8, p0, La/og;->j:B

    .line 139
    .line 140
    invoke-virtual {v9, p0, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-ne v0, v10, :cond_9

    .line 145
    .line 146
    :goto_5
    move-object v2, v10

    .line 147
    goto :goto_7

    .line 148
    :cond_9
    :goto_6
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    :goto_7
    return-object v2

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
