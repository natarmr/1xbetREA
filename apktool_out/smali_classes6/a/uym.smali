.class public final La/uym;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/bzm;

.field public final b:La/bzm;

.field public final c:La/azm;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/bzm;La/bzm;La/azm;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, La/q6x;->a:La/q6x;

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/uym;->a:La/bzm;

    .line 10
    .line 11
    iput-object p2, p0, La/uym;->b:La/bzm;

    .line 12
    .line 13
    iput-object p3, p0, La/uym;->c:La/azm;

    .line 14
    .line 15
    iput-object p4, p0, La/uym;->d:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p5, p0, La/uym;->e:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p6, p0, La/uym;->f:Ljava/lang/String;

    .line 20
    .line 21
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
    instance-of v0, p1, La/uym;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/uym;

    .line 10
    .line 11
    iget-object v0, p0, La/uym;->a:La/bzm;

    .line 12
    .line 13
    iget-object v1, p1, La/uym;->a:La/bzm;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/bzm;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/uym;->b:La/bzm;

    .line 23
    .line 24
    iget-object v1, p1, La/uym;->b:La/bzm;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/bzm;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/uym;->c:La/azm;

    .line 34
    .line 35
    iget-object v1, p1, La/uym;->c:La/azm;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, La/azm;->equals(Ljava/lang/Object;)Z

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
    sget-object v0, La/q6x;->a:La/q6x;

    .line 45
    .line 46
    iget-object v0, p0, La/uym;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, p1, La/uym;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    iget-object v0, p0, La/uym;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v1, p1, La/uym;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_6
    iget-object p0, p0, La/uym;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object p1, p1, La/uym;->f:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_7

    .line 77
    .line 78
    :goto_0
    const/4 p0, 0x0

    .line 79
    return p0

    .line 80
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 81
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/uym;->a:La/bzm;

    .line 2
    .line 3
    invoke-virtual {v0}, La/bzm;->hashCode()I

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
    iget-object v2, p0, La/uym;->b:La/bzm;

    .line 11
    .line 12
    invoke-virtual {v2}, La/bzm;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/lit16 v2, v2, 0x745f

    .line 18
    .line 19
    iget-object v0, p0, La/uym;->c:La/azm;

    .line 20
    .line 21
    invoke-virtual {v0}, La/azm;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/2addr v0, v2

    .line 26
    mul-int/2addr v0, v1

    .line 27
    sget-object v2, La/q6x;->a:La/q6x;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/2addr v2, v0

    .line 34
    mul-int/2addr v2, v1

    .line 35
    iget-object v0, p0, La/uym;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v2, p0, La/uym;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object p0, p0, La/uym;->f:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    add-int/2addr p0, v0

    .line 54
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, La/q6x;->a:La/q6x;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Default(teamOne="

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, La/uym;->a:La/bzm;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, ", teamTwo="

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, La/uym;->b:La/bzm;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, ", scoreRoundOne=null, scoreRoundTwo=null, scoreResult="

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, La/uym;->c:La/azm;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, ", indicatorState="

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ", info="

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, ", seedingLeft="

    .line 49
    .line 50
    const-string v2, ", seedingRight="

    .line 51
    .line 52
    iget-object v3, p0, La/uym;->d:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v4, p0, La/uym;->e:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v1, v3, v0, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string v0, ")"

    .line 60
    .line 61
    iget-object p0, p0, La/uym;->f:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v1, p0, v0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method
