.class public final La/vpu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/o470;


# direct methods
.method public synthetic constructor <init>(La/o470;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/vpu;->a:La/o470;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La/fnq;
    .locals 4

    .line 1
    iget-object p0, p0, La/vpu;->a:La/o470;

    .line 2
    .line 3
    iget-object p0, p0, La/o470;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/fnd0;

    .line 6
    .line 7
    iget-object v0, p0, La/fnd0;->b:La/qoj0;

    .line 8
    .line 9
    new-instance v1, La/k6d0;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, p0, v2, v3}, La/k6d0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 14
    .line 15
    .line 16
    new-instance p0, La/fnq;

    .line 17
    .line 18
    invoke-direct {p0, v0, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public b(ZLa/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/vpu;->a:La/o470;

    .line 2
    .line 3
    iget-object p0, p0, La/o470;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/fnd0;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, La/fnd0;->b(ZLa/yje;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, La/wne;->a:La/wne;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    :goto_0
    if-ne p0, p1, :cond_1

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0
.end method
