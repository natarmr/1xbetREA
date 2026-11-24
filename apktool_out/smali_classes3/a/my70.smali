.class public final La/my70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Z

.field public final synthetic l:La/gz70;


# direct methods
.method public synthetic constructor <init>(BLa/yje;La/gz70;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/my70;->i:B

    iput-object p3, p0, La/my70;->l:La/gz70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/my70;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/my70;

    .line 7
    .line 8
    iget-object p0, p0, La/my70;->l:La/gz70;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1, p2, p0}, La/my70;-><init>(BLa/yje;La/gz70;)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/my70;->k:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, La/my70;

    .line 24
    .line 25
    iget-object p0, p0, La/my70;->l:La/gz70;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1, p2, p0}, La/my70;-><init>(BLa/yje;La/gz70;)V

    .line 29
    .line 30
    .line 31
    check-cast p1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    iput-boolean p0, v0, La/my70;->k:Z

    .line 38
    .line 39
    return-object v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/my70;->i:B

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/my70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/my70;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/my70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/my70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, La/my70;

    .line 31
    .line 32
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, La/my70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/my70;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/my70;->l:La/gz70;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-boolean v0, p0, La/my70;->k:Z

    .line 13
    .line 14
    sget-object v5, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/my70;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v4, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

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
    if-nez v0, :cond_2

    .line 34
    .line 35
    sget-object p1, La/oom0;->b:La/oom0;

    .line 36
    .line 37
    sget-object v1, La/gz70;->D:La/c4m0;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, La/gz70;->d(La/qom0;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, v2, La/gz70;->C:La/mne;

    .line 46
    .line 47
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 48
    .line 49
    new-instance v1, La/ny70;

    .line 50
    .line 51
    invoke-direct {v1, v4, v3, v2}, La/ny70;-><init>(BLa/yje;La/gz70;)V

    .line 52
    .line 53
    .line 54
    iput-boolean v0, p0, La/my70;->k:Z

    .line 55
    .line 56
    iput-boolean v4, p0, La/my70;->j:Z

    .line 57
    .line 58
    invoke-static {p1, v1, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-ne p0, v5, :cond_2

    .line 63
    .line 64
    move-object v3, v5

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    :goto_1
    return-object v3

    .line 69
    :pswitch_0
    iget-boolean v0, p0, La/my70;->k:Z

    .line 70
    .line 71
    sget-object v5, La/wne;->a:La/wne;

    .line 72
    .line 73
    iget-boolean v6, p0, La/my70;->j:Z

    .line 74
    .line 75
    if-eqz v6, :cond_4

    .line 76
    .line 77
    if-ne v6, v4, :cond_3

    .line 78
    .line 79
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    iput-boolean v0, p0, La/my70;->k:Z

    .line 93
    .line 94
    iput-boolean v4, p0, La/my70;->j:Z

    .line 95
    .line 96
    sget-object p1, La/gz70;->D:La/c4m0;

    .line 97
    .line 98
    invoke-virtual {v2, p0}, La/gz70;->c(La/zje;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-ne p0, v5, :cond_5

    .line 103
    .line 104
    move-object v3, v5

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_2
    sget-object p0, La/oom0;->a:La/oom0;

    .line 107
    .line 108
    sget-object p1, La/gz70;->D:La/c4m0;

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {p0}, La/gz70;->d(La/qom0;)V

    .line 114
    .line 115
    .line 116
    :cond_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    :goto_3
    return-object v3

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
