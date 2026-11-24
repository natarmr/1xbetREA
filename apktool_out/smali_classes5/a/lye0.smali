.class public final La/lye0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:La/eze0;


# direct methods
.method public constructor <init>(La/eze0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/lye0;->i:La/eze0;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/lye0;

    .line 2
    .line 3
    iget-object p0, p0, La/lye0;->i:La/eze0;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/lye0;-><init>(La/eze0;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/lye0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/lye0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/lye0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget p1, La/eze0;->y0:I

    .line 7
    .line 8
    iget-object p0, p0, La/lye0;->i:La/eze0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/eze0;->m0()V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, La/eze0;->c0:La/i1w0;

    .line 14
    .line 15
    new-instance v0, La/eye0;

    .line 16
    .line 17
    const/4 v1, 0x5

    .line 18
    invoke-direct {v0, p0, v1}, La/eye0;-><init>(La/eze0;B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0
.end method
