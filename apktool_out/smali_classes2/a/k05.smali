.class public final La/k05;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s960;


# static fields
.field public static final a:La/k05;

.field public static final b:La/sqp;

.field public static final c:La/sqp;

.field public static final d:La/sqp;

.field public static final e:La/sqp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/k05;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/k05;->a:La/k05;

    .line 7
    .line 8
    const-string v0, "processName"

    .line 9
    .line 10
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, La/k05;->b:La/sqp;

    .line 15
    .line 16
    const-string v0, "pid"

    .line 17
    .line 18
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, La/k05;->c:La/sqp;

    .line 23
    .line 24
    const-string v0, "importance"

    .line 25
    .line 26
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, La/k05;->d:La/sqp;

    .line 31
    .line 32
    const-string v0, "defaultProcess"

    .line 33
    .line 34
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, La/k05;->e:La/sqp;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, La/ryb0;

    .line 2
    .line 3
    check-cast p2, La/t960;

    .line 4
    .line 5
    sget-object p0, La/k05;->b:La/sqp;

    .line 6
    .line 7
    iget-object v0, p1, La/ryb0;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-interface {p2, p0, v0}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 10
    .line 11
    .line 12
    sget-object p0, La/k05;->c:La/sqp;

    .line 13
    .line 14
    iget v0, p1, La/ryb0;->b:I

    .line 15
    .line 16
    invoke-interface {p2, p0, v0}, La/t960;->d(La/sqp;I)La/t960;

    .line 17
    .line 18
    .line 19
    sget-object p0, La/k05;->d:La/sqp;

    .line 20
    .line 21
    iget v0, p1, La/ryb0;->c:I

    .line 22
    .line 23
    invoke-interface {p2, p0, v0}, La/t960;->d(La/sqp;I)La/t960;

    .line 24
    .line 25
    .line 26
    sget-object p0, La/k05;->e:La/sqp;

    .line 27
    .line 28
    iget-boolean p1, p1, La/ryb0;->d:Z

    .line 29
    .line 30
    invoke-interface {p2, p0, p1}, La/t960;->f(La/sqp;Z)La/t960;

    .line 31
    .line 32
    .line 33
    return-void
.end method
