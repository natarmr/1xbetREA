.class public final La/rc50;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p4, p0, La/rc50;->a:Z

    .line 8
    .line 9
    iput-object p1, p0, La/rc50;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p5, p0, La/rc50;->c:Z

    .line 12
    .line 13
    iput-boolean p6, p0, La/rc50;->d:Z

    .line 14
    .line 15
    iput-object p2, p0, La/rc50;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p3, p0, La/rc50;->f:Ljava/lang/String;

    .line 18
    .line 19
    return-void
.end method

.method public static a(La/rc50;ZZZLjava/lang/String;I)La/rc50;
    .locals 7

    .line 1
    and-int/lit8 v0, p5, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, La/rc50;->a:Z

    .line 6
    .line 7
    :cond_0
    move v4, p1

    .line 8
    iget-object v1, p0, La/rc50;->b:Ljava/lang/String;

    .line 9
    .line 10
    and-int/lit8 p1, p5, 0x4

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-boolean p2, p0, La/rc50;->c:Z

    .line 15
    .line 16
    :cond_1
    move v5, p2

    .line 17
    and-int/lit8 p1, p5, 0x8

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-boolean p3, p0, La/rc50;->d:Z

    .line 22
    .line 23
    :cond_2
    move v6, p3

    .line 24
    and-int/lit8 p1, p5, 0x10

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    iget-object p4, p0, La/rc50;->e:Ljava/lang/String;

    .line 29
    .line 30
    :cond_3
    move-object v2, p4

    .line 31
    iget-object v3, p0, La/rc50;->f:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v0, La/rc50;

    .line 40
    .line 41
    invoke-direct/range {v0 .. v6}, La/rc50;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 42
    .line 43
    .line 44
    return-object v0
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
    instance-of v0, p1, La/rc50;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/rc50;

    .line 10
    .line 11
    iget-boolean v0, p0, La/rc50;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, La/rc50;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La/rc50;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p1, La/rc50;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-boolean v0, p0, La/rc50;->c:Z

    .line 30
    .line 31
    iget-boolean v1, p1, La/rc50;->c:Z

    .line 32
    .line 33
    if-eq v0, v1, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    iget-boolean v0, p0, La/rc50;->d:Z

    .line 37
    .line 38
    iget-boolean v1, p1, La/rc50;->d:Z

    .line 39
    .line 40
    if-eq v0, v1, :cond_5

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_5
    iget-object v0, p0, La/rc50;->e:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v1, p1, La/rc50;->e:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget-object p0, p0, La/rc50;->f:Ljava/lang/String;

    .line 55
    .line 56
    iget-object p1, p1, La/rc50;->f:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_7

    .line 63
    .line 64
    :goto_0
    const/4 p0, 0x0

    .line 65
    return p0

    .line 66
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 67
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/rc50;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-object v2, p0, La/rc50;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/rc50;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/rc50;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/rc50;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object p0, p0, La/rc50;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", navigationBarTitle="

    .line 2
    .line 3
    const-string v1, ", isSearchActive="

    .line 4
    .line 5
    const-string v2, "NavigationBarStateModel(searchAvailable="

    .line 6
    .line 7
    iget-object v3, p0, La/rc50;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v4, p0, La/rc50;->a:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v4, v1}, La/axq;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", searchFocused="

    .line 16
    .line 17
    const-string v2, ", searchString="

    .line 18
    .line 19
    iget-boolean v3, p0, La/rc50;->c:Z

    .line 20
    .line 21
    iget-boolean v4, p0, La/rc50;->d:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", placeholder="

    .line 27
    .line 28
    const-string v2, ")"

    .line 29
    .line 30
    iget-object v3, p0, La/rc50;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object p0, p0, La/rc50;->f:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, p0, v2}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method
