.class public final La/i05;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s960;


# static fields
.field public static final a:La/i05;

.field public static final b:La/sqp;

.field public static final c:La/sqp;

.field public static final d:La/sqp;

.field public static final e:La/sqp;

.field public static final f:La/sqp;

.field public static final g:La/sqp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/i05;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/i05;->a:La/i05;

    .line 7
    .line 8
    const-string v0, "appId"

    .line 9
    .line 10
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, La/i05;->b:La/sqp;

    .line 15
    .line 16
    const-string v0, "deviceModel"

    .line 17
    .line 18
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, La/i05;->c:La/sqp;

    .line 23
    .line 24
    const-string v0, "sessionSdkVersion"

    .line 25
    .line 26
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, La/i05;->d:La/sqp;

    .line 31
    .line 32
    const-string v0, "osVersion"

    .line 33
    .line 34
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, La/i05;->e:La/sqp;

    .line 39
    .line 40
    const-string v0, "logEnvironment"

    .line 41
    .line 42
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, La/i05;->f:La/sqp;

    .line 47
    .line 48
    const-string v0, "androidAppInfo"

    .line 49
    .line 50
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, La/i05;->g:La/sqp;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, La/bs3;

    .line 2
    .line 3
    check-cast p2, La/t960;

    .line 4
    .line 5
    sget-object p0, La/i05;->b:La/sqp;

    .line 6
    .line 7
    iget-object v0, p1, La/bs3;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-interface {p2, p0, v0}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 10
    .line 11
    .line 12
    sget-object p0, La/i05;->c:La/sqp;

    .line 13
    .line 14
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {p2, p0, v0}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 17
    .line 18
    .line 19
    sget-object p0, La/i05;->d:La/sqp;

    .line 20
    .line 21
    const-string v0, "3.0.8"

    .line 22
    .line 23
    invoke-interface {p2, p0, v0}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 24
    .line 25
    .line 26
    sget-object p0, La/i05;->e:La/sqp;

    .line 27
    .line 28
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 29
    .line 30
    invoke-interface {p2, p0, v0}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 31
    .line 32
    .line 33
    sget-object p0, La/i05;->f:La/sqp;

    .line 34
    .line 35
    sget-object v0, La/hv00;->b:La/hv00;

    .line 36
    .line 37
    invoke-interface {p2, p0, v0}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 38
    .line 39
    .line 40
    sget-object p0, La/i05;->g:La/sqp;

    .line 41
    .line 42
    iget-object p1, p1, La/bs3;->b:La/gw2;

    .line 43
    .line 44
    invoke-interface {p2, p0, p1}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 45
    .line 46
    .line 47
    return-void
.end method
