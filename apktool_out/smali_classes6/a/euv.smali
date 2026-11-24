.class public final synthetic La/euv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vne;

.field public final synthetic c:La/xk80;


# direct methods
.method public synthetic constructor <init>(BLa/vne;La/xk80;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/euv;->a:B

    iput-object p2, p0, La/euv;->b:La/vne;

    iput-object p3, p0, La/euv;->c:La/xk80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/euv;->a:B

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, La/u48;

    .line 13
    .line 14
    const/16 v1, 0xa

    .line 15
    .line 16
    iget-object v2, p0, La/euv;->c:La/xk80;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v0, v2, p1, v3, v1}, La/u48;-><init>(La/xk80;ILa/yje;B)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x3

    .line 23
    iget-object p0, p0, La/euv;->b:La/vne;

    .line 24
    .line 25
    invoke-static {p0, v3, v3, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    new-instance v0, La/u48;

    .line 32
    .line 33
    const/16 v1, 0x9

    .line 34
    .line 35
    iget-object v2, p0, La/euv;->c:La/xk80;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-direct {v0, v2, p1, v3, v1}, La/u48;-><init>(La/xk80;ILa/yje;B)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x3

    .line 42
    iget-object p0, p0, La/euv;->b:La/vne;

    .line 43
    .line 44
    invoke-static {p0, v3, v3, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    new-instance v0, La/u48;

    .line 51
    .line 52
    const/16 v1, 0x8

    .line 53
    .line 54
    iget-object v2, p0, La/euv;->c:La/xk80;

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {v0, v2, p1, v3, v1}, La/u48;-><init>(La/xk80;ILa/yje;B)V

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x3

    .line 61
    iget-object p0, p0, La/euv;->b:La/vne;

    .line 62
    .line 63
    invoke-static {p0, v3, v3, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_2
    new-instance v0, La/u48;

    .line 70
    .line 71
    const/4 v1, 0x4

    .line 72
    iget-object v2, p0, La/euv;->c:La/xk80;

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    invoke-direct {v0, v2, p1, v3, v1}, La/u48;-><init>(La/xk80;ILa/yje;B)V

    .line 76
    .line 77
    .line 78
    const/4 p1, 0x3

    .line 79
    iget-object p0, p0, La/euv;->b:La/vne;

    .line 80
    .line 81
    invoke-static {p0, v3, v3, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 82
    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
