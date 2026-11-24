.class public final synthetic La/bq10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vq10;


# direct methods
.method public synthetic constructor <init>(La/vq10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bq10;->a:B

    iput-object p1, p0, La/bq10;->b:La/vq10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/bq10;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/bq10;->b:La/vq10;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/vq10;->w:La/qoj0;

    .line 9
    .line 10
    sget-object v0, La/cq10;->a:La/cq10;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    iget-object v0, p0, La/vq10;->y:La/bby;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v0, p0, La/vq10;->m:La/mne;

    .line 33
    .line 34
    iget-object v4, v0, La/mne;->b:La/dvj;

    .line 35
    .line 36
    sget-object v2, La/uq10;->a:La/uq10;

    .line 37
    .line 38
    new-instance v5, La/qq10;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    const/4 v3, 0x2

    .line 42
    invoke-direct {v5, p0, v0, v3}, La/qq10;-><init>(La/vq10;La/yje;B)V

    .line 43
    .line 44
    .line 45
    const/16 v6, 0xa

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, La/vq10;->y:La/bby;

    .line 53
    .line 54
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
