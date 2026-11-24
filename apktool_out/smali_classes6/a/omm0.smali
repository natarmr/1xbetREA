.class public final La/omm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/umm0;


# instance fields
.field public final a:La/i1n;

.field public final b:La/i1n;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:La/ogm;

.field public final g:La/ogm;


# direct methods
.method public constructor <init>(La/i1n;La/i1n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/ogm;La/ogm;)V
    .locals 1

    .line 1
    sget-object v0, La/x0m;->a:La/x0m;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/omm0;->a:La/i1n;

    .line 10
    .line 11
    iput-object p2, p0, La/omm0;->b:La/i1n;

    .line 12
    .line 13
    iput-object p3, p0, La/omm0;->c:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p4, p0, La/omm0;->d:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p5, p0, La/omm0;->e:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p6, p0, La/omm0;->f:La/ogm;

    .line 20
    .line 21
    iput-object p7, p0, La/omm0;->g:La/ogm;

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
    instance-of v0, p1, La/omm0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/omm0;

    .line 10
    .line 11
    iget-object v0, p0, La/omm0;->a:La/i1n;

    .line 12
    .line 13
    iget-object v1, p1, La/omm0;->a:La/i1n;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/i1n;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/omm0;->b:La/i1n;

    .line 23
    .line 24
    iget-object v1, p1, La/omm0;->b:La/i1n;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/i1n;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/omm0;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/omm0;->c:Ljava/lang/String;

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
    iget-object v0, p0, La/omm0;->d:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, p1, La/omm0;->d:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/omm0;->e:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v1, p1, La/omm0;->e:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    sget-object v0, La/x0m;->a:La/x0m;

    .line 67
    .line 68
    iget-object v0, p0, La/omm0;->f:La/ogm;

    .line 69
    .line 70
    iget-object v1, p1, La/omm0;->f:La/ogm;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, La/ogm;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_7
    iget-object p0, p0, La/omm0;->g:La/ogm;

    .line 80
    .line 81
    iget-object p1, p1, La/omm0;->g:La/ogm;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/ogm;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-nez p0, :cond_8

    .line 88
    .line 89
    :goto_0
    const/4 p0, 0x0

    .line 90
    return p0

    .line 91
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 92
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/omm0;->a:La/i1n;

    .line 2
    .line 3
    invoke-virtual {v0}, La/i1n;->hashCode()I

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
    iget-object v2, p0, La/omm0;->b:La/i1n;

    .line 11
    .line 12
    invoke-virtual {v2}, La/i1n;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    const v0, 0xe1781

    .line 18
    .line 19
    .line 20
    mul-int/2addr v2, v0

    .line 21
    iget-object v0, p0, La/omm0;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v2, p0, La/omm0;->d:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v2, p0, La/omm0;->e:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    sget-object v2, La/x0m;->a:La/x0m;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/2addr v2, v0

    .line 46
    mul-int/2addr v2, v1

    .line 47
    iget-object v0, p0, La/omm0;->f:La/ogm;

    .line 48
    .line 49
    iget-object v0, v0, La/ogm;->a:La/zgm;

    .line 50
    .line 51
    invoke-virtual {v0}, La/zgm;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/2addr v0, v2

    .line 56
    mul-int/2addr v0, v1

    .line 57
    iget-object p0, p0, La/omm0;->g:La/ogm;

    .line 58
    .line 59
    iget-object p0, p0, La/ogm;->a:La/zgm;

    .line 60
    .line 61
    invoke-virtual {p0}, La/zgm;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    add-int/2addr p0, v0

    .line 66
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, La/x0m;->a:La/x0m;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Cricket(firstOpponent="

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, La/omm0;->a:La/i1n;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, ", secondOpponent="

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, La/omm0;->b:La/i1n;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, ", scoreGameTitle=, scoreSetTitle=, scoreResultTitle=, infoLabel="

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, ", seedingLeft="

    .line 31
    .line 32
    const-string v3, ", seedingRight="

    .line 33
    .line 34
    iget-object v4, p0, La/omm0;->c:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v5, p0, La/omm0;->d:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v1, v4, v2, v5, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, La/omm0;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, ", lowerBracket="

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, ", startResultIndicator="

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, La/omm0;->f:La/ogm;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, ", endResultIndicator="

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, La/omm0;->g:La/ogm;

    .line 70
    .line 71
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p0, ")"

    .line 75
    .line 76
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method
