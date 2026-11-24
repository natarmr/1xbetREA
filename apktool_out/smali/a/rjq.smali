.class public final La/rjq;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:S

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLkotlin/jvm/functions/Function0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/rjq;->i:B

    .line 3
    .line 4
    long-to-int p1, p1

    .line 5
    iput-short p1, p0, La/rjq;->k:S

    .line 6
    .line 7
    iput-object p3, p0, La/rjq;->l:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/ndd;JLa/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/rjq;->i:B

    .line 14
    iput-object p1, p0, La/rjq;->l:Ljava/lang/Object;

    long-to-int p1, p2

    iput-short p1, p0, La/rjq;->k:S

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte p1, p0, La/rjq;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/rjq;->l:Ljava/lang/Object;

    .line 4
    .line 5
    iget-short p0, p0, La/rjq;->k:S

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/rjq;

    .line 11
    .line 12
    int-to-long v1, p0

    .line 13
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 14
    .line 15
    invoke-direct {p1, v1, v2, v0, p2}, La/rjq;-><init>(JLkotlin/jvm/functions/Function0;La/yje;)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    new-instance p1, La/rjq;

    .line 20
    .line 21
    check-cast v0, La/ndd;

    .line 22
    .line 23
    int-to-long v1, p0

    .line 24
    invoke-direct {p1, v0, v1, v2, p2}, La/rjq;-><init>(La/ndd;JLa/yje;)V

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
    iget-byte v0, p0, La/rjq;->i:B

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
    invoke-virtual {p0, p1, p2}, La/rjq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rjq;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rjq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/rjq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/rjq;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/rjq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/rjq;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/rjq;->l:Ljava/lang/Object;

    .line 4
    .line 5
    iget-short v2, p0, La/rjq;->k:S

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/rjq;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v5, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    int-to-long v2, v2

    .line 34
    iput-boolean v5, p0, La/rjq;->j:Z

    .line 35
    .line 36
    invoke-static {v2, v3, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-ne p0, v0, :cond_2

    .line 41
    .line 42
    move-object v3, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    :goto_0
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 45
    .line 46
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    :goto_1
    return-object v3

    .line 52
    :pswitch_0
    int-to-long v6, v2

    .line 53
    sget-object v0, La/wne;->a:La/wne;

    .line 54
    .line 55
    iget-boolean v2, p0, La/rjq;->j:Z

    .line 56
    .line 57
    const-string v8, "CXCP"

    .line 58
    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    if-ne v2, v5, :cond_3

    .line 62
    .line 63
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v8}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    const-string p1, "applyScreenFlash: Waiting for ScreenFlashListener to be completed"

    .line 81
    .line 82
    invoke-static {v8, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    :cond_5
    check-cast v1, La/ndd;

    .line 86
    .line 87
    iput-boolean v5, p0, La/rjq;->j:Z

    .line 88
    .line 89
    invoke-static {v1, v6, v7, p0}, La/vzb;->y(La/jzj;JLa/zje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, v0, :cond_6

    .line 94
    .line 95
    move-object v3, v0

    .line 96
    goto :goto_4

    .line 97
    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_7

    .line 104
    .line 105
    invoke-static {v8}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eqz p0, :cond_8

    .line 110
    .line 111
    const-string p0, "applyScreenFlash: ScreenFlashListener completed"

    .line 112
    .line 113
    invoke-static {v8, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_7
    invoke-static {}, La/l8x;->j0()Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-eqz p0, :cond_8

    .line 122
    .line 123
    new-instance p0, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string p1, "applyScreenFlash: ScreenFlashListener completion timed out after "

    .line 126
    .line 127
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string p1, " ms"

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {v8, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    :cond_8
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    :goto_4
    return-object v3

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
