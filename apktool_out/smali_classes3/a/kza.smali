.class public final La/kza;
.super La/kpb;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/kza;->a:Ljava/util/List;

    .line 11
    .line 12
    iput-object p2, p0, La/kza;->b:Ljava/util/List;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final I()I
    .locals 0

    .line 1
    iget-object p0, p0, La/kza;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final J()I
    .locals 0

    .line 1
    iget-object p0, p0, La/kza;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final s(II)Z
    .locals 1

    .line 1
    iget-object v0, p0, La/kza;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, La/p6t0;

    .line 8
    .line 9
    iget-object p0, p0, La/kza;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/p6t0;

    .line 16
    .line 17
    invoke-interface {p1, p1, p0}, La/p6t0;->h(La/p6t0;La/p6t0;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final t(II)Z
    .locals 1

    .line 1
    iget-object v0, p0, La/kza;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, La/p6t0;

    .line 8
    .line 9
    iget-object p0, p0, La/kza;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/p6t0;

    .line 16
    .line 17
    invoke-interface {p1, p1, p0}, La/p6t0;->g(La/p6t0;La/p6t0;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final z(II)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La/kza;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, La/p6t0;

    .line 8
    .line 9
    iget-object p0, p0, La/kza;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/p6t0;

    .line 16
    .line 17
    invoke-interface {p1, p1, p0}, La/p6t0;->o(La/p6t0;La/p6t0;)Ljava/util/Collection;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
