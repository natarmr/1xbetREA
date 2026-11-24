.class public final synthetic La/nm40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vne;

.field public final synthetic c:La/d39;


# direct methods
.method public synthetic constructor <init>(La/vne;La/d39;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nm40;->a:B

    iput-object p1, p0, La/nm40;->b:La/vne;

    iput-object p2, p0, La/nm40;->c:La/d39;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/nm40;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object v2, p0, La/nm40;->c:La/d39;

    .line 5
    .line 6
    iget-object p0, p0, La/nm40;->b:La/vne;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    check-cast p1, La/iqq;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    new-instance p1, La/pm40;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, v2, v3, v0}, La/pm40;-><init>(La/d39;La/yje;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v3, v3, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 30
    .line 31
    .line 32
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    new-instance p1, La/pm40;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-direct {p1, v2, v3, v0}, La/pm40;-><init>(La/d39;La/yje;B)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, v3, v3, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 48
    .line 49
    .line 50
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_1
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    new-instance p1, La/pm40;

    .line 60
    .line 61
    const/4 v0, 0x2

    .line 62
    invoke-direct {p1, v2, v3, v0}, La/pm40;-><init>(La/d39;La/yje;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v3, v3, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 66
    .line 67
    .line 68
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
