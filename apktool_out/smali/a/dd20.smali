.class public final synthetic La/dd20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qg20;


# direct methods
.method public synthetic constructor <init>(La/qg20;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dd20;->a:B

    iput-object p1, p0, La/dd20;->b:La/qg20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/dd20;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/dd20;->b:La/qg20;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/qg20;->X0:La/p7m0;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v0, La/zq00;->a:La/zq00;

    .line 15
    .line 16
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    iget-object v0, p0, La/qg20;->M0:La/bby;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v0, p0, La/qg20;->d:La/mne;

    .line 34
    .line 35
    iget-object v6, v0, La/mne;->a:La/rwj;

    .line 36
    .line 37
    sget-object v7, La/qe20;->a:La/qe20;

    .line 38
    .line 39
    new-instance v8, La/re20;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {v8, p0, v1, v0}, La/re20;-><init>(La/qg20;La/yje;B)V

    .line 43
    .line 44
    .line 45
    const/16 v9, 0x20

    .line 46
    .line 47
    const-wide/16 v3, 0x1

    .line 48
    .line 49
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 50
    .line 51
    invoke-static/range {v2 .. v9}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La/qg20;->M0:La/bby;

    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    move-object v2, v1

    .line 65
    new-instance v1, La/r520;

    .line 66
    .line 67
    const/16 v3, 0x9

    .line 68
    .line 69
    invoke-direct {v1, v3}, La/r520;-><init>(B)V

    .line 70
    .line 71
    .line 72
    iget-object v3, p0, La/qg20;->d:La/mne;

    .line 73
    .line 74
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 75
    .line 76
    new-instance v4, La/kf20;

    .line 77
    .line 78
    const/4 v5, 0x1

    .line 79
    invoke-direct {v4, p0, v2, v5}, La/kf20;-><init>(La/qg20;La/yje;B)V

    .line 80
    .line 81
    .line 82
    const/16 v5, 0xa

    .line 83
    .line 84
    const/4 v2, 0x0

    .line 85
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 86
    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
