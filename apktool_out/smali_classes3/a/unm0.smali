.class public final La/unm0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;ZZZZZLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/unm0;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, La/unm0;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-boolean p3, p0, La/unm0;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, La/unm0;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, La/unm0;->e:Z

    .line 13
    .line 14
    iput-boolean p6, p0, La/unm0;->f:Z

    .line 15
    .line 16
    iput-boolean p7, p0, La/unm0;->g:Z

    .line 17
    .line 18
    iput-object p8, p0, La/unm0;->h:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 19
    .line 20
    return-void
.end method

.method public static a(La/unm0;Ljava/util/ArrayList;ZZZZZI)La/unm0;
    .locals 9

    .line 1
    and-int/lit8 v0, p7, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, La/unm0;->a:Ljava/util/List;

    .line 6
    .line 7
    :cond_0
    move-object v1, p1

    .line 8
    iget-object v2, p0, La/unm0;->b:Ljava/util/List;

    .line 9
    .line 10
    and-int/lit8 p1, p7, 0x4

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-boolean p2, p0, La/unm0;->c:Z

    .line 15
    .line 16
    :cond_1
    move v3, p2

    .line 17
    and-int/lit8 p1, p7, 0x8

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-boolean p3, p0, La/unm0;->d:Z

    .line 22
    .line 23
    :cond_2
    move v4, p3

    .line 24
    and-int/lit8 p1, p7, 0x10

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    iget-boolean p4, p0, La/unm0;->e:Z

    .line 29
    .line 30
    :cond_3
    move v5, p4

    .line 31
    and-int/lit8 p1, p7, 0x20

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    iget-boolean p5, p0, La/unm0;->f:Z

    .line 36
    .line 37
    :cond_4
    move v6, p5

    .line 38
    and-int/lit8 p1, p7, 0x40

    .line 39
    .line 40
    if-eqz p1, :cond_5

    .line 41
    .line 42
    iget-boolean p1, p0, La/unm0;->g:Z

    .line 43
    .line 44
    move v7, p1

    .line 45
    goto :goto_0

    .line 46
    :cond_5
    move v7, p6

    .line 47
    :goto_0
    iget-object v8, p0, La/unm0;->h:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v0, La/unm0;

    .line 53
    .line 54
    invoke-direct/range {v0 .. v8}, La/unm0;-><init>(Ljava/util/List;Ljava/util/List;ZZZZZLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 55
    .line 56
    .line 57
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
    instance-of v0, p1, La/unm0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/unm0;

    .line 10
    .line 11
    iget-object v0, p0, La/unm0;->a:Ljava/util/List;

    .line 12
    .line 13
    iget-object v1, p1, La/unm0;->a:Ljava/util/List;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/unm0;->b:Ljava/util/List;

    .line 23
    .line 24
    iget-object v1, p1, La/unm0;->b:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/unm0;->c:Z

    .line 34
    .line 35
    iget-boolean v1, p1, La/unm0;->c:Z

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-boolean v0, p0, La/unm0;->d:Z

    .line 41
    .line 42
    iget-boolean v1, p1, La/unm0;->d:Z

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-boolean v0, p0, La/unm0;->e:Z

    .line 48
    .line 49
    iget-boolean v1, p1, La/unm0;->e:Z

    .line 50
    .line 51
    if-eq v0, v1, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget-boolean v0, p0, La/unm0;->f:Z

    .line 55
    .line 56
    iget-boolean v1, p1, La/unm0;->f:Z

    .line 57
    .line 58
    if-eq v0, v1, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    iget-boolean v0, p0, La/unm0;->g:Z

    .line 62
    .line 63
    iget-boolean v1, p1, La/unm0;->g:Z

    .line 64
    .line 65
    if-eq v0, v1, :cond_8

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_8
    iget-object p0, p0, La/unm0;->h:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 69
    .line 70
    iget-object p1, p1, La/unm0;->h:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 71
    .line 72
    if-eq p0, p1, :cond_9

    .line 73
    .line 74
    :goto_0
    const/4 p0, 0x0

    .line 75
    return p0

    .line 76
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 77
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/unm0;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, La/unm0;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/unm0;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/unm0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/unm0;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/unm0;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/unm0;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object p0, p0, La/unm0;->h:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

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

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", initialCouponStatusList="

    .line 2
    .line 3
    const-string v1, ", isConfirmButtonEnable="

    .line 4
    .line 5
    const-string v2, "StatusFilterModel(couponStatusList="

    .line 6
    .line 7
    iget-object v3, p0, La/unm0;->a:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, La/unm0;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v1, v4}, La/w6x;->t(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", isClearButtonEnable="

    .line 16
    .line 17
    const-string v2, ", isAllStateFilterEnable="

    .line 18
    .line 19
    iget-boolean v3, p0, La/unm0;->c:Z

    .line 20
    .line 21
    iget-boolean v4, p0, La/unm0;->d:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", isAllTypeGameEnable="

    .line 27
    .line 28
    const-string v2, ", isAllBetTypeEnable="

    .line 29
    .line 30
    iget-boolean v3, p0, La/unm0;->e:Z

    .line 31
    .line 32
    iget-boolean v4, p0, La/unm0;->f:Z

    .line 33
    .line 34
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 35
    .line 36
    .line 37
    iget-boolean v1, p0, La/unm0;->g:Z

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", historyTypeModel="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/unm0;->h:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p0, ")"

    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method
