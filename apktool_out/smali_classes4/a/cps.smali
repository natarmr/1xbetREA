.class public final La/cps;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gps;


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/bps;

.field public static final e:[La/a8z;


# instance fields
.field public final a:J

.field public final b:La/sip;

.field public final c:J

.field public final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/bps;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/cps;->Companion:La/bps;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/o9s;

    .line 11
    .line 12
    const/16 v2, 0x15

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/o9s;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x4

    .line 22
    new-array v1, v1, [La/a8z;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    aput-object v3, v1, v2

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    aput-object v0, v1, v2

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    aput-object v3, v1, v0

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    aput-object v3, v1, v0

    .line 36
    .line 37
    sput-object v1, La/cps;->e:[La/a8z;

    .line 38
    .line 39
    return-void
.end method

.method public synthetic constructor <init>(ILa/bds;La/sip;JLa/wen;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0xf

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-wide p1, p2, La/bds;->a:J

    .line 11
    .line 12
    iput-wide p1, p0, La/cps;->a:J

    .line 13
    .line 14
    iput-object p3, p0, La/cps;->b:La/sip;

    .line 15
    .line 16
    iput-wide p4, p0, La/cps;->c:J

    .line 17
    .line 18
    iget-wide p1, p6, La/wen;->a:J

    .line 19
    .line 20
    iput-wide p1, p0, La/cps;->d:J

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    sget-object p0, La/aps;->a:La/aps;

    .line 24
    .line 25
    invoke-virtual {p0}, La/aps;->getDescriptor()La/ugi0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0
.end method

.method public constructor <init>(JJJ)V
    .locals 1

    sget-object v0, La/sip;->c:La/sip;

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-wide p1, p0, La/cps;->a:J

    .line 36
    iput-object v0, p0, La/cps;->b:La/sip;

    .line 37
    iput-wide p3, p0, La/cps;->c:J

    .line 38
    iput-wide p5, p0, La/cps;->d:J

    return-void
.end method


# virtual methods
.method public final E()La/sip;
    .locals 0

    .line 1
    iget-object p0, p0, La/cps;->b:La/sip;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Y()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/cps;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/cps;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

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
    instance-of v1, p1, La/cps;

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
    check-cast p1, La/cps;

    .line 12
    .line 13
    iget-wide v3, p0, La/cps;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, La/cps;->a:J

    .line 16
    .line 17
    invoke-static {v3, v4, v5, v6}, La/bds;->a(JJ)Z

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
    iget-object v1, p0, La/cps;->b:La/sip;

    .line 25
    .line 26
    iget-object v3, p1, La/cps;->b:La/sip;

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-wide v3, p0, La/cps;->c:J

    .line 32
    .line 33
    iget-wide v5, p1, La/cps;->c:J

    .line 34
    .line 35
    cmp-long v1, v3, v5

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    iget-wide v3, p0, La/cps;->d:J

    .line 41
    .line 42
    iget-wide p0, p1, La/cps;->d:J

    .line 43
    .line 44
    invoke-static {v3, v4, p0, p1}, La/wen;->d(JJ)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-wide v0, p0, La/cps;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget-object v2, p0, La/cps;->b:La/sip;

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
    iget-wide v3, p0, La/cps;->c:J

    .line 19
    .line 20
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sget-object v1, La/wen;->b:La/uen;

    .line 25
    .line 26
    iget-wide v1, p0, La/cps;->d:J

    .line 27
    .line 28
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    add-int/2addr p0, v0

    .line 33
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-wide v0, p0, La/cps;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/bds;->b(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/cps;->d:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/wen;->m(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "FindLive(gameId="

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, ", feedKind="

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La/cps;->b:La/sip;

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, ", sportId="

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, ", before="

    .line 39
    .line 40
    iget-wide v3, p0, La/cps;->c:J

    .line 41
    .line 42
    invoke-static {v2, v3, v4, v0, v1}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string p0, ")"

    .line 46
    .line 47
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method
