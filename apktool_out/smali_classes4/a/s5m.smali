.class public final synthetic La/s5m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vne;

.field public final synthetic c:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/vne;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/s5m;->a:B

    iput-object p1, p0, La/s5m;->b:La/vne;

    iput-object p2, p0, La/s5m;->c:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/s5m;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/s5m;->c:La/pz40;

    .line 5
    .line 6
    iget-object p0, p0, La/s5m;->b:La/vne;

    .line 7
    .line 8
    const/4 v3, 0x3

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, La/u6h;

    .line 13
    .line 14
    const/4 v4, 0x6

    .line 15
    invoke-direct {v0, v2, v1, v4}, La/u6h;-><init>(La/pz40;La/yje;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v1, v1, v0, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    new-instance v0, La/u6h;

    .line 25
    .line 26
    const/4 v4, 0x4

    .line 27
    invoke-direct {v0, v2, v1, v4}, La/u6h;-><init>(La/pz40;La/yje;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0, v1, v1, v0, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    new-instance v0, La/u6h;

    .line 37
    .line 38
    invoke-direct {v0, v2, v1, v3}, La/u6h;-><init>(La/pz40;La/yje;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v1, v1, v0, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
