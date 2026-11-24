.class public final synthetic La/ell;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vne;

.field public final synthetic c:La/xk80;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(La/vne;La/xk80;IB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ell;->a:B

    iput-object p1, p0, La/ell;->b:La/vne;

    iput-object p2, p0, La/ell;->c:La/xk80;

    iput p3, p0, La/ell;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/ell;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/u48;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iget-object v2, p0, La/ell;->c:La/xk80;

    .line 10
    .line 11
    iget v3, p0, La/ell;->d:I

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-direct {v0, v2, v3, v4, v1}, La/u48;-><init>(La/xk80;ILa/yje;B)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    iget-object p0, p0, La/ell;->b:La/vne;

    .line 19
    .line 20
    invoke-static {p0, v4, v4, v0, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    new-instance v0, La/u48;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    iget-object v2, p0, La/ell;->c:La/xk80;

    .line 30
    .line 31
    iget v3, p0, La/ell;->d:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v0, v2, v3, v4, v1}, La/u48;-><init>(La/xk80;ILa/yje;B)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    iget-object p0, p0, La/ell;->b:La/vne;

    .line 39
    .line 40
    invoke-static {p0, v4, v4, v0, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
