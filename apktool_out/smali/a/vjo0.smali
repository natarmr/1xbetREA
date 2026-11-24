.class public final La/vjo0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, La/brm0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/vjo0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, La/vjo0;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, La/vjo0;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, La/vjo0;->d:Ljava/util/ArrayList;

    .line 14
    .line 15
    iput-object p5, p0, La/vjo0;->e:Ljava/util/ArrayList;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, La/vjo0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/vjo0;

    .line 11
    .line 12
    iget-object v0, p1, La/vjo0;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p0, La/vjo0;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v0, p0, La/vjo0;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p1, La/vjo0;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget-object v0, p0, La/vjo0;->c:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v1, p1, La/vjo0;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    iget-object v0, p0, La/vjo0;->d:Ljava/util/ArrayList;

    .line 46
    .line 47
    iget-object v1, p1, La/vjo0;->d:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    :goto_0
    const/4 p0, 0x0

    .line 56
    return p0

    .line 57
    :cond_5
    iget-object p0, p0, La/vjo0;->e:Ljava/util/ArrayList;

    .line 58
    .line 59
    iget-object p1, p1, La/vjo0;->e:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/vjo0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, La/vjo0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/vjo0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/vjo0;->d:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->g(Ljava/util/ArrayList;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object p0, p0, La/vjo0;->e:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, La/vjo0;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, La/u4n0;->t(Ljava/util/Collection;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, La/vjo0;->e:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, La/u4n0;->s(Ljava/util/Collection;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "\',\n                |   onDelete = \'"

    .line 22
    .line 23
    const-string v3, "\',\n                |   onUpdate = \'"

    .line 24
    .line 25
    const-string v4, "\n                |ForeignKey {\n                |   referenceTable = \'"

    .line 26
    .line 27
    iget-object v5, p0, La/vjo0;->a:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v6, p0, La/vjo0;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v4, v5, v2, v6, v3}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "\',\n                |   columnNames = {"

    .line 36
    .line 37
    const-string v4, "\n                |   referenceColumnNames = {"

    .line 38
    .line 39
    iget-object p0, p0, La/vjo0;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v2, p0, v3, v0, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, "\n                |}\n            "

    .line 48
    .line 49
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, La/ntm0;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, La/ntm0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
