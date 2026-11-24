.class public final La/whg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

.field public final b:La/cnb;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Z

.field public final f:La/hhq0;

.field public final g:Z

.field public final h:Z


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/cnb;Ljava/lang/String;ZZLa/hhq0;ZI)V
    .locals 10

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v8, v0

    goto :goto_0

    :cond_0
    move/from16 v8, p7

    :goto_0
    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move-object/from16 v7, p6

    .line 30
    invoke-direct/range {v1 .. v9}, La/whg;-><init>(Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/cnb;Ljava/lang/String;ZZLa/hhq0;ZZ)V

    return-void
.end method

.method public constructor <init>(Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/cnb;Ljava/lang/String;ZZLa/hhq0;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/whg;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 14
    .line 15
    iput-object p2, p0, La/whg;->b:La/cnb;

    .line 16
    .line 17
    iput-object p3, p0, La/whg;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-boolean p4, p0, La/whg;->d:Z

    .line 20
    .line 21
    iput-boolean p5, p0, La/whg;->e:Z

    .line 22
    .line 23
    iput-object p6, p0, La/whg;->f:La/hhq0;

    .line 24
    .line 25
    iput-boolean p7, p0, La/whg;->g:Z

    .line 26
    .line 27
    iput-boolean p8, p0, La/whg;->h:Z

    .line 28
    .line 29
    return-void
.end method

.method public static a(La/whg;La/cnb;ZLa/hhq0;ZI)La/whg;
    .locals 9

    .line 1
    iget-object v1, p0, La/whg;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 2
    .line 3
    and-int/lit8 v0, p5, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/whg;->b:La/cnb;

    .line 8
    .line 9
    :cond_0
    move-object v2, p1

    .line 10
    and-int/lit8 p1, p5, 0x4

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, La/whg;->c:Ljava/lang/String;

    .line 15
    .line 16
    :goto_0
    move-object v3, p1

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const-string p1, ""

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :goto_1
    and-int/lit8 p1, p5, 0x8

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-boolean p2, p0, La/whg;->d:Z

    .line 26
    .line 27
    :cond_2
    move v4, p2

    .line 28
    iget-boolean v5, p0, La/whg;->e:Z

    .line 29
    .line 30
    and-int/lit8 p1, p5, 0x20

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object p3, p0, La/whg;->f:La/hhq0;

    .line 35
    .line 36
    :cond_3
    move-object v6, p3

    .line 37
    iget-boolean v7, p0, La/whg;->g:Z

    .line 38
    .line 39
    and-int/lit16 p1, p5, 0x80

    .line 40
    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    iget-boolean p4, p0, La/whg;->h:Z

    .line 44
    .line 45
    :cond_4
    move v8, p4

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v0, La/whg;

    .line 62
    .line 63
    invoke-direct/range {v0 .. v8}, La/whg;-><init>(Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/cnb;Ljava/lang/String;ZZLa/hhq0;ZZ)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/whg;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/whg;

    .line 12
    .line 13
    iget-object v1, p0, La/whg;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 14
    .line 15
    iget-object v3, p1, La/whg;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, La/whg;->b:La/cnb;

    .line 25
    .line 26
    iget-object v3, p1, La/whg;->b:La/cnb;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, La/whg;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, La/whg;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-boolean v1, p0, La/whg;->d:Z

    .line 47
    .line 48
    iget-boolean v3, p1, La/whg;->d:Z

    .line 49
    .line 50
    if-eq v1, v3, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-boolean v1, p0, La/whg;->e:Z

    .line 54
    .line 55
    iget-boolean v3, p1, La/whg;->e:Z

    .line 56
    .line 57
    if-eq v1, v3, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-object v1, p0, La/whg;->f:La/hhq0;

    .line 61
    .line 62
    iget-object v3, p1, La/whg;->f:La/hhq0;

    .line 63
    .line 64
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-boolean v1, p0, La/whg;->g:Z

    .line 72
    .line 73
    iget-boolean v3, p1, La/whg;->g:Z

    .line 74
    .line 75
    if-eq v1, v3, :cond_8

    .line 76
    .line 77
    return v2

    .line 78
    :cond_8
    iget-boolean p0, p0, La/whg;->h:Z

    .line 79
    .line 80
    iget-boolean p1, p1, La/whg;->h:Z

    .line 81
    .line 82
    if-eq p0, p1, :cond_9

    .line 83
    .line 84
    return v2

    .line 85
    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/whg;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;->hashCode()I

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
    iget-object v2, p0, La/whg;->b:La/cnb;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/whg;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-boolean v2, p0, La/whg;->d:Z

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/whg;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, La/whg;->f:La/hhq0;

    .line 37
    .line 38
    invoke-virtual {v2}, La/hhq0;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    add-int/2addr v2, v0

    .line 43
    mul-int/2addr v2, v1

    .line 44
    iget-boolean v0, p0, La/whg;->g:Z

    .line 45
    .line 46
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-boolean p0, p0, La/whg;->h:Z

    .line 51
    .line 52
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    add-int/2addr p0, v0

    .line 57
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CyberChampsMainStateModel(params="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/whg;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", selectedTabKey="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/whg;->b:La/cnb;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", searchQuery="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", isStreamFilterEnabled="

    .line 29
    .line 30
    const-string v2, ", isMultiselectEnabled="

    .line 31
    .line 32
    iget-object v3, p0, La/whg;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-boolean v4, p0, La/whg;->d:Z

    .line 35
    .line 36
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 37
    .line 38
    .line 39
    iget-boolean v1, p0, La/whg;->e:Z

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", timeFilterModel="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, La/whg;->f:La/hhq0;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", isLiveEmpty="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, ", isSearchActive="

    .line 60
    .line 61
    const-string v2, ")"

    .line 62
    .line 63
    iget-boolean v3, p0, La/whg;->g:Z

    .line 64
    .line 65
    iget-boolean p0, p0, La/whg;->h:Z

    .line 66
    .line 67
    invoke-static {v1, v2, v0, v3, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method
