.class public final La/rk10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/qk10;


# instance fields
.field public final a:La/uk10;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:La/de8;

.field public final e:J

.field public final f:Ljava/lang/Long;

.field public final g:Ljava/lang/Double;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, La/qk10;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/rk10;->Companion:La/qk10;

    .line 7
    .line 8
    new-instance v1, La/rk10;

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    const/16 v9, 0x2f

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    const-wide/16 v6, 0x0

    .line 23
    .line 24
    invoke-direct/range {v1 .. v9}, La/rk10;-><init>(La/uk10;JLa/de8;JLjava/lang/Double;I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public synthetic constructor <init>(ILa/uk10;Ljava/lang/String;JLa/de8;JLjava/lang/Long;Ljava/lang/Double;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, La/rk10;->a:La/uk10;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p2, p0, La/rk10;->a:La/uk10;

    .line 13
    .line 14
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    const-string p2, ""

    .line 19
    .line 20
    iput-object p2, p0, La/rk10;->b:Ljava/lang/String;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    iput-object p3, p0, La/rk10;->b:Ljava/lang/String;

    .line 24
    .line 25
    :goto_1
    and-int/lit8 p2, p1, 0x4

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    if-nez p2, :cond_2

    .line 30
    .line 31
    iput-wide v2, p0, La/rk10;->c:J

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    iput-wide p4, p0, La/rk10;->c:J

    .line 35
    .line 36
    :goto_2
    and-int/lit8 p2, p1, 0x8

    .line 37
    .line 38
    if-nez p2, :cond_3

    .line 39
    .line 40
    iput-object v1, p0, La/rk10;->d:La/de8;

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_3
    iput-object p6, p0, La/rk10;->d:La/de8;

    .line 44
    .line 45
    :goto_3
    and-int/lit8 p2, p1, 0x10

    .line 46
    .line 47
    if-nez p2, :cond_4

    .line 48
    .line 49
    iput-wide v2, p0, La/rk10;->e:J

    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_4
    iput-wide p7, p0, La/rk10;->e:J

    .line 53
    .line 54
    :goto_4
    and-int/lit8 p2, p1, 0x20

    .line 55
    .line 56
    if-nez p2, :cond_5

    .line 57
    .line 58
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iput-object p2, p0, La/rk10;->f:Ljava/lang/Long;

    .line 63
    .line 64
    goto :goto_5

    .line 65
    :cond_5
    iput-object p9, p0, La/rk10;->f:Ljava/lang/Long;

    .line 66
    .line 67
    :goto_5
    and-int/lit8 p1, p1, 0x40

    .line 68
    .line 69
    if-nez p1, :cond_6

    .line 70
    .line 71
    iput-object v1, p0, La/rk10;->g:Ljava/lang/Double;

    .line 72
    .line 73
    return-void

    .line 74
    :cond_6
    iput-object p10, p0, La/rk10;->g:Ljava/lang/Double;

    .line 75
    .line 76
    return-void
.end method

.method public constructor <init>(La/uk10;JLa/de8;JLjava/lang/Double;I)V
    .locals 4

    and-int/lit8 v0, p8, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p1, v1

    :cond_0
    and-int/lit8 v0, p8, 0x4

    const-wide/16 v2, 0x0

    if-eqz v0, :cond_1

    move-wide p2, v2

    :cond_1
    and-int/lit8 p8, p8, 0x8

    if-eqz p8, :cond_2

    move-object p4, v1

    .line 77
    :cond_2
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p8

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, La/rk10;->a:La/uk10;

    .line 80
    const-string p1, ""

    iput-object p1, p0, La/rk10;->b:Ljava/lang/String;

    .line 81
    iput-wide p2, p0, La/rk10;->c:J

    .line 82
    iput-object p4, p0, La/rk10;->d:La/de8;

    .line 83
    iput-wide p5, p0, La/rk10;->e:J

    .line 84
    iput-object p8, p0, La/rk10;->f:Ljava/lang/Long;

    .line 85
    iput-object p7, p0, La/rk10;->g:Ljava/lang/Double;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v1, 0x0

    .line 13
    :goto_0
    const-class v2, La/rk10;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    return v2

    .line 23
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p1, La/rk10;

    .line 27
    .line 28
    iget-object v1, p0, La/rk10;->a:La/uk10;

    .line 29
    .line 30
    iget-object v3, p1, La/rk10;->a:La/uk10;

    .line 31
    .line 32
    if-ne v1, v3, :cond_4

    .line 33
    .line 34
    iget-object v1, p1, La/rk10;->g:Ljava/lang/Double;

    .line 35
    .line 36
    iget-object v3, p0, La/rk10;->g:Ljava/lang/Double;

    .line 37
    .line 38
    if-nez v3, :cond_3

    .line 39
    .line 40
    if-nez v1, :cond_4

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    if-eqz v1, :cond_4

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 50
    .line 51
    .line 52
    move-result-wide v5

    .line 53
    cmpl-double v1, v3, v5

    .line 54
    .line 55
    if-nez v1, :cond_4

    .line 56
    .line 57
    :goto_1
    iget-wide v3, p0, La/rk10;->c:J

    .line 58
    .line 59
    iget-wide p0, p1, La/rk10;->c:J

    .line 60
    .line 61
    cmp-long p0, v3, p0

    .line 62
    .line 63
    if-nez p0, :cond_4

    .line 64
    .line 65
    return v0

    .line 66
    :cond_4
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/rk10;->a:La/uk10;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, La/rk10;->g:Ljava/lang/Double;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    :cond_1
    add-int/2addr v1, v0

    .line 23
    mul-int/lit8 v1, v1, 0x1f

    .line 24
    .line 25
    iget-wide v2, p0, La/rk10;->c:J

    .line 26
    .line 27
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    add-int/2addr p0, v1

    .line 32
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "LuckyWheelBonus(bonusType="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/rk10;->a:La/uk10;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", bonusDescription="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/rk10;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", gameTypeId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, La/rk10;->c:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", bonusEnabled="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/rk10;->d:La/de8;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", count="

    .line 44
    .line 45
    const-string v2, ", remainingTime="

    .line 46
    .line 47
    iget-wide v3, p0, La/rk10;->e:J

    .line 48
    .line 49
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, La/rk10;->f:Ljava/lang/Long;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", freeBetSum="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, La/rk10;->g:Ljava/lang/Double;

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p0, ")"

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method
