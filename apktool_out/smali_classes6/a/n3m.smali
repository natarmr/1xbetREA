.class public final synthetic La/n3m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vne;

.field public final synthetic c:La/x3m;


# direct methods
.method public synthetic constructor <init>(La/vne;La/x3m;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/n3m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n3m;->b:La/vne;

    iput-object p2, p0, La/n3m;->c:La/x3m;

    return-void
.end method

.method public synthetic constructor <init>(La/x3m;La/vne;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/n3m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n3m;->c:La/x3m;

    iput-object p2, p0, La/n3m;->b:La/vne;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/n3m;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/n3m;->c:La/x3m;

    .line 4
    .line 5
    iget-object p0, p0, La/n3m;->b:La/vne;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/lo8;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, La/fr9;

    .line 16
    .line 17
    const/16 v2, 0x16

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v0, p1, v1, v3, v2}, La/fr9;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x3

    .line 24
    invoke-static {p0, v3, v3, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, La/abi0;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, La/x3m;->c()La/y3m;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v2, La/cbi0;->a:[La/iiy;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    sget-object v2, La/cbi0;->f:La/zai0;

    .line 45
    .line 46
    sget-object v3, La/cbi0;->a:[La/iiy;

    .line 47
    .line 48
    const/4 v4, 0x4

    .line 49
    aget-object v4, v3, v4

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-interface {p1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance v0, La/n3m;

    .line 58
    .line 59
    invoke-direct {v0, p0, v1}, La/n3m;-><init>(La/vne;La/x3m;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, La/cbi0;->r:La/zai0;

    .line 63
    .line 64
    const/16 v1, 0xf

    .line 65
    .line 66
    aget-object v1, v3, v1

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, p0, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

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
        :pswitch_0
    .end packed-switch
.end method
