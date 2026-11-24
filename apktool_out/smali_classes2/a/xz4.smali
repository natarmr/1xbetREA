.class public final La/xz4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s960;


# static fields
.field public static final a:La/xz4;

.field public static final b:La/sqp;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/xz4;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/xz4;->a:La/xz4;

    .line 7
    .line 8
    new-instance v0, La/v04;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, La/v04;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-class v1, La/a5d0;

    .line 15
    .line 16
    invoke-static {v1, v0}, La/rw2;->r(Ljava/lang/Class;La/v04;)Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, La/sqp;

    .line 21
    .line 22
    invoke-static {v0}, La/rz4;->q(Ljava/util/HashMap;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v2, "messagingClientEvent"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, La/sqp;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, La/xz4;->b:La/sqp;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/s940;

    .line 2
    .line 3
    check-cast p2, La/t960;

    .line 4
    .line 5
    sget-object p0, La/xz4;->b:La/sqp;

    .line 6
    .line 7
    iget-object p1, p1, La/s940;->a:La/r940;

    .line 8
    .line 9
    invoke-interface {p2, p0, p1}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 10
    .line 11
    .line 12
    return-void
.end method
