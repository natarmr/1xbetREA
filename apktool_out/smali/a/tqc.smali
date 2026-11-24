.class public final La/tqc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g45;


# direct methods
.method public synthetic constructor <init>(La/g45;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/tqc;->a:La/g45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)D
    .locals 3

    .line 1
    iget-object p0, p0, La/tqc;->a:La/g45;

    .line 2
    .line 3
    iget-object v0, p0, La/g45;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/ave;

    .line 6
    .line 7
    iget-object v0, v0, La/ave;->a:La/q4f;

    .line 8
    .line 9
    sget-object v1, La/q4f;->m:La/q4f;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, La/g45;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/lye;

    .line 16
    .line 17
    iget-object p0, p0, La/lye;->a:La/g0f;

    .line 18
    .line 19
    iget-wide p0, p0, La/g0f;->c:D

    .line 20
    .line 21
    return-wide p0

    .line 22
    :cond_0
    iget-object p0, p0, La/g45;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/m0f;

    .line 25
    .line 26
    iget-object p0, p0, La/m0f;->a:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object v1, v0

    .line 43
    check-cast v1, La/g0f;

    .line 44
    .line 45
    iget-object v1, v1, La/g0f;->b:Ljava/util/List;

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, La/hf6;

    .line 71
    .line 72
    iget v2, v2, La/hf6;->a:I

    .line 73
    .line 74
    if-ne v2, p1, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    const/4 v0, 0x0

    .line 78
    :goto_1
    check-cast v0, La/g0f;

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    iget-wide p0, v0, La/g0f;->c:D

    .line 83
    .line 84
    return-wide p0

    .line 85
    :cond_5
    const-wide/16 p0, 0x0

    .line 86
    .line 87
    return-wide p0
.end method

.method public b(ZLa/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/tqc;->a:La/g45;

    .line 2
    .line 3
    iget-object p0, p0, La/g45;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/ave;

    .line 6
    .line 7
    iget-object p0, p0, La/ave;->q:La/qoj0;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1, p2}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

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
    goto :goto_0

    .line 22
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    :goto_0
    if-ne p0, p1, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    :goto_1
    if-ne p0, p1, :cond_2

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method

.method public c(I)Z
    .locals 3

    .line 1
    iget-object p0, p0, La/tqc;->a:La/g45;

    .line 2
    .line 3
    iget-object v0, p0, La/g45;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/ave;

    .line 6
    .line 7
    iget-object v0, v0, La/ave;->a:La/q4f;

    .line 8
    .line 9
    sget-object v1, La/q4f;->m:La/q4f;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, La/g45;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/lye;

    .line 16
    .line 17
    iget-object p0, p0, La/lye;->a:La/g0f;

    .line 18
    .line 19
    iget-boolean p0, p0, La/g0f;->i:Z

    .line 20
    .line 21
    return p0

    .line 22
    :cond_0
    iget-object p0, p0, La/g45;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/m0f;

    .line 25
    .line 26
    iget-object p0, p0, La/m0f;->a:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object v1, v0

    .line 43
    check-cast v1, La/g0f;

    .line 44
    .line 45
    iget-object v1, v1, La/g0f;->b:Ljava/util/List;

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, La/hf6;

    .line 71
    .line 72
    iget v2, v2, La/hf6;->a:I

    .line 73
    .line 74
    if-ne v2, p1, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    const/4 v0, 0x0

    .line 78
    :goto_1
    check-cast v0, La/g0f;

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    iget-boolean p0, v0, La/g0f;->i:Z

    .line 83
    .line 84
    return p0

    .line 85
    :cond_5
    const/4 p0, 0x0

    .line 86
    return p0
.end method
