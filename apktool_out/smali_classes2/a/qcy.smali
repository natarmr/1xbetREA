.class public final La/qcy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/qcy;

.field public static final b:La/wgi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/qcy;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/qcy;->a:La/qcy;

    .line 7
    .line 8
    sget-object v0, La/tua0;->c:La/tua0;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [La/ugi0;

    .line 12
    .line 13
    new-instance v2, La/djx;

    .line 14
    .line 15
    const/16 v3, 0xc

    .line 16
    .line 17
    invoke-direct {v2, v3}, La/djx;-><init>(B)V

    .line 18
    .line 19
    .line 20
    const-string v3, "kotlinx.serialization.json.JsonElement"

    .line 21
    .line 22
    invoke-static {v3, v0, v1, v2}, La/x2x;->G(Ljava/lang/String;La/c3x;[La/ugi0;Lkotlin/jvm/functions/Function1;)La/wgi0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, La/qcy;->b:La/wgi0;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, La/fww;->t(La/rkj;)La/icy;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, La/icy;->g()La/mcy;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/qcy;->b:La/wgi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, La/mcy;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, La/fww;->u(La/bwn;)V

    .line 7
    .line 8
    .line 9
    instance-of p0, p2, La/jdy;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    sget-object p0, La/mdy;->a:La/mdy;

    .line 14
    .line 15
    invoke-interface {p1, p0, p2}, La/bwn;->C(La/jiy;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    instance-of p0, p2, La/edy;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    sget-object p0, La/gdy;->a:La/gdy;

    .line 24
    .line 25
    invoke-interface {p1, p0, p2}, La/bwn;->C(La/jiy;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of p0, p2, La/yby;

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    sget-object p0, La/acy;->a:La/acy;

    .line 34
    .line 35
    invoke-interface {p1, p0, p2}, La/bwn;->C(La/jiy;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 40
    .line 41
    .line 42
    return-void
.end method
