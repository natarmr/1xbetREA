.class public final synthetic La/ge00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ef00;


# direct methods
.method public synthetic constructor <init>(La/ef00;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ge00;->a:B

    iput-object p1, p0, La/ge00;->b:La/ef00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ge00;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ge00;->b:La/ef00;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, v1, La/ef00;->Q:La/i1w0;

    .line 9
    .line 10
    new-instance v0, La/ee00;

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    invoke-direct {v0, v1, v2}, La/ee00;-><init>(La/ef00;B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    iget-object v2, p0, La/ge00;->b:La/ef00;

    .line 23
    .line 24
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v0, La/svz;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    const/16 v7, 0xd

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    const-class v3, La/ef00;

    .line 35
    .line 36
    const-string v4, "handleError"

    .line 37
    .line 38
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 39
    .line 40
    invoke-direct/range {v0 .. v7}, La/svz;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 41
    .line 42
    .line 43
    iget-object v1, v2, La/ef00;->N:La/mne;

    .line 44
    .line 45
    iget-object v6, v1, La/mne;->a:La/rwj;

    .line 46
    .line 47
    new-instance v7, La/slx;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    const/16 v3, 0x10

    .line 51
    .line 52
    invoke-direct {v7, v2, v1, v3}, La/slx;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 53
    .line 54
    .line 55
    const/16 v8, 0xa

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    move-object v3, p0

    .line 59
    move-object v4, v0

    .line 60
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_1
    iget-object p0, v1, La/ef00;->x0:La/ol60;

    .line 67
    .line 68
    sget-object v0, La/ie00;->a:La/ie00;

    .line 69
    .line 70
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
