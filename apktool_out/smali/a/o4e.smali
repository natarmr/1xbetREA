.class public final La/o4e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:La/o4e;


# instance fields
.field public final a:La/sl50;

.field public final b:La/hl50;

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:J

.field public final h:J

.field public final i:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/o4e;

    .line 2
    .line 3
    invoke-direct {v0}, La/o4e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/o4e;->j:La/o4e;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 54
    sget-object v0, La/sl50;->a:La/sl50;

    .line 55
    sget-object v1, La/xun;->a:La/xun;

    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    new-instance v2, La/hl50;

    const/4 v3, 0x0

    .line 59
    invoke-direct {v2, v3}, La/hl50;-><init>(Landroid/net/NetworkRequest;)V

    .line 60
    iput-object v2, p0, La/o4e;->b:La/hl50;

    .line 61
    iput-object v0, p0, La/o4e;->a:La/sl50;

    const/4 v0, 0x0

    .line 62
    iput-boolean v0, p0, La/o4e;->c:Z

    .line 63
    iput-boolean v0, p0, La/o4e;->d:Z

    .line 64
    iput-boolean v0, p0, La/o4e;->e:Z

    .line 65
    iput-boolean v0, p0, La/o4e;->f:Z

    const-wide/16 v2, -0x1

    .line 66
    iput-wide v2, p0, La/o4e;->g:J

    .line 67
    iput-wide v2, p0, La/o4e;->h:J

    .line 68
    iput-object v1, p0, La/o4e;->i:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V
    .locals 0

    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, La/o4e;->b:La/hl50;

    .line 46
    iput-object p2, p0, La/o4e;->a:La/sl50;

    .line 47
    iput-boolean p3, p0, La/o4e;->c:Z

    .line 48
    iput-boolean p4, p0, La/o4e;->d:Z

    .line 49
    iput-boolean p5, p0, La/o4e;->e:Z

    .line 50
    iput-boolean p6, p0, La/o4e;->f:Z

    .line 51
    iput-wide p7, p0, La/o4e;->g:J

    .line 52
    iput-wide p9, p0, La/o4e;->h:J

    .line 53
    iput-object p11, p0, La/o4e;->i:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(La/o4e;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p1, La/o4e;->c:Z

    .line 8
    .line 9
    iput-boolean v0, p0, La/o4e;->c:Z

    .line 10
    .line 11
    iget-boolean v0, p1, La/o4e;->d:Z

    .line 12
    .line 13
    iput-boolean v0, p0, La/o4e;->d:Z

    .line 14
    .line 15
    iget-object v0, p1, La/o4e;->b:La/hl50;

    .line 16
    .line 17
    iput-object v0, p0, La/o4e;->b:La/hl50;

    .line 18
    .line 19
    iget-object v0, p1, La/o4e;->a:La/sl50;

    .line 20
    .line 21
    iput-object v0, p0, La/o4e;->a:La/sl50;

    .line 22
    .line 23
    iget-boolean v0, p1, La/o4e;->e:Z

    .line 24
    .line 25
    iput-boolean v0, p0, La/o4e;->e:Z

    .line 26
    .line 27
    iget-boolean v0, p1, La/o4e;->f:Z

    .line 28
    .line 29
    iput-boolean v0, p0, La/o4e;->f:Z

    .line 30
    .line 31
    iget-object v0, p1, La/o4e;->i:Ljava/util/Set;

    .line 32
    .line 33
    iput-object v0, p0, La/o4e;->i:Ljava/util/Set;

    .line 34
    .line 35
    iget-wide v0, p1, La/o4e;->g:J

    .line 36
    .line 37
    iput-wide v0, p0, La/o4e;->g:J

    .line 38
    .line 39
    iget-wide v0, p1, La/o4e;->h:J

    .line 40
    .line 41
    iput-wide v0, p0, La/o4e;->h:J

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a()Landroid/net/NetworkRequest;
    .locals 0

    .line 1
    iget-object p0, p0, La/o4e;->b:La/hl50;

    .line 2
    .line 3
    iget-object p0, p0, La/hl50;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Landroid/net/NetworkRequest;

    .line 6
    .line 7
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-eqz p1, :cond_a

    .line 6
    .line 7
    const-class v0, La/o4e;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    check-cast p1, La/o4e;

    .line 21
    .line 22
    iget-boolean v0, p0, La/o4e;->c:Z

    .line 23
    .line 24
    iget-boolean v1, p1, La/o4e;->c:Z

    .line 25
    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    iget-boolean v0, p0, La/o4e;->d:Z

    .line 30
    .line 31
    iget-boolean v1, p1, La/o4e;->d:Z

    .line 32
    .line 33
    if-eq v0, v1, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    iget-boolean v0, p0, La/o4e;->e:Z

    .line 37
    .line 38
    iget-boolean v1, p1, La/o4e;->e:Z

    .line 39
    .line 40
    if-eq v0, v1, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iget-boolean v0, p0, La/o4e;->f:Z

    .line 44
    .line 45
    iget-boolean v1, p1, La/o4e;->f:Z

    .line 46
    .line 47
    if-eq v0, v1, :cond_5

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_5
    iget-wide v0, p0, La/o4e;->g:J

    .line 51
    .line 52
    iget-wide v2, p1, La/o4e;->g:J

    .line 53
    .line 54
    cmp-long v0, v0, v2

    .line 55
    .line 56
    if-eqz v0, :cond_6

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_6
    iget-wide v0, p0, La/o4e;->h:J

    .line 60
    .line 61
    iget-wide v2, p1, La/o4e;->h:J

    .line 62
    .line 63
    cmp-long v0, v0, v2

    .line 64
    .line 65
    if-eqz v0, :cond_7

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_7
    invoke-virtual {p0}, La/o4e;->a()Landroid/net/NetworkRequest;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p1}, La/o4e;->a()Landroid/net/NetworkRequest;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_8

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_8
    iget-object v0, p0, La/o4e;->a:La/sl50;

    .line 84
    .line 85
    iget-object v1, p1, La/o4e;->a:La/sl50;

    .line 86
    .line 87
    if-eq v0, v1, :cond_9

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_9
    iget-object p0, p0, La/o4e;->i:Ljava/util/Set;

    .line 91
    .line 92
    iget-object p1, p1, La/o4e;->i:Ljava/util/Set;

    .line 93
    .line 94
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    return p0

    .line 99
    :cond_a
    :goto_0
    const/4 p0, 0x0

    .line 100
    return p0
