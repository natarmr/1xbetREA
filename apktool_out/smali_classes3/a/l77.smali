.class public final La/l77;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/m0w;

.field public final b:La/odj;

.field public final c:La/qoj0;

.field public d:J


# direct methods
.method public constructor <init>(La/y2m0;La/m0w;La/odj;La/b6u;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/l77;->a:La/m0w;

    .line 11
    .line 12
    iput-object p3, p0, La/l77;->b:La/odj;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    const/4 p3, 0x7

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-static {v0, v0, p1, p3}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/l77;->c:La/qoj0;

    .line 22
    .line 23
    invoke-virtual {p4}, La/b6u;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    add-int/lit8 p0, p0, -0x1

    .line 34
    .line 35
    int-to-long p0, p0

    .line 36
    const-wide/32 p3, 0x5265c00

    .line 37
    .line 38
    .line 39
    mul-long/2addr p0, p3

    .line 40
    invoke-static {}, La/y2m0;->c()J

    .line 41
    .line 42
    .line 43
    move-result-wide p3

    .line 44
    sub-long/2addr p3, p0

    .line 45
    iput-wide p0, p2, La/m0w;->d:J

    .line 46
    .line 47
    iput-wide p3, p2, La/m0w;->e:J

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a(La/s77;)J
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x3

    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    if-eq p1, v0, :cond_0

    .line 18
    .line 19
    sget-object p1, La/rv00;->k:La/rv00;

    .line 20
    .line 21
    iget-object p0, p0, La/l77;->a:La/m0w;

    .line 22
    .line 23
    iget-wide v0, p0, La/m0w;->e:J

    .line 24
    .line 25
    const/16 p0, 0xe

    .line 26
    .line 27
    invoke-static {p1, v0, v1, p0}, La/rv00;->n(La/rv00;JI)J

    .line 28
    .line 29
    .line 30
    move-result-wide p0

    .line 31
    return-wide p0

    .line 32
    :cond_0
    invoke-static {}, La/y2m0;->c()J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    const-wide v0, 0x9a7ec800L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    sub-long/2addr p0, v0

    .line 42
    return-wide p0

    .line 43
    :cond_1
    const-wide/32 p0, 0x4effa200

    .line 44
    .line 45
    .line 46
    return-wide p0
.end method

.method public final b(La/s77;Z)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-wide v0, p0, La/l77;->d:J

    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/text/format/DateUtils;->isToday(J)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    return-wide v1

    .line 22
    :cond_0
    invoke-static {}, La/y2m0;->c()J

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0

    .line 27
    :cond_1
    iget-object v0, p0, La/l77;->b:La/odj;

    .line 28
    .line 29
    iget-object v0, v0, La/odj;->a:La/pdj;

    .line 30
    .line 31
    sget-object v3, La/pdj;->b:La/pdj;

    .line 32
    .line 33
    if-ne v0, v3, :cond_2

    .line 34
    .line 35
    sget-object v0, La/s77;->g:La/s77;

    .line 36
    .line 37
    sget-object v3, La/s77;->f:La/s77;

    .line 38
    .line 39
    filled-new-array {v0, v3}, [La/s77;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    iget-wide p0, p0, La/l77;->d:J

    .line 54
    .line 55
    return-wide p0

    .line 56
    :cond_2
    if-eqz p2, :cond_3

    .line 57
    .line 58
    return-wide v1

    .line 59
    :cond_3
    invoke-static {}, La/y2m0;->c()J

    .line 60
    .line 61
    .line 62
    move-result-wide p0

    .line 63
    return-wide p0
.end method
