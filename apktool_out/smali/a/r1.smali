.class public final La/r1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/s1;


# direct methods
.method public synthetic constructor <init>(La/s1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r1;->i:B

    iput-object p1, p0, La/r1;->j:La/s1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/r1;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/r1;->j:La/s1;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/r1;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/r1;-><init>(La/s1;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/r1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/r1;-><init>(La/s1;La/yje;B)V

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
    iget-byte v0, p0, La/r1;->i:B

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
    invoke-virtual {p0, p1, p2}, La/r1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/r1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/r1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/r1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/r1;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/r1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget-byte v0, p0, La/r1;->i:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/r1;->j:La/s1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, La/s1;->Z:La/rsw;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    new-instance v0, La/ssw;

    .line 20
    .line 21
    invoke-direct {v0, p1}, La/ssw;-><init>(La/rsw;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, La/s1;->q:La/gy40;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    new-instance v4, La/l1;

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    invoke-direct {v4, p1, v0, v2, v5}, La/l1;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v2, v2, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    :cond_0
    iput-object v2, p0, La/s1;->Z:La/rsw;

    .line 42
    .line 43
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 47
    .line 48
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, La/s1;->Z:La/rsw;

    .line 52
    .line 53
    if-nez p1, :cond_3

    .line 54
    .line 55
    new-instance p1, La/rsw;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, La/s1;->q:La/gy40;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    new-instance v4, La/l1;

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-direct {v4, v0, p1, v2, v5}, La/l1;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v2, v2, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 75
    .line 76
    .line 77
    :cond_2
    iput-object p1, p0, La/s1;->Z:La/rsw;

    .line 78
    .line 79
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
