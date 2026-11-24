.class public final La/ru2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public synthetic i:La/vne;

.field public synthetic j:F

.field public final synthetic k:La/qv2;


# direct methods
.method public constructor <init>(La/qv2;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ru2;->k:La/qv2;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, La/yje;

    .line 10
    .line 11
    new-instance v0, La/ru2;

    .line 12
    .line 13
    iget-object p0, p0, La/ru2;->k:La/qv2;

    .line 14
    .line 15
    invoke-direct {v0, p0, p3}, La/ru2;-><init>(La/qv2;La/yje;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, La/ru2;->i:La/vne;

    .line 19
    .line 20
    iput p2, v0, La/ru2;->j:F

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, La/ru2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La/ru2;->i:La/vne;

    .line 7
    .line 8
    iget v0, p0, La/ru2;->j:F

    .line 9
    .line 10
    new-instance v1, La/qu2;

    .line 11
    .line 12
    iget-object p0, p0, La/ru2;->k:La/qv2;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p0, v0, v3, v2}, La/qu2;-><init>(Ljava/lang/Object;FLa/yje;B)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x3

    .line 20
    invoke-static {p1, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0
.end method
