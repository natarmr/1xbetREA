.class public final La/ljk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pf80;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:La/ob50;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:La/fjk;

.field public final f:La/rip;

.field public final g:Ljava/util/List;

.field public final h:La/ugd;


# direct methods
.method public constructor <init>(Ljava/lang/Object;La/ob50;Ljava/util/List;Ljava/util/List;La/fjk;La/rip;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ljk;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/ljk;->b:La/ob50;

    .line 7
    .line 8
    iput-object p3, p0, La/ljk;->c:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, La/ljk;->d:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, La/ljk;->e:La/fjk;

    .line 13
    .line 14
    iput-object p6, p0, La/ljk;->f:La/rip;

    .line 15
    .line 16
    invoke-static {p2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/ljk;->g:Ljava/util/List;

    .line 21
    .line 22
    new-instance p1, La/kjk;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-direct {p1, p0, p2}, La/kjk;-><init>(La/ljk;B)V

    .line 26
    .line 27
    .line 28
    new-instance p2, La/ugd;

    .line 29
    .line 30
    const p3, -0x675cd9f3

    .line 31
    .line 32
    .line 33
    const/4 p4, 0x1

    .line 34
    invoke-direct {p2, p3, p4, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, La/ljk;->h:La/ugd;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/ljk;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/ljk;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_2

    .line 5
    .line 6
    const-class v0, La/ljk;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, La/ljk;

    .line 16
    .line 17
    iget-object v0, p0, La/ljk;->a:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v1, p1, La/ljk;->a:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, La/ljk;->c:Ljava/util/List;

    .line 28
    .line 29
    iget-object v1, p1, La/ljk;->c:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, La/ljk;->d:Ljava/util/List;

    .line 38
    .line 39
    iget-object v1, p1, La/ljk;->d:Ljava/util/List;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, La/ljk;->b:La/ob50;

    .line 48
    .line 49
    iget-object v1, p1, La/ljk;->b:La/ob50;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, La/ob50;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    iget-object p0, p0, La/ljk;->e:La/fjk;

    .line 58
    .line 59
    iget-object p1, p1, La/ljk;->e:La/fjk;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, La/fjk;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_2

    .line 66
    .line 67
    :goto_0
    const/4 p0, 0x1

    .line 68
    return p0

    .line 69
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 70
    return p0
.end method

.method public final getContent()La/ugd;
    .locals 0

    .line 1
    iget-object p0, p0, La/ljk;->h:La/ugd;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getEntries()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/ljk;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/ljk;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, La/ljk;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, La/ljk;->c:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    mul-int/lit8 v1, v1, 0x1f

    .line 16
    .line 17
    add-int/2addr v1, v0

    .line 18
    iget-object v0, p0, La/ljk;->d:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    mul-int/lit8 v0, v0, 0x1f

    .line 25
    .line 26
    add-int/2addr v0, v1

    .line 27
    iget-object v1, p0, La/ljk;->b:La/ob50;

    .line 28
    .line 29
    invoke-virtual {v1}, La/ob50;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    mul-int/lit8 v1, v1, 0x1f

    .line 34
    .line 35
    add-int/2addr v1, v0

    .line 36
    iget-object p0, p0, La/ljk;->e:La/fjk;

    .line 37
    .line 38
    invoke-virtual {p0}, La/fjk;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    mul-int/lit8 p0, p0, 0x1f

    .line 43
    .line 44
    add-int/2addr p0, v1

    .line 45
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DialogScene(key="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/ljk;->a:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", entry="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/ljk;->b:La/ob50;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", previousEntries="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", overlaidEntries="

    .line 29
    .line 30
    const-string v2, ", dialogProperties="

    .line 31
    .line 32
    iget-object v3, p0, La/ljk;->c:Ljava/util/List;

    .line 33
    .line 34
    iget-object v4, p0, La/ljk;->d:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v1, v2, v0, v3, v4}, La/b1j;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, La/ljk;->e:La/fjk;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, ")"

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method
