.class public final La/abo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vne;

.field public final synthetic c:La/i3t0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/vne;La/i3t0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/abo0;->a:B

    iput-object p1, p0, La/abo0;->b:La/vne;

    iput-object p2, p0, La/abo0;->c:La/i3t0;

    iput-object p3, p0, La/abo0;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/abo0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object v2, p0, La/abo0;->d:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iget-object v3, p0, La/abo0;->c:La/i3t0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, La/abo0;->b:La/vne;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, La/lwk;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p1, La/zao0;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-direct {p1, v3, v2, v4, v0}, La/zao0;-><init>(La/i3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v4, v4, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p1, La/fgc0;

    .line 30
    .line 31
    const/16 v0, 0x12

    .line 32
    .line 33
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_0
    check-cast p1, La/lwk;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance p1, La/zao0;

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    invoke-direct {p1, v3, v2, v4, v0}, La/zao0;-><init>(La/i3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0, v4, v4, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance p1, La/fgc0;

    .line 53
    .line 54
    const/16 v0, 0xc

    .line 55
    .line 56
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
