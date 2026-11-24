.class public final synthetic La/nho0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rio0;


# direct methods
.method public synthetic constructor <init>(La/rio0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nho0;->a:B

    iput-object p1, p0, La/nho0;->b:La/rio0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/nho0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/nho0;->b:La/rio0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, v1, La/rio0;->z:La/i1w0;

    .line 9
    .line 10
    new-instance v0, La/lho0;

    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    invoke-direct {v0, v1, v2}, La/lho0;-><init>(La/rio0;B)V

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
    iget-object v2, p0, La/nho0;->b:La/rio0;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance v0, La/tfo0;

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    const/16 v7, 0x9

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    const-class v3, La/rio0;

    .line 38
    .line 39
    const-string v4, "handleError"

    .line 40
    .line 41
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 42
    .line 43
    invoke-direct/range {v0 .. v7}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v2, La/rio0;->y:La/mne;

    .line 47
    .line 48
    iget-object v6, v1, La/mne;->a:La/rwj;

    .line 49
    .line 50
    new-instance v7, La/kio0;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-direct {v7, v2, v1, v3}, La/kio0;-><init>(La/rio0;La/yje;B)V

    .line 55
    .line 56
    .line 57
    const/16 v8, 0xa

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    move-object v3, p0

    .line 61
    move-object v4, v0

    .line 62
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_1
    iget-object p0, v1, La/rio0;->M0:La/ol60;

    .line 69
    .line 70
    sget-object v0, La/rho0;->a:La/rho0;

    .line 71
    .line 72
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
