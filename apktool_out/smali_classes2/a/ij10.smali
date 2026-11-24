.class public final synthetic La/ij10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lj10;


# direct methods
.method public synthetic constructor <init>(La/lj10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ij10;->a:B

    iput-object p1, p0, La/ij10;->b:La/lj10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ij10;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/ij10;->b:La/lj10;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/lj10;->O1:[La/iiy;

    .line 10
    .line 11
    iget-object p0, p0, La/lj10;->M1:La/kiu0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    move-object v4, p0

    .line 18
    check-cast v4, La/uj10;

    .line 19
    .line 20
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object v0, v4, La/uj10;->c:La/mne;

    .line 25
    .line 26
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 27
    .line 28
    new-instance v2, La/pf10;

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x4

    .line 32
    const/4 v3, 0x1

    .line 33
    const-class v5, La/uj10;

    .line 34
    .line 35
    const-string v6, "handleGameError"

    .line 36
    .line 37
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 38
    .line 39
    invoke-direct/range {v2 .. v9}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 40
    .line 41
    .line 42
    new-instance v9, La/juy;

    .line 43
    .line 44
    const/16 v3, 0x16

    .line 45
    .line 46
    invoke-direct {v9, v4, v1, v3}, La/juy;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 47
    .line 48
    .line 49
    const/16 v10, 0xa

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    move-object v5, p0

    .line 53
    move-object v8, v0

    .line 54
    move-object v6, v2

    .line 55
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_0
    sget-object v0, La/lj10;->O1:[La/iiy;

    .line 62
    .line 63
    iget-object p0, p0, La/lj10;->L1:La/fiu0;

    .line 64
    .line 65
    if-eqz p0, :cond_0

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_0
    const-string p0, "luckyCardViewModelFactory"

    .line 69
    .line 70
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
