.class public final La/g3e;
.super La/d3e;
.source "SourceFile"


# instance fields
.field public b:La/clc;

.field public c:I

.field public final d:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, La/d3e;-><init>(La/bh9;)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput v0, p0, La/g3e;->c:I

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, La/g3e;->d:Ljava/util/ArrayList;

    .line 14
    .line 15
    return-void
.end method

.method public static d(La/mm40;La/u2e;Lkotlin/jvm/functions/Function1;)La/mm40;
    .locals 1

    .line 1
    new-instance v0, La/f3e;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, La/f3e;-><init>(La/u2e;Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, La/mm40;->e(La/mm40;)La/mm40;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final e()La/u2e;
    .locals 2

    .line 1
    iget v0, p0, La/g3e;->c:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, La/g3e;->c:I

    .line 6
    .line 7
    iget-object v1, p0, La/g3e;->d:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/u2e;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, La/u2e;

    .line 18
    .line 19
    iget p0, p0, La/g3e;->c:I

    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, La/u2e;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    return-object v0
.end method

.method public final f()La/clc;
    .locals 2

    .line 1
    iget-object v0, p0, La/g3e;->b:La/clc;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/clc;

    .line 6
    .line 7
    const/16 v1, 0xc

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, La/clc;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/g3e;->b:La/clc;

    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, La/d3e;->a:La/bh9;

    .line 2
    .line 3
    iget-object v0, v0, La/wg9;->e:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, La/g3e;->c:I

    .line 10
    .line 11
    return-void
.end method
