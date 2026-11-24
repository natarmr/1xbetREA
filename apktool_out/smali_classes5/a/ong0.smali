.class public final La/ong0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:Z

.field public final d:La/mdm;

.field public final e:La/mdm;

.field public final f:La/mdm;

.field public final g:Ljava/util/List;

.field public final h:La/xkg0;

.field public final i:Z


# direct methods
.method public constructor <init>(ZIZLa/mdm;La/mdm;La/mdm;Ljava/util/List;La/xkg0;Z)V
    .locals 0

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, La/ong0;->a:Z

    .line 8
    .line 9
    iput p2, p0, La/ong0;->b:I

    .line 10
    .line 11
    iput-boolean p3, p0, La/ong0;->c:Z

    .line 12
    .line 13
    iput-object p4, p0, La/ong0;->d:La/mdm;

    .line 14
    .line 15
    iput-object p5, p0, La/ong0;->e:La/mdm;

    .line 16
    .line 17
    iput-object p6, p0, La/ong0;->f:La/mdm;

    .line 18
    .line 19
    iput-object p7, p0, La/ong0;->g:Ljava/util/List;

    .line 20
    .line 21
    iput-object p8, p0, La/ong0;->h:La/xkg0;

    .line 22
    .line 23
    iput-boolean p9, p0, La/ong0;->i:Z

    .line 24
    .line 25
    return-void
.end method

.method public static a(La/ong0;La/mdm;Ljava/util/List;La/xkg0;ZI)La/ong0;
    .locals 10

    .line 1
    iget-boolean v1, p0, La/ong0;->a:Z

    .line 2
    .line 3
    iget v2, p0, La/ong0;->b:I

    .line 4
    .line 5
    iget-object v5, p0, La/ong0;->e:La/mdm;

    .line 6
    .line 7
    iget-object v6, p0, La/ong0;->f:La/mdm;

    .line 8
    .line 9
    and-int/lit16 v0, p5, 0x80

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p3, p0, La/ong0;->h:La/xkg0;

    .line 14
    .line 15
    :cond_0
    move-object v8, p3

    .line 16
    and-int/lit16 p3, p5, 0x200

    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    iget-boolean p4, p0, La/ong0;->i:Z

    .line 21
    .line 22
    :cond_1
    move v9, p4

    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v0, La/ong0;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    move-object v4, p1

    .line 30
    move-object v7, p2

    .line 31
    invoke-direct/range {v0 .. v9}, La/ong0;-><init>(ZIZLa/mdm;La/mdm;La/mdm;Ljava/util/List;La/xkg0;Z)V

    .line 32
    .line 33
    .line 34
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
    instance-of v0, p1, La/ong0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/ong0;

    .line 10
    .line 11
    iget-boolean v0, p0, La/ong0;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, La/ong0;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget v0, p0, La/ong0;->b:I

    .line 19
    .line 20
    iget v1, p1, La/ong0;->b:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-boolean v0, p0, La/ong0;->c:Z

    .line 26
    .line 27
    iget-boolean v1, p1, La/ong0;->c:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget-object v0, p0, La/ong0;->d:La/mdm;

    .line 33
    .line 34
    iget-object v1, p1, La/ong0;->d:La/mdm;

    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_5

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_5
    iget-object v0, p0, La/ong0;->e:La/mdm;

    .line 44
    .line 45
    iget-object v1, p1, La/ong0;->e:La/mdm;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/ong0;->f:La/mdm;

    .line 55
    .line 56
    iget-object v1, p1, La/ong0;->f:La/mdm;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget-object v0, p0, La/ong0;->g:Ljava/util/List;

    .line 66
    .line 67
    iget-object v1, p1, La/ong0;->g:Ljava/util/List;

    .line 68
    .line 69
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_8
    iget-object v0, p0, La/ong0;->h:La/xkg0;

    .line 77
    .line 78
    iget-object v1, p1, La/ong0;->h:La/xkg0;

    .line 79
    .line 80
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_9

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_9
    iget-boolean p0, p0, La/ong0;->i:Z

    .line 88
    .line 89
    iget-boolean p1, p1, La/ong0;->i:Z

    .line 90
    .line 91
    if-eq p0, p1, :cond_a

    .line 92
    .line 93
    :goto_0
    const/4 p0, 0x0

    .line 94
    return p0

    .line 95
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 96
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, La/ong0;->a:Z

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
    iget v2, p0, La/ong0;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/ong0;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x0

    .line 23
    iget-object v3, p0, La/ong0;->d:La/mdm;

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    move v3, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v3}, La/mdm;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    :goto_0
    add-int/2addr v0, v3

    .line 34
    mul-int/2addr v0, v1

    .line 35
    iget-object v3, p0, La/ong0;->e:La/mdm;

    .line 36
    .line 37
    invoke-static {v3, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v3, p0, La/ong0;->f:La/mdm;

    .line 42
    .line 43
    invoke-static {v3, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v3, p0, La/ong0;->g:Ljava/util/List;

    .line 48
    .line 49
    invoke-static {v0, v1, v3}, La/dw9;->a(IILjava/util/List;)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget-object v3, p0, La/ong0;->h:La/xkg0;

    .line 54
    .line 55
    if-nez v3, :cond_1

    .line 56
    .line 57
    move v3, v2

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {v3}, La/xkg0;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    :goto_1
    add-int/2addr v0, v3

    .line 64
    mul-int/2addr v0, v1

    .line 65
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iget-boolean p0, p0, La/ong0;->i:Z

    .line 70
    .line 71
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    add-int/2addr p0, v0

    .line 76
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", toolbarTitleRes="

    .line 2
    .line 3
    const-string v1, ", loading="

    .line 4
    .line 5
    iget v2, p0, La/ong0;->b:I

    .line 6
    .line 7
    const-string v3, "RulesState(showToolbar="

    .line 8
    .line 9
    iget-boolean v4, p0, La/ong0;->a:Z

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, v4}, La/ohs0;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-boolean v1, p0, La/ong0;->c:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", lottieConfig="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/ong0;->d:La/mdm;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", dataErrorLottieConfig="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/ong0;->e:La/mdm;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", emptyDataLottieConfig="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/ong0;->f:La/mdm;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", rulesList="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, La/ong0;->g:Ljava/util/List;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", ruleButtonConfig="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, La/ong0;->h:La/xkg0;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", rulesButtonNeeded=false, rulesLoaded="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ")"

    .line 76
    .line 77
    iget-boolean p0, p0, La/ong0;->i:Z

    .line 78
    .line 79
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method
