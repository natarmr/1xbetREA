.class public final La/cw30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nw30;


# instance fields
.field public final a:Z

.field public final b:La/iz30;

.field public final c:La/r040;

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(ZLa/iz30;La/r040;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-boolean p1, p0, La/cw30;->a:Z

    .line 17
    .line 18
    iput-object p2, p0, La/cw30;->b:La/iz30;

    .line 19
    .line 20
    iput-object p3, p0, La/cw30;->c:La/r040;

    .line 21
    .line 22
    iput p4, p0, La/cw30;->d:I

    .line 23
    .line 24
    iput-object p5, p0, La/cw30;->e:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p6, p0, La/cw30;->f:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p7, p0, La/cw30;->g:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p8, p0, La/cw30;->h:Ljava/util/ArrayList;

    .line 31
    .line 32
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
    instance-of v0, p1, La/cw30;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/cw30;

    .line 10
    .line 11
    iget-boolean v0, p0, La/cw30;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, La/cw30;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La/cw30;->b:La/iz30;

    .line 19
    .line 20
    iget-object v1, p1, La/cw30;->b:La/iz30;

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-object v0, p0, La/cw30;->c:La/r040;

    .line 26
    .line 27
    iget-object v1, p1, La/cw30;->c:La/r040;

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget v0, p0, La/cw30;->d:I

    .line 33
    .line 34
    iget v1, p1, La/cw30;->d:I

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget-object v0, p0, La/cw30;->e:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, p1, La/cw30;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_6

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_6
    iget-object v0, p0, La/cw30;->f:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p1, La/cw30;->f:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    iget-object v0, p0, La/cw30;->g:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, p1, La/cw30;->g:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-object p0, p0, La/cw30;->h:Ljava/util/ArrayList;

    .line 73
    .line 74
    iget-object p1, p1, La/cw30;->h:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-nez p0, :cond_9

    .line 81
    .line 82
    :goto_0
    const/4 p0, 0x0

    .line 83
    return p0

    .line 84
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 85
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/cw30;->a:Z

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
    iget-object v2, p0, La/cw30;->b:La/iz30;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/f140;->g(La/iz30;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/cw30;->c:La/r040;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/w6x;->f(La/r040;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/cw30;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/cw30;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/cw30;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/cw30;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object p0, p0, La/cw30;->h:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr p0, v0

    .line 53
    return p0
.end method

.method public final m()La/iz30;
    .locals 0

    .line 1
    iget-object p0, p0, La/cw30;->b:La/iz30;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()La/r040;
    .locals 0

    .line 1
    iget-object p0, p0, La/cw30;->c:La/r040;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "IndividualXGamesMenuUiItem(isBadgeVisible="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, La/cw30;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", menuItemModel="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/cw30;->b:La/iz30;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", menuSectionType="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", iconResId="

    .line 29
    .line 30
    const-string v2, ", title="

    .line 31
    .line 32
    iget-object v3, p0, La/cw30;->c:La/r040;

    .line 33
    .line 34
    iget v4, p0, La/cw30;->d:I

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->t(Ljava/lang/StringBuilder;La/r040;Ljava/lang/String;ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", subtitle="

    .line 40
    .line 41
    const-string v2, ", labelButton="

    .line 42
    .line 43
    iget-object v3, p0, La/cw30;->e:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v4, p0, La/cw30;->f:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, La/cw30;->g:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", xGames="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, La/cw30;->h:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p0, ")"

    .line 66
    .line 67
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0
.end method
