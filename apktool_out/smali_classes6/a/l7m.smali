.class public final La/l7m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g7m;

.field public final b:La/q7m;

.field public final c:La/a4x;

.field public final d:La/a4x;

.field public final e:La/a4x;


# direct methods
.method public constructor <init>(La/g7m;La/q7m;La/i4;La/i4;La/i4;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/l7m;->a:La/g7m;

    .line 14
    .line 15
    iput-object p2, p0, La/l7m;->b:La/q7m;

    .line 16
    .line 17
    iput-object p3, p0, La/l7m;->c:La/a4x;

    .line 18
    .line 19
    iput-object p4, p0, La/l7m;->d:La/a4x;

    .line 20
    .line 21
    iput-object p5, p0, La/l7m;->e:La/a4x;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/l7m;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/l7m;

    .line 10
    .line 11
    iget-object v0, p0, La/l7m;->a:La/g7m;

    .line 12
    .line 13
    iget-object v1, p1, La/l7m;->a:La/g7m;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/g7m;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, La/l7m;->b:La/q7m;

    .line 23
    .line 24
    iget-object v1, p1, La/l7m;->b:La/q7m;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/q7m;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, La/l7m;->c:La/a4x;

    .line 34
    .line 35
    iget-object v1, p1, La/l7m;->c:La/a4x;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, La/l7m;->d:La/a4x;

    .line 45
    .line 46
    iget-object v1, p1, La/l7m;->d:La/a4x;

    .line 47
    .line 48
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object p0, p0, La/l7m;->e:La/a4x;

    .line 56
    .line 57
    iget-object p1, p1, La/l7m;->e:La/a4x;

    .line 58
    .line 59
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_6

    .line 64
    .line 65
    :goto_0
    const/4 p0, 0x0

    .line 66
    return p0

    .line 67
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 68
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/l7m;->a:La/g7m;

    .line 2
    .line 3
    invoke-virtual {v0}, La/g7m;->hashCode()I

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
    iget-object v2, p0, La/l7m;->b:La/q7m;

    .line 11
    .line 12
    iget-object v2, v2, La/q7m;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, La/l7m;->c:La/a4x;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/l7m;->d:La/a4x;

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object p0, p0, La/l7m;->e:La/a4x;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v0

    .line 37
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DsCyberGameTableUiModel(header="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/l7m;->a:La/g7m;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", mainColumnTitle="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/l7m;->b:La/q7m;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", mainColumn="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", dataColumns="

    .line 29
    .line 30
    const-string v2, ", titleColumns="

    .line 31
    .line 32
    iget-object v3, p0, La/l7m;->c:La/a4x;

    .line 33
    .line 34
    iget-object v4, p0, La/l7m;->d:La/a4x;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, La/hne;->y(Ljava/lang/StringBuilder;La/a4x;Ljava/lang/String;La/a4x;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ")"

    .line 40
    .line 41
    iget-object p0, p0, La/l7m;->e:La/a4x;

    .line 42
    .line 43
    invoke-static {v0, p0, v1}, La/cs0;->n(Ljava/lang/StringBuilder;La/a4x;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
