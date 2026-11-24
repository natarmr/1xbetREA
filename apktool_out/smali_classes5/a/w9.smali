.class public final synthetic La/w9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ab;


# direct methods
.method public synthetic constructor <init>(La/ab;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/w9;->a:B

    iput-object p1, p0, La/w9;->b:La/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/w9;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/w9;->b:La/ab;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, v1, La/ab;->y:La/i1w0;

    .line 9
    .line 10
    new-instance v0, La/u9;

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-direct {v0, v1, v2}, La/u9;-><init>(La/ab;B)V

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
    iget-object p0, v1, La/ab;->w0:La/ol60;

    .line 23
    .line 24
    sget-object v0, La/z9;->a:La/z9;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    iget-object v2, p0, La/w9;->b:La/ab;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v0, La/t0;

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v7, 0x7

    .line 45
    const/4 v1, 0x1

    .line 46
    const-class v3, La/ab;

    .line 47
    .line 48
    const-string v4, "handleError"

    .line 49
    .line 50
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 51
    .line 52
    invoke-direct/range {v0 .. v7}, La/t0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 53
    .line 54
    .line 55
    iget-object v1, v2, La/ab;->x:La/mne;

    .line 56
    .line 57
    iget-object v6, v1, La/mne;->a:La/rwj;

    .line 58
    .line 59
    new-instance v7, La/pa;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-direct {v7, v2, v1, v3}, La/pa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 64
    .line 65
    .line 66
    const/16 v8, 0xa

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    move-object v3, p0

    .line 70
    move-object v4, v0

    .line 71
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
