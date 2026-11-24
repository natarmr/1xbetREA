.class public final La/yrl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/asl;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3, p4, p5}, La/ohs0;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/yrl;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, La/yrl;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, La/yrl;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, La/yrl;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, La/yrl;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-wide p6, p0, La/yrl;->f:J

    .line 18
    .line 19
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
    instance-of v0, p1, La/yrl;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/yrl;

    .line 10
    .line 11
    iget-object v0, p0, La/yrl;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/yrl;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/yrl;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/yrl;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/yrl;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/yrl;->c:Ljava/lang/String;

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
    iget-object v0, p0, La/yrl;->d:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, p1, La/yrl;->d:Ljava/lang/String;

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
    iget-object v0, p0, La/yrl;->e:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v1, p1, La/yrl;->e:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-wide v0, p0, La/yrl;->f:J

    .line 67
    .line 68
    iget-wide p0, p1, La/yrl;->f:J

    .line 69
    .line 70
    cmp-long p0, v0, p0

    .line 71
    .line 72
    if-eqz p0, :cond_7

    .line 73
    .line 74
    :goto_0
    const/4 p0, 0x0

    .line 75
    return p0

    .line 76
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 77
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/yrl;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit16 v0, v0, 0x3c1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/16 v2, 0x1f

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, La/yrl;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v2, v1}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, La/yrl;->c:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v2, v1}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v1, p0, La/yrl;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v2, v1}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v1, p0, La/yrl;->e:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v2, v1}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v1, p0, La/yrl;->f:J

    .line 41
    .line 42
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v0

    .line 47
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", titleColor=null, showDays=true, timerDaysTitle="

    .line 2
    .line 3
    const-string v1, ", timerHoursTitle="

    .line 4
    .line 5
    const-string v2, "Content(title="

    .line 6
    .line 7
    iget-object v3, p0, La/yrl;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, La/yrl;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", timerMinutesTitle="

    .line 16
    .line 17
    const-string v2, ", timerSecondsTitle="

    .line 18
    .line 19
    iget-object v3, p0, La/yrl;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, La/yrl;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", counterDateMillis="

    .line 27
    .line 28
    iget-wide v2, p0, La/yrl;->f:J

    .line 29
    .line 30
    iget-object p0, p0, La/yrl;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v2, v3, p0, v1}, Lc;->i(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string p0, ")"

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method
