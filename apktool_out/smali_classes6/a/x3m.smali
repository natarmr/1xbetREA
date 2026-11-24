.class public final La/x3m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pz40;

.field public final b:La/pz40;

.field public final c:La/agk0;

.field public final d:La/rv2;


# direct methods
.method public constructor <init>(La/y3m;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, La/x3m;->a:La/pz40;

    .line 14
    .line 15
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/x3m;->b:La/pz40;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {v0}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, p0, La/x3m;->c:La/agk0;

    .line 27
    .line 28
    new-instance v1, La/rv2;

    .line 29
    .line 30
    new-instance v2, La/pel;

    .line 31
    .line 32
    invoke-direct {v2}, La/pel;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, p1, v0}, La/pel;->a(Ljava/lang/Object;F)V

    .line 36
    .line 37
    .line 38
    new-instance v0, La/vtj;

    .line 39
    .line 40
    iget-object v3, v2, La/pel;->b:[F

    .line 41
    .line 42
    iget-object v2, v2, La/pel;->a:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    array-length v5, v3

    .line 49
    invoke-static {v4, v5}, La/nx3;->a(II)V

    .line 50
    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-static {v3, v5, v4}, Ljava/util/Arrays;->copyOfRange([FII)[F

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, v2, v3}, La/vtj;-><init>(Ljava/util/List;[F)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, v0, p1}, La/rv2;-><init>(La/vtj;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, La/x3m;->d:La/rv2;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, La/x3m;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object v0, La/y3m;->a:La/y3m;

    .line 8
    .line 9
    sget-object v1, La/nu2;->a:La/uts0;

    .line 10
    .line 11
    iget-object p0, p0, La/x3m;->d:La/rv2;

    .line 12
    .line 13
    invoke-static {p0, v0, v1, p1}, La/dv2;->c(La/rv2;Ljava/lang/Object;La/uts0;La/yje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/wne;->a:La/wne;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0
.end method

.method public final b(ZLa/zje;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, La/x3m;->b:La/pz40;

    .line 6
    .line 7
    check-cast v0, La/hgk0;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, La/y3m;->c:La/y3m;

    .line 13
    .line 14
    sget-object v0, La/nu2;->a:La/uts0;

    .line 15
    .line 16
    iget-object p0, p0, La/x3m;->d:La/rv2;

    .line 17
    .line 18
    invoke-static {p0, p1, v0, p2}, La/dv2;->c(La/rv2;Ljava/lang/Object;La/uts0;La/yje;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, La/wne;->a:La/wne;

    .line 23
    .line 24
    if-ne p0, p1, :cond_0

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0
.end method

.method public final c()La/y3m;
    .locals 0

    .line 1
    iget-object p0, p0, La/x3m;->d:La/rv2;

    .line 2
    .line 3
    iget-object p0, p0, La/rv2;->c:La/pz40;

    .line 4
    .line 5
    check-cast p0, La/hgk0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/y3m;

    .line 12
    .line 13
    return-object p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/x3m;->b:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final e(La/zje;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, La/x3m;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object v0, La/y3m;->b:La/y3m;

    .line 8
    .line 9
    sget-object v1, La/nu2;->a:La/uts0;

    .line 10
    .line 11
    iget-object p0, p0, La/x3m;->d:La/rv2;

    .line 12
    .line 13
    invoke-static {p0, v0, v1, p1}, La/dv2;->c(La/rv2;Ljava/lang/Object;La/uts0;La/yje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/wne;->a:La/wne;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0
.end method