.end method

.method public final hashCode()I
    .locals 7

    .line 1
    iget-object v0, p0, La/o4e;->a:La/sl50;

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
    iget-boolean v2, p0, La/o4e;->c:Z

    .line 11
    .line 12
    add-int/2addr v0, v2

    .line 13
    mul-int/2addr v0, v1

    .line 14
    iget-boolean v2, p0, La/o4e;->d:Z

    .line 15
    .line 16
    add-int/2addr v0, v2

    .line 17
    mul-int/2addr v0, v1

    .line 18
    iget-boolean v2, p0, La/o4e;->e:Z

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-boolean v2, p0, La/o4e;->f:Z

    .line 23
    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-wide v2, p0, La/o4e;->g:J

    .line 27
    .line 28
    const/16 v4, 0x20

    .line 29
    .line 30
    ushr-long v5, v2, v4

    .line 31
    .line 32
    xor-long/2addr v2, v5

    .line 33
    long-to-int v2, v2

    .line 34
    add-int/2addr v0, v2

    .line 35
    mul-int/2addr v0, v1

    .line 36
    iget-wide v2, p0, La/o4e;->h:J

    .line 37
    .line 38
    ushr-long v4, v2, v4

    .line 39
    .line 40
    xor-long/2addr v2, v4

    .line 41
    long-to-int v2, v2

    .line 42
    add-int/2addr v0, v2

    .line 43
    mul-int/2addr v0, v1

    .line 44
    iget-object v2, p0, La/o4e;->i:Ljava/util/Set;

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, La/ohs0;->g(Ljava/util/Set;II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p0}, La/o4e;->a()Landroid/net/NetworkRequest;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eqz p0, :cond_0

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 p0, 0x0

    .line 62
    :goto_0
    add-int/2addr v0, p0

    .line 63
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Constraints{requiredNetworkType="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/o4e;->a:La/sl50;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", requiresCharging="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, La/o4e;->c:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", requiresDeviceIdle="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", requiresBatteryNotLow="

    .line 29
    .line 30
    const-string v2, ", requiresStorageNotLow="

    .line 31
    .line 32
    iget-boolean v3, p0, La/o4e;->d:Z

    .line 33
    .line 34
    iget-boolean v4, p0, La/o4e;->e:Z

    .line 35
    .line 36
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", contentTriggerUpdateDelayMillis="

    .line 40
    .line 41
    iget-wide v2, p0, La/o4e;->g:J

    .line 42
    .line 43
    iget-boolean v4, p0, La/o4e;->f:Z

    .line 44
    .line 45
    invoke-static {v2, v3, v1, v0, v4}, La/rw2;->v(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", contentTriggerMaxDelayMillis="

    .line 49
    .line 50
    const-string v2, ", contentUriTriggers="

    .line 51
    .line 52
    iget-wide v3, p0, La/o4e;->h:J

    .line 53
    .line 54
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, La/o4e;->i:Ljava/util/Set;

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p0, ", }"

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method
