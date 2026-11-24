.class public final La/ty4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s960;


# static fields
.field public static final a:La/ty4;

.field public static final b:La/sqp;

.field public static final c:La/sqp;

.field public static final d:La/sqp;

.field public static final e:La/sqp;

.field public static final f:La/sqp;

.field public static final g:La/sqp;

.field public static final h:La/sqp;

.field public static final i:La/sqp;

.field public static final j:La/sqp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/ty4;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/ty4;->a:La/ty4;

    .line 7
    .line 8
    const-string v0, "arch"

    .line 9
    .line 10
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, La/ty4;->b:La/sqp;

    .line 15
    .line 16
    const-string v0, "model"

    .line 17
    .line 18
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, La/ty4;->c:La/sqp;

    .line 23
    .line 24
    const-string v0, "cores"

    .line 25
    .line 26
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, La/ty4;->d:La/sqp;

    .line 31
    .line 32
    const-string v0, "ram"

    .line 33
    .line 34
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, La/ty4;->e:La/sqp;

    .line 39
    .line 40
    const-string v0, "diskSpace"

    .line 41
    .line 42
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, La/ty4;->f:La/sqp;

    .line 47
    .line 48
    const-string v0, "simulator"

    .line 49
    .line 50
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, La/ty4;->g:La/sqp;

    .line 55
    .line 56
    const-string v0, "state"

    .line 57
    .line 58
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, La/ty4;->h:La/sqp;

    .line 63
    .line 64
    const-string v0, "manufacturer"

    .line 65
    .line 66
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sput-object v0, La/ty4;->i:La/sqp;

    .line 71
    .line 72
    const-string v0, "modelClass"

    .line 73
    .line 74
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, La/ty4;->j:La/sqp;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, La/z8f;

    .line 2
    .line 3
    check-cast p2, La/t960;

    .line 4
    .line 5
    move-object p0, p1

    .line 6
    check-cast p0, La/l25;

    .line 7
    .line 8
    iget p0, p0, La/l25;->a:I

    .line 9
    .line 10
    sget-object v0, La/ty4;->b:La/sqp;

    .line 11
    .line 12
    invoke-interface {p2, v0, p0}, La/t960;->d(La/sqp;I)La/t960;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/l25;

    .line 16
    .line 17
    iget-object p0, p1, La/l25;->b:Ljava/lang/String;

    .line 18
    .line 19
    sget-object v0, La/ty4;->c:La/sqp;

    .line 20
    .line 21
    invoke-interface {p2, v0, p0}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 22
    .line 23
    .line 24
    sget-object p0, La/ty4;->d:La/sqp;

    .line 25
    .line 26
    iget v0, p1, La/l25;->c:I

    .line 27
    .line 28
    invoke-interface {p2, p0, v0}, La/t960;->d(La/sqp;I)La/t960;

    .line 29
    .line 30
    .line 31
    sget-object p0, La/ty4;->e:La/sqp;

    .line 32
    .line 33
    iget-wide v0, p1, La/l25;->d:J

    .line 34
    .line 35
    invoke-interface {p2, p0, v0, v1}, La/t960;->c(La/sqp;J)La/t960;

    .line 36
    .line 37
    .line 38
    sget-object p0, La/ty4;->f:La/sqp;

    .line 39
    .line 40
    iget-wide v0, p1, La/l25;->e:J

    .line 41
    .line 42
    invoke-interface {p2, p0, v0, v1}, La/t960;->c(La/sqp;J)La/t960;

    .line 43
    .line 44
    .line 45
    sget-object p0, La/ty4;->g:La/sqp;

    .line 46
    .line 47
    iget-boolean v0, p1, La/l25;->f:Z

    .line 48
    .line 49
    invoke-interface {p2, p0, v0}, La/t960;->f(La/sqp;Z)La/t960;

    .line 50
    .line 51
    .line 52
    sget-object p0, La/ty4;->h:La/sqp;

    .line 53
    .line 54
    iget v0, p1, La/l25;->g:I

    .line 55
    .line 56
    invoke-interface {p2, p0, v0}, La/t960;->d(La/sqp;I)La/t960;

    .line 57
    .line 58
    .line 59
    sget-object p0, La/ty4;->i:La/sqp;

    .line 60
    .line 61
    iget-object v0, p1, La/l25;->h:Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {p2, p0, v0}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 64
    .line 65
    .line 66
    sget-object p0, La/ty4;->j:La/sqp;

    .line 67
    .line 68
    iget-object p1, p1, La/l25;->i:Ljava/lang/String;

    .line 69
    .line 70
    invoke-interface {p2, p0, p1}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 71
    .line 72
    .line 73
    return-void
.end method
