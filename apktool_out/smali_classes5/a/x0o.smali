.class public final La/x0o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/x0o;

.field public static final b:La/wgi0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/x0o;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/x0o;->a:La/x0o;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [La/ugi0;

    .line 10
    .line 11
    const-string v1, "ErrorCodeInfo"

    .line 12
    .line 13
    invoke-static {v1, v0}, La/x2x;->F(Ljava/lang/String;[La/ugi0;)La/wgi0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La/x0o;->b:La/wgi0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 3

    .line 1
    instance-of p0, p1, La/icy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    check-cast p1, La/icy;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v0

    .line 10
    :goto_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_1
    invoke-interface {p1}, La/icy;->g()La/mcy;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :try_start_0
    invoke-interface {p1}, La/icy;->d()La/vby;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object v2, La/okx;->a:La/okx;

    .line 25
    .line 26
    invoke-static {v2}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, La/jiy;

    .line 31
    .line 32
    invoke-virtual {v1, v2, p0}, La/vby;->a(La/jiy;La/mcy;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catch_0
    move-object v1, v0

    .line 40
    :goto_1
    :try_start_1
    invoke-interface {p1}, La/icy;->d()La/vby;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    sget-object v2, La/i2o;->Companion:La/h2o;

    .line 48
    .line 49
    invoke-virtual {v2}, La/h2o;->serializer()La/jiy;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, La/jiy;

    .line 58
    .line 59
    invoke-virtual {p1, v2, p0}, La/vby;->a(La/jiy;La/mcy;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, La/i2o;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 64
    .line 65
    move-object v0, p0

    .line 66
    :catch_1
    new-instance p0, La/w0o;

    .line 67
    .line 68
    invoke-direct {p0, v1, v0}, La/w0o;-><init>(Ljava/lang/Integer;La/i2o;)V

    .line 69
    .line 70
    .line 71
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/x0o;->b:La/wgi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, La/w0o;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    iget-object p0, p2, La/w0o;->a:Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    invoke-interface {p1, p0}, La/bwn;->B(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-interface {p1}, La/bwn;->q()V

    .line 20
    .line 21
    .line 22
    return-void
.end method
