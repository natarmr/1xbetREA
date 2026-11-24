.class public final La/zu4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s960;


# static fields
.field public static final a:La/zu4;

.field public static final b:La/sqp;

.field public static final c:La/sqp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/zu4;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/zu4;->a:La/zu4;

    .line 7
    .line 8
    const-string v0, "clientType"

    .line 9
    .line 10
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, La/zu4;->b:La/sqp;

    .line 15
    .line 16
    const-string v0, "androidClientInfo"

    .line 17
    .line 18
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, La/zu4;->c:La/sqp;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, La/ytc;

    .line 2
    .line 3
    check-cast p2, La/t960;

    .line 4
    .line 5
    move-object p0, p1

    .line 6
    check-cast p0, La/s15;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object p0, La/xtc;->a:La/xtc;

    .line 12
    .line 13
    sget-object v0, La/zu4;->b:La/sqp;

    .line 14
    .line 15
    invoke-interface {p2, v0, p0}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 16
    .line 17
    .line 18
    check-cast p1, La/s15;

    .line 19
    .line 20
    iget-object p0, p1, La/s15;->a:La/k15;

    .line 21
    .line 22
    sget-object p1, La/zu4;->c:La/sqp;

    .line 23
    .line 24
    invoke-interface {p2, p1, p0}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 25
    .line 26
    .line 27
    return-void
.end method
