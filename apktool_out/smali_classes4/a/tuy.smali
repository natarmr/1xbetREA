.class public final La/tuy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vwb0;

.field public final b:La/vby;

.field public final c:La/p7m0;


# direct methods
.method public constructor <init>(La/vwb0;La/vby;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/tuy;->a:La/vwb0;

    .line 11
    .line 12
    iput-object p2, p0, La/tuy;->b:La/vby;

    .line 13
    .line 14
    const-string v0, ""

    .line 15
    .line 16
    const-string v1, "BLOCK_MODEL_KEY"

    .line 17
    .line 18
    invoke-virtual {p1, v1, v0}, La/vwb0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    :try_start_0
    sget-object v0, La/suy;->Companion:La/ruy;

    .line 31
    .line 32
    invoke-virtual {v0}, La/ruy;->serializer()La/jiy;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, La/jiy;

    .line 37
    .line 38
    invoke-virtual {p2, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, La/suy;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    move-object v1, p1

    .line 45
    :catch_0
    :goto_0
    if-nez v1, :cond_1

    .line 46
    .line 47
    sget-object v3, La/wuy;->a:La/wuy;

    .line 48
    .line 49
    new-instance v2, La/suy;

    .line 50
    .line 51
    const-wide/32 v7, 0x493e0

    .line 52
    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    const-wide/16 v5, 0x0

    .line 57
    .line 58
    invoke-direct/range {v2 .. v9}, La/suy;-><init>(La/wuy;ZJJZ)V

    .line 59
    .line 60
    .line 61
    move-object v1, v2

    .line 62
    :cond_1
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, La/tuy;->c:La/p7m0;

    .line 67
    .line 68
    return-void
.end method
