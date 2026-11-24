.class public final La/rax;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/tax;


# direct methods
.method public synthetic constructor <init>(La/tax;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rax;->i:B

    iput-object p1, p0, La/rax;->k:La/tax;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/rax;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/rax;->k:La/tax;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/rax;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/rax;-><init>(La/tax;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/rax;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/rax;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/rax;-><init>(La/tax;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/rax;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rax;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/rax;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rax;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rax;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/sw00;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/rax;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/rax;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/rax;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/rax;->i:B

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/rax;->k:La/tax;

    .line 7
    .line 8
    iget-object p0, p0, La/rax;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Ljava/lang/Throwable;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-object p1, v3, La/tax;->e:La/mne;

    .line 25
    .line 26
    iget-object v7, p1, La/mne;->a:La/rwj;

    .line 27
    .line 28
    sget-object v5, La/qax;->a:La/qax;

    .line 29
    .line 30
    new-instance v8, La/ys8;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    invoke-direct {v8, v3, p1, v2, v1}, La/ys8;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 34
    .line 35
    .line 36
    const/16 v9, 0xa

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, v3, La/tax;->A:La/bby;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_0
    check-cast p0, La/sw00;

    .line 52
    .line 53
    sget-object v0, La/wne;->a:La/wne;

    .line 54
    .line 55
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-boolean p0, p0, La/sw00;->a:Z

    .line 59
    .line 60
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    iget-object p1, v3, La/tax;->e:La/mne;

    .line 65
    .line 66
    iget-object v7, p1, La/mne;->a:La/rwj;

    .line 67
    .line 68
    sget-object v5, La/qax;->a:La/qax;

    .line 69
    .line 70
    new-instance v8, La/ys8;

    .line 71
    .line 72
    invoke-direct {v8, v3, p0, v2, v1}, La/ys8;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 73
    .line 74
    .line 75
    const/16 v9, 0xa

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iput-object p0, v3, La/tax;->A:La/bby;

    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
