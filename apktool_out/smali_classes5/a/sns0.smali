.class public final La/sns0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/sns0;

.field public static final b:La/wgi0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/sns0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/sns0;->a:La/sns0;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [La/ugi0;

    .line 10
    .line 11
    const-string v1, "TranslationMainResponse"

    .line 12
    .line 13
    invoke-static {v1, v0}, La/x2x;->F(Ljava/lang/String;[La/ugi0;)La/wgi0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La/sns0;->b:La/wgi0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, La/icy;

    .line 2
    .line 3
    invoke-interface {p1}, La/icy;->d()La/vby;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p1}, La/icy;->g()La/mcy;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of v0, p1, La/bdy;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    instance-of v0, p1, La/jdy;

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    check-cast p1, La/jdy;

    .line 24
    .line 25
    invoke-virtual {p1}, La/jdy;->c()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    sget-object v0, La/rns0;->Companion:La/qns0;

    .line 33
    .line 34
    invoke-virtual {v0}, La/qns0;->serializer()La/jiy;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, La/jiy;

    .line 39
    .line 40
    invoke-virtual {p1}, La/jdy;->b()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/rns0;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_3
    instance-of v0, p1, La/edy;

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    sget-object v0, La/rns0;->Companion:La/qns0;

    .line 56
    .line 57
    invoke-virtual {v0}, La/qns0;->serializer()La/jiy;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, La/jiy;

    .line 62
    .line 63
    invoke-virtual {p0, v0, p1}, La/vby;->a(La/jiy;La/mcy;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, La/rns0;

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 71
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/sns0;->b:La/wgi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, La/rns0;

    .line 2
    .line 3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 4
    .line 5
    const-string p1, "TranslationMainResponseSerializer deserialization only"

    .line 6
    .line 7
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    throw p0
.end method
