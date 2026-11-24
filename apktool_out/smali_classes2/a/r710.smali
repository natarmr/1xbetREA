.class public final La/r710;
.super La/o710;
.source "SourceFile"


# static fields
.field public static final e:La/q710;

.field public static final f:La/r710;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/q710;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/q710;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/r710;->e:La/q710;

    .line 8
    .line 9
    new-instance v0, La/r710;

    .line 10
    .line 11
    const-wide/16 v1, 0x1

    .line 12
    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3, v4}, La/r710;-><init>(JJ)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La/r710;->f:La/r710;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 7

    .line 1
    const-wide/16 v5, 0x1

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-wide v1, p1

    .line 5
    move-wide v3, p3

    .line 6
    invoke-direct/range {v0 .. v6}, La/o710;-><init>(JJJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, La/r710;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, La/r710;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, La/r710;

    .line 13
    .line 14
    invoke-virtual {v0}, La/r710;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    :cond_0
    check-cast p1, La/r710;

    .line 21
    .line 22
    iget-wide v0, p1, La/o710;->a:J

    .line 23
    .line 24
    iget-wide v2, p0, La/o710;->a:J

    .line 25
    .line 26
    cmp-long v0, v2, v0

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    iget-wide v0, p0, La/o710;->b:J

    .line 31
    .line 32
    iget-wide p0, p1, La/o710;->b:J

    .line 33
    .line 34
    cmp-long p0, v0, p0

    .line 35
    .line 36
    if-nez p0, :cond_2

    .line 37
    .line 38
    :cond_1
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_2
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, La/r710;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_0
    iget-wide v0, p0, La/o710;->a:J

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    mul-int/lit8 v0, v0, 0x1f

    .line 16
    .line 17
    iget-wide v1, p0, La/o710;->b:J

    .line 18
    .line 19
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    add-int/2addr p0, v0

    .line 24
    return p0
.end method

.method public final isEmpty()Z
    .locals 4

    .line 1
    iget-wide v0, p0, La/o710;->a:J

    .line 2
    .line 3
    iget-wide v2, p0, La/o710;->b:J

    .line 4
    .line 5
    cmp-long p0, v0, v2

    .line 6
    .line 7
    if-lez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, La/o710;->a:J

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ".."

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-wide v1, p0, La/o710;->b:J

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
