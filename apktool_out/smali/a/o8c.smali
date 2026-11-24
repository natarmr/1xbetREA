.class public final La/o8c;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ywq0;


# direct methods
.method public synthetic constructor <init>(BLa/yje;La/ywq0;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/o8c;->i:B

    iput-object p3, p0, La/o8c;->k:La/ywq0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/o8c;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/o8c;

    .line 7
    .line 8
    iget-object p0, p0, La/o8c;->k:La/ywq0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1, p2, p0}, La/o8c;-><init>(BLa/yje;La/ywq0;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/o8c;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/o8c;

    .line 18
    .line 19
    iget-object p0, p0, La/o8c;->k:La/ywq0;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1, p2, p0}, La/o8c;-><init>(BLa/yje;La/ywq0;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/o8c;->j:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

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
    iget-byte v0, p0, La/o8c;->i:B

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
    invoke-virtual {p0, p1, p2}, La/o8c;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/o8c;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/o8c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/o8c;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/o8c;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/o8c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/o8c;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-class v3, La/oqt0;

    .line 7
    .line 8
    iget-object v4, v0, La/o8c;->k:La/ywq0;

    .line 9
    .line 10
    iget-object v0, v0, La/o8c;->j:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v5, v0

    .line 13
    check-cast v5, La/vne;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v0, La/wne;->a:La/wne;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v4, La/ywq0;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, La/mne;

    .line 26
    .line 27
    iget-object v11, v0, La/mne;->b:La/dvj;

    .line 28
    .line 29
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v14

    .line 33
    new-instance v15, La/e6c;

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    invoke-direct {v15, v0}, La/e6c;-><init>(B)V

    .line 37
    .line 38
    .line 39
    new-instance v0, La/ya;

    .line 40
    .line 41
    const/16 v1, 0xf

    .line 42
    .line 43
    invoke-direct {v0, v4, v2, v1}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 44
    .line 45
    .line 46
    const/16 v17, 0x14

    .line 47
    .line 48
    const-string v6, "CheckTimeLimitFinSecurityV2ScenarioImpl_sendPing"

    .line 49
    .line 50
    const-wide/16 v7, 0x1e

    .line 51
    .line 52
    const-wide/16 v9, 0x0

    .line 53
    .line 54
    const-wide/16 v12, 0x1e

    .line 55
    .line 56
    move-object/from16 v16, v0

    .line 57
    .line 58
    invoke-static/range {v5 .. v17}, La/sac;->d0(La/vne;Ljava/lang/String;JJLkotlin/coroutines/CoroutineContext;JLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0

    .line 63
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 64
    .line 65
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v4, La/ywq0;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, La/mne;

    .line 71
    .line 72
    iget-object v11, v0, La/mne;->b:La/dvj;

    .line 73
    .line 74
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v14

    .line 78
    new-instance v15, La/e6c;

    .line 79
    .line 80
    const/4 v0, 0x2

    .line 81
    invoke-direct {v15, v0}, La/e6c;-><init>(B)V

    .line 82
    .line 83
    .line 84
    new-instance v0, La/igb;

    .line 85
    .line 86
    const/4 v1, 0x5

    .line 87
    invoke-direct {v0, v4, v2, v1}, La/igb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 88
    .line 89
    .line 90
    const/16 v17, 0x14

    .line 91
    .line 92
    const-string v6, "CheckTimeLimitsScenarioNeImpl_getLimits"

    .line 93
    .line 94
    const-wide/16 v7, 0x12c

    .line 95
    .line 96
    const-wide/16 v9, 0x0

    .line 97
    .line 98
    const-wide/16 v12, 0x12c

    .line 99
    .line 100
    move-object/from16 v16, v0

    .line 101
    .line 102
    invoke-static/range {v5 .. v17}, La/sac;->d0(La/vne;Ljava/lang/String;JJLkotlin/coroutines/CoroutineContext;JLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
