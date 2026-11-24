.class public final La/cdy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/cdy;

.field public static final b:La/wgi0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/cdy;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/cdy;->a:La/cdy;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [La/ugi0;

    .line 10
    .line 11
    const-string v1, "kotlinx.serialization.json.JsonNull"

    .line 12
    .line 13
    sget-object v2, La/zgi0;->b:La/zgi0;

    .line 14
    .line 15
    invoke-static {v1, v2, v0}, La/x2x;->H(Ljava/lang/String;La/c3x;[La/ugi0;)La/wgi0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, La/cdy;->b:La/wgi0;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, La/fww;->t(La/rkj;)La/icy;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, La/rkj;->A()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    sget-object p0, La/bdy;->INSTANCE:La/bdy;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, La/kcy;

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    const/4 v0, 0x0

    .line 17
    const-string v1, "Expected \'null\' literal"

    .line 18
    .line 19
    invoke-static {p1, v1, v0, v0, v0}, La/xww;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {p0, p1}, La/ucy;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/cdy;->b:La/wgi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, La/bdy;

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
    invoke-interface {p1}, La/bwn;->q()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
