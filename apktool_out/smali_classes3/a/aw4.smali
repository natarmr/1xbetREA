.class public final La/aw4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/aw4;

.field public static final b:La/ewb0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/aw4;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/aw4;->a:La/aw4;

    .line 7
    .line 8
    const-string v0, "AutoBetCancelStatusResponse"

    .line 9
    .line 10
    sget-object v1, La/zvb0;->j:La/zvb0;

    .line 11
    .line 12
    invoke-static {v0, v1}, La/x2x;->j(Ljava/lang/String;La/zvb0;)La/ewb0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, La/aw4;->b:La/ewb0;

    .line 17
    .line 18
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
    if-eqz p1, :cond_4

    .line 11
    .line 12
    invoke-static {p1}, La/hne;->m(La/icy;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, La/yv4;->c:La/c0o;

    .line 17
    .line 18
    invoke-virtual {p1}, La/b3;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    move-object v2, v1

    .line 33
    check-cast v2, La/yv4;

    .line 34
    .line 35
    iget-object v2, v2, La/yv4;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v1, v0

    .line 45
    :goto_1
    check-cast v1, La/yv4;

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_3
    const-string p1, "Unknown AutoBetCancelStatusResponse code: "

    .line 51
    .line 52
    invoke-static {p1, p0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, La/v4i0;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_4
    const-string p0, "Expected JSON decoder"

    .line 61
    .line 62
    invoke-static {p0}, La/v4i0;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/aw4;->b:La/ewb0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, La/yv4;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, La/yv4;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-interface {p1, p0}, La/bwn;->B(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-interface {p1, p0}, La/bwn;->E(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
