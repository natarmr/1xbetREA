.class public final synthetic La/p9m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tam0;


# direct methods
.method public synthetic constructor <init>(La/tam0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p9m0;->a:B

    iput-object p1, p0, La/p9m0;->b:La/tam0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/p9m0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/p9m0;->b:La/tam0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v0, p0, La/tam0;->d:La/mne;

    .line 14
    .line 15
    iget-object v5, v0, La/mne;->a:La/rwj;

    .line 16
    .line 17
    new-instance v3, La/q9m0;

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    invoke-direct {v3, p0, v0}, La/q9m0;-><init>(La/tam0;B)V

    .line 21
    .line 22
    .line 23
    new-instance v6, La/sam0;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {v6, p0, v1, v0}, La/sam0;-><init>(La/tam0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    const/16 v7, 0xa

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    invoke-virtual {p0}, La/tam0;->x()V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v2, p0, La/tam0;->d:La/mne;

    .line 49
    .line 50
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 51
    .line 52
    new-instance v3, La/sam0;

    .line 53
    .line 54
    const/4 v4, 0x2

    .line 55
    invoke-direct {v3, p0, v1, v4}, La/sam0;-><init>(La/tam0;La/yje;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v2, v1, v3, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
