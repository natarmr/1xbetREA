.class public final La/xvq0;
.super La/wvq0;
.source "SourceFile"


# instance fields
.field public final c:Ljava/util/List;

.field public final d:I

.field public final synthetic e:La/dgu;


# direct methods
.method public constructor <init>(La/dgu;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lkotlin/ranges/IntRange;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v0, v0, Lkotlin/ranges/a;->a:I

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, -0x1

    .line 16
    :goto_0
    const/4 v1, 0x0

    .line 17
    invoke-direct {p0, p1, p2, v1, v0}, La/xvq0;-><init>(La/dgu;Ljava/util/List;II)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(La/dgu;Ljava/util/List;II)V
    .locals 0

    .line 21
    iput-object p1, p0, La/xvq0;->e:La/dgu;

    .line 22
    invoke-direct {p0, p1, p4}, La/wvq0;-><init>(La/dgu;I)V

    .line 23
    iput-object p2, p0, La/xvq0;->c:Ljava/util/List;

    .line 24
    iput p3, p0, La/xvq0;->d:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()La/wvq0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xvq0;->h()La/xvq0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final g()La/ar20;
    .locals 4

    .line 1
    iget-object v0, p0, La/xvq0;->c:Ljava/util/List;

    .line 2
    .line 3
    iget v1, p0, La/xvq0;->d:I

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lkotlin/ranges/IntRange;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v1, v0, Lkotlin/ranges/a;->a:I

    .line 15
    .line 16
    iget v0, v0, Lkotlin/ranges/a;->b:I

    .line 17
    .line 18
    iget v2, p0, La/wvq0;->a:I

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    add-int/2addr v2, v3

    .line 22
    if-gt v1, v2, :cond_1

    .line 23
    .line 24
    if-gt v2, v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v3}, La/wvq0;->f(I)La/lvq0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p0, p0, La/lvq0;->a:La/ar20;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public final h()La/xvq0;
    .locals 4

    .line 1
    iget-object v0, p0, La/xvq0;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, La/xvq0;->d:I

    .line 8
    .line 9
    if-lt v2, v1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lkotlin/ranges/IntRange;

    .line 17
    .line 18
    iget v1, v1, Lkotlin/ranges/a;->b:I

    .line 19
    .line 20
    iget-object v3, p0, La/xvq0;->e:La/dgu;

    .line 21
    .line 22
    iget p0, p0, La/wvq0;->a:I

    .line 23
    .line 24
    if-ne p0, v1, :cond_2

    .line 25
    .line 26
    new-instance p0, La/xvq0;

    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lkotlin/ranges/IntRange;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget v1, v1, Lkotlin/ranges/a;->a:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v1, v3, La/dgu;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    :goto_0
    invoke-direct {p0, v3, v0, v2, v1}, La/xvq0;-><init>(La/dgu;Ljava/util/List;II)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_2
    new-instance v1, La/xvq0;

    .line 54
    .line 55
    add-int/lit8 p0, p0, 0x1

    .line 56
    .line 57
    invoke-direct {v1, v3, v0, v2, p0}, La/xvq0;-><init>(La/dgu;Ljava/util/List;II)V

    .line 58
    .line 59
    .line 60
    return-object v1
.end method
