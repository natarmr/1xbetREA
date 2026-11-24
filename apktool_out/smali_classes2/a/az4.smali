.class public final La/az4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s960;


# static fields
.field public static final a:La/az4;

.field public static final b:La/sqp;

.field public static final c:La/sqp;

.field public static final d:La/sqp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/az4;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/az4;->a:La/az4;

    .line 7
    .line 8
    const-string v0, "name"

    .line 9
    .line 10
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, La/az4;->b:La/sqp;

    .line 15
    .line 16
    const-string v0, "importance"

    .line 17
    .line 18
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, La/az4;->c:La/sqp;

    .line 23
    .line 24
    const-string v0, "frames"

    .line 25
    .line 26
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, La/az4;->d:La/sqp;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, La/e9f;

    .line 2
    .line 3
    check-cast p2, La/t960;

    .line 4
    .line 5
    move-object p0, p1

    .line 6
    check-cast p0, La/u25;

    .line 7
    .line 8
    iget-object p0, p0, La/u25;->a:Ljava/lang/String;

    .line 9
    .line 10
    sget-object v0, La/az4;->b:La/sqp;

    .line 11
    .line 12
    invoke-interface {p2, v0, p0}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/u25;

    .line 16
    .line 17
    iget p0, p1, La/u25;->b:I

    .line 18
    .line 19
    sget-object v0, La/az4;->c:La/sqp;

    .line 20
    .line 21
    invoke-interface {p2, v0, p0}, La/t960;->d(La/sqp;I)La/t960;

    .line 22
    .line 23
    .line 24
    sget-object p0, La/az4;->d:La/sqp;

    .line 25
    .line 26
    iget-object p1, p1, La/u25;->c:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p2, p0, p1}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 29
    .line 30
    .line 31
    return-void
.end method
