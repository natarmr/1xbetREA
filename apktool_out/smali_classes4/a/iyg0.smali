.class public final La/iyg0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/uuy;


# direct methods
.method public constructor <init>(La/uuy;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/iyg0;->a:La/uuy;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    iget-object p0, p0, La/iyg0;->a:La/uuy;

    .line 2
    .line 3
    iget-object p0, p0, La/uuy;->a:La/tuy;

    .line 4
    .line 5
    iget-object v0, p0, La/tuy;->c:La/p7m0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, La/suy;

    .line 12
    .line 13
    iget-object v1, v1, La/suy;->a:La/wuy;

    .line 14
    .line 15
    sget-object v2, La/wuy;->d:La/wuy;

    .line 16
    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v2, v1

    .line 24
    check-cast v2, La/suy;

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    const/16 v9, 0xf

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    const-wide/16 v6, 0x0

    .line 33
    .line 34
    invoke-static/range {v2 .. v9}, La/suy;->a(La/suy;La/wuy;JJZI)La/suy;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    iget-object v1, p0, La/tuy;->a:La/vwb0;

    .line 45
    .line 46
    iget-object p0, p0, La/tuy;->b:La/vby;

    .line 47
    .line 48
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v2, La/suy;->Companion:La/ruy;

    .line 56
    .line 57
    invoke-virtual {v2}, La/ruy;->serializer()La/jiy;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, La/jiy;

    .line 62
    .line 63
    invoke-virtual {p0, v2, v0}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-string v0, "BLOCK_MODEL_KEY"

    .line 68
    .line 69
    invoke-virtual {v1, v0, p0}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
.end method
