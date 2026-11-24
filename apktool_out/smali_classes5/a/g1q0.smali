.class public final La/g1q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/a1q0;


# direct methods
.method public constructor <init>(La/a1q0;)V
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
    iput-object p1, p0, La/g1q0;->a:La/a1q0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4

    .line 1
    iget-object p0, p0, La/g1q0;->a:La/a1q0;

    .line 2
    .line 3
    iget-object v0, p0, La/a1q0;->a:La/q7d0;

    .line 4
    .line 5
    const-string v1, ""

    .line 6
    .line 7
    invoke-virtual {v0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v2, "KEY_TEST_CREDS_STORAGE"

    .line 12
    .line 13
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :try_start_0
    iget-object p0, p0, La/a1q0;->b:La/vby;

    .line 27
    .line 28
    new-instance v1, La/zw3;

    .line 29
    .line 30
    sget-object v2, La/d1q0;->Companion:La/c1q0;

    .line 31
    .line 32
    invoke-virtual {v2}, La/c1q0;->serializer()La/jiy;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {v1, v2, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1, v0}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    return-object p0

    .line 47
    :catch_0
    sget-object p0, La/iun;->a:La/iun;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_1
    :goto_0
    sget-object p0, La/iun;->a:La/iun;

    .line 51
    .line 52
    return-object p0
.end method
