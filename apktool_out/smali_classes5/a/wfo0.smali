.class public final synthetic La/wfo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fho0;


# direct methods
.method public synthetic constructor <init>(La/fho0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wfo0;->a:B

    iput-object p1, p0, La/wfo0;->b:La/fho0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/wfo0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/wfo0;->b:La/fho0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, v1, La/fho0;->y:La/i1w0;

    .line 9
    .line 10
    new-instance v0, La/vfo0;

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, La/vfo0;-><init>(La/fho0;B)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    iget-object p0, v1, La/fho0;->D0:La/ol60;

    .line 24
    .line 25
    sget-object v0, La/zfo0;->a:La/zfo0;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_1
    iget-object v2, p0, La/wfo0;->b:La/fho0;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v0, La/tfo0;

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, 0x3

    .line 46
    const/4 v1, 0x1

    .line 47
    const-class v3, La/fho0;

    .line 48
    .line 49
    const-string v4, "handleError"

    .line 50
    .line 51
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 52
    .line 53
    invoke-direct/range {v0 .. v7}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v2, La/fho0;->x:La/mne;

    .line 57
    .line 58
    iget-object v6, v1, La/mne;->b:La/dvj;

    .line 59
    .line 60
    new-instance v7, La/z2n0;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    const/4 v3, 0x4

    .line 64
    invoke-direct {v7, v2, v1, v3}, La/z2n0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 65
    .line 66
    .line 67
    const/16 v8, 0xa

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    move-object v3, p0

    .line 71
    move-object v4, v0

    .line 72
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

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
